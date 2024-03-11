package com.netflix.model.leafs.originals.interactive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.netflix.mediaclient.service.pushnotification.NotificationFactory;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_ImpressionData extends C$AutoValue_ImpressionData {
    public static final Parcelable.Creator<AutoValue_ImpressionData> CREATOR = new Parcelable.Creator<AutoValue_ImpressionData>() { // from class: com.netflix.model.leafs.originals.interactive.AutoValue_ImpressionData.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_ImpressionData createFromParcel(Parcel parcel) {
            return new AutoValue_ImpressionData(parcel.readInt() == 0 ? parcel.readString() : null, (StateData) parcel.readParcelable(ImpressionData.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_ImpressionData[] newArray(int i) {
            return new AutoValue_ImpressionData[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_ImpressionData(String str, StateData stateData) {
        new C$$AutoValue_ImpressionData(str, stateData) { // from class: com.netflix.model.leafs.originals.interactive.$AutoValue_ImpressionData

            /* renamed from: com.netflix.model.leafs.originals.interactive.$AutoValue_ImpressionData$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<ImpressionData> {
                private final TypeAdapter<StateData> dataAdapter;
                private final TypeAdapter<String> typeAdapter;
                private String defaultType = null;
                private StateData defaultData = null;

                public GsonTypeAdapter setDefaultData(StateData stateData) {
                    this.defaultData = stateData;
                    return this;
                }

                public GsonTypeAdapter setDefaultType(String str) {
                    this.defaultType = str;
                    return this;
                }

                public GsonTypeAdapter(Gson gson) {
                    this.typeAdapter = gson.getAdapter(String.class);
                    this.dataAdapter = gson.getAdapter(StateData.class);
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, ImpressionData impressionData) {
                    if (impressionData == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("type");
                    this.typeAdapter.write(jsonWriter, impressionData.type());
                    jsonWriter.name(NotificationFactory.DATA);
                    this.dataAdapter.write(jsonWriter, impressionData.data());
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.gson.TypeAdapter
                public ImpressionData read(JsonReader jsonReader) {
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                        return null;
                    }
                    jsonReader.beginObject();
                    String str = this.defaultType;
                    StateData stateData = this.defaultData;
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        if (jsonReader.peek() == JsonToken.NULL) {
                            jsonReader.nextNull();
                        } else {
                            nextName.hashCode();
                            if (nextName.equals(NotificationFactory.DATA)) {
                                stateData = this.dataAdapter.read(jsonReader);
                            } else if (nextName.equals("type")) {
                                str = this.typeAdapter.read(jsonReader);
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                    }
                    jsonReader.endObject();
                    return new AutoValue_ImpressionData(str, stateData);
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (type() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(type());
        }
        parcel.writeParcelable(data(), i);
    }
}
