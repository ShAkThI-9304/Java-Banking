package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Deposit  extends JFrame implements ActionListener {
    String pin;
    JLabel amt_to_deposit;
    JButton deposit,cancel;
    TextField enter_amt;
    Deposit(String pin){
        this.pin = pin;

        ImageIcon atm2_image_resource=new ImageIcon( ClassLoader.getSystemResource("icon/atm2.png"));
        Image atm2_image_instance=atm2_image_resource.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon atm2_image_icon=new ImageIcon(atm2_image_instance);
        JLabel atm2_icon=new JLabel(atm2_image_icon);
        atm2_icon.setBounds(0,0,1550,830);
        add(atm2_icon);

        amt_to_deposit=new JLabel("ENTER AMOUNT YOU WANT TO DEPOSIT");
        amt_to_deposit.setForeground(Color.WHITE);
        amt_to_deposit.setFont(new Font("System",Font.BOLD,16));
        amt_to_deposit.setBounds(460,180,400,35);
        atm2_icon.add(amt_to_deposit);

        enter_amt=new TextField();
        enter_amt.setFont(new Font("System",Font.BOLD,16));
        enter_amt.setForeground(Color.WHITE);
        enter_amt.setBackground(new Color(65,125,128));
        enter_amt.setBounds(460,230,320,35);
        atm2_icon.add(enter_amt);


        deposit=new JButton("DEPOSIT");
        deposit.setBounds(700,360,150,35);
        deposit.setBackground(new Color(65,125,128));
        deposit.setForeground(Color.WHITE);
        deposit.addActionListener(this);
        atm2_icon.add(deposit);

        cancel=new JButton("BACK");
        cancel.setBounds(410,360,150,35);
        cancel.setBackground(new Color(65,125,128));
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        atm2_icon.add(cancel);





        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);


    }
    @Override
    public void actionPerformed(ActionEvent e){
        try{
        String amount=enter_amt.getText();
        Date date=new Date();
        if(e.getSource()==deposit){
            if(enter_amt.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Enter Amount To Deposit");
            }else{
                Con c=new Con();
                c.statement.executeUpdate("insert into bank values('"+pin+"','"+date+"','Deposit','"+amount+"')");
                JOptionPane.showMessageDialog(null, "Rs. " + amount + " Deposited Successfully");
                this.setVisible(false);
                new main_Class(pin);
            }
        }else if(e.getSource()==cancel){
            setVisible(false);
            new main_Class(pin);
        }
    }catch (Exception ex){
        ex.printStackTrace();}
    }

    public static void main(String[] args) {
        new Deposit("");

    }
}
