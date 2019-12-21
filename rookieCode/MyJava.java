public class MyJava{
	public static void main(String[] args){
		int [] array = new int[]{23,54,2648,236,45879};
		int max = array [0];
		for(int i = 1; i < array.length;i++){
			if(max < array[i]){
				max = array [i];
			}
		}
	   System.out.println( max );	
	}
}