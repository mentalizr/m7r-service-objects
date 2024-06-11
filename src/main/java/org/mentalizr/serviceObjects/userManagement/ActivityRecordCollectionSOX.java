package org.mentalizr.serviceObjects.userManagement;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;

public class ActivityRecordCollectionSOX {

    public static ActivityRecordCollectionSO fromJson(String json) {
        Jsonb jsonb = JsonbBuilder.create();
        return jsonb.fromJson(json, ActivityRecordCollectionSO.class);
    }

    public static String toJson(ActivityRecordCollectionSO messageCollectionSO) {
        Jsonb jsonb = JsonbBuilder.create();
        return jsonb.toJson(messageCollectionSO);
    }

    public static String toJsonWithFormatting(ActivityRecordCollectionSO messageCollectionSO) {
        Jsonb jsonb = JsonbBuilder.create(new JsonbConfig().withFormatting(true));
        return jsonb.toJson(messageCollectionSO);
    }
}
