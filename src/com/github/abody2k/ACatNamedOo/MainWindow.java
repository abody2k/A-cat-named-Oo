package com.github.abody2k.ACatNamedOo;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainWindow {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
					
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setUndecorated(true);
		frame.setBounds(0, 0, 1000, 1000);
		frame.setTitle("A cat named Oo");
		frame.setBackground(new Color(0, 0, 0,0));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton speak = new JButton();
		JButton listen = new JButton();
		speak.setText("Click here to speak");
		listen.setText("Click to listen");

		frame.setLayout(new FlowLayout());
		speak.setBounds(0, 0, 100, 100);
		listen.setBounds(100, 100, 100, 100);
		frame.add(listen);
		frame.add(speak);
		
//		frame.add(new JButton());
	}

}
