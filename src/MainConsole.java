import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class MainConsole {
    static MyLinkedList list;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        fillListWithMovie();

        System.out.println("Welcom to the Movie Organizer! \r \n");
        System.out.println("Please choose a option");

        boolean appRunning= true;

        while(appRunning){
            System.out.println("******************************************");
            System.out.println("******************************************");
            System.out.println(" 1 - List Movies \r \n" +  "2 - Find movie by genre \r\n" + "3 - Add new movie to list \r\n" + "4 - Delete movie to list by title \r\n" + "0 - Exit" );

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
        list = new MyLinkedList();

        String[] ar;
        String filePath = "C:\\Users\\sarey\\Desktop\\data.txt";
        try {
            BufferedReader in = new BufferedReader( new FileReader(filePath));
            String line;

            while ((line = in.readLine())!= null) {
                int i=0;
                ar=line.split(",");
                //System.out.println(str);
                System.out.println(ar[3]);
                i++;
            }
            in.close();
        } catch (IOException e) {
            System.out.println("File Read Error");
        }

        //Movie m1 = new Movie();
        //list.add(m1);
    }

    private static void menu1() {
        // print all data
    }

    private static void menu2() {
        // find movie by genre
    }

    private static void menu3() {
        //insert new movie
    }

    private static void menu4() {
        // delete movie by name
    }

}
