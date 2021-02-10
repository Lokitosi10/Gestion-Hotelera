package GUI;

/**
 * 2nd window
 * 
 * @author William Alejandro Ardila Sánchez
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Register extends JFrame implements ActionListener {
    /* Graphic variables */
    private JLabel lblBackground;
    
    private JTextField txtName1;
    private JTextField txtName2;
    private JTextField txtSurname1;
    private JTextField txtSurname2;
    private JTextField txtPhone1;
    private JTextField txtPhone2;
    private JTextField txtDocument;
    private JTextField txtDocumentType; 
    
    private JButton btnRegister;
    private JButton btnGoToBack;
    
    /* Logic variables */
    private Start window2;
    
    /* Constructor */
    public Register() {
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        
        // Create components
        lblBackground = new JLabel();    
        
        txtName1 = new JTextField();
        txtName2 = new JTextField();
        txtSurname1 = new JTextField();
        txtSurname2 = new JTextField();
        txtPhone1 = new JTextField();
        txtPhone2 = new JTextField();
        txtDocument = new JTextField();
        txtDocumentType = new JTextField();
        
        btnRegister = new JButton();
        btnGoToBack = new JButton();
        
        // Configure components 
        this.setSize(1215, 758);
        this.getContentPane().setLayout(null); 
        this.setLocationRelativeTo(null);
        this.isDisplayable();
        
        lblBackground.setIcon(new ImageIcon(("./Images/Register/Background.png"))); 
        lblBackground.setBounds(0, 0, 1200, 720);
        
        txtName1.setBounds(250, 195, 322, 35);
        txtName1.setBorder(null);
        txtName1.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 22));
        txtName1.setForeground(new Color(24, 24, 24)); 
	txtName1.setOpaque(false);
        
        txtName2.setBounds(845, 195, 322, 35);
        txtName2.setBorder(null);
        txtName2.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 22));
        txtName2.setForeground(new Color(24, 24, 24)); 
	txtName2.setOpaque(false);
        
        txtSurname1.setBounds(250, 312, 322, 35);
        txtSurname1.setBorder(null);
        txtSurname1.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 22));
        txtSurname1.setForeground(new Color(24, 24, 24)); 
	txtSurname1.setOpaque(false);
        
        txtSurname2.setBounds(845, 312, 322, 35);
        txtSurname2.setBorder(null);
        txtSurname2.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 22));
        txtSurname2.setForeground(new Color(24, 24, 24)); 
	txtSurname2.setOpaque(false);
        
        txtPhone1.setBounds(250, 432, 322, 35);
        txtPhone1.setBorder(null);
        txtPhone1.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 22));
        txtPhone1.setForeground(new Color(24, 24, 24)); 
	txtPhone1.setOpaque(false);
        
        txtPhone2.setBounds(845, 432, 322, 35);
        txtPhone2.setBorder(null);
        txtPhone2.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 22));
        txtPhone2.setForeground(new Color(24, 24, 24)); 
	txtPhone2.setOpaque(false);
        
        txtDocument.setBounds(250, 549, 322, 35);
        txtDocument.setBorder(null);
        txtDocument.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 22));
        txtDocument.setForeground(new Color(24, 24, 24)); 
	txtDocument.setOpaque(false);
        
        txtDocumentType.setBounds(708, 551, 85, 35);
        txtDocumentType.setBorder(null);
        txtDocumentType.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 22));
        txtDocumentType.setForeground(new Color(24, 24, 24)); 
	txtDocumentType.setOpaque(false);
        
        btnRegister.setIcon(new ImageIcon(("./Images/Register/Btn Register.png"))); 
        btnRegister.setBounds(956, 545, 220, 80);
        btnRegister.setContentAreaFilled(false);
        btnRegister.setBorderPainted(false);
        btnRegister.setOpaque(false); 
        btnRegister.setFocusable(false);
        btnRegister.addActionListener(this);
        
        btnGoToBack.setIcon(new ImageIcon(("./Images/Register/Btn Go To Back.png"))); 
        btnGoToBack.setBounds(30, 26, 115, 85);
        btnGoToBack.setContentAreaFilled(false);
        btnGoToBack.setBorderPainted(false);
        btnGoToBack.setOpaque(false); 
        btnGoToBack.setFocusable(false);
        btnGoToBack.addActionListener(this);
        
        // Add components
        add(btnRegister);
        add(btnGoToBack);
        
        add(txtName1);    
        add(txtName2); 
        add(txtSurname1); 
        add(txtSurname2); 
        add(txtPhone1);    
        add(txtPhone2); 
        add(txtDocument); 
        add(txtDocumentType); 
        
        add(lblBackground);
        
        this.setVisible(true);
    }
    
    /* Change windows */
    public void goToStart() {
        this.dispose();
        window2 = new Start(); 
    }
    
    /* Button actions */
    public void actionPerformed(ActionEvent event) { 
        if(event.getSource() == btnRegister) {
            
        }
        
        if(event.getSource() == btnGoToBack) {
            goToStart();
        }
    }
}