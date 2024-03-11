package com.netflix.model.leafs.originals.interactive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.netflix.model.leafs.originals.interactive.PlayerControls;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_PlayerControls_ChoicePointsMetadata_Container_ContainerData extends C$AutoValue_PlayerControls_ChoicePointsMetadata_Container_ContainerData {
    public static final Parcelable.Creator<AutoValue_PlayerControls_ChoicePointsMetadata_Container_ContainerData> CREATOR = new Parcelable.Creator<AutoValue_PlayerControls_ChoicePointsMetadata_Container_ContainerData>() { // from class: com.netflix.model.leafs.originals.interactive.AutoValue_PlayerControls_ChoicePointsMetadata_Container_ContainerData.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_PlayerControls_ChoicePointsMetadata_Container_ContainerData createFromParcel(Parcel parcel) {
            return new AutoValue_PlayerControls_ChoicePointsMetadata_Container_ContainerData(parcel.readDouble(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_PlayerControls_ChoicePointsMetadata_Container_ContainerData[] newArray(int i) {
            return new AutoValue_PlayerControls_ChoicePointsMetadata_Container_ContainerData[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_PlayerControls_ChoicePointsMetadata_Container_ContainerData(final double d, final int i) {
        new C$$AutoValue_PlayerControls_ChoicePointsMetadata_Container_ContainerData(d, i) { // from class: com.netflix.model.leafs.originals.interactive.$AutoValue_PlayerControls_ChoicePointsMetadata_Container_ContainerData

            /* renamed from: com.netflix.model.leafs.originals.interactive.$AutoValue_PlayerControls_ChoicePointsMetadata_Container_ContainerData$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<PlayerControls.ChoicePointsMetadata.Container.ContainerData> {
                private final TypeAdapter<Integer> itemSpacingAdapter;
                private final TypeAdapter<Double> renderHeightAdapter;
                private double defaultRenderHeight = 0.0d;
                private int defaultItemSpacing = 0;

                public GsonTypeAdapter setDefaultItemSpacing(int i) {
                    this.defaultItemSpacing = i;
                    return this;
                }

                public GsonTypeAdapter setDefaultRenderHeight(double d) {
                    this.defaultRenderHeight = d;
                    return this;
                }

                public GsonTypeAdapter(Gson gson) {
                    this.renderHeightAdapter = gson.getAdapter(Double.class);
                    this.itemSpacingAdapter = gson.getAdapter(Integer.class);
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, PlayerControls.ChoicePointsMetadata.Container.ContainerData containerData) {
                    if (containerData == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("renderHeight");
                    this.renderHeightAdapter.write(jsonWriter, Double.valueOf(containerData.renderHeight()));
                    jsonWriter.name("itemSpacing");
                    this.itemSpacingAdapter.write(jsonWriter, Integer.valueOf(containerData.itemSpacing()));
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.gson.TypeAdapter
                public PlayerControls.ChoicePointsMetadata.Container.ContainerData read(JsonReader jsonReader) {
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                        return null;
                    }
                    jsonReader.beginObject();
                    double d = this.defaultRenderHeight;
                    int i = this.defaultItemSpacing;
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        if (jsonReader.peek() == JsonToken.NULL) {
                            jsonReader.nextNull();
                        } else {
                            nextName.hashCode();
                            if (nextName.equals("renderHeight")) {
                                d = this.renderHeightAdapter.read(jsonReader).doubleValue();
                            } else if (nextName.equals("itemSpacing")) {
                                i = this.itemSpacingAdapter.read(jsonReader).intValue();
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                    }
                    jsonReader.endObject();
                    return new AutoValue_PlayerControls_ChoicePointsMetadata_Container_ContainerData(d, i);
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(renderHeight());
        parcel.writeInt(itemSpacing());
    }
}
