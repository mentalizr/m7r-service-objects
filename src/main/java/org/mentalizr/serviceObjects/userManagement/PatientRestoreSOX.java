package org.mentalizr.serviceObjects.userManagement;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;

public class PatientRestoreSOX {

    public static PatientRestoreSO fromJson(String json) {
        try (Jsonb jsonb = JsonbBuilder.create()) {
            return jsonb.fromJson(json, PatientRestoreSO.class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String toJson(PatientRestoreSO patientRestoreSO) {
        try (Jsonb jsonb = JsonbBuilder.create()) {
            return jsonb.toJson(patientRestoreSO);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String toJsonWithFormatting(PatientRestoreSO patientRestoreSO) {
        try (Jsonb jsonb = JsonbBuilder.create(new JsonbConfig().withFormatting(true))) {
            return jsonb.toJson(patientRestoreSO);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
