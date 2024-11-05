import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JTextPane;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.JComboBox;

public class ventanaLogin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPasswordField jpfContraseña;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventanaLogin frame = new ventanaLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ventanaLogin() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Iri\\Documents\\DAM\\Eclipse\\Ventana Universidad\\src\\resources\\ff808081718154220171839c496f0200-large.png"));
		setTitle("Componentes Gráficos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnLimpiar = new JButton("LIMPIAR");
		btnLimpiar.setBounds(117, 232, 85, 21);
		contentPane.add(btnLimpiar);
		
		JLabel labelUsuario = new JLabel("USUARIO");
		labelUsuario.setBounds(22, 62, 57, 13);
		contentPane.add(labelUsuario);
		
		JLabel labelContraseña = new JLabel("CONTRASEÑA");
		labelContraseña.setBackground(Color.BLACK);
		labelContraseña.setForeground(new Color(0, 0, 0));
		labelContraseña.setBounds(22, 102, 85, 13);
		contentPane.add(labelContraseña);
		
		JButton btnEntrar = new JButton("ENTRAR");
		btnEntrar.setBounds(246, 232, 85, 21);
		contentPane.add(btnEntrar);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.setBounds(341, 232, 85, 21);
		contentPane.add(btnSalir);
		
		jpfContraseña = new JPasswordField();
		jpfContraseña.setEchoChar('*');
		jpfContraseña.setBounds(117, 98, 97, 21);
		contentPane.add(jpfContraseña);
		
		JLabel labelCargo = new JLabel("CARGO");
		labelCargo.setBounds(23, 147, 45, 13);
		contentPane.add(labelCargo);
		
		JTextPane tfUsuario = new JTextPane();
		tfUsuario.setBounds(117, 56, 97, 19);
		contentPane.add(tfUsuario);
		
		JLabel lblImagen = new JLabel("");
		lblImagen.setIcon(new ImageIcon("C:\\Users\\Iri\\Documents\\DAM\\Eclipse\\Ventana Universidad\\src\\resources\\file(2).png"));
		lblImagen.setBounds(241, 48, 185, 71);
		contentPane.add(lblImagen);
		
		JComboBox cbCargo = new JComboBox();
		cbCargo.setBounds(117, 143, 97, 21);
		contentPane.add(cbCargo);
	}
}
