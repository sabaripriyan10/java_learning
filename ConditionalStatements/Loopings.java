import java.util.Scanner;
public class Loopings{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("For loop:");
		for(int i=0;i<3;i++){
			System.out.print(" "+i);
		}
		System.out.println();
		int a=3;
		System.out.print("While loop:");
		while(a<6){
			System.out.print(" "+a);
			a++;
		}
		System.out.println();
		System.out.print("Do while loop:");
		do{
			System.out.print(" "+a);
			a++;
		}while(a<9);
		System.out.println();
		sc.close();
	}
}