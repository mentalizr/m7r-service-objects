package org.mentalizr.serviceObjects.userManagement;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;

public class AccessKeyGetExpiredActivatedSOX {

    public static AccessKeyGetExpiredActivatedSO fromJson(String json) {
        try (Jsonb jsonb = JsonbBuilder.create()) {
            return jsonb.fromJson(json, AccessKeyGetExpiredActivatedSO.class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String toJson(AccessKeyGetExpiredActivatedSO accessKeyGetExpiredActivatedSO) {
        try (Jsonb jsonb = JsonbBuilder.create()) {
            return jsonb.toJson(accessKeyGetExpiredActivatedSO);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String toJsonWithFormatting(AccessKeyGetExpiredActivatedSO accessKeyGetExpiredActivatedSO) {
        try (Jsonb jsonb = JsonbBuilder.create(new JsonbConfig().withFormatting(true))) {
            return jsonb.toJson(accessKeyGetExpiredActivatedSO);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
