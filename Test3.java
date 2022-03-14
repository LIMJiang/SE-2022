public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int n = 1;
	        for(int i = 2; i <= 2000; i++){
	        	int j = 2;
	            while(i % j != 0 ){
	                
	                j++;
	            }
	           
	            if(i == j){
	              
	                if(n % 5 != 0){
	                    System.out.print(i+",");
	                    n++;
	                }else{
	                    System.out.println(i);
	                    n++;
	                }
	            }
	        }

	}

}
