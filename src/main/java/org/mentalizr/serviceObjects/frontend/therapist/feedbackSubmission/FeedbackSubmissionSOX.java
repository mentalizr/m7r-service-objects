package org.mentalizr.serviceObjects.frontend.therapist.feedbackSubmission;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;

public class FeedbackSubmissionSOX {

    public static FeedbackSubmissionSO fromJson(String json) {
        Jsonb jsonb = JsonbBuilder.create();
        return jsonb.fromJson(json, FeedbackSubmissionSO.class);
    }

    public static String toJson(FeedbackSubmissionSO feedbackSubmissionSO) {
        Jsonb jsonb = JsonbBuilder.create();
        return jsonb.toJson(feedbackSubmissionSO);
    }

    public static String toJsonWithFormatting(FeedbackSubmissionSO feedbackSubmissionSO) {
        Jsonb jsonb = JsonbBuilder.create(new JsonbConfig().withFormatting(true));
        return jsonb.toJson(feedbackSubmissionSO);
    }

}
