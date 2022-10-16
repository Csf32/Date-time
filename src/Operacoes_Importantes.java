import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;


public class Operacoes_Importantes {

	public static void main(String[] args) {
		
		LocalDate dat1 = LocalDate.parse("2022-08-19");
		LocalDateTime dat2 = LocalDateTime.parse("2022-08-19T11:08:40");
		
		Instant dat3 = Instant.parse("2022-08-19T11:08:40Z");
		
		LocalDate r1 = LocalDate.ofInstant(dat3, ZoneId.systemDefault());
		System.out.println("r1 = " + r1);
		
		LocalDate r2 = LocalDate.ofInstant(dat3, ZoneId.of("Portugal"));
		System.out.println("r2 = " + r2);
		
	
		LocalDateTime r3 = LocalDateTime.ofInstant(dat3, ZoneId.systemDefault());
		System.out.println("r3 = " + r3);
		
		LocalDateTime r4 = LocalDateTime.ofInstant(dat3, ZoneId.of("Portugal"));
		System.out.println("r4 = " + r4);
	
		
		System.out.println("Pegar o dia do mês" + dat1.getDayOfMonth());
		System.out.println("Pegar o mês" + dat1.getMonthValue());
		System.out.println("Pegar o ano" + dat1.getYear());
		System.out.println("Pegar a hora" + dat2.getHour());

	}

}
