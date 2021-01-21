public class overriding {
	public static void main(String[] args) {
	Mypoint3 p = new Mypoint3(3,4);
//	p.x = 3;
//	p.y = 5;
//	p.z = 7;
	System.out.println(p);
	System.out.println(p.toString());
	System.out.println(p.x);
	System.out.println(p.y);
	}

}


class Mypoint3 extends Object{
	int x;
	int y;
	Mypoint3(int x,int y){
	this.x = x;
	this.y = y;  }

public String toString(){
	return "x:"+x+",y:"+ y;
}}
