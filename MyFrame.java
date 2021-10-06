package ch08;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MyFrame extends JFrame{
	public MyFrame() {
		setTitle("[이정원]프레임 실습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container cp = getContentPane();
		cp.setBackground(Color.ORANGE);
		cp.setLayout(new FlowLayout(FlowLayout.RIGHT, 20,20));
		JButton btn = new JButton("OK");
		cp.add(btn);
		cp.add(new JButton("Cancel"));
		cp.add(new JButton("Yes/No"));
		cp.add(new JLabel("이름을 입력하세요."));
		cp.add(new JTextField(10));
		setSize(400,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		MyFrame mf = new MyFrame();

	}

}
