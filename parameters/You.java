class You {

    public static void sendMessage() {

        String from = "Karthika";
        String to = "Niharika";
        String message = "Hello! How are you?";

        Message.send(from, to, message);
    }

    public static void main(String[] args) {
        sendMessage();
    }
}