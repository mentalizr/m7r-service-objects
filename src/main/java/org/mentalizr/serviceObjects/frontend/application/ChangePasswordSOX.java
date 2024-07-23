package org.mentalizr.serviceObjects.frontend.application;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;

public class ChangePasswordSOX {

    public static ChangePasswordSO fromJson(String json) {
        try (Jsonb jsonb = JsonbBuilder.create()) {
            return jsonb.fromJson(json, ChangePasswordSO.class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String toJson(ChangePasswordSO changePasswordSO) {
        try (Jsonb jsonb = JsonbBuilder.create()) {
            return jsonb.toJson(changePasswordSO);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String toJsonWithFormatting(ChangePasswordSO changePasswordSO) {
        try (Jsonb jsonb = JsonbBuilder.create(new JsonbConfig().withFormatting(true))) {
            return jsonb.toJson(changePasswordSO);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
