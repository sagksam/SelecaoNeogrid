/**
 * 
 */
package br.com.selecaoneogrid.util;

import org.joda.time.LocalDateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * @author Paulo
 * Classe utilit�ria com um �nico m�todo para convers�o de data em String
 */
public class DateUtil {

	/* M�todo que converte um LocalDateTime em String */
	public static String dateToString(LocalDateTime localDateTime) {
		DateTimeFormatter dateTimeFormatter = DateTimeFormat.forPattern("hh:mma");
		String date = localDateTime.toString(dateTimeFormatter);
		return date;
	}
}
