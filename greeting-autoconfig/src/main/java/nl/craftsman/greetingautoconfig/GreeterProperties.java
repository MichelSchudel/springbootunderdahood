package nl.craftsman.greetingautoconfig;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "craftsmen.greeter")
public class GreeterProperties {

    private String userName;
    private String morningMessage;
    private String afternoonMessage;
    private String eveningMessage;
    private String nightMessage;

    public String getUserName() {
        return userName;
    }

    public String getMorningMessage() {
        return morningMessage;
    }

    public String getAfternoonMessage() {
        return afternoonMessage;
    }

    public String getEveningMessage() {
        return eveningMessage;
    }

    public String getNightMessage() {
        return nightMessage;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setMorningMessage(String morningMessage) {
        this.morningMessage = morningMessage;
    }

    public void setAfternoonMessage(String afternoonMessage) {
        this.afternoonMessage = afternoonMessage;
    }

    public void setEveningMessage(String eveningMessage) {
        this.eveningMessage = eveningMessage;
    }

    public void setNightMessage(String nightMessage) {
        this.nightMessage = nightMessage;
    }
}
