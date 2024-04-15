package org.mentalizr.serviceObjects.frontend.program;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;

public class ProgramMetaDataSOX {

    public static ProgramMetaDataSO fromJson(String json) {
        Jsonb jsonb = JsonbBuilder.create();
        return jsonb.fromJson(json, ProgramMetaDataSO.class);
    }

    public static String toJson(ProgramMetaDataSO programMetaDataSO) {
        Jsonb jsonb = JsonbBuilder.create();
        return jsonb.toJson(programMetaDataSO);
    }

    public static String toJsonWithFormatting(ProgramMetaDataSO programMetaDataSO) {
        Jsonb jsonb = JsonbBuilder.create(new JsonbConfig().withFormatting(true));
        return jsonb.toJson(programMetaDataSO);
    }

}
