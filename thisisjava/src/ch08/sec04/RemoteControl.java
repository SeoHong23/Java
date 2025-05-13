package ch08.sec04;

public interface RemoteControl {
	// 상수 필드
	int MAX_VOLUUME = 10;
	int MIN_VOLUUME = 0;
	
	// 추상 메소드
	void turnOn();
	void turnOff();
	void setVolume(int volume);

}
