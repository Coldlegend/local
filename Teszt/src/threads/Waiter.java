package threads;

public class Waiter extends Thread {
	public void getCoffee(){
		synchronized (CoffeeMachine.lock) {
			if (CoffeeMachine.coffeeMade == null){
				try {
					// wait till Coffeeachine notifies that cofee is ready
					System.out.println("Waiter: weill get order till"
							+ "coffee machine notifies me ");
					CoffeeMachine.lock.wait();
					
				}catch (InterruptedException e ) {
					e.printStackTrace();
				}
			}
			System.out.println("Waiter: Delivering " + CoffeeMachine.coffeeMade);
			CoffeeMachine.coffeeMade=null;
			//ask notifiy the coffemachine to make next 
			CoffeeMachine.lock.notifyAll();
			System.out.println("Waiter: Notifying coffee machine to make another one");
		}
	}
	public void run (){
		// keep going until terminate
		while(true){
			getCoffee();
		}
	}
}
