/**
 * 列表优于数组
 * 
 * 首先数组的性能肯定比列表是要高的，但是为什么我们想要使用列表来代替数组？
 * 由于列表配合泛型会让我们的程序更加健壮安全。
 * 
 * 数组是具体化的，因此数组会在运行时才知道并检查他们元素类型约束。
 * 泛型是通过擦出来实现的，因此泛型只在编译时强化他们的类型信息，并在运行时丢掉这些信息。
 * 
 * 数组和泛型由于上述原因，因此不能搭配使用，就是说不存在泛型数组
 * ArrayList<String>[] arrays 只能声明
 * 
 * 
 * 因此为了让系统更加的安全，我们回去损失一丢丢性能来操作
 * @author Administrator
 *
 */
package me.czd.effective.java.generic.listbetterarray;