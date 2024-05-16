package org.mentalizr.serviceObjects.userManagement;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;

public class ActivityStatusMessageSOX {

    public static ActivityMessageSO fromJson(String json) {
        Jsonb jsonb = JsonbBuilder.create();
        return jsonb.fromJson(json, ActivityMessageSO.class);
    }

    public String toJson(ActivityMessageSO activityMessageSO) {
        Jsonb jsonb = JsonbBuilder.create();
        return jsonb.toJson(activityMessageSO);
    }

    public static String toJsonWithFormatting(ActivityMessageSO activityMessageSO) {
        Jsonb jsonb = JsonbBuilder.create(new JsonbConfig().withFormatting(true));
        return jsonb.toJson(activityMessageSO);
    }
}
