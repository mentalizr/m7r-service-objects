package org.mentalizr.serviceObjects.userManagement;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;

public class AccessKeyDeleteSOX {

    public static AccessKeyDeleteSO fromJson(String json) {
        try (Jsonb jsonb = JsonbBuilder.create()) {
            return jsonb.fromJson(json, AccessKeyDeleteSO.class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String toJson(AccessKeyDeleteSO accessKeyDeleteSO) {
        try (Jsonb jsonb = JsonbBuilder.create()) {
            return jsonb.toJson(accessKeyDeleteSO);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String toJsonWithFormatting(AccessKeyDeleteSO accessKeyDeleteSO) {
        try (Jsonb jsonb = JsonbBuilder.create(new JsonbConfig().withFormatting(true))) {
            return jsonb.toJson(accessKeyDeleteSO);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
