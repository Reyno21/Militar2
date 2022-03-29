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
public class ColaDinamica
{
    Nodo f=null, a=null;
    Nodo aux;
    private int tam;

    public int getTam()
    {
        return tam;
    }

    public void setTam(int tam)
    {
        this.tam = tam;
    }
        
    public boolean vacia()
    {
        return a== null && f==null;
    }
    
    
    public boolean inserta(Nodo n)
    {
        boolean x=false;
        if(n!=null)
        {           
            if(f==null)
            {               
                f=a=n;  
                x=true;
            }else
            {
                a.setSig(n);
                a=n; 
                x=true;
            }  
            tam ++;
        }
        return x;
    }
    
    public Nodo elimina()
    {
        aux=null;
        if(!vacia())
        {
           if(f==a)
           {
               aux=f;
               f=a=null;
               
           }else
           {
                aux=f;
                f=aux.getSig();
                aux.setSig(null);
           }
           
        }
        tam --;
        return aux;
    }
    
    
}
