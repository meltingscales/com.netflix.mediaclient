package com.netflix.model.survey;

import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.netflix.model.survey.C$AutoValue_SurveyQuestion;

/* loaded from: classes.dex */
public abstract class SurveyQuestion implements Parcelable {
    public abstract String a();

    public abstract String b();

    public abstract String c();

    public abstract String d();

    public abstract String e();

    public abstract String f();

    public abstract String g();

    public abstract String h();

    public abstract String i();

    public abstract String j();

    public abstract String m();

    public static TypeAdapter<SurveyQuestion> a(Gson gson) {
        return new C$AutoValue_SurveyQuestion.e(gson);
    }
}
