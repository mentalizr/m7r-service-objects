package org.mentalizr.serviceObjects.frontend.patient.formData;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FormDataSOs {

    public static List<String> getFormElementDataIds(FormDataSO formDataSO) {
        return formDataSO.getFormElementDataList().stream()
                .map(FormElementDataSO::getFormElementId)
                .collect(Collectors.toList());
    }

    public static boolean containsFormElementDataId(FormDataSO formDataSO, String id) {
        return formDataSO.getFormElementDataList().stream()
                .anyMatch(formElementDataSO -> formElementDataSO.getFormElementId().equals(id));
    }

    public static Optional<FormElementDataSO> getFormElementDataById(FormDataSO formDataSO, String id) {
        return formDataSO.getFormElementDataList().stream()
                .filter(formElementDataSO -> formElementDataSO.getFormElementId().equals(id))
                .findFirst();
    }

    public static boolean isExercise(FormDataSO formDataSO) {
        return formDataSO.getExercise() != null;
    }

    public static boolean isSent(FormDataSO formDataSO) {
        return formDataSO.getExercise() != null && formDataSO.getExercise().isSent();
    }

    public static boolean hasFeedback(FormDataSO formDataSO) {
        return formDataSO.getFeedback() != null;
    }

}
