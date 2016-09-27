
public class Main {
	public static void main(String[] args) {
		int n = 200000000;
		int numThreads = 4;
		long startTime = System.currentTimeMillis();
		Data data = new Data();
		//TODO set data will need numThreads as a second argument Step 3
		data.setData(n,numThreads);
		long endTime = System.currentTimeMillis();
		
		System.out.println("Done creating array, took " + 
		                    (endTime-startTime)  + " ms");
		System.out.flush();
		
		
		startTime = System.currentTimeMillis();
		long c = sumSerial(data);
		endTime = System.currentTimeMillis();
		
		System.out.println("Done summing array serially, took "+ 
                (endTime-startTime) + " ms");
		System.out.flush();
		startTime = System.currentTimeMillis();
		long d = sumParallel(data,numThreads);
		endTime = System.currentTimeMillis();
		System.out.println("Done summing array in Parallel, took "+ (endTime-startTime) + " ms");
		System.out.flush();
		
		
		//TODO call sumParallel here, step 4(F)
	}
	
	public static long sumSerial(Data data) {
		long result = 0;
		for(int i = 0; i < data.a.length; i++)
			result += data.a[i];
		return result;
	}
	public static long sumParallel(Data data,int numThreads){
		long result = 0;
		for(int i = 0;i<numThreads;i++){
			sumThread thread = new sumThread(data,i*data.a.length,(i+1)*data.a.length,i);
			thread.run();
			result= result + data.b[i];
		}
		return result;
	}
	//TODO method sumParallel(...) goes here, steps 4(E) and 6
}

class Data {
	public int[] a;
	//TODO Some changes are necessary in this class
	public long[] b;
	
	public void setData(int n,int numThreads) {
		this.a = new int[n];
		this.b = new long[numThreads];
		for(int i = 0; i < n; i++) {
			double randSign = Math.random();
			double randVal = Math.random();
			int sign = (randSign < 0.5) ? -1 : 1;
			this.a[i] = (int)(randVal * n) * sign;
		}
		
	}
}
class sumThread implements Runnable{
	public Data data;
	public int initial;
	public int end;
	public int position;
	private long temp = 0;
	sumThread(Data data,int initial, int end,int position){
		this.data =data;
		this.initial = initial;
		this.end = end;
		this.position = position;
	}
	public void addPartial(){
//		for(int i = this.initial; i < this.end;i++){
//			this.temp = this.temp + this.data.a[i];
//		}
//		this.data.b[this.position] = this.temp;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub.
		for(int i = this.initial; i < this.end;i++){
			this.temp = this.temp + this.data.a[i];
		}
		this.data.b[this.position] = this.temp;
	}
}
//TODO SumThread class goes here step 4(A)
