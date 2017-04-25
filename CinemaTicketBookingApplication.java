/*static (e.g.	class)	variables	for: keyboard	input,	a	primitive	array	of	Film	objects	and	a	
constant	NUMBER_OF_FILMS that specifies the	size	of	the	array (4	marks)
• static	main	method initializes	a	primitive	array	of	 films	 (these	may	be	hard-coded)	
and	repeatedly	issues	tickets	in	the	following	manner:
o public static Ticket	 issueTicket(Customer	 aCustomer,	 Film	 aFilm) which	
constructs	and	returns	a	Ticket	object	if	the	customer’s	age	is	appropriate	to	
the	 film	 they	 wish	 to view.	 If	 not,	 null	 is	 returned	 and	 the	 customer	 is	
advised	that	the	purchase	could	not	be	completed. (2	marks)*/
import java.util.*;

public class CinemaTicketBookingApplication {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Welcome to the Cinema Ticket Purchasing System");
		boolean again = true;
		while(again == true){
			final int NUMBER_OF_FILMS = 9;
			Customer customerDetailsInput = new Customer();
			int n=NUMBER_OF_FILMS;
			Film[] filmSelection = new Film[n];
			filmSelection[0] = new Film("Antman", Ratings.PG);
			filmSelection[1] = new Film("Mission Impossible: Rogue Nation", Ratings.M);
			filmSelection[2] = new Film("Fantastic Four", Ratings.M);
			filmSelection[3] = new Film("Paper Towns", Ratings.M);
			filmSelection[4] = new Film("Inside Out", Ratings.G);
			filmSelection[5] = new Film("Minions", Ratings.PG);
			filmSelection[6] = new Film("Self/Less", Ratings.M);
			filmSelection[7] = new Film("Magic Mike XXL", Ratings.M);
			filmSelection[8] = new Film("The Gallows", Ratings.M);
			
			int j;
			System.out.println("Please enter your name:");
			customerDetailsInput.setName(keyboard.nextLine());
			System.out.println("Please enter your age:");
			customerDetailsInput.setAge(keyboard.nextInt());
			keyboard.nextLine();
			System.out.println("Are you a student? (Y/N)");
			customerDetailsInput.setStudent(keyboard.next().charAt(0));
			System.out.println("Which film would you like to watch: ");
			for (int i=0; i<n; i++){
				System.out.println((i+1)+") "+filmSelection[i]);
			}
			j = keyboard.nextInt();
			Ticket issueTicket = new Ticket(customerDetailsInput, filmSelection[j-1]);
			
			/*ticket issued*/
			if(customerDetailsInput.getAge()<filmSelection[j-1].getaRating().getMinAge()){
				System.out.println("Sorry, you're not old enough for this film");
			}
			else {
				System.out.println("Your ticket is ready to be collected!");
				System.out.println("------------------------------------------------------");
				System.out.println(issueTicket);
				System.out.println("------------------------------------------------------");
			}
			
			/*another ticket*/
			System.out.println("Issue another ticket? (Y/N)");
			char anotherTicket = keyboard.next().charAt(0);
			if(anotherTicket == 'Y'){
				again = true;
			}
			else{
				again = false;
				System.out.println("Thanks for booking!");
			}
			keyboard.nextLine();
		}
		
	}

}
