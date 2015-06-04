package au.nla.sjdavies.sample;

import java.util.List;

/**
 * Define datastore operations.
 *
 * @since Jun 3, 2015
 * @author Stephen Davies
 */
public interface SampleDao {

	List<Book> allBooks();
	List<Person> allPersons();
	
}
