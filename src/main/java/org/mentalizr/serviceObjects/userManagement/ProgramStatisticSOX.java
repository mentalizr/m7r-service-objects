package org.mentalizr.serviceObjects.userManagement;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;

public class ProgramStatisticSOX {
    public static ProgramStatisticSO fromJson(String json) {
        try (Jsonb jsonb = JsonbBuilder.create()) {
            return jsonb.fromJson(json, ProgramStatisticSO.class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String toJson(ProgramStatisticSO programStatisticSO) {
        try (Jsonb jsonb = JsonbBuilder.create()) {
            return jsonb.toJson(programStatisticSO);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String toJsonWithFormatting(ProgramStatisticSO programStatisticSO) {
        try (Jsonb jsonb = JsonbBuilder.create(new JsonbConfig().withFormatting(true))) {
            return jsonb.toJson(programStatisticSO);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
