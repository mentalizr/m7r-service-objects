package org.mentalizr.serviceObjects.userManagement;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;

public class AccessKeyGetExpiredUnusedSOX {

    public static AccessKeyGetExpiredUnusedSO fromJson(String json) {
        try (Jsonb jsonb = JsonbBuilder.create()) {
            return jsonb.fromJson(json, AccessKeyGetExpiredUnusedSO.class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String toJson(AccessKeyGetExpiredUnusedSO accessKeyGetExpiredUnusedSO) {
        try (Jsonb jsonb = JsonbBuilder.create()) {
            return jsonb.toJson(accessKeyGetExpiredUnusedSO);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String toJsonWithFormatting(AccessKeyGetExpiredUnusedSO accessKeyGetExpiredUnusedSO) {
        try (Jsonb jsonb = JsonbBuilder.create(new JsonbConfig().withFormatting(true))) {
            return jsonb.toJson(accessKeyGetExpiredUnusedSO);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
