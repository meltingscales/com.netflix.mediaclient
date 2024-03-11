package com.netflix.model.leafs.originals.interactive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.netflix.model.leafs.originals.interactive.CommonMetaData;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_CommonMetaData_Settings extends C$AutoValue_CommonMetaData_Settings {
    public static final Parcelable.Creator<AutoValue_CommonMetaData_Settings> CREATOR = new Parcelable.Creator<AutoValue_CommonMetaData_Settings>() { // from class: com.netflix.model.leafs.originals.interactive.AutoValue_CommonMetaData_Settings.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_CommonMetaData_Settings createFromParcel(Parcel parcel) {
            return new AutoValue_CommonMetaData_Settings(parcel.readInt() == 1, parcel.readInt() == 1);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_CommonMetaData_Settings[] newArray(int i) {
            return new AutoValue_CommonMetaData_Settings[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_CommonMetaData_Settings(final boolean z, final boolean z2) {
        new C$$AutoValue_CommonMetaData_Settings(z, z2) { // from class: com.netflix.model.leafs.originals.interactive.$AutoValue_CommonMetaData_Settings

            /* renamed from: com.netflix.model.leafs.originals.interactive.$AutoValue_CommonMetaData_Settings$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<CommonMetaData.Settings> {
                private final TypeAdapter<Boolean> disableToggleDefaultAdapter;
                private final TypeAdapter<Boolean> randomizeDefaultAdapter;
                private boolean defaultRandomizeDefault = false;
                private boolean defaultDisableToggleDefault = false;

                public GsonTypeAdapter setDefaultDisableToggleDefault(boolean z) {
                    this.defaultDisableToggleDefault = z;
                    return this;
                }

                public GsonTypeAdapter setDefaultRandomizeDefault(boolean z) {
                    this.defaultRandomizeDefault = z;
                    return this;
                }

                public GsonTypeAdapter(Gson gson) {
                    this.randomizeDefaultAdapter = gson.getAdapter(Boolean.class);
                    this.disableToggleDefaultAdapter = gson.getAdapter(Boolean.class);
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, CommonMetaData.Settings settings) {
                    if (settings == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("randomizeDefault");
                    this.randomizeDefaultAdapter.write(jsonWriter, Boolean.valueOf(settings.randomizeDefault()));
                    jsonWriter.name("disableToggleDefault");
                    this.disableToggleDefaultAdapter.write(jsonWriter, Boolean.valueOf(settings.disableToggleDefault()));
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.gson.TypeAdapter
                public CommonMetaData.Settings read(JsonReader jsonReader) {
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                        return null;
                    }
                    jsonReader.beginObject();
                    boolean z = this.defaultRandomizeDefault;
                    boolean z2 = this.defaultDisableToggleDefault;
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        if (jsonReader.peek() == JsonToken.NULL) {
                            jsonReader.nextNull();
                        } else {
                            nextName.hashCode();
                            if (nextName.equals("randomizeDefault")) {
                                z = this.randomizeDefaultAdapter.read(jsonReader).booleanValue();
                            } else if (nextName.equals("disableToggleDefault")) {
                                z2 = this.disableToggleDefaultAdapter.read(jsonReader).booleanValue();
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                    }
                    jsonReader.endObject();
                    return new AutoValue_CommonMetaData_Settings(z, z2);
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(randomizeDefault() ? 1 : 0);
        parcel.writeInt(disableToggleDefault() ? 1 : 0);
    }
}
