import java.util.HashMap;
import java.util.LinkedList;

public class Hashmap {

	public static void main(String[] args) {
		
		HashMap<String,Integer> people = new HashMap<String,Integer>();
		
		people.put("Umit",25);
		people.put("Ahmet",30);
		people.put("Mehmet",35);
		
		for(String i:people.keySet()) {
			System.out.println("Key:"+i+"-Value:"+people.get(i));
		}
		
		LinkedList<String> cars = new LinkedList<String>();
		
		cars.add("Volvo");
		cars.add("Mercedes");
		cars.add("Supra");
		cars.add(1,"Mazda");
		
		String a =cars.get(1);
		
		if(a=="Mazda") {
			System.out.println("Esitlik saglandi");
			//adres karsilastirma -1. indekse mazda atadik
		}
		else if(a.equals(cars.get(1))) {
			System.out.println("Equals saglandi");
			//icerik karsilastirma -
		}
		else {
			System.out.println("Esitlik saglanamadi");
		}
		
		try {
			int[] dizi = {1,2,3};
			System.out.println(dizi[10]);
			System.out.println("Buraya ulasti.");
		}catch(Exception e) {
			// System.out.println("Bir seyler yanlis gidiyor.");
		}
		
		
	}
}
