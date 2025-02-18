package org.mentalizr.serviceObjects.requestObjects;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;

public class UserListQuerySOX {

    public static UserListQuerySO fromJson(String json) {
        try (Jsonb jsonb = JsonbBuilder.create()) {
            return jsonb.fromJson(json, UserListQuerySO.class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String toJson(UserListQuerySO userListQuerySO) {
        try (Jsonb jsonb = JsonbBuilder.create()) {
            return jsonb.toJson(userListQuerySO);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String toJsonWithFormatting(UserListQuerySO userListQuerySO) {
        try (Jsonb jsonb = JsonbBuilder.create(new JsonbConfig().withFormatting(true))) {
            return jsonb.toJson(userListQuerySO);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
