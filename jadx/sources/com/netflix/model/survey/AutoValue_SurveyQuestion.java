package com.netflix.model.survey;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_SurveyQuestion extends C$AutoValue_SurveyQuestion {
    public static final Parcelable.Creator<AutoValue_SurveyQuestion> CREATOR = new Parcelable.Creator<AutoValue_SurveyQuestion>() { // from class: com.netflix.model.survey.AutoValue_SurveyQuestion.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: d */
        public AutoValue_SurveyQuestion createFromParcel(Parcel parcel) {
            return new AutoValue_SurveyQuestion(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: c */
        public AutoValue_SurveyQuestion[] newArray(int i) {
            return new AutoValue_SurveyQuestion[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_SurveyQuestion(final String str, final String str2, final String str3, final String str4, final String str5, final String str6, final String str7, final String str8, final String str9, final String str10, final String str11) {
        new C$$AutoValue_SurveyQuestion(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11) { // from class: com.netflix.model.survey.$AutoValue_SurveyQuestion

            /* renamed from: com.netflix.model.survey.$AutoValue_SurveyQuestion$e */
            /* loaded from: classes.dex */
            public static final class e extends TypeAdapter<SurveyQuestion> {
                private final TypeAdapter<String> a;
                private final TypeAdapter<String> b;
                private final TypeAdapter<String> c;
                private final TypeAdapter<String> d;
                private final TypeAdapter<String> e;
                private final TypeAdapter<String> p;
                private final TypeAdapter<String> q;
                private final TypeAdapter<String> r;
                private final TypeAdapter<String> t;
                private final TypeAdapter<String> w;
                private final TypeAdapter<String> y;
                private String l = null;
                private String s = null;
                private String m = null;
                private String k = null;
                private String n = null;

                /* renamed from: o  reason: collision with root package name */
                private String f13331o = null;
                private String i = null;
                private String j = null;
                private String g = null;
                private String f = null;
                private String h = null;

                public e(Gson gson) {
                    this.p = gson.getAdapter(String.class);
                    this.w = gson.getAdapter(String.class);
                    this.t = gson.getAdapter(String.class);
                    this.r = gson.getAdapter(String.class);
                    this.q = gson.getAdapter(String.class);
                    this.y = gson.getAdapter(String.class);
                    this.a = gson.getAdapter(String.class);
                    this.e = gson.getAdapter(String.class);
                    this.d = gson.getAdapter(String.class);
                    this.b = gson.getAdapter(String.class);
                    this.c = gson.getAdapter(String.class);
                }

                @Override // com.google.gson.TypeAdapter
                /* renamed from: c */
                public void write(JsonWriter jsonWriter, SurveyQuestion surveyQuestion) {
                    if (surveyQuestion == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name(SignupConstants.Field.LANG_ID);
                    this.p.write(jsonWriter, surveyQuestion.j());
                    jsonWriter.name("surveyType");
                    this.w.write(jsonWriter, surveyQuestion.m());
                    jsonWriter.name("questionNumString");
                    this.t.write(jsonWriter, surveyQuestion.h());
                    jsonWriter.name("questionHeader");
                    this.r.write(jsonWriter, surveyQuestion.i());
                    jsonWriter.name("questionBody");
                    this.q.write(jsonWriter, surveyQuestion.g());
                    jsonWriter.name("skipLabel");
                    this.y.write(jsonWriter, surveyQuestion.f());
                    jsonWriter.name("choice1Label");
                    this.a.write(jsonWriter, surveyQuestion.c());
                    jsonWriter.name("choice2Label");
                    this.e.write(jsonWriter, surveyQuestion.b());
                    jsonWriter.name("choice3Label");
                    this.d.write(jsonWriter, surveyQuestion.a());
                    jsonWriter.name("choice4Label");
                    this.b.write(jsonWriter, surveyQuestion.e());
                    jsonWriter.name("choice5Label");
                    this.c.write(jsonWriter, surveyQuestion.d());
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                @Override // com.google.gson.TypeAdapter
                /* renamed from: b */
                public SurveyQuestion read(JsonReader jsonReader) {
                    char c;
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                        return null;
                    }
                    jsonReader.beginObject();
                    String str = this.l;
                    String str2 = this.s;
                    String str3 = this.m;
                    String str4 = this.k;
                    String str5 = this.n;
                    String str6 = this.f13331o;
                    String str7 = this.i;
                    String str8 = this.j;
                    String str9 = this.g;
                    String str10 = str;
                    String str11 = str2;
                    String str12 = str3;
                    String str13 = str4;
                    String str14 = str5;
                    String str15 = str6;
                    String str16 = str7;
                    String str17 = str8;
                    String str18 = str9;
                    String str19 = this.f;
                    String str20 = this.h;
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        if (jsonReader.peek() == JsonToken.NULL) {
                            jsonReader.nextNull();
                        } else {
                            nextName.hashCode();
                            switch (nextName.hashCode()) {
                                case -1788287452:
                                    if (nextName.equals("choice1Label")) {
                                        c = 0;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1759658301:
                                    if (nextName.equals("choice2Label")) {
                                        c = 1;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1731029150:
                                    if (nextName.equals("choice3Label")) {
                                        c = 2;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1702399999:
                                    if (nextName.equals("choice4Label")) {
                                        c = 3;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1673770848:
                                    if (nextName.equals("choice5Label")) {
                                        c = 4;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -673944140:
                                    if (nextName.equals("surveyType")) {
                                        c = 5;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -172652888:
                                    if (nextName.equals("questionBody")) {
                                        c = 6;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 3355:
                                    if (nextName.equals(SignupConstants.Field.LANG_ID)) {
                                        c = 7;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 533766641:
                                    if (nextName.equals("questionNumString")) {
                                        c = '\b';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1746732563:
                                    if (nextName.equals("questionHeader")) {
                                        c = '\t';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 2076524725:
                                    if (nextName.equals("skipLabel")) {
                                        c = '\n';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                default:
                                    c = 65535;
                                    break;
                            }
                            switch (c) {
                                case 0:
                                    str16 = this.a.read(jsonReader);
                                    continue;
                                case 1:
                                    str17 = this.e.read(jsonReader);
                                    continue;
                                case 2:
                                    str18 = this.d.read(jsonReader);
                                    continue;
                                case 3:
                                    str19 = this.b.read(jsonReader);
                                    continue;
                                case 4:
                                    str20 = this.c.read(jsonReader);
                                    continue;
                                case 5:
                                    str11 = this.w.read(jsonReader);
                                    continue;
                                case 6:
                                    str14 = this.q.read(jsonReader);
                                    continue;
                                case 7:
                                    str10 = this.p.read(jsonReader);
                                    continue;
                                case '\b':
                                    str12 = this.t.read(jsonReader);
                                    continue;
                                case '\t':
                                    str13 = this.r.read(jsonReader);
                                    continue;
                                case '\n':
                                    str15 = this.y.read(jsonReader);
                                    continue;
                                default:
                                    jsonReader.skipValue();
                                    continue;
                            }
                        }
                    }
                    jsonReader.endObject();
                    return new AutoValue_SurveyQuestion(str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20);
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(j());
        parcel.writeString(m());
        parcel.writeString(h());
        parcel.writeString(i());
        parcel.writeString(g());
        parcel.writeString(f());
        parcel.writeString(c());
        if (b() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(b());
        }
        if (a() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(a());
        }
        if (e() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(e());
        }
        parcel.writeString(d());
    }
}
