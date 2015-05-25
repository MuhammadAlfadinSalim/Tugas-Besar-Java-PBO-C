package TugasBesar;
import java.io.*;

public class KelasLauncher extends Kelas{
	public static void main(String [] tugasbesar){
		
	/*identitasruang identitas = new identitasruang();
	kondisiruang koruang = new kondisiruang();
	kebersihan bersih = new kebersihan();
	lingkungan lingkung = new lingkungan();
	kenyamanan nyaman = new kenyamanan();
	keamanan aman = new keamanan();
	kebersihan bersih = new kebersihan();
	///////////////////////////////////////////////////////////////
	identitas.in();
	koruang.in();
	bersih.in();
	lingkung.in();
	nyaman.in();
	aman.in();
	
	///////////////////////////////////////////////////////////////
	identitas.proc();
	koruang.proc();
	bersih.proc();
	lingkung.proc();
	nyaman.proc();
	aman.proc();
	
	///////////////////////////////////////////////////////////////
	identitas.out();
	koruang.out();
	bersih.out();
	lingkung.out();
	nyaman.out();
	aman.out();*/
		//kenyamanan nyaman = new kenyamanan();
		CCTV cctv = new CCTV();
		Kelas kls = new Kelas();
		//nyaman.in();
		cctv.in();
		//nyaman.proc();
		cctv.proc();
		//nyaman.out();
		cctv.out();
		try {
			
			FileWriter tulis = new FileWriter("save.txt");
			BufferedWriter tulis2 = new BufferedWriter(tulis);
			tulis2.write(""+cctv.result);
			tulis2.newLine();
			tulis2.write(""+cctv.result2);
			tulis2.newLine();
			tulis2.write(""+cctv.result3);
			tulis2.newLine();
			tulis2.write(""+cctv.result4);
			tulis2.newLine();
			tulis2.write(""+cctv.result5);
			tulis2.newLine();
			tulis2.close();
		//ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("save.sf"));
		//oos.writeObject(cctv);
		//oos.writeObject(two);
		//oos.writeObject(three);
		//oos.close();
		} catch(IOException ex) {
		ex.printStackTrace();
		}
		//cctv = null;
		//two = null;
		//three = null;
		
		
		System.out.println("\n\nDeserialized Object....\n");
		try {
			
			File baca = new File("save.txt");
			FileReader read = new FileReader(baca);
			BufferedReader reader = new BufferedReader(read);
			//reader.read();
			//reader.readLine();
			
			
			
			//ObjectInputStream ois = new ObjectInputStream(new FileInputStream("save.sf"));
			//CCTV cctvrestore = (CCTV) ois.readObject();
		
			String tampung = null;
			while((tampung = reader.readLine()) != null){
				System.out.println(tampung);
			}
		//System.out.println("One’s type: ");
		reader.close();
		
		} catch(Exception ex) {
		ex.printStackTrace();
		}
	}
}
