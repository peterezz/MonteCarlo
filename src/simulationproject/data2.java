/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulationproject;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 *
 * @author Peter
 */
public class data2 {

    private int day;
      private int random;
        private int calc;
    
    private final String data = "dataa.txt";
    fileManger FManger = new fileManger();
    public static ArrayList<data2> dati2 = new ArrayList<data2>();

    public data2(int day) {
        this.day=day;
    }

    public data2() {
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getRandom() {
        return random;
    }

    public void setRandom(int random) {
        this.random = random;
    }

   
  

    public boolean addTo_fileTrue() {
        if (FManger.write(getDATA(), data, true)) {
            return true;
        } else {
            return false;
        }
    }
     public boolean addTo_fileFalse() {
        if (FManger.write(getDATA(), data, false)) {
            return true;
        } else {
            return false;
        }
    }

    private String getDATA() {
        return this.getDay()+ ";"+this.getRandom()+";" ;
    }

    public void loadFromFile() {
        dati2 = (ArrayList<data2>) (Object) FManger.read(data);
    }

//   public void deleteAllBugsInSameProject(int ProjectID) {
//        loadFromFile();
//        for (int i = 0; i < dati2.size(); i++) {
//            if (dati2.get(i).get()== ProjectID) {
//                dati.remove(i);
//            }
//        }
     
//    }

 

    public void deleteData() {
 FManger.write(  "", data, false);
    
    }
}

