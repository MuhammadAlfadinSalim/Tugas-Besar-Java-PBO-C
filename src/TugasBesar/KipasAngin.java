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
public class KipasAngin extends Sarana {
    
        @Override
        void in() {
        
    System.out.print("Jumlah Kipas Angin : ");
	String jumlahkipasangin = scan.nextLine();
	kls.setJumlahkipasangin(jumlahkipasangin);
	
	System.out.print("kondisi kipas Angin : ");
	String Kondisikipasangin = scan.next();
	kls.setKondisikipasangin(Kondisikipasangin);
	
	System.out.print("posisi Kipas Angin : ");
	String Posisikipasangin = scan.next();
	kls.setPosisikipasangin(Posisikipasangin);
        
    }

    void proc() {
        
		if (kls.getJumlahkipasangin().equalsIgnoreCase("2")) //1
		{
			
			d1 = x;
			n4 = n4 + 1;
			if (kls.getKondisikipasangin().equalsIgnoreCase("baik")) //2
			{
				d2 = x;
				n4 = n4 + 1;	
				if (kls.getPosisikipasangin().equalsIgnoreCase("atap ruangan")) //3
				{
					d3 = x;
					n4 = n4 + 1;
				}
				else //3
				{
					d3 = y;
					n4 = n4 + 0;
					
				}
			}
			else // 2 
			{
				d2 = y;
				n4 = n4 + 0;
				if (kls.getPosisikipasangin().equalsIgnoreCase("atap ruangan")) //3
				{
					d3 = x;
					n4 = n4 + 1;
					
				}
				else //3
				{
					d3 = y;
					n4 = n4 + 0;
					
				}
			}
		}
		else // 1 
		{
			
			d1 = y;
			n4 = n4 + 0;
			if (kls.getKondisikipasangin().equalsIgnoreCase("baik")) //2
			{
				d2 = x;
				n4 = n4 + 1;	
				if (kls.getPosisikipasangin().equalsIgnoreCase("atap ruangan")) //3
				{
					d3 = x;
					n4 = n4 + 1;
					
				}
				else //3
				{
					d3 = y;
					n4 = n4 + 0;
					
				}
			}
			else // 2 
			{
				d2 = y;
				n4 = n4 + 0;
				if (kls.getPosisikipasangin().equalsIgnoreCase("atap ruangan")) //3
				{
					d3 = x;
					n4 = n4 + 1;
					
				}
				else //3
				{
					d3 = y;
					n4 = n4 + 0;

				}
			}
		}
		persen4 = (n4*100)/3;
        
    }

    @Override
    void out() {
        
        System.out.print("\nJumlah Jumlah Kipas Angin : "+kls.getJumlahkipasangin() +"  (" + ""+d1 +")");
        
        System.out.print("\nKondisi kipas Angin : "+kls.getKondisikipasangin() +"  (" + ""+d3 +")");
        
        System.out.print("\nPosisi Kipas Angin : "+kls.getPosisikipasangin() +"  (" + ""+d2 +")");
        
        System.out.print("\nJumlah Sesuai = "+n4);
	System.out.print("\nKesesuaian = "+persen4 + "%");
    }
    
    
    
}
