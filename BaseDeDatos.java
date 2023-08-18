import java.util.ArrayList;
public class BaseDeDatos
{
   private ArrayList<Elemnto> items;
   public BaseDeDatos(){
       items = new ArrayList<Elemnto>();
   }
   public void addElemnto(Elemnto elElemnto){
       items.add(elElemnto);
   }
   public void list(){
       for(Elemnto item : items){
           item.print();
           System.out.println();
       }
   }
   
}
