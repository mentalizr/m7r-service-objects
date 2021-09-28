package org.mentalizr.serviceObjects.frontend.therapist.feedbackSubmission;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class FeedbackSubmissionSO {

    public static final String USER_ID = "userId";
    public static final String CONTENT_ID = "contentId";
    public static final String FEEDBACK = "feedback";

    private String userId;
    private String contentId;
    private String feedback;

    public FeedbackSubmissionSO() {
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getContentId() {
        return contentId;
    }

    public void setContentId(String contentId) {
        this.contentId = contentId;
    }

    public String getFeedback() {
        return this.feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

}
