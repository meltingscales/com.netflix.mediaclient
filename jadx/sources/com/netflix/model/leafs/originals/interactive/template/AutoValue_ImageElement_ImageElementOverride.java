package com.netflix.model.leafs.originals.interactive.template;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import com.netflix.model.leafs.originals.interactive.template.ImageElement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_ImageElement_ImageElementOverride extends C$AutoValue_ImageElement_ImageElementOverride {
    public static final Parcelable.Creator<AutoValue_ImageElement_ImageElementOverride> CREATOR = new Parcelable.Creator<AutoValue_ImageElement_ImageElementOverride>() { // from class: com.netflix.model.leafs.originals.interactive.template.AutoValue_ImageElement_ImageElementOverride.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_ImageElement_ImageElementOverride createFromParcel(Parcel parcel) {
            return new AutoValue_ImageElement_ImageElementOverride(parcel.readInt() == 0 ? parcel.readString() : null, (ImageElement) parcel.readParcelable(ImageElement.ImageElementOverride.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_ImageElement_ImageElementOverride[] newArray(int i) {
            return new AutoValue_ImageElement_ImageElementOverride[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_ImageElement_ImageElementOverride(String str, ImageElement imageElement) {
        new C$$AutoValue_ImageElement_ImageElementOverride(str, imageElement) { // from class: com.netflix.model.leafs.originals.interactive.template.$AutoValue_ImageElement_ImageElementOverride

            /* renamed from: com.netflix.model.leafs.originals.interactive.template.$AutoValue_ImageElement_ImageElementOverride$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<ImageElement.ImageElementOverride> {
                private final TypeAdapter<ImageElement> dataAdapter;
                private final TypeAdapter<String> preconditionIdAdapter;
                private String defaultPreconditionId = null;
                private ImageElement defaultData = null;

                public GsonTypeAdapter setDefaultData(ImageElement imageElement) {
                    this.defaultData = imageElement;
                    return this;
                }

                public GsonTypeAdapter setDefaultPreconditionId(String str) {
                    this.defaultPreconditionId = str;
                    return this;
                }

                public GsonTypeAdapter(Gson gson) {
                    this.preconditionIdAdapter = gson.getAdapter(String.class);
                    this.dataAdapter = gson.getAdapter(ImageElement.class);
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, ImageElement.ImageElementOverride imageElementOverride) {
                    if (imageElementOverride == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("preconditionId");
                    this.preconditionIdAdapter.write(jsonWriter, imageElementOverride.preconditionId());
                    jsonWriter.name(NotificationFactory.DATA);
                    this.dataAdapter.write(jsonWriter, imageElementOverride.data());
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.gson.TypeAdapter
                public ImageElement.ImageElementOverride read(JsonReader jsonReader) {
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                        return null;
                    }
                    jsonReader.beginObject();
                    String str = this.defaultPreconditionId;
                    ImageElement imageElement = this.defaultData;
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        if (jsonReader.peek() == JsonToken.NULL) {
                            jsonReader.nextNull();
                        } else {
                            nextName.hashCode();
                            if (nextName.equals(NotificationFactory.DATA)) {
                                imageElement = this.dataAdapter.read(jsonReader);
                            } else if (nextName.equals("preconditionId")) {
                                str = this.preconditionIdAdapter.read(jsonReader);
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                    }
                    jsonReader.endObject();
                    return new AutoValue_ImageElement_ImageElementOverride(str, imageElement);
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
