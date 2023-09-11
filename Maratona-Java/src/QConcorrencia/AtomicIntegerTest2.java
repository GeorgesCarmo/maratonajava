package QConcorrencia;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Counter1{
	private int count;
	private AtomicInteger atomicInteger = new AtomicInteger();
	private Lock lock = new ReentrantLock(true);
	void increment() {
		lock.lock();
		try {
			count++;
			atomicInteger.incrementAndGet();
		}finally {
			lock.unlock();
		}

	}
	
	public int getCount() {
		return count;
	}
	
	public AtomicInteger getAtomicInteger() {
		return atomicInteger;
	}
}

public class AtomicIntegerTest2 {
	public static void main(String[] args) throws InterruptedException {
		Counter1 counter = new Counter1();
		Runnable r = () -> {
			for (int i = 0; i < 10000; i++) {
				counter.increment();
			}
		};
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println(counter.getCount());
		System.out.println(counter.getAtomicInteger());
	}

}
