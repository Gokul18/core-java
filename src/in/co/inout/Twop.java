package in.co.inout;

import java.util.Scanner;

public class Twop {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter unchecking of prime number ");
int max=sc.nextInt();
System.out.println("generate prime number 1 to max: ");
for(int i=1;i<max;i++){
	boolean isPrimeNumber=true;
	boolean is;
	for(int j = 2; j<i; j++){
		if(i%j==0){
			isPrimeNumber=false;
			break;
		}
	}
	if(isPrimeNumber){
System.out.println(i+" ");
	}
		}
		
	}
}
