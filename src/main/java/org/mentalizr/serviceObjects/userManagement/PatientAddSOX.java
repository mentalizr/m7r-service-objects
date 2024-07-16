package org.mentalizr.serviceObjects.userManagement;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;

public class PatientAddSOX {

    public static PatientAddSO fromJson(String json) {
        try (Jsonb jsonb = JsonbBuilder.create()) {
            return jsonb.fromJson(json, PatientAddSO.class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String toJson(PatientAddSO patientAddSO) {
        try (Jsonb jsonb = JsonbBuilder.create()) {
            return jsonb.toJson(patientAddSO);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String toJsonWithFormatting(PatientAddSO patientAddSO) {
        try (Jsonb jsonb = JsonbBuilder.create(new JsonbConfig().withFormatting(true))) {
            return jsonb.toJson(patientAddSO);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
