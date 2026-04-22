package Code.Sort.Tierpark;

public class HashMapTier {

    private Tier[] tierTable;
    private int size;
    private int cap;

    public HashMapTier(int cap){
        tierTable = new Tier[cap];
        size = 0;
        this.cap = cap;
    }

    private int hash(String key){
        int h = Math.abs(key.hashCode());
        return h % tierTable.length;
    }

    private void reHash(){
        if(cap* 0.7 < size){
            Tier[] oldTable = tierTable;
            cap = cap*2+1;
            tierTable = new Tier[cap];
            size = 0;

            for(Tier t : oldTable){
                Tier current = t;
                while(current != null){
                    put(current.getName(), current.getArt(), current.getAlter());
                    current = current.getNext();
                }
            }
        }
    }

    public void put(String name, String art, int alter){
        reHash();

        int pos = hash(name);
        Tier newTier = new Tier(name, art, alter);

        if (tierTable[pos] != null) {
            newTier.setNext(tierTable[pos]);
        }
        tierTable[pos] = newTier;
        size++;
    }

    public Tier get(String name) throws NoSuchTierFound {
        int pos = hash(name);
        if(tierTable[pos] == null) throw new NoSuchTierFound("Kein Tier mit diesen Namen vorhanden");
        if(tierTable[pos].getName().equals(name)){
            return tierTable[pos];
        }
        else{
            Tier current = tierTable[pos];
            while(current != null){
                if(current.getName().equals(name)) {
                    return current;
                }
                current = current.getNext();
            }
            throw new NoSuchTierFound("Kein Tier mit diesen Namen vorhanden");
        }
    }

    public void delet(String name) throws NoSuchTierFound{
        int pos = hash(name);
        if(tierTable[pos] == null) throw new NoSuchTierFound("Kein Tier mit diesem Namen vorhanden");
        if(tierTable[pos].getName().equals(name)){
            tierTable[pos] = null;
            size--;
        }
        else{
            if(tierTable[pos].getNext() == null) throw new NoSuchTierFound("Kein Tier mit diesem Namen vorhanden");
            if(tierTable[pos].getNext().getName().equals(name)){
                tierTable[pos] = tierTable[pos].getNext();
            }
            Tier current = tierTable[pos].getNext();
            Tier beforecurrent = tierTable[pos];
            while(current != null){
                if(current.getName().equals(name)){
                    beforecurrent.setNext(current.getNext());
                    size--;
                    return;
                }
                beforecurrent = current;
                current = current.getNext();
            }
            throw new NoSuchTierFound("Kein Tier mit diesen Namen vorhanden");
        }
    }

    public void delet(int index){
        tierTable[index] = null;
        size--;
    }



}
