import java.util.Scanner;

public class Main{
	public static void n1Toarr(int x,int y){
		String str1 = Integer.toString(x);
		String str2 = Integer.toString(y);
		
		int[] n1 = new int[str1.length()];
		int[] n2 = new int[str2.length()];
		
		int value1 = 0;
		int value2 = 0;
		
		int j1 = 1;
		int j2 = 1;
		
		int ancN1 = 0;
		int ancN2 = 0;
		
		//First number
		for(int i=1; i<=str1.length(); i++){
			
			if(x != 0){
				value1 = x%10;
				x = x / 10;
			}else{
				value1 = 1;
			}
			ancN1 = ancN1 + (1*j1);
			j1 = j1*2;
		}
		
		//Second number
		for(int i=1; i<=str2.length(); i++){
			
			if(y != 0){
				value2 = y%10;
				y = y / 10;
			}else{
				value2 = 1;
			}
			ancN2 = ancN2 + (value2*j2);
			j2 = j2*2;
		}
		
		//System.out.println("value1: "+ancN1);
		//System.out.println("value2: "+ancN2);
		
		int sum = ancN1+ancN2;
		//System.out.println("Sum: "+sum);
		
		//sum convert to binary
		int len = 0;
		for(int s = sum; s>0; s/=2){
			int save = s%2;
			len++;
			//System.out.println(save);
			
		}
			int[] revArr = new int[len];
			int q = 0;
			for(int s = sum; s>0; s/=2){
				int save = s%2;
				revArr[q] = save;
				q++;
				
			}
			System.out.print("Answer Is: ");
			for(int i=len-1; i>=0; i--){
				System.out.print(revArr[i]);
			}
			
		
	}
		
	public static void main(String[] args){
		Scanner obj = new Scanner(System.in);
		
		System.out.print("Enter Number 1: ");
		int x = obj.nextInt();
		System.out.print("Enter Number 2: ");
		int y = obj.nextInt();
		
		n1Toarr(x,y);
		
	}
}