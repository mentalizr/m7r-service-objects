package org.mentalizr.serviceObjects.requestObjects;

public class ActivityStatRequestSO {
    private Long fromTimestamp;
    private Long untilTimestamp;

    public ActivityStatRequestSO() {
        this.fromTimestamp = 0L;
        this.untilTimestamp = Long.MAX_VALUE;
    }

    public Long getFromTimestamp() {
        return this.fromTimestamp;
    }

    public void setFromTimestamp(Long fromTimestamp) {
        this.fromTimestamp = fromTimestamp;
    }

    public Long getUntilTimestamp() {
        return this.untilTimestamp;
    }

    public void setUntilTimestamp(Long untilTimestamp) {
        this.untilTimestamp = untilTimestamp;
    }

}
