
import java.util.*;
import java.lang.*;
public class reversed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		StringBuilder r = new StringBuilder(); 
		
		String str=sc.next();

		String[] arrStr = str.split("\\.");
		
		for(String w:arrStr){  
			StringBuilder abc = new StringBuilder(); 
			
			abc.append(w); 
			abc=abc.reverse();
         
     r.append(abc);
     r.append('.');
		}
		System.out.println(r);
	
	}

}
