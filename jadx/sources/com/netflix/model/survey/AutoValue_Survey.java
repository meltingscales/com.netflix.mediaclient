package com.netflix.model.survey;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_Survey extends C$AutoValue_Survey {
    public static final Parcelable.Creator<AutoValue_Survey> CREATOR = new Parcelable.Creator<AutoValue_Survey>() { // from class: com.netflix.model.survey.AutoValue_Survey.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: e */
        public AutoValue_Survey createFromParcel(Parcel parcel) {
            return new AutoValue_Survey(parcel.readArrayList(Survey.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: d */
        public AutoValue_Survey[] newArray(int i) {
            return new AutoValue_Survey[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_Survey(final List<SurveyQuestion> list) {
        new C$$AutoValue_Survey(list) { // from class: com.netflix.model.survey.$AutoValue_Survey

            /* renamed from: com.netflix.model.survey.$AutoValue_Survey$d */
            /* loaded from: classes.dex */
            public static final class d extends TypeAdapter<Survey> {
                private List<SurveyQuestion> a = null;
                private final TypeAdapter<List<SurveyQuestion>> b;

                public d a(List<SurveyQuestion> list) {
                    this.a = list;
                    return this;
                }

                public d(Gson gson) {
                    this.b = gson.getAdapter(TypeToken.getParameterized(List.class, SurveyQuestion.class));
                }

                @Override // com.google.gson.TypeAdapter
                /* renamed from: b */
                public void write(JsonWriter jsonWriter, Survey survey) {
                    if (survey == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("questions");
                    this.b.write(jsonWriter, survey.b());
                    jsonWriter.endObject();
                }

                @Override // com.google.gson.TypeAdapter
                /* renamed from: a */
                public Survey read(JsonReader jsonReader) {
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                        return null;
                    }
                    jsonReader.beginObject();
                    List<SurveyQuestion> list = this.a;
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        if (jsonReader.peek() == JsonToken.NULL) {
                            jsonReader.nextNull();
                        } else {
                            nextName.hashCode();
                            if (nextName.equals("questions")) {
                                list = this.b.read(jsonReader);
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                    }
                    jsonReader.endObject();
                    return new AutoValue_Survey(list);
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(b());
    }
}
