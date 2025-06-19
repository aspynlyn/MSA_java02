package ch15.starcraft;

// 지상유닛
public abstract class GroundUnit extends Unit{
	@Override
	public void move(int x, int y) {
		System.out.println("지상으로 이동한다");
		super.move(x, y);
	}
}
