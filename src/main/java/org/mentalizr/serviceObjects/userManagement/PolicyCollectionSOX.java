package org.mentalizr.serviceObjects.userManagement;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;

public class PolicyCollectionSOX {

    public static PolicyCollectionSO fromJson(String json) {
        try (Jsonb jsonb = JsonbBuilder.create()) {
            return jsonb.fromJson(json, PolicyCollectionSO.class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String toJson(PolicyCollectionSO policyCollectionSO) {
        try (Jsonb jsonb = JsonbBuilder.create()) {
            return jsonb.toJson(policyCollectionSO);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String toJsonWithFormatting(PolicyCollectionSO policyCollectionSO) {
        try (Jsonb jsonb = JsonbBuilder.create(new JsonbConfig().withFormatting(true))) {
            return jsonb.toJson(policyCollectionSO);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
