package com.santo.blm.utils;

public class RangUtils {

	//TODO: Add cache to this
	public static int calculerRang(int exp) {
		return exp == 1 ? 1 : exp == 6 ? 2 : exp == 11 ? 3 : exp == 21 ? 4 : exp == 41 ? 5 : 0;
	}

}
