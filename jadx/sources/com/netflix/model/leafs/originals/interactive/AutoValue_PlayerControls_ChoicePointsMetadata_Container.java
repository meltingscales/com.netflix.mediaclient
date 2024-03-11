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
public final class AutoValue_PlayerControls_ChoicePointsMetadata_Container extends C$AutoValue_PlayerControls_ChoicePointsMetadata_Container {
    public static final Parcelable.Creator<AutoValue_PlayerControls_ChoicePointsMetadata_Container> CREATOR = new Parcelable.Creator<AutoValue_PlayerControls_ChoicePointsMetadata_Container>() { // from class: com.netflix.model.leafs.originals.interactive.AutoValue_PlayerControls_ChoicePointsMetadata_Container.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_PlayerControls_ChoicePointsMetadata_Container createFromParcel(Parcel parcel) {
            return new AutoValue_PlayerControls_ChoicePointsMetadata_Container((PlayerControls.ChoicePointsMetadata.Container.ContainerData) parcel.readParcelable(PlayerControls.ChoicePointsMetadata.Container.class.getClassLoader()), (PlayerControls.ChoicePointsMetadata.Container.ContainerData) parcel.readParcelable(PlayerControls.ChoicePointsMetadata.Container.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_PlayerControls_ChoicePointsMetadata_Container[] newArray(int i) {
            return new AutoValue_PlayerControls_ChoicePointsMetadata_Container[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_PlayerControls_ChoicePointsMetadata_Container(PlayerControls.ChoicePointsMetadata.Container.ContainerData containerData, PlayerControls.ChoicePointsMetadata.Container.ContainerData containerData2) {
        new C$$AutoValue_PlayerControls_ChoicePointsMetadata_Container(containerData, containerData2) { // from class: com.netflix.model.leafs.originals.interactive.$AutoValue_PlayerControls_ChoicePointsMetadata_Container

            /* renamed from: com.netflix.model.leafs.originals.interactive.$AutoValue_PlayerControls_ChoicePointsMetadata_Container$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<PlayerControls.ChoicePointsMetadata.Container> {
                private final TypeAdapter<PlayerControls.ChoicePointsMetadata.Container.ContainerData> defaultDataAdapter;
                private PlayerControls.ChoicePointsMetadata.Container.ContainerData defaultDefaultData = null;
                private PlayerControls.ChoicePointsMetadata.Container.ContainerData defaultZoomed = null;
                private final TypeAdapter<PlayerControls.ChoicePointsMetadata.Container.ContainerData> zoomedAdapter;

                public GsonTypeAdapter setDefaultDefaultData(PlayerControls.ChoicePointsMetadata.Container.ContainerData containerData) {
                    this.defaultDefaultData = containerData;
                    return this;
                }

                public GsonTypeAdapter setDefaultZoomed(PlayerControls.ChoicePointsMetadata.Container.ContainerData containerData) {
                    this.defaultZoomed = containerData;
                    return this;
                }

                public GsonTypeAdapter(Gson gson) {
                    this.defaultDataAdapter = gson.getAdapter(PlayerControls.ChoicePointsMetadata.Container.ContainerData.class);
                    this.zoomedAdapter = gson.getAdapter(PlayerControls.ChoicePointsMetadata.Container.ContainerData.class);
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, PlayerControls.ChoicePointsMetadata.Container container) {
                    if (container == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("default");
                    this.defaultDataAdapter.write(jsonWriter, container.defaultData());
                    jsonWriter.name("zoomed");
                    this.zoomedAdapter.write(jsonWriter, container.zoomed());
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.gson.TypeAdapter
                public PlayerControls.ChoicePointsMetadata.Container read(JsonReader jsonReader) {
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                        return null;
                    }
                    jsonReader.beginObject();
                    PlayerControls.ChoicePointsMetadata.Container.ContainerData containerData = this.defaultDefaultData;
                    PlayerControls.ChoicePointsMetadata.Container.ContainerData containerData2 = this.defaultZoomed;
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        if (jsonReader.peek() == JsonToken.NULL) {
                            jsonReader.nextNull();
                        } else {
                            nextName.hashCode();
                            if (nextName.equals("zoomed")) {
                                containerData2 = this.zoomedAdapter.read(jsonReader);
                            } else if (nextName.equals("default")) {
                                containerData = this.defaultDataAdapter.read(jsonReader);
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                    }
                    jsonReader.endObject();
                    return new AutoValue_PlayerControls_ChoicePointsMetadata_Container(containerData, containerData2);
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(defaultData(), i);
        parcel.writeParcelable(zoomed(), i);
    }
}
