package com.learn.design.file;

import com.learn.design.util.FileType;

/**
 * 
 * @author ajaychauhan01
 *
 */

public class CreditCardFileReaderFactory {
	public CreditCardFileReader getCreditCardFileReader(final FileType fileType) {
		if (fileType == FileType.TEXT) {
			return new CreditCardTextFileReader();
		}
		return null;
	}
}
