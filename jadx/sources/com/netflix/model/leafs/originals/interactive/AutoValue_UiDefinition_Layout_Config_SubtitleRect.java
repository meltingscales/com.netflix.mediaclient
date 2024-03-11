package com.netflix.model.leafs.originals.interactive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.netflix.model.leafs.originals.interactive.UiDefinition;
import com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_UiDefinition_Layout_Config_SubtitleRect extends C$AutoValue_UiDefinition_Layout_Config_SubtitleRect {
    public static final Parcelable.Creator<AutoValue_UiDefinition_Layout_Config_SubtitleRect> CREATOR = new Parcelable.Creator<AutoValue_UiDefinition_Layout_Config_SubtitleRect>() { // from class: com.netflix.model.leafs.originals.interactive.AutoValue_UiDefinition_Layout_Config_SubtitleRect.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_UiDefinition_Layout_Config_SubtitleRect createFromParcel(Parcel parcel) {
            return new AutoValue_UiDefinition_Layout_Config_SubtitleRect(parcel.readInt(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_UiDefinition_Layout_Config_SubtitleRect[] newArray(int i) {
            return new AutoValue_UiDefinition_Layout_Config_SubtitleRect[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_UiDefinition_Layout_Config_SubtitleRect(final int i, final int i2) {
        new C$$AutoValue_UiDefinition_Layout_Config_SubtitleRect(i, i2) { // from class: com.netflix.model.leafs.originals.interactive.$AutoValue_UiDefinition_Layout_Config_SubtitleRect

            /* renamed from: com.netflix.model.leafs.originals.interactive.$AutoValue_UiDefinition_Layout_Config_SubtitleRect$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<UiDefinition.Layout.Config.SubtitleRect> {
                private final TypeAdapter<Integer> heightAdapter;
                private final TypeAdapter<Integer> yAdapter;
                private int defaultY = 0;
                private int defaultHeight = 0;

                public GsonTypeAdapter setDefaultHeight(int i) {
                    this.defaultHeight = i;
                    return this;
                }

                public GsonTypeAdapter setDefaultY(int i) {
                    this.defaultY = i;
                    return this;
                }

                public GsonTypeAdapter(Gson gson) {
                    this.yAdapter = gson.getAdapter(Integer.class);
                    this.heightAdapter = gson.getAdapter(Integer.class);
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, UiDefinition.Layout.Config.SubtitleRect subtitleRect) {
                    if (subtitleRect == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name(InteractiveAnimation.ANIMATION_TYPE.Y);
                    this.yAdapter.write(jsonWriter, Integer.valueOf(subtitleRect.y()));
                    jsonWriter.name(InteractiveAnimation.ANIMATION_TYPE.HEIGHT);
                    this.heightAdapter.write(jsonWriter, Integer.valueOf(subtitleRect.height()));
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.gson.TypeAdapter
                public UiDefinition.Layout.Config.SubtitleRect read(JsonReader jsonReader) {
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                        return null;
                    }
                    jsonReader.beginObject();
                    int i = this.defaultY;
                    int i2 = this.defaultHeight;
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        if (jsonReader.peek() == JsonToken.NULL) {
                            jsonReader.nextNull();
                        } else {
                            nextName.hashCode();
                            if (nextName.equals(InteractiveAnimation.ANIMATION_TYPE.HEIGHT)) {
                                i2 = this.heightAdapter.read(jsonReader).intValue();
                            } else if (nextName.equals(InteractiveAnimation.ANIMATION_TYPE.Y)) {
                                i = this.yAdapter.read(jsonReader).intValue();
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                    }
                    jsonReader.endObject();
                    return new AutoValue_UiDefinition_Layout_Config_SubtitleRect(i, i2);
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(y());
        parcel.writeInt(height());
    }
}
