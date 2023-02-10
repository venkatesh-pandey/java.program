package venkateshProject;

class max{
	
	void array_Max() {
		 int arr[]= {2,4,5,6,7,8,9};
		 int ans=0;
		 for(int i=0; i<arr.length;i++) {
			 if(arr[i]>ans)
				 ans=arr[i];
			 
		 }
		 System.out.println(ans);
		 
		}
}


public class array {

	public static void main(String[] args) {
	 
		max obj=new max();
		obj.array_Max();
	 
	}

}
