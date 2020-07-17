package com.learn.design;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import com.learn.design.file.CreditCardFileReader;
import com.learn.design.file.CreditCardFileReaderFactory;
import com.learn.design.model.CreditCard;
import com.learn.design.util.CreditCardUtils;
import com.learn.design.util.FileType;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

		//Foctory to get file reader instance
		CreditCardFileReaderFactory fileReaderFactory = new CreditCardFileReaderFactory();

		//Get CreditCardFileReader from It's factory
		CreditCardFileReader fileReader = fileReaderFactory.getCreditCardFileReader(FileType.TEXT);

		//Read Each line record CreditCardFile
		List<String> records = fileReader.readFile("filepath");

		List<CreditCard> creditCards = records.stream().map(CreditCardUtils::getCC).filter(Objects::isNull)
				.collect(Collectors.toList());

		System.out.print(creditCards);

	}
}
