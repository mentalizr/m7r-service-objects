package org.mentalizr.serviceObjects.requestObjects;

import de.arthurpicht.utils.core.strings.Strings;

import java.util.HashSet;
import java.util.Objects;
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

    @Override
    public String toString() {
        return "ActivityStatRequestSO{" +
                "fromTimestamp=" + fromTimestamp +
                ", untilTimestamp=" + untilTimestamp +
                ", projects={" + Strings.listing(projects, ", ") + "}" +
                ", projectsIncludeMode=" + projectsIncludeMode +
                ", programs={" + Strings.listing(programs, ", ") + "}" +
                ", programsIncludeMode=" + programsIncludeMode +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ActivityStatRequestSO that = (ActivityStatRequestSO) o;
        return projectsIncludeMode == that.projectsIncludeMode && programsIncludeMode == that.programsIncludeMode && Objects.equals(fromTimestamp, that.fromTimestamp) && Objects.equals(untilTimestamp, that.untilTimestamp) && Objects.equals(projects, that.projects) && Objects.equals(programs, that.programs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fromTimestamp, untilTimestamp, projects, projectsIncludeMode, programs, programsIncludeMode);
    }

}
