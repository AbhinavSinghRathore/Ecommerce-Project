package task_9thSept;
import java.io.*;
import java.util.Arrays;

public class Expression {

	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter string");
		String exp1=br.readLine();
		String exp2=br.readLine();
		
		String srr[]=exp1.split("[()]");
		String srr1[]=exp2.split("[()]");
		
		System.out.println(Arrays.toString(srr));
		
		String symbols[]= {"+","-","*","/"};
		
		String temp="";
		if(srr1[0]=="-") {
			temp="-"+srr1[1]+"-"+srr[3]+"-"+srr[5];
		}
		
		System.out.println(temp);
	}

}
