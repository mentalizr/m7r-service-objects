package org.mentalizr.serviceObjects.frontend.patient.formData;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;

public class FormDataSOX {

    public static FormDataSO fromJson(String json) {
        Jsonb jsonb = JsonbBuilder.create();
        return jsonb.fromJson(json, FormDataSO.class);
    }

    public static String toJson(FormDataSO formDataSO) {
        Jsonb jsonb = JsonbBuilder.create();
        return jsonb.toJson(formDataSO);
    }

    public static String toJsonWithFormatting(FormDataSO formDataSO) {
        Jsonb jsonb = JsonbBuilder.create(new JsonbConfig().withFormatting(true));
        return jsonb.toJson(formDataSO);
    }

}
