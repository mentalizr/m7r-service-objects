package org.mentalizr.serviceObjects.userManagement;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;

public class ActivityStatisticCollectionSOX {
    public static ActivityStatisticCollectionSO fromJson(String json) {
        try (Jsonb jsonb = JsonbBuilder.create()) {
            return jsonb.fromJson(json, ActivityStatisticCollectionSO.class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String toJson(ActivityStatisticCollectionSO statisticCollectionSO) {
        try (Jsonb jsonb = JsonbBuilder.create()) {
            return jsonb.toJson(statisticCollectionSO);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String toJsonWithFormatting(ActivityStatisticCollectionSO statisticCollectionSO) {
        try (Jsonb jsonb = JsonbBuilder.create(new JsonbConfig().withFormatting(true))) {
            return jsonb.toJson(statisticCollectionSO);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


}
