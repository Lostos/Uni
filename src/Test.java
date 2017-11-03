public class Test {


    public static void main(String[] args) {
        System.out.println(interval(9,2));


    }
public static int interval(int a, int b){
     int i = 0;
        while(a>b){
       i =  i + b;
       b++;


     }   return i;

}

}
