/**
 * 
 */
package br.com.selecaoneogrid.util;

import org.joda.time.LocalDateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * @author Paulo
 * Classe utilitária com um único método para conversão de data em String
 */
public class DateUtil {

	/* Método que converte um LocalDateTime em String */
	public static String dateToString(LocalDateTime localDateTime) {
		DateTimeFormatter dateTimeFormatter = DateTimeFormat.forPattern("hh:mma");
		String date = localDateTime.toString(dateTimeFormatter);
		return date;
	}
}
