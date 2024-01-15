
public class BookInventory {

	public static void main(String[] args) {
		Book textBook = new Book();
		textBook.setTitle("Starting out with Java");
		textBook.setAuthor("Tony Gaddis");
		textBook.setPrice(98);
		textBook.setQuantity(5);
		System.out.println(textBook.getTitle() + " by " +
			textBook.getAuthor() + " total value: " +
			textBook.totalValue());
		
	}

}
