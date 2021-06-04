import java.util.*;
public class DigitToBinary{

public static void main(String args[]){
	System.out.println("Hello");
Scanner sc=new Scanner(System.in);
int input=sc.nextInt();	
System.out.println(new StringBuilder(getBinaryFromDigit(input)).reverse());
}

static String getBinaryFromDigit(int number){
	int input=number;
	String s="";
	int remainder=0;
	while(input>0){
		remainder=input%2;
		s+=remainder;
		input=input/2;
	  }
	return s;
  }
}
