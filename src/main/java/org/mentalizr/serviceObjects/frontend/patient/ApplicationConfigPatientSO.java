package org.mentalizr.serviceObjects.frontend.patient;

import org.mentalizr.serviceObjects.frontend.application.ApplicationConfigBaseSO;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ApplicationConfigPatientSO extends ApplicationConfigBaseSO {

    private boolean program = false;
    private boolean activityDiary = false;
    private boolean moodDiary = false;
    private boolean questioning = false;
    private boolean videoConference = false;
    private boolean messages = false;
    private boolean therapist = false;

    public void setProgram(boolean program) {
        this.program = program;
    }

    public boolean isProgram() {
        return program;
    }

    public void setActivityDiary(boolean activityDiary) {
        this.activityDiary = activityDiary;
    }

    public boolean isActivityDiary() {
        return activityDiary;
    }

    public void setMoodDiary(boolean moodDiary) {
        this.moodDiary = moodDiary;
    }

    public boolean isMoodDiary() {
        return moodDiary;
    }

    public void setQuestioning(boolean questioning) {
        this.questioning = questioning;
    }

    public boolean isQuestioning() {
        return questioning;
    }

    public void setVideoConference(boolean videoConference) {
        this.videoConference = videoConference;
    }

    public boolean isVideoConference() {
        return videoConference;
    }

    public void setMessages(boolean messages) {
        this.messages = messages;
    }

    public boolean isMessages() {
        return messages;
    }

    public void setTherapist(boolean therapist) {
        this.therapist = therapist;
    }

    public boolean isTherapist() {
        return therapist;
    }

}
