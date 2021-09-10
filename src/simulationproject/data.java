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
public class data {

    private int Demand;
    private int frequancy;
    private float probaility;
    private float comulative;
    private float first;
    private float last;
    private final String data = "data.txt";
    fileManger FManger = new fileManger();
    public static ArrayList<data> dati = new ArrayList<data>();

    public data(int demand, int frequancy, float probabiley, float comulative, float first, float last) {
        this.Demand = demand;
        this.frequancy = frequancy;
        this.probaility = probabiley;
        this.comulative = comulative;
        this.first = first;
        this.last = last;

    }

    public data() {
    }

    public int getDemand() {
        return Demand;
    }

    public void setDemand(int Demand) {
        this.Demand = Demand;
    }

    public int getFrequancy() {
        return frequancy;
    }

    public void setFrequancy(int frequancy) {
        this.frequancy = frequancy;
    }

    public float getProbaility() {
        return probaility;
    }

    public void setProbaility(float probaility) {
        this.probaility = probaility;
    }

    public float getComulative() {
        return comulative;
    }

    public void setComulative(float comulative) {
        this.comulative = comulative;
    }

    public float getFirst() {
        return first;
    }

    public void setFirst(float first) {
        this.first = first;
    }

    public float getLast() {
        return last;
    }

    public void setLast(float last) {
        this.last = last;
    }

    public boolean addTo_fileTRUE() {
        if (FManger.write(getDATA(), data, true)) {
            return true;
        } else {
            return false;
        }
    }
    public boolean addTo_fileFALSE() {
        if (FManger.write(getDATA(), data, false)) {
            return true;
        } else {
            return false;
        }
    }
    private String getDATA() {
        return this.getDemand() + ";" + this.getFrequancy() + ";" + this.getProbaility() 
                + ";" + this.getComulative() + ";" + this.getFirst() + ";" + this.getLast();
    }
    public void loadFromFile() {
        dati = (ArrayList<data>) (Object) FManger.read(data);
    }
    public void deleteData() {
        FManger.write("", data, false);
    }
}
