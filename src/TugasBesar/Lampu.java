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
public class Lampu extends Sarana {
    
        @Override
        void in() {
        
        System.out.print("Jumlah Lampu : ");
	Double jumlahlampu = scan.nextDouble();
	kls.setJumlahlampu(jumlahlampu);
	
	System.out.print("kondisi lampu : ");
	String Kondisilampu = scan.next();
	kls.setKondisilampu(Kondisilampu);
	
	System.out.print("posisi lampu : ");
	String Posisilampu = scan.next();
	kls.setPosisilampu(Posisilampu);
        
    }

    void proc() {
        
		if (kls.getJumlahlampu() >= 18) //1
		{
			
			c1 = x;
			n3 = n3 + 1;
			if (kls.getKondisilampu().equalsIgnoreCase("baik")) //2
			{
				c2 = x;
				n3 = n3 + 1;	
				if (kls.getPosisilampu().equalsIgnoreCase("atap ruangan")) //3
				{
					c3 = x;
					n3 = n3 + 1;
				}
				else //3
				{
					c3 = y;
					n3 = n3 + 0;
					
				}
			}
			else // 2 
			{
				c2 = y;
				n3 = n3 + 0;
				if (kls.getPosisilampu().equalsIgnoreCase("atap ruangan")) //3
				{
					c3 = x;
					n3 = n3 + 1;
					
				}
				else //3
				{
					c3 = y;
					n3 = n3 + 0;
					
				}
			}
		}
		else // 1 
		{
			
			c1 = y;
			n3 = n3 + 0;
			if (kls.getKondisilampu().equalsIgnoreCase("baik")) //2
			{
				c2 = x;
				n3 = n3 + 1;	
				if (kls.getPosisilampu().equalsIgnoreCase("atap ruangan")) //3
				{
					c3 = x;
					n3 = n3 + 1;
					
				}
				else //3
				{
					c3 = y;
					n3 = n3 + 0;
					
				}
			}
			else // 2 
			{
				c2 = y;
				n3 = n3 + 0;
				if (kls.getPosisilampu().equalsIgnoreCase("atap ruangan")) //3
				{
					c3 = x;
					n3 = n3 + 1;
					
				}
				else //3
				{
					c3 = y;
					n3 = n3 + 0;

				}
			}
		}
		persen3 = (n3*100)/3;
        
    }

    @Override
    void out() {
        
        System.out.print("\nJumlah Jumlah lampu : "+kls.getJumlahlampu() +"  (" + ""+c1 +")");
        
        System.out.print("\nKondisi lampu : "+kls.getKondisilampu() +"  (" + ""+c3 +")");
        
        System.out.print("\nPosisi lampu : "+kls.getPosisilampu() +"  (" + ""+c2 +")");
        
        System.out.print("\nJumlah Sesuai = "+n3);
	System.out.print("\nKesesuaian = "+persen3 + "%");
    }
    
    
    
}