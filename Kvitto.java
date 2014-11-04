import java.util.*;
import java.util.Map.Entry;


public class Kvitto {
	Map<Vara, Integer> varulist = new HashMap<>();
//	Integer står för antalet av varje vara
		
	
	public Kvitto(){
		
		
		}
	
	public void addVara(Vara v){
		if(v==null){
//			ska man skriva något här?
			return;
		}
		if(varulist.containsKey(v)){
			Integer nyttAntal = varulist.get(v)+1;
			Vara newVara = v;
			removeVara(v);
//			ta bort det gamla värdet
			varulist.put(newVara, nyttAntal);
		}else{
			varulist.put(v, 1);
		}
	}
		
	public void removeVara(Vara v){
		if(varulist.containsKey(v)){
			varulist.remove(v);
		}
	}
	
	
	public Integer getAntalAvVara(Vara v){
		for (Entry<Vara, Integer> entry : varulist.entrySet()) {
			   if(entry.getKey().equals(v)){
				   return entry.getValue();
			   }
			}
		return -1;
//		om det inte finns några varor alls så återges det felaktiga värdet -1
	}

	public float summeraAllaVaror(){
		float sum = 0;
		for (Entry<Vara, Integer> entry : varulist.entrySet()) {
			   sum += entry.getKey().taPris()*entry.getValue();
//				   lägg till Varans pris^multiplicerat ^med antalet av varan
			   }
		
		return sum;
	}
	
	
		
	
	public String toString(){
		String s = "";
		for (Vara v : varulist.keySet()) {
			s += v.toString();
//			   						
			}
		return s;
	}
	
	
}
