package newd.a.b_c;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;



public class chart  {

	public static void main(String[] args) throws Exception {
		 Reader reader = new FileReader("D:\\chart.txt");
		 BufferedReader bufReader = new BufferedReader(reader);
		 String line=" ";
		 while((line=bufReader.readLine())!=null) {System.out.println(line);}
		 bufReader.close();
		
		 List<Student> names = Arrays.asList(new Student("홍길동",90,90,90), new Student("홍길순",80,80,80),new Student("홍길자",70,70,70));
		 int[] rank= {1,2,3};
		 names.stream().sorted(Comparator.reverseOrder()).forEach(s -> System.out.println(rank[0]+s.name+" "+s.kor+" "+s.eng+" "+s.math+" "+s.calcTotal()+" "+s.calcavg()));
		 
		 
	}

}

class Student implements Comparable<Student>{
	String name;
	int kor;
	int eng;
	int math;
    public int calcTotal() {
        return kor + eng + math;
    }
    public double calcavg() {
        return (kor + eng + math)/3;
    }
	public Student(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	@Override
	public int compareTo(Student o) {
		return Double.compare(calcavg(), o.calcavg()); // -1,0,1
	}


	
}
