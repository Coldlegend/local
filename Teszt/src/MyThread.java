public class MyThread{
	public static void main (String[] args){
		
		Thread t = new Thread(){
			public void run(){
				for (int i = 0; i < 10; i++){
					System.out.println("This is thread A");
					try {
						Thread.sleep(400);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};t.start();
		
		Thread t2 = new Thread(){
			public void run(){
				for (int i = 0; i < 10; i++){
					System.out.println("This is thread B");
					try {
						Thread.sleep(400);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};t2.start();
		
		Thread t3 = new Thread(){
			public void run(){
				for (int i = 0; i < 10; i++){
					System.out.println("This is thread C");
					try {
						Thread.sleep(400);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};t3.start();
	}
}