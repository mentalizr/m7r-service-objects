package org.mentalizr.serviceObjects.userManagement;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;

public class ActivityStatusMessageCollectionSOX {

    public static ActivityStatusMessageCollectionSO fromJson(String json) {
        Jsonb jsonb = JsonbBuilder.create();
        return jsonb.fromJson(json, ActivityStatusMessageCollectionSO.class);
    }

    public static String toJson(ActivityStatusMessageCollectionSO messageCollectionSO) {
        Jsonb jsonb = JsonbBuilder.create();
        return jsonb.toJson(messageCollectionSO);
    }

    public static String toJsonWithFormatting(ActivityStatusMessageCollectionSO messageCollectionSO) {
        Jsonb jsonb = JsonbBuilder.create(new JsonbConfig().withFormatting(true));
        return jsonb.toJson(messageCollectionSO);
    }
}
