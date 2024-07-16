package org.mentalizr.serviceObjects.frontend.therapist.feedbackSubmission;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;

public class FeedbackSubmissionSOX {

    public static FeedbackSubmissionSO fromJson(String json) {
        try (Jsonb jsonb = JsonbBuilder.create()) {
            return jsonb.fromJson(json, FeedbackSubmissionSO.class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String toJson(FeedbackSubmissionSO feedbackSubmissionSO) {
        try (Jsonb jsonb = JsonbBuilder.create()) {
            return jsonb.toJson(feedbackSubmissionSO);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String toJsonWithFormatting(FeedbackSubmissionSO feedbackSubmissionSO) {
        try (Jsonb jsonb = JsonbBuilder.create(new JsonbConfig().withFormatting(true))) {
            return jsonb.toJson(feedbackSubmissionSO);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
