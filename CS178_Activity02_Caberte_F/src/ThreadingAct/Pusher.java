package ThreadingAct;

public class Pusher implements Runnable {

	private final String id;
	private MyStack pStack;
	private int counter;
	
	
	Pusher( String id, MyStack s )
	{
		this.id = id;
		this.pStack = s;
		counter = 0;
	}
	
	
	@Override
	public void run()
	{
			pStack.push(1);
			System.out.println("Pusher " + id + " pushed " + 1 + " into the stack." + 
			" Stack size is now: " + pStack.getCurrentIndex());
		
	} 
}
