package exercise;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.assertj.core.api.Assertions.assertThat;

class AppTest {

    @BeforeEach
    void clearStaticVariable() throws Exception {
        Kennel.resetKennel();
    }

    @Test
    void testKennel() {
        Kennel.addPuppy(new String[]{"Rex", "boxer"});
        assertThat(Kennel.getPuppyCount()).isEqualTo(1);

        String[][] puppies = {
                {"Rocky", "terrier"},
                {"Buddy", "chihuahua"},
                {"Toby", "chihuahua"},
        };

        Kennel.addSomePuppies(puppies);
        assertThat(Kennel.getPuppyCount()).isEqualTo(4);
        assertThat(Kennel.isContainPuppy("Buddy")).isTrue();
        assertThat(Kennel.isContainPuppy("Olson")).isFalse();

        String[][] actual1 = Kennel.getAllPuppies();
        String[][] expected1 = {
                {"Rex", "boxer"},
                {"Rocky", "terrier"},
                {"Buddy", "chihuahua"},
                {"Toby", "chihuahua"},
        };
        assertThat(actual1).isDeepEqualTo(expected1);

        String[] actual2 = Kennel.getNamesByBreed("chihuahua");
        assertThat(actual2).containsOnly("Buddy", "Toby");

        Kennel.resetKennel();
        assertThat(Kennel.getPuppyCount()).isEqualTo(0);
    }

    // BEGIN
    @Test
    void removePuppy() {
        Kennel.addPuppy(new String[]{"Rex", "boxer"});
        String[][] puppies = {
                {"Rocky", "terrier"},
                {"Buddy", "chihuahua"},
                {"Toby", "chihuahua"},
        };
        Kennel.addSomePuppies(puppies);

        boolean actual3 = Kennel.removePuppy("Buddy");
        assertThat(actual3).isTrue();

        String[][] actual4 = Kennel.getAllPuppies();
        String[][] expected4 = {
                {"Rex", "boxer"},
                {"Rocky", "terrier"},
                {"Toby", "chihuahua"}
        };
        assertThat(actual4).isDeepEqualTo(expected4);
    }
    // END
}
