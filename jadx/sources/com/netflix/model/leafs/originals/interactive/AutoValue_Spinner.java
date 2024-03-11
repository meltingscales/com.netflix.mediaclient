package com.netflix.model.leafs.originals.interactive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.netflix.model.leafs.originals.interactive.Spinner;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_Spinner extends C$AutoValue_Spinner {
    public static final Parcelable.Creator<AutoValue_Spinner> CREATOR = new Parcelable.Creator<AutoValue_Spinner>() { // from class: com.netflix.model.leafs.originals.interactive.AutoValue_Spinner.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_Spinner createFromParcel(Parcel parcel) {
            return new AutoValue_Spinner((Spinner.Definition) parcel.readParcelable(Spinner.class.getClassLoader()), (Size) parcel.readParcelable(Spinner.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_Spinner[] newArray(int i) {
            return new AutoValue_Spinner[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_Spinner(Spinner.Definition definition, Size size) {
        new C$$AutoValue_Spinner(definition, size) { // from class: com.netflix.model.leafs.originals.interactive.$AutoValue_Spinner

            /* renamed from: com.netflix.model.leafs.originals.interactive.$AutoValue_Spinner$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<Spinner> {
                private Spinner.Definition defaultPngJson = null;
                private Size defaultSize = null;
                private final TypeAdapter<Spinner.Definition> pngJsonAdapter;
                private final TypeAdapter<Size> sizeAdapter;

                public GsonTypeAdapter setDefaultPngJson(Spinner.Definition definition) {
                    this.defaultPngJson = definition;
                    return this;
                }

                public GsonTypeAdapter setDefaultSize(Size size) {
                    this.defaultSize = size;
                    return this;
                }

                public GsonTypeAdapter(Gson gson) {
                    this.pngJsonAdapter = gson.getAdapter(Spinner.Definition.class);
                    this.sizeAdapter = gson.getAdapter(Size.class);
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, Spinner spinner) {
                    if (spinner == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("pngJson");
                    this.pngJsonAdapter.write(jsonWriter, spinner.pngJson());
                    jsonWriter.name("size");
                    this.sizeAdapter.write(jsonWriter, spinner.size());
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.gson.TypeAdapter
                public Spinner read(JsonReader jsonReader) {
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                        return null;
                    }
                    jsonReader.beginObject();
                    Spinner.Definition definition = this.defaultPngJson;
                    Size size = this.defaultSize;
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        if (jsonReader.peek() == JsonToken.NULL) {
                            jsonReader.nextNull();
                        } else {
                            nextName.hashCode();
                            if (nextName.equals("pngJson")) {
                                definition = this.pngJsonAdapter.read(jsonReader);
                            } else if (nextName.equals("size")) {
                                size = this.sizeAdapter.read(jsonReader);
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                    }
                    jsonReader.endObject();
                    return new AutoValue_Spinner(definition, size);
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(pngJson(), i);
        parcel.writeParcelable(size(), i);
    }
}
