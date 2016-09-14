package Monster.model;

public class MarshmallowMonster
{
	private String name;
	private double tentaclecount;
	private int eyecount;
	private int mouthcount;
	private int headcount;
	private boolean hasNose;
	
	public MarshmallowMonster()
	{
		this.name = "no name";
		this.tentaclecount = -123123;
		this.eyecount = -12312;
		this.mouthcount = -123443456;
		this.headcount  = -4;
		this.hasNose = false;
	}

	public MarshmallowMonster(String name, double tentaclecount, int eyecount, int mouthcount, int headcount, boolean hasNose)
	{
		
		this.name = name;
		this.tentaclecount = tentaclecount;
		this.eyecount = eyecount;
		this.mouthcount = mouthcount;
		this.headcount = mouthcount;
		this.hasNose = hasNose;
	}
	
	public String toString()
	{
		String description = "Monster says: Name is" + name;
	
		return description;
	}

	public String getname()
	{
		return name;
	}
	public double gettentaclecount()
	{
		return tentaclecount;
	}

	public int geteyecount()
	{
		return eyecount;
	}
	
	public int getmouthcount()
	{
		return mouthcount;
	}

	public int getheadcount()
	{
		return headcount;
	}
	public boolean gethasnose()
	{
		return hasNose;
	}







}