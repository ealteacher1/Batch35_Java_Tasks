package Tasks_java;

public class Safari_driver  implements Gecko_driver {

	public static void main(String[] args) {
		

	}
	public Safari_driver() {
		System.out.println("constructor called,safari driver window will open");
	}

	@Override
	public void get_url(String url) {
		System.out.println("method called, safari driver window will open");
		
	}

	@Override
	public void close() {
		System.out.println("method called, current window will close ");
		
	}

	@Override
	public void quit() {
	System.out.println("method called, all opened windows will close");
		
	}

}
