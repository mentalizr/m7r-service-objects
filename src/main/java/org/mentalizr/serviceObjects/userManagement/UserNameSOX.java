package org.mentalizr.serviceObjects.userManagement;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;

public class UserNameSOX {

    public static UserNameSO fromJson(String json) {
        try (Jsonb jsonb = JsonbBuilder.create()) {
            return jsonb.fromJson(json, UserNameSO.class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String toJson(UserNameSO userNameSO) {
        try (Jsonb jsonb = JsonbBuilder.create()) {
            return jsonb.toJson(userNameSO);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String toJsonWithFormatting(UserNameSO userNameSO) {
        try (Jsonb jsonb = JsonbBuilder.create(new JsonbConfig().withFormatting(true))) {
            return jsonb.toJson(userNameSO);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
