package strngmthds;

public class StringDemo {

	public static void main(String[] args) {
		
		String str1 = "this is str1 ";
		
		String str2 = "this is str2";
		
		boolean var = str1.endsWith("str1");  //endswith method
		
		boolean var1 = str2.startsWith("this"); 	//startswith method
		
        boolean var2 = str1.startsWith("this");		
	
		boolean var3 = str2.endsWith("str2");
		
		str1 = str1.concat(str2); 		//Concatenate method
		
		String ss = "";
		
		int v = str1.compareTo(ss);		//comapringTo method
		
		int u = str2.compareTo(ss);
		
		System.out.println("str1 ends with :"+var);
		
		System.out.println("str2 starts with :"+var1);
		
		System.out.println("str1 starts with :"+var2);
		
		System.out.println("str2 ends with :"+var3);
		
		System.out.println(str1);
		
		System.out.println(v);
		System.out.println(u);
		
		System.out.println("the index of i is :"+ str1.indexOf("i"));	//indexOf method
		System.out.println("the index of i is :"+ str1.indexOf("i",3));
		
		
		String s = "Java is a programming language";
		
		if(s.startsWith("Java")) {
			System.out.println("the given statement starts with Java");
		}
		

	}

}
