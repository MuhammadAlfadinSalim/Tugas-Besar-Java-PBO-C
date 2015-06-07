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

		
		//CCTV cctv = new CCTV();
		Kelas kls = new Kelas();
		
		//cctv.in();
		
		//cctv.proc();
		
		//cctv.out();
		try 
		{
			FileWriter tulis = new FileWriter("save.txt");
			BufferedWriter tulis2 = new BufferedWriter(tulis);
			//tulis2.write(""+cctv.result);
			tulis2.newLine();
			//tulis2.write(""+cctv.result2);
			tulis2.newLine();
			//tulis2.write(""+cctv.result3);
			tulis2.newLine();
			//tulis2.write(""+cctv.result4);
			tulis2.newLine();
			//tulis2.write(""+cctv.result5);
			tulis2.newLine();
			tulis2.close();
		} 
		
		catch(IOException ex) 
		{
		ex.printStackTrace();
		}
		
		System.out.println("\n\nDeserialized Object....\n");
		
		try 
		{
			File baca = new File("save.txt");
			FileReader read = new FileReader(baca);
			BufferedReader reader = new BufferedReader(read);
			
			String tampung = null;
			while((tampung = reader.readLine()) != null)
			{
				System.out.println(tampung);
			}
		
		reader.close();
		}
		
		catch(Exception ex) 
		{
		ex.printStackTrace();
		}
//=======
            /*
	kebersihan bersih = new kebersihan();
	bersih.in();
	bersih.proc();
	bersih.out();
        */
            
          /*  System.out.println("\n");
            stopkontak steker = new stopkontak();
            steker.in();
            steker.proc();
            steker.out();
            
            
            System.out.println("\n");
            LCD liquid = new LCD();
            liquid.in();
            liquid.proc();
            liquid.out();
            
            
            System.out.println("\n");
            Lampu lmp = new Lampu();
            lmp.in();
            lmp.proc();
            lmp.out();
            
            System.out.println("\n");
            KipasAngin kps = new KipasAngin();
            kps.in();
            kps.proc();
            kps.out();
            */
	}
}
