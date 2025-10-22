package pbl;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;
public class App extends JFrame implements ActionListener{
    JMenuBar mb;
    JMenu m1,m2,m3,m4,m5,m6;
    JLabel l1,image;
    App(){
        getContentPane().setBackground(Color.WHITE);
        ImageIcon i= new ImageIcon("C:\\Users\\NARENDAR KETHAVATH\\eclipse-workspace\\Pbl\\src\\pbl\\clg.jpg");
        Image i2 = i.getImage().getScaledInstance(1500, 750, Image.SCALE_DEFAULT);
        image=new JLabel(new ImageIcon(i2));
        add(image);
        mb=new JMenuBar();
        setJMenuBar(mb);
        mb.setBackground(Color.WHITE);
        m1=new JMenu("Student Details");
        m1.setForeground(Color.BLUE);
        mb.add(m1);
        JMenuItem mi1= new JMenuItem("View All Students");
        m1.add(mi1);
        mi1.addActionListener(this);
        mi1.setBackground(Color.WHITE);
        JMenuItem mi2=new JMenuItem("Add New Student");
        m1.add(mi2);
        mi2.addActionListener(this);
        mi2.setBackground(Color.WHITE);
        JMenuItem mi3= new JMenuItem("Edit Student Details");
        m1.add(mi3);
        mi3.addActionListener(this);
        mi3.setBackground(Color.WHITE);
        JMenuItem mi4=new JMenuItem("Search Students");
        m1.add(mi4);
        mi4.addActionListener(this);
        mi4.setBackground(Color.WHITE);
        //JMenuItem mi5= new JMenuItem("Student Placement Status");
        //m1.add(mi5);
        //mi5.addActionListener(this);
        //mi5.setBackground(Color.WHITE);
        m2=new JMenu("Placement Details");
        mb.add(m2);
        JMenuItem m21= new JMenuItem("View All Placement Details");
        m2.add(m21);
        m21.addActionListener(this);
        m21.setBackground(Color.WHITE);
        JMenuItem m22=new JMenuItem("Add New Placement Record");
        m2.add(m22);
        m22.addActionListener(this);
        m22.setBackground(Color.WHITE);
        JMenuItem m23= new JMenuItem("Edit Placement Record");
        m2.add(m23);
        m23.addActionListener(this);
        m23.setBackground(Color.WHITE);
        JMenuItem m24=new JMenuItem("Search Placements");
        m2.add(m24);
        m24.addActionListener(this);
        m24.setBackground(Color.WHITE);
        m3= new JMenu("Higher Education Records");
        mb.add(m3);
        JMenuItem m31= new JMenuItem("View All Higher Education Records");
        m3.add(m31);
        m31.addActionListener(this);
        m31.setBackground(Color.WHITE);
        JMenuItem m32=new JMenuItem("Add New Higher Education Record");
        m3.add(m32);
        m32.addActionListener(this);
        m32.setBackground(Color.WHITE);
        JMenuItem m33= new JMenuItem("Edit Higher Education Record");
        m3.add(m33);
        m33.addActionListener(this);
        m33.setBackground(Color.WHITE);
        JMenuItem m34=new JMenuItem("Search Higher Education Records");
        m3.add(m34);
        m34.addActionListener(this);
        m34.setBackground(Color.WHITE);
        m4=new JMenu("Feedback Management");
        mb.add(m4);
        JMenuItem m41= new JMenuItem("View Feedback");
        m4.add(m41);
        m41.addActionListener(this);
        m41.setBackground(Color.WHITE);
        JMenuItem m42=new JMenuItem("View Feedback");
        m4.add(m42);
        m42.addActionListener(this);
        m42.setBackground(Color.WHITE);
        JMenuItem m43= new JMenuItem("Edit Feedback");
        m4.add(m43);
        m43.addActionListener(this);
        m43.setBackground(Color.WHITE);
        JMenuItem m44=new JMenuItem("Search Feedback");
        m4.add(m44);
        m44.addActionListener(this);
        m44.setBackground(Color.WHITE);
        m5= new JMenu("Reports");
        mb.add(m5);
        JMenuItem m51= new JMenuItem("Generate Company-wise Report");
        m5.add(m51);
        m51.addActionListener(this);
        m51.setBackground(Color.WHITE);
        JMenuItem m52=new JMenuItem("Generate Package Range Report");
        m5.add(m52);
        m52.addActionListener(this);
        m52.setBackground(Color.WHITE);
        JMenuItem m53= new JMenuItem("Generate Number of Offers Report");
        m5.add(m53);
        m53.addActionListener(this);
        m53.setBackground(Color.WHITE);
        JMenuItem m54=new JMenuItem("Generate Placement Status Report");
        m5.add(m54);
        m54.addActionListener(this);
        m54.setBackground(Color.WHITE);
        m6= new JMenu("Logout");
        mb.add(m6);
        setSize(500, 500);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae) 
    {        
    	String str=ae.getActionCommand();
    	if(str.equals("View All Students"))
    	{
    		new ViewAllStudents();
    	}
    	else if(str.equals("Add New Student"))
    	{
    		new AddNewStudent();
    	}
    	else if(str.equals("Edit Student Details"))
    	{
    		new EditStudentDetails();
    	}
    	else if(str.equals("Edit Student Details"))
    	{
    		new EditStudentDetails();
    	}
    	else if(str.equals("Search Students"))
    	{
    		new SearchStudents();
    	}
    	else if(str.equals("Student Placement Status"))
    	{
    		new StudentPlacementStatus();
    	}
    	else if(str.equals("Placement Details"))
    	{
    		new ViewAllPlacementDetails();
    	}
    	else if(str.equals("View All Placement Details"))
    	{
    		new ViewAllPlacementDetails();
    	}
    	else if(str.equals("Add New Higher Education Record"))
    	{
    		new AddNewHigherEducationRecord();
    	}
    	else if(str.equals("Edit Higher Education Record"))
    	{
    		new EditHigherEducationRecord();
    	}
    	else if(str.equals("Search Higher Education Records"))
    	{
    		new SearchHigherEducationRecords();
    	}
    	else if(str.equals("View Feedback"))
    	{
    		new ViewFeedback();
    	}
    	else if(str.equals("View Feedback"))
    	{
    		new ViewFeedback();
    	}
    	else if(str.equals("Edit Feedback"))
    	{
    		new EditFeedback();
    	}
    	else if(str.equals("Search Feedback"))
    	{
    		new SearchFeedback();
    	}
    	else if(str.equals("Generate Company-wise Report"))
    	{
    		new GenerateCompanywiseReport();
    	}
    	else if(str.equals("Generate Package Range Report"))
    	{
    		new GeneratePackageRangeReport();
    	}
    	else if(str.equals("Generate Number of Offers Report"))
    	{
    		new GenerateNumberofOffersReport();
    	}
    	else if(str.equals("Generate Placement Status Report"))
    	{
    		new GeneratePlacementStatusReport();
    	}
    }
}

class ViewAllStudents extends JFrame{
    JTable t;
    JScrollPane sp;
    ViewAllStudents(){
        try{
            Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/gcet","root","Naren@123");
            Statement st=cn.createStatement();
            ResultSet rs = st.executeQuery("select * from studentdetails");
            String[] columnNames = { "studentId", "name", "dob", "gender", "address", "phonenum", "email", "branch", "yearofstudy", "cgpa", "placementstatus", "offers_received"};
            DefaultTableModel model = new DefaultTableModel(columnNames, 0);
            while(rs.next()){
                String s1 = rs.getString(1);
                String s2 = rs.getString(2);
                String s3 = rs.getString(3);
                String s4 = rs.getString(4);
                String s5 = rs.getString(5);
                String s6 = rs.getString(6);
                String s7 = rs.getString(7);
                String s8 = rs.getString(8);
                String s9 = rs.getString(9);
                String s10 = rs.getString(10);
                String s11 = rs.getString(11);
                String s12 = rs.getString(12);
                model.addRow(new Object[] {s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12});
            }
            t = new JTable(model);
            sp = new JScrollPane(t);
            add(sp, BorderLayout.CENTER);
            setTitle("View All Students");
            setSize(1500, 600);
            setVisible(true);
            rs.close();st.close();cn.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
    }
}

class EditStudentDetails extends JFrame{
    EditStudentDetails()
    {
    	String rno=JOptionPane.showInputDialog("Enter studentId");
        if(!rno.equals("")){
            try{
                Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/gcet","root","Naren@123");
                Statement st=cn.createStatement();
                ResultSet rs;
                rs=st.executeQuery("Select * from studentdetails where studentId='"+rno+"';");
                if(rs.next()){
                    String q=JOptionPane.showInputDialog("Enter the column name you want to edit");
                    String q2=JOptionPane.showInputDialog("Enter the new value");
                    st.executeUpdate("update highereducation set "+q+"='"+q2+"' where studentId='"+rno+"';");
                    cn.close();st.close();rs.close();
                }
                else{
                    JOptionPane.showMessageDialog(this,"StudentId does not exist");
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(this,e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(this,"Enter StudentId");
        }
    }
}

class SearchStudents extends JFrame
{   
    JTextArea t1;
    SearchStudents()
    {
        String rno=JOptionPane.showInputDialog("Enter studentId");
        if(!rno.equals("")){
            try{
                Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/gcet","root","Naren@123");
                Statement st=cn.createStatement();
                ResultSet rs;
                rs=st.executeQuery("Select * from studentdetails where studentId='"+rno+"';");
                if(rs.next()){
                    t1=new JTextArea();
                    t1.setText("studentId :"+rs.getString(1)+"\t Name :"+rs.getString(2)+"\t DOB :"+rs.getString(3)+"\t Gender :"+rs.getString(4)+"\t Address :"+rs.getString(5)+"\t Phonenum :"+rs.getString(6)+"\n\n\n Email :"+rs.getString(7)+"\t Branch :"+rs.getString(8)+"\t YearofStudy :"+rs.getString(9)+"\t CGPA :"+rs.getString(10)+"\t PlacementStatus :"+rs.getString(11)+"\t offers_received :"+rs.getString(12));
                    add(t1);
                    setSize(900,200);
                    setLocation(250,250);
                    setVisible(true);
                    cn.close();st.close();rs.close();
                }
                else{
                    JOptionPane.showMessageDialog(this,"StudentId does not exist");
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(this,e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(this,"Enter StudentId");
        }
    }           
}

class StudentPlacementStatus extends JFrame{
    JTable t;
    JScrollPane sp;
    StudentPlacementStatus(){
        try{
            Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/gcet","root","Naren@123");
            Statement st=cn.createStatement();
            ResultSet rs = st.executeQuery("select studentId,name,branch,yearofstudy,cgpa,placementstatus,offers_received from studentdetails");
            String[] columnNames = { "Student ID","Name","Branch","Year of Study","CGPA","Placement Status","Offers Received"};
            DefaultTableModel model = new DefaultTableModel(columnNames, 0);
            while(rs.next()){
                String s1 = rs.getString(1);
                String s2 = rs.getString(2);
                String s3 = rs.getString(3);
                String s4 = rs.getString(4);
                String s5 = rs.getString(5);
                String s6 = rs.getString(6);
                String s7 = rs.getString(7);
                model.addRow(new Object[] {s1,s2,s3,s4,s5,s6,s7});
            }
            t = new JTable(model);
            sp = new JScrollPane(t);
            add(sp, BorderLayout.CENTER);
            setTitle("StudentsPlacementStatus");
            setSize(1500, 600);
            setVisible(true);
            rs.close();st.close();cn.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
    }
}

class ViewAllPlacementDetails extends JFrame{
    JTable t;
    JScrollPane sp;
    ViewAllPlacementDetails(){
        try{
            Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/gcet","root","Naren@123");
            Statement st=cn.createStatement();
            ResultSet rs = st.executeQuery("select * from placements");
            String[] columnNames = { "placement_id ", "company_name", "job_title", "package_offered", "eligibility_criteria", "date","offers_made"};
            DefaultTableModel model = new DefaultTableModel(columnNames, 0);
            while(rs.next()){
                String s1 = rs.getString(1);
                String s2 = rs.getString(2);
                String s3 = rs.getString(3);
                String s4 = rs.getString(4);
                String s5 = rs.getString(5);
                String s6 = rs.getString(6);
                String s7 = rs.getString(7);
                model.addRow(new Object[] {s1,s2,s3,s4,s5,s6,s7});
            }
            t = new JTable(model);
            sp = new JScrollPane(t);
            add(sp, BorderLayout.CENTER);
            setTitle("View All Placement Details");
            setSize(1500, 600);
            setVisible(true);
            rs.close();st.close();cn.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
    }
}
class AddNewPlacementRecord extends JFrame{
    AddNewPlacementRecord(){
        String s1=JOptionPane.showInputDialog(this,"Enter Placement ID");
        String s2=JOptionPane.showInputDialog(this,"Enter Company Name");
    	String s3=JOptionPane.showInputDialog(this,"Enter Job Title");
        String s4=JOptionPane.showInputDialog(this,"Enter Package offered");
        String s5=JOptionPane.showInputDialog(this,"Enter Criteria");
    	String s6=JOptionPane.showInputDialog(this,"Enter Date");
        String s7=JOptionPane.showInputDialog(this,"Enter Offers made");
        if (s1.isEmpty()||s2.isEmpty()||s3.isEmpty()||s4.isEmpty()||s5.isEmpty()||s6.isEmpty()||s7.isEmpty())
        {   
            JOptionPane.showMessageDialog(this,"Please fill all the fields");
        }  
        else
        {    
            try
            {
                Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/gcet","root","Naren@123");
                String query = "INSERT INTO placements VALUES (?,?,?,?,?,?,?)";
                PreparedStatement st = cn.prepareStatement(query);
                st.setString(1, s1);
                st.setString(2, s2);
                st.setString(3, s3);
                st.setInt(4, Integer.parseInt(s4));
                st.setString(5, s5);
                st.setString(6, s6);
                st.setInt(7, Integer.parseInt(s7));
                st.executeUpdate();
                st.close();cn.close();
                JOptionPane.showMessageDialog(this, "Placements Record Added!","Success", JOptionPane.INFORMATION_MESSAGE);
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(this,e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            
            }   
        }
    }
}

class EditPlacementRecord extends JFrame{
    EditPlacementRecord()
    {
    	String p_id=JOptionPane.showInputDialog("Enter Placement Id");
        if(!p_id.equals("")){
            try{
                Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/gcet","root","Naren@123");
                Statement st=cn.createStatement();
                ResultSet rs;
                rs=st.executeQuery("Select * from placements where placment_id='"+p_id+"';");
                if(rs.next()){
                    String q=JOptionPane.showInputDialog("Enter the column name you want to edit");
                    String q2=JOptionPane.showInputDialog("Enter the new value");
                    st.executeUpdate("update placements set "+q+"='"+q2+"' where placement_id='"+p_id+"';");
                    cn.close();st.close();rs.close();
                }
                else{
                    JOptionPane.showMessageDialog(this,"PlacementId does not exists");
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(this,e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(this,"Fill the field");
        }
    }
}

class SearchPlacements extends JFrame{
    JTextArea t1;
    SearchPlacements(){
        String pno=JOptionPane.showInputDialog("Enter PlacementId");
        if(!pno.equals(""))
        {
            try{
                Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/gcet","root","Naren@123");
                Statement st=cn.createStatement();
                ResultSet rs;
                rs=st.executeQuery("Select * from placements where placement_id='"+pno+"';");
                if(rs.next()){
                    t1=new JTextArea();
                    t1.setText("PlacementId :"+rs.getString(1)+"\t CompanyName :"+rs.getString(2)+"\t Job Title :"+rs.getString(3)+"\t Package offered :"+rs.getString(4)+"\t Eligibility Criteria :"+rs.getString(5)+"\n Date :"+rs.getString(6)+"Offers made :"+rs.getString(7));
                    add(t1);
                    setSize(900,200);
                    setLocation(250,250);
                    setVisible(true);
                    cn.close();st.close();rs.close();
                }
                else{
                    JOptionPane.showMessageDialog(this,"StudentId does not exist");
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(this,e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(this,"Enter StudentId");
        }
    }
}
class ViewAllHigherEducationRecords extends JFrame{
    JTable t;
    JScrollPane sp;
    ViewAllHigherEducationRecords(){
        try{
            Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/gcet","root","Naren@123");
            Statement st=cn.createStatement();
            ResultSet rs = st.executeQuery("select * from highereducation");
            String[] columnNames = { "studentId ", " qualification", " university", " year_of_graduation","branch","name"};
            DefaultTableModel model = new DefaultTableModel(columnNames, 0);
            while(rs.next()){
                String s1 = rs.getString(1);
                String s2 = rs.getString(2);
                String s3 = rs.getString(3);
                String s4 = rs.getString(4);
                String s5 = rs.getString(5);
                String s6 = rs.getString(6);
                model.addRow(new Object[] {s1,s2,s3,s4,s5,s6});
            }
            t = new JTable(model);
            sp = new JScrollPane(t);
            add(sp, BorderLayout.CENTER);
            setTitle("View All Higher Education Records");
            setSize(1500, 600);
            setVisible(true);
            rs.close();st.close();cn.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
    }
}
class AddNewHigherEducationRecord extends JFrame{
    AddNewHigherEducationRecord(){
        String s1=JOptionPane.showInputDialog(this,"Enter Student ID");
        String s2=JOptionPane.showInputDialog(this,"Enter  Qualification");
    	String s3=JOptionPane.showInputDialog(this,"Enter University name");
        String s4=JOptionPane.showInputDialog(this,"Enter Year of Graduation");
        String s5=JOptionPane.showInputDialog(this,"Enter Branch");
        String s6=JOptionPane.showInputDialog(this,"Enter name");
        if (s1.isEmpty()||s2.isEmpty()||s3.isEmpty()||s4.isEmpty()||s5.isEmpty()||s6.isEmpty())
        {   
            JOptionPane.showMessageDialog(this,"Please fill all the fields");
        }  
        else
        {    
            try
            {
                Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/gcet","root","Naren@123");
                String query = "INSERT INTO highereducation VALUES (?,?,?,?,?,?)";
                PreparedStatement st = cn.prepareStatement(query);
                st.setString(1, s1);
                st.setString(2, s2);
                st.setString(3, s3);
                st.setString(4, s4);
                st.setString(5, s5);
                st.setString(6, s6);
                st.executeUpdate();
                st.close();cn.close();
                JOptionPane.showMessageDialog(this, "HigherEducation Record Added!","Success", JOptionPane.INFORMATION_MESSAGE);
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(this,e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
                
            }   
        }
    }
}

class EditHigherEducationRecord extends JFrame{
    EditHigherEducationRecord(){
        String rno=JOptionPane.showInputDialog("Enter studentId");
        if(!rno.equals("")){
            try{
                Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/gcet","root","Naren@123");
                Statement st=cn.createStatement();
                ResultSet rs;
                rs=st.executeQuery("Select * from highereducation where studentId='"+rno+"';");
                if(rs.next()){
                    String q=JOptionPane.showInputDialog("Enter the column name you want to edit");
                    String q2=JOptionPane.showInputDialog("Enter the new value");
                    st.executeUpdate("update highereducation set "+q+"='"+q2+"' where studentId='"+rno+"';");
                    cn.close();st.close();rs.close();
                }
                else{
                    JOptionPane.showMessageDialog(this,"StudentId does not exist");
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(this,e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(this,"Fill the field");
        }
    }
}

class SearchHigherEducationRecords extends JFrame{
    JTextArea t1;
    SearchHigherEducationRecords(){
        String rno=JOptionPane.showInputDialog("Enter StudentId");
        if(!rno.equals(""))
        {
            try{
                Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/gcet","root","Naren@123");
                Statement st=cn.createStatement();
                ResultSet rs;
                rs=st.executeQuery("Select * from highereducation where studentId='"+rno+"';");
                if(rs.next()){
                    t1=new JTextArea();
                    t1.setText("studentId :"+rs.getString(1)+"\t qualification :"+rs.getString(2)+"\t university :"+rs.getString(3)+"\n\n year_of_study :"+rs.getString(4)+"\t  branch :"+rs.getString(5)+"\t  name :"+rs.getString(6));
                    add(t1);
                    setSize(900,200);
                    setLocation(250,250);
                    setVisible(true);
                    cn.close();st.close();rs.close();
                }
                else{
                    JOptionPane.showMessageDialog(this,"StudentId does not exist");
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(this,e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(this,"Enter StudentId");
        }
    }
}

class ViewFeedback extends JFrame{
    JTable t;
    JScrollPane sp;
    ViewFeedback(){
        try{
        Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/gcet","root","Naren@123");
            Statement st=cn.createStatement();
            ResultSet rs = st.executeQuery("select * from feedback");
            String[] columnNames = { "Feedback_id ", " studentId", " Feedback"};
            DefaultTableModel model = new DefaultTableModel(columnNames, 0);
            while(rs.next()){
                String s1 = rs.getString(1);
                String s2 = rs.getString(2);
                String s3 = rs.getString(3);
                model.addRow(new Object[] {s1,s2,s3});
            }
            t = new JTable(model);
            sp = new JScrollPane(t);
            add(sp, BorderLayout.CENTER);
            setTitle("View All Feedbacks");
            setSize(1500, 600);
            setVisible(true);
            rs.close();st.close();cn.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
    }
}

class AddFeedback extends JFrame{
    AddFeedback(){
        String s1=JOptionPane.showInputDialog(this,"Enter Feedback_id");
        String s2=JOptionPane.showInputDialog(this,"Enter studentId");
    	String s3=JOptionPane.showInputDialog(this,"Enter Feedback");
        if (s1.isEmpty()||s2.isEmpty()||s3.isEmpty())
        {   
            JOptionPane.showMessageDialog(this,"Please fill all the fields");
        }  
        else
        {    
            try
            {
                Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/gcet","root","Naren@123");
                String query = "INSERT INTO feedback VALUES (?,?,?)";
                PreparedStatement st = cn.prepareStatement(query);
                st.setString(1, s1);
                st.setString(2, s2);
                st.setString(3, s3);
                st.executeUpdate();
                st.close();cn.close();
                JOptionPane.showMessageDialog(this, "Feedback Added!","Success", JOptionPane.INFORMATION_MESSAGE);
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(this,e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            
            }   
        }
    }
}

class EditFeedback extends JFrame{
    EditFeedback(){
        String rno=JOptionPane.showInputDialog("Enter studentId");
        if(!rno.equals("")){
            try{
                Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/gcet","root","Naren@123");
                Statement st=cn.createStatement();
                ResultSet rs;
                rs=st.executeQuery("Select * from feedback where studentId='"+rno+"';");
                if(rs.next()){
                    String q=JOptionPane.showInputDialog("Enter the column name you want to edit");
                    String q2=JOptionPane.showInputDialog("Enter the new value");
                    st.executeUpdate("update feedback set "+q+"='"+q2+"' where studentId='"+rno+"';");
                    cn.close();st.close();rs.close();
                }
                else{
                    JOptionPane.showMessageDialog(this,"StudentId does not exist");
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(this,e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(this,"Fill the field");
        }
    }
}

class SearchFeedback extends JFrame{
    JTextArea t1;
    SearchFeedback(){
        String rno=JOptionPane.showInputDialog("Enter StudentId");
        if(!rno.equals(""))
        {
            try{
                Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/gcet","root","Naren@123");
                Statement st=cn.createStatement();
                ResultSet rs;
                rs=st.executeQuery("Select * from feedback where studentId='"+rno+"';");
                if(rs.next()){
                    t1=new JTextArea();
                    t1.setText("Feedback_id :"+rs.getString(1)+"\t StudentId :"+rs.getString(2)+"\t Feedback :"+rs.getString(3));
                    add(t1);
                    setSize(900,200);
                    setLocation(250,250);
                    setVisible(true);
                    cn.close();st.close();rs.close();
                }
                else{
                    JOptionPane.showMessageDialog(this,"StudentId does not exist");
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(this,e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(this,"Enter StudentId");
        }
    }
}

class GenerateCompanywiseReport extends JFrame{
    JTable t;
    JScrollPane sp;
    GenerateCompanywiseReport(){
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gcet", "root", "Naren@123");
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT company_name,SUM(offers_made) AS totalPlacements FROM placements GROUP BY company_name");

            String[] columnNames = { "Company Name", "Number of Placements" };
            DefaultTableModel model = new DefaultTableModel(columnNames, 0);

            while (rs.next()) {
                String companyName = rs.getString(1);
                int totalPlacements = rs.getInt(2);
                model.addRow(new Object[] { companyName, totalPlacements });
            }

            t = new JTable(model);
            sp = new JScrollPane(t);
            add(sp, BorderLayout.CENTER);
            setTitle("Company-wise Placement Report");
            setSize(800, 400);
            setVisible(true);
            rs.close();
            st.close();
            cn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}

class GeneratePackageRangeReport extends JFrame{
    JTable t;
    JScrollPane sp;
    GeneratePackageRangeReport(){
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gcet", "root", "Naren@123");
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT "
                + "CASE "
                + "WHEN package_offered <= 500000 THEN '0-5L' "
                + "WHEN package_offered BETWEEN 500001 AND 1000000 THEN '5L-10L' "
                + "WHEN package_offered BETWEEN 1000001 AND 1500000 THEN '10L-15L' "
                + "ELSE 'Above 15L' END AS salaryRange, "
                + "SUM(offers_made) AS numberOfPlacements "
                + "FROM placements GROUP BY salaryRange");

            String[] columnNames = { "Salary Range", "Number of Placements" };
            DefaultTableModel model = new DefaultTableModel(columnNames, 0);

            while (rs.next()) {
                String salaryRange = rs.getString(1);
                int numberOfPlacements = rs.getInt(2);
                model.addRow(new Object[] { salaryRange, numberOfPlacements });
            }

            t = new JTable(model);
            sp = new JScrollPane(t);
            add(sp, BorderLayout.CENTER);
            setTitle("Package Range Placement Report");
            setSize(800, 400);
            setVisible(true);
            rs.close();
            st.close();
            cn.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}

class GenerateNumberofOffersReport extends JFrame{
    GenerateNumberofOffersReport(){

    }
}
class GeneratePlacementStatusReport extends JFrame{
    GeneratePlacementStatusReport(){
        
    }
}