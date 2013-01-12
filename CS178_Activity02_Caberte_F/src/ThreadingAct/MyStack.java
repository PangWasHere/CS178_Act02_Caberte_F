package ThreadingAct;

public class MyStack {
	
	private int maxSize;
	private int currentIndex;
	private int[] pStack;
	
	
	public MyStack( int maxSize )
	{
		currentIndex = 0;
		this.maxSize = maxSize;
		pStack = new int[ maxSize ];
		
	}
	
	public int getCurrentIndex()
	{
		return currentIndex;
	}
	
	public synchronized void push(int i)
	{
		if( currentIndex < maxSize - 1 )
			pStack[ ++currentIndex ] = i;
	}
	
	public synchronized int pop()
	{
		return pStack[ currentIndex-- ];
	}

}
