package org.mentalizr.serviceObjects.frontend.patient.formData;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
public class FormDataSO {

    public static final String USER_ID = "userId";
    public static final String CONTENT_ID = "contentId";
    public static final String EXERCISE = "exercise";
    public static final String FORM_ELEMENT_DATA_LIST = "formElementDataList";
    public static final String FEEDBACK = "feedback";

    private String userId;
    private String contentId;
    private ExerciseSO exerciseSO = null;
    private List<FormElementDataSO> formElementDataSOList;
    private FeedbackSO feedbackSO = null;

    public FormDataSO() {
        this.userId = "";
        this.contentId = "";
        this.formElementDataSOList = new ArrayList<>();
    }

    public FormDataSO(String userId, String contentId, List<FormElementDataSO> formElementDataSOList) {
        this.userId = userId;
        this.contentId = contentId;
        this.formElementDataSOList = formElementDataSOList;
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

    public ExerciseSO getExercise() {
        return exerciseSO;
    }

    public void setExercise(ExerciseSO exerciseSO) {
        this.exerciseSO = exerciseSO;
    }

    public List<FormElementDataSO> getFormElementDataList() {
        return formElementDataSOList;
    }

    public void setFormElementDataList(List<FormElementDataSO> formElementDataSOList) {
        this.formElementDataSOList = formElementDataSOList;
    }

    public FeedbackSO getFeedback() {
        return feedbackSO;
    }

    public void setFeedback(FeedbackSO feedbackSO) {
        this.feedbackSO = feedbackSO;
    }

    @Override
    public String toString() {
        return FormDataSOX.toJsonWithFormatting(this);
    }

}
