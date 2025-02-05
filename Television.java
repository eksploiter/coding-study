package remote;

public class Television {

	int volume = 0;
	boolean isOn = false;
	
	void on() {
		isOn = true;
		System.out.println("TV를 시작합니다.");
	}
	
	void off() {
		isOn = false;
		System.out.println("TV를 종료합니다.");
	}
	
	void volumeUp() {
		volume++;
		System.out.println("TV 볼륨 증가: " + volume);
	}
	
	void volumeDown() {
		volume--;
		System.out.println("TV 볼륨 감소: " + volume);
	}
	
	void showSetStatus() {
		System.out.println("TV 상태 확인");
		if (isOn) {
			System.out.println("TV 전원 on, 볼륨: " + volume);
		} else {
			System.out.println("TV 전원이 꺼져있습니다.");
		}
	}
}
