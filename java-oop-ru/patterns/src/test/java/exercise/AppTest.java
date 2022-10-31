package exercise;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;


class TcpTest {

    @Test
    void testConnect1()  {
        TcpConnection connection = new TcpConnection("33.22.11.44", 80);
        connection.getConnection().connect();
        assertThat(connection.getConnection().getCurrentState()).isEqualTo("connected");
        connection.getConnection().write("one");
        connection.getConnection().write("two");
        connection.getConnection().disconnect();
        assertThat(connection.getConnection().getCurrentState()).isEqualTo("disconnected");
    }

    @Test
    void testConnect2() throws Exception {
        TcpConnection connection = new TcpConnection("33.22.11.44", 80);
        connection.getConnection().connect();
        String result = tapSystemOut(() -> {
            connection.getConnection().connect();
        });
        assertThat(result.contains("Error"))
            .as("Try to connect when connection already established. Message must contains word Error")
            .isTrue();
    }

    @Test
    void testConnect3() throws Exception {
        TcpConnection connection = new TcpConnection("33.22.11.44", 80);
        connection.connect();
        connection.getConnection().disconnect();
        String result = tapSystemOut(() -> {
            connection.getConnection().disconnect();
        });
        assertThat(result.contains("Error"))
            .as("Try to disconnect when connection disconnected. Message must contains word Error")
            .isTrue();
    }

    @Test
    void testConnect4() throws Exception {
        TcpConnection connection = new TcpConnection("33.22.11.44", 80);
        connection.getConnection().connect();
        connection.getConnection().disconnect();
        String result = tapSystemOut(() -> {
            connection.getConnection().write("one");
        });
        assertThat(result.contains("Error"))
            .as("Try to write to disconnected connection. Message must contains word Error")
            .isTrue();
    }
}
