package org.mentalizr.serviceObjects.userManagement;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;

public class ProjectCollectionSOX {

    public static ProjectCollectionSO fromJson(String json) {
        try (Jsonb jsonb = JsonbBuilder.create()) {
            return jsonb.fromJson(json, ProjectCollectionSO.class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String toJson(ProjectCollectionSO projectCollectionSO) {
        try (Jsonb jsonb = JsonbBuilder.create()) {
            return jsonb.toJson(projectCollectionSO);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String toJsonWithFormatting(ProjectCollectionSO projectCollectionSO) {
        try (Jsonb jsonb = JsonbBuilder.create(new JsonbConfig().withFormatting(true))) {
            return jsonb.toJson(projectCollectionSO);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
