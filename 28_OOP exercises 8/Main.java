public class Main{	
	public static void main(String[] args){	
		Traffic obj = new Traffic();
		try {
            obj.my();
        } catch (InterruptedException e) {
            // Handle the InterruptedException, or print the stack trace
            e.printStackTrace();
        }
			
	}
}

