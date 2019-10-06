package src.main;

import java.util.ArrayList;
import java.util.Scanner;

public class newPalindromNumberBetweenTwoNum {

	public static void main1(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num1= sc.nextInt();
		int num2= sc.nextInt();
		int pal=0;
		
		for(int i=num1;i<num2;i++) {
			int temp=i;
			int rem=0;
			int sum=0;
			while(temp>0) {
				rem=temp%10;
				sum=sum*10+rem;
				temp=temp/10;
			}
			if(sum==i) {
				pal=pal+1;
				System.out.println(i);
			}
		}
		System.out.println("Num of Apl are : "+pal);

	}

	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String s = sc.next();
		String uniq="";
		for(int i=0;i<s.length();i++) {
			if(!uniq.contains(Character.toString(s.charAt(i)))) {
				uniq=uniq+Character.toString(s.charAt(i));
			}
		}
		System.out.println(uniq);
	}
}
