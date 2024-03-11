package com.netflix.model.leafs.originals.interactive.animations;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_AnimationTemplateId extends C$AutoValue_AnimationTemplateId {
    public static final Parcelable.Creator<AutoValue_AnimationTemplateId> CREATOR = new Parcelable.Creator<AutoValue_AnimationTemplateId>() { // from class: com.netflix.model.leafs.originals.interactive.animations.AutoValue_AnimationTemplateId.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_AnimationTemplateId createFromParcel(Parcel parcel) {
            return new AutoValue_AnimationTemplateId(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_AnimationTemplateId[] newArray(int i) {
            return new AutoValue_AnimationTemplateId[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_AnimationTemplateId(final String str) {
        new C$$AutoValue_AnimationTemplateId(str) { // from class: com.netflix.model.leafs.originals.interactive.animations.$AutoValue_AnimationTemplateId

            /* renamed from: com.netflix.model.leafs.originals.interactive.animations.$AutoValue_AnimationTemplateId$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<AnimationTemplateId> {
                private final TypeAdapter<String> animationTemplateIdAdapter;
                private String defaultAnimationTemplateId = null;

                public GsonTypeAdapter setDefaultAnimationTemplateId(String str) {
                    this.defaultAnimationTemplateId = str;
                    return this;
                }

                public GsonTypeAdapter(Gson gson) {
                    this.animationTemplateIdAdapter = gson.getAdapter(String.class);
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, AnimationTemplateId animationTemplateId) {
                    if (animationTemplateId == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("animationTemplateId");
                    this.animationTemplateIdAdapter.write(jsonWriter, animationTemplateId.animationTemplateId());
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.gson.TypeAdapter
                public AnimationTemplateId read(JsonReader jsonReader) {
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                        return null;
                    }
                    jsonReader.beginObject();
                    String str = this.defaultAnimationTemplateId;
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        if (jsonReader.peek() == JsonToken.NULL) {
                            jsonReader.nextNull();
                        } else {
                            nextName.hashCode();
                            if (nextName.equals("animationTemplateId")) {
                                str = this.animationTemplateIdAdapter.read(jsonReader);
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                    }
                    jsonReader.endObject();
                    return new AutoValue_AnimationTemplateId(str);
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(animationTemplateId());
    }
}
