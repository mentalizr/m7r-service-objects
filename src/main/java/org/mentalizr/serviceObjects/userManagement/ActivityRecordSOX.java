package org.mentalizr.serviceObjects.userManagement;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;

public class ActivityRecordSOX {

    public static ActivityRecordSO fromJson(String json) {
        try (Jsonb jsonb = JsonbBuilder.create()) {
            return jsonb.fromJson(json, ActivityRecordSO.class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public String toJson(ActivityRecordSO activityRecordSO) {
        try (Jsonb jsonb = JsonbBuilder.create()) {
            return jsonb.toJson(activityRecordSO);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String toJsonWithFormatting(ActivityRecordSO activityRecordSO) {
        try (Jsonb jsonb = JsonbBuilder.create(new JsonbConfig().withFormatting(true))) {
            return jsonb.toJson(activityRecordSO);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
