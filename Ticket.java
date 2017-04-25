/*Ticket class (24 marks	in	total)
• Has	a	constructor	with	inputs	for	Customer	and	Film (2 marks)
• Is	immutable but	has appropriate	get	methods (2 marks)
• toString	method	returns	a	string	representation	of	the	printed ticket	with	details	for	
  customer	and	film	and	total	cost,	with	correct	decimal	format	for	currency	(6 marks)*/

public class Ticket {
	private Film aFilm;
	private Customer aCustomer;
	
	/*constructor*/
	public Ticket(Customer aCustomer, Film aFilm){
		this.aCustomer = aCustomer;
		this.aFilm = aFilm;
	}
	
	/*get methods*/
	public Film getaFilm() {
		return aFilm;
	}

	public Customer getaCustomer() {
		return aCustomer;
	}
	
	/*method double cost*/
	public double cost(){
		double cost = 10;
		if(this.aCustomer.getAge() >18){
			if((this.aCustomer.getAge()<25)&&(this.aCustomer.getStudent()=='Y')){
				return cost*0.85;
			}
			if((this.aCustomer.getAge()>25)&&(this.aCustomer.getStudent()=='Y')){
				return cost*0.90;
			}
			else {
				return cost;
			}
		}
		if(this.aCustomer.getAge() < 18){
			cost = 7;
			if((this.aCustomer.getAge()>10)&&(this.aCustomer.getStudent()=='Y')){
				return cost*0.85;
			}
			else{
				return cost;
			}
		}
		if((this.aCustomer.getAge()>64)&&(this.aCustomer.getStudent()=='N')){
			return cost*0.93;
		}
		return cost;
	}
	
	/*toString method*/	
	public String toString(){
		return "FILM TICKET for: "+this.aFilm+
				"\nCUSTOMER DETAILS: "+this.aCustomer+
				"\nTOTAL COST: $"+String.format("%,1.2f", cost());
		}
}
