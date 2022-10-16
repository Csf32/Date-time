import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Instanciando_data_e_hora {

	public static void main(String[] args) {

		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();

		Instant d03 = Instant.now();
	
		LocalDate d04 = LocalDate.parse("2022-08-19");
		LocalDateTime d05 = LocalDateTime.parse("2022-08-19T11:08:40");
		Instant d06 = Instant.parse("2022-08-19T11:08:40Z");
	
		Instant d07 = Instant.parse("2022-08-19T11:08:40-03:00");

		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate d08 = LocalDate.parse("19/08/2022", fmt1);
		
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		LocalDateTime d09 = LocalDateTime.parse("19/08/2022 12:00", fmt2);
		
		LocalDate d10 = LocalDate.of(2022,8, 19);
		LocalDateTime d11 = LocalDateTime.of(2022,8,19, 16,15);
		
		System.out.println("d01 = " + d01.toString()); 
		
		System.out.println("d02 = " + d02);					
		System.out.println("d03 = " + d03);
		System.out.println("d04 = " + d04);
		System.out.println("d05 = " + d05);
		System.out.println("d06 = " + d06);
		System.out.println("d07 = " + d07);
		System.out.println("d08 = " + d08);
		System.out.println("d09 = " + d09);
		System.out.println("d10=" + d10);
		System.out.println("d11 ="+ d11);
	}

}
