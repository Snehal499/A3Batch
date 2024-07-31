package defaultPackage;

public class ArrayExplaination {
	public static void main(String[] args) {
		int [][]arr= {{1,2,3},{4,5,6},{7,8,9}};
		//System.out.println(arr);
		//System.out.println(arr.length);
		//System.out.println(arr[0]);
		
		for(int i=0; i<arr.length;i++) {
			//System.out.println(arr);
			//System.out.println(arr.length);
			//System.out.println(arr[i]);
			//System.out.println(arr[i].length);
			
		for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");	
			}
		System.out.println();
		}
	}
}
