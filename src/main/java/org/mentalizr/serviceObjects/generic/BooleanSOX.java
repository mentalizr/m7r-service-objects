package org.mentalizr.serviceObjects.generic;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;

public class BooleanSOX {

    public static BooleanSO fromJson(String json) {
        try (Jsonb jsonb = JsonbBuilder.create()) {
            return jsonb.fromJson(json, BooleanSO.class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String toJson(BooleanSO booleanSO) {
        try (Jsonb jsonb = JsonbBuilder.create()) {
            return jsonb.toJson(booleanSO);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String toJsonWithFormatting(BooleanSO booleanSO) {
        try (Jsonb jsonb = JsonbBuilder.create(new JsonbConfig().withFormatting(true))) {
            return jsonb.toJson(booleanSO);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
