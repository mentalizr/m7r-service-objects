package org.mentalizr.serviceObjects.userManagement;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;

public class AccessKeyCreateSOX {

    public static AccessKeyCreateSO fromJson(String json) {
        try (Jsonb jsonb = JsonbBuilder.create()) {
            return jsonb.fromJson(json, AccessKeyCreateSO.class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String toJson(AccessKeyCreateSO accessKeyCreateSO) {
        try (Jsonb jsonb = JsonbBuilder.create()) {
            return jsonb.toJson(accessKeyCreateSO);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String toJsonWithFormatting(AccessKeyCreateSO accessKeyCreateSO) {
        try (Jsonb jsonb = JsonbBuilder.create(new JsonbConfig().withFormatting(true))) {
            return jsonb.toJson(accessKeyCreateSO);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
