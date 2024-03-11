package com.netflix.model.leafs.originals.interactive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.netflix.model.leafs.originals.interactive.CommonMetaData;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_CommonMetaData extends C$AutoValue_CommonMetaData {
    public static final Parcelable.Creator<AutoValue_CommonMetaData> CREATOR = new Parcelable.Creator<AutoValue_CommonMetaData>() { // from class: com.netflix.model.leafs.originals.interactive.AutoValue_CommonMetaData.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_CommonMetaData createFromParcel(Parcel parcel) {
            return new AutoValue_CommonMetaData(parcel.readHashMap(CommonMetaData.class.getClassLoader()), (CommonMetaData.Settings) parcel.readParcelable(CommonMetaData.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_CommonMetaData[] newArray(int i) {
            return new AutoValue_CommonMetaData[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_CommonMetaData(Map<String, CommonMetaData.Layout> map, CommonMetaData.Settings settings) {
        new C$$AutoValue_CommonMetaData(map, settings) { // from class: com.netflix.model.leafs.originals.interactive.$AutoValue_CommonMetaData

            /* renamed from: com.netflix.model.leafs.originals.interactive.$AutoValue_CommonMetaData$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<CommonMetaData> {
                private Map<String, CommonMetaData.Layout> defaultLayouts = null;
                private CommonMetaData.Settings defaultSettings = null;
                private final TypeAdapter<Map<String, CommonMetaData.Layout>> layoutsAdapter;
                private final TypeAdapter<CommonMetaData.Settings> settingsAdapter;

                public GsonTypeAdapter setDefaultLayouts(Map<String, CommonMetaData.Layout> map) {
                    this.defaultLayouts = map;
                    return this;
                }

                public GsonTypeAdapter setDefaultSettings(CommonMetaData.Settings settings) {
                    this.defaultSettings = settings;
                    return this;
                }

                public GsonTypeAdapter(Gson gson) {
                    this.layoutsAdapter = gson.getAdapter(TypeToken.getParameterized(Map.class, String.class, CommonMetaData.Layout.class));
                    this.settingsAdapter = gson.getAdapter(CommonMetaData.Settings.class);
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, CommonMetaData commonMetaData) {
                    if (commonMetaData == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("layouts");
                    this.layoutsAdapter.write(jsonWriter, commonMetaData.layouts());
                    jsonWriter.name("settings");
                    this.settingsAdapter.write(jsonWriter, commonMetaData.settings());
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.gson.TypeAdapter
                public CommonMetaData read(JsonReader jsonReader) {
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                        return null;
                    }
                    jsonReader.beginObject();
                    Map<String, CommonMetaData.Layout> map = this.defaultLayouts;
                    CommonMetaData.Settings settings = this.defaultSettings;
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        if (jsonReader.peek() == JsonToken.NULL) {
                            jsonReader.nextNull();
                        } else {
                            nextName.hashCode();
                            if (nextName.equals("layouts")) {
                                map = this.layoutsAdapter.read(jsonReader);
                            } else if (nextName.equals("settings")) {
                                settings = this.settingsAdapter.read(jsonReader);
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                    }
                    jsonReader.endObject();
                    return new AutoValue_CommonMetaData(map, settings);
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeMap(layouts());
        parcel.writeParcelable(settings(), i);
    }
}
