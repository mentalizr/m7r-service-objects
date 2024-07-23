package org.mentalizr.serviceObjects.userManagement;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;

public class PatientRestoreCollectionSOX {

    public static PatientRestoreCollectionSO fromJson(String json) {
        try (Jsonb jsonb = JsonbBuilder.create()) {
            return jsonb.fromJson(json, PatientRestoreCollectionSO.class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String toJson(PatientRestoreCollectionSO patientRestoreCollectionSO) {
        try (Jsonb jsonb = JsonbBuilder.create()) {
            return jsonb.toJson(patientRestoreCollectionSO);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String toJsonWithFormatting(PatientRestoreCollectionSO patientRestoreCollectionSO) {
        try (Jsonb jsonb = JsonbBuilder.create(new JsonbConfig().withFormatting(true))) {
            return jsonb.toJson(patientRestoreCollectionSO);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
