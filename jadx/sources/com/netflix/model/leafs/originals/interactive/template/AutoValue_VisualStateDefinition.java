package com.netflix.model.leafs.originals.interactive.template;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.netflix.model.leafs.originals.interactive.ImageAssetId;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_VisualStateDefinition extends C$AutoValue_VisualStateDefinition {
    public static final Parcelable.Creator<AutoValue_VisualStateDefinition> CREATOR = new Parcelable.Creator<AutoValue_VisualStateDefinition>() { // from class: com.netflix.model.leafs.originals.interactive.template.AutoValue_VisualStateDefinition.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_VisualStateDefinition createFromParcel(Parcel parcel) {
            return new AutoValue_VisualStateDefinition(parcel.readInt() == 0 ? parcel.readString() : null, (ImageAssetId) parcel.readParcelable(VisualStateDefinition.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_VisualStateDefinition[] newArray(int i) {
            return new AutoValue_VisualStateDefinition[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_VisualStateDefinition(String str, ImageAssetId imageAssetId) {
        new C$$AutoValue_VisualStateDefinition(str, imageAssetId) { // from class: com.netflix.model.leafs.originals.interactive.template.$AutoValue_VisualStateDefinition

            /* renamed from: com.netflix.model.leafs.originals.interactive.template.$AutoValue_VisualStateDefinition$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<VisualStateDefinition> {
                private final TypeAdapter<ImageAssetId> imageAdapter;
                private final TypeAdapter<String> styleIdAdapter;
                private String defaultStyleId = null;
                private ImageAssetId defaultImage = null;

                public GsonTypeAdapter setDefaultImage(ImageAssetId imageAssetId) {
                    this.defaultImage = imageAssetId;
                    return this;
                }

                public GsonTypeAdapter setDefaultStyleId(String str) {
                    this.defaultStyleId = str;
                    return this;
                }

                public GsonTypeAdapter(Gson gson) {
                    this.styleIdAdapter = gson.getAdapter(String.class);
                    this.imageAdapter = gson.getAdapter(ImageAssetId.class);
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, VisualStateDefinition visualStateDefinition) {
                    if (visualStateDefinition == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("styleId");
                    this.styleIdAdapter.write(jsonWriter, visualStateDefinition.styleId());
                    jsonWriter.name("image");
                    this.imageAdapter.write(jsonWriter, visualStateDefinition.image());
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.gson.TypeAdapter
                public VisualStateDefinition read(JsonReader jsonReader) {
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                        return null;
                    }
                    jsonReader.beginObject();
                    String str = this.defaultStyleId;
                    ImageAssetId imageAssetId = this.defaultImage;
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        if (jsonReader.peek() == JsonToken.NULL) {
                            jsonReader.nextNull();
                        } else {
                            nextName.hashCode();
                            if (nextName.equals("styleId")) {
                                str = this.styleIdAdapter.read(jsonReader);
                            } else if (nextName.equals("image")) {
                                imageAssetId = this.imageAdapter.read(jsonReader);
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                    }
                    jsonReader.endObject();
                    return new AutoValue_VisualStateDefinition(str, imageAssetId);
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (styleId() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(styleId());
        }
        parcel.writeParcelable(image(), i);
    }
}
