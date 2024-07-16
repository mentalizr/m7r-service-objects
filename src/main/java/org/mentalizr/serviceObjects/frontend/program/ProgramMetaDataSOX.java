package org.mentalizr.serviceObjects.frontend.program;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;

public class ProgramMetaDataSOX {

    public static ProgramMetaDataSO fromJson(String json) {
        try (Jsonb jsonb = JsonbBuilder.create()) {
            return jsonb.fromJson(json, ProgramMetaDataSO.class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String toJson(ProgramMetaDataSO programMetaDataSO) {
        try (Jsonb jsonb = JsonbBuilder.create()) {
            return jsonb.toJson(programMetaDataSO);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String toJsonWithFormatting(ProgramMetaDataSO programMetaDataSO) {
        try (Jsonb jsonb = JsonbBuilder.create(new JsonbConfig().withFormatting(true))) {
            return jsonb.toJson(programMetaDataSO);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
