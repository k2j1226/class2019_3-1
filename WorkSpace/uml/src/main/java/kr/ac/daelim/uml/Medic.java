package kr.ac.daelim.uml;

public class Medic extends Unit {
	
	public void Move()
	{
		System.out.println("메딕이 이동한다");
	}
	
	public void UnderAttack(Charactor charactor)
	{
		System.out.println("메딕이 공격받는다");
	}
	
	public void Healing(Charactor charactor)
	{
		System.out.println("메딕이 힐링한다");
	}

}
