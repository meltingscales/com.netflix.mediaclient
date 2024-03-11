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
public final class AutoValue_UiDefinition_AudioListAsset extends C$AutoValue_UiDefinition_AudioListAsset {
    public static final Parcelable.Creator<AutoValue_UiDefinition_AudioListAsset> CREATOR = new Parcelable.Creator<AutoValue_UiDefinition_AudioListAsset>() { // from class: com.netflix.model.leafs.originals.interactive.AutoValue_UiDefinition_AudioListAsset.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_UiDefinition_AudioListAsset createFromParcel(Parcel parcel) {
            return new AutoValue_UiDefinition_AudioListAsset(parcel.readInt() == 0 ? parcel.readString() : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_UiDefinition_AudioListAsset[] newArray(int i) {
            return new AutoValue_UiDefinition_AudioListAsset[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_UiDefinition_AudioListAsset(final String str) {
        new C$$AutoValue_UiDefinition_AudioListAsset(str) { // from class: com.netflix.model.leafs.originals.interactive.$AutoValue_UiDefinition_AudioListAsset

            /* renamed from: com.netflix.model.leafs.originals.interactive.$AutoValue_UiDefinition_AudioListAsset$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<UiDefinition.AudioListAsset> {
                private final TypeAdapter<String> assetIdAdapter;
                private String defaultAssetId = null;

                public GsonTypeAdapter setDefaultAssetId(String str) {
                    this.defaultAssetId = str;
                    return this;
                }

                public GsonTypeAdapter(Gson gson) {
                    this.assetIdAdapter = gson.getAdapter(String.class);
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, UiDefinition.AudioListAsset audioListAsset) {
                    if (audioListAsset == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("assetId");
                    this.assetIdAdapter.write(jsonWriter, audioListAsset.assetId());
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.gson.TypeAdapter
                public UiDefinition.AudioListAsset read(JsonReader jsonReader) {
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                        return null;
                    }
                    jsonReader.beginObject();
                    String str = this.defaultAssetId;
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        if (jsonReader.peek() == JsonToken.NULL) {
                            jsonReader.nextNull();
                        } else {
                            nextName.hashCode();
                            if (nextName.equals("assetId")) {
                                str = this.assetIdAdapter.read(jsonReader);
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                    }
                    jsonReader.endObject();
                    return new AutoValue_UiDefinition_AudioListAsset(str);
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (assetId() == null) {
            parcel.writeInt(1);
            return;
        }
        parcel.writeInt(0);
        parcel.writeString(assetId());
    }
}
