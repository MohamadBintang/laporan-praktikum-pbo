package unittest;

public class MessageProcessor1841720007Bintang {

    private String mSender, mRecipient, mMessage;

    public String getMessageBintang() {
        return mMessage;
    }

    public String getRecipient() {
        return mRecipient;
    }

    public String getSender() {
        return mSender;
    }

    public void setMessageBintang(String mMessage) {
        this.mMessage = mMessage;
    }

    public void setRecipientBintang(String mRecipient) {
        this.mRecipient = mRecipient;
    }

    public void setSenderBintang(String mSender) {
        this.mSender = mSender;
    }

    public String messageFormatBintang() {
        String message = String.format("Hai %s, you have message from %s. \nThe message as follows : %s",
                this.mRecipient, this.mSender, this.mMessage);
        return message;
    }
    
    public void showMessageBintang() {
        System.out.println(messageFormatBintang());
    }
}
