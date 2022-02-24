package DemoModule;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class JavaCollection1 {
	void Display(List<String> list)
	{
		Iterator<String> obj = list.iterator();
		while(obj.hasNext())
		{
			System.out.println("Element is: "+ obj.next());
		}
		
	}

	public static void main(String[] args) {
		List<String> oj = new LinkedList<>();
		oj.add("Dhanraj");
		oj.add("ABC");
		oj.add("XYZ");
		oj.add("PQR");
		oj.add("DEF");
		System.out.println("Element is: "+ oj);
		JavaCollection1 JC = new JavaCollection1();
		JC.Display(oj);
		

			
		

	}

}
