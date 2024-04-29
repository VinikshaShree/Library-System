import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import java.util.List;
public class MainActivity extends AppCompatActivity { 
@Override
protected void onCreate(Bundle savedInstanceState) { 
 super.onCreate(savedInstanceState); 
setContentView(R.layout.activity_main);
// Example usage
BookRepository bookRepository = new BookRepository(this);
 // Add a book	
Book newBook = new Book(); 
newBook.setTitle("Sample Book"); 
newBook.setAuthor("John Doe"); 
newBook.setAvailable(true); 
newBook.setLent(false); 
newBook.setReserved(false); 
bookRepository.addBook(newBook);
// Get all books
List<Book> allBooks = bookRepository.getAllBooks();
 	// Now you can use the list of books as needed
}
}
