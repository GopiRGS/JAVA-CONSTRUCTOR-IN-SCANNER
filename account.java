import java.lang.System;
import java.util.Scanner;
class accountname{
	String name;
	double balance;
	long accountnumber;
	accountname(String name,double balance,long accountnumber){
		this.name = name;
		this.balance = balance;
		this.accountnumber = accountnumber;
	}
		void display(){
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the details in your order wise....");
			System.out.println("name is : "+sc.nextLine()+"----"+"balance is : "+sc.nextDouble()+"----"+"account number is : "+sc.nextLong());
			System.out.println("defalut data ");
			System.out.println("name is : "+name+"----"+"balance is : "+balance+"----"+"account number is : "+accountnumber);
		}
	}

public class account{
	public static void main(String[] args){
		accountname a1 = new accountname("gopi",68700.0,104519);
		a1.display();
	}
}