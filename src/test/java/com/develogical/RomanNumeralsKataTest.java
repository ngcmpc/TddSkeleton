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

	@Test
	public void canConvertIntegerLessThan4ToRomanNumeral() {
		RomanNumberalKata converter = new RomanNumberalKata();

		String romanNumber = "";
		romanNumber = converter.convert(2);
		assertThat(romanNumber,is("II"));

		romanNumber = converter.convert(3);
		assertThat(romanNumber,is("III"));
	}

	@Test
	public void canConvertIntegerLessThan10ToRomanNumeral() {
		RomanNumberalKata converter = new RomanNumberalKata();

		String romanNumber = "";

		romanNumber = converter.convert(4);
		assertThat(romanNumber,is("IV"));

		romanNumber = converter.convert(7);
		assertThat(romanNumber,is("VII"));

		romanNumber = converter.convert(10);
		assertThat(romanNumber, is("X"));

		romanNumber = converter.convert(5);
		assertThat(romanNumber, is("V"));

		romanNumber = converter.convert(9);
		assertThat(romanNumber, is("IX"));
	}


	@Test
	public void canConvertIntegerBiggerthan10AndLessThan100ToRomanNumeral() {
		RomanNumberalKata converter = new RomanNumberalKata();

		String romanNumber = "";

		romanNumber = converter.convert(11);
		assertThat(romanNumber,is("XI"));

		romanNumber = converter.convert(19);
		assertThat(romanNumber,is("XIX"));

		romanNumber = converter.convert(20);
		assertThat(romanNumber,is("XX"));

		romanNumber = converter.convert(45);
		assertThat(romanNumber, is("XLV"));

		romanNumber = converter.convert(67);
		assertThat(romanNumber, is("LXVII"));

		romanNumber = converter.convert(99);
		assertThat(romanNumber, is("XCIX"));
	}
}
