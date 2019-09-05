package kr.ac.daelim.uml;

public class Marine extends Unit {

	protected int AttackPower;
	
	public void Move()
	{
		System.out.println("마린이 이동한다");
	}
	
	public void Attack()
	{
		System.out.println("마린이 공격한다");
	}
	
    public void UnderAttack(Charactor charactor)
    {
    	System.out.println("마린이 공격받는다");
    }
	
}
