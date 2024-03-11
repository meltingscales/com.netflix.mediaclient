package com.netflix.model.leafs.originals.interactive.template;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import com.netflix.model.leafs.originals.interactive.template.BackgroundImageElement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_BackgroundImageElement_BackgroundImageElementOverride extends C$AutoValue_BackgroundImageElement_BackgroundImageElementOverride {
    public static final Parcelable.Creator<AutoValue_BackgroundImageElement_BackgroundImageElementOverride> CREATOR = new Parcelable.Creator<AutoValue_BackgroundImageElement_BackgroundImageElementOverride>() { // from class: com.netflix.model.leafs.originals.interactive.template.AutoValue_BackgroundImageElement_BackgroundImageElementOverride.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_BackgroundImageElement_BackgroundImageElementOverride createFromParcel(Parcel parcel) {
            return new AutoValue_BackgroundImageElement_BackgroundImageElementOverride(parcel.readInt() == 0 ? parcel.readString() : null, (BackgroundImageElement) parcel.readParcelable(BackgroundImageElement.BackgroundImageElementOverride.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_BackgroundImageElement_BackgroundImageElementOverride[] newArray(int i) {
            return new AutoValue_BackgroundImageElement_BackgroundImageElementOverride[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_BackgroundImageElement_BackgroundImageElementOverride(String str, BackgroundImageElement backgroundImageElement) {
        new C$$AutoValue_BackgroundImageElement_BackgroundImageElementOverride(str, backgroundImageElement) { // from class: com.netflix.model.leafs.originals.interactive.template.$AutoValue_BackgroundImageElement_BackgroundImageElementOverride

            /* renamed from: com.netflix.model.leafs.originals.interactive.template.$AutoValue_BackgroundImageElement_BackgroundImageElementOverride$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<BackgroundImageElement.BackgroundImageElementOverride> {
                private final TypeAdapter<BackgroundImageElement> dataAdapter;
                private final TypeAdapter<String> preconditionIdAdapter;
                private String defaultPreconditionId = null;
                private BackgroundImageElement defaultData = null;

                public GsonTypeAdapter setDefaultData(BackgroundImageElement backgroundImageElement) {
                    this.defaultData = backgroundImageElement;
                    return this;
                }

                public GsonTypeAdapter setDefaultPreconditionId(String str) {
                    this.defaultPreconditionId = str;
                    return this;
                }

                public GsonTypeAdapter(Gson gson) {
                    this.preconditionIdAdapter = gson.getAdapter(String.class);
                    this.dataAdapter = gson.getAdapter(BackgroundImageElement.class);
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, BackgroundImageElement.BackgroundImageElementOverride backgroundImageElementOverride) {
                    if (backgroundImageElementOverride == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("preconditionId");
                    this.preconditionIdAdapter.write(jsonWriter, backgroundImageElementOverride.preconditionId());
                    jsonWriter.name(NotificationFactory.DATA);
                    this.dataAdapter.write(jsonWriter, backgroundImageElementOverride.data());
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.gson.TypeAdapter
                public BackgroundImageElement.BackgroundImageElementOverride read(JsonReader jsonReader) {
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                        return null;
                    }
                    jsonReader.beginObject();
                    String str = this.defaultPreconditionId;
                    BackgroundImageElement backgroundImageElement = this.defaultData;
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        if (jsonReader.peek() == JsonToken.NULL) {
                            jsonReader.nextNull();
                        } else {
                            nextName.hashCode();
                            if (nextName.equals(NotificationFactory.DATA)) {
                                backgroundImageElement = this.dataAdapter.read(jsonReader);
                            } else if (nextName.equals("preconditionId")) {
                                str = this.preconditionIdAdapter.read(jsonReader);
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                    }
                    jsonReader.endObject();
                    return new AutoValue_BackgroundImageElement_BackgroundImageElementOverride(str, backgroundImageElement);
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
