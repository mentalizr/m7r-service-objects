package org.mentalizr.serviceObjects.userManagement;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;

public class TherapistAddSOX {

    public static TherapistAddSO fromJson(String json) {
        try (Jsonb jsonb = JsonbBuilder.create()) {
            return jsonb.fromJson(json, TherapistAddSO.class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String toJson(TherapistAddSO therapistAddSO) {
        try (Jsonb jsonb = JsonbBuilder.create()) {
            return jsonb.toJson(therapistAddSO);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String toJsonWithFormatting(TherapistAddSO therapistAddSO) {
        try (Jsonb jsonb = JsonbBuilder.create(new JsonbConfig().withFormatting(true))) {
            return jsonb.toJson(therapistAddSO);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
