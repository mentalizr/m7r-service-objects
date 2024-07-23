package org.mentalizr.serviceObjects.requestObjects;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;

public class ActivityQuerySOX {

    public static ActivityQuerySO fromJson(String json) {
        try (Jsonb jsonb = JsonbBuilder.create()) {
            return jsonb.fromJson(json, ActivityQuerySO.class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String toJson(ActivityQuerySO activityQuerySO) {
        try (Jsonb jsonb = JsonbBuilder.create()) {
            return jsonb.toJson(activityQuerySO);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String toJsonWithFormatting(ActivityQuerySO activityQuerySO) {
        try (Jsonb jsonb = JsonbBuilder.create(new JsonbConfig().withFormatting(true))) {
            return jsonb.toJson(activityQuerySO);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
