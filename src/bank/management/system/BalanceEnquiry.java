package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class BalanceEnquiry  extends JFrame implements ActionListener {

    JLabel instruction,resultbalance;
    JButton cancel;
    String pin;
    BalanceEnquiry( String pin){
        this.pin = pin;

        ImageIcon atm2_image_resource=new ImageIcon( ClassLoader.getSystemResource("icon/atm2.png"));
        Image atm2_image_instance=atm2_image_resource.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon atm2_image_icon=new ImageIcon(atm2_image_instance);
        JLabel atm2_icon=new JLabel(atm2_image_icon);
        atm2_icon.setBounds(0,0,1550,830);
        add(atm2_icon);

        instruction=new JLabel("YOUR CURRENT BALANCE  IS RS ");
        instruction.setForeground(Color.WHITE);
        instruction.setFont(new Font("System",Font.BOLD,16));
        instruction.setBounds(460,180,700,35);
        atm2_icon.add(instruction);

        resultbalance=new JLabel();
        resultbalance.setForeground(Color.WHITE);
        resultbalance.setFont(new Font("System",Font.BOLD,16));
        resultbalance.setBounds(460,220,600,35);
        atm2_icon.add(resultbalance);

        cancel=new JButton("BACK");
        cancel.setBounds(700,406,150,35);
        cancel.setBackground(new Color(65,125,128));
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        atm2_icon.add(cancel);

        int balance=0;

        try{
            Con conn=new Con();
            ResultSet resultSet=conn.statement.executeQuery("select * from bank where pin='"+pin+"'");
            while(resultSet.next()){
                if(resultSet.getString("type").equals("Deposit")){
                    balance+=Integer.parseInt(resultSet.getString("amount"));
                }else{
                    balance-=Integer.parseInt(resultSet.getString("amount"));


                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        resultbalance.setText(""+balance);


        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        setVisible(false);
        new main_Class(pin);

    }

    public static void main(String[] args) {
        new BalanceEnquiry("");
    }
}
