package org.mentalizr.serviceObjects.base;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;

public class ConsistencyCheckResultSOX {

    public static ConsistencyCheckResultSO fromJson(String json) {
        try (Jsonb jsonb = JsonbBuilder.create()) {
            return jsonb.fromJson(json, ConsistencyCheckResultSO.class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String toJson(ConsistencyCheckResultSO consistencyCheckResultSO) {
        try (Jsonb jsonb = JsonbBuilder.create()) {
            return jsonb.toJson(consistencyCheckResultSO);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String toJsonWithFormatting(ConsistencyCheckResultSO consistencyCheckResultSO) {
        try (Jsonb jsonb = JsonbBuilder.create(new JsonbConfig().withFormatting(true))) {
            return jsonb.toJson(consistencyCheckResultSO);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
