package functionInterfaces;
@FunctionalInterface
public interface SampleFunctionalInterface<T> {
	void sample(T t);
	default void fake(T t) {
	System.out.println("fake chalu "+t.toString());	
	}
	static void chalu(/*T t*/) {
		System.out.println("chalu chalu ");	
		}

}
