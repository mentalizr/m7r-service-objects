package org.mentalizr.serviceObjects.userManagement;

public class ProgramStatisticSO {
    private String programName;
    private int user;
    private double interactionAvg;
    private int interactionMin;
    private int interactionMax;

    public ProgramStatisticSO() {
        this.programName = "";
        this.user = 0;
        this.interactionAvg = 0;
        this.interactionMin = 0;
        this.interactionMax = 0;
    }

    public ProgramStatisticSO(
            String programName,
            int user,
            double interactionAvg,
            int interactionMin,
            int interactionMax
    ) {
        this.programName = programName;
        this.user = user;
        this.interactionAvg = interactionAvg;
        this.interactionMin = interactionMin;
        this.interactionMax = interactionMax;
    }

    public String getProgramName() {
        return this.programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public int getUser() {
        return this.user;
    }

    public void setUser(int user) {
        this.user = user;
    }

    public double getInteractionAvg() {
        return this.interactionAvg;
    }

    public void setInteractionAvg(double interactionAvg) {
        this.interactionAvg = interactionAvg;
    }

    public int getInteractionMin() {
        return interactionMin;
    }

    public void setInteractionMin(int interactionMin) {
        this.interactionMin = interactionMin;
    }

    public int getInteractionMax() {
        return this.interactionMax;
    }

    public void setInteractionMax(int interactionMax) {
        this.interactionMax = interactionMax;
    }

}
