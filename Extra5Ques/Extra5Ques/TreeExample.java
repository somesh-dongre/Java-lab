import javax.swing.*;  
import javax.swing.tree.DefaultMutableTreeNode;  


public class TreeExample {  
	JFrame f;  
	TreeExample(){  
		f=new JFrame();
		
		DefaultMutableTreeNode ds=new DefaultMutableTreeNode();  
		
		DefaultMutableTreeNode array=new DefaultMutableTreeNode("i. Array");  
		DefaultMutableTreeNode LL=new DefaultMutableTreeNode("ii. Linked List");  
		
		DefaultMutableTreeNode Qarray=new DefaultMutableTreeNode("i. Array");  
		DefaultMutableTreeNode QLL=new DefaultMutableTreeNode("ii. Linked List");  
		
		
		DefaultMutableTreeNode stack=new DefaultMutableTreeNode("a. Stack");   
		stack.add(array);  
		stack.add(LL);  
		
		DefaultMutableTreeNode queue=new DefaultMutableTreeNode("b. Queue");  
		queue.add(Qarray);
		queue.add(QLL);
		
		ds.add(stack);
		ds.add(queue);	
		
		JTree jt=new JTree(ds);
		
		f.add(jt);  
		
		f.setSize(200,200);  
		f.setVisible(true);  
	}  
	public static void main(String[] args) {  
		new TreeExample();  
	}
}  