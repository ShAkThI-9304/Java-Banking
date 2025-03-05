package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener {

    JButton b500,b1000,b2000,b5000,b10000,b15000,back;
String pin;
    FastCash(String pin) {
        this.pin = pin;

        ImageIcon atm2_image_resource=new ImageIcon( ClassLoader.getSystemResource("icon/atm2.png"));
        Image atm2_image_instance=atm2_image_resource.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon atm2_image_icon=new ImageIcon(atm2_image_instance);
        JLabel atm2_icon=new JLabel(atm2_image_icon);
        atm2_icon.setBounds(0,0,1550,830);
        add(atm2_icon);

        JLabel select_transaction_label=new JLabel("SELECT WITHDRAWAL AMOUNT");
        select_transaction_label.setFont(new Font("System",Font.BOLD,25));
        select_transaction_label.setBounds(435,180,700,35);
        select_transaction_label.setForeground(Color.WHITE);
        atm2_icon.add(select_transaction_label);


        b500=new JButton("RS. 500");
        //deposit.setFont(new Font("System",Font.BOLD,28));
        b500.setBounds(410,274,150,35);
        b500.setForeground(Color.WHITE);
        b500.setBackground(new Color(65,125,128));
       b500.addActionListener(this);
        atm2_icon.add(b500);

        b1000=new JButton("RS. 1000");
        b1000.setBounds(700,274,155,35);
        b1000.setForeground(Color.WHITE);
        b1000.setBackground(new Color(65,125,128));
       b1000.addActionListener(this);
        atm2_icon.add(b1000);

        b2000=new JButton("RS.2000");
        b2000.setBounds(410,318,150,35);
        b2000.setForeground(Color.WHITE);
        b2000.setBackground(new Color(65,125,128));
       b2000.addActionListener(this);
        atm2_icon.add(b2000);

        b5000=new JButton("RS. 5000");
        b5000.setBounds(700,318,155,35);
        b5000.setForeground(Color.WHITE);
        b5000.setBackground(new Color(65,125,128));
        b5000.addActionListener(this);
        atm2_icon.add(b5000);



        b10000=new JButton("RS. 10000");
        b10000.setBounds(410,362,150,35);
        b10000.setForeground(Color.WHITE);
        b10000.setBackground(new Color(65,125,128));
        b10000.addActionListener(this);
        atm2_icon.add(b10000);


        b15000=new JButton("RS. 15000");
        b15000.setBounds(700,362,155,35);
        b15000.setForeground(Color.WHITE);
        b15000.setBackground(new Color(65,125,128));
       b15000.addActionListener(this);
        atm2_icon.add(b15000);

        back=new JButton("BACK");
        back.setBounds(700,406,155,35);
        back.setForeground(Color.WHITE);
        back.setBackground(new Color(65,125,128));
        back.addActionListener(this);
        atm2_icon.add(back);



        setLayout(null);
        setVisible(true);
        setBounds(0,0,1550,1080);

    }

    @Override
    public void actionPerformed(ActionEvent e){

        if(e.getSource()==back){
            setVisible(false);
            new main_Class(pin);
        }else{
            String amount=((JButton)e.getSource()).getText().substring(4);
            Con conn=new Con();
            Date date=new Date();
            try{

                ResultSet resultSet=conn.statement.executeQuery("select * from bank where pin='"+pin+"'");
                int balance=0;
                while(resultSet.next()){
                    if(resultSet.getString("type").equals("Deposit")){
                        balance +=Integer.parseInt(resultSet.getString("amount"));
                    }else{
                        balance -=Integer.parseInt(resultSet.getString("amount"));
                    }

                }String num="17";

                if(e.getSource()!=back && balance<Integer.parseInt(amount)){
                    JOptionPane.showMessageDialog(null,"Insufficient Balance");
                    return;
                }

                conn.statement.executeUpdate("insert into bank values('"+pin+"','"+date+"','Withdrawal','"+amount+"')");
                JOptionPane.showMessageDialog(null,"RS."+amount+"Debited Successfully");

            }catch(Exception ex){
                ex.printStackTrace();
            }
            setVisible(false);
            new main_Class(pin);
        }

    }
    public static void main(String[] args) {

        new FastCash("");

    }
}
