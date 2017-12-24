package me.czd.effective.java.classandinterface.interfacebetterabsclass;

public abstract class AbstractPlayer implements PlayGuitar,PlayPiano {

	@Override
	public void playGuitar() {
		//提供简单的实现
		System.out.println("i can play guitar");
	}

	@Override
	public void playPiano() {
		//提供简单的实现
		System.out.println("i can play piano");
	}
	
	public abstract void paly();

}
