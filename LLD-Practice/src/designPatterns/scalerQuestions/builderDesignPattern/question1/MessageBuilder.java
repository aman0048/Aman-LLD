package designPatterns.scalerQuestions.builderDesignPattern.question1;

//@WithBuilder
public class MessageBuilder {
    private MessageType messageType;
    private String content;
    private String sender;
    private String recipient;
    private boolean isDelivered;
    private long timestamp;

    public MessageBuilder(Builder builder){
        this.messageType = builder.messageType;
        this.content = builder.content;
        this.sender = builder.sender;
        this.recipient = builder.recipient;
        this.isDelivered = builder.isDelivered;
        this.timestamp = builder.timestamp;
    }

    public static Builder getBuilder(){
        return new Builder();
    }
    public static class Builder{
        private MessageType messageType;
        private String content;
        private String sender;
        private String recipient;
        private boolean isDelivered;
        private long timestamp;

        public void setMessageType(MessageType messageType) {
            this.messageType = messageType;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public void setSender(String sender) {
            this.sender = sender;
        }

        public void setRecipient(String recipient) {
            this.recipient = recipient;
        }

        public void setDelivered(boolean delivered) {
            isDelivered = delivered;
        }

        public void setTimestamp(long timestamp) {
            this.timestamp = timestamp;
        }

        public MessageBuilder build(){
            return new MessageBuilder(this);
        }
    }
}
