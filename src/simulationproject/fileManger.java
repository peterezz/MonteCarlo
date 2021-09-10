/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulationproject;

/**
 *
 * @author Peter
 */
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class fileManger {

    public boolean write(String Query, String FilePath, boolean appendType) {

        PrintWriter writter = null;
        try {
            System.out.print("\nwritting in ! " + FilePath);

            writter = new PrintWriter(new FileWriter(new File(FilePath), appendType));
            writter.println(Query);

            System.out.println(" ... Done ! ");
            return true;
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            writter.close();
        }
        return false;
    }

    public ArrayList<Object> read(String FilePath) {
        // Scanner input = new Scanner(System.in);

        Scanner Reader = null;
        try {
            System.out.println("Reading ! From " + FilePath);

            Reader = new Scanner(new File(FilePath));
            

        } catch (FileNotFoundException e) {
            System.out.println(e);
        }

        if (FilePath.equals("data.txt")) {

            ArrayList<data> addData = new ArrayList<data>();
            data x;

            while (Reader.hasNext()) {

                x = new data();
                String Line = Reader.nextLine();
                String[] seprated = Line.split(";");

               //demand;frequancy;probabilty;comulative;first;last;
                x.setDemand(Integer.parseInt(seprated[0]));
                x.setFrequancy(Integer.parseInt(seprated[1]));
                x.setProbaility(Float.parseFloat(seprated[2]));
                x.setComulative(Float.parseFloat(seprated[3]));
                x.setFirst(Float.parseFloat(seprated[4]));
                x.setLast(Float.parseFloat(seprated[5]));
               

                addData.add(x);
            }

            return (ArrayList<Object>) (Object) addData;
           

        } else if (FilePath.equals("dataa.txt")) {

            ArrayList<data2> data2 = new ArrayList<data2>();
            data2 x;

            while (Reader.hasNext()) {

                x = new data2();
                String Line = Reader.nextLine();
                String[] seprated = Line.split(";");

                // Username;id;password;Emailaddress;projecID;bugID;
              
                x.setDay(Integer.parseInt(seprated[0]));
                   x.setRandom(Integer.parseInt(seprated[1]));
                   
                data2.add(x);
            }

            return (ArrayList<Object>) (Object) data2;
        }
//        } else if (FilePath.equals("tester.txt")) {
//
//            ArrayList<data> testers = new ArrayList<data>();
//            data x;
//
//            while (Reader.hasNext()) {
//
//                x = new data();
//                String Line = Reader.nextLine();
//                String[] seprated = Line.split(";");
//
//                // Username;id;password;Emailaddress;projecID;
//                x.setUserName(seprated[0]);
//
//                x.setId(Integer.parseInt(seprated[1]));
//                x.setPass(seprated[2]);
//                x.setEmailAddress(seprated[3]);
//                x.setProjectId(Integer.parseInt(seprated[4]));
//
//                testers.add(x);
//            }
//
//            return (ArrayList<Object>) (Object) testers;
//
//        } else if (FilePath.equals("manger.txt")) {
//
//            ArrayList<projectManger> mangers = new ArrayList<projectManger>();
//            projectManger x;
//
//            while (Reader.hasNext()) {
//
//                x = new projectManger();
//                String Line = Reader.nextLine();
//                String[] seprated = Line.split(";");
//
//                x.setUserName(seprated[0]);
//
//                x.setId(Integer.parseInt(seprated[1]));
//                x.setPass(seprated[2]);
//                x.setEmailAddress(seprated[3]);
//
//                mangers.add(x);
//            }
//
//            return (ArrayList<Object>) (Object) mangers;
//        } //        } else if (FilePath.equals("Courses.txt")) {
        //
        //            ArrayList<Course> Courses = new ArrayList<Course>();
        //            Course x;
        //
        //            while (Reader.hasNext()) {
        //
        //                x = new Course();
        //                String Line = Reader.nextLine();
        //                String[] seprated = Line.split("@");
        //
        //                // PL2@CS213@100@
        //                x.setCname(seprated[0]);
        //                x.setCId(seprated[1]);
        //                x.setCreditHours(Integer.parseInt(seprated[2]));
        //
        //                Courses.add(x);
        //            }
        //
        //            return (ArrayList<Object>) (Object) Courses;
        //
        
            return null;
}
    }


//
//    }
//
//}

