package deadlock;

public class MyDeadlock {
	String str1="Unix";
	String str2="Java";
	
	Thread td1= new Thread("My thread 1"){
		public void run(){
			while(true){
				synchronized (str1) {
					synchronized (str2) {
						System.out.println(str1+str2);
					}
					
				}
			}
		}
	};
	
	Thread td2= new Thread("My thread 2"){
		public void run(){
			while(true){
				synchronized (str1) {
					synchronized (str2) {
						System.out.println(str1+str2);
					}
					
				}
			}
		}
	};
	public static void main(String[] args) {
		
		MyDeadlock md1= new MyDeadlock();
		md1.td1.start();
		md1.td2.start();


	}

}
