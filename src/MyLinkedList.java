
public class MyLinkedList {
    private MyNode root;
    private int size;

    public MyLinkedList() {
        this.root = null;
    }

    public void add(Movie movie) {
        MyNode node = new MyNode(movie);
        if (root == null) {
            root = node;
        } else {
            MyNode currentNode = root;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = node;
        }
        size++;
    }

    public void searchTitle(String title) {
        MyNode currentNode = root;
        while (currentNode != null) {
            Movie movie = currentNode.getMovie();
            if (movie.getTitle().contains(title)) {
                System.out.println();
                System.out.println(movie);
                currentNode = currentNode.next;
            } else
            {
                currentNode = currentNode.next;

            }
        }
    }



    public void searchGenre(String genre) {
        MyNode currentNode = root;
        while (currentNode != null) {
            Movie movie = currentNode.getMovie();
            if (movie.getGenre().contains(genre)) {
                System.out.println();
                System.out.println(movie);
                currentNode = currentNode.next;
            } else
            {
                currentNode = currentNode.next;

            }
        }
    }

    public void searchYear(int year) {
        MyNode currentNode = root;
        while (currentNode != null) {
            Movie movie = currentNode.getMovie();
            if (year == movie.getYear()) {
                System.out.println();
                System.out.println(movie);
                currentNode = currentNode.next;
            } else
            {
                currentNode = currentNode.next;

            }
        }
    }

    public void searchDirector(String director) {
        MyNode currentNode = root;
        while (currentNode != null) {
            Movie movie = currentNode.getMovie();
            if (movie.getDirector().equals(director)) {
                System.out.println();
                System.out.println(movie);
                currentNode = currentNode.next;
            } else
            {
                currentNode = currentNode.next;

            }
        }
    }

    public int movieCount() {
        return size;
    }

    public void deleteNode(String title) {
        if (root == null)
            return;
        MyNode current = null;
        MyNode prev;
        MyNode next;

        // find position
        int counter = 0;
        MyNode currentNode = root;
        while (currentNode != null) {
            Movie movie = currentNode.getMovie();
            if (movie.getTitle().equals(title)) {
                System.out.println();
                current = currentNode;
                break;
            } else {
                counter++;
                currentNode = currentNode.next;
            }
        }
        deleteNode(counter);

        System.out.println("!!!!!!!!");
        System.out.println("DELETED!");
        System.out.println("!!!!!!!!");
        //printData();
    }

    void deleteNode(int position)
    {
        if (root == null)
            return;

        MyNode temp = root;

        if (position == 0)
        {
            root = temp.next;
            return;
        }

        for (int i=0; temp!=null && i<position-1; i++)
            temp = temp.next;

        if (temp == null || temp.next == null)
            return;


        MyNode next = temp.next.next;

        temp.next = next;
    }

    public void printData() {
        // method used to print the content of the linked list
        MyNode currentNode = root;
        while (currentNode != null) {
            Movie movie = currentNode.getMovie();
            System.out.println();
            System.out.println(movie);
            currentNode = currentNode.next;
        }
    }


}
