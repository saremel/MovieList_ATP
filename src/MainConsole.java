import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.InterfaceAddress;
import java.util.ArrayList;
import java.util.Scanner;

public class MainConsole {
    static ArrayList<Movie> list;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        fillListWithMovie();

        System.out.println("Welcome to the Movie Organizer! \r \n");
        System.out.println("Please choose a option");

        boolean appRunning= true;

        while(appRunning){
            System.out.println("******************************************");
            System.out.println("******************************************");
            System.out.println("1 - List Movies \r\n" +  "2 - Find movie by genre \r\n" + "3 - Add new movie to list \r\n" + "4 - Delete movie to list by title \r\n" + "0 - Exit" );

            boolean status = true;
            while (status){
                System.out.println("Enter your choice:");
                String selection =  scanner.nextLine();

                switch (selection){
                    case "1":
                        status = false;
                        menu1();
                        break;
                    case "2":
                        status = false;
                        menu2();
                        break;
                    case "3":
                        status = false;
                        menu3();
                        break;
                    case "4":
                        status = false;
                        menu4();
                        break;
                    case "0":
                        status = false;
                        appRunning = false;
                        break;

                }


            }

        }




    }

    private static void fillListWithMovie() {


        String[] ar;
        String filePath = "C:\\Users\\sarey\\Desktop\\deneme.txt";
        try {
            BufferedReader in = new BufferedReader( new FileReader(filePath));
            String line;

            while ((line = in.readLine())!= null) {

                ar=line.split("-");
                //System.out.println(str);
                //System.out.println(ar[1]+" " + ar[2]+ " " +ar[3]+ " "  + ar[4]);
                Movie m1 = new Movie(ar[1], Integer.parseInt(ar[2]),ar[3],ar[4]);
                list.add(m1);
                //System.out.println("movie list added from file!");
            }
            in.close();
        } catch (IOException e) {
            System.out.println("File Read Error");
        }
    }

    private static void menu1() {
        // print all data
        list.toString();
    }

    private static void menu2() {
        // find movie by genre
    }

    private static void menu3() {
        //insert new movie
        System.out.println("Enter the movie title");
        //String new_movie_title = scanner.nextLine();
    }

    private static void menu4() {
        // delete movie by name
    }

}
