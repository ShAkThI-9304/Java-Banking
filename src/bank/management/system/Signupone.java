package bank.management.system;
import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.awt.event.*;

public class Signupone extends JFrame implements ActionListener {
    JLabel formno,pageno,personaldetails,name,fathername,Dob,gender,email,marrital_status,address,city,pincode,state;
    JTextField enter_name,enter_Fathername,enter_email,enter_marrital_status,enter_address,enter_city,enter_pincode,enter_state;
    JDateChooser datechooser;
    JRadioButton malerb,femalerb,married,unmarried,other;
    JButton next;


    Random rand = new Random();
    long f4=(rand.nextLong()%9000L)+1000L;
    String first=" "+Math.abs(f4);


    Signupone() {


        super("Application Form");

        setLayout(null);





        ImageIcon bank_image_resource=new ImageIcon( ClassLoader.getSystemResource("icon/bank.png"));
        Image bank_image_instance=bank_image_resource.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon bank_image_icon=new ImageIcon(bank_image_instance);
        JLabel bank_icon=new JLabel(bank_image_icon);
        bank_icon.setBounds(25,10,100,100);
        add(bank_icon);

        formno=new JLabel("APPLICATION FORM NO:"+first);
        formno.setBounds(160,20,600,40);
        formno.setFont(new Font("Raleway",Font.BOLD,38));
        add(formno);

        pageno=new JLabel("Page 1");
        pageno.setFont(new Font("Raleway",Font.BOLD,22));
        pageno.setBounds(330,70,600,30);
        add(pageno);

        personaldetails=new JLabel("Personal Details");
        personaldetails.setFont(new Font("Raleway",Font.BOLD,22));
        personaldetails.setBounds(290,100,600,30);
        add(personaldetails);

        name=new JLabel("Name :");
        name.setFont(new Font("Raleway",Font.BOLD,22));
        name.setBounds(100,190,100,30);
        add(name);

        enter_name=new JTextField();
        enter_name.setFont(new Font("Raleway",Font.BOLD,14));
        enter_name.setBounds(300,190,400,30);
        add(enter_name);


        fathername=new JLabel("Father's Name :");
        fathername.setFont(new Font("Raleway",Font.BOLD,22));
        fathername.setBounds(100,230,300,30);
        add(fathername);

        enter_Fathername=new JTextField();
        enter_Fathername.setFont(new Font("Raleway",Font.BOLD,14));
        enter_Fathername.setBounds(300,230,400,30);
        add(enter_Fathername);

        Dob=new JLabel("Date Of Birth :");
        Dob.setFont(new Font("Raleway",Font.BOLD,22));
        Dob.setBounds(100,340,200,30);
        add(Dob);

        datechooser=new JDateChooser();
        datechooser.setForeground(new Color(105,105,105));
        datechooser.setBounds(300,340,400,30);
        add(datechooser);

        gender=new JLabel("Gender :");
        gender.setFont(new Font("Raleway",Font.BOLD,22));
        gender.setBounds(100,290,200,30);
        add(gender);

        malerb =new JRadioButton("Male ");
        malerb.setFont(new Font("Raleway",Font.BOLD,14));
        malerb.setBackground(new Color(222,255,228));
        malerb.setBounds(300,290,60,30);
        add(malerb);


        femalerb =new JRadioButton("Female ");
        femalerb.setFont(new Font("Raleway",Font.BOLD,14));
        femalerb.setBackground(new Color(222,255,228));
        femalerb.setBounds(450,290,90,30);
        add(femalerb);

        ButtonGroup bg=new ButtonGroup();
        bg.add(malerb);
        bg.add(femalerb);

        email=new JLabel("Email :");
        email.setFont(new Font("Raleway",Font.BOLD,22));
        email.setBounds(100,390,200,30);
        add(email);

        enter_email=new JTextField();
        enter_email.setFont(new Font("Raleway",Font.BOLD,14));
        enter_email.setBounds(300,390,400,30);
        add(enter_email);

        marrital_status=new JLabel("Marrital Status :");
        marrital_status.setFont(new Font("Raleway",Font.BOLD,22));
        marrital_status.setBounds(100,430,200,30);
        add(marrital_status);

        married=new JRadioButton("Married ");
        married.setFont(new Font("Raleway",Font.BOLD,14));
        married.setBackground(new Color(222,255,228));
        married.setBounds(300,430,90,30);
        add(married);

        unmarried=new JRadioButton("Unmarried ");
        unmarried.setFont(new Font("Raleway",Font.BOLD,14));
        unmarried.setBackground(new Color(222,255,228));
        unmarried.setBounds(400,430,120,30);
        add(unmarried);

        other=new JRadioButton("Other ");
        other.setFont(new Font("Raleway",Font.BOLD,14));
        other.setBackground(new Color(222,255,228));
        other.setBounds(500,430,120,30);
        add(other);


        ButtonGroup bg2=new ButtonGroup();
        bg2.add(married);
        bg2.add(unmarried);
        bg2.add(other);


        address=new JLabel("Address :");
        address.setFont(new Font("Raleway",Font.BOLD,22));
        address.setBounds(100,470,200,30);
        add(address);

        enter_address=new JTextField();
        enter_address.setFont(new Font("Raleway",Font.BOLD,14));
        enter_address.setBounds(300,470,400,30);
        add(enter_address);

        city=new JLabel("City :");
        city.setFont(new Font("Raleway",Font.BOLD,22));
        city.setBounds(100,520,200,30);
        add(city);

        enter_city=new JTextField();
        enter_city.setFont(new Font("Raleway",Font.BOLD,14));
        enter_city.setBounds(300,520,400,30);
        add(enter_city);

        pincode=new JLabel("Pincode :");
        pincode.setFont(new Font("Raleway",Font.BOLD,22));
        pincode.setBounds(100,570,200,30);
        add(pincode);

        enter_pincode=new JTextField();
        enter_pincode.setFont(new Font("Raleway",Font.BOLD,14));
        enter_pincode.setBounds(300,570,400,30);
        add(enter_pincode);


        state=new JLabel("State :");
        state.setFont(new Font("Raleway",Font.BOLD,22));
        state.setBounds(100,620,200,30);
        add(state);

        enter_state=new JTextField();
        enter_state.setFont(new Font("Raleway",Font.BOLD,14));
        enter_state.setBounds(300,620,400,30);
        add(enter_state);

        next=new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620,710,80,30);
        next.addActionListener(this);
        add(next);










        setSize(850,800);
        setLocation(360,40);
        setVisible(true);
        getContentPane().setBackground(new Color(222,255,228));






    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String formno=first;
        String name=enter_name.getText();
        String fathername=enter_Fathername.getText();
        String Dob=((JTextField)datechooser.getDateEditor().getUiComponent()).getText();

        String gender=null;
        if(malerb.isSelected()){
            gender="Male";
        }else{
            gender="Female";
        }
        String email=enter_email.getText();

        //String email1=enter_email.getText();
        String marritalstatus=null;
        if(married.isSelected()){
            marritalstatus="Married";
        }else if(unmarried.isSelected()){
            marritalstatus="Unmarried";
        }else if(other.isSelected()){
            marritalstatus="Other";

        }

        String address=enter_address.getText();
        String city=enter_city.getText();
        String pincode=enter_pincode.getText();
        String state=enter_state.getText();



        try{
            if((enter_name.getText().equals(""))||(enter_Fathername.getText().equals(""))||(enter_email.getText().equals(""))||(enter_address.getText().equals(""))||(enter_city.getText().equals(""))||(enter_pincode.getText().equals(""))||(enter_state.getText().equals(""))){
                JOptionPane.showMessageDialog(null,"Please fill all the fields");

            }
            else if(Dob.equals("")){
                JOptionPane.showMessageDialog(null,"Please enter the date of birth");
            }
            else if(gender==null){
                JOptionPane.showMessageDialog(null,"Please select gender");
            }
            else if(marritalstatus==null){
                JOptionPane.showMessageDialog(null,"Please select marrital status");
            }

            else{
                Con conn=new Con();
                String q="insert into signup values('"+formno+"','"+name+"','"+fathername+"','"+Dob+"','"+gender+"','"+email+"','"+marritalstatus+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
                conn.statement.executeUpdate(q);
                new Signup2(formno);
                setVisible(false);
            }

        }
        catch (Exception E){
            E.printStackTrace();
        }


    }


    public static void main(String[] args) {
        new Signupone();


    }

}
