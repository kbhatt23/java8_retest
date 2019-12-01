package lambdaExamples;

public class RunnableExample {

	public static void main(String[] args) throws InterruptedException {
		Thread t = new Thread(() -> System.out.println("jai shree ram"));
		t.start();
		t.join();
	}

}
