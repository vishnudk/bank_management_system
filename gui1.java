import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class dictionary
{
    private String user_name,password;
    public void setUser_name(String user_name)
    {
        this.user_name=user_name;
    }
    public void setPassword(String password)
    {
        this.password=password;
    }
    public String getUser_name()
    {
        return user_name;
    }
    public String getPassword()
    {
        return password;
    }
    dictionary next;
    /*@Override
    public int hashCode() {
        return super.hashCode();
    }*/
}
public class gui1 implements  ActionListener
{
    static String bank_name_is="BANK NAME";
    static dictionary head=null;
    static JLabel bank_name=new JLabel(bank_name_is);
    static JButton create_new=new JButton("sign up");
    static JButton login_ok=new JButton("sign in");
    static JLabel login_user_name=new JLabel("user name");
    static JLabel login_password=new JLabel("password");
    static JTextField login_user_name_text_feild=new JTextField();
    static JTextField login_password_text_feild=new JTextField();
    static ImageIcon img = new ImageIcon("images.jpg");
    static String s=bank_name_is+" sign in page";
    static JFrame jf_intro=new JFrame(s);
    static JFrame jf=new JFrame("Registration Form");
    static String cb1[]= {" ","M","F","other"};
    static JTextField t_f_name=new JTextField(8);
    static JTextField t_l_name=new JTextField(0);
    static JTextField t_p_number=new JTextField(8);
    static JTextField t_dob=new JTextField(8);
    static JTextField t_father_name=new JTextField(8);
    static JTextField t_moters_name=new JTextField(8);
    static JTextField t_house_name=new JTextField(8);
    static JComboBox j_sex=new JComboBox(cb1);
    static JLabel registration_form_label=new JLabel("Registration Form");
    public static void main(String[]args)
    {
        login_page();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String response=e.getActionCommand();
        if(response=="ok")
        {
            System.out.println("ok is being pressed");
            String sex= String.valueOf(j_sex.getItemAt(j_sex.getSelectedIndex()));
          //  customer c1=new customer(t_father_name.getText(),t_f_name.getText(),t_l_name.getText(),t_moters_name.getText(),t_house_name.getText(),sex,Integer.valueOf(t_dob.getText()),Integer.valueOf(t_p_number.getText()));
        }
        else if(response=="reset")
        {
            System.out.println("reset is being pressed");
            t_f_name.setText("");
            t_dob.setText("");
            t_father_name.setText("");
            t_house_name.setText("");
            t_l_name.setText("");
            t_moters_name.setText("");
            t_p_number.setText("");
            j_sex.setSelectedItem(" ");
            //jf.dispose();
           // login_page();
        }
        else if(response=="sign up")
        {
            jf_intro.dispose();
            registration_form();
        }
        else if (response=="sign in") {
            check_pass_word();
        }
    }

    public static void login_page()
    {
        String sd[]={"k"};
        JPanel p1=new JPanel();
        //String s2[]={"d","s"};
        //JComboBox j=new JComboBox(s2);
        p1.setBackground(Color.BLACK);
       // p1.getComponentPopupMenu();
        login_password_text_feild.setForeground(Color.BLACK);
        login_user_name_text_feild.setForeground(Color.BLACK);
        login_user_name_text_feild.setBackground(Color.BLACK);
        login_password_text_feild.setBackground(Color.BLACK);
        bank_name.setHorizontalAlignment(0);
        bank_name.setIcon(new ImageIcon("images.jpg") );
        bank_name.setFont(new Font("FrenchScriptMT", Font.BOLD, 20));
        jf_intro.setLocationRelativeTo(null); // Center the frame
        create_new.setToolTipText("press here to create a new account");
        login_ok.setBackground(Color.black);
        login_ok.setForeground(Color.LIGHT_GRAY);
        create_new.setBackground(Color.black);
        create_new.setForeground(Color.LIGHT_GRAY);
        //login_ok.getActionForKeyStroke(KeyStroke.getKeyStroke() );
        //jf_intro.add(bank_name,BorderLayout.CENTER);
        gui1 g=new gui1();
        create_new.addActionListener(g);
        login_ok.addActionListener(g);
        //jf_intro.add(login_user_name);
        p1.add(bank_name);
        p1.add(login_user_name);
        p1.add(login_user_name_text_feild);
        p1.add(login_password);
        p1.add(login_password_text_feild);
        p1.add(login_ok);
        p1.add(create_new);
        jf_intro.setSize(500,300);
        p1.setLayout(new GridLayout(7,2,2,0));
        jf_intro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf_intro.setVisible(true);
        jf_intro.add(p1);
    }
    public static void registration_form()
    {
        jf.setExtendedState(JFrame.MAXIMIZED_BOTH);
        gui1 g1=new gui1();
        jf_intro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf_intro.setBackground(Color.RED);
        jf.setBackground(Color.RED);
        //t_p_number.setBackground(Color.LIGHT_GRAY);
        //jf_intro.setBackground(Color.darkGray);
        registration_form_label.setHorizontalAlignment(0);
        registration_form_label.setFont(new Font("TimesRoman", Font.BOLD, 20));
        jf.add(registration_form_label);
        String cb[]= {"a1","a2","a3"};
// jf.add(new JComboBox(cb));
        JButton jb=new JButton("reset");
        JButton jb2=new JButton("ok");
// jf.add(new JTextField(8));
        jf.setLayout(new GridLayout(19, 0,1 , 1));
        // Add labels and text fields to the frame
        jf.add(new JLabel("First Name"));
        jf.add(t_f_name);
        jf.add(new JLabel("Last Name"));
        // jf.add(new JComboBox(cb));
        jf.add(t_l_name);
        JLabel l_phone_number=new JLabel("Phone Number");
        // l_phone_number.setBackground(new ImageIcon("photo_2019-07-10_23-59-04"));
        jf.add(l_phone_number);
        jf.add(t_p_number);
        jf.add(new JLabel("DOB"));
        jf.add(t_dob);
        JLabel l1=new JLabel("Father's Name");
        jf.add(l1);
        jf.add(t_father_name);
        jf.add(new JLabel("Mother's Name"));
        jf.add(t_moters_name);
        jf.add(new JLabel("House Name"));
        jf.add(t_house_name);
        jf.add(new JLabel("Gender"));
        jf.add(j_sex);
        jb.setSize(30,40);
        jf.setSize( 1000, 2000);
        jf.add(jb);
        jf.add(jb2);
        //gui1 c=new gui1();
        jb.addActionListener(g1);
        jb2.addActionListener(g1);
        //jf.setOpacity();
        //jf.setBackground(Color.blue);
        //l1.setBackground(Color.green);
        //  System.out.println(c);
        System.out.println(t_f_name.getText());
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void check_pass_word(){

    }
}
class customer
{
    private String first_name,last_name,fathers_name,mothers_name,house_name,sex;
    private int dob,phone_number;
    customer(String fathers_name,String first_name,String last_name,String mothers_name,String house_name,String sex,int dob,int phone_number)
    {
        this.dob=dob;
        this.phone_number=phone_number;
        this.fathers_name=fathers_name;
        this.mothers_name=mothers_name;
        this.first_name=first_name;
        this.last_name=last_name;
        this.house_name=house_name;
        this.sex=sex;
    }

}