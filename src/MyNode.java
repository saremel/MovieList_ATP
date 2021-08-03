public class MyNode implements Comparable<MyNode> {

    private Movie movie;
    public MyNode next;

    public MyNode(Movie movie) {
        this.movie = movie;
        this.next = null;
    }

    public Movie getMovie() {
        return this.movie;
    }
    public int compareTo(MyNode otherNode) {
        return movie.getTitle().compareTo(otherNode.getMovie().getTitle());
    }
}