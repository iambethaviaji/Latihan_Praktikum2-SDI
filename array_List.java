package latihan_prak2;
import java.util.LinkedList;
//ArrayList <String> hewan = new ArrayList<>();
//ArrayList <String> DeleteHewan = new ArrayList<>();


public class array_List {
	public static void main(String[] args) {
		LinkedList<String> hewan = new LinkedList<>();
		LinkedList<String> DeleteHewan = new LinkedList<>();
		
		hewan.add("Sapi");
		hewan.add("Kelinci");
		hewan.add("Kambing");
		hewan.add("Unta");
		hewan.add("Domba");
		System.out.println("Hewan : "+hewan);
		
		DeleteHewan.add("Kelinci");
		DeleteHewan.add("Kambing");
		DeleteHewan.add("Unta");
		System.out.println("Hewan yang dihapus: ");
		System.out.println(DeleteHewan);
		
		for(int i=0; i<hewan.size();i++) {
			for(int j=0; j<DeleteHewan.size();j++) {
				if(hewan.get(i) == DeleteHewan.get(j)) {
					hewan.remove(i);
				}
			}
		}
		
		System.out.println("Output Hewan : ");
		System.out.println(hewan);
		
	}
}