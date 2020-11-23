package org.mentalizr.serviceObjects.userManagement;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;

public class ProgramCollectionSOX {

    public static ProgramCollectionSO fromJson(String json) {
        Jsonb jsonb = JsonbBuilder.create();
        return jsonb.fromJson(json, ProgramCollectionSO.class);
    }

    public static String toJson(ProgramCollectionSO programCollectionSO) {
        Jsonb jsonb = JsonbBuilder.create();
        return jsonb.toJson(programCollectionSO);
    }

    public static String toJsonWithFormatting(ProgramCollectionSO programCollectionSO) {
        Jsonb jsonb = JsonbBuilder.create(new JsonbConfig().withFormatting(true));
        return jsonb.toJson(programCollectionSO);
    }

}
