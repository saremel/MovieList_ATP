import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class movie_data {


    public static void main(String[] args) {
        String[] ar;
        try {
            BufferedReader in = new BufferedReader(
                    new FileReader("C:\\Users\\sarey\\Desktop\\data.txt"));
            String str;

            while ((str = in.readLine())!= null) {
                int i=0;
                ar=str.split(",");
                //System.out.println(str);
                System.out.println(ar[1]+ar[3]+ar[5]+ar[9]);
                i++;
            }
            in.close();
        } catch (IOException e) {
            System.out.println("File Read Error");
        }
       // System.out.println(ar);
    }


}
