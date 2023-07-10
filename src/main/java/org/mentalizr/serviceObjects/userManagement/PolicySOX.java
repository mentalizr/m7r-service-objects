package org.mentalizr.serviceObjects.userManagement;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;

public class PolicySOX {

    public static PolicySO fromJson(String json) {
        Jsonb jsonb = JsonbBuilder.create();
        return jsonb.fromJson(json, PolicySO.class);
    }

    public static String toJson(PolicySO policySO) {
        Jsonb jsonb = JsonbBuilder.create();
        return jsonb.toJson(policySO);
    }

    public static String toJsonWithFormatting(PolicySO policySO) {
        Jsonb jsonb = JsonbBuilder.create(new JsonbConfig().withFormatting(true));
        return jsonb.toJson(policySO);
    }

}
