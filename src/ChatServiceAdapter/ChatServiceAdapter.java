public class ChatServiceAdapter implements ChatService {
    private final LegacyChatService legacyService;

    public ChatServiceAdapter() {
        this.legacyService = new LegacyChatService();
    }

    @Override
    public void sendMessage(String message) {
        legacyService.sendLegacyFormat(message);
    }
}