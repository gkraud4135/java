package com.coding.book;

public class Bddd {

	public static void main(String[] args) {
		Tv t = new Tv();
		t.channer=7;
		t.power=true;
		Tv.width = 20;
		t.channerUp();
		System.out.println("현재채널"+t.channer);
		
		Time ti = new Time();
		ti.sethour(21);  //객체에 메서드 실행
		System.out.println(ti.gethour());
		
		Tv t1 = new Tv("white",true,3);
		Tv t2 = new Tv();
		t1.ex1();
		t2.ex1();
		//t1.change(); 자손 메서드 사용불가
		
		SmartTv st = null;
		st=(SmartTv)t1;   //오류 왜지
		st.change();
	}

	
}
class Time {
		//시간은 범위가있음 그래서 대입되는것을 한번 거르기위해
	private int hour;
	private int minute;
	private int second;
	
	public void sethour(int hour){// hour을 세팅 
		if(valid(hour)){return;}  //
		this.hour = hour;
	}
	private boolean valid(int hour) { //hour가 유효한지 판단 if안에서 꺼냄
		return hour<0 || 23<hour;
	}
	public int gethour(){return hour;}; //hour을 객체에 보냄
}
class SmartTv extends Tv{
	SmartTv(){};
	void change(){System.out.println(color);}
	
}
class Tv {
	
	String color;       //인스턴스변수
	boolean power;
	int channer;
	
	static int width =10;   //static변수 클래스변수 
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
	Tv(){ //초기화 받지 않을때 디폴드 값으로 써라
//		color = "black";
//		power = true;
//		channer = 5;
		this("black",true,4);
	}
	public Tv(String string, boolean b, int i) {
		color=string;
		power=b;
		channer=i;
	}
	void ex1(){System.out.println("color="+color+" power="+power+" channer"+channer);}
	
}
