package part2_Adapter_Pattern;
// пример искользования
public class ChatAdapterDemo {
    public static void main(String[] args) {
        LegacyChatService legacyChat = new LegacyChatService();
        ChatService chatService = new ChatServiceAdapter(legacyChat);

        chatService.sendMessage("Hello world!"); // Ожидаемый вывод: Legacy Chat: Hello world!
    }
}
