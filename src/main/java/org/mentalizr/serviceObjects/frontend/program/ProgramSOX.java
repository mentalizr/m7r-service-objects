package org.mentalizr.serviceObjects.frontend.program;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;

public class ProgramSOX {

    public static Program fromJson(String json) {
        Jsonb jsonb = JsonbBuilder.create();
        return jsonb.fromJson(json, Program.class);
    }

    public static String toJson(Program program) {
        Jsonb jsonb = JsonbBuilder.create();
        return jsonb.toJson(program);
    }

    public static String toJsonWithFormatting(Program program) {
        Jsonb jsonb = JsonbBuilder.create(new JsonbConfig().withFormatting(true));
        return jsonb.toJson(program);
    }

}
