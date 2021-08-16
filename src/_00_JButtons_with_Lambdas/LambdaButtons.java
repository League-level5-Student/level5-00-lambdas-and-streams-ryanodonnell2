package _00_JButtons_with_Lambdas;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.function.Function;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LambdaButtons {
	private Random random = new Random();
	private JFrame window = new JFrame();
	private JButton addNumbers = new JButton("ADD 2 Numbers");
	private JButton randNumber = new JButton("RANDOM NUMBER");
	private JButton tellAJoke = new JButton("TELL A JOKE");
	
	public LambdaButtons() {
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new FlowLayout());
		window.add(addNumbers);
		window.add(randNumber);
		window.add(tellAJoke);
		//1. Call the addActionListener methods for each button. Use lambdas
		//   to define to functionality of the buttons.
		addNumbers.addActionListener(e -> {
			int num1 = random.nextInt((int) Math.pow(10, random.nextInt(5)+1));
			int num2 = random.nextInt((int) Math.pow(10, random.nextInt(5)+1));
			int sum = num1+num2;
			JOptionPane.showMessageDialog(null, ""+num1+"+"+num2+"="+sum+"");
		});
		randNumber.addActionListener(e -> JOptionPane.showMessageDialog(null, random.nextInt((int) Math.pow(10, random.nextInt(5)+1))));
		tellAJoke.addActionListener(e -> JOptionPane.showMessageDialog(null, "Did you hear about the mathematician who’s afraid of negative numbers?\r\n"
				+ "He’ll stop at nothing to avoid them."));
		window.setVisible(true);
		window.pack();
	}
	
	public static void main(String[] args) {
		new LambdaButtons();
	}
	
	
}
