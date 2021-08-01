public class MyNode implements Comparable<MyNode> {
    private Movie movie;
    public MyNode next;

    public MyNode(Movie movie) {
        this.movie = movie;
        this.next = null;
    }

    public Movie getMovie() {
        return movie;
    }

    @Override
    public int compareTo(MyNode myNode) {
        return movie.getTitle().compareTo(myNode.getMovie().getTitle());
    }
}
