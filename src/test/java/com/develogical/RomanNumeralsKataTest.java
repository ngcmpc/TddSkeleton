package com.develogical;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class RomanNumeralsKataTest {

	@Test
	public void canConvert1ToI() {
		RomanNumberalKata converter = new RomanNumberalKata();
		String romanNumber = converter.convert(1);
		assertThat(romanNumber,is("I"));
	}

}
