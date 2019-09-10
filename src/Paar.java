
public class Paar <T1,T2> implements Comparable<Paar>{

public T1 t1;
public T2 t2;
	
	public Paar (T1 t1, T2 t2)
	{
	this.t1	=t1;
	this.t2	=t2;
	}
	public T1 getT1()
	{
		return t1;
	}
	public void SetT1(T1 t1)
	{
	this.t1=t1;	
	}
	public T2 getT2()
	{
		return t2;
	}
	public void SetT2(T2 t2)
	{
	this.t2=t2;	
	}
	
	public int compare(T1 t1, T2 t2)
	{
	return 0;	
	}
	@Override
	public int compare() {

		return 0;
	}
	
}
