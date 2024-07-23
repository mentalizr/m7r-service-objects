package org.mentalizr.serviceObjects;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;

public class SessionStatusSOX {

    public static SessionStatusSO fromJson(String json) {
        try (Jsonb jsonb = JsonbBuilder.create()) {
            return jsonb.fromJson(json, SessionStatusSO.class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String toJson(SessionStatusSO sessionStatusSO) {
        try (Jsonb jsonb = JsonbBuilder.create()) {
            return jsonb.toJson(sessionStatusSO);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String toJsonWithFormatting(SessionStatusSO sessionStatusSO) {
        try (Jsonb jsonb = JsonbBuilder.create(new JsonbConfig().withFormatting(true))) {
            return jsonb.toJson(sessionStatusSO);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
