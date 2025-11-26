import java.util.Scanner;
public class If_else{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num=sc.nextInt();
		if(num>0){
			System.out.println(num+" is Positve");
		}
		else if(num<0){
			System.out.println(num+" is Negative");
		}
		else{
			System.out.println(num+" is Zero");
		}
		sc.close();
	}
}