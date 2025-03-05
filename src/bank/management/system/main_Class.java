package bank.management.system;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main_Class extends JFrame implements ActionListener {
    JButton deposit,cashwithdraw,fastcash,ministatement,pinchange,balance,exit;
    String pin;

    main_Class(String pin) {
        this.pin = pin;



        ImageIcon atm2_image_resource=new ImageIcon( ClassLoader.getSystemResource("icon/atm2.png"));
        Image atm2_image_instance=atm2_image_resource.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon atm2_image_icon=new ImageIcon(atm2_image_instance);
        JLabel atm2_icon=new JLabel(atm2_image_icon);
        atm2_icon.setBounds(0,0,1550,830);
        add(atm2_icon);

        JLabel select_transaction_label=new JLabel("Pleas Select Your Transaction");
        select_transaction_label.setFont(new Font("System",Font.BOLD,28));
        select_transaction_label.setBounds(430,180,700,35);
        select_transaction_label.setForeground(Color.WHITE);
        atm2_icon.add(select_transaction_label);


        deposit=new JButton("DEPOSIT");
        //deposit.setFont(new Font("System",Font.BOLD,28));
        deposit.setBounds(410,274,150,35);
        deposit.setForeground(Color.WHITE);
        deposit.setBackground(new Color(65,125,128));
        deposit.addActionListener(this);
        atm2_icon.add(deposit);

        cashwithdraw=new JButton("CASH WITHDRAWAL");
        cashwithdraw.setBounds(700,274,155,35);
        cashwithdraw.setForeground(Color.WHITE);
        cashwithdraw.setBackground(new Color(65,125,128));
        cashwithdraw.addActionListener(this);
        atm2_icon.add(cashwithdraw);

        fastcash=new JButton("FAST CASH");
        fastcash.setBounds(410,318,150,35);
        fastcash.setForeground(Color.WHITE);
        fastcash.setBackground(new Color(65,125,128));
        fastcash.addActionListener(this);
        atm2_icon.add(fastcash);

        ministatement=new JButton("MINI STATEMENT");
        ministatement.setBounds(700,318,155,35);
        ministatement.setForeground(Color.WHITE);
        ministatement.setBackground(new Color(65,125,128));
        ministatement.addActionListener(this);
        atm2_icon.add(ministatement);



        pinchange=new JButton("PIN CHANGE");
        pinchange.setBounds(410,362,150,35);
        pinchange.setForeground(Color.WHITE);
        pinchange.setBackground(new Color(65,125,128));
        pinchange.addActionListener(this);
        atm2_icon.add(pinchange);


        balance=new JButton("BALANCE ENQUIRY");
        balance.setBounds(700,362,155,35);
        balance.setForeground(Color.WHITE);
        balance.setBackground(new Color(65,125,128));
        balance.addActionListener(this);
        atm2_icon.add(balance);

        exit=new JButton("EXIT");
        exit.setBounds(700,406,155,35);
        exit.setForeground(Color.WHITE);
        exit.setBackground(new Color(65,125,128));
        exit.addActionListener(this);
        atm2_icon.add(exit);





        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e){

        if(e.getSource()==deposit){
            new Deposit(pin);
            setVisible(false);
        }
        else if(e.getSource()==exit){
            System.exit(0);
        }
        else if(e.getSource()==cashwithdraw){
            new Withdrawal(pin);
            setVisible(false);
        }else if(e.getSource()==balance){
            new BalanceEnquiry(pin);
            setVisible(false);

        }else if(e.getSource()==fastcash){
            setVisible(false);
            new FastCash(pin);
        }else if(e.getSource()==pinchange){
            setVisible(false);
            new Pin(pin);
        }


    }

    public static void main(String[] args) {
        new main_Class("");
    }
}
