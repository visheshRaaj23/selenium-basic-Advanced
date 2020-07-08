package string_programs;

public class Demo_A19 {

	public static void main(String[] args) {
		
		int a[]= {2,3,4,6,7,8,9,10,11,12,13,14,15,18,20,21,23};
		Demo_A19.findMissingNumber(a,0,25);
		
		}
	static void findMissingNumber(int a[],int start,int end) {
		//Numbers before the starting number of the array
		System.out.println(a.length);
		
		for(int i=start;i<a[0];i++) {
			System.out.println(i);
		}
		
		for(int i=1;i<a.length;i++) {
			for(int j=1+a[i-1];j<a[i];j++) {
				System.out.println(j);
			}
		}
		for(int i=1+a[a.length-1];i<=end;i++) {
			System.out.println(i);
		}
		
	}

	}


