package org.mentalizr.serviceObjects.userManagement;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;

public class ProjectUnassignSOX {

    public static ProjectUnassignSO fromJson(String json) {
        try (Jsonb jsonb = JsonbBuilder.create()) {
            return jsonb.fromJson(json, ProjectUnassignSO.class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String toJson(ProjectUnassignSO projectUnassignSO) {
        try (Jsonb jsonb = JsonbBuilder.create()) {
            return jsonb.toJson(projectUnassignSO);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String toJsonWithFormatting(ProjectUnassignSO projectUnassignSO) {
        try (Jsonb jsonb = JsonbBuilder.create(new JsonbConfig().withFormatting(true))) {
            return jsonb.toJson(projectUnassignSO);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
