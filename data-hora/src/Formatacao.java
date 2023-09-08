import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class Formatacao {
    public static void main(String[] args) {

        //declarando datas
        LocalDate d04 = LocalDate.parse("2023-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2023-07-20T01:30:26");
        Instant d06 = Instant.parse("2023-07-20T01:30:26Z");

        //criando formatacoes
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        //criando obj de formatação considerando fuso horario
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;



        System.out.println("d04: "+d04.format(fmt1));
        System.out.println("d04: "+fmt1.format(d04));

        //Possível usar qualuqer formatacao
        System.out.println("d05: "+d05.format(fmt1));
        System.out.println("d05: "+d05.format(fmt2));
        System.out.println("d05: "+d05.format(fmt4));

        //customizando uma data hora global. Sempre que for global, devemos formatar informando o fuso
        System.out.println("d06: "+fmt3.format(d06));
        System.out.println("d06: "+fmt5.format(d06));
        System.out.println("d06: "+d06.toString());


    }
}
