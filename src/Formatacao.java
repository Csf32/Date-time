import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Formatacao {

	public static void main(String[] args) {

		LocalDate dat1 = LocalDate.parse("2022-08-19");
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("dat1 = " + dat1);
	
		System.out.println("dat1 = " + dat1.format(fmt1));
		
		System.out.println("dat1 = " + fmt1.format(dat1));
		
		LocalDateTime dat2 = LocalDateTime.parse("2022-08-19T11:08:40");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println("dat2 = " + dat2.format(fmt1));
		System.out.println("dat2 = " + dat2.format(fmt2));	
		
		Instant dat3 = Instant.parse("2022-08-19T11:08:40Z");
	
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		
		System.out.println("dat3 = " + fmt3.format(dat3));
		
	}

}
