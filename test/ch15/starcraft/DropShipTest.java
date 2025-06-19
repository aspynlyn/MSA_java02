package ch15.starcraft;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DropShipTest {
	DropShip dropShip = new DropShip();
	@Test
	@DisplayName("드랍쉽에 마린 3명 태우기")
	public void test1(){
		final int createdUnitCount = 3;
		for (int i = 0; i < createdUnitCount; i++){
			dropShip.load(new Marine());
		}
		int loadedCount = 0;
		for (GroundUnit unit : dropShip.units){
			if (unit != null){
				loadedCount++;
			}
			System.out.printf("%d. %s\n", loadedCount, unit);
		}
		System.out.println("loadedCount: " + loadedCount);
		// 첫번째 인자는 기대하는 값 expected value
		// 두번째 인자는 실제처리된 값 actual value
		assertEquals(createdUnitCount, loadedCount);
		assertEquals(createdUnitCount, dropShip.loadedIdx);
	}

	@Test
	@DisplayName("만원에서 2명 버리기")
	public void test2(){
		for (int i = 0; i< dropShip.units.length; i++){
			dropShip.load(new SiegeTank());
		}
		for (GroundUnit gu : dropShip.units){
			assertNotNull(gu);
		}
		boolean result = dropShip.load(new Marine());
		assertEquals(false, result);

		GroundUnit gu = dropShip.unload();
		assertNotNull(gu);
		assertNull(dropShip.units[dropShip.units.length - 1]);
		assertEquals(7, dropShip.loadedIdx);

		GroundUnit gu2 = dropShip.unload();
		assertNotNull(gu);
		assertNull(dropShip.units[dropShip.units.length - 2]);
		assertEquals(6, dropShip.loadedIdx);

		assertNotEquals(gu, gu2);
	}

	@Test
	@DisplayName("안태우고 튀기")
	public void test3(){

		GroundUnit gu = dropShip.unload();
		assertNull(gu);

		assertEquals(0, dropShip.loadedIdx);
	}
}












































