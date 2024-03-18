package bank_management_system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener {

    long random;
    JTextField    panTextField, addharTextField, ageTextField, mobileTextField;
    JButton next;
    // JRadioButton male, female, others, married, unmarried, other;
    // JDateChooser dateChooser;
    JComboBox<?> religion, category, income, education, occupation;
    String formno;

    SignupTwo(String formno) {
        this.formno = formno;

        
        setLayout(null);

        setTitle("NEW ACCOUNT APPLICATION  - PAGE:2");

        JLabel additionalDetails = new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 25));
        additionalDetails.setBounds(290, 80, 400, 30);
        add(additionalDetails);

        JLabel name = new JLabel("Religion:");
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        name.setBounds(100, 140, 100, 30);
        add(name);

        String valreligion[] = {" ", "Hindu", "Muslim", "Sikh", "Christian", "other"};
        religion = new JComboBox<>(valreligion);
        religion.setBounds(300, 140, 400, 30);
        religion.setBackground(Color.WHITE);
        add(religion);

        
        JLabel fathername = new JLabel("Category:");
        fathername.setFont(new Font("Raleway", Font.BOLD, 20));
        fathername.setBounds(100, 190, 200, 30);
        add(fathername);

        String valcategory[] = {" ","General", "OBC", "SC", "ST", "other"};
        category = new JComboBox<>(valcategory);
        category.setBounds(300, 190, 400, 30);
        category.setBackground(Color.WHITE);
        add(category);

        JLabel dob = new JLabel("Income:");
        dob.setFont(new Font("Raleway", Font.BOLD, 20));
        dob.setBounds(100, 240, 200, 30);
        add(dob);

        String valincome[] = {" ", "Null", "< 1,00,000", "< 2,50,000", "< 5,00,000", "upto 10,00,000"};
        income = new JComboBox<>(valincome);
        income.setBounds(300, 240, 400, 30);
        income.setBackground(Color.WHITE);
        add(income);

        JLabel gender = new JLabel("Educational:");
        gender.setFont(new Font("Raleway", Font.BOLD, 20));
        gender.setBounds(100, 290, 200, 30);
        add(gender);

        JLabel email = new JLabel("Qualification:");
        email.setFont(new Font("Raleway", Font.BOLD, 20));
        email.setBounds(100, 315, 200, 30);
        add(email);

        String educationValues[] = {" ","High School", "Intermediate", "Diploma", "Graduation", "Post Graduation"};
        education = new JComboBox<>(educationValues);
        education.setBounds(300, 315, 400, 30);
        education.setBackground(Color.WHITE);
        add(education);

        JLabel marital = new JLabel("Occupation:");
        marital.setFont(new Font("Raleway", Font.BOLD, 20));
        marital.setBounds(100, 390, 200, 30);
        add(marital);

        String occupationalValues[] = {" ","Bussiness", "Private Job", "Government Job", "Student", "Retired"};
        occupation = new JComboBox<>(occupationalValues);
        occupation.setBounds(300, 390, 400, 30);
        occupation.setBackground(Color.WHITE);
        add(occupation);

        JLabel pan = new JLabel("PAN Number:");
        pan.setFont(new Font("Raleway", Font.BOLD, 20));
        pan.setBounds(100, 440, 200, 30);
        add(pan);

        panTextField = new JTextField();
        panTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        panTextField.setBounds(300, 440, 400, 30);
        add(panTextField);

        JLabel city = new JLabel("Addhar No.:");
        city.setFont(new Font("Raleway", Font.BOLD, 20));
        city.setBounds(100, 490, 200, 30);
        add(city);

        addharTextField = new JTextField();
        addharTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        addharTextField.setBounds(300, 490, 400, 30);
        add(addharTextField);

        JLabel age = new JLabel("Age:");
        age.setFont(new Font("Raleway", Font.BOLD, 20));
        age.setBounds(100, 540, 200, 30);
        add(age);

        ageTextField = new JTextField();
        ageTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        ageTextField.setBounds(300, 540, 400, 30);
        add(ageTextField);

        JLabel mobile = new JLabel("Mobile No.:");
        mobile.setFont(new Font("Raleway", Font.BOLD, 20));
        mobile.setBounds(100, 590, 200, 30);
        add(mobile);

        mobileTextField = new JTextField();
        mobileTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        mobileTextField.setBounds(300, 590, 400, 30);
        add(mobileTextField);

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
        String formno = "";
        String sreligion = (String) religion.getSelectedItem();
        String fathername = (String) category.getSelectedItem();
        String sincome = (String) income.getSelectedItem();
        String seducation = (String) education.getSelectedItem();
        String soccupation = (String) occupation.getSelectedItem();
        // String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String span = panTextField.getText();
        String saddhar = addharTextField.getText();
        String sage = ageTextField.getText();
        String smobile = mobileTextField.getText();
        

         try {
            if (span.equals("")) {
                JOptionPane.showMessageDialog(null, "PAN is Required");
            } else {
                Conn c = new Conn();
                String query = "insert into signuptwo values('"+formno+"', '"+sreligion+"', '"+fathername+"', '"+sincome+"','"+seducation+"', '"+soccupation+"', '"+span+"', '"+saddhar+"', '"+smobile+"', '"+sage+"')";
                c.s.executeUpdate(query);

                setVisible(false);
                new SignupThree(formno).setVisible(true);

            }
            
         } catch (Exception e) {
            System.out.println(e);
         }
    }


    public static void main(String[] args) {
        new SignupTwo("");
    }
}

