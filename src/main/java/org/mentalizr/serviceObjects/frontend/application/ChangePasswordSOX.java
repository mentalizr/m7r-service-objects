package org.mentalizr.serviceObjects.frontend.application;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;

public class ChangePasswordSOX {

    public static ChangePasswordSO fromJson(String json) {
        Jsonb jsonb = JsonbBuilder.create();
        return jsonb.fromJson(json, ChangePasswordSO.class);
    }

    public static String toJson(ChangePasswordSO changePasswordSO) {
        Jsonb jsonb = JsonbBuilder.create();
        return jsonb.toJson(changePasswordSO);
    }

    public static String toJsonWithFormatting(ChangePasswordSO changePasswordSO) {
        Jsonb jsonb = JsonbBuilder.create(new JsonbConfig().withFormatting(true));
        return jsonb.toJson(changePasswordSO);
    }

}
