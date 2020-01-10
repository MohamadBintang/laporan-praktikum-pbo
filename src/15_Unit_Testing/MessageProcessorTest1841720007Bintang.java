package unittest;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Reza R
 */
public class MessageProcessorTest1841720007Bintang {

    MessageProcessor1841720007Bintang mProcessor;

    public MessageProcessorTest1841720007Bintang() {
        mProcessor = new MessageProcessor1841720007Bintang();
        mProcessor.setSenderBintang("Ronaldo");
        mProcessor.setRecipientBintang("Rafael");
        mProcessor.setMessageBintang("Whats up bro?");
    }

    @Test
    public void testShowMessageBintang() {
        String expectedResult = "Hai Rafael, you have message from Ronaldo. \nThe message as follows : Whats up bro?";
        Assert.assertEquals(expectedResult, mProcessor.messageFormatBintang());
    }
}
