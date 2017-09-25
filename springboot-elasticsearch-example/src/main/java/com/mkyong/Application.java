package com.mkyong;

import java.util.List;
import java.util.Map;

import org.elasticsearch.client.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;

import com.mkyong.book.model.Book;
import com.mkyong.book.model.IssueEntity;
import com.mkyong.book.repository.IssueRepository;
import com.mkyong.book.service.BookService;
import com.taskadapter.redmineapi.IssueManager;
import com.taskadapter.redmineapi.RedmineException;
import com.taskadapter.redmineapi.RedmineManager;
import com.taskadapter.redmineapi.RedmineManagerFactory;
import com.taskadapter.redmineapi.bean.Issue;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private ElasticsearchOperations es;

	@Autowired
	private BookService bookService;
	
	@Autowired
	private IssueRepository issueRepository;

	public static void main(String args[]) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		printIssue();
		printElasticSearchInfo();
		
		bookService.save(new Book("1001", "Elasticsearch Basics", "Rambabu Posa", "23-FEB-2017"));
		bookService.save(new Book("1002", "Apache Lucene Basics", "Rambabu Posa", "13-MAR-2017"));
		bookService.save(new Book("1003", "Apache Solr Basics", "Rambabu Posa", "21-MAR-2017"));

		// fuzzey search
		Page<Book> books = bookService.findByAuthor("Rambabu", new PageRequest(0, 10));

		// List<Book> books = bookService.findByTitle("Elasticsearch Basics");

		books.forEach(x -> System.out.println(x));

	}

	// useful for debug
	private void printElasticSearchInfo() {

		System.out.println("--ElasticSearch-->");
		Client client = es.getClient();
		Map<String, String> asMap = client.settings().getAsMap();

		asMap.forEach((k, v) -> {
			System.out.println(k + " = " + v);
		});
		System.out.println("<--ElasticSearch--");
	}

	private void printIssue() throws RedmineException {
		String uri = "http://demo.redmine.org/projects/du-an-test";
		String projectKey = "tuan";
		Integer queryId = null; // any

		RedmineManager mgr = RedmineManagerFactory.createWithUserAuth(uri, "khoatran.378", "facebookdotCOM");
		IssueManager issueManager = mgr.getIssueManager();
		List<Issue> issues = issueManager.getIssues(projectKey, queryId);
		for (Issue issue : issues) {
			IssueEntity issueEntity=new IssueEntity();
			issueEntity.setId(issue.getId());
			issueEntity.setSubject(issue.getSubject());
			System.out.println(issue.toString());
			issueRepository.save(issueEntity);
		}
		
	}

}