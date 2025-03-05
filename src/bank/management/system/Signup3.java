package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;


public class Signup3 extends JFrame implements ActionListener  {
    JLabel pageno,acntdetails,acnttype,cardnum,cardinstruction,cardenddigs,cardendinginstruction,pin,pininstruction,pinmodel,servicesreq,formno,getanddisplayFormnumber;
    JRadioButton savings,current,fixeddeposit,recurring;
    JCheckBox declaration,atmcard,internetbanking,mobilebanking,emailalerts,chequebook,estatement;
    JButton submit,cancel;




    String formno2;

    Signup3(String formno2){

        this.formno2=formno2;
        setLayout(null);
        ImageIcon bank_image_resource=new ImageIcon( ClassLoader.getSystemResource("icon/bank.png"));
        Image bank_image_instance=bank_image_resource.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon bank_image_icon=new ImageIcon(bank_image_instance);
        JLabel bank_icon=new JLabel(bank_image_icon);
        bank_icon.setBounds(150,5,100,100);
        add(bank_icon);

        pageno=new JLabel("Page 3");
        pageno.setFont(new Font("Raleway",Font.BOLD,22));
        pageno.setForeground(Color.BLACK);
        pageno.setBounds(400,5,100,100);
        add(pageno);

        acntdetails=new JLabel("Account Details");
        acntdetails.setFont(new Font("Raleway",Font.BOLD,22));
        acntdetails.setForeground(Color.BLACK);
        acntdetails.setBounds(360,35,300,100);
        add(acntdetails);

        acnttype=new JLabel("Account Type :");
        acnttype.setFont(new Font("Raleway",Font.BOLD,20));
        acnttype.setForeground(Color.BLACK);
        acnttype.setBounds(100,140,200,30);
        add(acnttype);


        savings=new JRadioButton("Savings Account ");
        savings.setFont(new Font("Raleway",Font.BOLD,18));
        savings.setBackground(new Color(215,252,252));
       savings.setForeground(Color.BLACK);
        savings.setBounds(100,180,200,30);
        add(savings);


        current=new JRadioButton("Current Account ");
        current.setFont(new Font("Raleway",Font.BOLD,18));
        current.setBackground(new Color(215,252,252));
        current.setForeground(Color.BLACK);
        current.setBounds(350,180,300,30);
        add(current);

        fixeddeposit=new JRadioButton("Fixed Deposit Account ");
        fixeddeposit.setFont(new Font("Raleway",Font.BOLD,18));
        fixeddeposit.setBackground(new Color(215,252,252));
        fixeddeposit.setForeground(Color.BLACK);
        fixeddeposit.setBounds(100,240,250,30);
        add(fixeddeposit);

        recurring=new JRadioButton("Recurring Account ");
        recurring.setFont(new Font("Raleway",Font.BOLD,18));
        recurring.setBackground(new Color(215,252,252));
        recurring.setForeground(Color.BLACK);
        recurring.setBounds(350,240,300,30);
        add(recurring);


        ButtonGroup bg=new ButtonGroup();
        bg.add(savings);
        bg.add(current);
        bg.add(fixeddeposit);
        bg.add(recurring);

        cardnum=new JLabel("Card Number:");
        cardnum.setFont(new Font("Raleway",Font.BOLD,20));
        cardnum.setForeground(Color.BLACK);
        cardnum.setBounds(100,300,150,30);
        add(cardnum);




        cardinstruction=new JLabel("(Your 16-digit Card Number)");
        cardinstruction.setFont(new Font("Raleway",Font.BOLD,10));
        cardinstruction.setForeground(Color.BLACK);
        cardinstruction.setBounds(100,330,150,10);
        add(cardinstruction);


        cardenddigs=new JLabel("XXXX-XXXX-XXXX-4841");
        cardenddigs.setFont(new Font("Raleway",Font.BOLD,18));
        cardenddigs.setForeground(Color.BLACK);
        cardenddigs.setBounds(300,300,250,30);
        add(cardenddigs);

        cardendinginstruction=new JLabel("(It Would appear on ATM Card/Cheque Book And Statements)");
        cardendinginstruction.setFont(new Font("Raleway",Font.BOLD,10));
        cardendinginstruction.setForeground(Color.BLACK);
        cardendinginstruction.setBounds(300,330,350,10);
        add(cardendinginstruction);

        pin=new JLabel("PIN:");
        pin.setFont(new Font("Raleway",Font.BOLD,20));
        pin.setForeground(Color.BLACK);
        pin.setBounds(100,380,150,30);
        add(pin);

        pininstruction=new JLabel("(4-digit Password)");
        pininstruction.setFont(new Font("Raleway",Font.BOLD,10));
        pininstruction.setForeground(Color.BLACK);
        pininstruction.setBounds(100,410,150,11);
        add(pininstruction);

        pinmodel=new JLabel("XXXX");
        pinmodel.setFont(new Font("Raleway",Font.BOLD,18));
        pinmodel.setForeground(Color.BLACK);
        pinmodel.setBounds(300,380,250,30);
        add(pinmodel);


        servicesreq=new JLabel("Services Required:");
        servicesreq.setFont(new Font("Raleway",Font.BOLD,20));
        servicesreq.setForeground(Color.BLACK);
        servicesreq.setBounds(100,410,300,100);
        add(servicesreq);

        atmcard =new JCheckBox("ATM CARD");
        atmcard.setFont(new Font("Raleway",Font.BOLD,18));
        atmcard.setBackground(new Color(215,252,252));
        atmcard.setForeground(Color.BLACK);
        atmcard.setBounds(100,470,200,80);
        add(atmcard);

        internetbanking =new JCheckBox("Internet Banking");
        internetbanking.setFont(new Font("Raleway",Font.BOLD,18));
        internetbanking.setBackground(new Color(215,252,252));
        internetbanking.setForeground(Color.BLACK);
        internetbanking.setBounds(300,470,200,80);
        add(internetbanking);


        mobilebanking =new JCheckBox("Mobile Banking");
        mobilebanking.setFont(new Font("Raleway",Font.BOLD,18));
        mobilebanking.setBackground(new Color(215,252,252));
        mobilebanking.setForeground(Color.BLACK);
        mobilebanking.setBounds(100,530,200,80);
        add(mobilebanking);

        emailalerts =new JCheckBox("Email Alerts");
        emailalerts.setFont(new Font("Raleway",Font.BOLD,18));
        emailalerts.setBackground(new Color(215,252,252));
        emailalerts.setForeground(Color.BLACK);
        emailalerts.setBounds(300,530,200,80);
        add(emailalerts);


        chequebook =new JCheckBox("Cheque Book");
        chequebook.setFont(new Font("Raleway",Font.BOLD,18));
        chequebook.setBackground(new Color(215,252,252));
        chequebook.setForeground(Color.BLACK);
        chequebook.setBounds(100,590,200,80);
        add(chequebook);

        estatement =new JCheckBox("E-statement");
        estatement.setFont(new Font("Raleway",Font.BOLD,18));
        estatement.setBackground(new Color(215,252,252));
        estatement.setForeground(Color.BLACK);
        estatement.setBounds(300,590,200,80);
        add(estatement);

        declaration=new JCheckBox("I here by decleares that the above entered details correct to the best of my knlowledge.");
        declaration.setFont(new Font("Raleway",Font.BOLD,12));
        declaration.setBackground(new Color(215,252,252));
        declaration.setForeground(Color.BLACK);
        declaration.setBounds(120,650,550,50);
        add(declaration);

        formno=new JLabel("Form No:");
        formno.setFont(new Font("Raleway",Font.BOLD,18));
        formno.setBounds(650,5,100,80);
        add(formno);


         getanddisplayFormnumber = new JLabel(formno2);
        getanddisplayFormnumber.setFont(new Font("Raleway", Font.BOLD,18));
        getanddisplayFormnumber.setBounds(735,5,80,80);
        add(getanddisplayFormnumber);

        submit=new JButton("Submit");
        submit.setFont(new Font("Raleway",Font.BOLD,12));
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setBounds(200,700,100,20);
        submit.addActionListener(this);
        add(submit);

        cancel=new JButton("Cancel");
        cancel.setFont(new Font("Raleway",Font.BOLD,12));
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setBounds(500,700,100,20);
        cancel.addActionListener(this);
        add(cancel);


































        setSize(850,800);
        setLocation(360,40);
        setVisible(true);
        getContentPane().setBackground(new Color(215,252,252));








    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Determine account type
        String acnttype = null;
        if (savings.isSelected()) {
            acnttype = "Savings Account";
        } else if (current.isSelected()) {
            acnttype = "Current Account";
        } else if (fixeddeposit.isSelected()) {
            acnttype = "Fixed Deposit Account";
        } else if (recurring.isSelected()) {
            acnttype = "Recurring Account";
        }

        // Generate card number and PIN
        Random ran = new Random();
        long first7 = (ran.nextLong() % 90000000L) + 1409963000000000L;
        String cardno = "" + Math.abs(first7);

        long first3 = (ran.nextLong() % 9000L) + 1000L;
        String pin = "" + Math.abs(first3);

        // Determine services selected
        String services_str = "";
        if (atmcard.isSelected()) {
            services_str += "ATM Card, ";
        }
        if (internetbanking.isSelected()) {
            services_str += "Internet Banking, ";
        }
        if (mobilebanking.isSelected()) {
            services_str += "Mobile Banking, ";
        }
        if (emailalerts.isSelected()) {
            services_str += "Email Alerts, ";
        }
        if (chequebook.isSelected()) {
            services_str += "Cheque Book, ";
        }
        if (estatement.isSelected()) {
            services_str += "E-statement, ";
        }

        // Trim the trailing comma and space
        if (services_str.endsWith(", ")) {
            services_str = services_str.substring(0, services_str.length() - 2);
        }

        // Action for Submit Button
        try {
            if (e.getSource() == submit) {
                if (acnttype == null) {
                    JOptionPane.showMessageDialog(null, "Please select an account type");
                } else if (services_str.equals("")) {
                    JOptionPane.showMessageDialog(null, "Please select at least one service");
                } else {
                    // Assuming 'formno' is defined and valid
                    Con c1 = new Con();
                    String signup3 = "insert into signupthree values('" + formno2 + "','" + acnttype + "','" + cardno + "','" + pin + "','" + services_str + "')";
                    String log = "insert into login values('" + formno2 + "','" + cardno + "','" + pin + "')";

                    c1.statement.executeUpdate(signup3);
                    c1.statement.executeUpdate(log);
                    new Deposit(pin);
                    JOptionPane.showMessageDialog(null, "Card Number : " + cardno + " Pin : " + pin);
                    setVisible(false); // Close the window after successful submission
                }
            } else if (e.getSource() == cancel) {
                System.exit(0);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }


    public static void main(String[] args) {
        new Signup3("");

    }
}
