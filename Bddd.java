package com.coding.book;

public class Bddd {

	public static void main(String[] args) {
		Tv t = new Tv();
		t.channer=7;
		t.power=true;
		Tv.width = 20;
		t.channerUp();
		System.out.println("����ä��"+t.channer);
		
		Time ti = new Time();
		ti.sethour(21);  //��ü�� �޼��� ����
		System.out.println(ti.gethour());
		
		Tv t1 = new Tv("white",true,3);
		Tv t2 = new Tv();
		t1.ex1();
		t2.ex1();
		//t1.change(); �ڼ� �޼��� ���Ұ�
		
		SmartTv st = null;
		st=(SmartTv)t1;   //���� ����
		st.change();
	}

	
}
class Time {
		//�ð��� ���������� �׷��� ���ԵǴ°��� �ѹ� �Ÿ�������
	private int hour;
	private int minute;
	private int second;
	
	public void sethour(int hour){// hour�� ���� 
		if(valid(hour)){return;}  //
		this.hour = hour;
	}
	private boolean valid(int hour) { //hour�� ��ȿ���� �Ǵ� if�ȿ��� ����
		return hour<0 || 23<hour;
	}
	public int gethour(){return hour;}; //hour�� ��ü�� ����
}
class SmartTv extends Tv{
	SmartTv(){};
	void change(){System.out.println(color);}
	
}
class Tv {
	
	String color;       //�ν��Ͻ�����
	boolean power;
	int channer;
	
	static int width =10;   //static���� Ŭ�������� 
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
		}return;//void�޼����� return���� ��������
	}
	int multi(int x, int y){
		int result = x*y;
		return result;
		}
	Tv(){ //�ʱ�ȭ ���� ������ ������ ������ ���
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
