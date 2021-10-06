package ch08;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ex03 extends JFrame {
	public Ex03() {
		setTitle("[이정원]실습문제3번");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		
		cp.add(new JLabel("100+200"));
		cp.add(new JButton("="));
		cp.add(new JLabel("300"));
		setSize(400, 100);
		setVisible(true);
	}

	public static void main(String[] args) {
		Ex03 ex = new Ex03();

	}

}
