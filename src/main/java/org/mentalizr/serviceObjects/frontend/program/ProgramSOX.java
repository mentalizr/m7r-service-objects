package org.mentalizr.serviceObjects.frontend.program;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;

public class ProgramSOX {

    public static ProgramSO fromJson(String json) {
        Jsonb jsonb = JsonbBuilder.create();
        return jsonb.fromJson(json, ProgramSO.class);
    }

    public static String toJson(ProgramSO programSO) {
        Jsonb jsonb = JsonbBuilder.create();
        return jsonb.toJson(programSO);
    }

    public static String toJsonWithFormatting(ProgramSO programSO) {
        Jsonb jsonb = JsonbBuilder.create(new JsonbConfig().withFormatting(true));
        return jsonb.toJson(programSO);
    }

}
