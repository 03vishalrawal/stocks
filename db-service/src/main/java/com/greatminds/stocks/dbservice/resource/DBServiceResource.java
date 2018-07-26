package com.greatminds.stocks.dbservice.resource;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greatminds.stocks.dbservice.model.Quote;
import com.greatminds.stocks.dbservice.model.Quotes;
import com.greatminds.stocks.dbservice.repository.QuotesRepository;

@RestController
@RequestMapping("rest/db")
public class DBServiceResource {

	@Autowired
	private QuotesRepository quoteRepo;

	public DBServiceResource(QuotesRepository quoteRepo) {
		this.quoteRepo = quoteRepo;
	}

	@GetMapping("/{username}")
	public List<String> getQuotes(@PathVariable("username") final String username) {
		return getQuotesByuserName(username);

	}

	private List<String> getQuotesByuserName(final String username) {
		return quoteRepo.findByUserName(username).stream().map(Quote::getQuote).collect(Collectors.toList());
	}

	@PostMapping("/delete/{userName}")
	public void delete(@PathVariable("userName") final String userName) {
		List<Quote> quotes = quoteRepo.findByUserName(userName);
		quoteRepo.delete(quotes.get(0));
	}

	@PostMapping("/add")
	public List<String> add(@RequestBody final Quotes quotes) {
		quotes.getQuotes().stream().map(quote -> new Quote(quotes.getUserName(), quote))
				.forEach(quote -> quoteRepo.save(quote));
		return getQuotesByuserName(quotes.getUserName());
	}
}