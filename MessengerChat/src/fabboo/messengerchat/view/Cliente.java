package fabboo.messengerchat.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Window.Type;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.border.MatteBorder;

public class Cliente {

	private JFrame frmMessengerChat;
	private JTextField txtContent;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cliente window = new Cliente();
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
	public Cliente() {
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
		frmMessengerChat.setBounds(100, 100, 295, 356);
		frmMessengerChat.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lbCliente = new JLabel("Cliente");
		lbCliente.setToolTipText("");
		lbCliente.setHorizontalAlignment(SwingConstants.CENTER);
		lbCliente.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbCliente.setEnabled(false);
		lbCliente.setForeground(Color.WHITE);
		
		txtContent = new JTextField();
		txtContent.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(153, 180, 209)));
		txtContent.setForeground(Color.LIGHT_GRAY);
		txtContent.setBackground(Color.DARK_GRAY);
		txtContent.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtContent.setHorizontalAlignment(SwingConstants.LEFT);
		txtContent.setColumns(1);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.setForeground(SystemColor.inactiveCaptionBorder);
		btnEnviar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnEnviar.setBackground(SystemColor.textHighlight);
		GroupLayout groupLayout = new GroupLayout(frmMessengerChat.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(103)
					.addComponent(lbCliente, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(103))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(47)
					.addComponent(txtContent, GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
					.addGap(45))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(95)
					.addComponent(btnEnviar, GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
					.addGap(95))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(38)
					.addComponent(lbCliente)
					.addGap(18)
					.addComponent(txtContent, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(39)
					.addComponent(btnEnviar)
					.addContainerGap(144, Short.MAX_VALUE))
		);
		frmMessengerChat.getContentPane().setLayout(groupLayout);
	}
}
