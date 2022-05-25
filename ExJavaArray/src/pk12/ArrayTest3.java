package pk12;

public class ArrayTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[][] = {{10,20,30},{40,50,60},{70,80,90},{100,200,300}};
		
		for (int i=0; i<A.length;i++)
			for(int j=0; j< A[0].length; j++)
				System.out.println(A[i][j]);
		
		System.out.println(A.length);
		System.out.println(A[1].length);

	}

}
