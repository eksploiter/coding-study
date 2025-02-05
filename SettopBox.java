package remote;

public class SettopBox {

	int volume = 0;
	boolean isOn = false;
	
	void on() {
		isOn = true;
		System.out.println("셋톱박스를 시작합니다.");
	}
	
	void off() {
		isOn = false;
		System.out.println("셋톱박스를 종료합니다.");
	}
	
	void volumeUp() {
		volume += 5;
		System.out.println("셋톱박스 볼륨 증가: " + volume);
	}
	
	void volumeDown() {
		volume -= 5;
		System.out.println("셋톱박스 볼륨 감소: " + volume);
	}
	
	void showSetStatus() {
		System.out.println("셋톱박스 상태 확인");
		if (isOn) {
			System.out.println("셋톱박스 전원 on, 볼륨: " + volume);
		} else {
			System.out.println("셋톱박스 전원이 꺼져있습니다.");
		}
	}
}
