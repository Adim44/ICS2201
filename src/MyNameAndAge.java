import java.io.*;
public class MyNameAndAge {
	public static void main(String args[]) throws IOException {
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(inputStreamReader);
		String name;
		int age;
		System.out.print("Enter your name: ");
		name = br.readLine();
		

		System.out.print("Enter your age: ");
		age = Integer.parseInt(br.readLine());
		
		System.out.print("Hello, "+name+ " your age is "+age);
	}
}
