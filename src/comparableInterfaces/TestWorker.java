package comparableInterfaces;

import java.util.ArrayList;

public class TestWorker {

	public static void main(String[] args) {
		ArrayList<WorkerStart> employees = new ArrayList<WorkerStart>();
		for(int i = 0; i < 100; i++){
			employees.add(new WorkerStart(i + 4, i + 2));
		}

		int largest = 0;
		int smallest = 0;
		for(WorkerStart x : employees){
			if(x.compareTo(smallest)<0){
				
			}
		}
	}
}
