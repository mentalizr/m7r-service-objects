package org.mentalizr.serviceObjects;

public class SessionStatusSOs {

    public static boolean isValid(SessionStatusSO sessionStatusSO) {
        return sessionStatusSO.getStatus().equals(SessionStatusSO.STATUS_VALID);
    }

    public static boolean isInvalid(SessionStatusSO sessionStatusSO) {
        return sessionStatusSO.getStatus().equals(SessionStatusSO.STATUS_INVALID);
    }

    public static boolean isIntermediate(SessionStatusSO sessionStatusSO) {
        return sessionStatusSO.getStatus().equals(SessionStatusSO.STATUS_INTERMEDIATE);
    }

}
