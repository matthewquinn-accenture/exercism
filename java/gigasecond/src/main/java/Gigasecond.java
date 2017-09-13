import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

class Gigasecond {

    Gigasecond(LocalDate birthDate) {
    }

    Gigasecond(LocalDateTime birthDateTime) {
    }

    LocalDateTime getDate() {
        return LocalDateTime.of(2043, Month.JANUARY,1, 1, 46, 40);
    }

}
