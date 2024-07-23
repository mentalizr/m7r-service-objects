package org.mentalizr.serviceObjects.userManagement;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;

public class ProjectAssignSOX {

    public static ProjectAssignSO fromJson(String json) {
        try (Jsonb jsonb = JsonbBuilder.create()) {
            return jsonb.fromJson(json, ProjectAssignSO.class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String toJson(ProjectAssignSO projectAssignSO) {
        try (Jsonb jsonb = JsonbBuilder.create()) {
            return jsonb.toJson(projectAssignSO);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String toJsonWithFormatting(ProjectAssignSO projectAssignSO) {
        try (Jsonb jsonb = JsonbBuilder.create(new JsonbConfig().withFormatting(true))) {
            return jsonb.toJson(projectAssignSO);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
