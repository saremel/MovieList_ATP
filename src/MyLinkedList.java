public class MyLinkedList {
    private MyNode root;
    private int size;

    public MyLinkedList() {
        this.root = null;
    }

    public void add(Movie m){
        MyNode node = new MyNode(m);
        if(root == null){
            root = node;
        } else {
            MyNode currentNode = root;
            while(currentNode.next != null){
                currentNode = currentNode.next;
            }
            currentNode.next = node;
        }
        size ++;
    }

    public void searchByTitle(String title){
        MyNode currentNode = root;
        while(currentNode != null){
            Movie m = currentNode.getMovie();
            if(m.getTitle().contains(title)){
                System.out.println(m);
                currentNode = currentNode.next;
            } else{
                currentNode = currentNode.next;
            }
        }
    }

    public void searchByGenre(String genre){
        MyNode currentNode = root;
        while(currentNode != null){
            Movie m = currentNode.getMovie();
            if(m.getGenre().equals(genre)){
                System.out.println(m);
                currentNode = currentNode.next;
            } else{
                currentNode = currentNode.next;
            }
        }
    }

    public int movieCount(){
        return size;
    }

    public void deleteMovieByTitle(String title){
        if(root == null){
            return;
        }
        MyNode current = null;
        MyNode prev;
        MyNode next;

        // find position


        // call delete function
    }

    void deleteNode(int position){
        if(root == null)
            return;
    }
}
