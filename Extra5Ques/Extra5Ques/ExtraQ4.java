import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class ExtraQ4 extends JFrame implements ActionListener
{
    JFrame f;
    JButton SentenceCase,LowerCase,UpperCase,WordCase,ToggleCase;
    JTextField t;
    String str;
    ExtraQ4()
    {
        f=new JFrame("Q4 of practice prog");
        f.setSize(450,400);
        f.setLayout(null);

        SentenceCase=new JButton("Sentence case");
        SentenceCase.addActionListener(this);
        SentenceCase.setBounds(40,100,100,30);

        LowerCase=new JButton("lower case");
        LowerCase.addActionListener(this);
        LowerCase.setBounds(40,140,100,30);

        UpperCase=new JButton("UPPER CASE");
        UpperCase.addActionListener(this);
        UpperCase.setBounds(40,180,100,30);

        WordCase=new JButton("Cap Each word");
        WordCase.addActionListener(this);
        WordCase.setBounds(40,220,100,30);

        ToggleCase=new JButton("tOGGLE cASE");
        ToggleCase.addActionListener(this);
        ToggleCase.setBounds(40,260,100,30);

        t=new JTextField(50);
        t.setBounds(200,180,200,40);

        f.add(SentenceCase);
        f.add(LowerCase);
        f.add(UpperCase);
        f.add(WordCase);
        f.add(ToggleCase);
        f.add(t);

        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==LowerCase)
        {
            str=t.getText();
            str=str.toLowerCase();
            t.setText(str);
            t.setEditable(false);
        }
        if(ae.getSource()==UpperCase)
        {
            str=t.getText();
            str=str.toUpperCase();
            t.setText(str);
            t.setEditable(false);
        }
        if(ae.getSource()==ToggleCase)
        {
            str=t.getText();
            char arr[];
            arr=str.toCharArray();
            String ToggeledString="";
            for(char ch:arr)
            {
                if(ch==' ')
                {
                    ToggeledString+=" ";
                }
                if(Character.isUpperCase(ch))
                {
                    ToggeledString+=Character.toLowerCase(ch);
                }
                if(Character.isLowerCase(ch))
                {
                    ToggeledString+=Character.toUpperCase(ch);
                }
            }
            t.setText(ToggeledString);
            t.setEditable(false);
        }

        if(ae.getSource()==WordCase)
        {
            str=t.getText();
            char[] charArray=str.toCharArray();
            boolean foundSpace=true;
            for(int i=0;i<charArray.length;i++)
            {
                if(Character.isLetter(charArray[i]))
                {
                    if(foundSpace)
                    {
                        charArray[i]=Character.toUpperCase(charArray[i]);
                        foundSpace=false;
                    }
                }
                else
                {
                    foundSpace=true;
                }
            }
            str=String.valueOf(charArray);
            t.setText(str);

        }

        if(ae.getSource()==SentenceCase)
       	{
            str=t.getText();
            char[] charArray=str.toCharArray();
            for(int i=0; i<charArray.length; i++)
            {	
            	if(charArray[i]=='.')
            	{
    			for(int j=i+1; j<charArray.length; j++)
    			{
    				if(Character.isLetter(charArray[j]))
    				{
    					charArray[j] = Character.toUpperCase(charArray[j]);
    					break;
    				}
    			}
    		}
    	    }
            str=String.valueOf(charArray);
            t.setText(str);
        }
        
    }

    public static void main(String args[])
    {
        new ExtraQ4();
    }
}
