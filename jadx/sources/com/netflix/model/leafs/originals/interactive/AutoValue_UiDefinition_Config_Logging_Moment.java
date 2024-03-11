package com.netflix.model.leafs.originals.interactive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.netflix.model.leafs.originals.interactive.UiDefinition;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_UiDefinition_Config_Logging_Moment extends C$AutoValue_UiDefinition_Config_Logging_Moment {
    public static final Parcelable.Creator<AutoValue_UiDefinition_Config_Logging_Moment> CREATOR = new Parcelable.Creator<AutoValue_UiDefinition_Config_Logging_Moment>() { // from class: com.netflix.model.leafs.originals.interactive.AutoValue_UiDefinition_Config_Logging_Moment.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_UiDefinition_Config_Logging_Moment createFromParcel(Parcel parcel) {
            return new AutoValue_UiDefinition_Config_Logging_Moment((TrackingInfo) parcel.readParcelable(UiDefinition.Config.Logging.Moment.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_UiDefinition_Config_Logging_Moment[] newArray(int i) {
            return new AutoValue_UiDefinition_Config_Logging_Moment[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_UiDefinition_Config_Logging_Moment(TrackingInfo trackingInfo) {
        new C$$AutoValue_UiDefinition_Config_Logging_Moment(trackingInfo) { // from class: com.netflix.model.leafs.originals.interactive.$AutoValue_UiDefinition_Config_Logging_Moment

            /* renamed from: com.netflix.model.leafs.originals.interactive.$AutoValue_UiDefinition_Config_Logging_Moment$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<UiDefinition.Config.Logging.Moment> {
                private TrackingInfo defaultTrackingInfo = null;
                private final TypeAdapter<TrackingInfo> trackingInfoAdapter = new TrackingInfoAdapter();

                public GsonTypeAdapter setDefaultTrackingInfo(TrackingInfo trackingInfo) {
                    this.defaultTrackingInfo = trackingInfo;
                    return this;
                }

                public GsonTypeAdapter(Gson gson) {
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, UiDefinition.Config.Logging.Moment moment) {
                    if (moment == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("trackingInfo");
                    this.trackingInfoAdapter.write(jsonWriter, moment.trackingInfo());
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.gson.TypeAdapter
                public UiDefinition.Config.Logging.Moment read(JsonReader jsonReader) {
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                        return null;
                    }
                    jsonReader.beginObject();
                    TrackingInfo trackingInfo = this.defaultTrackingInfo;
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        if (jsonReader.peek() == JsonToken.NULL) {
                            jsonReader.nextNull();
                        } else {
                            nextName.hashCode();
                            if (nextName.equals("trackingInfo")) {
                                trackingInfo = this.trackingInfoAdapter.read(jsonReader);
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                    }
                    jsonReader.endObject();
                    return new AutoValue_UiDefinition_Config_Logging_Moment(trackingInfo);
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(trackingInfo(), i);
    }
}
