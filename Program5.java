/*WAP to Print the global and local variable value as 25.*/ 
public class Program5 {
	int x=25;
	public static void main(String[] args) {
		int x=26;
		Program5 program5=new Program5();
		System.out.println("local variable:"+x);
		System.out.println("global variable:"+program5.x);
	}

}
