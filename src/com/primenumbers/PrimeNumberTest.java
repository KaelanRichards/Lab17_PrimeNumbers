package com.primenumbers;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class PrimeNumberTest {

	@Test
	void primeFactor1() {
		boolean expected = false;
		boolean actual = checkPrimeNumber(1);
		assertEquals(expected, actual);
	}

	@Test
	void primeFactor2() {
		boolean expected = true;
		boolean actual = checkPrimeNumber(2);
		assertEquals(expected, actual);
	}

	@Test
	void primeFactor3() {
		boolean expected = true;
		boolean actual = checkPrimeNumber(53);
		assertEquals(expected, actual);
	}

	@Test
	void primeFactor4() {
		boolean expected = false;
		boolean actual = checkPrimeNumber(4);
		assertEquals(expected, actual);
	}
	@Test
	void primeFactor5() {
		boolean expected = true;
		boolean actual = checkPrimeNumber(5);
		assertEquals(expected, actual);
	}
	@Test
	void primeFactor6() {
		boolean expected = false;
		boolean actual = checkPrimeNumber(6);
		assertEquals(expected, actual);
	}
	@Test
	void primeFactor8() {
		boolean expected = false;
		boolean actual = checkPrimeNumber(8);
		assertEquals(expected, actual);
	}
	@Test
	void primeFactor29() {
		boolean expected = true;
		boolean actual = checkPrimeNumber(29);
		assertEquals(expected, actual);
	}
	
	public static boolean checkPrimeNumber(int n) {
		
		if (n != 2) {
			if (n > 1 && n != 4) {
				for (int i = 2; 2 * i < n; i++) {
					if (n % i == 0)
						return false;
				}
				return true;
			}
			return false;
		}
		return true;
	}

	public static List<Integer> listOfPrimes(int n) {
		List<Integer> primeList = new ArrayList<>();
		if (checkPrimeNumber(n) == true) {
			primeList.add(n);
		}

		return primeList;
	}
}