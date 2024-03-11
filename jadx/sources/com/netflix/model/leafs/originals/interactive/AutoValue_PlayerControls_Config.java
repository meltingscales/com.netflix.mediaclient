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
public final class AutoValue_PlayerControls_Config extends C$AutoValue_PlayerControls_Config {
    public static final Parcelable.Creator<AutoValue_PlayerControls_Config> CREATOR = new Parcelable.Creator<AutoValue_PlayerControls_Config>() { // from class: com.netflix.model.leafs.originals.interactive.AutoValue_PlayerControls_Config.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_PlayerControls_Config createFromParcel(Parcel parcel) {
            return new AutoValue_PlayerControls_Config(parcel.readString(), parcel.readInt(), parcel.readInt() == 1, parcel.readInt(), parcel.readInt() == 1, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, (PlayerControls.Config.ImagesConfig) parcel.readParcelable(PlayerControls.Config.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_PlayerControls_Config[] newArray(int i) {
            return new AutoValue_PlayerControls_Config[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_PlayerControls_Config(String str, int i, boolean z, int i2, boolean z2, String str2, String str3, PlayerControls.Config.ImagesConfig imagesConfig) {
        new C$$AutoValue_PlayerControls_Config(str, i, z, i2, z2, str2, str3, imagesConfig) { // from class: com.netflix.model.leafs.originals.interactive.$AutoValue_PlayerControls_Config

            /* renamed from: com.netflix.model.leafs.originals.interactive.$AutoValue_PlayerControls_Config$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<PlayerControls.Config> {
                private final TypeAdapter<PlayerControls.Config.ImagesConfig> imagesAdapter;
                private final TypeAdapter<String> lockStrategyAdapter;
                private final TypeAdapter<Integer> maxSnapshotsToDisplayAdapter;
                private final TypeAdapter<Integer> maxSnapshotsToPersistAdapter;
                private final TypeAdapter<Boolean> playerControlsSnapshotsAdapter;
                private final TypeAdapter<Boolean> playerControlsTenSecondsControlsAdapter;
                private final TypeAdapter<String> selectionTypeAdapter;
                private final TypeAdapter<String> textDirectionStringAdapter;
                private String defaultLockStrategy = null;
                private int defaultMaxSnapshotsToDisplay = 0;
                private boolean defaultPlayerControlsSnapshots = false;
                private int defaultMaxSnapshotsToPersist = 0;
                private boolean defaultPlayerControlsTenSecondsControls = false;
                private String defaultTextDirectionString = null;
                private String defaultSelectionType = null;
                private PlayerControls.Config.ImagesConfig defaultImages = null;

                public GsonTypeAdapter setDefaultImages(PlayerControls.Config.ImagesConfig imagesConfig) {
                    this.defaultImages = imagesConfig;
                    return this;
                }

                public GsonTypeAdapter setDefaultLockStrategy(String str) {
                    this.defaultLockStrategy = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultMaxSnapshotsToDisplay(int i) {
                    this.defaultMaxSnapshotsToDisplay = i;
                    return this;
                }

                public GsonTypeAdapter setDefaultMaxSnapshotsToPersist(int i) {
                    this.defaultMaxSnapshotsToPersist = i;
                    return this;
                }

                public GsonTypeAdapter setDefaultPlayerControlsSnapshots(boolean z) {
                    this.defaultPlayerControlsSnapshots = z;
                    return this;
                }

                public GsonTypeAdapter setDefaultPlayerControlsTenSecondsControls(boolean z) {
                    this.defaultPlayerControlsTenSecondsControls = z;
                    return this;
                }

                public GsonTypeAdapter setDefaultSelectionType(String str) {
                    this.defaultSelectionType = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultTextDirectionString(String str) {
                    this.defaultTextDirectionString = str;
                    return this;
                }

                public GsonTypeAdapter(Gson gson) {
                    this.lockStrategyAdapter = gson.getAdapter(String.class);
                    this.maxSnapshotsToDisplayAdapter = gson.getAdapter(Integer.class);
                    this.playerControlsSnapshotsAdapter = gson.getAdapter(Boolean.class);
                    this.maxSnapshotsToPersistAdapter = gson.getAdapter(Integer.class);
                    this.playerControlsTenSecondsControlsAdapter = gson.getAdapter(Boolean.class);
                    this.textDirectionStringAdapter = gson.getAdapter(String.class);
                    this.selectionTypeAdapter = gson.getAdapter(String.class);
                    this.imagesAdapter = gson.getAdapter(PlayerControls.Config.ImagesConfig.class);
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, PlayerControls.Config config) {
                    if (config == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("lockStrategy");
                    this.lockStrategyAdapter.write(jsonWriter, config.lockStrategy());
                    jsonWriter.name("maxSnapshotsToDisplay");
                    this.maxSnapshotsToDisplayAdapter.write(jsonWriter, Integer.valueOf(config.maxSnapshotsToDisplay()));
                    jsonWriter.name("playerControlsSnapshots");
                    this.playerControlsSnapshotsAdapter.write(jsonWriter, Boolean.valueOf(config.playerControlsSnapshots()));
                    jsonWriter.name("maxSnapshotsToPersist");
                    this.maxSnapshotsToPersistAdapter.write(jsonWriter, Integer.valueOf(config.maxSnapshotsToPersist()));
                    jsonWriter.name("playerControlsTenSecondsControls");
                    this.playerControlsTenSecondsControlsAdapter.write(jsonWriter, Boolean.valueOf(config.playerControlsTenSecondsControls()));
                    jsonWriter.name("textDirection");
                    this.textDirectionStringAdapter.write(jsonWriter, config.textDirectionString());
                    jsonWriter.name("selectionType");
                    this.selectionTypeAdapter.write(jsonWriter, config.selectionType());
                    jsonWriter.name("images");
                    this.imagesAdapter.write(jsonWriter, config.images());
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.gson.TypeAdapter
                public PlayerControls.Config read(JsonReader jsonReader) {
                    char c;
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                        return null;
                    }
                    jsonReader.beginObject();
                    String str = this.defaultLockStrategy;
                    int i = this.defaultMaxSnapshotsToDisplay;
                    boolean z = this.defaultPlayerControlsSnapshots;
                    int i2 = this.defaultMaxSnapshotsToPersist;
                    boolean z2 = this.defaultPlayerControlsTenSecondsControls;
                    String str2 = this.defaultTextDirectionString;
                    String str3 = str;
                    int i3 = i;
                    boolean z3 = z;
                    int i4 = i2;
                    boolean z4 = z2;
                    String str4 = str2;
                    String str5 = this.defaultSelectionType;
                    PlayerControls.Config.ImagesConfig imagesConfig = this.defaultImages;
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        if (jsonReader.peek() == JsonToken.NULL) {
                            jsonReader.nextNull();
                        } else {
                            nextName.hashCode();
                            switch (nextName.hashCode()) {
                                case -2009152274:
                                    if (nextName.equals("maxSnapshotsToPersist")) {
                                        c = 0;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1545171912:
                                    if (nextName.equals("playerControlsSnapshots")) {
                                        c = 1;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1383697986:
                                    if (nextName.equals("lockStrategy")) {
                                        c = 2;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1185250696:
                                    if (nextName.equals("images")) {
                                        c = 3;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -687708974:
                                    if (nextName.equals("textDirection")) {
                                        c = 4;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -631139953:
                                    if (nextName.equals("playerControlsTenSecondsControls")) {
                                        c = 5;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 341058524:
                                    if (nextName.equals("maxSnapshotsToDisplay")) {
                                        c = 6;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1039453926:
                                    if (nextName.equals("selectionType")) {
                                        c = 7;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                default:
                                    c = 65535;
                                    break;
                            }
                            switch (c) {
                                case 0:
                                    i4 = this.maxSnapshotsToPersistAdapter.read(jsonReader).intValue();
                                    continue;
                                case 1:
                                    z3 = this.playerControlsSnapshotsAdapter.read(jsonReader).booleanValue();
                                    continue;
                                case 2:
                                    str3 = this.lockStrategyAdapter.read(jsonReader);
                                    continue;
                                case 3:
                                    imagesConfig = this.imagesAdapter.read(jsonReader);
                                    continue;
                                case 4:
                                    str4 = this.textDirectionStringAdapter.read(jsonReader);
                                    continue;
                                case 5:
                                    z4 = this.playerControlsTenSecondsControlsAdapter.read(jsonReader).booleanValue();
                                    continue;
                                case 6:
                                    i3 = this.maxSnapshotsToDisplayAdapter.read(jsonReader).intValue();
                                    continue;
                                case 7:
                                    str5 = this.selectionTypeAdapter.read(jsonReader);
                                    continue;
                                default:
                                    jsonReader.skipValue();
                                    continue;
                            }
                        }
                    }
                    jsonReader.endObject();
                    return new AutoValue_PlayerControls_Config(str3, i3, z3, i4, z4, str4, str5, imagesConfig);
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(lockStrategy());
        parcel.writeInt(maxSnapshotsToDisplay());
        parcel.writeInt(playerControlsSnapshots() ? 1 : 0);
        parcel.writeInt(maxSnapshotsToPersist());
        parcel.writeInt(playerControlsTenSecondsControls() ? 1 : 0);
        if (textDirectionString() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(textDirectionString());
        }
        if (selectionType() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(selectionType());
        }
        parcel.writeParcelable(images(), i);
    }
}
