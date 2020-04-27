package swing;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class RSK019_Pra {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel pnlInput = new JPanel();
		pnlInput.setLayout(new GridBagLayout());
		pnlInput.setBorder(BorderFactory.createRaisedBevelBorder());
		pnlInput.setBackground( new Color(243, 243, 243));
		
		GridBagConstraints c0 = new GridBagConstraints();
		c0.gridx = 0;
		c0.gridy = 0;
		c0.gridwidth = 1;
		c0.gridheight = 1;
		c0.gridx = 0;
		c0.gridx = 0;
		c0.gridx = 0;
	}

}
