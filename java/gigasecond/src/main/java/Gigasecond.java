import java.time.*;

class Gigasecond {

    private final static long ONE_GIG = 1_000_000_000;
    LocalDate birthDate;
    LocalDateTime birthDateTime;

    Gigasecond(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    Gigasecond(LocalDateTime birthDateTime) {
        this.birthDateTime = birthDateTime;
    }

    LocalDateTime getDate() {
        LocalDateTime date = getLocalDateTime();
        return date;
    }

    private LocalDateTime getLocalDateTime() {
        ZoneId zoneId = ZoneId.of("America/Chicago");
        long epoch = birthDate.atStartOfDay(zoneId).toEpochSecond();
        long afterEpochSeconds = epoch + ONE_GIG;
        LocalDateTime localDateTime = LocalDateTime.ofInstant(Instant.ofEpochSecond(afterEpochSeconds), ZoneId.systemDefault());

        return localDateTime;
    }

}
