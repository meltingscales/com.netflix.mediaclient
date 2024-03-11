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
public final class AutoValue_UiDefinition_Config_Logging extends C$AutoValue_UiDefinition_Config_Logging {
    public static final Parcelable.Creator<AutoValue_UiDefinition_Config_Logging> CREATOR = new Parcelable.Creator<AutoValue_UiDefinition_Config_Logging>() { // from class: com.netflix.model.leafs.originals.interactive.AutoValue_UiDefinition_Config_Logging.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_UiDefinition_Config_Logging createFromParcel(Parcel parcel) {
            return new AutoValue_UiDefinition_Config_Logging((UiDefinition.Config.Logging.Moment) parcel.readParcelable(UiDefinition.Config.Logging.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_UiDefinition_Config_Logging[] newArray(int i) {
            return new AutoValue_UiDefinition_Config_Logging[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_UiDefinition_Config_Logging(UiDefinition.Config.Logging.Moment moment) {
        new C$$AutoValue_UiDefinition_Config_Logging(moment) { // from class: com.netflix.model.leafs.originals.interactive.$AutoValue_UiDefinition_Config_Logging

            /* renamed from: com.netflix.model.leafs.originals.interactive.$AutoValue_UiDefinition_Config_Logging$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<UiDefinition.Config.Logging> {
                private UiDefinition.Config.Logging.Moment defaultMoment = null;
                private final TypeAdapter<UiDefinition.Config.Logging.Moment> momentAdapter;

                public GsonTypeAdapter setDefaultMoment(UiDefinition.Config.Logging.Moment moment) {
                    this.defaultMoment = moment;
                    return this;
                }

                public GsonTypeAdapter(Gson gson) {
                    this.momentAdapter = gson.getAdapter(UiDefinition.Config.Logging.Moment.class);
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, UiDefinition.Config.Logging logging) {
                    if (logging == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("moment");
                    this.momentAdapter.write(jsonWriter, logging.moment());
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.gson.TypeAdapter
                public UiDefinition.Config.Logging read(JsonReader jsonReader) {
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                        return null;
                    }
                    jsonReader.beginObject();
                    UiDefinition.Config.Logging.Moment moment = this.defaultMoment;
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        if (jsonReader.peek() == JsonToken.NULL) {
                            jsonReader.nextNull();
                        } else {
                            nextName.hashCode();
                            if (nextName.equals("moment")) {
                                moment = this.momentAdapter.read(jsonReader);
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                    }
                    jsonReader.endObject();
                    return new AutoValue_UiDefinition_Config_Logging(moment);
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(moment(), i);
    }
}
