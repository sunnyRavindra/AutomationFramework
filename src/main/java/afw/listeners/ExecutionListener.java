package afw.listeners;

import org.testng.IExecutionListener;

public class ExecutionListener implements IExecutionListener {

	@Override
	public void onExecutionFinish() {
		long endTime = System.currentTimeMillis();
		System.out.println("Inform all the suite have finished execution at" + endTime);

	}

	@Override
	public void onExecutionStart() {
		long startTime = System.currentTimeMillis();
		System.out.println("Inform all the suite have started execution at" + startTime);

	}

}