package com.github.frtu.catalog.model;

import java.io.File;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class MockGenerator {
	private static final org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(MockGenerator.class);

	@Autowired
	ResultRepository resultRepository;

	@PostConstruct
	void checkitOut() {
		File sourceFile = new File("src/main/resources/movie.json");

		try {
			ObjectMapper mapper = new ObjectMapper(); // can reuse, share globally
			Movie movie = mapper.readValue(sourceFile, Movie.class);
			List<Result> results = movie.getResults();
			resultRepository.save(results);
		} catch (Exception e) {
			logger.error("Cannot read from file {}. Please check that the file exist or is correct!", sourceFile);
			throw new IllegalStateException(e);
		}
	}
}
