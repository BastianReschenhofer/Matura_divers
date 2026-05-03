package Code.Hashen.BSP_Autoteile;

import java.util.ArrayList;
import java.util.List;

public class AutoTeileMap {

    private static final double LOAD_FACTOR = 0.7;
    private int size;
    private int CAP;

    private AutoTeil[] table;

    public AutoTeileMap(int CAP){
        this.CAP = CAP;
        size = 0;
        table = new AutoTeil[CAP];
    }

    public AutoTeil[] getTable(){return this.table;}

    public void put(AutoTeil autoTeil){

        if((double) CAP / size >= 0.7) rehash();

        int index = autoTeil.hashCode() % CAP;

        boolean updatet = false;

        if(table[index] == null){
            table[index] = autoTeil;
        }else{
            AutoTeil current = table[index];
            while(current != null){
                if(current.equals(autoTeil)){
                    //update Autoteil
                    current.setTeilNr(autoTeil.getTeilNr());
                    current.setPreis((autoTeil.getPreis()));
                    updatet = true;

                }
                current = current.getNext();
            }
            if(updatet) return;
            autoTeil.setNext(table[index]);
            table[index] = autoTeil;
        }
        size++;
    }

    public void rehash(){
        CAP = CAP * 2;

        AutoTeileMap newTable = new AutoTeileMap(CAP);
        for(int i = 0; i < table.length; i++){
            if(table[i] != null){
                AutoTeil current = table[i];
                while (current != null){
                    int index = current.hashCode() % CAP;
                    newTable.put(current);
                    current = current.getNext();
                }
            }
        }
        table = newTable.getTable();
    }

    public AutoTeil get(int key) {
        int index = key % CAP;
        if(table[index] == null) return null;
        if(table[index].getTeilNr() == key ) return table[index];
        else{
            AutoTeil current = table[index];
            while(current != null){
                if(current.getTeilNr() == key) return current;
                current = current.getNext();
            }
        }
        return null;
    }
}
