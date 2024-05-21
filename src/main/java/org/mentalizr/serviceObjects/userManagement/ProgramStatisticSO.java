package org.mentalizr.serviceObjects.userManagement;

public class ProgramStatisticSO {
    private String programName;
    private int user;
    private int interactionAvg;
    private int interactionMin;
    private int interactionMax;

    public ProgramStatisticSO() {
    }

    public ProgramStatisticSO(String programName,
                            int user,
                            int interactionAvg,
                            int interactionMin,
                            int interactionMax) {
        this.programName = programName;
        this.user = user;
        this.interactionAvg = interactionAvg;
        this.interactionMin = interactionMin;
        this.interactionMax = interactionMax;
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public int getUser() {
        return user;
    }

    public void setUser(int user) {
        this.user = user;
    }

    public int getInteractionAvg() {
        return interactionAvg;
    }

    public void setInteractionAvg(int interactionAvg) {
        this.interactionAvg = interactionAvg;
    }

    public int getInteractionMin() {
        return interactionMin;
    }

    public void setInteractionMin(int interactionMin) {
        this.interactionMin = interactionMin;
    }

    public int getInteractionMax() {
        return interactionMax;
    }

    public void setInteractionMax(int interactionMax) {
        this.interactionMax = interactionMax;
    }
}
