package Arrays;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayDemo {
		public static void main (String [] arg) {//array list can be called using for loop and each for loop// here we declare our arraylist
		ArrayList ob = new ArrayList  ();
		System.out.println(ob);
		System.out.println(ob.size());//how to see size of arraylist
		ob.add(1000);//autoboxing
		ob.add(true);
		ob.add(6.66666);
		System.out.println(ob.get(0));
		System.out.println(ob.size());
		System.out.println(ob.get(2));
// to print all values of the arraylist in one code using for loop
	for(int i=0; i<ob.size(); i++) {
		System.out.println(ob.get(i));
//the other way to print all arraylist value is for each loop
		for(Object u:ob) {System.out.println(u);
		}
		}
//we can also use while loop iterator to print our arrays list value // here we create the object of our Iterator
		Iterator itr = ob.iterator();		//now we have to start with while loop
		while(itr.hasNext()) {//will check whiter next index exists it will be true and fitch data, else it will say false
			System.out.println(itr.next());
		}// if we have 100s of values with diffrent type and its dificult to find its variable type we use followings:
		ArrayList<String> ui= new ArrayList<String>();
		ui.add("Parvez");
		System.out.println(ui.get(0));
	}
}