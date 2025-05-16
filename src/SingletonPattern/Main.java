package SingletonPattern;

public class Main {

	public static void main(String[] args) {
		// Single Threaded environement
		Singleton singleton = Singleton.getInstance("FOO");
		Singleton anotherSingleton = Singleton.getInstance("BAR");
		System.out.println(singleton.value);
		System.out.println(anotherSingleton.value);

		// MultiThread environment
		Thread threadBar = new Thread(new ThreadBar());
		Thread threadFoo = new Thread(new ThreadFoo());
		threadBar.start();
		threadFoo.start();
	}

	static class ThreadFoo implements Runnable {

		@Override
		public void run() {
			SingletonMultiThreaded m1 = SingletonMultiThreaded.getInstance("FOO");
			System.out.println(m1.value);
		}

	}

	static class ThreadBar implements Runnable {

		@Override
		public void run() {
			SingletonMultiThreaded m2 = SingletonMultiThreaded.getInstance("BAR");
			System.out.println(m2.value);

		}

	}
}
