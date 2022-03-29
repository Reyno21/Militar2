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
public class Nodo <T>
{
    
    private T obj;
    private Nodo sig;
    private String etq;

    public Nodo()
    {
    }

    public Nodo(T obj,  String etq)
    {
        this.obj = obj;
        this.etq = etq;
    }


    public String getEtq()
    {
        return etq;
    }

    public void setEtq(String etq)
    {
        this.etq = etq;
    }

    public Nodo getSig()
    {
        return sig;
    }

    public void setSig(Nodo sig)
    {
        this.sig = sig;
    }    
    
    public T getObj()
    {
        return obj;
    }

    public void setObj(T obj)
    {
        this.obj = obj;
    }
    
    public Nodo(T obj)
    {
       this.obj=obj;
       sig=null;
    }
    
    public String desp()
    {
         try
         {
            return obj.toString();
         }catch(Exception err)
         {
            System.out.println("Error"+err.toString());
            return " ";
         }
    }
  
}
