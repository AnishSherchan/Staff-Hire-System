        import javax.swing.BorderFactory;
        import javax.swing.BoxLayout;
        import javax.swing.ImageIcon;
        import javax.swing.JButton;
        import javax.swing.JFrame;
        import javax.swing.JLabel;
        import javax.swing.JOptionPane;
        import javax.swing.JPanel;
        import javax.swing.JScrollPane;
        import javax.swing.JTextField;
        import java.awt.BorderLayout;
        import java.awt.Color;
        import java.awt.Dimension;
        import java.awt.Font;
        import java.awt.GridLayout;
        import java.awt.Image;
        import java.awt.Panel;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;
        import java.util.ArrayList;
        import java.util.ConcurrentModificationException;
public class INGNepal implements ActionListener {
            //Declearing componets for creating GUI
            public JFrame frame;
            public JFrame SubFrame;
            public JFrame SubFrame1;
            public JFrame SubFrame2;
            public JFrame CheckingFrame;
            public JFrame TerminateFrame;
            public JFrame displayFrame;
            private String Selection;
            private String cameDesignation;
            private String camsJob;
            private String cameShift;
            private JPanel Panelmainfu;
            private JPanel Panelmain;
            private JPanel PanelAppoint;
            private JPanel PanelInfo;
            private JPanel PanelTerminate;
            private JButton VacFull;
            private JButton AppFull;
            private JButton VacPart; 
            private JButton AppPart;
            private JButton display;
            private JButton terminate;
            private JButton Okbtn;
            private JButton cancel;
            private JButton Fullsubmit;
            private JButton Partsubmit;
            private JButton Clear1; 
            private JButton Save1;
            private JButton CheckBtn;
            private JButton TerminateBtn;
            private JButton CheckCLe;
            private int cameVacancy;
            private int cameSalary;
            private int cameWorkho;
            private int cameWage;
            boolean phoCheck=false;
            boolean checkInside;
            boolean clls=true;
            private JTextField VacInput1,DegisinationInput1,JobInput1,SalaryInput1,WorkHoInput1,WageInput1,
             ShiftInput1,InsideVac,inputvc,inputjb,inputdesign,inputdappoint,inputshift,inputStaff,inputWorkho,
            inputjdd,inputquliflication,inputwage,inputsalary,Terminateboxin;
            Color c = new Color(212, 212, 212);
            ArrayList<StaffHire> staffVacancy = new ArrayList<>();
            //<Main method of INGNepal Class
            public static void main(String[] args) {
                INGNepal obj1=new INGNepal();//Creating object of ing nepal class
                obj1.main();
            }
            //Main GUI or INDEX GUI
            private void main() {
                frame=new JFrame("Main");//Declearing Frame
                frame.setPreferredSize(new Dimension(550,500));
                frame.getContentPane().setBackground(c);
                frame.setResizable(false);
                frame.setLayout(null);
                
                JPanel panel = new JPanel(null);//Declearing Panel
                panel.setBounds(1, 1, 550, 130);
                Color C = new Color(17, 164, 242);
                panel.setBackground(C);
                        
                //text For panel
                JLabel lable1 = new JLabel("i");//Declearing lable
                lable1.setFont(new Font("Calibri", Font.BOLD, 70));
                lable1.setForeground(Color.GREEN);
                lable1.setBounds(240, 30, 30, 70);
                panel.add(lable1);
                        
                JLabel lable2 = new JLabel("ng");//delcearing label
                lable2.setFont(new Font("Calibri", Font.BOLD, 70));
                lable2.setBounds(258, 30, 90, 70);
                lable2.setForeground(Color.WHITE);
                panel.add(lable2);
                        
                JLabel lable3 = new JLabel("Nepal Group");//lable
                lable3.setFont(new Font("Monaco", Font.PLAIN, 16));
                lable3.setBounds(260, 85, 150, 40);
                panel.add(lable3);
                frame.add(panel);
                
                Panelmain=new JPanel(null);//panel componets 
                Panelmain.setBounds(20, 130, 500, 350);
                Panelmain.setBackground(c);
               
                //Creating Jbuttons
                
                JLabel titleLabel=new JLabel("ADD VACANCY");
                titleLabel.setBounds(170,0,200,50);
                titleLabel.setFont(new Font("Calibri", Font.PLAIN, 32));
            
                titleLabel.setForeground(Color.BLACK);
                VacFull = new JButton("Vacancy for FullTime");
                VacFull.setBounds(30,80,180,35);
                VacFull.setFont(new Font("Times New Roman",Font.PLAIN,16));
                AppFull  = new JButton("Hire Full Time");
                AppFull.setBounds(30,150,180,35);
                AppFull.setFont(new Font("Times New Roman",Font.PLAIN,16));
                VacPart = new JButton("Vacancy for Part Time");
                VacPart.setBounds(285,80,190,35);
                VacPart.setFont(new Font("Times New Roman",Font.PLAIN,16));
                AppPart = new JButton("Hire Part Time");
                AppPart.setBounds(290,150,180,35);
                AppPart.setFont(new Font("Times New Roman",Font.PLAIN,16));
                display = new JButton("Display");
                display.setBounds(30,220,180,35);
                display.setFont(new Font("Times New Roman",Font.PLAIN,16));
                terminate = new JButton("Terminate");
                terminate.setBounds(290,220,180,35);
                terminate.setFont(new Font("Times New Roman",Font.PLAIN,16));
                //ading button
                Panelmain.add(titleLabel);
                Panelmain.add(VacFull);
                Panelmain.add(AppFull);
                Panelmain.add(VacPart);
                Panelmain.add(AppPart);
                Panelmain.add(display);
                Panelmain.add(terminate);
                //actn lsn
                VacFull.addActionListener(this);
                VacPart.addActionListener(this);
                AppFull.addActionListener(this);
                AppPart.addActionListener(this);
                terminate.addActionListener(this);
                display.addActionListener(this);
                //Packing frame
                frame.add(Panelmain);
                frame.pack();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
                frame.setLocationRelativeTo(null);
                
            }
            //Adding vacancy for full time and part time
            private void VacAddmethod() {
                SubFrame=new JFrame("Vacancy for Staff");
                SubFrame.setLayout(null);
                SubFrame.setResizable(false);
                JLabel titleLabel=new JLabel("ADD VACANCY");
                titleLabel.setBounds(150,0,380,50);
                titleLabel.setFont(new Font("Calibri", Font.PLAIN, 30));
                titleLabel.setForeground(Color.BLACK);
                SubFrame.setPreferredSize(new Dimension(550,650));
                
        
                JPanel FVpanel = new JPanel(null);
                FVpanel.setBounds(1, 1, 550, 120);
                Color C = new Color(17, 164, 242);
                FVpanel.setBackground(C);
                        
                //text For panel
                JLabel lable1 = new JLabel("i");
                lable1.setFont(new Font("Calibri", Font.BOLD, 70));
                lable1.setForeground(Color.GREEN);
                lable1.setBounds(240, 30, 30, 70);
                FVpanel.add(lable1);
                        
                JLabel lable2 = new JLabel("ng");
                lable2.setFont(new Font("Calibri", Font.BOLD, 70));
                lable2.setBounds(258, 30, 90, 70);
                lable2.setForeground(Color.WHITE);
                FVpanel.add(lable2);
                        
                JLabel lable3 = new JLabel("Nepal Group");
                lable3.setFont(new Font("Monaco", Font.PLAIN, 16));
                lable3.setBounds(260, 80, 150, 40);
                FVpanel.add(lable3);
                SubFrame.add(FVpanel);
                
                //creaating jpanel
                Panelmainfu=new JPanel(null);
                Panelmainfu.setBackground(c);
                Panelmainfu.setBounds(20, 130, 500, 470);
                
                //ADDING lables
                JLabel lbl1 =new JLabel("Vacancy Number : ");
                lbl1.setBounds(20, 90, 160, 30);
                lbl1.setFont(new Font("Calibri", Font.PLAIN,20));
                lbl1.setForeground(Color.BLACK);
                    
                //TextFields
                VacInput1=new JTextField(5);
                VacInput1.setFont(new Font("Calibri",Font.PLAIN,20));
                VacInput1.setBounds(200, 80, 200, 40);
                
                //ADDIng lbl
                JLabel lbl2 =new JLabel(" Designation : ");
                lbl2.setBounds(20, 140, 160, 30);
                lbl2.setFont(new Font("Calibri", Font.PLAIN,20));
                lbl2.setForeground(Color.black);
                
                //Addinfg designation textfield
                DegisinationInput1=new JTextField(12);
                DegisinationInput1.setFont(new Font("Calibri",Font.PLAIN,20));
                DegisinationInput1.setBounds(200, 130, 200, 40);
                
                //Addinf lable
                JLabel lbl3 =new JLabel(" Job Type :");
                lbl3.setBounds(20, 190, 160, 30);
                lbl3.setFont(new Font("Calibri", Font.PLAIN,20));
                lbl3.setForeground(Color.BLACK);
                
                //adding TextField
                JobInput1=new JTextField(15);
                JobInput1.setText(Selection);
                JobInput1.setFont(new Font("Calibri",Font.PLAIN,20));
                JobInput1.setBounds(200, 180, 200, 40);
                JobInput1.setEditable(false);
                
                //adding label
                JLabel lbl4 =new JLabel("Salary : ");
                lbl4.setBounds(20, 240, 160, 30);
                lbl4.setFont(new Font("Calibri", Font.PLAIN,20));
                lbl4.setForeground(Color.black);
                
                //ading text field
                SalaryInput1=new JTextField(5);
                SalaryInput1.setFont(new Font("Calibri",Font.PLAIN,20));
                SalaryInput1.setFont(new Font("Calibri",Font.PLAIN,20));
                SalaryInput1.setBounds(200, 230, 200, 40);
                
                //adding lable
                JLabel lbl5 =new JLabel("Working Hour :");
                lbl5.setBounds(20, 290, 160, 30);
                lbl5.setFont(new Font("Calibri", Font.PLAIN,20));
                lbl5.setForeground(Color.black);
                
                //adding gtext area
                WorkHoInput1=new JTextField(4);
                WorkHoInput1.setFont(new Font("Calibri",Font.PLAIN,20));
                WorkHoInput1.setBounds(200, 280, 200, 40);
                
                //adding lbl
                JLabel lbl6=new JLabel("Wages Per Hour");
                lbl6.setBounds(20, 240, 160, 30);
                lbl6.setFont(new Font("Calibri", Font.PLAIN,20));
                lbl6.setForeground(Color.black);
                
                //add text field
                WageInput1=new JTextField(10);
                WageInput1.setBounds(200, 230, 200, 40);
                WageInput1.setFont(new Font("Calibri",Font.PLAIN,20));
                
                //Shift Label
                JLabel lbl7=new JLabel("Shift");
                lbl7.setBounds(20, 340, 160, 30);
                lbl7.setFont(new Font("Calibri", Font.PLAIN,20));
                lbl7.setForeground(Color.black);
                
                //Text area for shift
                ShiftInput1=new JTextField(10);
                ShiftInput1.setFont(new Font("Calibri",Font.PLAIN,20));
                ShiftInput1.setBounds(200, 330, 200, 40);
                
                //Adding btn
                Okbtn = new JButton("Add Vacancy");
                Okbtn.setBounds(100, 420, 120, 40);
                Okbtn.addActionListener(this);
                
                //adding btn
                cancel=new JButton("Clear");
                cancel.setBounds(250, 420, 120, 40);
                cancel.addActionListener(this);
                
                //adding lbl in pnel
                Panelmainfu.add(lbl1);
                Panelmainfu.add(VacInput1);
                Panelmainfu.add(lbl2);
                Panelmainfu.add(DegisinationInput1);
                Panelmainfu.add(lbl3);
                Panelmainfu.add(JobInput1);
                Panelmainfu.add(lbl5);
                Panelmainfu.add(WorkHoInput1);
                Panelmainfu.add(Okbtn);
                Panelmainfu.add(cancel);
                Panelmainfu.add(titleLabel);
                
                SubFrame.getContentPane().setBackground(c);
                SubFrame.add(Panelmainfu);
                SubFrame.pack();
                SubFrame.dispose();
                SubFrame.setVisible(true);
                //ifesdsee
                if(Selection.equals("Full Time")){
                    Panelmainfu.add(lbl4);
                    Panelmainfu.add(SalaryInput1);
                }
                if(Selection.equals("Part Time")){
                    Panelmainfu.add(lbl6);
                    Panelmainfu.add(WageInput1);
                    Panelmainfu.add(lbl7);
                    Panelmainfu.add(ShiftInput1);
                }
            
            }
            //Hiring GUI for APPOINtment
            public void AppointMet() {
                SubFrame2=new JFrame("Hire");
                SubFrame2.setPreferredSize(new Dimension(500,420));
                SubFrame2.setLayout(null);
                SubFrame2.setResizable(false);
                
                //Design
                JPanel FVpanel = new JPanel(null);
                FVpanel.setBounds(1, 1, 500, 120);
                Color C = new Color(17, 164, 242);
                FVpanel.setBackground(C);
                        
                //text For panel
                JLabel lable1 = new JLabel("i");
                lable1.setFont(new Font("Calibri", Font.BOLD, 70));
                lable1.setForeground(Color.GREEN);
                lable1.setBounds(210, 30, 30, 70);
                FVpanel.add(lable1);
                        
                JLabel lable2 = new JLabel("ng");
                lable2.setFont(new Font("Calibri", Font.BOLD, 70));
                lable2.setBounds(223, 30, 90, 70);
                lable2.setForeground(Color.WHITE);
                FVpanel.add(lable2);
                  
                //Text lable 
                JLabel lable3 = new JLabel("Nepal Group");
                lable3.setFont(new Font("Monaco", Font.PLAIN, 16));
                lable3.setBounds(220, 85, 150, 40);
                FVpanel.add(lable3);
                SubFrame2.add(FVpanel);
                
                //Addinf panel
                PanelAppoint=new JPanel(null);
                PanelAppoint.setBackground(c);
                PanelAppoint.setBounds(1, 120, 500, 250);
                
                //text label
                JLabel titleLabel=new JLabel("Confirm Vacancy no.");
                titleLabel.setBounds(100,15,330,40);
                titleLabel.setFont(new Font("Calibri", Font.PLAIN, 35));
                titleLabel.setForeground(Color.BLACK);
                
                //Textarea
                JLabel lbl1 =new JLabel("Vacancy Number : ");
                lbl1.setBounds(20, 110, 250, 20);
                lbl1.setFont(new Font("Calibri", Font.PLAIN,25));
                lbl1.setForeground(Color.black);
                
                InsideVac=new JTextField(5);
                InsideVac.setFont(new Font("Calibri",Font.PLAIN,20));
                InsideVac.setBounds(220, 100, 200, 40);
                
                //ADDING Text are and label
                PanelAppoint.add(titleLabel);
                PanelAppoint.add(lbl1);
                PanelAppoint.add(InsideVac);
                
                //PAcking the frame
                SubFrame2.add(PanelAppoint);
                SubFrame2.pack();
                SubFrame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                SubFrame2.setVisible(true);
                
                //if condition for jobtype
                if(Selection.equals("Full Time")){
                    Fullsubmit=new JButton(" Check ");
                    Fullsubmit.setBounds(180, 180, 120, 40);
                    PanelAppoint.add(Fullsubmit);
                    Fullsubmit.addActionListener(this);
                }
                
                //if condition for jobtype
                if(Selection.equals("Part Time")){
                    Partsubmit=new JButton("Hire");
                    Partsubmit.setBounds(180, 180, 120, 40);
                    PanelAppoint.add(Partsubmit);
                    Partsubmit.addActionListener(this);
                }
                //END
            }
            //Main APointe GUI
            public void HireFinal() {
                SubFrame1=new JFrame("Hire Staff");
              
                //Design
                JPanel panelparttime = new JPanel(null);
                panelparttime.setBounds(1, 1, 750, 120);
                Color C = new Color(17, 164, 242);
                panelparttime.setBackground(C);
                
                //text For panel
                JLabel lableparttime= new JLabel("i");
                lableparttime.setFont(new Font("Calibri", Font.BOLD, 70));
                lableparttime.setForeground(Color.GREEN);
                lableparttime.setBounds(320, 30, 30, 70);
                panelparttime.add(lableparttime);
                
                //Lable for panel 
                JLabel lable2fulltime = new JLabel("ng");
                lable2fulltime.setFont(new Font("Calibri", Font.BOLD, 70));
                lable2fulltime.setBounds(338, 30, 90, 70);
                lable2fulltime.setForeground(Color.WHITE);
                panelparttime.add(lable2fulltime);
                
                //lable for panel
                JLabel lable3fulltime = new JLabel("Nepal Group");
                lable3fulltime.setFont(new Font("Monaco", Font.PLAIN, 16));
                lable3fulltime.setBounds(320, 80, 150, 40);
                panelparttime.add(lable3fulltime);
                SubFrame1.add(panelparttime);
              
                //Title for Panel
                JLabel titleLabel=new JLabel("Hire Staff");
                titleLabel.setBounds(265,125,250,40);
                titleLabel.setFont(new Font("Calibri", Font.PLAIN, 40));
                titleLabel.setForeground(Color.BLACK);
                PanelInfo=new JPanel(null);
                PanelInfo.setBounds(10, 140, 710, 375);
                PanelInfo.setBackground(c);
                
                //Jlable for ALl componets
                JLabel lblvacancy = new JLabel("Vacancy Number:");
                JLabel lbljobtype = new JLabel("Job Type:");
                JLabel lblDesigna = new JLabel("Designation:");
                JLabel lblstaffName = new JLabel("Staff Name :");
                JLabel lblquali= new JLabel("Qualification :");
                JLabel lblworkHour = new JLabel("Working Hour :");
                JLabel lbljoinDate = new JLabel("Joining Date :");
                JLabel lblappol = new JLabel("Appointed By :");
                JLabel lblshift = new JLabel("Shift :");
                JLabel lblwageper = new JLabel("Wage per Hour :");
                JLabel lblsalary = new JLabel("Salary :");
                
                //Converting String to integer
                String salar = Integer.toString(cameSalary);
                String wage = Integer.toString(cameWage);
                String hour = Integer.toString(cameWorkho);
                String vac = Integer.toString(cameVacancy);
                
                //Text area
                inputvc=new JTextField();
                inputjb=new JTextField();
                inputdesign=new JTextField();
                inputStaff=new JTextField();
                inputquliflication=new JTextField();
                inputWorkho=new JTextField();
                inputjdd=new JTextField();
                inputdappoint=new JTextField();
                inputshift=new JTextField();
                inputwage=new JTextField();
                inputsalary=new JTextField();
                
                //displaying in text field
                inputwage.setText(wage);
                inputshift.setText(cameShift);
                lblappol.setBounds(520, 200, 150, 20);
                lblappol.setFont(new Font("Calibri", Font.PLAIN,20));
                lblappol.setForeground(Color.BLACK);
                
                //componets of all label and text area
                lblstaffName.setBounds(20, 200, 150, 20);
                lblstaffName.setFont(new Font("Calibri", Font.PLAIN,20));
                lblstaffName.setForeground(Color.BLACK);
                
                lblquali.setBounds(200, 200, 150, 20);
                lblquali.setFont(new Font("Calibri", Font.PLAIN,20));
                lblquali.setForeground(Color.BLACK);
                
                lblworkHour.setBounds(520, 60, 150, 20);
                lblworkHour.setFont(new Font("Calibri", Font.PLAIN,20));
                lblworkHour.setForeground(Color.BLACK);
                
                lbljoinDate.setBounds(360, 200, 150, 20);
                lbljoinDate.setFont(new Font("Calibri", Font.PLAIN,20));
                lbljoinDate.setForeground(Color.BLACK);
                
                lblshift.setBounds(20, 270, 150, 20);
                lblshift.setFont(new Font("Calibri", Font.PLAIN,20));
                lblshift.setForeground(Color.BLACK);
                
                lblwageper.setBounds(200, 270, 150, 20);
                lblwageper.setFont(new Font("Calibri", Font.PLAIN,20));
                lblwageper.setForeground(Color.BLACK);
                
                lblsalary.setBounds(20, 270, 150, 20);
                lblsalary.setFont(new Font("Calibri", Font.PLAIN,20));
                lblsalary.setForeground(Color.BLACK);
                
                //adding textarea in bound
                inputdappoint.setBounds(530, 220, 160, 30);
                inputdappoint.setFont(new Font("Calibri" , Font.PLAIN,20));
                inputStaff.setBounds(20, 220, 160, 30);
                inputStaff.setFont(new Font("Calibri" , Font.PLAIN,20));
                inputquliflication.setBounds(195, 220, 160, 30);
                inputquliflication.setFont(new Font("Calibri" , Font.PLAIN,20));
                inputWorkho.setBounds(50000, 95, 160, 30);
                inputWorkho.setFont(new Font("Calibri" , Font.PLAIN,20));
                inputjdd.setBounds(360, 220, 160, 30);
                inputjdd.setFont(new Font("Calibri" , Font.PLAIN,20));
                inputshift.setBounds(20, 305, 160, 30);
                inputshift.setFont(new Font("Calibri" , Font.PLAIN,20));
                inputwage.setBounds(200, 305, 160,30);
                inputwage.setFont(new Font("Calibri" , Font.PLAIN,20));
                inputsalary.setBounds(20, 305, 160,30);
                inputsalary.setFont(new Font("Calibri" , Font.PLAIN,20));
                
                //Button on this gui
                Save1=new JButton("Hire");
                Clear1=new JButton("Clear");
                Clear1.setBounds(30, 360, 120, 40);
                Save1.setBounds(560, 360, 120, 40);
                
                //adding it
                PanelInfo.add(Save1);
                PanelInfo.add(Clear1);
                //action lsnr for buton
                Clear1.addActionListener(this);
                Save1.addActionListener(this);
                
                PanelInfo.add(lblvacancy);
                PanelInfo.add(lbljobtype);
                PanelInfo.add(lblDesigna);
                PanelInfo.add(lblappol);
                PanelInfo.add(lblstaffName);
                PanelInfo.add(lblquali);
                PanelInfo.add(lblworkHour);
                PanelInfo.add(lbljoinDate);
          
                PanelInfo.add(inputvc);
                PanelInfo.add(inputjb);
                PanelInfo.add(inputdesign);
                PanelInfo.add(inputdappoint);
                PanelInfo.add(inputStaff);
                PanelInfo.add(inputquliflication);
                PanelInfo.add(inputWorkho);
                PanelInfo.add(inputjdd);
                PanelInfo.add(titleLabel);
                
                //if conditon for all
                if(Selection.equals("Full Time")){
                     PanelInfo.add(lblsalary);
                     inputsalary.setText(salar);
                     PanelInfo.add(inputsalary);
                }
                if(Selection.equals("Part Time")){
                     PanelInfo.add(lblshift);
                     PanelInfo.add(lblwageper);
                     PanelInfo.add(inputshift);
                     PanelInfo.add(inputwage);
                }
                
                //setting editable
                inputvc.setEditable(false);
                inputjb.setEditable(false);
                inputdesign.setEditable(false);
                inputwage.setEditable(false);
                inputWorkho.setEditable(false);
                inputsalary.setEditable(false);
                inputshift.setEditable(false);
                
                //subframe
                SubFrame1.add(PanelInfo);
                SubFrame1.setPreferredSize(new Dimension(750,450));
                SubFrame1.getContentPane().setBackground(c);
                SubFrame1.pack();
                SubFrame1.setResizable(false);
                SubFrame1.dispose();
                SubFrame1.setVisible(true);
            }
            // termination gui
            public void RemoveGui(){
                TerminateFrame=new JFrame("Terminate Staff");
                TerminateFrame.setResizable(false);
                JLabel titleLabel=new JLabel("Terminate");
                titleLabel.setBounds(180,5,250,40);
                titleLabel.setFont(new Font("Calibri", Font.PLAIN, 38));
                titleLabel.setForeground(Color.black);
                TerminateFrame.setPreferredSize(new Dimension(500,420));
                TerminateFrame.setLayout(null);
                
                //Design
                JPanel FVpanel = new JPanel(null);
                FVpanel.setBounds(1, 1, 500, 120);
                Color C = new Color(17, 164, 242);
                FVpanel.setBackground(C);
                        
                //text For panel
                JLabel lable1 = new JLabel("i");
                lable1.setFont(new Font("Calibri", Font.BOLD, 70));
                lable1.setForeground(Color.GREEN);
                lable1.setBounds(210, 30, 30, 70);
                FVpanel.add(lable1);
                        
                JLabel lable2 = new JLabel("ng");
                lable2.setFont(new Font("Calibri", Font.BOLD, 70));
                lable2.setBounds(223, 30, 90, 70);
                lable2.setForeground(Color.WHITE);
                FVpanel.add(lable2);
                        
                JLabel lable3 = new JLabel("Nepal Group");
                lable3.setFont(new Font("Monaco", Font.PLAIN, 16));
                lable3.setBounds(220, 85, 150, 40);
                FVpanel.add(lable3);
                TerminateFrame.add(FVpanel);
                
                //Pnale for terminate
                PanelTerminate=new JPanel(null);
                PanelTerminate.setBackground(c);
                PanelTerminate.setBounds(1, 120, 500, 250);
                
                //label for vacacny 
                JLabel lbltem =new JLabel("Vacancy Number : ");
                lbltem.setBounds(15, 110, 280, 20);
                lbltem.setFont(new Font("Calibri", Font.PLAIN,25));
                lbltem.setForeground(Color.BLACK);
                
                //Button
                TerminateBtn=new JButton("Terminate");
                TerminateBtn.setBounds(165, 180, 150, 40);
                PanelTerminate.add(TerminateBtn);
                TerminateBtn.addActionListener(this);
                //Text field
                Terminateboxin=new JTextField();
                Terminateboxin.setBounds(220, 100, 200, 40);
                Terminateboxin.setFont(new Font("Calibri",Font.PLAIN,20));
                
                //adding all cmponets
                TerminateFrame.add(PanelTerminate);
                PanelTerminate.add(titleLabel);
                PanelTerminate.add(lbltem);
                PanelTerminate.add(Terminateboxin);
                
                //packng frame
                TerminateFrame.pack();
                TerminateFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                TerminateFrame.setVisible(true);
            }
            // display
            public void displayMet(){
                System.out.println("-----------------------------------------------------------------Records-------------------------------------------------------------------");
                for( StaffHire temp : staffVacancy){
                    if(temp instanceof FullTimeStaffHire){
                        FullTimeStaffHire test = (FullTimeStaffHire) temp;
                        System.out.println("--------------------Vacancy no. "+temp.getVacancyNo()+"---------------------");
                        System.out.println("Designation : " + temp.getDesignation());
                        System.out.println("Job Type : "+ temp.getJobType());
                        System.out.println("Salary : "+ test.getsalary());
                        System.out.println("Work Hour : "+ test.getworkHour());
                        System.out.println("Staff Name : "+ test.getstaffName());
                        System.out.println("Join Date : "+ test.getjoinDate());
                        System.out.println("Qualification : "+ test.getqualification());
                        System.out.println("Appointed By : "+ test.getappointedBy());
                        System.out.println("----------------------------------------------------------------------------");
                    }
                }

                for( StaffHire temp : staffVacancy){
                    if(temp instanceof PartTimeStaffHire){
                        PartTimeStaffHire test = (PartTimeStaffHire) temp;
                        System.out.println("--------------------Vacancy no. "+temp.getVacancyNo()+"---------------------");
                        System.out.println("Designation : " + temp.getDesignation());
                        System.out.println("Job Type : "+temp.getJobType());
                        System.out.println("Work Hour : "+test.getworkHour());
                        System.out.println("Wage per Hour : "+ test.getwagePerHour());
                        System.out.println("Shift : "+ test.getshifts());
                        System.out.println("Staff Name : "+test.getstaffName());
                        System.out.println("Join Date : "+test.getjoinDate());
                        System.out.println("Qualification : "+ test.getqualification());
                        System.out.println("Appointed By : "+test.getappointedBy());
                        System.out.println("----------------------------------------------------------------------------");
                    }
                }
            }
            //It stores all the datas of VACANCY which are anounced
            private void vacMemory(){
                    boolean flag = false;   //This flag was created in order to stop executing codes if any of the text fields were empty
                    if(Selection.equals("Full Time")) {
                        if (VacInput1.getText().equals("") || DegisinationInput1.getText().equals("") || SalaryInput1.getText().equals("") || WorkHoInput1.getText().equals("")) {
                            JOptionPane.showMessageDialog(SubFrame, "Please fill out all the text fields", "Info", JOptionPane.INFORMATION_MESSAGE);
                            flag=true;
                            
                        }
                    }
                    else if(Selection.equals("Part Time")) {
                        if (VacInput1.getText().equals("") || DegisinationInput1.getText().equals("") || WageInput1.getText().equals("") || ShiftInput1.getText().equals("")|| WorkHoInput1.getText().equals("")){
                            JOptionPane.showMessageDialog(SubFrame, "Please fill out all the text fields", "Info", JOptionPane.INFORMATION_MESSAGE);
                            flag=true;
                            
                        }
                    }
                    if(flag==false) {       //This code will only run if the value of flag is false.
                        try {
                            if (Selection.equals("Full Time")) {
                                FullTimeStaffHire fullObj = new FullTimeStaffHire(vacancyReturn(), designationReturn(), Selection, salaryReturn(), workHourReturn());
                                staffVacancy.add(fullObj);
                                JOptionPane.showMessageDialog(null,"Vacancy is added ","Info",JOptionPane.INFORMATION_MESSAGE);
                            }
                            if (Selection.equals("Part Time")) {
                                PartTimeStaffHire partObj = new PartTimeStaffHire(vacancyReturn(), designationReturn(), Selection, workHourReturn(), wagePerHourReturn(), shiftReturn());
                                staffVacancy.add(partObj);
                                JOptionPane.showMessageDialog(null,"Vacancy is added ","Info",JOptionPane.INFORMATION_MESSAGE);
                            }
                        } catch (NumberFormatException exe) {
                            JOptionPane.showMessageDialog(SubFrame,exe ,"Error!", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                }
            //actionlistner
            @Override
            public void actionPerformed(ActionEvent e)throws ConcurrentModificationException {
                  if (e.getSource()==VacFull){
                      Selection = "Full Time";
                      VacAddmethod(); 
                    
                  }
                  
                  
                  if (e.getSource()==VacPart){
                      Selection = "Part Time";
                      VacAddmethod(); 
                    
                  }
                 
            
                  if (e.getSource()==AppFull){
                      Selection = "Full Time";
                      AppointMet();
                  }
                  if (e.getSource()==AppPart){
                      Selection = "Part Time";
                      AppointMet();
                        
                  }
                  if (e.getSource()==CheckCLe){
                      CheckingFrame.dispose();
                    
                  }
                  if (e.getSource()==terminate){
                    RemoveGui(); 
                    
                  }
                  if (e.getSource()==TerminateBtn){
                      if (Terminateboxin.getText().equals("")){
                          JOptionPane.showMessageDialog(TerminateFrame,"Please fill out the Text Field","Info",JOptionPane.INFORMATION_MESSAGE);
                      }else {
                          mainTerminate();
                      }
                  }
                  if(e.getSource()==display){
                      displayMet();
                  }
                  if (e.getSource()==Okbtn){
                      duplicStaff();
                  }
                 
                  if(e.getSource()==cancel){
                      VacInput1.setText("");
                     ShiftInput1.setText("");
                      WorkHoInput1.setText("");
                      DegisinationInput1.setText("");
                      WageInput1.setText("");
                      SalaryInput1.setText("");
                  }
                  if(e.getSource()==Clear1){
                      inputdappoint.setText("");
                      inputquliflication.setText("");
                      inputStaff.setText("");
                      inputjdd.setText("");
                  }
                  if(e.getSource()==Save1){
                      if (inputStaff.getText().equals("")||inputquliflication.getText().equals("")||inputdappoint.getText().equals("")||inputjdd.getText().equals("")){
                          JOptionPane.showMessageDialog(SubFrame1,"Please fill out all the text fields.","ERROR",JOptionPane.ERROR_MESSAGE);
                      }else {
                          SubFrame1.dispose();
                          AllStorage();
                    }
                      }
                  
                  if (e.getSource()==Fullsubmit){ //This code will be run when appointSubmit1 is pressed
                      try {
                          boolean checkIsTrue = false;    //creating a flag which will check if the vacancy no. has already been used in the arraylist
                          for (StaffHire temp : staffVacancy) {       //iterates within the arraylist
                              if (temp.getVacancyNo() == Integer.parseInt(InsideVac.getText()) && temp.getJobType().equals("Full Time")) {     //If the user input vacancy no. is equals to the vacancy no. in the arraylist, it will open a new frame which will let to Okbtn staff to the vacancy
                                  checkIsTrue = true;
                                  cameVacancy = temp.getVacancyNo();
                                  cameDesignation = temp.getDesignation();
                                  camsJob = temp.getJobType();
                                  FullTimeStaffHire ftsh = (FullTimeStaffHire) temp;
                                 cameSalary = ftsh.getsalary();
                                  cameWorkho = ftsh.getworkHour();
                                  JustCheck();
                              }
                          }
                          if (checkIsTrue == false) {         //If the user input vacancy no. is not equals to the vacancy no. in the arraylist, a message box will be shown
                              System.out.println("No Record Found in Full Time");
                              JOptionPane.showMessageDialog(SubFrame2, "No vacancy found", "Message", JOptionPane.ERROR_MESSAGE);
                          }
                      }catch(Exception exe){
                          if(InsideVac.getText().equals("")){
                              JOptionPane.showMessageDialog(SubFrame1,"Please fill out the Text Field","Info",JOptionPane.ERROR_MESSAGE);
                          }
                          else{
                              JOptionPane.showMessageDialog(SubFrame1,exe);
                          }
                      }
                  }
                  if (e.getSource()==Partsubmit){
                      try {
                          boolean checkIsTrue = false;      //creating a flag which will check if the vacancy no. has already been used in the arraylist
                          for(StaffHire temp: staffVacancy) {  //iterates within the arraylist
                              if (temp.getVacancyNo() == Integer.parseInt(InsideVac.getText()) ) {  //If the user input vacancy no. is equals to the vacancy no. in the arraylist, it will open a new frame which will let to Okbtn staff to the vacancy
                                 if (temp.getJobType()=="Part Time") {
                                     checkIsTrue = true;
                                     cameVacancy = temp.getVacancyNo();
                                     cameDesignation = temp.getDesignation();
                                     camsJob = temp.getJobType();
                                     PartTimeStaffHire ptsh = (PartTimeStaffHire) temp;
                                     cameWorkho = ptsh.getworkHour();
                                     cameWage = ptsh.getwagePerHour();
                                     cameShift = ptsh.getshifts();
                                     JustCheck();
                                  }
                              }
            
                          }
                          if ( checkIsTrue == false){   //If the user input vacancy no. is not equals to the vacancy no. in the arraylist, a message box will be shown
                              JOptionPane.showMessageDialog(SubFrame2,"No vacancy found" ,"Message",JOptionPane.ERROR_MESSAGE);
                          }
                      }catch(Exception exe){
                          if(InsideVac.getText().equals("")){
                              JOptionPane.showMessageDialog(SubFrame1,"Please fill out the Text Field","Info",JOptionPane.ERROR_MESSAGE);
                          }
                          else{
                              JOptionPane.showMessageDialog(SubFrame1,exe);
                          }
                      }
                  }
                  if(e.getSource()==CheckBtn){
                      SubFrame2.dispose();
                      if (Selection=="Full Time") {
                          for (StaffHire temp : staffVacancy) {
                              if (temp instanceof FullTimeStaffHire) {  // This checks whether object is an instance of FullTimeStaffHire subclass.
                                  FullTimeStaffHire ft = (FullTimeStaffHire) temp;
                                  if (ft.getVacancyNo()==cameVacancy) {
                                      if (ft.getjoined() == false) {
                                          HireFinal();
                                          CheckingFrame.dispose();
                                      } else {
                                          JOptionPane.showMessageDialog(frame, "Staff has already been appointed for this vacancy", "Info", JOptionPane.INFORMATION_MESSAGE);
                                          CheckingFrame.dispose();
                                      }
                                  }
                              }
                          }
                      }
                      if (Selection=="Part Time") {
                          for (StaffHire temp : staffVacancy) {
                              if (temp instanceof PartTimeStaffHire) { // This checks whether object is an instance of PartTimeStaffHire subclass.
                                  PartTimeStaffHire pt = (PartTimeStaffHire) temp;
                                  if (pt.getVacancyNo()==cameVacancy) {
                                  if (pt.getjoined() == false) {
                                        HireFinal();
                                        CheckingFrame.dispose();
                                  } else {
                                      JOptionPane.showMessageDialog(frame, "Staff has already been appointed for this vacancy", "Info", JOptionPane.INFORMATION_MESSAGE);
                                  } 
                                  }
                              }
                          }
                      }
                  }
                //
              }
              // rETURNING METHODS FOR ALL COMPONETS
            public int vacancyReturn(){
                  return Integer.parseInt(VacInput1.getText());
            }
            
            public String designationReturn(){
                  return DegisinationInput1.getText();
            }
            
            public int workHourReturn(){
                  return Integer.parseInt(WorkHoInput1.getText());
            }
            
            public int salaryReturn(){
                  return Integer.parseInt(SalaryInput1.getText());
            }
            
            public String shiftReturn(){
                  return ShiftInput1.getText();
            }
            
            public int wagePerHourReturn(){
                  return Integer.parseInt(WageInput1.getText());
            }
            
            public String staffNameReturn(){
                  return inputStaff.getText();
            }
            
            public String appointedByReturn(){
                  return inputdappoint.getText();
            }
            
            public String joinDateReturn(){
                  
                 return inputjdd.getText();
            }
            
            public String qualificationReturn(){
                  return inputquliflication.getText();
            }
    
            public int Terminateboxinret(){
                  return Integer.parseInt(Terminateboxin.getText());
            }
              //mAIN TERMINATE
            public void mainTerminate(){
                        boolean recordFound = false;
                        try {
                        for (StaffHire ter : staffVacancy){
                            if (ter instanceof PartTimeStaffHire) {
                                 PartTimeStaffHire pt = (PartTimeStaffHire) ter;
                                 if (ter.getVacancyNo() == Terminateboxinret()){
                                    if (pt.getjoined() == true) {
                                        recordFound = true;
                                        
                                        pt.terminate();     //This will invoke terminate method in PartTime StaffHire method.
                                    } else {
                                        JOptionPane.showMessageDialog(frame, "No Staff has been appointed in order to terminate", "Error!", JOptionPane.INFORMATION_MESSAGE);
                                        clls = false;
                                    }
                                }
                            }
                        }
                        if (recordFound==false && clls==true){
                            JOptionPane.showMessageDialog(frame,"No Valid record found for termination","Error!",JOptionPane.WARNING_MESSAGE);
                        }}catch (Exception aa) {
                            JOptionPane.showMessageDialog(null,aa, "Error",JOptionPane.WARNING_MESSAGE);
                        }
             }
              //CHECK FOR DUPLICATE VACANCY NUMBER
             private void duplicStaff(){
                 boolean anis= false;
                  try {
                    
                
                          for (StaffHire temp : staffVacancy) {        //Iterating through the arraylist
                              if (temp.getVacancyNo() == vacancyReturn()) {  //If the user input vacancy no. is equal to the vacancy no. present in the arraylist, it will show a message and then the code will not run furthermore.
                                  JOptionPane.showMessageDialog(frame, "This vacancy no. has already been used", "Error!", JOptionPane.INFORMATION_MESSAGE);
                                 
                                  anis = true;
                                  break;
                              } 
                                   
                              }  
                          
                          if(anis) { //This code will run if the user input vacancy no. is not equal to the vacancy no. present in the arraylist and values are not being added to the arraylist for the first time
                             
                              
                          } else {
                              vacMemory();
                              SubFrame.dispose();
                        }} catch (Exception e) {
                            if (VacInput1.getText().equals("") || DegisinationInput1.getText().equals("") || SalaryInput1.getText().equals("") || WorkHoInput1.getText().equals("")) {
                            vacMemory();
                            }
                            else {
                                 JOptionPane.showMessageDialog(frame,e,"Error!",JOptionPane.ERROR_MESSAGE);
            
                            }
                        }
                  
              }
              //Method for hiring a full time staff or part time staffd
              public void AllStorage(){
                  if(Selection.equals("Full Time")){
                      for(StaffHire obj:staffVacancy){
                          if(obj instanceof FullTimeStaffHire){
                              FullTimeStaffHire h = (FullTimeStaffHire) obj;
                              if(h.getVacancyNo()==cameVacancy) {
                                  if(h.getjoined()==false){
                                      h.fullhire(staffNameReturn(),joinDateReturn(),qualificationReturn(),appointedByReturn());
                                      JOptionPane.showMessageDialog(SubFrame1,"Staff has been Hired!");
                                    }
                                }
                          }
                      }
                  }
                  if (Selection=="Part Time"){
                      for(StaffHire obj:staffVacancy){
                          if(obj instanceof PartTimeStaffHire){
                              PartTimeStaffHire h = (PartTimeStaffHire) obj;
                              if(h.getVacancyNo()==cameVacancy) {
                                  if(h.getjoined()==false){
                                      h.partTimehire(staffNameReturn(),joinDateReturn(),qualificationReturn(),appointedByReturn());
                                      JOptionPane.showMessageDialog(SubFrame1,"Staff has been Hired!");
                                    }
                                }
                          }
                      }
                  }
              }
             
              public void JustCheck(){
                  for (StaffHire s : staffVacancy) {
                      if (s.getVacancyNo() == Integer.parseInt(InsideVac.getText())) {
                              CheckingFrame = new JFrame("Check");
                          
                              //design
                              JPanel panel = new JPanel(null);
                              panel.setBounds(1, 1, 500, 130);
                              Color C = new Color(17, 164, 242);
                              panel.setBackground(C);
                                    
                              //text For panel
                              JLabel lable1 = new JLabel("i");
                              lable1.setFont(new Font("Calibri", Font.BOLD, 70));
                              lable1.setForeground(Color.GREEN);
                              lable1.setBounds(200, 30, 30, 70);
                              panel.add(lable1);
                                    
                              JLabel lable2 = new JLabel("ng");
                              lable2.setFont(new Font("Calibri", Font.BOLD, 70));
                              lable2.setBounds(218, 30, 90, 70);
                              lable2.setForeground(Color.WHITE);
                              panel.add(lable2);
                                    
                              JLabel lable3 = new JLabel("Nepal Group");
                              lable3.setFont(new Font("Monaco", Font.PLAIN, 16));
                              lable3.setBounds(216, 85, 150, 40);
                              panel.add(lable3);
                              CheckingFrame.add(panel);
                              
                              
                              JPanel panelck = new JPanel(null);
                              panelck.setBounds(1, 140, 500, 200);
                              JLabel titleLabel=new JLabel(" Please Confirm !!");
                              titleLabel.setBounds(100,0,300,40);
                              titleLabel.setFont(new Font("Calibri", Font.PLAIN, 38));
                              titleLabel.setForeground(Color.BLACK);
                              CheckingFrame.setLayout(null);
                              CheckingFrame.setPreferredSize(new Dimension(500,420));
                            
                              panelck.setBackground(c);
                        
                              CheckBtn = new JButton("Confirm");
                              CheckBtn.setBounds(100,130,120,40);
                              CheckBtn.addActionListener(this);
                              panelck.add(CheckBtn);
                              
                              CheckCLe = new JButton("Exit");
                              CheckCLe.setBounds(299,130,110,40);
                              CheckCLe.addActionListener(this);
                              panelck.add(CheckCLe);
                              panelck.add(titleLabel);
                              
                              CheckingFrame.getContentPane().setBackground(c);
                              CheckingFrame.add(panelck);
                              CheckingFrame.setVisible(true); 
                             
                           
                              CheckingFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                              CheckingFrame.pack();
                      }
                  }
              } 
            }