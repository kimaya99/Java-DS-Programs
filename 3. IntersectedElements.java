import java.util.ArrayList;
import java.util.List;

public class IntersectedElements {
      static int a[]={2,3,4,5,7,8};
       static int b[]={5,7,8,9,34};
       static int c[]={2,3,5,7,9};
       

        static int x=0,y=0,z=0;
     
    public static void main (String args[])
    {
      
        List<Integer> result = new ArrayList<Integer>();

        while(!outOfBounds()){
            if(a[x]== b[y] && b[y] == c[z]){
                result.add(a[x]);
                x++;
                y++;
                z++;
            }

            else if (a[x]<b[y]){
                x++;
            }
            else if (b[y]<a[x]){
                y++;
            }
            else
            {
                z++;
            }
        }
        System.out.println(result);
        
    }

    public static boolean outOfBounds(){
      
        return (x>=a.length || y>=b.length || z>=c.length);
    }
}
// 3n
