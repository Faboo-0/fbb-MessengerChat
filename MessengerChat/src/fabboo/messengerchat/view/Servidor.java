package fabboo.messengerchat.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Window.Type;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextArea;
import java.awt.SystemColor;

public class Servidor {

	private JFrame frmMessengerChat;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Servidor window = new Servidor();
					window.frmMessengerChat.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Servidor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMessengerChat = new JFrame();
		frmMessengerChat.setType(Type.UTILITY);
		frmMessengerChat.getContentPane().setEnabled(false);
		frmMessengerChat.setTitle("Messenger Chat");
		frmMessengerChat.setBackground(Color.DARK_GRAY);
		frmMessengerChat.getContentPane().setBackground(Color.DARK_GRAY);
		
		JLabel lbServidor = new JLabel("Servidor");
		lbServidor.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbServidor.setEnabled(false);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(SystemColor.textInactiveText);
		GroupLayout groupLayout = new GroupLayout(frmMessengerChat.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(97)
					.addComponent(lbServidor, GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
					.addGap(97))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addGap(32)
					.addComponent(textArea, GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
					.addGap(30))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(38)
					.addComponent(lbServidor)
					.addGap(18)
					.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 211, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(25, Short.MAX_VALUE))
		);
		frmMessengerChat.getContentPane().setLayout(groupLayout);
		frmMessengerChat.setBounds(100, 100, 295, 356);
		frmMessengerChat.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
/*
		JLabel lbCliente = new JLabel("Servidor");
		lbCliente.setToolTipText("");
		lbCliente.setHorizontalAlignment(SwingConstants.CENTER);
		lbCliente.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbCliente.setEnabled(false);
		lbCliente.setForeground(Color.WHITE);*/
	}
}
