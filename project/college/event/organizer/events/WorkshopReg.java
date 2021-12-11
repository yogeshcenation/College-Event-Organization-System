 package project.college.event.organizer.events;

import javax.swing.*;
import java.awt.*;

public class WorkshopReg
{
    WorkshopReg()
    {
        //Creating Frame
        JFrame f = new JFrame();
        f.setTitle("Register for Workshop");
        f.setSize(1400,850);

        JLabel w_title = new JLabel("WORKSHOP REGISTRATION FORM",JLabel.CENTER);
        w_title.setBounds(550, 5,400,25);
        w_title.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        f.add(w_title);


        //Declaration of variables
        JLabel w_name, w_description, w_conduct, w_duration, w_dept, w_student, w_year,w_start, w_end, w_eligibility, w_mode;
        JTextField w_name1, w_conduct1, w_duration1, w_student1;
        JButton schedule, reset;
        Choice start_day, start_month, start_year, end_day, end_month ,end_year, w_duration2,w_year1;
        TextArea w_description1,w_eligibility1;
        JComboBox w_dept1;
        JRadioButton w_mode1,w_mode2;
        ButtonGroup mode;

        //Creating name part
        w_name = new JLabel("Workshop Title");
        w_name.setFont(new Font("Calibri", Font.ITALIC, 22));
        w_name.setBounds(250,55,200,25);

        w_name1 = new JTextField();
        w_name1.setBounds(600,50,300,25);
        f.add(w_name);f.add(w_name1);

        //Creating description part
        w_description = new JLabel("Description");
        w_description.setFont(new Font("Calibri",Font.ITALIC, 22));
        w_description.setBounds(250,105,200,25);

        w_description1 = new TextArea("",50,50,TextArea.SCROLLBARS_BOTH);
        w_description1.setBounds(600,100,300,80);
        f.add(w_description);f.add(w_description1);

        //Creating conducted by part
        w_conduct = new JLabel("Conducted by");
        w_conduct.setFont(new Font("Calibri",Font.ITALIC, 22));
        w_conduct.setBounds(250,205,200,25);

        w_conduct1 = new JTextField();
        w_conduct1.setBounds(600,200,300,25);
        f.add(w_conduct);f.add(w_conduct1);

        //Creating duration part
        w_duration = new JLabel("Duration");
        w_duration.setFont(new Font("Calibri",Font.ITALIC,22));
        w_duration.setBounds(250,255,200,25);

        w_duration1 = new JTextField();
        w_duration1.setBounds(600,250,60,25);

        w_duration2 = new Choice();
        w_duration2.add("Hours");w_duration2.add("Days");w_duration2.add("Months");
        w_duration2.setBounds(680,250,60,25);
        f.add(w_duration);f.add(w_duration1);f.add(w_duration2);
        
        //Creating start date part
        w_start = new JLabel("Start date");
        w_start.setFont(new Font("Calibri",Font.ITALIC,22));
        w_start.setBounds(250,305,200,25);
        
        start_day = new Choice();
        start_day.add("01"); start_day.add("02"); start_day.add("03"); start_day.add("04"); start_day.add("05");
        start_day.add("06"); start_day.add("07"); start_day.add("08"); start_day.add("09"); start_day.add("10");
        start_day.add("11"); start_day.add("12"); start_day.add("13"); start_day.add("14"); start_day.add("15");
        start_day.add("16");start_day.add("17");start_day.add("18");start_day.add("19");start_day.add("20");
        start_day.add("21");start_day.add("22");start_day.add("23");start_day.add("24");start_day.add("25");
        start_day.add("26");start_day.add("27");start_day.add("28");start_day.add("29");start_day.add("30");
        start_day.add("31");
        start_day.setBounds(600,300,50,25);
        
        start_month = new Choice();
        start_month.add("Janauary");start_month.add("February");start_month.add("March");start_month.add("April");start_month.add("May");
        start_month.add("June");start_month.add("July");start_month.add("August");start_month.add("September");
        start_month.add("October");start_month.add("November");start_month.add("December");
        start_month.setBounds(665,300,80,25);

        start_year = new Choice();
        start_year.add("2021");start_year.add("2022");start_year.add("2023");start_year.add("2024");
        start_year.add("2025");
        f.add(start_day);f.add(start_month);f.add(start_year);
        start_year.setBounds(755,300,50,25);
        f.add(w_start);f.add(start_day);f.add(start_month);f.add(start_year);

        //Creating end date part
        w_end = new JLabel("End date");
        w_end.setBounds(250,355,200,25);
        w_end.setFont(new Font("Calibri",Font.ITALIC,22));

        end_day = new Choice();
        end_day.add("01"); end_day.add("02"); end_day.add("03"); end_day.add("04"); end_day.add("05");
        end_day.add("06"); end_day.add("07"); end_day.add("08"); end_day.add("09"); end_day.add("10");
        end_day.add("11"); end_day.add("12"); end_day.add("13"); end_day.add("14"); end_day.add("15");
        end_day.add("16");end_day.add("17");end_day.add("18");end_day.add("19");end_day.add("20");
        end_day.add("21");end_day.add("22");end_day.add("23");end_day.add("24");end_day.add("25");
        end_day.add("26");end_day.add("27");end_day.add("28");end_day.add("29");end_day.add("30");
        end_day.add("31");
        end_day.setBounds(600,350,50,25);

        end_month = new Choice();
        end_month.add("Janauary");end_month.add("February");end_month.add("March");end_month.add("April");end_month.add("May");
        end_month.add("June");end_month.add("July");end_month.add("August");end_month.add("September");
        end_month.add("October");end_month.add("November");end_month.add("December");
        end_month.setBounds(665,350,80,25);

        end_year = new Choice();
        end_year.add("2021");end_year.add("2022");end_year.add("2023");end_year.add("2024");
        end_year.add("2025");
        f.add(end_day);f.add(end_month);f.add(end_year);
        end_year.setBounds(755,350,50,25);
        f.add(w_end);f.add(end_day);f.add(end_month);f.add(end_year);

        //Creating department part
        w_dept = new JLabel("Department");
        w_dept.setFont(new Font("Calibri",Font.ITALIC,22));
        w_dept.setBounds(250,405,200,25);

        String[] department =
                {
                        " - - -",
                        "B.E. Computer Science and Engineering",
                        "B.Tech. Artificial Intelligence and Data Science",
                        "B.Tech. BioTechnology",
                        "B.E. BioMedical Engineering",
                        "B.E. Electronics and Communication Engineering",
                        "B.E. Electrical and Electronics Engineering",
                        "B.Tech. Information Technology",
                        "B.E. Mechanical Engineering",
                        "B.E. Civil Engineering",
                };
        w_dept1 = new JComboBox(department);
        w_dept1.setBounds(600,400,300,30);
        f.add(w_dept1);f.add(w_dept);

        //Creating slots available part
        w_student = new JLabel("Slots Allocated");
        w_student.setFont(new Font("Calibri",Font.ITALIC,22));
        w_student.setBounds(250,455,200,25);

        w_student1 = new JTextField();
        w_student1.setBounds(600,450,100,25);
        f.add(w_student);f.add(w_student1);

        //Creating Conducted for which year part
        w_year = new JLabel("Conducted For");
        w_year.setFont(new Font("Calibri",Font.ITALIC,22));
        w_year.setBounds(250,505,200,25);

        w_year1 = new Choice();
        w_year1.setBounds(600,500,200,25);
        w_year1.add("All Years");w_year1.add("I st Year");w_year1.add("II nd Year");w_year1.add("III rd Year");w_year1.add("IV th Year");
        f.add(w_year);f.add(w_year1);

        //Creating Eligibility criteria part
        w_eligibility = new JLabel("Eligibility Criteria");
        w_eligibility.setFont(new Font("Calibri",Font.ITALIC,22));
        w_eligibility.setBounds(250,555,200,25);

        w_eligibility1 = new TextArea();
        w_eligibility1.setBounds(600,550,300,80);
        f.add(w_eligibility);f.add(w_eligibility1);

        //Creating mode of Workshop part
        w_mode = new JLabel("Mode of Workshop");
        w_mode.setFont(new Font("Calibri",Font.ITALIC,22));
        w_mode.setBounds(250,655,200,25);

        w_mode1 = new JRadioButton("On-site");
        w_mode2 = new JRadioButton("Virtual");
        mode = new ButtonGroup();
        w_mode1.setBounds(600,655,100,25);
        w_mode2.setBounds(700,655,100,25);
        mode.add(w_mode1);mode.add(w_mode2);
        f.add(w_mode1);f.add(w_mode2);f.add(w_mode);

        //Creating buttons(Schedule event and reset)
        schedule = new JButton("Schedule Event");
        schedule.setBounds(450,720,200,50);
        schedule.addActionListener(e -> {
             JOptionPane.showConfirmDialog(null,"Are you sure to register the workshop with the given details?","Confirm Registration",JOptionPane.YES_NO_OPTION);
        });
        f.add(schedule);

        reset = new JButton("Reset");
        reset.setBounds(740,720,150,50);
        f.add(reset);
        reset.addActionListener(e -> {
            w_name1.setText("");
            w_conduct1.setText("");
            w_description1.setText("");
            w_duration1.setText("");
            w_eligibility1.setText("");
            w_student1.setText("");
        });
        f.add(reset);

        //Basic frame setup
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String args[])
    {
        new WorkshopReg();
    }
}