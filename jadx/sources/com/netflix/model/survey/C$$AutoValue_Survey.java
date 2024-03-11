package com.netflix.model.survey;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.netflix.model.survey.$$AutoValue_Survey  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C$$AutoValue_Survey extends Survey {
    private final List<SurveyQuestion> b;

    @Override // com.netflix.model.survey.Survey
    public List<SurveyQuestion> b() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$AutoValue_Survey(List<SurveyQuestion> list) {
        if (list == null) {
            throw new NullPointerException("Null questions");
        }
        this.b = list;
    }

    public String toString() {
        return "Survey{questions=" + this.b + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Survey) {
            return this.b.equals(((Survey) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.b.hashCode() ^ 1000003;
    }
}
