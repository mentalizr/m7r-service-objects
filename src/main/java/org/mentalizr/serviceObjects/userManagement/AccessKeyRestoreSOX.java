package org.mentalizr.serviceObjects.userManagement;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;

public class AccessKeyRestoreSOX {

    public static AccessKeyRestoreSO fromJson(String json) {
        Jsonb jsonb = JsonbBuilder.create();
        return jsonb.fromJson(json, AccessKeyRestoreSO.class);
    }

    public static String toJson(AccessKeyRestoreSO accessKeyRestoreSO) {
        Jsonb jsonb = JsonbBuilder.create();
        return jsonb.toJson(accessKeyRestoreSO);
    }

    public static String toJsonWithFormatting(AccessKeyRestoreSO accessKeyRestoreSO) {
        Jsonb jsonb = JsonbBuilder.create(new JsonbConfig().withFormatting(true));
        return jsonb.toJson(accessKeyRestoreSO);
    }
    
}
