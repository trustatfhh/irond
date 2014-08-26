package de.fhhannover.inform.iron.mapserver.utils;

import static org.junit.Assert.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class TimestampFractionTest {

	private static final double TOLERANCE = 0.000001;

	private static SimpleDateFormat formatter =
			new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
	private static SimpleDateFormat formatterNoMilliseconds =
			new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");

	/**
	 * Parse the given string according to the date
	 * format "yyyy-MM-dd'T'HH:mm:ss.SSSZ".
	 *
	 * @param dateString the string to parse
	 * @return the date object
	 */
	private static Date parseDate(String dateString) {
		try {
			return formatter.parse(dateString);
		} catch (ParseException e) {
			throw new RuntimeException(e);
		}
	}

	@Test
	public void testFormatMilliseconds() {
		Date d = parseDate("2014-07-15T22:22:22.123+0200");
		assertEquals(0.123, TimestampFraction.getSecondFraction(d), TOLERANCE);
	}

	@Test
	public void testFormatMillisecondsWithZero() {
		Date d = parseDate("2014-07-15T22:22:22.0+0200");
		assertEquals(0.0, TimestampFraction.getSecondFraction(d), TOLERANCE);
	}

	@Test
	public void testFormatMillisecondsNoMilliseconds() {
		try {
			Date d = formatterNoMilliseconds.parse("2014-07-15T22:22:22+0200");
			assertEquals(0.0, TimestampFraction.getSecondFraction(d), TOLERANCE);
		} catch (ParseException e) {
			throw new RuntimeException(e);
		}
	}

}