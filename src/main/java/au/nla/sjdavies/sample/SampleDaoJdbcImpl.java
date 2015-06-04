package au.nla.sjdavies.sample;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

/**
 * Implement all Database operations using Spring JDBC framework.
 * 
 * @since Jun 3, 2015
 * @author Stephen Davies
 */
public class SampleDaoJdbcImpl implements SampleDao {

	private static final String SQL_ALL_BOOKS = "select * from book";
	private static final String SQL_ALL_PERSONS = "select * from person";
	
	private JdbcTemplate jdbcTemplate;
    
    public SampleDaoJdbcImpl(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }
 
    public List<Book> allBooks() {
        List<Book> result = jdbcTemplate.query(SQL_ALL_BOOKS, new RowMapper<Book>() {
     
            @Override
            public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
                Book b = new Book();
     
                b.setId(rs.getInt("id"));
                b.setTitle(rs.getString("title"));
                b.setAuthor(rs.getString("author"));
                b.setIsbn(rs.getString("isbn"));
     
                return b;
            }
     
        });
     
        return result;
    }

    public List<Person> allPersons() {
        List<Person> result = jdbcTemplate.query(SQL_ALL_PERSONS, new RowMapper<Person>() {
     
            @Override
            public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
                Person p = new Person();
     
                p.setId(rs.getInt("id"));
                p.setName(rs.getString("name"));
                p.setEmail(rs.getString("email"));
                p.setPhone(rs.getString("phone"));
     
                return p;
            }
     
        });
     
        return result;
    }
}
