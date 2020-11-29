package org.mentalizr.serviceObjects.userManagement;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;

public class AccessKeyDeleteSOX {

    public static AccessKeyDeleteSO fromJson(String json) {
        Jsonb jsonb = JsonbBuilder.create();
        return jsonb.fromJson(json, AccessKeyDeleteSO.class);
    }

    public static String toJson(AccessKeyDeleteSO accessKeyDeleteSO) {
        Jsonb jsonb = JsonbBuilder.create();
        return jsonb.toJson(accessKeyDeleteSO);
    }

    public static String toJsonWithFormatting(AccessKeyDeleteSO accessKeyDeleteSO) {
        Jsonb jsonb = JsonbBuilder.create(new JsonbConfig().withFormatting(true));
        return jsonb.toJson(accessKeyDeleteSO);
    }
    
}
