package org.mentalizr.serviceObjects.userManagement;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;

public class UserExistsSOX {

    public static UserExistsSO fromJson(String json) {
        try (Jsonb jsonb = JsonbBuilder.create()) {
            return jsonb.fromJson(json, UserExistsSO.class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String toJson(UserExistsSO userExistsSO) {
        try (Jsonb jsonb = JsonbBuilder.create()) {
            return jsonb.toJson(userExistsSO);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String toJsonWithFormatting(UserExistsSO userExistsSO) {
        try (Jsonb jsonb = JsonbBuilder.create(new JsonbConfig().withFormatting(true))) {
            return jsonb.toJson(userExistsSO);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
