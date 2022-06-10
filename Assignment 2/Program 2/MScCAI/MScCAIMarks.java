package MScCAI;
public class MScCAIMarks
{
	int SemITotal,SemIITotal,total;
	public MScCAIMarks(int SemITotal,int SemIITotal)
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
