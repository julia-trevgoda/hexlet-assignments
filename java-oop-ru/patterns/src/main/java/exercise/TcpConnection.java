package exercise;
import exercise.connections.Connection;
import exercise.connections.Disconnected;

// BEGIN
public class TcpConnection implements Connection {

    private Connection tcpConnection;

    public TcpConnection(String ipAddress, int port) {
        this.tcpConnection = new Disconnected(this);
    }

    public Connection getConnection() {
        return tcpConnection;
    }

    public void setConnection(Connection tcpConnection) {
        this.tcpConnection = tcpConnection;
    }

    @Override
    public String getCurrentState() {
        return tcpConnection.getCurrentState();
    }

    @Override
    public void connect() {
        tcpConnection.connect();
    }

    @Override
    public void disconnect() {
        tcpConnection.disconnect();
    }

    @Override
    public void write(String data) {
        tcpConnection.write(data);
    }
}
// END
