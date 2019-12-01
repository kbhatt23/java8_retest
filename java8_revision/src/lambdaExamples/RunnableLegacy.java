package lambdaExamples;

public class RunnableLegacy {

	public static void main(String[] args) {
		Thread t = new Thread(new Task());
		t.start();
	}

}

class Task implements Runnable{
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("task completed");
	}
}
