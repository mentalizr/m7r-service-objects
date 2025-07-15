package org.mentalizr.serviceObjects.userManagement;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;

public class AccessKeySOX {

    public static AccessKeySO fromJson(String json) {
        try (Jsonb jsonb = JsonbBuilder.create()) {
            return jsonb.fromJson(json, AccessKeySO.class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String toJson(AccessKeySO accessKeySO) {
        try (Jsonb jsonb = JsonbBuilder.create()) {
            return jsonb.toJson(accessKeySO);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String toJsonWithFormatting(AccessKeySO accessKeySO) {
        try (Jsonb jsonb = JsonbBuilder.create(new JsonbConfig().withFormatting(true))) {
            return jsonb.toJson(accessKeySO);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
