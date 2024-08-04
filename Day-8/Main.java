import java.io.IOException;

class ConnectionManager {
    public void openConnection() throws IOException {
        System.out.println("Connection opened.");
    }

    public void closeConnection() throws IOException {
        System.out.println("Connection closed.");
    }

    public void useConnection() throws IOException {
        System.out.println("Using connection.");
        throw new IOException("Error using connection.");
    }
}

public class Main {
    public static void main(String[] args) {
        ConnectionManager connectionManager = new ConnectionManager();
        try {
            connectionManager.openConnection();
            connectionManager.useConnection();
        } catch (IOException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            try {
                connectionManager.closeConnection();
            } catch (IOException e) {
                System.out.println("Exception during cleanup: " + e.getMessage());
            }
        }
    }
}