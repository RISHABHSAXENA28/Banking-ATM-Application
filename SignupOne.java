package bank_management_system;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
public class SignupOne extends JFrame implements ActionListener{

    long random; 
    JTextField nameTextField, fathernameTextField, dobTextField, emailTextField, addressTextField, cityTextField, codeTextField, stateTextField;
    JButton next, clear;
    JRadioButton male, female, others, married, unmarried, other;
    // JDateChooser dateChooser;
    SignupOne() {

        setTitle("Canara Signup");

        setLayout(null);

        Random ran = new Random();
        random = Math.abs((ran.nextLong() % 9000L) + 1000L);

        JLabel formno = new JLabel("APPLICATION FORM NO. " + random );
        formno.setFont(new Font("Raleway", Font.BOLD, 38));
        formno.setBounds(140, 20, 600, 40);
        add(formno);

        JLabel personalDetails = new JLabel("Page 1: Personal Details");
        personalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        personalDetails.setBounds(290, 80, 400, 30);
        add(personalDetails);

        JLabel name = new JLabel("Name:");
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        name.setBounds(100, 140, 100, 30);
        add(name);

        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        nameTextField.setBounds(300, 140, 400, 30);
        add(nameTextField);

        JLabel fathername = new JLabel("Father's Name:");
        fathername.setFont(new Font("Raleway", Font.BOLD, 20));
        fathername.setBounds(100, 190, 200, 30);
        add(fathername);

        fathernameTextField = new JTextField();
        fathernameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        fathernameTextField.setBounds(300, 190, 400, 30);
        add(fathernameTextField);

        JLabel dob = new JLabel("Date of Birth:");
        dob.setFont(new Font("Raleway", Font.BOLD, 20));
        dob.setBounds(100, 240, 200, 30);
        add(dob);

        dobTextField = new JTextField();
        dobTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        dobTextField.setBounds(300, 230, 400, 30);
        add(dobTextField);


        // JDateChooser dateChooser = new JDateChooser();
        // dateChooser.setBounds(300, 240, 400, 30);
        // dateChooser.setForeground(new Color(105, 105, 105));
        // add(dateChooser);

        JLabel gender = new JLabel("Gender:");
        gender.setFont(new Font("Raleway", Font.BOLD, 20));
        gender.setBounds(100, 290, 200, 30);
        add(gender);

        male = new JRadioButton("Male");
        male.setFont(new Font("Raleway", Font.BOLD, 14));
        male.setBounds(300, 290, 70, 30);
        male.setBackground(Color.WHITE);
        add(male);

        female = new JRadioButton("Female");
        female.setFont(new Font("Raleway", Font.BOLD, 14));
        female.setBounds(450, 290, 80, 30);
        female.setBackground(Color.WHITE);
        add(female);

        others = new JRadioButton("Others");
        others.setFont(new Font("Raleway", Font.BOLD, 14));
        others.setBounds(600, 290, 100, 30);
        others.setBackground(Color.WHITE);
        add(others);

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);
        genderGroup.add(others);

        JLabel email = new JLabel("Email Address:");
        email.setFont(new Font("Raleway", Font.BOLD, 20));
        email.setBounds(100, 340, 200, 30);
        add(email);

        emailTextField = new JTextField();
        emailTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        emailTextField.setBounds(300, 340, 400, 30);
        add(emailTextField);

        JLabel marital = new JLabel("Marital Status:");
        marital.setFont(new Font("Raleway", Font.BOLD, 20));
        marital.setBounds(100, 390, 200, 30);
        add(marital);

        married = new JRadioButton("Married");
        married.setFont(new Font("Raleway", Font.BOLD, 14));
        married.setBounds(300, 390, 100, 30);
        married.setBackground(Color.WHITE);
        add(married);

        unmarried = new JRadioButton("Unmarried");
        unmarried.setFont(new Font("Raleway", Font.BOLD, 14));
        unmarried.setBounds(450, 390, 100, 30);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);

        other = new JRadioButton("Other");
        other.setFont(new Font("Raleway", Font.BOLD, 14));
        other.setBounds(630, 390, 100, 30);
        other.setBackground(Color.WHITE);
        add(other);

        ButtonGroup maritalGroup = new ButtonGroup();
        maritalGroup.add(married);
        maritalGroup.add(unmarried);
        maritalGroup.add(other);

        JLabel address = new JLabel("Address:");
        address.setFont(new Font("Raleway", Font.BOLD, 20));
        address.setBounds(100, 440, 200, 30);
        add(address);

        addressTextField = new JTextField();
        addressTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        addressTextField.setBounds(300, 440, 400, 30);
        add(addressTextField);

        JLabel city = new JLabel("City:");
        city.setFont(new Font("Raleway", Font.BOLD, 20));
        city.setBounds(100, 490, 200, 30);
        add(city);

        cityTextField = new JTextField();
        cityTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        cityTextField.setBounds(300, 490, 400, 30);
        add(cityTextField);

        JLabel code = new JLabel("PIN Code:");
        code.setFont(new Font("Raleway", Font.BOLD, 20));
        code.setBounds(100, 540, 200, 30);
        add(code);

        codeTextField = new JTextField();
        codeTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        codeTextField.setBounds(300, 540, 400, 30);
        add(codeTextField);

        JLabel state = new JLabel("State:");
        state.setFont(new Font("Raleway", Font.BOLD, 20));
        state.setBounds(100, 590, 200, 30);
        add(state);

        stateTextField = new JTextField();
        stateTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        stateTextField.setBounds(300, 590, 400, 30);
        add(stateTextField);

        next = new JButton("Next >>");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620, 660, 90, 30);
        next.addActionListener(this);
        add(next);


            getContentPane().setBackground(Color.WHITE);

        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        String formno = "" + random;
        String name = nameTextField.getText();
        String fathername = fathernameTextField.getText();
        // String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String dob = dobTextField.getText();
        String gender = null;
        if (male.isSelected()) {
            gender = "Male";
        } else if (female.isSelected()) {
            gender = "Female";
         } else if (others.isSelected()) {
            gender = "Others";
         }
          
         String email = emailTextField.getText();
         String marital = null;

         if (married.isSelected()) {
            marital = "Married";
         } else if (unmarried.isSelected()) {
            marital = "Unmarried";
         } else if (other.isSelected()) {
            marital = "Other";
         } 
         String address = addressTextField.getText();
         String city = cityTextField.getText();
         String code = codeTextField.getText();
         String state = stateTextField.getText();

         try {
            if (name.equals("")) {
                JOptionPane.showMessageDialog(null, "Name is Required");
            } else {
                Conn c = new Conn();
                String query = "insert into Signup values('"+formno+"', '"+name+"', '"+fathername+"', '"+dob+"', '"+gender+"', '"+email+"', '"+marital+"', '"+address+"', '"+city+"', '"+code+"', '"+state+"')";
                c.s.executeUpdate(query);

                setVisible(false);
                new SignupTwo(formno).setVisible(true);
            }
         } catch (Exception e) {
            System.out.println(e);
         }
    }


    public static void main(String[] args) {
        new SignupOne();
    }
}
