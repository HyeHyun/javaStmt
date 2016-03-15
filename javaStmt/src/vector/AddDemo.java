package vector;

import java.util.Vector;

/**
 * @file : AddDemo.java
 * @author KIM HYEHYEON
 * @date 2016. 3. 15.
 * @story 백터 add() 데모
 */
public class AddDemo {
	public static void main(String[] args) {
		Vector<String> vc = new Vector<String>();
		String a = "a", b = "b", c = "c", d = "d";
		vc.add(a);
		vc.add(b);
		vc.add(c);
		vc.add(d);
		System.out.println(vc);
		
		System.out.println("-------------------------------------");
		
		String[] strArr = new String[5];
		String sa = "a", sb = "b", sc = "c", sd = "d";
		strArr[0] = sa;
		strArr[1] = sb;
		strArr[2] = sc;
		strArr[3] = sd;
		
		for (int i = 0; i < strArr.length; i++) {
			System.out.print(strArr[i] + "\t");
		}
	}
}
