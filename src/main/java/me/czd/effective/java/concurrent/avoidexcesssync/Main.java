package me.czd.effective.java.concurrent.avoidexcesssync;

import java.util.HashSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 了解这些类的关系，以及模式，很有帮助
 * 什么时候观察，通知，回调。等等，一定要明白这几个类如何配合的,很有意思！
 * ForwardSet
 * ObservableSet		内部维护了两个集合，一个Set是我们add的E的内容，一个是List是我们add的SetObserver
 * SetObserver			定义的一个约定，到时候可以在ObservableSet中可以进行回调操作
 * 
 * 但是我们如果修改了我们内部维护的集合，使得这个集合是一个并发安全的例如CopyOnWriteArrayList
 * 那么我们就不需要使用同步方法来进行操作了！！！！！！！
 * 因此尽可能的不要过度使用同步，使用同步的时候尽可能使得自己的同步方法可控！
 * 否则会发生意外的错误！
 * @author Administrator
 *
 */
public class Main {
	public static void main(String[] args) {
		simpleMethod();
//		badMethod();
//		deadlockMethod();
	}

	private static void deadlockMethod() {
		ObservableSet<Integer> set = new ObservableSet<>(new HashSet<>());
		set.addObserver(new SetObserver<Integer>() {
			
			@Override
			public void added(ObservableSet<Integer> set, Integer element) {
				System.out.println("观察者1行为:"+element);
				//但是我们回调了这种方法呢
				//如果我们这个方法再去同步操作某些东西呢，是不是不同的进程想要获得同一把锁
				if(element == 23){
					ExecutorService executorService = Executors.newSingleThreadExecutor();
					final SetObserver<Integer> observer = this;
					try {
						executorService.submit(() ->{
							set.removeObserver(observer);
						});
					}finally {
						//这里只要不去把我们的线程杀掉，就死锁了！
//						executorService.shutdown();
					}
				}
			}
		});
		for (int i = 0; i < 100; i++) {
			//只要add成功，就回去通知所有的SetObserver，然后回调他们的added方法
			set.add(i);
		}
	}

	private static void badMethod() {
		ObservableSet<Integer> set = new ObservableSet<>(new HashSet<>());
		set.addObserver(new SetObserver<Integer>() {
			
			@Override
			public void added(ObservableSet<Integer> set, Integer element) {
				System.out.println("观察者1行为:"+element);
				//但是我们回调了这种方法呢
				//因为不确定的方法，造成了集合的并发操作失败
				if(element == 23){
					set.removeObserver(this);
				}
			}
		});
		for (int i = 0; i < 100; i++) {
			//只要add成功，就回去通知所有的SetObserver，然后回调他们的added方法
			set.add(i);
		}
	}

	private static void simpleMethod() {
		ObservableSet<Integer> set = new ObservableSet<>(new HashSet<>());
		set.addObserver(new SetObserver<Integer>() {
			
			@Override
			public void added(ObservableSet<Integer> set, Integer element) {
				System.out.println("观察者1行为:"+element);
			}
		});
		set.addObserver((i,element) ->{
			System.out.println("观察者2行为："+element);
		});
		for (int i = 0; i < 100; i++) {
			//只要add成功，就回去通知所有的SetObserver，然后回调他们的added方法
			set.add(i);
		}
		System.out.println(set.set);
	}
}
