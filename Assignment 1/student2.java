import java.io.*;
class Student
{
  static int roll = 0;
  String name;
  float percentage;
  int r;

    Student ()
  {}

  Student (String name, float percentage)
  {
    this.name = name;
    this.percentage = percentage;
    roll = roll + 1;
    r = roll;


  }

  static void sort (Student s[], int n)
  {
    for (int i = 0; i < n; i++)
      {
	for (int j = 0; j < n - i - 1; j++)
	  {
	    if (s[j].percentage < s[j + 1].percentage)
	      {
		Student temp = new Student ();
		temp = s[j];
		s[j] = s[j + 1];
		s[j + 1] = temp;
	      }
	  }
      	  
      }


  }
 void display()
  {
    System.out.println("Roll : "+r);
    System.out.println("Name : "+name);	      
    System.out.println("Percentage : "+percentage);
  }
}

class ass1a3
{
  public static void main (String args[]) throws IOException
  {
    BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
    
    String name;
    float percentage;

      System.out.println ("Enter how many students");
    int n = Integer.parseInt (br.readLine ());
      Student[] s = new Student[n];
    for (int i = 0; i < n; i++)
      {
	System.out.println ("Enter roll :" + (Student.roll + 1));
	System.out.println ("Enter name :");
	name = br.readLine ();
	System.out.println ("Enter percentage :");
	while (true)
	  {
	    percentage = Float.parseFloat (br.readLine ());
	    if (percentage > 0)
	      break;
	    else
	      System.out.println ("Invalid Input!!!!");
	  }
	s[i] = new Student(name, percentage);
      }
    Student.sort (s, n);
    for (int i = 0; i < n; i++)
      {
	s[i].display();
      }

  }
} 
