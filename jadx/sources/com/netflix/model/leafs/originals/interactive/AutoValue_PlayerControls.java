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
public final class AutoValue_PlayerControls extends C$AutoValue_PlayerControls {
    public static final Parcelable.Creator<AutoValue_PlayerControls> CREATOR = new Parcelable.Creator<AutoValue_PlayerControls>() { // from class: com.netflix.model.leafs.originals.interactive.AutoValue_PlayerControls.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_PlayerControls createFromParcel(Parcel parcel) {
            return new AutoValue_PlayerControls((PlayerControls.Config) parcel.readParcelable(PlayerControls.class.getClassLoader()), (PlayerControls.StoryLines) parcel.readParcelable(PlayerControls.class.getClassLoader()), (PlayerControls.ChoicePointsMetadata) parcel.readParcelable(PlayerControls.class.getClassLoader()), parcel.readInt() == 0 ? parcel.readString() : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_PlayerControls[] newArray(int i) {
            return new AutoValue_PlayerControls[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_PlayerControls(PlayerControls.Config config, PlayerControls.StoryLines storyLines, PlayerControls.ChoicePointsMetadata choicePointsMetadata, String str) {
        new C$$AutoValue_PlayerControls(config, storyLines, choicePointsMetadata, str) { // from class: com.netflix.model.leafs.originals.interactive.$AutoValue_PlayerControls

            /* renamed from: com.netflix.model.leafs.originals.interactive.$AutoValue_PlayerControls$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<PlayerControls> {
                private final TypeAdapter<PlayerControls.ChoicePointsMetadata> choicePointsMetadataAdapter;
                private final TypeAdapter<PlayerControls.Config> configAdapter;
                private final TypeAdapter<String> headerTextAdapter;
                private final TypeAdapter<PlayerControls.StoryLines> storylinesAdapter;
                private PlayerControls.Config defaultConfig = null;
                private PlayerControls.StoryLines defaultStorylines = null;
                private PlayerControls.ChoicePointsMetadata defaultChoicePointsMetadata = null;
                private String defaultHeaderText = null;

                public GsonTypeAdapter setDefaultChoicePointsMetadata(PlayerControls.ChoicePointsMetadata choicePointsMetadata) {
                    this.defaultChoicePointsMetadata = choicePointsMetadata;
                    return this;
                }

                public GsonTypeAdapter setDefaultConfig(PlayerControls.Config config) {
                    this.defaultConfig = config;
                    return this;
                }

                public GsonTypeAdapter setDefaultHeaderText(String str) {
                    this.defaultHeaderText = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultStorylines(PlayerControls.StoryLines storyLines) {
                    this.defaultStorylines = storyLines;
                    return this;
                }

                public GsonTypeAdapter(Gson gson) {
                    this.configAdapter = gson.getAdapter(PlayerControls.Config.class);
                    this.storylinesAdapter = gson.getAdapter(PlayerControls.StoryLines.class);
                    this.choicePointsMetadataAdapter = gson.getAdapter(PlayerControls.ChoicePointsMetadata.class);
                    this.headerTextAdapter = gson.getAdapter(String.class);
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, PlayerControls playerControls) {
                    if (playerControls == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("config");
                    this.configAdapter.write(jsonWriter, playerControls.config());
                    jsonWriter.name("storylines");
                    this.storylinesAdapter.write(jsonWriter, playerControls.storylines());
                    jsonWriter.name("choicePointsMetadata");
                    this.choicePointsMetadataAdapter.write(jsonWriter, playerControls.choicePointsMetadata());
                    jsonWriter.name("headerText");
                    this.headerTextAdapter.write(jsonWriter, playerControls.headerText());
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.gson.TypeAdapter
                public PlayerControls read(JsonReader jsonReader) {
                    char c;
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                        return null;
                    }
                    jsonReader.beginObject();
                    PlayerControls.Config config = this.defaultConfig;
                    PlayerControls.StoryLines storyLines = this.defaultStorylines;
                    PlayerControls.ChoicePointsMetadata choicePointsMetadata = this.defaultChoicePointsMetadata;
                    String str = this.defaultHeaderText;
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        if (jsonReader.peek() == JsonToken.NULL) {
                            jsonReader.nextNull();
                        } else {
                            nextName.hashCode();
                            switch (nextName.hashCode()) {
                                case -1354792126:
                                    if (nextName.equals("config")) {
                                        c = 0;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1506191146:
                                    if (nextName.equals("storylines")) {
                                        c = 1;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1977519450:
                                    if (nextName.equals("headerText")) {
                                        c = 2;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 2013390131:
                                    if (nextName.equals("choicePointsMetadata")) {
                                        c = 3;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                default:
                                    c = 65535;
                                    break;
                            }
                            if (c == 0) {
                                config = this.configAdapter.read(jsonReader);
                            } else if (c == 1) {
                                storyLines = this.storylinesAdapter.read(jsonReader);
                            } else if (c == 2) {
                                str = this.headerTextAdapter.read(jsonReader);
                            } else if (c == 3) {
                                choicePointsMetadata = this.choicePointsMetadataAdapter.read(jsonReader);
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                    }
                    jsonReader.endObject();
                    return new AutoValue_PlayerControls(config, storyLines, choicePointsMetadata, str);
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(config(), i);
        parcel.writeParcelable(storylines(), i);
        parcel.writeParcelable(choicePointsMetadata(), i);
        if (headerText() == null) {
            parcel.writeInt(1);
            return;
        }
        parcel.writeInt(0);
        parcel.writeString(headerText());
    }
}
