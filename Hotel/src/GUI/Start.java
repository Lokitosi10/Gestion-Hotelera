package GUI;

/**
 * 1st window
*/

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

import Database.CaException;
import DAO.HotelDAO;
import Logic.Hotel;

public class Start extends JFrame implements ActionListener {
    /* Graphic variables */
    private JLabel lblBackground;
    
    private JButton btnRegister;
    private JButton btnLogIn;
    private JButton btnCheckIn;
    
    /* Logic variables */
    private Register window2; 
    private LogIn window3; 
    private CheckIn window4; 
    
    private HotelDAO hotelDAO;
    public static Hotel hotel;
    
    /* Constructor */
    public Start() {
        try {               
            addHotel();
        } catch (CaException e) {
            Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, e);
        }
        
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        
        // Create components
        lblBackground = new JLabel();
        
        btnRegister = new JButton(); 
        btnLogIn = new JButton();
        btnCheckIn = new JButton();
        
        // Configure components 
        this.setSize(1215, 758);
        this.getContentPane().setLayout(null); 
        this.setLocationRelativeTo(null);
        this.isDisplayable();
        this.setResizable(false);
        
        lblBackground.setIcon(new ImageIcon(("./Images/Start/Background.png"))); 
        lblBackground.setBounds(0, 0, 1200, 720);
        
        btnRegister.setIcon(new ImageIcon(("./Images/Start/Btn Register.png"))); 
        btnRegister.setBounds(110, 370, 220, 80);
        btnRegister.setContentAreaFilled(false);
        btnRegister.setBorderPainted(false);
        btnRegister.setOpaque(false); 
        btnRegister.setFocusable(false);
        btnRegister.addActionListener(this);
        
        btnLogIn.setIcon(new ImageIcon(("./Images/Start/Btn Log In.png"))); 
        btnLogIn.setBounds(805, 370, 330, 80);
        btnLogIn.setContentAreaFilled(false);
        btnLogIn.setBorderPainted(false);
        btnLogIn.setOpaque(false); 
        btnLogIn.setFocusable(false);
        btnLogIn.addActionListener(this);
        
        btnCheckIn.setIcon(new ImageIcon(("./Images/Start/Btn Check In.png"))); 
        btnCheckIn.setBounds(414, 492, 330, 80);
        btnCheckIn.setContentAreaFilled(false);
        btnCheckIn.setBorderPainted(false);
        btnCheckIn.setOpaque(false); 
        btnCheckIn.setFocusable(false);
        btnCheckIn.addActionListener(this);
        
        // Add components 
        add(btnRegister);
        add(btnLogIn);
        add(btnCheckIn);
        
        add(lblBackground);
        
        this.setVisible(true);
    }
    
    /* Change windows */
    public void goToRegister() {
        this.dispose();
        window2 = new Register(); 
    }
    
    public void goToLogIn() {
        this.dispose();
        window3 = new LogIn();
    }
    
    public void goToCheckIn() {
        this.dispose();
        window4 = new CheckIn();
    }
    
    /* Register hotel */
    public void addHotel() throws CaException {
        hotelDAO = new HotelDAO();
        
        hotelDAO.getHotelByID("HT001");
        
        hotel = hotelDAO.getHotel();
    }
    
    
    /* Button actions */
    public void actionPerformed(ActionEvent event) { 
        if(event.getSource() == btnRegister) {
            goToRegister();
        }
        
        if(event.getSource() == btnLogIn) {
            goToLogIn();
        }
        
        if(event.getSource() == btnCheckIn) {
            goToCheckIn();
        }
    }
}
