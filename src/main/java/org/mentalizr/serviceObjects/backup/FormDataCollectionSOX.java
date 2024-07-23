package org.mentalizr.serviceObjects.backup;

import org.mentalizr.serviceObjects.userManagement.ProgramCollectionSO;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;

public class FormDataCollectionSOX {

    public static FormDataCollectionSO fromJson(String json) {
        try (Jsonb jsonb = JsonbBuilder.create()) {
            return jsonb.fromJson(json, FormDataCollectionSO.class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String toJson(FormDataCollectionSO formDataCollectionSO) throws Exception {
        try (Jsonb jsonb = JsonbBuilder.create()) {
            return jsonb.toJson(formDataCollectionSO);
        }
    }

    public static String toJsonWithFormatting(FormDataCollectionSO formDataCollectionSO) {
        try (Jsonb jsonb = JsonbBuilder.create(new JsonbConfig().withFormatting(true))) {
            return jsonb.toJson(formDataCollectionSO);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
