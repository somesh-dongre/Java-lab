import java.io.*;

abstract class Shape{
abstract public void cal_area();
abstract public void cal_volume();
final float pi=3.14f;

}

class Sphere extends Shape
{
	double r;
	private double area;
	private double volume;

	public void accept() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter radius of sphere : ");
		while(true)
		{
			r = Double.parseDouble(br.readLine());
			if(r>0)
				break;
			else
				System.out.println("Invalid Input !!!");
		}	
		
	}
	public void cal_area()
	{
		area=4*pi*r*r;
	}
	public void cal_volume()
	{
		volume = (4/3)*pi*r*r*r;	
	}
	public void display()
	{
		cal_area();
		cal_volume();
		System.out.println("Area of Spherer is : "+area);
		System.out.println("Volume of Spherer is : "+volume);	
	}
}

class Cone extends Shape
{
	double h,r,volume,area;
	
		public void accept() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter radius of Cone : ");
		while(true)
		{
			r = Double.parseDouble(br.readLine());
			if(r>0)
				break;
			else
				System.out.println("Invalid Input !!!");
		}	
		System.out.println("Enter height of Cone : ");
		while(true)
		{
			h = Double.parseDouble(br.readLine());
			if(h>0)
				break;
			else
				System.out.println("Invalid Input !!!");
		}
		
	}
	public void cal_area()
	{
		double sq = (h*h)+(r*r);
		area = pi*r*(r+java.lang.Math.sqrt(sq));
	}
	public void cal_volume()
	{
		double d = h/3;
		volume = pi*r*r*d;	
	}
	public void display()
	{
		cal_area();
		cal_volume();
		System.out.println("Area of Cone is : "+area);
		System.out.println("Volume of Cone is : "+volume);	
	}

}
class Cylinder extends Shape
{
	double h,r,volume,area;
	
		public void accept() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter radius of Cylinder : ");
		while(true)
		{
			r = Double.parseDouble(br.readLine());
			if(r>0)
				break;
			else
				System.out.println("Invalid Input !!!");
		}	
		System.out.println("Enter height of Cylinder : ");
		while(true)
		{
			h = Double.parseDouble(br.readLine());
			if(h>0)
				break;
			else
				System.out.println("Invalid Input !!!");
		}
		
	}
	public void cal_area()
	{
		area = (2*pi*r*h)+(2*pi*r*r);
	}
	public void cal_volume()
	{
		volume = pi*r*r*h;	
	}
	public void display()
	{
		cal_area();
		cal_volume();
		System.out.println("Area of Cylinder is : "+area);
		System.out.println("Volume of Cylinder is : "+volume);	
	}


}

class Box extends Shape
{
	double l,h,b,volume,area;
	
		public void accept() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter length of Box : ");
		while(true)
		{
			l = Double.parseDouble(br.readLine());
			if(l>0)
				break;
			else
				System.out.println("Invalid Input !!!");
		}	
		System.out.println("Enter height of Box : ");
		while(true)
		{
			h = Double.parseDouble(br.readLine());
			if(h>0)
				break;
			else
				System.out.println("Invalid Input !!!");
		}
		
		System.out.println("Enter breadth of Box : ");
		while(true)
		{
			b = Double.parseDouble(br.readLine());
			if(b>0)
				break;
			else
				System.out.println("Invalid Input !!!");
		}
	}
	public void cal_area()
	{
		area = (2*l*h)+(2*l*b)+(2*b*h);
	}
	public void cal_volume()
	{
		volume = l*b*h;	
	}
	public void display()
	{
		cal_area();
		cal_volume();
		System.out.println("Area of Box is : "+area);
		System.out.println("Volume of Box is : "+volume);	
	}


}

public class ShapeMain
{
	public static void main(String args[]) throws IOException
	{
		Sphere sp = new Sphere();
		sp.accept();
		sp.display();
			
		Cone co = new Cone();
		co.accept();
		co.display();

		Cylinder cy = new Cylinder();
		cy.accept();
		cy.display();

		Box b = new Box();
		b.accept();
		b.display();

	}
	

}
