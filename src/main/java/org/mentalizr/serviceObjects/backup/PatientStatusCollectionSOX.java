package org.mentalizr.serviceObjects.backup;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;

public class PatientStatusCollectionSOX {

    public static PatientStatusCollectionSO fromJson(String json) {
        try (Jsonb jsonb = JsonbBuilder.create()) {
            return jsonb.fromJson(json, PatientStatusCollectionSO.class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String toJson(PatientStatusCollectionSO patientStatusCollectionSO) {
        try (Jsonb jsonb = JsonbBuilder.create()) {
            return jsonb.toJson(patientStatusCollectionSO);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String toJsonWithFormatting(PatientStatusCollectionSO patientStatusCollectionSO) {
        try (Jsonb jsonb = JsonbBuilder.create(new JsonbConfig().withFormatting(true))) {
            return jsonb.toJson(patientStatusCollectionSO);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
