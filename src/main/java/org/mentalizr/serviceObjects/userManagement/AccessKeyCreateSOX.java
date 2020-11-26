package org.mentalizr.serviceObjects.userManagement;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;

public class AccessKeyCreateSOX {

    public static AccessKeyCreateSO fromJson(String json) {
        Jsonb jsonb = JsonbBuilder.create();
        return jsonb.fromJson(json, AccessKeyCreateSO.class);
    }

    public static String toJson(AccessKeyCreateSO accessKeyCreateSO) {
        Jsonb jsonb = JsonbBuilder.create();
        return jsonb.toJson(accessKeyCreateSO);
    }

    public static String toJsonWithFormatting(AccessKeyCreateSO accessKeyCreateSO) {
        Jsonb jsonb = JsonbBuilder.create(new JsonbConfig().withFormatting(true));
        return jsonb.toJson(accessKeyCreateSO);
    }
    
}
