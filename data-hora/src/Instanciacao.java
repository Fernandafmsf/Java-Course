import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Instanciacao {
    public static void main(String[] args) {

        //INSTANCIAÇÃO

        // https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
        DateTimeFormatter fmt1=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        //instanciando obj date
        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03= Instant.now();//com fuso

        //intanciando obj date a partir de texto em formato iso
        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-21T01:30:26");
        Instant d06 = Instant.parse("2022-07-21T01:30:26Z"); //com fuso
        Instant d07 = Instant.parse("2022-07-21T01:30:26-03:00");

        //texto com formato customizado para data-hora
        LocalDate d08 = LocalDate.parse("27/02/2003", fmt1);
        LocalDateTime d09 = LocalDateTime.parse("27/02/2003 02:30", fmt2);

        //lendo dia mes, ano e hora de forma separada
        LocalDate d10= LocalDate.of(2023,05,27);
        LocalDateTime d11 = LocalDateTime.of(2023,05,27,01,30);

        System.out.println("d01: "+d01.toString());// usar toString é o mesmo que apenas referenciar a variavel
        System.out.println("d02: "+d02);
        System.out.println("d03: "+d03);
        System.out.println("d04: "+d04);
        System.out.println("d05: "+d05);
        System.out.println("d06: "+d06);
        System.out.println("d07: "+d07);
        System.out.println("d08: "+d08);
        System.out.println("d09: "+d09);
        System.out.println("d10: "+d10);
        System.out.println("d11: "+d11);

    }
}