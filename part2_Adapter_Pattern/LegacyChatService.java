package part2_Adapter_Pattern;

//  устаревший чат
class LegacyChatService {
    public void sendLegacyMessage(String message) {
        System.out.println("Legacy Chat: " + message);
    }
}