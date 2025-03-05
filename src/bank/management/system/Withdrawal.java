package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class Withdrawal extends JFrame implements ActionListener {
    JLabel instruction,amt_to_withdrawal;
    JButton withdraw,cancel;
    TextField enter_amt;
    String pin;
    Withdrawal(String pin) {
        this.pin = pin;

        ImageIcon atm2_image_resource=new ImageIcon( ClassLoader.getSystemResource("icon/atm2.png"));
        Image atm2_image_instance=atm2_image_resource.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon atm2_image_icon=new ImageIcon(atm2_image_instance);
        JLabel atm2_icon=new JLabel(atm2_image_icon);
        atm2_icon.setBounds(0,0,1550,830);
        add(atm2_icon);

        instruction=new JLabel("MAXIMUM WITHDRAWAL AMOUNT IS RS 10,000");
        instruction.setForeground(Color.WHITE);
        instruction.setFont(new Font("System",Font.BOLD,16));
        instruction.setBounds(460,180,700,35);
        atm2_icon.add(instruction);

        amt_to_withdrawal=new JLabel("PLEASE ENTER AMOUNT TO WITHDRAWAL");
        amt_to_withdrawal.setForeground(Color.WHITE);
        amt_to_withdrawal.setFont(new Font("System",Font.BOLD,16));
        amt_to_withdrawal.setBounds(460,220,600,35);
        atm2_icon.add(amt_to_withdrawal);

        enter_amt=new TextField();
        enter_amt.setFont(new Font("System",Font.BOLD,16));
        enter_amt.setForeground(Color.WHITE);
        enter_amt.setBackground(new Color(65,125,128));
        enter_amt.setBounds(460,260,320,35);
        atm2_icon.add(enter_amt);


        withdraw=new JButton("WITHDRAW");
        withdraw.setBounds(700,360,150,35);
        withdraw.setBackground(new Color(65,125,128));
        withdraw.setForeground(Color.WHITE);
        withdraw.addActionListener(this);
        atm2_icon.add(withdraw);

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


    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==withdraw) {
            try {
                int amt = Integer.parseInt(enter_amt.getText().trim());
                Date date = new Date();

                if (enter_amt.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Please enter amount");
                } else {
                    Con conn = new Con();
                    ResultSet resultSet = conn.statement.executeQuery("select * from bank where pin='" + pin + "'");
                    int balance = 0;
                    while (resultSet.next()) {
                        if (resultSet.getString("type").equals("Deposit")) {
                            balance += Integer.parseInt(resultSet.getString("amount"));
                        } else {
                            balance -= Integer.parseInt(resultSet.getString("amount"));


                        }
                    }

                    if (balance <(amt)) {
                        JOptionPane.showMessageDialog(null, "Insufficient Balance");
                        return;
                    }

                    conn.statement.executeUpdate("insert into bank values ('" + pin + "','" + date + "','Withdrawal','" + amt + "')");
                    JOptionPane.showMessageDialog(null, "Rs. " + amt + " Debited Successfully");
                    setVisible(false);
                    new main_Class(pin);

                }

            } catch (Exception ex) {
                ex.printStackTrace();
            }

        }else if (e.getSource()==cancel) {
            setVisible(false);
            new main_Class(pin);

        }
    }

    public static void main(String[] args) {
        new Withdrawal("");
    }
}