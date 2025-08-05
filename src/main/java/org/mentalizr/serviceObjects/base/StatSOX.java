package org.mentalizr.serviceObjects.base;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;

public class StatSOX {

    public static StatSO fromJson(String json) {
        try (Jsonb jsonb = JsonbBuilder.create()) {
            return jsonb.fromJson(json, StatSO.class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String toJson(StatSO statSO) {
        try (Jsonb jsonb = JsonbBuilder.create()) {
            return jsonb.toJson(statSO);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String toJsonWithFormatting(StatSO statSO) {
        try (Jsonb jsonb = JsonbBuilder.create(new JsonbConfig().withFormatting(true))) {
            return jsonb.toJson(statSO);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
