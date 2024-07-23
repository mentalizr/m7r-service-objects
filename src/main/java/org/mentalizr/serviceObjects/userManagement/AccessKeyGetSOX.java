package org.mentalizr.serviceObjects.userManagement;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;

public class AccessKeyGetSOX {

    public static AccessKeyGetSO fromJson(String json) {
        Jsonb jsonb = JsonbBuilder.create();
        return jsonb.fromJson(json, AccessKeyGetSO.class);
    }

    public static String toJson(AccessKeyGetSO accessKeyGetSO) {
        Jsonb jsonb = JsonbBuilder.create();
        return jsonb.toJson(accessKeyGetSO);
    }

    public static String toJsonWithFormatting(AccessKeyGetSO accessKeyGetSO) {
        Jsonb jsonb = JsonbBuilder.create(new JsonbConfig().withFormatting(true));
        return jsonb.toJson(accessKeyGetSO);
    }
    
}
