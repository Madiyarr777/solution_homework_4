public class ChatAdapterDemo {
    public static void main(String[] args) {
        ChatService chatService = new ChatServiceAdapter();
        chatService.sendMessage("New message received!");
    }
}