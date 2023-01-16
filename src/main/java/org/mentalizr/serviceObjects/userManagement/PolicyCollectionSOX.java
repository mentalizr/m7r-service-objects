package org.mentalizr.serviceObjects.userManagement;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;

public class PolicyCollectionSOX {

    public static PolicyCollectionSO fromJson(String json) {
        Jsonb jsonb = JsonbBuilder.create();
        return jsonb.fromJson(json, PolicyCollectionSO.class);
    }

    public static String toJson(PolicyCollectionSO policyCollectionSO) {
        Jsonb jsonb = JsonbBuilder.create();
        return jsonb.toJson(policyCollectionSO);
    }

    public static String toJsonWithFormatting(PolicyCollectionSO policyCollectionSO) {
        Jsonb jsonb = JsonbBuilder.create(new JsonbConfig().withFormatting(true));
        return jsonb.toJson(policyCollectionSO);
    }

}
