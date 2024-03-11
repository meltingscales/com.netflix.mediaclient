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
public final class AutoValue_Color extends C$AutoValue_Color {
    public static final Parcelable.Creator<AutoValue_Color> CREATOR = new Parcelable.Creator<AutoValue_Color>() { // from class: com.netflix.model.leafs.originals.interactive.AutoValue_Color.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_Color createFromParcel(Parcel parcel) {
            return new AutoValue_Color(parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? Double.valueOf(parcel.readDouble()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_Color[] newArray(int i) {
            return new AutoValue_Color[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_Color(final String str, final Double d) {
        new C$$AutoValue_Color(str, d) { // from class: com.netflix.model.leafs.originals.interactive.$AutoValue_Color

            /* renamed from: com.netflix.model.leafs.originals.interactive.$AutoValue_Color$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<Color> {
                private final TypeAdapter<String> colorWithRGBAdapter;
                private String defaultColorWithRGB = null;
                private Double defaultWithAlpha = null;
                private final TypeAdapter<Double> withAlphaAdapter;

                public GsonTypeAdapter setDefaultColorWithRGB(String str) {
                    this.defaultColorWithRGB = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultWithAlpha(Double d) {
                    this.defaultWithAlpha = d;
                    return this;
                }

                public GsonTypeAdapter(Gson gson) {
                    this.colorWithRGBAdapter = gson.getAdapter(String.class);
                    this.withAlphaAdapter = gson.getAdapter(Double.class);
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, Color color) {
                    if (color == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("colorWithRGB");
                    this.colorWithRGBAdapter.write(jsonWriter, color.colorWithRGB());
                    jsonWriter.name("withAlpha");
                    this.withAlphaAdapter.write(jsonWriter, color.withAlpha());
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.gson.TypeAdapter
                public Color read(JsonReader jsonReader) {
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                        return null;
                    }
                    jsonReader.beginObject();
                    String str = this.defaultColorWithRGB;
                    Double d = this.defaultWithAlpha;
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        if (jsonReader.peek() == JsonToken.NULL) {
                            jsonReader.nextNull();
                        } else {
                            nextName.hashCode();
                            if (nextName.equals("colorWithRGB")) {
                                str = this.colorWithRGBAdapter.read(jsonReader);
                            } else if (nextName.equals("withAlpha")) {
                                d = this.withAlphaAdapter.read(jsonReader);
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                    }
                    jsonReader.endObject();
                    return new AutoValue_Color(str, d);
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (colorWithRGB() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(colorWithRGB());
        }
        if (withAlpha() == null) {
            parcel.writeInt(1);
            return;
        }
        parcel.writeInt(0);
        parcel.writeDouble(withAlpha().doubleValue());
    }
}
