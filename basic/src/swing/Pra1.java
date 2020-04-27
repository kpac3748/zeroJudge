package swing;
import java.awt.Button;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;


public class Pra1 {

	public static void main(String[] args) {
		
		JFrame jframe = new JFrame("視窗程式");
		
//		jframe.setIconImage(jframe.getToolkit().getImage("test.jpg"));
//		
		jframe.setSize(300, 400);
//		
		jframe.setLocation(0, 0);
//		
		jframe.setLocationRelativeTo(null);
//		
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		
		jframe.setVisible(true);
		
//		jframe.getContentPane().setLayout(new BorderLayout());
		
//		Button center = new Button("CENTER");
//		Button east = new Button("EAST");
//		Button north = new Button("EAST");
//		Button south = new Button("SOUTH");
//		Button west = new Button("WEST");
//		
//		jframe.add(center, BorderLayout.CENTER);
//		jframe.add(east, BorderLayout.EAST);
//		jframe.add(north, BorderLayout.NORTH);
//		jframe.add(south, BorderLayout.SOUTH);
//		jframe.add(west, BorderLayout.WEST);
		
//		jframe.getContentPane().setLayout(new FlowLayout(FlowLayout.LEFT));
//		Button button1 = new Button("Button1");
//		Button button2 = new Button("Button2");
//		Button button3 = new Button("Button3");
//		Button button4 = new Button("Button4");
//		Button button5 = new Button("Button5");
//		
//		jframe.add(button1);
//		jframe.add(button2);
//		jframe.add(button3);
//		jframe.add(button4);
//		jframe.add(button5);
		
//		jframe.getContentPane().setLayout(new GridLayout(3, 2));
//		
//		jframe.add(button1);
//		jframe.add(button2);
//		jframe.add(button3);
//		jframe.add(button4);
//		jframe.add(button5);
		
		jframe.setLayout(new GridBagLayout());
		
		GridBagConstraints bag1 = new GridBagConstraints();
		bag1.gridx = 0;
		bag1.gridy = 0;
		bag1.gridwidth = 1;
		bag1.gridheight = 1;
		bag1.weightx = 0;
		bag1.weighty = 0;
		bag1.fill = GridBagConstraints.NONE;
		bag1.anchor = GridBagConstraints.WEST;
		jframe.add(new Button("Bag1"), bag1);
		
		GridBagConstraints bag2 = new GridBagConstraints();
		bag2.gridx = 1;
		bag2.gridy = 0;
		bag2.gridwidth = 1;
		bag2.gridheight = 1;
		bag2.weightx = 0;
		bag2.weighty = 0;
		bag2.fill = GridBagConstraints.NONE;
		bag2.anchor = GridBagConstraints.WEST;
		jframe.add(new Button("Bag2"), bag2);
		
		GridBagConstraints bag3 = new GridBagConstraints();
		bag3.gridx = 0;
		bag3.gridy = 1;
		bag3.gridwidth = 2;
		bag3.gridheight = 1;
		bag3.weightx = 0;
		bag3.weighty = 0;
		bag3.fill = GridBagConstraints.BOTH;
		bag3.anchor = GridBagConstraints.WEST;
		jframe.add(new Button("Bag3"), bag3);
		
		
		
		

	}

}
