package org.mentalizr.serviceObjects.requestObjects;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;

public class ActivityStatRequestSOX {

    public static ActivityStatRequestSO fromJson(String json) {
        try (Jsonb jsonb = JsonbBuilder.create()) {
            return jsonb.fromJson(json, ActivityStatRequestSO.class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String toJson(ActivityStatRequestSO activityStatRequestSO) {
        try (Jsonb jsonb = JsonbBuilder.create()) {
            return jsonb.toJson(activityStatRequestSO);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String toJsonWithFormatting(ActivityStatRequestSO activityStatRequestSO) {
        try (Jsonb jsonb = JsonbBuilder.create(new JsonbConfig().withFormatting(true))) {
            return jsonb.toJson(activityStatRequestSO);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
