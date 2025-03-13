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
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Logeo extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPasswordField jpfContraseña;
	private JTextPane tfUsuario;
	private JLabel labelUsuario;
	private JLabel labelContraseña;
	private JLabel labelCargo;
	private JComboBox cbCargo;
	private JButton btnLimpiar;
	private JButton btnEntrar;
	private JButton btnSalir;
	private JLabel lblImagen;
	Usuario usuario =new Usuario("Carla","uem","alumno");
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Logeo frame = new Logeo();
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
	public Logeo() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Iri\\Documents\\DAM\\Eclipse\\Ventana Universidad\\src\\resources\\ff808081718154220171839c496f0200-large.png"));
		setTitle("Ventana de Inicio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnLimpiar = new JButton("LIMPIAR");
		btnLimpiar.addActionListener(this);
		btnLimpiar.setBounds(49, 195, 85, 21);
		contentPane.add(btnLimpiar);
		
		labelUsuario = new JLabel("USUARIO");
		labelUsuario.setBounds(22, 62, 57, 13);
		contentPane.add(labelUsuario);
		
		labelContraseña = new JLabel("CONTRASEÑA");
		labelContraseña.setBackground(Color.BLACK);
		labelContraseña.setForeground(new Color(0, 0, 0));
		labelContraseña.setBounds(22, 102, 85, 13);
		contentPane.add(labelContraseña);
		
		btnEntrar = new JButton("ENTRAR");
		btnEntrar.addActionListener(this);
		btnEntrar.setBounds(226, 195, 85, 21);
		contentPane.add(btnEntrar);
		
		btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(this);
		btnSalir.setBounds(321, 195, 85, 21);
		contentPane.add(btnSalir);
		
		jpfContraseña = new JPasswordField();
		jpfContraseña.setEchoChar('*');
		jpfContraseña.setBounds(117, 98, 97, 21);
		contentPane.add(jpfContraseña);
		
		labelCargo = new JLabel("CARGO");
		labelCargo.setBounds(23, 147, 45, 13);
		contentPane.add(labelCargo);
		
		tfUsuario = new JTextPane();
		tfUsuario.setBounds(117, 56, 97, 19);
		contentPane.add(tfUsuario);
		
		lblImagen = new JLabel("");
		lblImagen.setIcon(new ImageIcon(Logeo.class.getResource("/resources/file(2).png")));
		lblImagen.setBounds(241, 48, 185, 71);
		contentPane.add(lblImagen);
		
		cbCargo = new JComboBox();
		cbCargo.setToolTipText("");
		cbCargo.setBounds(117, 143, 97, 21);
		cbCargo.addItem("Seleccione");
		cbCargo.addItem("Alumno");
		cbCargo.addItem("Profesor");
		contentPane.add(cbCargo);
		
		JButton btnRegistrar = new JButton("¿No tienes cuenta? Regístrate!");
		btnRegistrar.setForeground(new Color(219, 112, 147));
		btnRegistrar.setBounds(129, 232, 204, 21);
		contentPane.add(btnRegistrar);
		
	}
	public JTextPane getTfUsuario() {
		return tfUsuario;
	}
	public JLabel getLabelUsuario() {
		return labelUsuario;
	}
	public JLabel getLabelContraseña() {
		return labelContraseña;
	}
	public JLabel getLabelCargo() {
		return labelCargo;
	}
	public JPasswordField getJpfContraseña() {
		return jpfContraseña;
	}
	public JComboBox getCbCargo() {
		return cbCargo;
	}
	public JButton getBtnLimpiar() {
		return btnLimpiar;
	}
	public JButton getBtnEntrar() {
		return btnEntrar;
	}
	public JButton getBtnSalir() {
		return btnSalir;
	}
	public JLabel getLblImagen() {
		return lblImagen;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();
	    if (ob.equals(btnSalir)) {
	        System.exit(EXIT_ON_CLOSE);
	    } 
	    else if (ob.equals(btnEntrar)) { 
	        if (tfUsuario.getText().equals("") || jpfContraseña.getPassword().length==0) {
	            JOptionPane.showMessageDialog(null, "Valores vacios");//Muestra una ventana con este mensaje
	        } 
	        else if (tfUsuario.getText().equals(usuario.getUsuario()) && String.valueOf(jpfContraseña.getPassword()).equals(usuario.getContraseña())) {
	            // String.valueOf lo estoy usando para pasar a String la contraseña, porque .getPassword() devuelve char[]
	            JOptionPane.showMessageDialog(null, "Bienvenida a la aplicación "+ usuario.getUsuario());
	            tfUsuario.setText("");
	            jpfContraseña.setText("");
	        } 
	        else {
	            JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos.");
	        }
	    } 
	    else if (ob.equals(btnLimpiar)) {
	        tfUsuario.setText("");
	        jpfContraseña.setText("");
	        cbCargo.setSelectedIndex(0); 
	    }
	}//CIERRA EL MÉTODO
}
