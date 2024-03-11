package org.mentalizr.serviceObjects.requestObjects;

public class ActivityCommandSO {
    private Long fromTimestamp;
    private Long untilTimestamp;
    private String userId;

    public ActivityCommandSO() {
        this.userId = "";
        this.fromTimestamp = 0L;
        this.untilTimestamp = 0L;
    }

    public ActivityCommandSO(String userId) {
        this.userId = userId;
        this.fromTimestamp = 0L;
        this.untilTimestamp = 0L;
    }

    public ActivityCommandSO(Long fromTimestamp, Long untilTimestamp, String userId) {
        this.fromTimestamp = fromTimestamp;
        this.untilTimestamp = untilTimestamp;
        this.userId = userId;
    }

    public Long getFromTimestamp() {
        return fromTimestamp;
    }

    public void setFromTimestamp(Long fromTimestamp) {
        this.fromTimestamp = fromTimestamp;
    }

    public Long getUntilTimestamp() {
        return untilTimestamp;
    }

    public void setUntilTimestamp(Long untilTimestamp) {
        this.untilTimestamp = untilTimestamp;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
