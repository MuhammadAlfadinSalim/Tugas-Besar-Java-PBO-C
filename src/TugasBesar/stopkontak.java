/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasBesar;

/**
 *
 * @author OWNER
 */
public class stopkontak extends Sarana implements perhitungan{

    @Override
    void in() {
        
    System.out.print("\nJumlah Stop Kontak/Steker : ");
	Double jumlahsteker = scan.nextDouble();
	kls.setJumlahsteker(jumlahsteker);
	
	System.out.print("kondisi Steker : ");
	String Kondisisteker = scan.next();
	kls.setKondisisteker(Kondisisteker);
	
	System.out.print("posisi steker : ");
	String Posisisteker = scan.next();
	kls.setPosisisteker(Posisisteker);
        
    }

    @Override
    public void proc() {
        
		if (kls.getJumlahsteker() >= 4) //1
		{
			
			a1 = x;
			n1 = n1 + 1;
			if (kls.getKondisisteker().equalsIgnoreCase("Baik")) //2
			{
				a2 = x;
				n1 = n1 + 1;	
				if (kls.getPosisisteker().equalsIgnoreCase("Pojok")) //3
				{
					a3 = x;
					n1 = n1 + 1;
				}
				else //3
				{
					a3 = y;
					n1 = n1 + 0;
					
				}
			}
			else // 2 
			{
				a2 = y;
				n1 = n1 + 0;
				if (kls.getPosisisteker().equalsIgnoreCase("Pojok Ruang dan dekat dosen")) //3
				{
					a3 = x;
					n1 = n1 + 1;
					
				}
				else //3
				{
					a3 = y;
					n1 = n1 + 0;
					
				}
			}
		}
		else // 1 
		{
			
			a1 = y;
			n1 = n1 + 0;
			if (kls.getKondisisteker().equalsIgnoreCase("Baik")) //2
			{
				a2 = x;
				n1 = n1 + 1;	
				if (kls.getPosisisteker().equalsIgnoreCase("Pojok Ruang dan dekat dosen")) //3
				{
					a3 = x;
					n1 = n1 + 1;
					
				}
				else //3
				{
					a3 = y;
					n1 = n1 + 0;
					
				}
			}
			else // 2 
			{
				a2 = y;
				n1 = n1 + 0;
				if (kls.getPosisisteker().equalsIgnoreCase("Pojok Ruang dan dekat dosen")) //3
				{
					a3 = x;
					n1 = n1 + 1;
					
				}
				else //3
				{
					a3 = y;
					n1 = n1 + 0;

				}
			}
		}
		persen1 = (n1*100)/3;
        
    }

    @Override
    void out() {
        
        System.out.print("\nJumlah Steker : "+kls.getJumlahsteker() +"  (" + ""+a1 +")");
        
        System.out.print("\nKondisi STeker : "+kls.getKondisisteker() +"  (" + ""+a2 +")");
        
        System.out.print("\nPosisi Steker : "+kls.getPosisisteker() +"  (" + ""+a3 +")");
        
        System.out.print("\nJumlah Sesuai = "+n1);
	System.out.print("\nKesesuaian = "+persen1 + "%");
    }
    
    
}