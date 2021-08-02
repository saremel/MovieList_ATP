import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.InterfaceAddress;
import java.util.ArrayList;
import java.util.Scanner;

public class MainConsole {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList list= new ArrayList<Movie>();
        fillListWithMovie(list);

        System.out.println("Welcome to the Movie Organizer! \r \n");
        System.out.println("Please choose a option");

        boolean appRunning= true;

        while(appRunning){
            System.out.println("******************************************");
            System.out.println("******************************************");
            System.out.println("1 - List Movies \r\n" +  "2 - Find movie by genre \r\n" + "3 - Add new movie to list \r\n" + "4 - Delete movie to list by title \r\n" + "0 - Exit" );

            boolean status = true;
            while (status){
                System.out.println("Enter your choice with a number:");
                int selection =  scanner.nextInt();
                switch (selection){
                    case 1:
                        status = false;
                        System.out.println(list.toString());
                        break;
                    case 2:
                        status = false;
                        // find movie by genre
                        break;
                    case 3:
                        status = false;
                        System.out.println("Enter the new movie's title");
                        String title = scanner.nextLine();
                        System.out.println("Enter the new movie's director");
                        String director = scanner.nextLine();
                        System.out.println("Enter the movie's genre");
                        String genre = scanner.nextLine();
                        System.out.println("Enter the movie' year");
                        int year = scanner.nextInt();
                        Movie m = new Movie(title, year, genre, director);
                        list.add(m);
                        System.out.println("Movie added");
                        break;
                    case 4:
                        status = false;
                        // delete movie by name
                        break;
                    case 0:
                        status = false;
                        System.out.println("See you :)");
                        appRunning = false;
                        break;
                    default:
                        System.out.println("Please enter a valid number");

                }


            }

        }




    }

    private static void fillListWithMovie(ArrayList<Movie> list) {
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

}
