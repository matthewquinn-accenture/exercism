import java.time.*;

class Gigasecond {

    private final static long ONE_GIG = 1_000_000_000;
    LocalDateTime birthDateTime;

    Gigasecond(LocalDate birthDate) {
        birthDateTime = birthDate.atTime(0, 0, 0);
    }

    Gigasecond(LocalDateTime birthDateTime) {
        this.birthDateTime = birthDateTime;
    }

    LocalDateTime getDate() {
        LocalDateTime birthDateAtOneGig = birthDateTime.plusSeconds(ONE_GIG);
        return birthDateAtOneGig;
    }

}
