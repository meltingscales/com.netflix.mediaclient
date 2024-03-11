package com.netflix.model.leafs.originals.interactive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.netflix.model.leafs.originals.interactive.PlayerControls;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_PlayerControls_ChoicePointsMetadata extends C$AutoValue_PlayerControls_ChoicePointsMetadata {
    public static final Parcelable.Creator<AutoValue_PlayerControls_ChoicePointsMetadata> CREATOR = new Parcelable.Creator<AutoValue_PlayerControls_ChoicePointsMetadata>() { // from class: com.netflix.model.leafs.originals.interactive.AutoValue_PlayerControls_ChoicePointsMetadata.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_PlayerControls_ChoicePointsMetadata createFromParcel(Parcel parcel) {
            return new AutoValue_PlayerControls_ChoicePointsMetadata(parcel.readHashMap(PlayerControls.ChoicePointsMetadata.class.getClassLoader()), parcel.readHashMap(PlayerControls.ChoicePointsMetadata.class.getClassLoader()), (AssetManifest) parcel.readParcelable(PlayerControls.ChoicePointsMetadata.class.getClassLoader()), (PlayerControls.ChoicePointsMetadata.Container) parcel.readParcelable(PlayerControls.ChoicePointsMetadata.class.getClassLoader()), (PlayerControls.ChoicePointsMetadata.Cell) parcel.readParcelable(PlayerControls.ChoicePointsMetadata.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_PlayerControls_ChoicePointsMetadata[] newArray(int i) {
            return new AutoValue_PlayerControls_ChoicePointsMetadata[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_PlayerControls_ChoicePointsMetadata(Map<String, PlayerControls.ChoicePointsMetadata.ChoicePoint> map, Map<String, PlayerControls.ChoicePointsMetadata.Choice> map2, AssetManifest assetManifest, PlayerControls.ChoicePointsMetadata.Container container, PlayerControls.ChoicePointsMetadata.Cell cell) {
        new C$$AutoValue_PlayerControls_ChoicePointsMetadata(map, map2, assetManifest, container, cell) { // from class: com.netflix.model.leafs.originals.interactive.$AutoValue_PlayerControls_ChoicePointsMetadata

            /* renamed from: com.netflix.model.leafs.originals.interactive.$AutoValue_PlayerControls_ChoicePointsMetadata$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<PlayerControls.ChoicePointsMetadata> {
                private final TypeAdapter<PlayerControls.ChoicePointsMetadata.Cell> cellAdapter;
                private final TypeAdapter<Map<String, PlayerControls.ChoicePointsMetadata.ChoicePoint>> choicePointsAdapter;
                private final TypeAdapter<Map<String, PlayerControls.ChoicePointsMetadata.Choice>> choicesAdapter;
                private final TypeAdapter<PlayerControls.ChoicePointsMetadata.Container> containerAdapter;
                private Map<String, PlayerControls.ChoicePointsMetadata.ChoicePoint> defaultChoicePoints = null;
                private Map<String, PlayerControls.ChoicePointsMetadata.Choice> defaultChoices = null;
                private AssetManifest defaultAssetManifest = null;
                private PlayerControls.ChoicePointsMetadata.Container defaultContainer = null;
                private PlayerControls.ChoicePointsMetadata.Cell defaultCell = null;
                private final TypeAdapter<AssetManifest> assetManifestAdapter = new AssetManifestAdapter();

                public GsonTypeAdapter setDefaultAssetManifest(AssetManifest assetManifest) {
                    this.defaultAssetManifest = assetManifest;
                    return this;
                }

                public GsonTypeAdapter setDefaultCell(PlayerControls.ChoicePointsMetadata.Cell cell) {
                    this.defaultCell = cell;
                    return this;
                }

                public GsonTypeAdapter setDefaultChoicePoints(Map<String, PlayerControls.ChoicePointsMetadata.ChoicePoint> map) {
                    this.defaultChoicePoints = map;
                    return this;
                }

                public GsonTypeAdapter setDefaultChoices(Map<String, PlayerControls.ChoicePointsMetadata.Choice> map) {
                    this.defaultChoices = map;
                    return this;
                }

                public GsonTypeAdapter setDefaultContainer(PlayerControls.ChoicePointsMetadata.Container container) {
                    this.defaultContainer = container;
                    return this;
                }

                public GsonTypeAdapter(Gson gson) {
                    this.choicePointsAdapter = gson.getAdapter(TypeToken.getParameterized(Map.class, String.class, PlayerControls.ChoicePointsMetadata.ChoicePoint.class));
                    this.choicesAdapter = gson.getAdapter(TypeToken.getParameterized(Map.class, String.class, PlayerControls.ChoicePointsMetadata.Choice.class));
                    this.containerAdapter = gson.getAdapter(PlayerControls.ChoicePointsMetadata.Container.class);
                    this.cellAdapter = gson.getAdapter(PlayerControls.ChoicePointsMetadata.Cell.class);
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, PlayerControls.ChoicePointsMetadata choicePointsMetadata) {
                    if (choicePointsMetadata == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("choicePoints");
                    this.choicePointsAdapter.write(jsonWriter, choicePointsMetadata.choicePoints());
                    jsonWriter.name("choices");
                    this.choicesAdapter.write(jsonWriter, choicePointsMetadata.choices());
                    jsonWriter.name("assetManifest");
                    this.assetManifestAdapter.write(jsonWriter, choicePointsMetadata.assetManifest());
                    jsonWriter.name("container");
                    this.containerAdapter.write(jsonWriter, choicePointsMetadata.container());
                    jsonWriter.name("cell");
                    this.cellAdapter.write(jsonWriter, choicePointsMetadata.cell());
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.gson.TypeAdapter
                public PlayerControls.ChoicePointsMetadata read(JsonReader jsonReader) {
                    char c;
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                        return null;
                    }
                    jsonReader.beginObject();
                    Map<String, PlayerControls.ChoicePointsMetadata.ChoicePoint> map = this.defaultChoicePoints;
                    Map<String, PlayerControls.ChoicePointsMetadata.Choice> map2 = this.defaultChoices;
                    Map<String, PlayerControls.ChoicePointsMetadata.ChoicePoint> map3 = map;
                    Map<String, PlayerControls.ChoicePointsMetadata.Choice> map4 = map2;
                    AssetManifest assetManifest = this.defaultAssetManifest;
                    PlayerControls.ChoicePointsMetadata.Container container = this.defaultContainer;
                    PlayerControls.ChoicePointsMetadata.Cell cell = this.defaultCell;
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        if (jsonReader.peek() == JsonToken.NULL) {
                            jsonReader.nextNull();
                        } else {
                            nextName.hashCode();
                            switch (nextName.hashCode()) {
                                case -868210204:
                                    if (nextName.equals("choicePoints")) {
                                        c = 0;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -410956671:
                                    if (nextName.equals("container")) {
                                        c = 1;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 3049826:
                                    if (nextName.equals("cell")) {
                                        c = 2;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 751720178:
                                    if (nextName.equals("choices")) {
                                        c = 3;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1389268287:
                                    if (nextName.equals("assetManifest")) {
                                        c = 4;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                default:
                                    c = 65535;
                                    break;
                            }
                            if (c == 0) {
                                map3 = this.choicePointsAdapter.read(jsonReader);
                            } else if (c == 1) {
                                container = this.containerAdapter.read(jsonReader);
                            } else if (c == 2) {
                                cell = this.cellAdapter.read(jsonReader);
                            } else if (c == 3) {
                                map4 = this.choicesAdapter.read(jsonReader);
                            } else if (c == 4) {
                                assetManifest = this.assetManifestAdapter.read(jsonReader);
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                    }
                    jsonReader.endObject();
                    return new AutoValue_PlayerControls_ChoicePointsMetadata(map3, map4, assetManifest, container, cell);
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeMap(choicePoints());
        parcel.writeMap(choices());
        parcel.writeParcelable(assetManifest(), i);
        parcel.writeParcelable(container(), i);
        parcel.writeParcelable(cell(), i);
    }
}
