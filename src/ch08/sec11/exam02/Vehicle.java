package ch08.sec11.exam02;

/* 인터페이스는 인스턴스 멤버필드를 가질 수 없음
final static 멤버필드는 가질 수 있음
무조건 추상 메소드만 가질 수 있음
public abstract 생략 가능 생략하면 자동으로 붙는다
*/
public interface Vehicle {
	void run();
	void stop();
}
