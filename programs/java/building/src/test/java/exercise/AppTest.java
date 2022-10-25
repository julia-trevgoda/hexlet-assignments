package exercise;

import org.apache.commons.io.IOUtils;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AppTest {
    private static String execCommand() throws Exception {
        String command = "build/install/building/bin/building";
        Process process = Runtime.getRuntime().exec(command);
        String output = IOUtils.toString(process.getInputStream());
        process.waitFor();
        return output;
    }

    @Test
    void testOutput() throws Exception {
        String output = execCommand().trim();
        assertThat(output).isEqualTo("Hello, World!");
    }

    // BEGIN
    @Test
    void toJson() {
        String[] fruits = {"apple", "pear", "lemon"};
        String actual = App.toJson(fruits);
        assertThat(actual).isEqualTo("[\"apple\",\"pear\",\"lemon\"]");
    }
    // END
}
