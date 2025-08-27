package javacore.Rdates.test;

import java.time.*;
import java.util.Map;

public class ZoneTest01 {
    public static void main(String[] args) {
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds);
        System.out.println(ZoneId.systemDefault());
        ZoneId australiaDarwin = ZoneId.of("Australia/Darwin");
        LocalDateTime now = LocalDateTime.now();
        ZonedDateTime zonedDateTime = now.atZone(australiaDarwin);
        System.out.println(zonedDateTime);
        Instant instant = Instant.now();
        System.out.println(instant);
        ZonedDateTime zonedDateTime1 =  instant.atZone(australiaDarwin);
        System.out.println(zonedDateTime1);

        System.out.println(ZoneOffset.MAX);
        System.out.println(ZoneOffset.MIN);
        ZoneOffset  zoneOffset = ZoneOffset.of("-03:00");
        OffsetDateTime offsetDateTime =  now.atOffset(zoneOffset);
        System.out.println(offsetDateTime);
    }
}
