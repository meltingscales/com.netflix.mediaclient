package com.netflix.model.leafs.originals.interactive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.netflix.model.leafs.originals.interactive.GroupsAdapter;
import com.netflix.model.leafs.originals.interactive.condition.Condition;
import com.netflix.model.leafs.originals.interactive.condition.SnapshotAdapter;
import com.netflix.model.leafs.originals.interactive.condition.Snapshots;
import com.netflix.model.leafs.originals.interactive.condition.StateHistory;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_InteractiveMoments extends C$AutoValue_InteractiveMoments {
    public static final Parcelable.Creator<AutoValue_InteractiveMoments> CREATOR = new Parcelable.Creator<AutoValue_InteractiveMoments>() { // from class: com.netflix.model.leafs.originals.interactive.AutoValue_InteractiveMoments.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_InteractiveMoments createFromParcel(Parcel parcel) {
            return new AutoValue_InteractiveMoments(parcel.readInt() == 0 ? parcel.readString() : null, (PlayerControls) parcel.readParcelable(InteractiveMoments.class.getClassLoader()), (UiDefinition) parcel.readParcelable(InteractiveMoments.class.getClassLoader()), (CommonMetaData) parcel.readParcelable(InteractiveMoments.class.getClassLoader()), parcel.readArrayList(InteractiveMoments.class.getClassLoader()), (StateHistory) parcel.readParcelable(InteractiveMoments.class.getClassLoader()), (Snapshots) parcel.readArrayList(InteractiveMoments.class.getClassLoader()), parcel.readHashMap(InteractiveMoments.class.getClassLoader()), parcel.readHashMap(InteractiveMoments.class.getClassLoader()), parcel.readHashMap(InteractiveMoments.class.getClassLoader()), parcel.readHashMap(InteractiveMoments.class.getClassLoader()), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readHashMap(InteractiveMoments.class.getClassLoader()), parcel.readHashMap(InteractiveMoments.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_InteractiveMoments[] newArray(int i) {
            return new AutoValue_InteractiveMoments[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_InteractiveMoments(String str, PlayerControls playerControls, UiDefinition uiDefinition, CommonMetaData commonMetaData, ArrayList<String> arrayList, StateHistory stateHistory, Snapshots snapshots, Map<String, List<Moment>> map, Map<String, Moment> map2, Map<String, List<SegmentStateItem>> map3, Map<String, Condition> map4, String str2, String str3, Map<String, List<BaseGroupItem>> map5, Map<String, ChoiceMapOverride> map6) {
        new C$$AutoValue_InteractiveMoments(str, playerControls, uiDefinition, commonMetaData, arrayList, stateHistory, snapshots, map, map2, map3, map4, str2, str3, map5, map6) { // from class: com.netflix.model.leafs.originals.interactive.$AutoValue_InteractiveMoments

            /* renamed from: com.netflix.model.leafs.originals.interactive.$AutoValue_InteractiveMoments$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<InteractiveMoments> {
                private final TypeAdapter<String> audioLocaleAdapter;
                private final TypeAdapter<Map<String, ChoiceMapOverride>> choiceMapOverridesAdapter;
                private final TypeAdapter<CommonMetaData> commonMetadataAdapter;
                private final TypeAdapter<Map<String, Moment>> momentsByIdAdapter;
                private final TypeAdapter<Map<String, List<Moment>>> momentsBySegmentAdapter;
                private final TypeAdapter<PlayerControls> playerControlsAdapter;
                private final TypeAdapter<Map<String, Condition>> preconditionsAdapter;
                private final TypeAdapter<ArrayList<String>> segmentHistoryAdapter;
                private final TypeAdapter<Map<String, List<SegmentStateItem>>> segmentStateAdapter;
                private final TypeAdapter<StateHistory> stateHistoryAdapter;
                private final TypeAdapter<String> typeAdapter;
                private final TypeAdapter<UiDefinition> uiDefinitionAdapter;
                private final TypeAdapter<String> versionAdapter;
                private String defaultType = null;
                private PlayerControls defaultPlayerControls = null;
                private UiDefinition defaultUiDefinition = null;
                private CommonMetaData defaultCommonMetadata = null;
                private ArrayList<String> defaultSegmentHistory = null;
                private StateHistory defaultStateHistory = null;
                private Snapshots defaultSnapshots = null;
                private Map<String, List<Moment>> defaultMomentsBySegment = null;
                private Map<String, Moment> defaultMomentsById = null;
                private Map<String, List<SegmentStateItem>> defaultSegmentState = null;
                private Map<String, Condition> defaultPreconditions = null;
                private String defaultAudioLocale = null;
                private String defaultVersion = null;
                private Map<String, List<BaseGroupItem>> defaultSegmentGroups = null;
                private Map<String, ChoiceMapOverride> defaultChoiceMapOverrides = null;
                private final TypeAdapter<Snapshots> snapshotsAdapter = new SnapshotAdapter();
                private final TypeAdapter<Map<String, List<BaseGroupItem>>> segmentGroupsAdapter = new GroupsAdapter.SegmentGroupsAdapter();

                public GsonTypeAdapter setDefaultAudioLocale(String str) {
                    this.defaultAudioLocale = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultChoiceMapOverrides(Map<String, ChoiceMapOverride> map) {
                    this.defaultChoiceMapOverrides = map;
                    return this;
                }

                public GsonTypeAdapter setDefaultCommonMetadata(CommonMetaData commonMetaData) {
                    this.defaultCommonMetadata = commonMetaData;
                    return this;
                }

                public GsonTypeAdapter setDefaultMomentsById(Map<String, Moment> map) {
                    this.defaultMomentsById = map;
                    return this;
                }

                public GsonTypeAdapter setDefaultMomentsBySegment(Map<String, List<Moment>> map) {
                    this.defaultMomentsBySegment = map;
                    return this;
                }

                public GsonTypeAdapter setDefaultPlayerControls(PlayerControls playerControls) {
                    this.defaultPlayerControls = playerControls;
                    return this;
                }

                public GsonTypeAdapter setDefaultPreconditions(Map<String, Condition> map) {
                    this.defaultPreconditions = map;
                    return this;
                }

                public GsonTypeAdapter setDefaultSegmentGroups(Map<String, List<BaseGroupItem>> map) {
                    this.defaultSegmentGroups = map;
                    return this;
                }

                public GsonTypeAdapter setDefaultSegmentHistory(ArrayList<String> arrayList) {
                    this.defaultSegmentHistory = arrayList;
                    return this;
                }

                public GsonTypeAdapter setDefaultSegmentState(Map<String, List<SegmentStateItem>> map) {
                    this.defaultSegmentState = map;
                    return this;
                }

                public GsonTypeAdapter setDefaultSnapshots(Snapshots snapshots) {
                    this.defaultSnapshots = snapshots;
                    return this;
                }

                public GsonTypeAdapter setDefaultStateHistory(StateHistory stateHistory) {
                    this.defaultStateHistory = stateHistory;
                    return this;
                }

                public GsonTypeAdapter setDefaultType(String str) {
                    this.defaultType = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultUiDefinition(UiDefinition uiDefinition) {
                    this.defaultUiDefinition = uiDefinition;
                    return this;
                }

                public GsonTypeAdapter setDefaultVersion(String str) {
                    this.defaultVersion = str;
                    return this;
                }

                public GsonTypeAdapter(Gson gson) {
                    this.typeAdapter = gson.getAdapter(String.class);
                    this.playerControlsAdapter = gson.getAdapter(PlayerControls.class);
                    this.uiDefinitionAdapter = gson.getAdapter(UiDefinition.class);
                    this.commonMetadataAdapter = gson.getAdapter(CommonMetaData.class);
                    this.segmentHistoryAdapter = gson.getAdapter(TypeToken.getParameterized(ArrayList.class, String.class));
                    this.stateHistoryAdapter = gson.getAdapter(StateHistory.class);
                    this.momentsBySegmentAdapter = gson.getAdapter(TypeToken.getParameterized(Map.class, String.class, TypeToken.getParameterized(List.class, Moment.class).getType()));
                    this.momentsByIdAdapter = gson.getAdapter(TypeToken.getParameterized(Map.class, String.class, Moment.class));
                    this.segmentStateAdapter = gson.getAdapter(TypeToken.getParameterized(Map.class, String.class, TypeToken.getParameterized(List.class, SegmentStateItem.class).getType()));
                    this.preconditionsAdapter = gson.getAdapter(TypeToken.getParameterized(Map.class, String.class, Condition.class));
                    this.audioLocaleAdapter = gson.getAdapter(String.class);
                    this.versionAdapter = gson.getAdapter(String.class);
                    this.choiceMapOverridesAdapter = gson.getAdapter(TypeToken.getParameterized(Map.class, String.class, ChoiceMapOverride.class));
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, InteractiveMoments interactiveMoments) {
                    if (interactiveMoments == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("type");
                    this.typeAdapter.write(jsonWriter, interactiveMoments.type());
                    jsonWriter.name("playerControls");
                    this.playerControlsAdapter.write(jsonWriter, interactiveMoments.playerControls());
                    jsonWriter.name("uiDefinition");
                    this.uiDefinitionAdapter.write(jsonWriter, interactiveMoments.uiDefinition());
                    jsonWriter.name("commonMetadata");
                    this.commonMetadataAdapter.write(jsonWriter, interactiveMoments.commonMetadata());
                    jsonWriter.name("segmentHistory");
                    this.segmentHistoryAdapter.write(jsonWriter, interactiveMoments.segmentHistory());
                    jsonWriter.name("stateHistory");
                    this.stateHistoryAdapter.write(jsonWriter, interactiveMoments.stateHistory());
                    jsonWriter.name("snapshots");
                    this.snapshotsAdapter.write(jsonWriter, interactiveMoments.snapshots());
                    jsonWriter.name("momentsBySegment");
                    this.momentsBySegmentAdapter.write(jsonWriter, interactiveMoments.momentsBySegment());
                    jsonWriter.name("momentsById");
                    this.momentsByIdAdapter.write(jsonWriter, interactiveMoments.momentsById());
                    jsonWriter.name("segmentState");
                    this.segmentStateAdapter.write(jsonWriter, interactiveMoments.segmentState());
                    jsonWriter.name("preconditions");
                    this.preconditionsAdapter.write(jsonWriter, interactiveMoments.preconditions());
                    jsonWriter.name("audioLocale");
                    this.audioLocaleAdapter.write(jsonWriter, interactiveMoments.audioLocale());
                    jsonWriter.name("version");
                    this.versionAdapter.write(jsonWriter, interactiveMoments.version());
                    jsonWriter.name("segmentGroups");
                    this.segmentGroupsAdapter.write(jsonWriter, interactiveMoments.segmentGroups());
                    jsonWriter.name("choiceMapOverrides");
                    this.choiceMapOverridesAdapter.write(jsonWriter, interactiveMoments.choiceMapOverrides());
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.gson.TypeAdapter
                public InteractiveMoments read(JsonReader jsonReader) {
                    char c;
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                        return null;
                    }
                    jsonReader.beginObject();
                    String str = this.defaultType;
                    PlayerControls playerControls = this.defaultPlayerControls;
                    UiDefinition uiDefinition = this.defaultUiDefinition;
                    CommonMetaData commonMetaData = this.defaultCommonMetadata;
                    ArrayList<String> arrayList = this.defaultSegmentHistory;
                    StateHistory stateHistory = this.defaultStateHistory;
                    Snapshots snapshots = this.defaultSnapshots;
                    Map<String, List<Moment>> map = this.defaultMomentsBySegment;
                    Map<String, Moment> map2 = this.defaultMomentsById;
                    Map<String, List<SegmentStateItem>> map3 = this.defaultSegmentState;
                    Map<String, Condition> map4 = this.defaultPreconditions;
                    String str2 = this.defaultAudioLocale;
                    String str3 = this.defaultVersion;
                    Map<String, List<BaseGroupItem>> map5 = this.defaultSegmentGroups;
                    Map<String, ChoiceMapOverride> map6 = this.defaultChoiceMapOverrides;
                    PlayerControls playerControls2 = playerControls;
                    UiDefinition uiDefinition2 = uiDefinition;
                    CommonMetaData commonMetaData2 = commonMetaData;
                    ArrayList<String> arrayList2 = arrayList;
                    StateHistory stateHistory2 = stateHistory;
                    Snapshots snapshots2 = snapshots;
                    Map<String, List<Moment>> map7 = map;
                    Map<String, Moment> map8 = map2;
                    Map<String, List<SegmentStateItem>> map9 = map3;
                    Map<String, Condition> map10 = map4;
                    String str4 = str2;
                    String str5 = str3;
                    Map<String, List<BaseGroupItem>> map11 = map5;
                    String str6 = str;
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        if (jsonReader.peek() == JsonToken.NULL) {
                            jsonReader.nextNull();
                        } else {
                            nextName.hashCode();
                            switch (nextName.hashCode()) {
                                case -1292766489:
                                    if (nextName.equals("segmentGroups")) {
                                        c = 0;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -887658388:
                                    if (nextName.equals("choiceMapOverrides")) {
                                        c = 1;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -799475961:
                                    if (nextName.equals("uiDefinition")) {
                                        c = 2;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -787550751:
                                    if (nextName.equals("segmentHistory")) {
                                        c = 3;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -180167255:
                                    if (nextName.equals("momentsBySegment")) {
                                        c = 4;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -175760155:
                                    if (nextName.equals("momentsById")) {
                                        c = 5;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -102764998:
                                    if (nextName.equals("commonMetadata")) {
                                        c = 6;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 3575610:
                                    if (nextName.equals("type")) {
                                        c = 7;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 70898871:
                                    if (nextName.equals("playerControls")) {
                                        c = '\b';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 236838352:
                                    if (nextName.equals("audioLocale")) {
                                        c = '\t';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 241165103:
                                    if (nextName.equals("snapshots")) {
                                        c = '\n';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 351608024:
                                    if (nextName.equals("version")) {
                                        c = 11;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 523615518:
                                    if (nextName.equals("segmentState")) {
                                        c = '\f';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1100194499:
                                    if (nextName.equals("stateHistory")) {
                                        c = '\r';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1294809499:
                                    if (nextName.equals("preconditions")) {
                                        c = 14;
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
                                    map11 = this.segmentGroupsAdapter.read(jsonReader);
                                    continue;
                                case 1:
                                    map6 = this.choiceMapOverridesAdapter.read(jsonReader);
                                    continue;
                                case 2:
                                    uiDefinition2 = this.uiDefinitionAdapter.read(jsonReader);
                                    continue;
                                case 3:
                                    arrayList2 = this.segmentHistoryAdapter.read(jsonReader);
                                    continue;
                                case 4:
                                    map7 = this.momentsBySegmentAdapter.read(jsonReader);
                                    continue;
                                case 5:
                                    map8 = this.momentsByIdAdapter.read(jsonReader);
                                    continue;
                                case 6:
                                    commonMetaData2 = this.commonMetadataAdapter.read(jsonReader);
                                    continue;
                                case 7:
                                    str6 = this.typeAdapter.read(jsonReader);
                                    continue;
                                case '\b':
                                    playerControls2 = this.playerControlsAdapter.read(jsonReader);
                                    continue;
                                case '\t':
                                    str4 = this.audioLocaleAdapter.read(jsonReader);
                                    continue;
                                case '\n':
                                    snapshots2 = this.snapshotsAdapter.read(jsonReader);
                                    continue;
                                case 11:
                                    str5 = this.versionAdapter.read(jsonReader);
                                    continue;
                                case '\f':
                                    map9 = this.segmentStateAdapter.read(jsonReader);
                                    continue;
                                case '\r':
                                    stateHistory2 = this.stateHistoryAdapter.read(jsonReader);
                                    continue;
                                case 14:
                                    map10 = this.preconditionsAdapter.read(jsonReader);
                                    continue;
                                default:
                                    jsonReader.skipValue();
                                    continue;
                            }
                        }
                    }
                    jsonReader.endObject();
                    return new AutoValue_InteractiveMoments(str6, playerControls2, uiDefinition2, commonMetaData2, arrayList2, stateHistory2, snapshots2, map7, map8, map9, map10, str4, str5, map11, map6);
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (type() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(type());
        }
        parcel.writeParcelable(playerControls(), i);
        parcel.writeParcelable(uiDefinition(), i);
        parcel.writeParcelable(commonMetadata(), i);
        parcel.writeList(segmentHistory());
        parcel.writeParcelable(stateHistory(), i);
        parcel.writeList(snapshots());
        parcel.writeMap(momentsBySegment());
        parcel.writeMap(momentsById());
        parcel.writeMap(segmentState());
        parcel.writeMap(preconditions());
        if (audioLocale() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(audioLocale());
        }
        if (version() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(version());
        }
        parcel.writeMap(segmentGroups());
        parcel.writeMap(choiceMapOverrides());
    }
}
