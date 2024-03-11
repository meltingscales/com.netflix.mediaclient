package com.netflix.model.survey;

import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.netflix.model.survey.C$AutoValue_Survey;
import java.util.Collections;
import java.util.List;
import o.C8168dfL;

/* loaded from: classes.dex */
public abstract class Survey implements Parcelable {
    public abstract List<SurveyQuestion> b();

    public int e() {
        return b().size();
    }

    public SurveyQuestion c() {
        if (b().isEmpty()) {
            return null;
        }
        return b().get(0);
    }

    public boolean d() {
        return b() == null || b().isEmpty() || C8168dfL.g(b().get(0).j());
    }

    public static TypeAdapter<Survey> a(Gson gson) {
        return new C$AutoValue_Survey.d(gson).a(Collections.emptyList());
    }

    public static Survey a() {
        return new AutoValue_Survey(Collections.emptyList());
    }
}
