package swing;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

import sun.applet.Main;

/*
 * 有Bug無法啟動
 * 
 * 
 * */
public class DragandDropPra4 extends JFrame{
private JLayeredPane layeredPane;
private JLabel lab1;
private JLabel lab2;
private JLabel lab3;
private JLabel lab4;
private JPanel mainPanel;
ImageIcon yellowCircleIcon = new ImageIcon();

public DragandDropPra4(){

    Dimension size = new Dimension(400, 400);

    layeredPane = new JLayeredPane();
    getContentPane().add(layeredPane);
    layeredPane.setPreferredSize(size);
    layeredPane.addMouseListener(ms);

    mainPanel = new JPanel(new GridLayout(2,2));
    layeredPane.add(mainPanel, JLayeredPane.DEFAULT_LAYER);
    mainPanel.setPreferredSize(size);
    mainPanel.setBounds(0, 0, size.width, size.height);

    lab1 = new JLabel("111");
    lab1.setBackground(Color.black);
    lab1.setOpaque(true);
    lab1.setIcon(yellowCircleIcon);
    lab1.addMouseListener(ms);

    lab2 = new JLabel("222");
    lab2.addMouseListener(ms);

    lab3 = new JLabel("333");
    lab3.addMouseListener(ms);

    lab4 = new JLabel("444");
    lab4.setBackground(Color.black);
    lab4.setOpaque(true);
    lab4.addMouseListener(ms);

    mainPanel.add(lab1);
    mainPanel.add(lab2);
    mainPanel.add(lab3);
    mainPanel.add(lab4);

    setSize(400, 400);
    setLocationRelativeTo(null);
    setResizable(false);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
}

MouseListener ms = new MouseListener() {

    public void mouseReleased(MouseEvent arg0) {

        //1st way - cannot set icon to lab4
        //when set icon on lab2 and want to go back to lab1 - NullPointerEx.
        JLabel tmp = (JLabel)mainPanel.getComponentAt(arg0.getX(), arg0.getY());

        //2nd way - mouse presses location is always in the same place
        //when I click on Lab1 and release mouse on lab3 - icon is set to lab1
        //tmp = (JLabel)arg0.getComponent();
        tmp.setIcon(yellowCircleIcon);
    }

    public void mousePressed(MouseEvent arg0) {
        JLabel tmp = (JLabel)arg0.getComponent();
        tmp.setIcon(null);
    }

    public void mouseExited(MouseEvent arg0) {}
    public void mouseEntered(MouseEvent arg0) {}
    public void mouseClicked(MouseEvent arg0) {}
};

public static void main(String[] args) {
    new Main();
}

}


