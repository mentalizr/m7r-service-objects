package org.mentalizr.serviceObjects.userManagement;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;

public class ActivityRecordSOX {

    public static ActivityRecordSO fromJson(String json) {
        Jsonb jsonb = JsonbBuilder.create();
        return jsonb.fromJson(json, ActivityRecordSO.class);
    }

    public String toJson(ActivityRecordSO activityRecordSO) {
        Jsonb jsonb = JsonbBuilder.create();
        return jsonb.toJson(activityRecordSO);
    }

    public static String toJsonWithFormatting(ActivityRecordSO activityRecordSO) {
        Jsonb jsonb = JsonbBuilder.create(new JsonbConfig().withFormatting(true));
        return jsonb.toJson(activityRecordSO);
    }
}
