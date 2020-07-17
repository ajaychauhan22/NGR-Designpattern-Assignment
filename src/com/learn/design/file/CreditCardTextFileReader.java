package com.learn.design.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CreditCardTextFileReader implements CreditCardFileReader {

	@Override
	public List<String> readFile(final String filePath) throws FileNotFoundException {

		List<String> ccRecords = new ArrayList<>();

		try (Scanner sc = new Scanner(new File(filePath))) {
			while (sc.hasNextLine())
				ccRecords.add(sc.nextLine());
		}

		return ccRecords;
	}
}
