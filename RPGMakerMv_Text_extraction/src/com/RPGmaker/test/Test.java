package com.RPGmaker.test;

import java.util.List;

import com.RPGmaker.io.IOJsonFile;

public class Test {

	public static void main(String[] args) throws Exception {

		// The target folder of the game, you need to go to the \www\date directory
		String originalFileURL = "D:\\RPGMakergame\\gamename\\www\\data\\";

		// This is the directory where the extracted files are output.
		// This directory is also used when replacing the original text.
		String translationFileURL = "D:\\text\\translationFileURL\\";

		// File directory output after final replacement is complete
		String outFileURL = "D:\\text\\outFileURL\\";

		// File Reading Code Class
		IOJsonFile ioJsonFile = new IOJsonFile();

		// Extract the text on the map, and return List <Object> format
		List<Object> mapList = ioJsonFile.readerALLMapJsonFile(originalFileURL);
		// Write the extracted text to the corresponding directory
		ioJsonFile.writeReaderDateFile(translationFileURL + "MapALL.txt", mapList);

		/*
		 * If you have translated the translated text, then execute this method.
		 * IoJsonFIle will replace your translated text to the corresponding position.
		 * 
		 * Don't try to delete any line of extracted text. Because some text is just
		 * blank lines. IOJsonFile replaces the data to the original position according
		 * to the number of rows. You delete or add any line will cause subsequent read
		 * and write errors.
		 */
		ioJsonFile.WriteMapReplacetext(originalFileURL, translationFileURL, outFileURL);

		/**
		 * caveat! !! !! Only one type of text can be replaced at a time! Text
		 * replacement does not use a mapping method! Unless you can guarantee their
		 * replacement order!
		 */
		// Public event
		List<Object> eventList = ioJsonFile.readerEventJsonFile(originalFileURL);
		ioJsonFile.writeReaderDateFile(translationFileURL + "commEvent.txt", eventList);
		ioJsonFile.WriteEventReplacetext(originalFileURL, translationFileURL, outFileURL);

		/**
		 * caveat! !! !! Only one type of text can be replaced at a time! Text
		 * replacement does not use a mapping method! Unless you can guarantee their
		 * replacement order!
		 */
		
		// Item text extraction
		List<Object> itemList = ioJsonFile.readerItemJsonFile(originalFileURL);
		ioJsonFile.writeReaderDateFile(translationFileURL + "item.txt", itemList);
		ioJsonFile.WriteItemReplacetext(originalFileURL, translationFileURL, outFileURL);

	}

	/**
	 * If you want to see the extracted text in the console, you can call this
	 * function
	 * 
	 * @param list
	 */
	static void print(List<?> list) {
		for (Object object : list) {
			System.out.println(object);
		}
	}

}
