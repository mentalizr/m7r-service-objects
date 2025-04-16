package org.mentalizr.serviceObjects.userManagement;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;

public class UserGetByIdSOX {

    public static UserGetByIdSO fromJson(String json) {
        try (Jsonb jsonb = JsonbBuilder.create()) {
            return jsonb.fromJson(json, UserGetByIdSO.class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String toJson(UserGetByIdSO userGetByIDSO) {
        try (Jsonb jsonb = JsonbBuilder.create()) {
            return jsonb.toJson(userGetByIDSO);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String toJsonWithFormatting(UserGetByIdSO accessKeyGetSO) {
        try (Jsonb jsonb = JsonbBuilder.create(new JsonbConfig().withFormatting(true))) {
            return jsonb.toJson(accessKeyGetSO);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
