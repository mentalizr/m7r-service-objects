package org.mentalizr.serviceObjects.userManagement;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;

public class ProjectSOX {

    public static ProjectSO fromJson(String json) {
        try (Jsonb jsonb = JsonbBuilder.create()) {
            return jsonb.fromJson(json, ProjectSO.class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String toJson(ProjectSO projectSO) {
        try (Jsonb jsonb = JsonbBuilder.create()) {
            return jsonb.toJson(projectSO);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String toJsonWithFormatting(ProjectSO projectSO) {
        try (Jsonb jsonb = JsonbBuilder.create(new JsonbConfig().withFormatting(true))) {
            return jsonb.toJson(projectSO);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
