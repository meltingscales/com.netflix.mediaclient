package com.netflix.model.leafs.originals.interactive.template;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import com.netflix.model.leafs.originals.interactive.template.LabelElement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_LabelElement_LabelElementOverride extends C$AutoValue_LabelElement_LabelElementOverride {
    public static final Parcelable.Creator<AutoValue_LabelElement_LabelElementOverride> CREATOR = new Parcelable.Creator<AutoValue_LabelElement_LabelElementOverride>() { // from class: com.netflix.model.leafs.originals.interactive.template.AutoValue_LabelElement_LabelElementOverride.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_LabelElement_LabelElementOverride createFromParcel(Parcel parcel) {
            return new AutoValue_LabelElement_LabelElementOverride(parcel.readInt() == 0 ? parcel.readString() : null, (LabelElement) parcel.readParcelable(LabelElement.LabelElementOverride.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_LabelElement_LabelElementOverride[] newArray(int i) {
            return new AutoValue_LabelElement_LabelElementOverride[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_LabelElement_LabelElementOverride(String str, LabelElement labelElement) {
        new C$$AutoValue_LabelElement_LabelElementOverride(str, labelElement) { // from class: com.netflix.model.leafs.originals.interactive.template.$AutoValue_LabelElement_LabelElementOverride

            /* renamed from: com.netflix.model.leafs.originals.interactive.template.$AutoValue_LabelElement_LabelElementOverride$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<LabelElement.LabelElementOverride> {
                private final TypeAdapter<LabelElement> dataAdapter;
                private final TypeAdapter<String> preconditionIdAdapter;
                private String defaultPreconditionId = null;
                private LabelElement defaultData = null;

                public GsonTypeAdapter setDefaultData(LabelElement labelElement) {
                    this.defaultData = labelElement;
                    return this;
                }

                public GsonTypeAdapter setDefaultPreconditionId(String str) {
                    this.defaultPreconditionId = str;
                    return this;
                }

                public GsonTypeAdapter(Gson gson) {
                    this.preconditionIdAdapter = gson.getAdapter(String.class);
                    this.dataAdapter = gson.getAdapter(LabelElement.class);
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, LabelElement.LabelElementOverride labelElementOverride) {
                    if (labelElementOverride == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("preconditionId");
                    this.preconditionIdAdapter.write(jsonWriter, labelElementOverride.preconditionId());
                    jsonWriter.name(NotificationFactory.DATA);
                    this.dataAdapter.write(jsonWriter, labelElementOverride.data());
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.gson.TypeAdapter
                public LabelElement.LabelElementOverride read(JsonReader jsonReader) {
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                        return null;
                    }
                    jsonReader.beginObject();
                    String str = this.defaultPreconditionId;
                    LabelElement labelElement = this.defaultData;
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        if (jsonReader.peek() == JsonToken.NULL) {
                            jsonReader.nextNull();
                        } else {
                            nextName.hashCode();
                            if (nextName.equals(NotificationFactory.DATA)) {
                                labelElement = this.dataAdapter.read(jsonReader);
                            } else if (nextName.equals("preconditionId")) {
                                str = this.preconditionIdAdapter.read(jsonReader);
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                    }
                    jsonReader.endObject();
                    return new AutoValue_LabelElement_LabelElementOverride(str, labelElement);
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (preconditionId() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(preconditionId());
        }
        parcel.writeParcelable(data(), i);
    }
}
