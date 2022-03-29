/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interno;

/**
 *
 * @author gadpa
 */
public class PilaDinamica
{    
    Nodo tope = null;  //tope mueve cajas
    
    public boolean vacia()
    {
        return tope== null;
    }
    
    public boolean inserta(Nodo n) //n trae caja
    {
        if (n!=null)
        {
            n.setSig(tope);
            tope=n;
            return true;
        }
        return false;       
    }
    
    public Nodo elimina()
    {
        Nodo aux=null;   //aux se lleva la caja
        if (!vacia())
        {
            aux=tope;
            tope=aux.getSig();
            aux.setSig(null);            
        }
        return aux;
    }
    
    public Object busca(String bus,PilaDinamica pd)
    {       
        PilaDinamica p1 = new PilaDinamica();  
        String x = "no se encontro el dato";
        Nodo y;
        while(!pd.vacia())
        {
            y= pd.elimina();            
            if (bus.equals(y.desp()))
            {        
                System.out.println("Encontrado "+y.desp());
                x="dato encontrado";
            }
            else
            {                                                                             
                if (y!=null)
                {
                    p1.inserta(y);                             
                }                
            }                     
        }    
        while(!p1.vacia())
        {
            pd.inserta(p1.elimina());
        }
        return x;
    }
}
