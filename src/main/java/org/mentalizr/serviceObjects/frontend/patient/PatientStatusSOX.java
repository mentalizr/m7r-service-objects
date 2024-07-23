package org.mentalizr.serviceObjects.frontend.patient;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;

public class PatientStatusSOX {

    public static PatientStatusSO fromJson(String json) {
        try (Jsonb jsonb = JsonbBuilder.create()) {
            return jsonb.fromJson(json, PatientStatusSO.class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String toJson(PatientStatusSO patientStatusSO) {
        try (Jsonb jsonb = JsonbBuilder.create()) {
            return jsonb.toJson(patientStatusSO);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String toJsonWithFormatting(PatientStatusSO patientStatusSO) {
        try (Jsonb jsonb = JsonbBuilder.create(new JsonbConfig().withFormatting(true))) {
            return jsonb.toJson(patientStatusSO);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
