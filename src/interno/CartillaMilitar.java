/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interno;

/**
 *
 * @author Reyno21
 */
public class CartillaMilitar
{
    private String Nombre;
    private int Clase;
    private Boolean Remiso;

    public CartillaMilitar(String Nombre, int Clase)
    {
        this.Nombre = Nombre;
        this.Clase = Clase;
        if (Clase >18)
        {
            this.Remiso = true;
        } else
        {
            this.Remiso = false;
        }
        
        
    }

    public CartillaMilitar()
    {
    }

 
    public String getNombre()
    {
        return Nombre;
    }

    public void setNombre(String Nombre)
    {
        this.Nombre = Nombre;
    }

    public int getClase()
    {
        return Clase;
    }

    public void setClase(int Clase)
    {
        this.Clase = Clase;
    }

    public Boolean getRemiso()
    {
        return Remiso;
    }

    public void setRemiso(Boolean Remiso)
    {
        this.Remiso = Remiso;
    }
    
}
