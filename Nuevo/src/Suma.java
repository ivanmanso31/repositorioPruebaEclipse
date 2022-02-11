import java.util.Scanner;

public class Suma {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Primer numero a sumar");
		int op1=sc.nextInt();
		System.out.println("Segundo numero a sumar");
		int op2=sc.nextInt();
		System.out.println("La suma es: "+(op1+op2));
	}

}
