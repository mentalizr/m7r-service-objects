package org.mentalizr.serviceObjects.base;

import de.arthurpicht.utils.core.strings.Strings;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
public class ConsistencyCheckResultSO {

    private boolean consistent;
    private List<String> messages;

    public ConsistencyCheckResultSO() {
        this.messages = new ArrayList<>();
    }

    public boolean isConsistent() {
        return consistent;
    }

    public void setConsistent(boolean consistent) {
        this.consistent = consistent;
    }

    public List<String> getMessages() {
        return messages;
    }

    public void setMessages(List<String> messages) {
        this.messages = messages;
    }

    public void addMessage(String message) {
        this.messages.add(message);
    }

    @Override
    public String toString() {
        return "ConsistencyCheckResultSO{" +
                "consistent=" + consistent +
                ", messages=" + Strings.listing(messages, ", ", "{", "}") +
                '}';
    }

}
