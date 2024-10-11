package Types;

public class TextType {
    private CallerType sendTo, sentFrom;
    private String title, message;


    public TextType () {

    }

    public CallerType getSendTo() {
        return sendTo;
    }

    public void setSendTo(CallerType sendTo) {
        this.sendTo = sendTo;
    }

    public CallerType getSentFrom() {
        return sentFrom;
    }

    public void setSentFrom(CallerType sentFrom) {
        this.sentFrom = sentFrom;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
