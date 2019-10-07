/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.EventListener;
import java.util.HashMap;

/**
 *
 * @author Abdul Aziz Al Basyir
 */
public class Produk {
    private ArrayList<HashMap> database = new ArrayList<HashMap>();
    public final Object colmns[] = {"ID", "Nama", "Jumlah"};
    
    public void add(Object... incommingData){
        System.out.println("Inserting ....");
        HashMap data = new HashMap<String, String>();
        
        for(int thisColmns = 0; thisColmns < this.colmns.length; thisColmns++){
            System.out.println(" > Insert " + incommingData[thisColmns] + " to " + colmns[thisColmns] );
            data.put(colmns[thisColmns], incommingData[thisColmns]);
        }
        
        database.add(data);
        System.out.println("Insert Success!");
    }
    
    public void fetch(Callback func){
        System.out.println("Fetching...");
        
        int maxColumns = this.colmns.length;
        for(int dataOn = 0; dataOn < database.size(); dataOn++){
            
            System.out.print(" > ");
            Object[] result = new Object[maxColumns];
            for(int x = 0; x < maxColumns; x++){
               Object columnsName = this.colmns[x];
               Object value = database.get(dataOn).get(columnsName);
               
               result[x] = value;
                
               System.out.print(result[x] + ", ");
               
              
            }
            
            System.out.print("\n Callback .....");
            func.fatch(result);
            System.out.println("Callbacck Done");
        }
        
        System.out.println("Fetching success");
    }
    
    public interface Callback{
        public void fatch(Object[] x);
    }
}
