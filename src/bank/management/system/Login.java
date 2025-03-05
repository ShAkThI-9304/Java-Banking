package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {
    JLabel label1,cardno_label,pin_label ;
    JTextField enter_card_num;
    JPasswordField enter_pin;
    JButton login_btn,clear,register_btn;
    Login(){
        super("Bank Management System");

        setSize(850,480);
        setLocation(450,200);
    
       //setLayout(null);
        ImageIcon bank_image_resource=new ImageIcon( ClassLoader.getSystemResource("icon/bank.png"));
        Image bank_image_instance=bank_image_resource.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon bank_image_icon=new ImageIcon(bank_image_instance);
        JLabel bank_icon=new JLabel(bank_image_icon);
        bank_icon.setBounds(350,10,100,100);
        
        add(bank_icon);



        ImageIcon card_image_resource=new ImageIcon( ClassLoader.getSystemResource("icon/card.png"));
        Image card_image_instance=card_image_resource.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon card_image_icon=new ImageIcon(card_image_instance);
        JLabel card_icon=new JLabel(card_image_icon);
        card_icon.setBounds(630,350,100,100);
        add(card_icon);


        label1=new JLabel("WELCOME TO ATM");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("Times New Roman",Font.BOLD,38));
        label1.setBounds(230,125,450,40);
        add(label1);

        cardno_label=new JLabel("Card Number :");
        cardno_label.setForeground(Color.WHITE);
        cardno_label.setFont(new Font("Times New Roman",Font.BOLD,28));
        cardno_label.setBounds(150,190,375,30);
        add(cardno_label);

        enter_card_num=new JTextField(15);
        enter_card_num.setBounds(330,190,230,30);
        enter_card_num.setFont(new Font("Times New Roman",Font.BOLD,14));
        add(enter_card_num);







        pin_label=new JLabel("PIN :");
        pin_label.setForeground(Color.WHITE);
        pin_label.setFont(new Font("Times New Roman",Font.BOLD,28));
        pin_label.setBounds(150,250,375,30);
        add(pin_label);

        enter_pin=new JPasswordField(15);
        enter_pin.setBounds(330,250,230,30);
        enter_pin.setEchoChar('*');
        enter_pin.setFont(new Font("arial",Font.BOLD,14));
        add(enter_pin);


        login_btn=new JButton("SIGTN IN");
        login_btn.setForeground(Color.WHITE);
        login_btn.setFont(new Font("arial",Font.BOLD,8));
        login_btn.setBackground(Color.BLACK);
        login_btn.setBounds(300,300,100,30);
        login_btn.addActionListener(this);
        add(login_btn);

        clear=new JButton("Clear");
        clear.setForeground(Color.WHITE);
        clear.setFont(new Font("arial",Font.BOLD,8));
        clear.setBackground(Color.BLACK);
        clear.setBounds(450,300,100,30);
        clear.addActionListener(this);
        add(clear);

        register_btn=new JButton("SIGN UP");
        register_btn.setForeground(Color.WHITE);
        register_btn.setFont(new Font("arial",Font.BOLD,8));
        register_btn.setBackground(Color.BLACK);
        register_btn.setBounds(300,350,280,30);
        register_btn.addActionListener(this);
        add(register_btn);







        ImageIcon backbg_image_resource=new ImageIcon( ClassLoader.getSystemResource("icon/backbg.png"));
       Image backbg_image_instance=backbg_image_resource.getImage().getScaledInstance(850,480,Image.SCALE_DEFAULT);
      ImageIcon backbg_image_icon=new ImageIcon(backbg_image_instance);
      JLabel backbg_icon=new JLabel(backbg_image_icon);
      backbg_icon.setBounds(0,0,850,480);
      add(backbg_icon);

        //setLayout(null);















        setLayout(null);//used the default the image locations as null
       // setUndecorated(true);
        setVisible(true);


    }
    
    public void actionPerformed(ActionEvent ae){

        try{
            if (ae.getSource() == clear) {
                enter_card_num.setText("");
                enter_pin.setText("");

            } else if (ae.getSource() == login_btn) {
                Con conn = new Con();
                String card_no = enter_card_num.getText();
                //String pin=enter_pin.getText();
                String pin = new String(enter_pin.getPassword());
                String q = "select * from login where Card_Number='" + card_no + "' and Pin_No ='" + pin + "'";
                ResultSet resultSet = conn.statement.executeQuery(q);
                if (resultSet.next()) {
                    setVisible(false);
                    new main_Class(pin);
                }else{
                    JOptionPane.showMessageDialog(null, "Invalid Card Number Or Pin Number");
                }
            } else if (ae.getSource() == register_btn) {
                new Signupone();
            }

        }catch (Exception e){
            e.printStackTrace();

        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    


    public static void main(String[] args) {
        new Login();


    }
}
