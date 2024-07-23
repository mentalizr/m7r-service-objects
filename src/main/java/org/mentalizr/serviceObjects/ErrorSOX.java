package org.mentalizr.serviceObjects;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;

public class ErrorSOX {

    public static ErrorSO fromJson(String json) {
        try (Jsonb jsonb = JsonbBuilder.create()) {
            return jsonb.fromJson(json, ErrorSO.class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String toJson(ErrorSO errorSO) {
        try (Jsonb jsonb = JsonbBuilder.create()) {
            return jsonb.toJson(errorSO);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String toJsonWithFormatting(ErrorSO errorSO) {
        try (Jsonb jsonb = JsonbBuilder.create(new JsonbConfig().withFormatting(true))) {
            return jsonb.toJson(errorSO);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
