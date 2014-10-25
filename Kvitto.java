import java.util.*;
import java.util.Map.Entry;


public class Kvitto {
	Map<vara, Integer> varulist = new HashMap<>();
//	Integer står för antalet av varje vara
		
	
	public Kvitto(){
		
		
		}
	
	public void addVara(vara v){
		if(varulist.containsKey(v)){
			Integer nyttAntal = varulist.get(v)+1;
			vara newVara = v;
			removeVara(v);
//			ta bort det gamla värdet
			varulist.put(newVara, nyttAntal);
		}else{
			varulist.put(v, 1);
		}
	}
		
	public void removeVara(vara v){
		if(varulist.containsKey(v)){
			varulist.remove(v);
		}
	}
	
	

	public float summeraAllaVaror(){
		float sum = 0;
		for (vara v : varulist.keySet()) {
			   sum += v.getPris()*varulist.get(v);
//			   			^^^^^^fixa fram nyckeln dvs. antalet av varan
			}
		return sum;
	}
	
	
		
//	public void addVara(vara v){
//		for(int i;i< varulist.size(); i++){
//			if(i.equals(v)){
//				Integer nyttAntal = varulist.get(i)+1;
//				varulist.remove(i);
////				ta bort det gamla värdet
//				varulist.put(v, nyttAntal);
//			}else{
//				varulist.put(v, 1);
//			}
//		}
//		
//		
//	}
	
	public String toString(){
		String s = "";
		for (vara v : varulist.keySet()) {
			s += v.toString();
//			   						
			}
		return s;
	}
	
	
}
