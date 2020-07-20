import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class paint implements MouseMotionListener,ActionListener{  
    JFrame f = new JFrame();
    JLabel l;  
    JButton b,b1;
    Graphics g; 
    Color c=Color.BLACK,c1;
    paint()
    {  
	    l=new JLabel();  
	    b=new JButton("CHANGE COLOR");
	    b1=new JButton("ERASE SOMETHING?");
	    l.setBounds(20,40,100,20); 
	    b.setBounds(750, 100, 150, 50);
	    b1.setBounds(750, 160, 150, 50);
	    f.add(l);
	    f.add(b);
	    f.add(b1);
	    f.addMouseMotionListener(this);
	    b1.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		c=c1;
	    	}
	    });
	    b.addActionListener(this);
	    c1=f.getBackground();
	    f.setSize(1000,1000);  
	    f.setLayout(null);  
	    f.setVisible(true);  
    }
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		new paint();
	}
	public void mouseDragged(MouseEvent e) {  
	    //l.setText("X="+e.getX()+", Y="+e.getY());  
		g=f.getGraphics();
		g.setColor(c);
	    g.fillOval(e.getX(),e.getY(),20,20);  
	}  
	public void actionPerformed(ActionEvent e) {
		//new createAFrame().setVisible(true);
		JFrame f1=new JFrame();
		//f1.setBackground(Color.WHITE);
		JButton b1=new JButton("BLACK");
		b1.setBackground(Color.BLACK);
		JButton b2=new JButton("RED");
		b2.setBackground(Color.RED);
		JButton b3=new JButton("YELLOW");
		b3.setBackground(Color.YELLOW);
		JButton b4=new JButton("GRAY");
		b4.setBackground(Color.GRAY);
		JButton b5=new JButton("GREEN");
		b5.setBackground(Color.GREEN);
		JButton b6=new JButton("BLUE");
		b6.setBackground(Color.BLUE);
		f1.add(b1);f1.add(b2);f1.add(b3);f1.add(b4);f1.add(b5);f1.add(b6);
		f1.setSize(300,300);
		f1.setLayout(new GridLayout(6,1));
		f1.setVisible(true);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c=Color.BLACK;
			}
		});
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c=Color.RED;
			}
		});b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c=Color.YELLOW;
			}
		});b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c=Color.GRAY;
			}
		});b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c=Color.GREEN;
			}
		});b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c=Color.BLUE;
			}
		});
	}
	public void mouseMoved(MouseEvent e) {  
	    //l.setText("X="+e.getX()+", Y="+e.getY());  
	}
}  
