package Monster.controller;

import Monster.model.MarshmallowMonster;

public class MonsterController 
{
	private MarshmallowMonster firstMonster;
	
	{
		firstMonster = new MarshmallowMonster("Sumeray", 54.540, 2, 4, 1, false);
	}
	public void start()
	{
	System.out.println("We made monsters today!.");
	System.out.println("Here is mine" + firstMonster);
	System.out.println("I have" + firstMonster.gettentaclecount());
	System.out.println("I have" + firstMonster.geteyecount());
	System.out.println("I have" + firstMonster.getmouthcount());
	System.out.println("I have" + firstMonster.getheadcount());
	System.out.println("I have" + firstMonster.gethasnose());
	
	}
	/*monster name Sumeray
	 * has 54.540 tentacles
	 * has 2 eyes 
	 * has 4 mouths
	 * has 1 head
	 * has no nose
	 */
}