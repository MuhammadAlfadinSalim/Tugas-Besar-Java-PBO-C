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
public class LCD extends Sarana {
    
        @Override
        void in() {
        
        System.out.print("Jumlah lcd : ");
	Double jumlahlcd = scan.nextDouble();
	kls.setJumlahkabellcd(jumlahlcd);
	
	System.out.print("kondisi lcd : ");
	String Kondisikabellcd = scan.next();
	kls.setKondisikabellcd(Kondisikabellcd);
	
	System.out.print("posisi lcd : ");
	String Posisikabellcd = scan.next();
	kls.setPosisikabellcd(Posisikabellcd);
        
    }

    void proc() {
        
		if (kls.getJumlahkabellcd()>=1) //1
		{
			
			b1 = x;
			n2 = n2 + 1;
			if (kls.getKondisikabellcd().equals("berfungsi")) //2
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
