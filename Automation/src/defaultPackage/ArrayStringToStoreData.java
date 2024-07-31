package defaultPackage;

public class ArrayStringToStoreData {
	public static void main(String[] args) {
		String [][]arr= {{"FirstName","LastName","Email","Password"},
						{"Snehal","Nikam","sne12@gmail.com","Sneha"},
						{"Pranav","Jadhav","prana@gmail.com","pranav"},
						{"Monika","Madhure","monika@gmail.com","monika"}};
		
		String[][] result=new String[arr.length][];
		
		for(int i=0; i<arr.length;i++) {	
			result[i]=new String[arr[i].length];
			for (int j = 0; j < arr[i].length; j++) {
				result[i][j]=arr[i][j];	
			}
		}
		
		for(int i=0; i<arr.length;i++) {	
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(result[i][j]+"  ");	
			}
			System.out.println();
		}	
	}
}
