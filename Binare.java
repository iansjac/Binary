/****************
*
*@author Ian Jacobs
*Date: February 2015
*
*Class to represent a simple
*GUI swing based ASCII binary
*converter
*
*****************/


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


public class Binare extends JPanel implements ActionListener{

	protected JTextField textField;
	protected JTextArea textArea;
	private final static String newline = "\n";
	char letter = ' ';
	String binary = " ";
	JLabel label1 = new JLabel("        Please input text to convert to Binary");

	public Binare() {

		super(new GridBagLayout());

		label1.setVerticalTextPosition(JLabel.BOTTOM);
		label1.setHorizontalTextPosition(JLabel.CENTER);
		label1.setOpaque(true);

		textField = new JTextField(10);
		textField.addActionListener(this);
		textField.setBackground(Color.black);
		textField.setForeground(Color.green);

		textArea = new JTextArea("	Please input Text to convert to binary" + newline + newline +
				"Please visit https://www.binary.com/dry_Erase for all your marker needs!" + newline);
		textArea.setEditable(false);
		textArea.setFont(new Font("Chalkboard", Font.ITALIC, 16));
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		textArea.setBackground(Color.black);
		textArea.setForeground(Color.green);

		JScrollPane scrollPane = new JScrollPane(textArea);


		GridBagConstraints c = new GridBagConstraints();
		c.gridwidth = GridBagConstraints.REMAINDER;

		c.fill = GridBagConstraints.HORIZONTAL;
		add(textField, c);

		c.fill = GridBagConstraints.BOTH;
		c.weightx = 1.0;
		c.weighty = 1.0;
		add(scrollPane, c);
	}


	public void actionPerformed(ActionEvent evt) {
		String text = textField.getText();

		for(int i = 0; i < text.length(); i++) {
			letter = text.charAt(i);
			switch(letter) {

			case'a': binary = "01100001"; break;
			case'b': binary = "01100010"; break;
			case'c': binary = "01100011"; break;
			case'd': binary = "01100100"; break;
			case'e': binary = "01100101"; break;
			case'f': binary = "01100110"; break;
			case'g': binary = "01100111"; break;
			case'h': binary = "01101000"; break;
			case'i': binary = "01101001"; break;
			case'j': binary = "01101010"; break;
			case'k': binary = "01101011"; break;
			case'l': binary = "01101100"; break;
			case'm': binary = "01101101"; break;
			case'n': binary = "01101110"; break;
			case'o': binary = "01101111"; break;
			case'p': binary = "01110000"; break;
			case'q': binary = "01110001"; break;
			case'r': binary = "01110010"; break;
			case's': binary = "01110011"; break;
			case't': binary = "01110100"; break;
			case'u': binary = "01110101"; break;
			case'v': binary = "01110110"; break;
			case'w': binary = "01110111"; break;
			case'x': binary = "01111000"; break;
			case'y': binary = "01111001"; break;
			case'z': binary = "01111010"; break;

			case' ': binary = "00100000"; break;
			case'.': binary = "101110"; break;
			case',': binary = "00101100"; break;
			case'/': binary = "00101111"; break;
			case'"': binary = "01011100 00100110 01110001 01110101 01101111 01110100 00111011"; break;
			case'?': binary = "00111111"; break;
			case'!': binary = "00100001"; break;
			case'@': binary = "01000000"; break;
			case'$': binary = "00100100"; break;
			case'(': binary = "00101000"; break;
			case')': binary = "00101001"; break;
			case'*': binary = "00101010"; break;
			case';': binary = "00111011"; break;
			case':': binary = "00111010"; break;
			case'=': binary = "00111101"; break;
			case'-': binary = "00101101"; break;
			case'{': binary = "01111011"; break;
			case'}': binary = "01111101"; break;
			case'[': binary = "01011011"; break;
			case']': binary = "01011101"; break;
			case'%': binary = "00100101"; break;
			case'^': binary = "01011110"; break;

			case'0': binary = "00110000"; break;
			case'1': binary = "00110001"; break;
			case'2': binary = "00110010"; break;
			case'3': binary = "00110011"; break;
			case'4': binary = "00110100"; break;
			case'5': binary = "00110101"; break;
			case'6': binary = "00110110"; break;
			case'7': binary = "00110111"; break;
			case'8': binary = "00111000"; break;
			case'9': binary = "00111001"; break;


			case'A': binary = "01000001"; break;
			case'B': binary = "01000010"; break;
			case'C': binary = "01000011"; break;
			case'D': binary = "01000100"; break;
			case'E': binary = "01000101"; break;
			case'F': binary = "01000110"; break;
			case'G': binary = "01000111"; break;
			case'H': binary = "01001000"; break;
			case'I': binary = "01001001"; break;
			case'J': binary = "01001010"; break;
			case'K': binary = "01001011"; break;
			case'L': binary = "01001100"; break;
			case'M': binary = "01001101"; break;
			case'N': binary = "01001110"; break;
			case'O': binary = "01001111"; break;
			case'P': binary = "01010000"; break;
			case'Q': binary = "01010001"; break;
			case'R': binary = "01010010"; break;
			case'S': binary = "01010011"; break;
			case'T': binary = "01010100"; break;
			case'U': binary = "01010101"; break;
			case'V': binary = "01010110"; break;
			case'W': binary = "01010111"; break;
			case'X': binary = "01011000"; break;
			case'Y': binary = "01011001"; break;
			case'Z': binary = "01011010"; break;


			}

			textArea.append(binary  + " "); 
			textField.selectAll();

			textArea.setCaretPosition(textArea.getDocument().getLength());
		}

	}

	private static void createAndShowGUI() {
		JFrame frame = new JFrame("Binary Converter");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.add(new Binare());
		frame.setLocationRelativeTo(null);
		frame.pack();
		frame.setVisible(true);
		frame.setSize(500, 500);
	}


	public static void main(String [] args){
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});

	}
}
