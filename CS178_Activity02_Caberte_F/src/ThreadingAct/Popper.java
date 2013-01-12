package ThreadingAct;

public class Popper implements Runnable{


	private MyStack pStack;
	
	Popper(MyStack s)
	{
		this.pStack = s;
		
	}
	
	@Override
	public void run()
	{
			int j = pStack.pop();
			System.out.println("Popper" + " popped " + j + " out of the stack." + 
			" Stack size is now: " + pStack.getCurrentIndex());
	}
	
}
