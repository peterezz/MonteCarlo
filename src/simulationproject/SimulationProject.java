package simulationproject;

import java.util.ArrayList;

public class SimulationProject {

    public static void main(String[] args) {
        data dat1 = new data();
         data dat = new data();
        mainFrame mainFrame1 = new mainFrame();
        mainFrame1.setVisible(true);
        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            public void run() {
               
                dat.deleteData();
                  data2 dat2 = new data2();
                dat2.deleteData();
                 
                dat1.deleteData();
                System.out.println("success");
            }
        }, "Shutdown-thread"));

    }
// ArrayList<Integer> List = new ArrayList<Integer>();
// List.add(0,90);
// List.add(1, 40);
// System.out.println(List);
// int index=List.indexOf(90);
// List.set(index, 50);
// System.out.println(List);
// List.remove(index);
//// System.out.println(List);
//   listOf_Data x= new listOf_Data(1,50, 60);
//   System.out.println(x.addTo_List());
//   listOf_Data y= new listOf_Data(2,50, 60);
//   System.out.println(y.addTo_List());
//   listOf_Data z= new listOf_Data(3,50, 80);
//   System.out.println(z.addTo_List());
//        System.out.println(z.ave());

}


