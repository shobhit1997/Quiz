package com.example.shobhit.quiz1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

public class Quiz extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rounds);

    }
    int Score=0,n=0,r=0;
    String answer="";
    public void back(View view)
    {
        setContentView(R.layout.rounds);
    }
    public void setRound(View view)
    {
        int id=view.getId();
        switch(id)
        {
            case R.id.r1 :
                setContentView(R.layout.activity_quiz);
                setQuestion1(n=0);
                r=1;
                break;
            case R.id.r2 :
                setContentView(R.layout.science);
                setQuestion2(n=0);
                r=2;
                break;
            case R.id.r3 :
                setContentView(R.layout.history);
                setQuestion3(n=0);
                r=3;
                break;
            default:
        }
    }
    public void setQuestion1(int n)
    {   if(n<10) {
        String q1[]={"Which of the following countries have won the Fifa World Cup 4 time since its orign in 1930 ?","Who invented the Mercury Thermometer ?","Who won the NKP Challengers Trophy 2013-14 ?","Who discovered neutron ?","Who is the First Indian Bowler to take a wicket on his first ball in debut in T20 and oneday Internationals ?","Who invented Gas engine ?","The term 'Back-hand-drive' is associated with which sport ?","Who predicted Black Holes ?","Where is the Green Park Cricket Stadium located ?","What did Simpson and Harrison invented in field of Organic Chemistry ?"};
        String ans1[]={"Brazil","Farenheit","India Blue","Chadwick","Bhuvneshwar Kumar","Daimler","Lawn Tenis","Einstein","Kanpur","Chloroform"};
        String op1[][]={{"Argentina","Germany","Brazil","England"},{"Galileo","Farenheit","Newton","Priestley"},{"India Red","India Blue","Delhi","Chennai Super Kings"},{"Chadwick","Rutherford","Bohr","Newton"},{"Ashwin","Ishant Sharma","Kapil Dev","Bhuvneshwar Kumar"},{"Daimler","Davy","Diesel","Charles"},{"Lawn Tenis","Table Tenis","Badminton","Volleyball"},{"Copernicus","Hermamn Bondi","Rutherford","Einstein"},{"England","Mumbai","Kanpur","Delhi"},{"CFC","Chloroform","Methane","Alcohol"}};
        TextView ques = (TextView) findViewById(R.id.NextQuestion);
        RadioButton O1 = (RadioButton) findViewById(R.id.Option1);
        RadioButton O2 = (RadioButton) findViewById(R.id.Option2);
        RadioButton O3 = (RadioButton) findViewById(R.id.Option3);
        RadioButton O4 = (RadioButton) findViewById(R.id.Option4);
        answer=ans1[n];
        ques.setText(q1[n]);
        O1.setText(op1[n][0]);
        O2.setText(op1[n][1]);
        O3.setText(op1[n][2]);
        O4.setText(op1[n][3]);
    }
    else
    {
        setContentView(R.layout.score);
        TextView lb = (TextView) findViewById(R.id.Score);
        lb.setText(""+Score);
        ImageView imv=(ImageView) findViewById(R.id.amaze);
        if(Score>5) {


            imv.setImageResource(R.drawable.awesum);
        }
        else
        {
            imv.setImageResource(R.drawable.sad);
        }


    }
    }
    public void setQuestion2(int n)
    {   if(n<10) {
        String q1[]={"What is solid carbon dioxide called ?"," What is bending of Light called ?","With which part of the body is the disease Pyorrhoea Associated ?","liver receives blood from the alimentary Canal through which of the following?","What is Inflammation of Eyes called ?","What is the Branch of Science which deals with tumour known as ?","Which of the following is not the principles of Object Oriented Programming ?","What is the unit of Wavelength of Light ?","Whenever a HydroCarbon is burnt in oxgen what does it forms?","What does Epidemiology deal with ?"};
        String ans1[]={"Dry Ice","Refraction","Gums","Hepatic Portal Vein","Opthalmia","Oncology","Abstraction","Angstrom","Carbon Dioxide and Water","Epidemic diseases"};
        String op1[][]={{"Carbonate","Solid Carbon Dioxide","Dry Ice","Carboxy"},{"Reflection","Refraction","Absorption","Total Internal Reflection"},{"Eyes","Lungs","Kidney","Gums"},{"Hepatic Artery","Hepatic vein","Hepatic Portal Vein","Aorta"},{"Tubeculosis","Opthalmia","Jaundice","Diptheria"},{"Serology","Oncology","Chromology","Urology"},{"Encapsulation","Polymorphism","Inheritance","Abstraction"},{"Angstrom","Decibel","Ampere","Ohm"},{"Acid","Hydrogen and Carbon Dioxide","Carbon Dioxide and Water","Alkali"},{"Cancer","Epidemic diseases","Epidermis diseases","Dermis diseases"}};
        TextView ques = (TextView) findViewById(R.id.NextQuestion);
        RadioButton O1 = (RadioButton) findViewById(R.id.Option1);
        RadioButton O2 = (RadioButton) findViewById(R.id.Option2);
        RadioButton O3 = (RadioButton) findViewById(R.id.Option3);
        RadioButton O4 = (RadioButton) findViewById(R.id.Option4);
        answer=ans1[n];
        ques.setText(q1[n]);
        O1.setText(op1[n][0]);
        O2.setText(op1[n][1]);
        O3.setText(op1[n][2]);
        O4.setText(op1[n][3]);
    }
    else
    {
        setContentView(R.layout.score);
        TextView lb = (TextView) findViewById(R.id.Score);
        lb.setText(""+Score);
        ImageView imv=(ImageView) findViewById(R.id.amaze);
        if(Score>5) {

            imv.setImageResource(R.drawable.awesum);
        }
        else
        {
            imv.setImageResource(R.drawable.sad);
        }


    }
    }
    public void setQuestion3(int n)
    {   if(n<10) {
        String q1[]={"Grand Central Terminal, Park Avenue, New York is the world's","Entomology is the science that studies","Eritrea, which became the 182nd member of the UN in 1993, is in the continent of","Garampani sanctuary is located at","Hitler party which came into power in 1933 is known as","Epsom (England) is the place associated with","First human heart transplant operation conducted by Dr. Christian Bernard on Louis Washkansky, was conducted in","Exposure to sunlight helps a person improve his health because","Golf player Vijay Singh belongs to which country?","First China War was fought between","Each year World Red Cross and Red Crescent Day is celebrated on"};
        String ans1[]={"largest railway station","Insects","Africa","Diphu, Assam","Nazi Party","Horse racing","1967","UV rays converts skin oil into Vitamin D","Fiji","China and Britain"};
        String op1[][]={{"largest railway station","highest railway station","longest railway station","Radio Station"},{"Behavior of human beings","Insects","Animals","The formation of rocks"},{"Asia","Africa","Europe","Australia"},{"Junagarh, Gujarat","Diphu, Assam","Kohima, Nagaland","Gangtok, Sikkim"},{"Labour Party","Ku-Klux-Klan","Nazi Party","Democratic Party"},{"Horse racing","Polo","Shooting","Snooker"},{"1967","1968","1958","1922"},{"IR rays kills bacteria","resistance power increases","the pigment cells produce a healthy tan","UV rays converts skin oil to Vitamin D"},{"USA","Fiji","India","UK"},{"China and Britain","China and France","China and Egypt","China and Greek"}};
        TextView ques = (TextView) findViewById(R.id.NextQuestion);
        RadioButton O1 = (RadioButton) findViewById(R.id.Option1);
        RadioButton O2 = (RadioButton) findViewById(R.id.Option2);
        RadioButton O3 = (RadioButton) findViewById(R.id.Option3);
        RadioButton O4 = (RadioButton) findViewById(R.id.Option4);
        answer=ans1[n];
        ques.setText(q1[n]);
        O1.setText(op1[n][0]);
        O2.setText(op1[n][1]);
        O3.setText(op1[n][2]);
        O4.setText(op1[n][3]);
    }
    else
    {
        setContentView(R.layout.score);
        TextView lb = (TextView) findViewById(R.id.Score);
        lb.setText(""+Score);
        ImageView imv=(ImageView) findViewById(R.id.amaze);
        if(Score>5) {

            imv.setImageResource(R.drawable.awesum);
        }
        else
        {
            imv.setImageResource(R.drawable.sad);
        }


    }
    }
    public void Check(View view)
    {
        RadioButton rb=(RadioButton)findViewById(view.getId());

        String Ans=rb.getText().toString();

        if(Ans.equals(answer))
        {
            Score++;
        }
        rb.setChecked(false);
        switch (r)
        {
            case 1:
                setQuestion1(++n);
                break;
            case 2:
                setQuestion2(++n);
                break;
            case 3:
                setQuestion3(++n);
                break;
        }

    }
    public void next(View view)
    {
        switch (r)
        {
            case 1:
                setQuestion1(++n);
                break;
            case 2:
                setQuestion2(++n);
                break;
            case 3:
                setQuestion3(++n);
                break;
        }
    }
}
