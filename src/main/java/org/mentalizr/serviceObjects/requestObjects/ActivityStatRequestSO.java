package org.mentalizr.serviceObjects.requestObjects;

import java.util.HashSet;
import java.util.Set;

/**
 * Specifies parameters for activity statistic calculation.
 * Hint: to choose all projects set projectsIncludeMode to false (= projects exclude mode) and leave set of
 * projects empty. choose all programs: accordingly.
 */
@SuppressWarnings("unused")
public class ActivityStatRequestSO {
    private Long fromTimestamp;
    private Long untilTimestamp;
    private Set<String> projects;
    private boolean projectsIncludeMode;
    private Set<String> programs;
    private boolean programsIncludeMode;

    public ActivityStatRequestSO() {
        this.fromTimestamp = 0L;
        this.untilTimestamp = Long.MAX_VALUE;
        this.projects = new HashSet<>();
        this.projectsIncludeMode = false;
        this.programs = new HashSet<>();
        this.programsIncludeMode = false;
    }

    public Long getFromTimestamp() {
        return this.fromTimestamp;
    }

    public void setFromTimestamp(Long fromTimestamp) {
        this.fromTimestamp = fromTimestamp;
    }

    public Long getUntilTimestamp() {
        return this.untilTimestamp;
    }

    public void setUntilTimestamp(Long untilTimestamp) {
        this.untilTimestamp = untilTimestamp;
    }

    public Set<String> getProjects() {
        return this.projects;
    }

    public void setProjects(Set<String> projects) {
        this.projects = projects;
    }

    public boolean isProjectsIncludeMode() {
        return this.projectsIncludeMode;
    }

    public void setProjectsIncludeMode(boolean projectsIncludeMode) {
        this.projectsIncludeMode = projectsIncludeMode;
    }

    public Set<String> getPrograms() {
        return this.programs;
    }

    public void setPrograms(Set<String> programs) {
        this.programs = programs;
    }

    public boolean isProgramsIncludeMode() {
        return this.programsIncludeMode;
    }

    public void setProgramsIncludeMode(boolean programsIncludeMode) {
        this.programsIncludeMode = programsIncludeMode;
    }

}
