package com.netflix.model.leafs.originals.interactive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.netflix.model.leafs.originals.interactive.InteractiveSummary;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_InteractiveSummary extends C$AutoValue_InteractiveSummary {
    public static final Parcelable.Creator<AutoValue_InteractiveSummary> CREATOR = new Parcelable.Creator<AutoValue_InteractiveSummary>() { // from class: com.netflix.model.leafs.originals.interactive.AutoValue_InteractiveSummary.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_InteractiveSummary createFromParcel(Parcel parcel) {
            return new AutoValue_InteractiveSummary((InteractiveSummary.Features) parcel.readParcelable(InteractiveSummary.class.getClassLoader()), parcel.readHashMap(InteractiveSummary.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_InteractiveSummary[] newArray(int i) {
            return new AutoValue_InteractiveSummary[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_InteractiveSummary(InteractiveSummary.Features features, Map<String, String> map) {
        new C$$AutoValue_InteractiveSummary(features, map) { // from class: com.netflix.model.leafs.originals.interactive.$AutoValue_InteractiveSummary

            /* renamed from: com.netflix.model.leafs.originals.interactive.$AutoValue_InteractiveSummary$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<InteractiveSummary> {
                private InteractiveSummary.Features defaultFeatures = null;
                private Map<String, String> defaultNextSegmentRedirects = null;
                private final TypeAdapter<InteractiveSummary.Features> featuresAdapter;
                private final TypeAdapter<Map<String, String>> nextSegmentRedirectsAdapter;

                public GsonTypeAdapter setDefaultFeatures(InteractiveSummary.Features features) {
                    this.defaultFeatures = features;
                    return this;
                }

                public GsonTypeAdapter setDefaultNextSegmentRedirects(Map<String, String> map) {
                    this.defaultNextSegmentRedirects = map;
                    return this;
                }

                public GsonTypeAdapter(Gson gson) {
                    this.featuresAdapter = gson.getAdapter(InteractiveSummary.Features.class);
                    this.nextSegmentRedirectsAdapter = gson.getAdapter(TypeToken.getParameterized(Map.class, String.class, String.class));
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, InteractiveSummary interactiveSummary) {
                    if (interactiveSummary == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("features");
                    this.featuresAdapter.write(jsonWriter, interactiveSummary.features());
                    jsonWriter.name("nextSegmentRedirects");
                    this.nextSegmentRedirectsAdapter.write(jsonWriter, interactiveSummary.nextSegmentRedirects());
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.gson.TypeAdapter
                public InteractiveSummary read(JsonReader jsonReader) {
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                        return null;
                    }
                    jsonReader.beginObject();
                    InteractiveSummary.Features features = this.defaultFeatures;
                    Map<String, String> map = this.defaultNextSegmentRedirects;
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        if (jsonReader.peek() == JsonToken.NULL) {
                            jsonReader.nextNull();
                        } else {
                            nextName.hashCode();
                            if (nextName.equals("features")) {
                                features = this.featuresAdapter.read(jsonReader);
                            } else if (nextName.equals("nextSegmentRedirects")) {
                                map = this.nextSegmentRedirectsAdapter.read(jsonReader);
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                    }
                    jsonReader.endObject();
                    return new AutoValue_InteractiveSummary(features, map);
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(features(), i);
        parcel.writeMap(nextSegmentRedirects());
    }
}
