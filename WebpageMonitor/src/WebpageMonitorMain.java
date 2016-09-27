import java.util.Scanner;



public class WebpageMonitorMain {
	
//  For use with threads, use a queue to store Pair objects
//	private static class Pair {
//		public String update;
//		public WebpageMonitor monitor;
//	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		UpdaterGUI updater = new UpdaterGUI();
		updater.makeWindow();
		
		
		WebpageMonitor monitors[] = new WebpageMonitor[5];
		monitors[0] = new WebpageMonitor(updater, "http://google.com");
		monitors[1] = new WebpageMonitor(updater, "http://cnn.com");
		monitors[2] = new WebpageMonitor(updater, "http://reddit.com");
		monitors[3] = new WebpageMonitor(updater, "http://foxnews.com");
		monitors[4] = new WebpageMonitor(updater, "http://msnbc.com");
		
		//while(true) {
//			System.out.println("--------------------------------------------------");
//			System.out.println("            Webpage Monitor");
//			System.out.println("--------------------------------------------------");
//			String updatedWebpage = monitors[0].waitForUpdate();
//			if(userRequestsDownload(updatedWebpage, scanner)) {
//				monitors[0].doDownload();
			
			for(int i = 0; i < monitors.length; i++){
				WebpageMonitorThread temp = new WebpageMonitorThread(monitors[i],scanner,updater);
				Thread t1 = new Thread(temp);
				t1.start();
			//}
//			updatedWebpage = monitors[1].waitForUpdate();
//			if(userRequestsDownload(updatedWebpage, scanner)) {
//				monitors[1].doDownload();
//			}
		
		}
		
		//scanner.close();
	}
	/**
	 * TODO Put here a description of what this class does.
	 *
	 * @author localmgr.
	 *         Created Feb 13, 2015.
	 */
	public static class WebpageMonitorThread implements Runnable{
		private WebpageMonitor m;
		private Scanner s;
		private UpdaterGUI g;
		/**
		 * TODO Put here a description of what this constructor does.
		 *
		 * @param monitor
		 * @param s
		 * @param g
		 */
		public WebpageMonitorThread(WebpageMonitor monitor,Scanner s, UpdaterGUI g){
			this.m = monitor;
			this.s = s;
			this.g = g;
		}
		@Override
		public void run() {
			// TODO Auto-generated method stub.
			System.out.println("--------------------------------------------------");
			System.out.println("            Webpage Monitor");
			System.out.println("--------------------------------------------------");
			String updatedWebpage = this.m.waitForUpdate();
			if(userRequestsDownload(updatedWebpage, s)) {
				this.m.doDownload();
			}
			System.out.println("All local current content:");
			System.out.println(g.getCollectedPageContent());
			try {
				Thread.sleep(10);
			} catch (InterruptedException exception) {
				// TODO Auto-generated catch-block stub.
				exception.printStackTrace();
			}
		}
		
	}
	public static boolean userRequestsDownload(String update, Scanner scanner) {
		System.out.println(">>>>> Do you wish to keep the update:\n" + update);
		
		boolean allNum = false;
		
		while(!allNum) {
			System.out.println("1 for yes, 0 for no:\n<<<<< ");
			int input = scanner.nextInt();
			System.out.println("Thanks you");
			if (input == 0) {
				return false;
			} else if (input == 1) {
				return true;
			} else {
				System.out.println("Incorrect value entered!");
				allNum = false;
			}
		}
		return false;
	}
}

