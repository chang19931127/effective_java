package me.czd.effective.java.classandinterface.interfacebetterabsclass;

public class Player extends AbstractPlayer {

	//使用内部类，来模拟多重继承
	static class SwimPlayer{
		public void playSwim(){
			System.out.println("i can swim");
		}
	}
	
	@Override
	public void paly() {
		System.out.println("i can play");
		playGuitar();
		playPiano();
		new SwimPlayer().playSwim();
	}

}
