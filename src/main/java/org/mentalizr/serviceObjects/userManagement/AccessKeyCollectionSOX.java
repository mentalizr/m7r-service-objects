package org.mentalizr.serviceObjects.userManagement;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;

public class AccessKeyCollectionSOX {

    public static AccessKeyCollectionSO fromJson(String json) {
        Jsonb jsonb = JsonbBuilder.create();
        return jsonb.fromJson(json, AccessKeyCollectionSO.class);
    }

    public static String toJson(AccessKeyCollectionSO accessKeyCollectionSO) {
        Jsonb jsonb = JsonbBuilder.create();
        return jsonb.toJson(accessKeyCollectionSO);
    }

    public static String toJsonWithFormatting(AccessKeyCollectionSO accessKeyCollectionSO) {
        Jsonb jsonb = JsonbBuilder.create(new JsonbConfig().withFormatting(true));
        return jsonb.toJson(accessKeyCollectionSO);
    }
    
}
