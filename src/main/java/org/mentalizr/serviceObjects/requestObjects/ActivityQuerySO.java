package org.mentalizr.serviceObjects.requestObjects;

public class ActivityQuerySO {
    private Long fromTimestamp;
    private Long untilTimestamp;
    private String userId;

    public ActivityQuerySO() {
        this.userId = "";
        this.fromTimestamp = 0L;
        this.untilTimestamp = Long.MAX_VALUE;
    }

    public ActivityQuerySO(String userId) {
        this.userId = userId;
        this.fromTimestamp = 0L;
        this.untilTimestamp = Long.MAX_VALUE;
    }

    public ActivityQuerySO(Long fromTimestamp, Long untilTimestamp, String userId) {
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
