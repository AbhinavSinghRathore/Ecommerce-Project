package task_9thSept;

import java.io.*;
import java.util.Arrays;

public class Product {

	public static void main(String[] args) {
		System.out.println("enter the first number");
		System.out.println("enter the second the number");
		String str1;
		String str2;
		String str3 = "";
		int n1, n2;

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			str1 = br.readLine();
			str2 = br.readLine();
			String srr[] = new String[str2.length()];

			
			for (int j = str2.length() - 1; j >= 0; j--) {

				int x = Integer.parseInt(str2.charAt(j) + "");
				srr[j] = "";
				int carry=0;
				
				for (int k = str1.length() - 1; k >= 0; k--) {

					int y = Integer.parseInt(str1.charAt(k) + "");
					if(((x*y)+carry)<=9 && (x*y)<=9) {
						srr[j] = ((x * y)+carry) + srr[j];
					}
					else {
						
						srr[j] = ((x * y)%10+carry) + srr[j];
						carry=(x*y)/10;
						
					}
					
				}

			}

			System.out.println(Arrays.toString(srr));
			
			for(int i=0;i<srr.length;i++) {
				for(int j=1;j<=i;j++) {
					srr[i]="0"+srr[i];
				}
			}
			
			
			
			System.out.println(Arrays.toString(srr));
			int k=0;
			for(int i=srr.length-1;i>=0;i--) {
				for(int j=1;j<=i;j++) {
					srr[k]=srr[k]+"0";
				}
				k++;
			}
			
			System.out.println(Arrays.toString(srr));
			
			int l=srr[0].length();
			int carry=0;
			for(int c=l-1;c>=0;c--) {
				int s=0;
				
				for(int r=0;r<srr.length;r++) {
					int x = Integer.parseInt(srr[r].charAt(c) + "");
					s=s+x;
				}
				
				if((s+carry)<=9) {
					str3 = (s+carry) + str3;
					carry=0;
				}
				else {
					
					str3 = (s%10+carry) + str3;
					carry=s/10;
					
				}
				
				
			}
			
			System.out.println(str3);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}