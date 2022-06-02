package MScCAII;
public class MScCAIIMarks
{
	int SemI,SemII;
	int total;

	public MScCAIIMarks()
	{
	}
	
	public MScCAIIMarks(int sem1,int sem2)
	{
		SemI=sem1;
		SemII=sem2;
	}
	public int TotalMarks(int sem1,int sem2)	
	{
		total=sem1+sem2;
		return total;
	}
}
