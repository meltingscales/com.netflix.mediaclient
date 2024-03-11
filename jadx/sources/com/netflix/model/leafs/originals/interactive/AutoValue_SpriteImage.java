package com.netflix.model.leafs.originals.interactive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_SpriteImage extends C$AutoValue_SpriteImage {
    public static final Parcelable.Creator<AutoValue_SpriteImage> CREATOR = new Parcelable.Creator<AutoValue_SpriteImage>() { // from class: com.netflix.model.leafs.originals.interactive.AutoValue_SpriteImage.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_SpriteImage createFromParcel(Parcel parcel) {
            return new AutoValue_SpriteImage((ImageAssetId) parcel.readParcelable(SpriteImage.class.getClassLoader()), (SourceRect) parcel.readParcelable(SpriteImage.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_SpriteImage[] newArray(int i) {
            return new AutoValue_SpriteImage[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_SpriteImage(ImageAssetId imageAssetId, SourceRect sourceRect) {
        new C$$AutoValue_SpriteImage(imageAssetId, sourceRect) { // from class: com.netflix.model.leafs.originals.interactive.$AutoValue_SpriteImage

            /* renamed from: com.netflix.model.leafs.originals.interactive.$AutoValue_SpriteImage$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<SpriteImage> {
                private ImageAssetId defaultImage = null;
                private SourceRect defaultRect = null;
                private final TypeAdapter<ImageAssetId> imageAdapter;
                private final TypeAdapter<SourceRect> rectAdapter;

                public GsonTypeAdapter setDefaultImage(ImageAssetId imageAssetId) {
                    this.defaultImage = imageAssetId;
                    return this;
                }

                public GsonTypeAdapter setDefaultRect(SourceRect sourceRect) {
                    this.defaultRect = sourceRect;
                    return this;
                }

                public GsonTypeAdapter(Gson gson) {
                    this.imageAdapter = gson.getAdapter(ImageAssetId.class);
                    this.rectAdapter = gson.getAdapter(SourceRect.class);
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, SpriteImage spriteImage) {
                    if (spriteImage == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("image");
                    this.imageAdapter.write(jsonWriter, spriteImage.image());
                    jsonWriter.name("rect");
                    this.rectAdapter.write(jsonWriter, spriteImage.rect());
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.gson.TypeAdapter
                public SpriteImage read(JsonReader jsonReader) {
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                        return null;
                    }
                    jsonReader.beginObject();
                    ImageAssetId imageAssetId = this.defaultImage;
                    SourceRect sourceRect = this.defaultRect;
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
                    return new AutoValue_SpriteImage(imageAssetId, sourceRect);
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(image(), i);
        parcel.writeParcelable(rect(), i);
    }
}
