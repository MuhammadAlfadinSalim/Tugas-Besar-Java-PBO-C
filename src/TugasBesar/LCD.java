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
public class LCD extends Sarana implements perhitungan{
    
    @Override
    void in() {
        
    System.out.print("Jumlah lcd : ");
	String jumlahlcd = scan.nextLine();
	kls.setJumlahkabellcd(jumlahlcd);
	
	System.out.print("kondisi lcd : ");
	String Kondisilcd = scan.next();
	kls.setKondisisteker(Kondisilcd);
	
	System.out.print("posisi lcd : ");
	String Posisilcd = scan.next();
	kls.setPosisisteker(Posisilcd);
        
    }

    @Override
    public void proc() {
        
		if (kls.getJumlahkabellcd().equalsIgnoreCase("1")) //1
		{
			
			b1 = x;
			n2 = n2 + 1;
			if (kls.getKondisikabellcd().equalsIgnoreCase("berfungsi")) //2
			{
				b2 = x;
				n2 = n2 + 1;	
				if (kls.getPosisikabellcd().equalsIgnoreCase("dekat dosen")) //3
				{
					b3 = x;
					n2 = n2 + 1;
				}
				else //3
				{
					b3 = y;
					n2 = n2 + 0;
					
				}
			}
			else // 2 
			{
				b2 = y;
				n2 = n2 + 0;
				if (kls.getPosisikabellcd().equalsIgnoreCase("dekat dosen")) //3
				{
					b3 = x;
					n2 = n2 + 1;
					
				}
				else //3
				{
					b3 = y;
					n2 = n2 + 0;
					
				}
			}
		}
		else // 1 
		{
			
			b1 = y;
			n2 = n2 + 0;
			if (kls.getKondisikabellcd().equalsIgnoreCase("berfungsi")) //2
			{
				b2 = x;
				n2 = n2 + 1;	
				if (kls.getPosisikabellcd().equalsIgnoreCase("dekat dosen")) //3
				{
					b3 = x;
					n2 = n2 + 1;
					
				}
				else //3
				{
					b3 = y;
					n2 = n2 + 0;
					
				}
			}
			else // 2 
			{
				b2 = y;
				n2 = n2 + 0;
				if (kls.getPosisikabellcd().equalsIgnoreCase("dekat dosen")) //3
				{
					b3 = x;
					n2 = n2 + 1;
					
				}
				else //3
				{
					b3 = y;
					n2 = n2 + 0;

				}
			}
		}
		persen2 = (n2*100)/3;
        
    }

    @Override
    void out() {
        
        System.out.print("\nJumlah Jumlah Kabel LCD : "+kls.getJumlahkabellcd() +"  (" + ""+b1 +")");
        
        System.out.print("\nKondisi Kabel LCD : "+kls.getKondisikabellcd() +"  (" + ""+b2 +")");
        
        System.out.print("\nPosisi Kabel LCD : "+kls.getPosisikabellcd() +"  (" + ""+b3 +")");
        
        System.out.print("\nJumlah Sesuai = "+n2);
	System.out.print("\nKesesuaian = "+persen2 + "%");
    }
    
    
    
}
