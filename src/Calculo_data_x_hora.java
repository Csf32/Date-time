import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Calculo_data_x_hora {

	public static void main(String[] args) {
		
		LocalDate dat1 = LocalDate.parse("2022-08-19");
		LocalDateTime dat2 = LocalDateTime.parse("2022-08-19T11:08:40");
		Instant dat3 = Instant.parse("2022-08-19T11:08:40Z");

		
		LocalDate pastweekLocalDate = dat1.minusDays(7);
		LocalDate nextweekLocalDate = dat1.plusDays(7);
		
		System.out.println("pastweekLocalDate" + pastweekLocalDate);
		System.out.println("nextweekLocalDate" + nextweekLocalDate);
		
		LocalDateTime pastweekLocalDateTime = dat2.minusDays(7);
		LocalDateTime nextweekLocalDateTime = dat2.plusDays(7);
		LocalDateTime nexthoursLocalDateTime = dat2.plusHours(3);
		LocalDateTime pasthoursLocalDateTime = dat2.minusHours(3);

		System.out.println("pastweekLocalDateTime = " + pastweekLocalDateTime);
		System.out.println("nextweekLocalDateTime = " + nextweekLocalDateTime);
		System.out.println("nexthoursLocalDateTime = " + nexthoursLocalDateTime);
		System.out.println("pasthoursLocalDateTime = " + pasthoursLocalDateTime);
		
	
		Instant pastweekInstant = dat3.minus(7, ChronoUnit.DAYS);
		Instant nextweekInstant = dat3.plus(7, ChronoUnit.DAYS);

		System.out.println("pastweekInstant = " + pastweekInstant);
		System.out.println("nextweekInstant = " +  nextweekInstant);
		
		
		Duration t1 = Duration.between(pastweekLocalDateTime, dat2);
			
		System.out.println("Duration = " + t1.toDays());
		
		Duration t2 = Duration.between(pastweekLocalDate.atTime(0, 0), dat1.atTime(0, 0));
		System.out.println("Duration = " + t2.toDays());
	
		Duration t3 = Duration.between(pastweekInstant, dat3);
		System.out.println("Duration = " + t3.toDays());

	}

}
