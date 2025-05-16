package SingletonPattern;

public class SingletonMultiThreaded {
	private static volatile SingletonMultiThreaded instance;
	public String value;

	private SingletonMultiThreaded(String value) {
		this.value = value;
	}

	public static SingletonMultiThreaded getInstance(String value) {
		SingletonMultiThreaded m1 = instance;
		if (m1 != null) {
			return m1;
		}

		synchronized (SingletonMultiThreaded.class) {
			if (instance == null) {
				instance = new SingletonMultiThreaded(value);
			}
			return instance;
		}
	}
}
