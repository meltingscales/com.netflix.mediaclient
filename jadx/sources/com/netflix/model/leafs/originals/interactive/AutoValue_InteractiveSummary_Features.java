package com.netflix.model.leafs.originals.interactive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.netflix.model.leafs.originals.interactive.InteractiveSummary;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_InteractiveSummary_Features extends C$AutoValue_InteractiveSummary_Features {
    public static final Parcelable.Creator<AutoValue_InteractiveSummary_Features> CREATOR = new Parcelable.Creator<AutoValue_InteractiveSummary_Features>() { // from class: com.netflix.model.leafs.originals.interactive.AutoValue_InteractiveSummary_Features.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_InteractiveSummary_Features createFromParcel(Parcel parcel) {
            return new AutoValue_InteractiveSummary_Features(parcel.readInt() == 1, parcel.readInt() == 1, parcel.readInt() == 1, parcel.readInt() == 1, parcel.readInt() == 1, parcel.readInt() == 1, parcel.readInt() == 1, parcel.readInt() == 1, parcel.readInt() == 1, parcel.readInt() == 1, parcel.readInt() == 1, parcel.readInt() == 1, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readArrayList(InteractiveSummary.Features.class.getClassLoader()), parcel.readInt() == 1, parcel.readInt() == 0 ? Double.valueOf(parcel.readDouble()) : null, parcel.readInt() == 1, parcel.readInt() == 1);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_InteractiveSummary_Features[] newArray(int i) {
            return new AutoValue_InteractiveSummary_Features[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_InteractiveSummary_Features(final boolean z, final boolean z2, final boolean z3, final boolean z4, final boolean z5, final boolean z6, final boolean z7, final boolean z8, final boolean z9, final boolean z10, final boolean z11, final boolean z12, final String str, final List<String> list, final boolean z13, final Double d, final boolean z14, final boolean z15) {
        new C$$AutoValue_InteractiveSummary_Features(z, z2, z3, z4, z5, z6, z7, z8, z9, z10, z11, z12, str, list, z13, d, z14, z15) { // from class: com.netflix.model.leafs.originals.interactive.$AutoValue_InteractiveSummary_Features

            /* renamed from: com.netflix.model.leafs.originals.interactive.$AutoValue_InteractiveSummary_Features$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<InteractiveSummary.Features> {
                private final TypeAdapter<String> appUpdateDialogMessageAdapter;
                private final TypeAdapter<Double> bookmarkOverrideSecondsAdapter;
                private final TypeAdapter<Boolean> choicePointDebugMenuAdapter;
                private final TypeAdapter<Boolean> customBookmarkAdapter;
                private final TypeAdapter<Boolean> fallbackTutorialAdapter;
                private final TypeAdapter<Boolean> hideDetailedDurationsAdapter;
                private final TypeAdapter<Boolean> hideSubtitlesMenuDuringPlaybackAdapter;
                private final TypeAdapter<Boolean> interactiveAppUpdateDialogueAdapter;
                private final TypeAdapter<Boolean> interactiveTrailerAdapter;
                private final TypeAdapter<Boolean> ippAdapter;
                private final TypeAdapter<Boolean> playbackGraphAdapter;
                private final TypeAdapter<Boolean> playerControlsPersistPlayPauseAdapter;
                private final TypeAdapter<Boolean> playerControlsSnapshotsAdapter;
                private final TypeAdapter<Boolean> pollingToggleAdapter;
                private final TypeAdapter<Boolean> prePlayAdapter;
                private final TypeAdapter<Boolean> resetUserStateAdapter;
                private final TypeAdapter<List<String>> supportedErrorDialogsAdapter;
                private final TypeAdapter<Boolean> videoMomentsAdapter;
                private boolean defaultPlaybackGraph = false;
                private boolean defaultVideoMoments = false;
                private boolean defaultIpp = false;
                private boolean defaultPrePlay = false;
                private boolean defaultCustomBookmark = false;
                private boolean defaultFallbackTutorial = false;
                private boolean defaultInteractiveTrailer = false;
                private boolean defaultHideDetailedDurations = false;
                private boolean defaultInteractiveAppUpdateDialogue = false;
                private boolean defaultResetUserState = false;
                private boolean defaultPlayerControlsSnapshots = false;
                private boolean defaultChoicePointDebugMenu = false;
                private String defaultAppUpdateDialogMessage = null;
                private List<String> defaultSupportedErrorDialogs = null;
                private boolean defaultPollingToggle = false;
                private Double defaultBookmarkOverrideSeconds = null;
                private boolean defaultHideSubtitlesMenuDuringPlayback = false;
                private boolean defaultPlayerControlsPersistPlayPause = false;

                public GsonTypeAdapter setDefaultAppUpdateDialogMessage(String str) {
                    this.defaultAppUpdateDialogMessage = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultBookmarkOverrideSeconds(Double d) {
                    this.defaultBookmarkOverrideSeconds = d;
                    return this;
                }

                public GsonTypeAdapter setDefaultChoicePointDebugMenu(boolean z) {
                    this.defaultChoicePointDebugMenu = z;
                    return this;
                }

                public GsonTypeAdapter setDefaultCustomBookmark(boolean z) {
                    this.defaultCustomBookmark = z;
                    return this;
                }

                public GsonTypeAdapter setDefaultFallbackTutorial(boolean z) {
                    this.defaultFallbackTutorial = z;
                    return this;
                }

                public GsonTypeAdapter setDefaultHideDetailedDurations(boolean z) {
                    this.defaultHideDetailedDurations = z;
                    return this;
                }

                public GsonTypeAdapter setDefaultHideSubtitlesMenuDuringPlayback(boolean z) {
                    this.defaultHideSubtitlesMenuDuringPlayback = z;
                    return this;
                }

                public GsonTypeAdapter setDefaultInteractiveAppUpdateDialogue(boolean z) {
                    this.defaultInteractiveAppUpdateDialogue = z;
                    return this;
                }

                public GsonTypeAdapter setDefaultInteractiveTrailer(boolean z) {
                    this.defaultInteractiveTrailer = z;
                    return this;
                }

                public GsonTypeAdapter setDefaultIpp(boolean z) {
                    this.defaultIpp = z;
                    return this;
                }

                public GsonTypeAdapter setDefaultPlaybackGraph(boolean z) {
                    this.defaultPlaybackGraph = z;
                    return this;
                }

                public GsonTypeAdapter setDefaultPlayerControlsPersistPlayPause(boolean z) {
                    this.defaultPlayerControlsPersistPlayPause = z;
                    return this;
                }

                public GsonTypeAdapter setDefaultPlayerControlsSnapshots(boolean z) {
                    this.defaultPlayerControlsSnapshots = z;
                    return this;
                }

                public GsonTypeAdapter setDefaultPollingToggle(boolean z) {
                    this.defaultPollingToggle = z;
                    return this;
                }

                public GsonTypeAdapter setDefaultPrePlay(boolean z) {
                    this.defaultPrePlay = z;
                    return this;
                }

                public GsonTypeAdapter setDefaultResetUserState(boolean z) {
                    this.defaultResetUserState = z;
                    return this;
                }

                public GsonTypeAdapter setDefaultSupportedErrorDialogs(List<String> list) {
                    this.defaultSupportedErrorDialogs = list;
                    return this;
                }

                public GsonTypeAdapter setDefaultVideoMoments(boolean z) {
                    this.defaultVideoMoments = z;
                    return this;
                }

                public GsonTypeAdapter(Gson gson) {
                    this.playbackGraphAdapter = gson.getAdapter(Boolean.class);
                    this.videoMomentsAdapter = gson.getAdapter(Boolean.class);
                    this.ippAdapter = gson.getAdapter(Boolean.class);
                    this.prePlayAdapter = gson.getAdapter(Boolean.class);
                    this.customBookmarkAdapter = gson.getAdapter(Boolean.class);
                    this.fallbackTutorialAdapter = gson.getAdapter(Boolean.class);
                    this.interactiveTrailerAdapter = gson.getAdapter(Boolean.class);
                    this.hideDetailedDurationsAdapter = gson.getAdapter(Boolean.class);
                    this.interactiveAppUpdateDialogueAdapter = gson.getAdapter(Boolean.class);
                    this.resetUserStateAdapter = gson.getAdapter(Boolean.class);
                    this.playerControlsSnapshotsAdapter = gson.getAdapter(Boolean.class);
                    this.choicePointDebugMenuAdapter = gson.getAdapter(Boolean.class);
                    this.appUpdateDialogMessageAdapter = gson.getAdapter(String.class);
                    this.supportedErrorDialogsAdapter = gson.getAdapter(TypeToken.getParameterized(List.class, String.class));
                    this.pollingToggleAdapter = gson.getAdapter(Boolean.class);
                    this.bookmarkOverrideSecondsAdapter = gson.getAdapter(Double.class);
                    this.hideSubtitlesMenuDuringPlaybackAdapter = gson.getAdapter(Boolean.class);
                    this.playerControlsPersistPlayPauseAdapter = gson.getAdapter(Boolean.class);
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, InteractiveSummary.Features features) {
                    if (features == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("playbackGraph");
                    this.playbackGraphAdapter.write(jsonWriter, Boolean.valueOf(features.playbackGraph()));
                    jsonWriter.name("videoMoments");
                    this.videoMomentsAdapter.write(jsonWriter, Boolean.valueOf(features.videoMoments()));
                    jsonWriter.name("ipp");
                    this.ippAdapter.write(jsonWriter, Boolean.valueOf(features.ipp()));
                    jsonWriter.name("prePlay");
                    this.prePlayAdapter.write(jsonWriter, Boolean.valueOf(features.prePlay()));
                    jsonWriter.name("customBookmark");
                    this.customBookmarkAdapter.write(jsonWriter, Boolean.valueOf(features.customBookmark()));
                    jsonWriter.name("fallbackTutorial");
                    this.fallbackTutorialAdapter.write(jsonWriter, Boolean.valueOf(features.fallbackTutorial()));
                    jsonWriter.name("interactiveTrailer");
                    this.interactiveTrailerAdapter.write(jsonWriter, Boolean.valueOf(features.interactiveTrailer()));
                    jsonWriter.name("hideDetailedDurations");
                    this.hideDetailedDurationsAdapter.write(jsonWriter, Boolean.valueOf(features.hideDetailedDurations()));
                    jsonWriter.name("interactiveAppUpdateDialogue");
                    this.interactiveAppUpdateDialogueAdapter.write(jsonWriter, Boolean.valueOf(features.interactiveAppUpdateDialogue()));
                    jsonWriter.name("resetUserState");
                    this.resetUserStateAdapter.write(jsonWriter, Boolean.valueOf(features.resetUserState()));
                    jsonWriter.name("playerControlsSnapshots");
                    this.playerControlsSnapshotsAdapter.write(jsonWriter, Boolean.valueOf(features.playerControlsSnapshots()));
                    jsonWriter.name("choicePointDebugMenu");
                    this.choicePointDebugMenuAdapter.write(jsonWriter, Boolean.valueOf(features.choicePointDebugMenu()));
                    jsonWriter.name("appUpdateDialogMessage");
                    this.appUpdateDialogMessageAdapter.write(jsonWriter, features.appUpdateDialogMessage());
                    jsonWriter.name("supportedErrorDialogs");
                    this.supportedErrorDialogsAdapter.write(jsonWriter, features.supportedErrorDialogs());
                    jsonWriter.name("pollingToggle");
                    this.pollingToggleAdapter.write(jsonWriter, Boolean.valueOf(features.pollingToggle()));
                    jsonWriter.name("bookmarkOverrideSeconds");
                    this.bookmarkOverrideSecondsAdapter.write(jsonWriter, features.bookmarkOverrideSeconds());
                    jsonWriter.name("hideSubtitlesMenuDuringPlayback");
                    this.hideSubtitlesMenuDuringPlaybackAdapter.write(jsonWriter, Boolean.valueOf(features.hideSubtitlesMenuDuringPlayback()));
                    jsonWriter.name("playerControlsPersistPlayPause");
                    this.playerControlsPersistPlayPauseAdapter.write(jsonWriter, Boolean.valueOf(features.playerControlsPersistPlayPause()));
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.gson.TypeAdapter
                public InteractiveSummary.Features read(JsonReader jsonReader) {
                    char c;
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                        return null;
                    }
                    jsonReader.beginObject();
                    boolean z = this.defaultPlaybackGraph;
                    boolean z2 = this.defaultVideoMoments;
                    boolean z3 = this.defaultIpp;
                    boolean z4 = this.defaultPrePlay;
                    boolean z5 = this.defaultCustomBookmark;
                    boolean z6 = this.defaultFallbackTutorial;
                    boolean z7 = this.defaultInteractiveTrailer;
                    boolean z8 = this.defaultHideDetailedDurations;
                    boolean z9 = this.defaultInteractiveAppUpdateDialogue;
                    boolean z10 = this.defaultResetUserState;
                    boolean z11 = this.defaultPlayerControlsSnapshots;
                    boolean z12 = this.defaultChoicePointDebugMenu;
                    String str = this.defaultAppUpdateDialogMessage;
                    List<String> list = this.defaultSupportedErrorDialogs;
                    boolean z13 = this.defaultPollingToggle;
                    Double d = this.defaultBookmarkOverrideSeconds;
                    boolean z14 = this.defaultHideSubtitlesMenuDuringPlayback;
                    boolean z15 = this.defaultPlayerControlsPersistPlayPause;
                    boolean z16 = z2;
                    boolean z17 = z3;
                    boolean z18 = z4;
                    boolean z19 = z5;
                    boolean z20 = z6;
                    boolean z21 = z7;
                    boolean z22 = z8;
                    boolean z23 = z9;
                    boolean z24 = z10;
                    boolean z25 = z11;
                    boolean z26 = z12;
                    String str2 = str;
                    List<String> list2 = list;
                    boolean z27 = z;
                    boolean z28 = z13;
                    Double d2 = d;
                    boolean z29 = z14;
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        if (jsonReader.peek() == JsonToken.NULL) {
                            jsonReader.nextNull();
                        } else {
                            nextName.hashCode();
                            switch (nextName.hashCode()) {
                                case -1743941771:
                                    if (nextName.equals("appUpdateDialogMessage")) {
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
                                case -1306315680:
                                    if (nextName.equals("fallbackTutorial")) {
                                        c = 2;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -941321229:
                                    if (nextName.equals("playbackGraph")) {
                                        c = 3;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -814574649:
                                    if (nextName.equals("customBookmark")) {
                                        c = 4;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -548706051:
                                    if (nextName.equals("bookmarkOverrideSeconds")) {
                                        c = 5;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -538379017:
                                    if (nextName.equals("pollingToggle")) {
                                        c = 6;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -319313801:
                                    if (nextName.equals("prePlay")) {
                                        c = 7;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 104489:
                                    if (nextName.equals("ipp")) {
                                        c = '\b';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 22494193:
                                    if (nextName.equals("interactiveTrailer")) {
                                        c = '\t';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 269731181:
                                    if (nextName.equals("hideDetailedDurations")) {
                                        c = '\n';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 499784439:
                                    if (nextName.equals("resetUserState")) {
                                        c = 11;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 557613780:
                                    if (nextName.equals("hideSubtitlesMenuDuringPlayback")) {
                                        c = '\f';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 886278789:
                                    if (nextName.equals("playerControlsPersistPlayPause")) {
                                        c = '\r';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 892987264:
                                    if (nextName.equals("interactiveAppUpdateDialogue")) {
                                        c = 14;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1088115064:
                                    if (nextName.equals("videoMoments")) {
                                        c = 15;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1608124067:
                                    if (nextName.equals("choicePointDebugMenu")) {
                                        c = 16;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1728064721:
                                    if (nextName.equals("supportedErrorDialogs")) {
                                        c = 17;
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
                                    str2 = this.appUpdateDialogMessageAdapter.read(jsonReader);
                                    continue;
                                case 1:
                                    z25 = this.playerControlsSnapshotsAdapter.read(jsonReader).booleanValue();
                                    continue;
                                case 2:
                                    z20 = this.fallbackTutorialAdapter.read(jsonReader).booleanValue();
                                    continue;
                                case 3:
                                    z27 = this.playbackGraphAdapter.read(jsonReader).booleanValue();
                                    continue;
                                case 4:
                                    z19 = this.customBookmarkAdapter.read(jsonReader).booleanValue();
                                    continue;
                                case 5:
                                    d2 = this.bookmarkOverrideSecondsAdapter.read(jsonReader);
                                    continue;
                                case 6:
                                    z28 = this.pollingToggleAdapter.read(jsonReader).booleanValue();
                                    continue;
                                case 7:
                                    z18 = this.prePlayAdapter.read(jsonReader).booleanValue();
                                    continue;
                                case '\b':
                                    z17 = this.ippAdapter.read(jsonReader).booleanValue();
                                    continue;
                                case '\t':
                                    z21 = this.interactiveTrailerAdapter.read(jsonReader).booleanValue();
                                    continue;
                                case '\n':
                                    z22 = this.hideDetailedDurationsAdapter.read(jsonReader).booleanValue();
                                    continue;
                                case 11:
                                    z24 = this.resetUserStateAdapter.read(jsonReader).booleanValue();
                                    continue;
                                case '\f':
                                    z29 = this.hideSubtitlesMenuDuringPlaybackAdapter.read(jsonReader).booleanValue();
                                    continue;
                                case '\r':
                                    z15 = this.playerControlsPersistPlayPauseAdapter.read(jsonReader).booleanValue();
                                    continue;
                                case 14:
                                    z23 = this.interactiveAppUpdateDialogueAdapter.read(jsonReader).booleanValue();
                                    continue;
                                case 15:
                                    z16 = this.videoMomentsAdapter.read(jsonReader).booleanValue();
                                    continue;
                                case 16:
                                    z26 = this.choicePointDebugMenuAdapter.read(jsonReader).booleanValue();
                                    continue;
                                case 17:
                                    list2 = this.supportedErrorDialogsAdapter.read(jsonReader);
                                    continue;
                                default:
                                    jsonReader.skipValue();
                                    continue;
                            }
                        }
                    }
                    jsonReader.endObject();
                    return new AutoValue_InteractiveSummary_Features(z27, z16, z17, z18, z19, z20, z21, z22, z23, z24, z25, z26, str2, list2, z28, d2, z29, z15);
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(playbackGraph() ? 1 : 0);
        parcel.writeInt(videoMoments() ? 1 : 0);
        parcel.writeInt(ipp() ? 1 : 0);
        parcel.writeInt(prePlay() ? 1 : 0);
        parcel.writeInt(customBookmark() ? 1 : 0);
        parcel.writeInt(fallbackTutorial() ? 1 : 0);
        parcel.writeInt(interactiveTrailer() ? 1 : 0);
        parcel.writeInt(hideDetailedDurations() ? 1 : 0);
        parcel.writeInt(interactiveAppUpdateDialogue() ? 1 : 0);
        parcel.writeInt(resetUserState() ? 1 : 0);
        parcel.writeInt(playerControlsSnapshots() ? 1 : 0);
        parcel.writeInt(choicePointDebugMenu() ? 1 : 0);
        if (appUpdateDialogMessage() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(appUpdateDialogMessage());
        }
        parcel.writeList(supportedErrorDialogs());
        parcel.writeInt(pollingToggle() ? 1 : 0);
        if (bookmarkOverrideSeconds() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeDouble(bookmarkOverrideSeconds().doubleValue());
        }
        parcel.writeInt(hideSubtitlesMenuDuringPlayback() ? 1 : 0);
        parcel.writeInt(playerControlsPersistPlayPause() ? 1 : 0);
    }
}
