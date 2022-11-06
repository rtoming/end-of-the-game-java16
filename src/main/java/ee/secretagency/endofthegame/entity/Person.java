package ee.secretagency.endofthegame.entity;

public record Person(
        String name,
        String surname,
        int age,
        Address address
) {
}
