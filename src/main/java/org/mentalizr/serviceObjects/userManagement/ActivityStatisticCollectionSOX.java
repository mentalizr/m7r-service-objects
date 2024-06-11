package org.mentalizr.serviceObjects.userManagement;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;

public class ActivityStatisticCollectionSOX {
    public static ActivityStatisticCollectionSO fromJson(String json) {
        Jsonb jsonb = JsonbBuilder.create();
        return jsonb.fromJson(json, ActivityStatisticCollectionSO.class);
    }

    public static String toJson(ActivityStatisticCollectionSO statisticCollectionSO) {
        Jsonb jsonb = JsonbBuilder.create();
        return jsonb.toJson(statisticCollectionSO);
    }

    public static String toJsonWithFormatting(ActivityStatisticCollectionSO statisticCollectionSO) {
        Jsonb jsonb = JsonbBuilder.create(new JsonbConfig().withFormatting(true));
        return jsonb.toJson(statisticCollectionSO);
    }


}
