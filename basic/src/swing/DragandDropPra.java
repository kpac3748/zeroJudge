package swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JFrame;
import javax.swing.JLabel;

/*
 * 藉由滑鼠移動在drag的時候寫字down，drop寫up。
 * 
 * */
public class DragandDropPra extends JFrame {

	JLabel lbl;

	public static void main(String[] args) {
		DragandDropPra app = new DragandDropPra();
		app.setSize(300, 300);
		app.setVisible(true);
	}

	public DragandDropPra() {
		final Container c = getContentPane();
		c.setBackground(Color.white);
		lbl = new JLabel(); // 視窗左上方的 Label

		addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) { // 當滑鼠游標進入物件範圍
				int x = e.getX(); // 擷取發生事件的 X 座標
				int y = e.getY(); // 擷取發生事件的 Y 座標
				c.setBackground(Color.yellow);
				lbl.setText("Mouse is moving to" + Integer.toString(x) + "," + Integer.toString(y));
			}
		});
		addMouseListener(new MouseAdapter() {
			public void mouseExited(MouseEvent e) { // 當滑鼠游標進入物件範圍
				int x = e.getX();
				int y = e.getY();
				c.setBackground(Color.white);
				lbl.setText("Mouse just left the window from" + Integer.toString(x) + "," + Integer.toString(y));
			}
		});
		addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) { // 實做滑鼠的點擊事件
				Graphics g = getGraphics();
				int x = e.getX();
				int y = e.getY();
				g.drawString("DOWN", x, y); // 在事件發生的座標繪上 "DOWN" 字樣
				lbl.setText("Mouse is pressed at" + Integer.toString(x) + "," + Integer.toString(y));
			}
		});
		addMouseListener(new MouseAdapter() {
			public void mouseReleased(MouseEvent e) { // 實做滑鼠的放開事件
				Graphics g = getGraphics();
				int x = e.getX();
				int y = e.getY();
				g.drawString("UP", x, y);
				lbl.setText("Mouse is released from" + Integer.toString(x) + "," + Integer.toString(y));
			}
		});
		addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseDragged(MouseEvent e) { // 實做滑鼠的拖曳事件
				Graphics g = getGraphics();
				int x = e.getX();
				int y = e.getY();
				g.drawString("Dragging", x, y);
				lbl.setText("Mouse is Dragging at" + Integer.toString(x) + "," + Integer.toString(y));
			}
		});
		c.add(lbl, BorderLayout.NORTH);
	}

}
