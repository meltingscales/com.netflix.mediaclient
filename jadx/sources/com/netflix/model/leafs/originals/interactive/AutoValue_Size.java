package com.netflix.model.leafs.originals.interactive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_Size extends C$AutoValue_Size {
    public static final Parcelable.Creator<AutoValue_Size> CREATOR = new Parcelable.Creator<AutoValue_Size>() { // from class: com.netflix.model.leafs.originals.interactive.AutoValue_Size.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_Size createFromParcel(Parcel parcel) {
            return new AutoValue_Size(Integer.valueOf(parcel.readInt()), Integer.valueOf(parcel.readInt()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_Size[] newArray(int i) {
            return new AutoValue_Size[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_Size(final Integer num, final Integer num2) {
        new C$$AutoValue_Size(num, num2) { // from class: com.netflix.model.leafs.originals.interactive.$AutoValue_Size

            /* renamed from: com.netflix.model.leafs.originals.interactive.$AutoValue_Size$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<Size> {
                private final TypeAdapter<Integer> heightAdapter;
                private final TypeAdapter<Integer> widthAdapter;
                private Integer defaultWidth = null;
                private Integer defaultHeight = null;

                public GsonTypeAdapter setDefaultHeight(Integer num) {
                    this.defaultHeight = num;
                    return this;
                }

                public GsonTypeAdapter setDefaultWidth(Integer num) {
                    this.defaultWidth = num;
                    return this;
                }

                public GsonTypeAdapter(Gson gson) {
                    this.widthAdapter = gson.getAdapter(Integer.class);
                    this.heightAdapter = gson.getAdapter(Integer.class);
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, Size size) {
                    if (size == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name(InteractiveAnimation.ANIMATION_TYPE.WIDTH);
                    this.widthAdapter.write(jsonWriter, size.width());
                    jsonWriter.name(InteractiveAnimation.ANIMATION_TYPE.HEIGHT);
                    this.heightAdapter.write(jsonWriter, size.height());
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.gson.TypeAdapter
                public Size read(JsonReader jsonReader) {
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                        return null;
                    }
                    jsonReader.beginObject();
                    Integer num = this.defaultWidth;
                    Integer num2 = this.defaultHeight;
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        if (jsonReader.peek() == JsonToken.NULL) {
                            jsonReader.nextNull();
                        } else {
                            nextName.hashCode();
                            if (nextName.equals(InteractiveAnimation.ANIMATION_TYPE.HEIGHT)) {
                                num2 = this.heightAdapter.read(jsonReader);
                            } else if (nextName.equals(InteractiveAnimation.ANIMATION_TYPE.WIDTH)) {
                                num = this.widthAdapter.read(jsonReader);
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                    }
                    jsonReader.endObject();
                    return new AutoValue_Size(num, num2);
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(width().intValue());
        parcel.writeInt(height().intValue());
    }
}
