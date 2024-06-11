package org.mentalizr.serviceObjects.userManagement;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;

public class ProgramStatisticSOX {
    public static ProgramStatisticSO fromJson(String json) {
        Jsonb jsonb = JsonbBuilder.create();
        return jsonb.fromJson(json, ProgramStatisticSO.class);
    }

    public static String toJson(ProgramStatisticSO programStatisticSO) {
        Jsonb jsonb = JsonbBuilder.create();
        return jsonb.toJson(programStatisticSO);
    }

    public static String toJsonWithFormatting(ProgramStatisticSO programStatisticSO) {
        Jsonb jsonb = JsonbBuilder.create(new JsonbConfig().withFormatting(true));
        return jsonb.toJson(programStatisticSO);
    }
}
