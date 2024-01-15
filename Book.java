public class Book {

	private String title;
	private String author;
	private double price;
	private int quantity;
	
	/** 
	 * accessor for title
	 * @return title of book object
	 */
	 public String getTitle( ) {
		 return title;
	 }
	 
	/** 
	 * accessor for author
	 * @return author's name of book object
	 */
	 public String getAuthor( ) {
		 return author;
	 }
	
	 /** 
	 * accessor for price
	 * @return price of book object
	 */
	 public double getPrice( ) {
		 return price;
	 }
	 
	 /** 
	 * accessor for quantity
	 * @return quantity of this book object
	 */
	 public int getQuantity( ) {
		 return quantity;
	 }	 

	 
	 /**
	  * mutator for title
	  * @param newTitle value of new Book object title
	 */
	 public void setTitle( String newTitle ) {
		 title = newTitle;
	 }

	 /**
	  * mutator for author
	  * @param newAuthor value of new Book object author
	 */
	 public void setAuthor( String newAuthor) {
		 author = newAuthor;
	 }

	 /**
	  * mutator for price
	  * @param newPrice value of new price
	  */
	  public void setPrice( double newPrice ) {
		  price = newPrice;
	  }
	  
	 /**
	  * mutator for quantity
	  * @param newQuantity value of new quantity
	  */
	  public void setQuantity( int newQuantity ) {
		  quantity = newQuantity;
	  }
	  
	  /**
	   * update quantity of Book object by specified amount
	   * @param num value to update quantity by
	   * @return updated quantity 
	   */
	   public int updateQuantity(int num) {
		   quantity += num;
		   return quantity;
	   }
	 
	   /**
	    * returns total value of Book object on hand
	    * @return total value of Book object on hand
	    */
	    public double totalValue( ) {
		    return price * quantity;
	    }
	  

} // end of Book
