package MScCAI;
public class MScCAIMarks
{
	int SemI,SemII;
	int total;

	public MScCAIMarks()
	{
	}
	
	public MScCAIMarks(int sem1,int sem2)
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
