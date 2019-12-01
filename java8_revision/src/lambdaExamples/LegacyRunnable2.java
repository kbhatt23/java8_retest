package lambdaExamples;

public class LegacyRunnable2 {
public static void main(String[] args) {
	Thread t = new Thread(new Runnable() {
		
		@Override
		public void run() {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("task completed");
		}
	});
	System.out.println("task started");
	t.start();
}
}
