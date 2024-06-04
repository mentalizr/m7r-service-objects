package org.mentalizr.serviceObjects.stateObjects;

import org.mentalizr.serviceObjects.userManagement.ActivityMessageSO;
import org.mentalizr.serviceObjects.userManagement.ActivityStatusMessageCollectionSO;

import java.util.*;
import java.util.stream.Collectors;

public class StatisticResults {

    private final ActivityStatusMessageCollectionSO messageCollectionSO;
    private Set<String> activeUsers;
    private int activeUserCount;

    public StatisticResults(ActivityStatusMessageCollectionSO messageCollectionSO) {
        this.messageCollectionSO = messageCollectionSO;
        this.activeUsers = calActiveUser();
        this.activeUserCount = calActiveUserCount();
    }

    private Set<String> calActiveUser() {
        return messageCollectionSO.getCollection()
                .stream()
                .map(ActivityMessageSO::getUserId).collect(Collectors.toSet());
    }

    private int calActiveUserCount() {
       return activeUsers.size();
    }

    public double calAvgInteraction() {
        int activeUsers = calActiveUserCount();

        if(messageCollectionSO.getCollection().isEmpty() || activeUsers == 0)
            return 0;
        return (double) messageCollectionSO.getCollection().size() /
                (double) calActiveUserCount();
    }

    public int calMinInteraction() {
        int minInteractions = Integer.MAX_VALUE;

        if(messageCollectionSO.getCollection().isEmpty()) {
            return 0;
        }

        for (String userId: activeUsers) {
            int cInteractions = (int) messageCollectionSO.getCollection().stream()
                    .filter(activityMessageSO -> Objects.equals(activityMessageSO.getUserId(), userId)).count();

            if(cInteractions < minInteractions) {
                minInteractions = cInteractions;
            }
        }
        return minInteractions;
    }

    public int calMaxInteraction() {
        int maxInteractions = 0;

        for (String userId: activeUsers) {
            int cInteractions = (int) messageCollectionSO.getCollection().stream()
                    .filter(activityMessageSO -> Objects.equals(activityMessageSO.getUserId(), userId)).count();

            if(cInteractions > maxInteractions) {
                maxInteractions = cInteractions;
            }
        }
        return  maxInteractions;
    }

    public ActivityStatusMessageCollectionSO getMessageCollectionSO() {
        return messageCollectionSO;
    }

    public int getActiveUserCount() {
        return activeUserCount;
    }

    public Set<String> getActiveUsers() {
        return activeUsers;
    }
}
