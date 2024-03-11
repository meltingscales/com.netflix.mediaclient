package com.netflix.model.leafs.originals.interactive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import com.netflix.model.leafs.originals.interactive.Moment;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_Moment_MomentOverride extends C$AutoValue_Moment_MomentOverride {
    public static final Parcelable.Creator<AutoValue_Moment_MomentOverride> CREATOR = new Parcelable.Creator<AutoValue_Moment_MomentOverride>() { // from class: com.netflix.model.leafs.originals.interactive.AutoValue_Moment_MomentOverride.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_Moment_MomentOverride createFromParcel(Parcel parcel) {
            return new AutoValue_Moment_MomentOverride((Moment) parcel.readParcelable(Moment.MomentOverride.class.getClassLoader()), parcel.readInt() == 0 ? parcel.readString() : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_Moment_MomentOverride[] newArray(int i) {
            return new AutoValue_Moment_MomentOverride[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_Moment_MomentOverride(Moment moment, String str) {
        new C$$AutoValue_Moment_MomentOverride(moment, str) { // from class: com.netflix.model.leafs.originals.interactive.$AutoValue_Moment_MomentOverride

            /* renamed from: com.netflix.model.leafs.originals.interactive.$AutoValue_Moment_MomentOverride$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<Moment.MomentOverride> {
                private final TypeAdapter<Moment> dataAdapter;
                private Moment defaultData = null;
                private String defaultPreconditionId = null;
                private final TypeAdapter<String> preconditionIdAdapter;

                public GsonTypeAdapter setDefaultData(Moment moment) {
                    this.defaultData = moment;
                    return this;
                }

                public GsonTypeAdapter setDefaultPreconditionId(String str) {
                    this.defaultPreconditionId = str;
                    return this;
                }

                public GsonTypeAdapter(Gson gson) {
                    this.dataAdapter = gson.getAdapter(Moment.class);
                    this.preconditionIdAdapter = gson.getAdapter(String.class);
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, Moment.MomentOverride momentOverride) {
                    if (momentOverride == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name(NotificationFactory.DATA);
                    this.dataAdapter.write(jsonWriter, momentOverride.data());
                    jsonWriter.name("preconditionId");
                    this.preconditionIdAdapter.write(jsonWriter, momentOverride.preconditionId());
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.gson.TypeAdapter
                public Moment.MomentOverride read(JsonReader jsonReader) {
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                        return null;
                    }
                    jsonReader.beginObject();
                    Moment moment = this.defaultData;
                    String str = this.defaultPreconditionId;
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        if (jsonReader.peek() == JsonToken.NULL) {
                            jsonReader.nextNull();
                        } else {
                            nextName.hashCode();
                            if (nextName.equals(NotificationFactory.DATA)) {
                                moment = this.dataAdapter.read(jsonReader);
                            } else if (nextName.equals("preconditionId")) {
                                str = this.preconditionIdAdapter.read(jsonReader);
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                    }
                    jsonReader.endObject();
                    return new AutoValue_Moment_MomentOverride(moment, str);
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(data(), i);
        if (preconditionId() == null) {
            parcel.writeInt(1);
            return;
        }
        parcel.writeInt(0);
        parcel.writeString(preconditionId());
    }
}
