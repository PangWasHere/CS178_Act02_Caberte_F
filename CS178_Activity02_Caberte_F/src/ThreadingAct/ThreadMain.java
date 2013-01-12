package ThreadingAct;

import java.util.ArrayList;
import java.util.List;

public class ThreadMain {

	public static void main(String[] args) {
        // TODO code application logic here
        
		List<Thread> threads = new ArrayList<Thread>();
		MyStack ms = new MyStack(20);
		
		for( int i = 0; i < 20; i++ )
		{

			Runnable pushTask = new Pusher("ONE", ms);
			Thread firstPusher = new Thread( pushTask );
			
			Runnable secondPushTask = new Pusher("TWO", ms);
			Thread secondPusher = new Thread( secondPushTask );
			
			// The if statements will make sure that each pusher will only
			// push an element ten times
			
			if( i < 10 )
			{
					firstPusher.start();
					firstPusher.setName( String.valueOf(i));
					threads.add( firstPusher );
			} else threads.remove( firstPusher );
			
			
			if( i < 10 )
			{
					secondPusher.start();
					firstPusher.setName( String.valueOf(i));
					threads.add( secondPusher );
			} else threads.remove( secondPusher );
			
		
			if( ms.getCurrentIndex() > -1 )
			{
					Runnable popTask = new Popper(ms);
					Thread popper = new Thread( popTask );
					popper.start();
					threads.add(popper);
			}
			
		}
		
    }
	
}
