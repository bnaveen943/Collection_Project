package set1;

import java.util.EnumSet;
import java.util.Set;

enum Gfg{CODE,LEARN,CONTRIBUTE,QUIZ,MCQ};
public class Test4 {
	public static void main(String[] args) {
		m1();
	}
	public static void m1() {
		Set<Gfg> sets = EnumSet.of(Gfg.CODE,Gfg.CONTRIBUTE,Gfg.LEARN,Gfg.QUIZ);
		
		System.out.println("Sets: "+sets);
	}

}
