package com.company;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class CalenderArrange{


    public void GetDay(String Month,String Year){
        int i,j,start = 0;
        SimpleDateFormat format1=new SimpleDateFormat("dd/MMM/yyyy");
        String BackSlash ="/";
        String Date = "1"+BackSlash+Month+BackSlash+Year;
        Date FinalDate= null;
        try {
            FinalDate = format1.parse(Date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        DateFormat format2=new SimpleDateFormat("EEE");
        String finalDay=format2.format(FinalDate);

        String [][]CalenderArray = new String[6][7];
        int times = 0;

        if(finalDay.equals("Sun")){
            times = 1;
        }
        else if(finalDay.equals("Mon")){
            times = 2;
        }

        else if(finalDay.equals("Tue")){
            times = 3;
        }

        else if(finalDay.equals("Wed")){
            times = 4;
        }

        else if(finalDay.equals("Thu")){
            times = 5;
        }

        else if(finalDay.equals("Fri")){
            times = 6;
        }
        else if(finalDay.equals("Sat")){
            times = 7;
        }


        String nullValue = " ";
        String nullValue2 ="   ";
        String value;
        int counter = 0;
        String zero ="0";


        //nullValue;
        for (i=0; i<6; i++){
            for (j=0; j<7; j++){
                CalenderArray[i][j] = nullValue2;
            }
        }

        //Calender value
        for (i=0; i<6; i++){
            if(i==0){
                start = times-1;
            }
            else{
                start =0;
            }

            for (j=start; j<7; j++){
                counter++;

                if(Month.equals("Apr") || Month.equals("Jun") || Month.equals("Sep")|| Month.equals("Nov")) {
                    if (counter <= 30) {
                        if(counter <= 9){
                            value = Integer.toString(counter);
                            CalenderArray[i][j] =   zero+ value + nullValue;
                        }
                        else {
                            value = Integer.toString(counter);
                            CalenderArray[i][j] = value + nullValue;
                        }

                    }
                }

                else if(Month.equals("Feb")){
                    int CheckLunarYear =Integer.parseInt(Year);
                    if(CheckLunarYear %4==0){
                        if (counter <= 29) {
                            if(counter <= 9){
                                value = Integer.toString(counter);
                                CalenderArray[i][j] = zero+ value + nullValue;
                            }
                            else {
                                value = Integer.toString(counter);
                                CalenderArray[i][j] = value + nullValue;
                            }
                        }
                    }
                    else {
                        if (counter <= 28) {
                            if (counter <= 9) {
                                value = Integer.toString(counter);
                                CalenderArray[i][j] = zero + value + nullValue;
                            } else {
                                value = Integer.toString(counter);
                                CalenderArray[i][j] = value + nullValue;
                            }
                        }
                    }
                }
                else if(Month.equals("Jan")||Month.equals("Mar")||Month.equals("May")||Month.equals("Jul")||Month.equals("Aug")||Month.equals("Oct")||Month.equals("Dec")) {
                    if (counter <= 31) {
                        if(counter <= 9){
                            value = Integer.toString(counter);
                            CalenderArray[i][j] = zero+ value + nullValue;
                        }
                        else {
                            value = Integer.toString(counter);
                            CalenderArray[i][j] = value + nullValue;
                        }
                    }
                }




            }

        }
        System.out.println(" ");
        System.out.println("        "+Month+"        ");
        System.out.println("____________________");
        System.out.println(" S  M  T  W  T  F  S");
        for (i=0; i<6; i++){
            for (j=0; j<7; j++){
                System.out.print(CalenderArray[i][j]);
            }
            System.out.println("");
        }
    }
}

public class Calender {

    public static void main(String[] args) {
        CalenderArrange q = new CalenderArrange();

        Scanner obj = new Scanner(System.in);
        String Given_Month;
        String Given_Year;
        System.out.println(" ");
        System.out.println("Please Write month in MMM format and year in YYYY");
        System.out.print("Enter month: ");
        Given_Month = obj.nextLine();
        System.out.print("Enter year: ");
        Given_Year = obj.nextLine();
        if(Given_Month.equals("Jan") || Given_Month.equals("jan") ){
            Given_Month = "Jan";
            q.GetDay(Given_Month,Given_Year);
        }
        else if(Given_Month.equals("Feb") || Given_Month.equals("feb")){
            Given_Month = "Feb";
            q.GetDay(Given_Month,Given_Year);
        }
        else if(Given_Month.equals("Mar") || Given_Month.equals("mar")){
            Given_Month = "Mar";
            q.GetDay(Given_Month,Given_Year);
        }
        else if(Given_Month.equals("Apr") || Given_Month.equals("apr")){
            Given_Month = "Apr";
            q.GetDay(Given_Month,Given_Year);
        }
        else if(Given_Month.equals("May") || Given_Month.equals("may")){
            Given_Month = "May";
            q.GetDay(Given_Month,Given_Year);
        }
        else if(Given_Month.equals("Jun") || Given_Month.equals("jun")){
            Given_Month = "Jun";
            q.GetDay(Given_Month,Given_Year);
        }
        else if(Given_Month.equals("Jul") || Given_Month.equals("jul")){
            Given_Month = "Jul";
            q.GetDay(Given_Month,Given_Year);
        }
        else if(Given_Month.equals("Aug") || Given_Month.equals("aug")){
            Given_Month = "Aug";
            q.GetDay(Given_Month,Given_Year);
        }
        else if(Given_Month.equals("Sep") || Given_Month.equals("sep")){
            Given_Month = "Sep";
            q.GetDay(Given_Month,Given_Year);
        }
        else if(Given_Month.equals("Oct") || Given_Month.equals("oct")){
            Given_Month = "Oct";
            q.GetDay(Given_Month,Given_Year);
        }
        else if(Given_Month.equals("Nov") || Given_Month.equals("nov")){
            Given_Month = "Nov";
            q.GetDay(Given_Month,Given_Year);
        }
        else if(Given_Month.equals("Dec") || Given_Month.equals("dec")){
            Given_Month = "Dec";
            q.GetDay(Given_Month,Given_Year);
        }
        else {
            System.out.println("Invalid Month or invalid format");
            System.out.println("Write month in MMM format");
        }




    }
}