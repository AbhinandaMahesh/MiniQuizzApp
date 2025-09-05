import java.util.*;
public class project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int score = 0;
		
		
		System.out.println("1. Java is a _____ ?");
		System.out.println("1) Programming Language 2) Operating System");
		int ans1 = sc.nextInt();
		if (ans1 == 1) score++;
		
		System.out.println("2. Which keyword is used for constants");
		System.out.println("1. const 2. final");
		int ans2 = sc.nextInt();
		if (ans2 == 2) score++;
		
		System.out.println("3. Which Loop execute at least once");
		System.out.println("1. while 2. do-while");
		int ans3 = sc.nextInt();
		if(ans3 == 2) score++ ;
		
		System.out.println("your score: "+score + " /3");
		sc.close();
	}

}
