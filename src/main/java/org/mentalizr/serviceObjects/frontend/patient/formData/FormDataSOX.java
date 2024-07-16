package org.mentalizr.serviceObjects.frontend.patient.formData;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;

public class FormDataSOX {

    public static FormDataSO fromJson(String json) {
        try (Jsonb jsonb = JsonbBuilder.create()) {
            return jsonb.fromJson(json, FormDataSO.class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String toJson(FormDataSO formDataSO) {
        try (Jsonb jsonb = JsonbBuilder.create()) {
            return jsonb.toJson(formDataSO);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String toJsonWithFormatting(FormDataSO formDataSO) {
        try (Jsonb jsonb = JsonbBuilder.create(new JsonbConfig().withFormatting(true))) {
            return jsonb.toJson(formDataSO);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
