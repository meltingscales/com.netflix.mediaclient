package com.netflix.model.leafs.originals.interactive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.netflix.model.leafs.originals.interactive.Moment;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_Moment_TimeoutSegment extends C$AutoValue_Moment_TimeoutSegment {
    public static final Parcelable.Creator<AutoValue_Moment_TimeoutSegment> CREATOR = new Parcelable.Creator<AutoValue_Moment_TimeoutSegment>() { // from class: com.netflix.model.leafs.originals.interactive.AutoValue_Moment_TimeoutSegment.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_Moment_TimeoutSegment createFromParcel(Parcel parcel) {
            return new AutoValue_Moment_TimeoutSegment(parcel.readInt() == 0 ? parcel.readString() : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_Moment_TimeoutSegment[] newArray(int i) {
            return new AutoValue_Moment_TimeoutSegment[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_Moment_TimeoutSegment(final String str) {
        new C$$AutoValue_Moment_TimeoutSegment(str) { // from class: com.netflix.model.leafs.originals.interactive.$AutoValue_Moment_TimeoutSegment

            /* renamed from: com.netflix.model.leafs.originals.interactive.$AutoValue_Moment_TimeoutSegment$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<Moment.TimeoutSegment> {
                private String defaultSegmentId = null;
                private final TypeAdapter<String> segmentIdAdapter;

                public GsonTypeAdapter setDefaultSegmentId(String str) {
                    this.defaultSegmentId = str;
                    return this;
                }

                public GsonTypeAdapter(Gson gson) {
                    this.segmentIdAdapter = gson.getAdapter(String.class);
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, Moment.TimeoutSegment timeoutSegment) {
                    if (timeoutSegment == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("segmentId");
                    this.segmentIdAdapter.write(jsonWriter, timeoutSegment.segmentId());
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.gson.TypeAdapter
                public Moment.TimeoutSegment read(JsonReader jsonReader) {
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                        return null;
                    }
                    jsonReader.beginObject();
                    String str = this.defaultSegmentId;
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        if (jsonReader.peek() == JsonToken.NULL) {
                            jsonReader.nextNull();
                        } else {
                            nextName.hashCode();
                            if (nextName.equals("segmentId")) {
                                str = this.segmentIdAdapter.read(jsonReader);
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                    }
                    jsonReader.endObject();
                    return new AutoValue_Moment_TimeoutSegment(str);
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (segmentId() == null) {
            parcel.writeInt(1);
            return;
        }
        parcel.writeInt(0);
        parcel.writeString(segmentId());
    }
}
