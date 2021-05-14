import java.util.ArrayList;
import java.util.List;
public class Purse { 
    private ArrayList <Coin> coins; 
    
    public Purse() { 
        ArrayList <Coin> coins = new ArrayList <Coin> (); 
    }
    public void add(Coin aCoin) { 
        coins.add(aCoin); 
    } 
    public double getTotal() {
        double total=0;
        for(Coin a:coins){
            total+=a.getValue();
        }
        return total;
    } 
    public int count(Coin aCoin) {
        int counter=0;
        for(int i=0; i<coins.size(); i++){
            if(coins.get(i).equals(aCoin)){
                counter++;
            }
        }
        return counter;
    } 
    public String findSmallest(){
        int index=0;
        double small = coins.get(0).getValue();
        for(int i=1;i<coins.size(); i++){
            if(coins.get(i).getValue()<small){
                small=coins.get(i).getValue();
                index=i;
            }
        }
        return coins.get(index).getName();
    }
}