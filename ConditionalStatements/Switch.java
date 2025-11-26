import java.util.Scanner;
public class Switch{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		char c=sc.nextLine().charAt(0);
		String a="Vowel";
		switch(c){
			case 'a':
			System.out.println(a);
			break;
			case 'e':
			System.out.println(a);
			break;
			case 'i':
			System.out.println(a);
			break;
			case 'o':
			System.out.println(a);
			break;
			case 'u':
			System.out.println(a);
			break;
			default:
			System.out.println("Consonat");
			break;
		}
		sc.close();
	}
}