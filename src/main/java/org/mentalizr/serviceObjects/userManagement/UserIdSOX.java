package org.mentalizr.serviceObjects.userManagement;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;

public class UserIdSOX {

    public static UserIdSO fromJson(String json) {
        try (Jsonb jsonb = JsonbBuilder.create()) {
            return jsonb.fromJson(json, UserIdSO.class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String toJson(UserIdSO userIDSO) {
        try (Jsonb jsonb = JsonbBuilder.create()) {
            return jsonb.toJson(userIDSO);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String toJsonWithFormatting(UserIdSO userIdSO) {
        try (Jsonb jsonb = JsonbBuilder.create(new JsonbConfig().withFormatting(true))) {
            return jsonb.toJson(userIdSO);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
