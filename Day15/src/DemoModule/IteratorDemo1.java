package DemoModule;

		import java.util.Collections;
import java.util.Iterator;
		import java.util.LinkedList;
		import java.util.List;
		public class IteratorDemo1{
		
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
				IteratorDemo1 ID  = new IteratorDemo1();
				ID.Display(oj);
				oj.sort(null);
				ID.Display(oj);
				
				System.out.println("#########################");
				
				Collections.reverse(oj);
				ID.Display(oj);
				
				
				
				

					
				
				
			}

		}

	


