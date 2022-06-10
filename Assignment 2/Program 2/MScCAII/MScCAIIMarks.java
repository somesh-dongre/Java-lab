package MScCAII;
public class MScCAIIMarks
{
	int SemITotal,SemIITotal,total;
	public MScCAIIMarks(int SemITotal,int SemIITotal)
	{
		this.SemITotal=SemITotal;
		this.SemIITotal=SemIITotal;
	}
	public int total()
	{
		total = SemITotal + SemIITotal;
		return total;	
	}
}
