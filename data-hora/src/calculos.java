import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class calculos {
    public static void main(String[] args) {
        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

        //para fazer um calculo sera preciso sempre criar uma nova variavels
        LocalDate pastWeekLocalData = d04.minusDays(7);
        LocalDate nextWeekLocalDate = d04.plusDays(7);
        System.out.println("CALCULANDO DIAS ");

        System.out.println("Using LocalDate");
        System.out.println("Current day: " + d04);
        System.out.println("Past week: " + pastWeekLocalData);
        System.out.println("Next week: "+ nextWeekLocalDate);
        System.out.println();

        //com localDateTime
        LocalDateTime pastWeekLocalDataTime = d05.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);

        System.out.println("Using LocalDateTime");
        System.out.println("Current day: " + d05);
        System.out.println("Past week: " + pastWeekLocalDataTime);
        System.out.println("Next week: "+ nextWeekLocalDateTime);
        System.out.println();

        //com Instant
        Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);

        System.out.println("Using INSTANT");
        System.out.println("Current day: " + d06);
        System.out.println("Past week: " + pastWeekInstant);
        System.out.println("Next week: "+ nextWeekInstant);
        System.out.println();


        //calculando duração
        System.out.println("CALCULANDO HORAS");
        //objeto duration para calcular tempo entre duas datas
        //esse objeto não suporta LocalDate pq usa o tempo, o que esse obj nao tem. Necessario converter -> pra isso serve o atStartOfDay
        Duration t1 = Duration.between(pastWeekLocalData.atStartOfDay(), d04.atStartOfDay());
        Duration t2 = Duration.between(pastWeekLocalDataTime, d05);
        Duration t3 = Duration.between(pastWeekInstant,d06);
        Duration t4 = Duration.between(d06,pastWeekInstant);

        System.out.println("t1 dias: " + t1.toDays());
        System.out.println("t2 dias: " + t2.toDays());
        System.out.println("t3 dias: " + t3.toDays());
        //resultado negativo já que a primeira data passada está 7 dias a frente
        System.out.println("t4 dias: " + t4.toDays());

    }
}
