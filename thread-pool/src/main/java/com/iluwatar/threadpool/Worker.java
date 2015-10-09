package com.iluwatar.threadpool;

/**
 * 
 * Worker implements Runnable and thus can be executed by ExecutorService
 *
 */
public class Worker implements Runnable {
	
	private final AbsTask task;

	public Worker(final AbsTask task) {
		this.task = task;
	}
	
	@Override
	public void run() {
		System.out.println(String.format("%s processing %s", Thread.currentThread().getName(), task.toString()));
		try {
			Thread.sleep(task.getTimeMs());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
