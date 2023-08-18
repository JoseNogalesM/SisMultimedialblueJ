
/**
 * Write a description of class Elemnto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Elemnto
{
    private String titulo;
    private int duracion;
    private boolean loTengo;
    private String comentario;
    /**
     * Constructor for objects of class Elemnto
     */
    public Elemnto(String elTitulo, int tiempo)
    {
          titulo=elTitulo;
          duracion=tiempo;
          loTengo=false;
          comentario="";
    }

    public void setComentario(String comentario){
        this.comentario=comentario;
    }
    public String getComentario(){
        return comentario;
    }
    public void setLotengo(boolean tengo){
        loTengo=tengo;
    }
    public boolean getLoTengo(){
        return loTengo;
    }
    public void print(){
        System.out.println("Elemento");
    }
    public String getTitulo(){
        return titulo;
    }
}
