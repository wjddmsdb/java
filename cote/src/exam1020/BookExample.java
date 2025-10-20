package exam1020;


public class BookExample {

	public static void main(String[] args) {
		Book[] books = new Book[3];
		books[0] = new Book("Java","김자바","123-456-789",20000);
		books[1] = new Book("파이썬", "이파이썬", "123-567-890",15000);
		books[2] = new Book("DB","박디비","123-456-789",16000);
		
		//for loop로 books 배열에 있는 책들의 제목 출력
		for(int i = 0; i < books.length; i++) {
			System.out.println(books[i].getTitle());
		}
		//또
		for(Book book: books) { // for Each
			System.out.println(book.getTitle());
		}
	}

}
