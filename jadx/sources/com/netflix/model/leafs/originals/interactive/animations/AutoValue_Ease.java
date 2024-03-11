package com.netflix.model.leafs.originals.interactive.animations;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_Ease extends C$AutoValue_Ease {
    public static final Parcelable.Creator<AutoValue_Ease> CREATOR = new Parcelable.Creator<AutoValue_Ease>() { // from class: com.netflix.model.leafs.originals.interactive.animations.AutoValue_Ease.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_Ease createFromParcel(Parcel parcel) {
            return new AutoValue_Ease(parcel.readString(), parcel.readHashMap(Ease.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_Ease[] newArray(int i) {
            return new AutoValue_Ease[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_Ease(String str, Map<String, Float> map) {
        new C$$AutoValue_Ease(str, map) { // from class: com.netflix.model.leafs.originals.interactive.animations.$AutoValue_Ease

            /* renamed from: com.netflix.model.leafs.originals.interactive.animations.$AutoValue_Ease$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<Ease> {
                private final TypeAdapter<Map<String, Float>> flagsAdapter;
                private final TypeAdapter<String> typeAdapter;
                private String defaultType = null;
                private Map<String, Float> defaultFlags = null;

                public GsonTypeAdapter setDefaultFlags(Map<String, Float> map) {
                    this.defaultFlags = map;
                    return this;
                }

                public GsonTypeAdapter setDefaultType(String str) {
                    this.defaultType = str;
                    return this;
                }

                public GsonTypeAdapter(Gson gson) {
                    this.typeAdapter = gson.getAdapter(String.class);
                    this.flagsAdapter = gson.getAdapter(TypeToken.getParameterized(Map.class, String.class, Float.class));
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, Ease ease) {
                    if (ease == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("type");
                    this.typeAdapter.write(jsonWriter, ease.type());
                    jsonWriter.name("flags");
                    this.flagsAdapter.write(jsonWriter, ease.flags());
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.gson.TypeAdapter
                public Ease read(JsonReader jsonReader) {
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                        return null;
                    }
                    jsonReader.beginObject();
                    String str = this.defaultType;
                    Map<String, Float> map = this.defaultFlags;
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        if (jsonReader.peek() == JsonToken.NULL) {
                            jsonReader.nextNull();
                        } else {
                            nextName.hashCode();
                            if (nextName.equals("type")) {
                                str = this.typeAdapter.read(jsonReader);
                            } else if (nextName.equals("flags")) {
                                map = this.flagsAdapter.read(jsonReader);
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                    }
                    jsonReader.endObject();
                    return new AutoValue_Ease(str, map);
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(type());
        parcel.writeMap(flags());
    }
}
