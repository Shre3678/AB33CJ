package Assignments;


class Encap_data
{
	private boolean a;
	private int b =1000000000;
	private String c="Shree";

public boolean getboo()
  {
	return a;
  }

public void setboo(boolean a) 
  {
	this.a = a;
  }
public int getin()
  {
	return b;
  }

public void setint(int b) 
  {
	this.b = b;
  }
public String getStri() 
  {
		return c;
  }

public void setStri(String c) 
  {
		this.c = c;
  }
}

public class Assignment_67 
{
public static void main(String[] args) 
	{
	Encap_data DT = new Encap_data();
    System.out.println(DT.getboo());
    System.out.println(DT.getin());
    System.out.println(DT.getStri());
	}

}
