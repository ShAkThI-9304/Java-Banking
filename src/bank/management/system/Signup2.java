package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class Signup2 extends JFrame implements ActionListener
{

    String formno;
    JLabel pageno,additionaldetails,religion,category,income,education,occupation,pannum,aadharnum,seniorcitizen,existingacnt,formnumber;
    JRadioButton yes,no,existacnt_yes,existacnt_no;
    JButton next;

    JTextField enter_Pannum,enter_Aadhar;
    JComboBox religioncombo,categorycombo,incomecombo,educationcombo,occupationcombo;
    Signup2(String formno){


        super("Application form");
        this.formno=formno;

        ImageIcon bank_image_resource=new ImageIcon( ClassLoader.getSystemResource("icon/bank.png"));
        Image bank_image_instance=bank_image_resource.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon bank_image_icon=new ImageIcon(bank_image_instance);
        JLabel bank_icon=new JLabel(bank_image_icon);
        bank_icon.setBounds(150,5,100,100);
        add(bank_icon);

      //  this.formno=first;



        pageno=new JLabel("Page 2");
        pageno.setFont(new Font("Raleway",Font.BOLD,22));
        pageno.setBounds(380,30,600,30);
        add(pageno);

        additionaldetails=new JLabel("Additional details");
        additionaldetails.setFont(new Font("Raleway",Font.BOLD,22));
        additionaldetails.setBounds(330,60,600,30);
        add(additionaldetails);

        religion=new JLabel("Religion:");
        religion.setFont(new Font("Raleway",Font.BOLD,18));
        religion.setBounds(100,120,100,30);
        add(religion);

        String religion[]={"Hindu","Muslim","Christian","Others"};

        religioncombo=new JComboBox(religion);
        religioncombo.setFont(new Font("Raleway",Font.BOLD,18));
        religioncombo.setBounds(350,120,320,30);
        add(religioncombo);


        category=new JLabel("Category:");
        category.setFont(new Font("Raleway",Font.BOLD,18));
        category.setBounds(100,170,100,30);
        add(category);

        String Category[]={"General","OBC","SC","ST","OTHER"};
        categorycombo=new JComboBox(Category);
        categorycombo.setFont(new Font("Raleway",Font.BOLD,18));
        categorycombo.setBounds(350,170,320,30);
        add(categorycombo);


        income=new JLabel("Income:");
        income.setFont(new Font("Raleway",Font.BOLD,18));
        income.setBounds(100,220,100,30);
        add(income);

        String income [] = {"Null","<1,50,000","<2,50,000", "5,00,000", "Upto 10,00,000","Above 10,00,000"};
        incomecombo=new JComboBox(income);
        incomecombo.setFont(new Font("Raleway",Font.BOLD,18));
        incomecombo.setBounds(350,220,320,30);
        add(incomecombo);

        education=new JLabel("Education:");
        education.setFont(new Font("Raleway",Font.BOLD,18));
        education.setBounds(100,270,100,30);
        add(education);

        String[] edu={"Non-Graduate","Graduate","Under-Graduate","Post-Graduate","Doctorate","Others"};
        educationcombo=new JComboBox(edu);
        educationcombo.setFont(new Font("Raleway",Font.BOLD,18));
        educationcombo.setBounds(350,270,320,30);
        add(educationcombo);


        occupation=new JLabel("Occupation:");
        occupation.setFont(new Font("Raleway",Font.BOLD,18));
        occupation.setBounds(100,340,150,30);
        add(occupation);

        String occup[]={"Salaried","Self-employed","Business","Student","Retired","Others"};
        occupationcombo=new JComboBox(occup);
        occupationcombo.setFont(new Font("Raleway",Font.BOLD,18));
        occupationcombo.setBounds(350,340,320,30);
        add(occupationcombo);

        pannum=new JLabel("PAN Number:");
        pannum.setFont(new Font("Raleway",Font.BOLD,18));
        pannum.setBounds(100,390,150,30);
        add(pannum);

        enter_Pannum=new JTextField();
        enter_Pannum.setFont(new Font("Raleway",Font.BOLD,18));
        enter_Pannum.setBounds(350,390,320,30);
        add(enter_Pannum);




        aadharnum=new JLabel("Aadhar Number:");
        aadharnum.setFont(new Font("Raleway",Font.BOLD,18));
        aadharnum.setBounds(100,440,180,30);
        add(aadharnum);

        enter_Aadhar=new JTextField();
        enter_Aadhar.setFont(new Font("Raleway",Font.BOLD,18));
        enter_Aadhar.setBounds(350,440,320,30);
        add(enter_Aadhar);

        seniorcitizen=new JLabel("Senior Citizen:");
        seniorcitizen.setFont(new Font("Raleway",Font.BOLD,18));
        seniorcitizen.setBounds(100,490,180,30);
        add(seniorcitizen);

        yes=new JRadioButton("Yes");
        yes.setFont(new Font("Raleway",Font.BOLD,18));
        yes.setBackground(new Color(252,208,76));
        yes.setBounds(350,490,100,30);
        add(yes);

        no=new JRadioButton("No");
        no.setFont(new Font("Raleway",Font.BOLD,18));
        no.setBackground(new Color(252,208,76));
        no.setBounds(460,490,100,30);
        add(no);

        ButtonGroup bg=new ButtonGroup();
        bg.add(yes);
        bg.add(no);


        existingacnt=new JLabel("Existing Account:");
        existingacnt.setFont(new Font("Raleway",Font.BOLD,18));
        //existingacnt.setBackground(new Color(252,208,76));
        existingacnt.setBounds(100,540,180,30);
        add(existingacnt);


        existacnt_yes=new JRadioButton("Yes");
        existacnt_yes.setFont(new Font("Raleway",Font.BOLD,18));
        existacnt_yes.setBackground(new Color(252,208,76));
        existacnt_yes.setBounds(350,540,100,30);
        add(existacnt_yes);

        existacnt_no=new JRadioButton("No");
        existacnt_no.setFont(new Font("Raleway",Font.BOLD,18));
        existacnt_no.setBackground(new Color(252,208,76));
        existacnt_no.setBounds(460,540,100,30);
        add(existacnt_no);

        ButtonGroup bg2=new ButtonGroup();
        bg2.add(existacnt_yes);
        bg2.add(existacnt_no);

        formnumber=new JLabel("Form No:");
        formnumber.setFont(new Font("Raleway",Font.BOLD,18));
        formnumber.setBounds(650,10,100,30);
        add(formnumber);


        JLabel getanddisplayFormnumber = new JLabel(formno);
        getanddisplayFormnumber.setFont(new Font("Raleway", Font.BOLD,18));
        getanddisplayFormnumber.setBounds(730,10,100,30);
        add(getanddisplayFormnumber);


        next=new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground( Color.WHITE );
        next.setBounds(570,640,100,30);
        next.addActionListener(this );
        add(next);































        setLayout(null);
        setSize(850,800);
        setLocation(450,80);
        getContentPane().setBackground(new Color(252,208,76));


        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String religion_str=(String)religioncombo.getSelectedItem();
        String category_str=(String)categorycombo.getSelectedItem();
        String income_str=(String)incomecombo.getSelectedItem();
        String education_str=(String)educationcombo.getSelectedItem();
        String occupation_str=(String)occupationcombo.getSelectedItem();
        String pan_str=enter_Pannum.getText();
        String aadhar_str=enter_Aadhar.getText();
        String senior_citizen_str=null;
        if(yes.isSelected()){
            senior_citizen_str="Yes";
        }else{
            senior_citizen_str="No";
        }
        String existingacnt_str=null;
        if(existacnt_yes.isSelected()){
            existingacnt_str="Yes";
        }else {
            existingacnt_str="No";
        }
        try{
            if(enter_Pannum.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Please enter a Pan number");
            }
            else if(enter_Aadhar.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Please enter a Aadhar number");
            }else if (!yes.isSelected() && !no.isSelected()) { // Validation for Senior Citizen
                JOptionPane.showMessageDialog(null, "Please select if you are a Senior Citizen");
            } else if (!existacnt_yes.isSelected() && !existacnt_no.isSelected()) { // Validation for Existing Account
                JOptionPane.showMessageDialog(null, "Please select if you have an Existing Account");}

            else{
                Con conn=new Con();
                String q="insert into signuptwo values('"+formno+"','"+religion_str+"','"+category_str+"','"+income_str+"','"+education_str+"','"+occupation_str+"','"+pan_str+"','"+aadhar_str+"','"+senior_citizen_str+"','"+existingacnt_str+"')";
                conn.statement.executeUpdate(q);
                new Signup3(formno);
                setVisible(false);


            }


        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }

    public static void  main(String[] args){
        Signup2 signup2 = new Signup2("");

    }





}
