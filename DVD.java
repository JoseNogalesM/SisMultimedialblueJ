

public class DVD extends Elemnto
{
    private String director;
    
    public DVD(String elTitulo, String elDirector, int tiempo){
        super(elTitulo, tiempo);
        director=elDirector;
    }
    public String getDirector(){
        return director;
    }
    public void print(){
        System.out.println("DVD:");
        System.out.println("titulo: "+ getTitulo());
        System.out.println("Director:" +director);
    
    }
}
