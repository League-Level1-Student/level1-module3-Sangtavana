
public class Netflix {
public static void main(String[] args) {


	Movie a= new Movie("Goodbye to Goodbye", 3);
	Movie b= new Movie("Love o2o",4);
	Movie c= new Movie("Nakee2",4);
	Movie d= new Movie("Sweet Combat",5);
	Movie e= new Movie("Duangjai Nai Fai Nao",3);
	
	String aprice= a.getTicketPrice();
	
	NetflixQueue nq= new NetflixQueue();	
		nq.addMovie(a);
	nq.addMovie(b);
	nq.addMovie(c);
	nq.addMovie(d);
	nq.addMovie(e);
	nq.printMovies();
	nq.printMovies();
	nq.printMovies();
	nq.printMovies();
	nq.printMovies();
	Movie bm= nq.getBestMovie();
nq.sortMoviesByRating();

}
}

