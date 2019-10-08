package urlsploit;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

import java.awt.SystemColor;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JTextPane;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import javax.swing.JButton;
import java.awt.TextArea;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Main {

	public static JFrame frmUrlsploit;
	public static TextArea textArea = new TextArea();
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frmUrlsploit.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		Color blackDark = new Color(44,47,51); // Dark, but not black
		Color notQuiteBlack = new Color(35,39,42); // Not Quite black
		frmUrlsploit = new JFrame();
		frmUrlsploit.setIconImage(Toolkit.getDefaultToolkit().getImage(Main.class.getResource("/com/sun/java/swing/plaf/windows/icons/Computer.gif")));
		frmUrlsploit.setResizable(false);
		frmUrlsploit.getContentPane().setFont(new Font("Microsoft JhengHei", Font.PLAIN, 11));
		frmUrlsploit.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 12));
		frmUrlsploit.getContentPane().setBackground(notQuiteBlack);
		frmUrlsploit.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Payload Path");
		lblNewLabel.setForeground(new Color(65, 105, 225));
		lblNewLabel.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 13));
		lblNewLabel.setBounds(10, 34, 84, 18);
		frmUrlsploit.getContentPane().add(lblNewLabel);
		
		
		JLabel lblTargetPlatform = new JLabel("Target Platform");
		lblTargetPlatform.setForeground(new Color(65, 105, 225));
		lblTargetPlatform.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 13));
		lblTargetPlatform.setBounds(274, 33, 101, 20);
		frmUrlsploit.getContentPane().add(lblTargetPlatform);
		
		JCheckBox chckbxWindows = new JCheckBox("Windows");
		chckbxWindows.setForeground(new Color(65, 105, 225));
		chckbxWindows.setBackground(notQuiteBlack);
		chckbxWindows.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 11));
		chckbxWindows.setBounds(284, 60, 84, 23);
		frmUrlsploit.getContentPane().add(chckbxWindows);
		
		JCheckBox chckbxAndroid = new JCheckBox("Android");
		chckbxAndroid.setForeground(new Color(65, 105, 225));
		chckbxAndroid.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 11));
		chckbxAndroid.setBackground(new Color(35, 39, 42));
		chckbxAndroid.setBounds(284, 88, 84, 23);
		frmUrlsploit.getContentPane().add(chckbxAndroid);
		
		
		JButton btnBrowse = new JButton("Browse");
		btnBrowse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				openfile fp = new openfile();
				try {
					fp.chooseFile();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnBrowse.setForeground(new Color(65, 105, 225));
		btnBrowse.setBackground(notQuiteBlack);
		btnBrowse.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 11));
		btnBrowse.setBounds(103, 61, 89, 23);
		frmUrlsploit.getContentPane().add(btnBrowse);
		
		JButton btnStart = new JButton("Start");
		btnStart.setForeground(new Color(65, 105, 225));
		btnStart.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 11));
		btnStart.setBackground(new Color(35, 39, 42));
		btnStart.setBounds(469, 33, 89, 23);
		frmUrlsploit.getContentPane().add(btnStart);
		
		JButton btnStop = new JButton("Stop");
		btnStop.setForeground(new Color(65, 105, 225));
		btnStop.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 11));
		btnStop.setBackground(new Color(35, 39, 42));
		btnStop.setBounds(469, 67, 89, 23);
		frmUrlsploit.getContentPane().add(btnStop);
		
		
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 12));
		textArea.setForeground(new Color(255, 255, 255));
		textArea.setBackground(blackDark);
		textArea.setEditable(false);
		textArea.setBounds(10, 117, 627, 243);
		textArea.append(">> URL Sploit started.");
		
		
		frmUrlsploit.getContentPane().add(textArea);
		
		textField = new JTextField();
		textField.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 11));
		textField.setForeground(new Color(0, 255, 0));
		textField.setBackground(blackDark);
		textField.setBounds(104, 33, 123, 21);
		frmUrlsploit.getContentPane().add(textField);
		textField.setColumns(10);
		frmUrlsploit.setTitle("UrlSploit");
		frmUrlsploit.setBounds(100, 100, 653, 399);
		frmUrlsploit.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
