package com.netflix.model.leafs.originals.interactive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.netflix.model.leafs.originals.interactive.PlayerControls;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_PlayerControls_ChoicePointsMetadata_Cell_Focus extends C$AutoValue_PlayerControls_ChoicePointsMetadata_Cell_Focus {
    public static final Parcelable.Creator<AutoValue_PlayerControls_ChoicePointsMetadata_Cell_Focus> CREATOR = new Parcelable.Creator<AutoValue_PlayerControls_ChoicePointsMetadata_Cell_Focus>() { // from class: com.netflix.model.leafs.originals.interactive.AutoValue_PlayerControls_ChoicePointsMetadata_Cell_Focus.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_PlayerControls_ChoicePointsMetadata_Cell_Focus createFromParcel(Parcel parcel) {
            return new AutoValue_PlayerControls_ChoicePointsMetadata_Cell_Focus((SourceRect) parcel.readParcelable(PlayerControls.ChoicePointsMetadata.Cell.Focus.class.getClassLoader()), (ImageAssetId) parcel.readParcelable(PlayerControls.ChoicePointsMetadata.Cell.Focus.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_PlayerControls_ChoicePointsMetadata_Cell_Focus[] newArray(int i) {
            return new AutoValue_PlayerControls_ChoicePointsMetadata_Cell_Focus[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_PlayerControls_ChoicePointsMetadata_Cell_Focus(SourceRect sourceRect, ImageAssetId imageAssetId) {
        new C$$AutoValue_PlayerControls_ChoicePointsMetadata_Cell_Focus(sourceRect, imageAssetId) { // from class: com.netflix.model.leafs.originals.interactive.$AutoValue_PlayerControls_ChoicePointsMetadata_Cell_Focus

            /* renamed from: com.netflix.model.leafs.originals.interactive.$AutoValue_PlayerControls_ChoicePointsMetadata_Cell_Focus$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<PlayerControls.ChoicePointsMetadata.Cell.Focus> {
                private final TypeAdapter<ImageAssetId> imageAdapter;
                private final TypeAdapter<SourceRect> rectAdapter;
                private SourceRect defaultRect = null;
                private ImageAssetId defaultImage = null;

                public GsonTypeAdapter setDefaultImage(ImageAssetId imageAssetId) {
                    this.defaultImage = imageAssetId;
                    return this;
                }

                public GsonTypeAdapter setDefaultRect(SourceRect sourceRect) {
                    this.defaultRect = sourceRect;
                    return this;
                }

                public GsonTypeAdapter(Gson gson) {
                    this.rectAdapter = gson.getAdapter(SourceRect.class);
                    this.imageAdapter = gson.getAdapter(ImageAssetId.class);
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, PlayerControls.ChoicePointsMetadata.Cell.Focus focus) {
                    if (focus == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("rect");
                    this.rectAdapter.write(jsonWriter, focus.rect());
                    jsonWriter.name("image");
                    this.imageAdapter.write(jsonWriter, focus.image());
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.gson.TypeAdapter
                public PlayerControls.ChoicePointsMetadata.Cell.Focus read(JsonReader jsonReader) {
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                        return null;
                    }
                    jsonReader.beginObject();
                    SourceRect sourceRect = this.defaultRect;
                    ImageAssetId imageAssetId = this.defaultImage;
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        if (jsonReader.peek() == JsonToken.NULL) {
                            jsonReader.nextNull();
                        } else {
                            nextName.hashCode();
                            if (nextName.equals("rect")) {
                                sourceRect = this.rectAdapter.read(jsonReader);
                            } else if (nextName.equals("image")) {
                                imageAssetId = this.imageAdapter.read(jsonReader);
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                    }
                    jsonReader.endObject();
                    return new AutoValue_PlayerControls_ChoicePointsMetadata_Cell_Focus(sourceRect, imageAssetId);
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(rect(), i);
        parcel.writeParcelable(image(), i);
    }
}
