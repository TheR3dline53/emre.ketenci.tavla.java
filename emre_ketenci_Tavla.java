import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Tavla {


    public static void main(String[] arguments) {
        ZarAt();


    }


    public static void ZarAt() {

        Random rand = new Random();
        int zar1 =  rand.nextInt(6);

        int zar2 =  rand.nextInt(6);

        System.out.println(ZarAdi(zar1));
        System.out.println(ZarAdi(zar2));

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Sayilarin Farsca karsiliklarini gormek istiyor musunuz?  (E/H)");
        String str = null;
        try {
            str = reader.readLine();
            
                switch (str.toUpperCase()){
                    case "E":
                        System.out.println("Gir:");
                        System.out.println(ZarAdi(1)+"          -->" + 1);
                        System.out.println(ZarAdi(2)+"          -->" + 2);
                        System.out.println(ZarAdi(3)+"          -->" + 3);
                        System.out.println(ZarAdi(4)+"          -->" + 4);
                        System.out.println(ZarAdi(5)+"          -->" + 5);
                        System.out.println(ZarAdi(6)+"          -->" + 6);
                        break;
                }


        } catch (IOException e) {
            e.printStackTrace();
        }




    }
    
    public  static  String ZarAdi(int zar){
        
        if (zar ==1){
            return  "yek";
        } else if (zar==2) {

            return  "du";
        }
        else if (zar==3) {

            return  "se";
        }
        else if (zar==4) {

            return  "cihar";
        }
        else if (zar==5) {

            return  "penc";
        }
        else if (zar==6) {

            return  "ses";
        }

        return  "";
    }
}
