import java.util.*;


public class Kvitto {
	ArrayList<Vara> list = new ArrayList<Vara>();	
	
	public Kvitto(){
		
		
		}
		
	public void addVara(Vara v){
		list.add(v);	
	}
	
	public String toString(){
		String s = "";
		for(Vara v: list){
			s += v.toString();
		}
		return s;
	}
	
	
}