package com.coding.book;

public class Bddd {

	public static void main(String[] args) {
		Tv t = new Tv();
		t.channer=7;
		t.power=true;
		Tv.width = 20;
		t.channerUp();
		System.out.println("현재채널"+t.channer);
	}

	
}

class Tv {
	
	String color;
	boolean power;
	int channer;
	
	static int width =10;
	static int height =20;
	
	void channerUp(){channer++;}
	void channerDown(){channer--;}
	void power(){power=!power;}
	void gugudan(int dan){
		
		if(!(2<=dan&&dan<=9)){
			return;
		}
		for(int i=2;i<10;i++){
			System.out.printf("%d*%d=%d%n",dan,i,dan*i);
		}return;//void메서드의 return값은 생략가능
	}
	int multi(int x, int y){
		int result = x*y;
		return result;
		}
	Tv(){ //디폴드 값으로 써라
//		color = "black";
//		power = true;
//		channer = 5;
		this("black",true,4);
	}
	public Tv(String string, boolean b, int i) {
	}
	
}
