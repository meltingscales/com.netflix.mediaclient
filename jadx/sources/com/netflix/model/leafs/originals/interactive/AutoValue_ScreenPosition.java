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
public final class AutoValue_ScreenPosition extends C$AutoValue_ScreenPosition {
    public static final Parcelable.Creator<AutoValue_ScreenPosition> CREATOR = new Parcelable.Creator<AutoValue_ScreenPosition>() { // from class: com.netflix.model.leafs.originals.interactive.AutoValue_ScreenPosition.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_ScreenPosition createFromParcel(Parcel parcel) {
            return new AutoValue_ScreenPosition(Float.valueOf(parcel.readFloat()), Float.valueOf(parcel.readFloat()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_ScreenPosition[] newArray(int i) {
            return new AutoValue_ScreenPosition[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_ScreenPosition(final Float f, final Float f2) {
        new C$$AutoValue_ScreenPosition(f, f2) { // from class: com.netflix.model.leafs.originals.interactive.$AutoValue_ScreenPosition

            /* renamed from: com.netflix.model.leafs.originals.interactive.$AutoValue_ScreenPosition$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<ScreenPosition> {
                private Float defaultX = null;
                private Float defaultY = null;
                private final TypeAdapter<Float> xAdapter;
                private final TypeAdapter<Float> yAdapter;

                public GsonTypeAdapter setDefaultX(Float f) {
                    this.defaultX = f;
                    return this;
                }

                public GsonTypeAdapter setDefaultY(Float f) {
                    this.defaultY = f;
                    return this;
                }

                public GsonTypeAdapter(Gson gson) {
                    this.xAdapter = gson.getAdapter(Float.class);
                    this.yAdapter = gson.getAdapter(Float.class);
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, ScreenPosition screenPosition) {
                    if (screenPosition == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name(InteractiveAnimation.ANIMATION_TYPE.X);
                    this.xAdapter.write(jsonWriter, screenPosition.x());
                    jsonWriter.name(InteractiveAnimation.ANIMATION_TYPE.Y);
                    this.yAdapter.write(jsonWriter, screenPosition.y());
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.gson.TypeAdapter
                public ScreenPosition read(JsonReader jsonReader) {
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                        return null;
                    }
                    jsonReader.beginObject();
                    Float f = this.defaultX;
                    Float f2 = this.defaultY;
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        if (jsonReader.peek() == JsonToken.NULL) {
                            jsonReader.nextNull();
                        } else {
                            nextName.hashCode();
                            if (nextName.equals(InteractiveAnimation.ANIMATION_TYPE.X)) {
                                f = this.xAdapter.read(jsonReader);
                            } else if (nextName.equals(InteractiveAnimation.ANIMATION_TYPE.Y)) {
                                f2 = this.yAdapter.read(jsonReader);
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                    }
                    jsonReader.endObject();
                    return new AutoValue_ScreenPosition(f, f2);
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(x().floatValue());
        parcel.writeFloat(y().floatValue());
    }
}
