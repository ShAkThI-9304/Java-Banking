package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pin extends JFrame implements ActionListener {


    JLabel changepinlabel,newpinlabel,reenternewpinlabel;

    JPasswordField  enternewpin,reenternewpin;

    JButton change,back;
    String pin;

    Pin(String pin){
        this.pin = pin;

        ImageIcon atm2_image_resource=new ImageIcon( ClassLoader.getSystemResource("icon/atm2.png"));
        Image atm2_image_instance=atm2_image_resource.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon atm2_image_icon=new ImageIcon(atm2_image_instance);
        JLabel atm2_icon=new JLabel(atm2_image_icon);
        atm2_icon.setBounds(0,0,1550,830);
        add(atm2_icon);

        changepinlabel=new JLabel("CHANGE YOUR PIN");
        changepinlabel.setForeground(Color.WHITE);
        changepinlabel.setFont(new Font("system",Font.BOLD,20));
        changepinlabel.setBounds(430,180,400,35);
        atm2_icon.add(changepinlabel);


        newpinlabel=new JLabel("New Pin");
        newpinlabel.setForeground(Color.WHITE);
        newpinlabel.setFont(new Font("system",Font.BOLD,16));
        newpinlabel.setBounds(430,220,150,35);
        atm2_icon.add(newpinlabel);


        enternewpin=new JPasswordField(15);
        enternewpin.setFont(new Font("System",Font.BOLD,22));
        enternewpin.setForeground(Color.WHITE);
        enternewpin.setBackground(new Color(65,125,128));
        enternewpin.setBounds(600,220,180,25);
        atm2_icon.add(enternewpin);


        reenternewpinlabel=new JLabel("Re-Enter New Pin");
        reenternewpinlabel.setForeground(Color.WHITE);
        reenternewpinlabel.setFont(new Font("system",Font.BOLD,16));
        reenternewpinlabel.setBounds(430,252,400,35);
        atm2_icon.add(reenternewpinlabel);


        reenternewpin=new JPasswordField(15);
        reenternewpin.setFont(new Font("System",Font.BOLD,22));
        reenternewpin.setForeground(Color.WHITE);
        reenternewpin.setBackground(new Color(65,125,128));
        reenternewpin.setBounds(600,255,180,25);
        atm2_icon.add(reenternewpin);


        change=new JButton("CHANGE");
        change.setBounds(700,406,150,35);
        change.setBackground(new Color(65,125,128));
        change.setForeground(Color.WHITE);
        change.addActionListener(this);
        atm2_icon.add(change);

        back=new JButton("BACK");
        back.setBounds(410,406,150,35);
        back.setBackground(new Color(65,125,128));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        atm2_icon.add(back);


        setSize(1550,1080);
        setLayout(null);
        setLocation(0,0);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            String pin1=enternewpin.getText();
            String pin2=reenternewpin.getText();

            if(!pin1.equals(pin2)){
                JOptionPane.showMessageDialog(null,"Entered PIN NOT MATCH");
                return;
            }

            if(e.getSource()==change){
                if(enternewpin.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Enter New PIN");
                    return;
                }
                if(reenternewpin.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Re-Enter New PIN");
                    return;
                }


                Con conn=new Con();
                String q1="update bank set pin = '"+pin1+"' where pin = '"+pin+"'";
                String q2="update login set pin = '"+pin1+"' where pin = '"+pin+"'";
                String q3="update signupthree set pin = '"+pin1+"' where pin = '"+pin+"'";

                conn.statement.executeUpdate(q1);
                conn.statement.executeUpdate(q2);
                conn.statement.executeUpdate(q3);

                JOptionPane.showMessageDialog(null,"PIN CHANGED SUCCESSFULLY");
                setVisible(false);
                new main_Class(pin);

            }else if(e.getSource()==back){
                setVisible(false);
                new main_Class(pin);
            }

        }catch(Exception ex){

        }

    }



    public static void main(String[] args) {
        new Pin(" ");
    }
}
