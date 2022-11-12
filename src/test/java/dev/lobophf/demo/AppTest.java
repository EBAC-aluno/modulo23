package dev.lobophf.demo;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AppTest{

	@Test
	void main() {
		List<String> list = Arrays.asList("Maria-F, Clarissa-F, Zoey-F, Renata-F, Nathalie-F");
		list.stream().forEach(person -> Assertions.assertTrue(person.charAt(person.length() - 1) == 'F'));
	}

}
