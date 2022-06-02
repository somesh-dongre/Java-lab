import java.io.*;

abstract class Shape
{
	final double pi=3.14;
	abstract void area();
	abstract void volume();
}

class Sphere extends Shape
{
	double r;
	void accept() throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\nEnter the radius of Sphere:");
		while(true)
		{
			r=Double.parseDouble(br.readLine());
			if(r>0)
				break;
			else
				System.out.println("Please enter valid radius");
		}
	}

	void area()
	{
		System.out.println("Area of Sphere: "+(4*pi*r*r));
	}
	
	void volume()
	{	
		System.out.println("Volume of Sphere: "+((4/3)*pi*r*r));
	}
}

class Cone extends Shape
{
	double r,h;
	void accept() throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\nEnter the radius of Cone:");
		while(true)
		{
			r=Double.parseDouble(br.readLine());
			if(r>0)
				break;
			else
				System.out.println("Please enter valid radius");
		}

		System.out.println("Enter the height of Cone:");
		while(true)
		{
			h=Double.parseDouble(br.readLine());
			if(h>0)
				break;
			else
				System.out.println("Please enter valid height");
		}
	}

	void area()
	{
		System.out.println("Area of Cone: "+(pi*r*(r + Math.pow(h*h + r*r,0.5))));
	}
	
	void volume()
	{	
		System.out.println("Volume of Cone: "+4/3 * pi * r * r);
	}
}

class Cylinder extends Shape
{
	double r,h;
	void accept() throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\nEnter the radius of Cylinder:");
		while(true)
		{
			r=Double.parseDouble(br.readLine());
			if(r>0)
				break;
			else
				System.out.println("Please enter valid radius");
		}

		System.out.println("Enter the height of Cone:");
		while(true)
		{
			h=Double.parseDouble(br.readLine());
			if(h>0)
				break;
			else
				System.out.println("Please enter valid height");
		}
	}

	void area()
	{
		System.out.println("Area of Cylinder: "+(2*pi*r));
	}
	
	void volume()
	{	
		System.out.println("Volume of Cylinder: "+(pi*r*r*h));
	}
}

class Box extends Shape
{
	double l,b,h;
	void accept() throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\nEnter the length of Box:");
		while(true)
		{
			l=Double.parseDouble(br.readLine());
			if(l>0)
				break;
			else
				System.out.println("Please enter valid length");
		}

		System.out.println("Enter the breadth of Box:");
		while(true)
		{
			b=Double.parseDouble(br.readLine());
			if(b>0)
				break;
			else
				System.out.println("Please enter valid breadth");
		}

		System.out.println("Enter the height of Box:");
		while(true)
		{
			h=Double.parseDouble(br.readLine());
			if(h>0)
				break;
			else
				System.out.println("Please enter valid height");
		}
	}

	void area()
	{
		System.out.println("Area of Box: "+(2*l*h + 2*b*h + 2*l*b));
	}
	
	void volume()
	{	
		System.out.println("Volume of Box: "+(l*b*h));
	}
}

class ShapeMain
{
	public static void main(String args[]) throws IOException
	{
		Sphere s=new Sphere();
		Cone c=new Cone();
		Cylinder cl=new Cylinder();
		Box b=new Box();

		s.accept();
		s.area();
		s.volume();

		c.accept();
		c.area();
		c.volume();

		cl.accept();
		cl.area();
		cl.volume();

		b.accept();
		b.area();
		b.volume();
	}
}
	

	
