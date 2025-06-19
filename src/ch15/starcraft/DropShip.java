package ch15.starcraft;

//수송기
//8개의 지상유닛을 채울 수 있다
public class DropShip extends FlyingUnit {
	protected GroundUnit[] units = new GroundUnit[8];
	protected int loadedIdx = 0;

	// 유닛 하나를 태운다 메소드명 load
	// 태웠으면 return true, 못태웠으면 return false

	public boolean load(GroundUnit unit){
		if(units.length == loadedIdx){
			return false;
		}
		units[loadedIdx++] = unit;
		return true;
	}

	// 유닛 하나를 떨군다 메소드명 unload
	// 떨굴 유닛이 없으면 return null;

	public GroundUnit unload(){
		if(loadedIdx == 0){
			return null;
		}else{
			GroundUnit dp = units[--loadedIdx];
			units[loadedIdx] = null;
			return dp;
		}
	}
}
