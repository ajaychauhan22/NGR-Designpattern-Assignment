package com.learn.design.file;

import java.io.FileNotFoundException;
import java.util.List;

public interface CreditCardFileReader {
	List<String> readFile(String filePath) throws FileNotFoundException;
}
