package remote;

public class RemoteController {

	public static void main(String[] args) {
		SettopBox sb = new SettopBox();
		Television tv = new Television();
		
		sb.on();
		
		tv.on();
		
		sb.volumeUp();
		sb.volumeUp();
		sb.volumeUp();
		sb.volumeUp();
		
		tv.volumeUp();
		tv.volumeUp();
		tv.volumeDown();
		tv.volumeUp();
		
		sb.showSetStatus();
		
		tv.off();
	}
}
