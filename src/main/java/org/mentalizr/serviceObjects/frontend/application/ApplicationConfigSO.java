package org.mentalizr.serviceObjects.frontend.application;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ApplicationConfigSO {

    private final String name;
    private final String logo;

    private boolean program = false;
    private boolean activityDiary = false;
    private boolean moodDiary = false;
    private boolean questioning = false;
    private boolean videoConference = false;
    private boolean messages = false;
    private boolean therapist = false;

    public ApplicationConfigSO(String name, String logo) {
        this.name = name;
        this.logo = logo;
    }

    public void setProgram(boolean program) {
        this.program = program;
    }

    public ApplicationConfigSO withProgram() {
        this.program = true;
        return this;
    }

    public void setActivityDiary(boolean activityDiary) {
        this.activityDiary = activityDiary;
    }

    public ApplicationConfigSO withActivityDiary() {
        this.activityDiary = true;
        return this;
    }

    public ApplicationConfigSO withMoodDiary() {
        this.moodDiary = true;
        return this;
    }

    public void setMoodDiary(boolean moodDiary) {
        this.moodDiary = moodDiary;
    }

    public ApplicationConfigSO withQuestioning() {
        this.questioning = true;
        return this;
    }

    public void setQuestioning(boolean questioning) {
        this.questioning = questioning;
    }

    public ApplicationConfigSO withVideoConference() {
        this.videoConference = true;
        return this;
    }

    public void setVideoConference(boolean videoConference) {
        this.videoConference = videoConference;
    }

    public ApplicationConfigSO withMessages() {
        this.messages = true;
        return this;
    }

    public void setMessages(boolean messages) {
        this.messages = messages;
    }

    public ApplicationConfigSO withTherapist() {
        this.therapist = true;
        return this;
    }

    public void setTherapist(boolean therapist) {
        this.therapist = therapist;
    }

    public String getName() {
        return name;
    }

    public String getLogo() {
        return logo;
    }

    public boolean isProgram() {
        return program;
    }

    public boolean isActivityDiary() {
        return activityDiary;
    }

    public boolean isMoodDiary() {
        return moodDiary;
    }

    public boolean isQuestioning() {
        return questioning;
    }

    public boolean isVideoConference() {
        return videoConference;
    }

    public boolean isMessages() {
        return messages;
    }

    public boolean isTherapist() {
        return therapist;
    }

}
