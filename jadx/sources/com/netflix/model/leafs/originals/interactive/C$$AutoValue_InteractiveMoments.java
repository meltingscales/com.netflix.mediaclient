package com.netflix.model.leafs.originals.interactive;

import com.netflix.model.leafs.originals.interactive.InteractiveMoments;
import com.netflix.model.leafs.originals.interactive.condition.Condition;
import com.netflix.model.leafs.originals.interactive.condition.Snapshots;
import com.netflix.model.leafs.originals.interactive.condition.StateHistory;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.netflix.model.leafs.originals.interactive.$$AutoValue_InteractiveMoments  reason: invalid class name */
/* loaded from: classes.dex */
abstract class C$$AutoValue_InteractiveMoments extends InteractiveMoments {
    private final String audioLocale;
    private final Map<String, ChoiceMapOverride> choiceMapOverrides;
    private final CommonMetaData commonMetadata;
    private final Map<String, Moment> momentsById;
    private final Map<String, List<Moment>> momentsBySegment;
    private final PlayerControls playerControls;
    private final Map<String, Condition> preconditions;
    private final Map<String, List<BaseGroupItem>> segmentGroups;
    private final ArrayList<String> segmentHistory;
    private final Map<String, List<SegmentStateItem>> segmentState;
    private final Snapshots snapshots;
    private final StateHistory stateHistory;
    private final String type;
    private final UiDefinition uiDefinition;
    private final String version;

    @Override // com.netflix.model.leafs.originals.interactive.InteractiveMoments
    public String audioLocale() {
        return this.audioLocale;
    }

    @Override // com.netflix.model.leafs.originals.interactive.InteractiveMoments
    public Map<String, ChoiceMapOverride> choiceMapOverrides() {
        return this.choiceMapOverrides;
    }

    @Override // com.netflix.model.leafs.originals.interactive.InteractiveMoments
    public CommonMetaData commonMetadata() {
        return this.commonMetadata;
    }

    @Override // com.netflix.model.leafs.originals.interactive.InteractiveMoments
    public Map<String, Moment> momentsById() {
        return this.momentsById;
    }

    @Override // com.netflix.model.leafs.originals.interactive.InteractiveMoments
    public Map<String, List<Moment>> momentsBySegment() {
        return this.momentsBySegment;
    }

    @Override // com.netflix.model.leafs.originals.interactive.InteractiveMoments
    public PlayerControls playerControls() {
        return this.playerControls;
    }

    @Override // com.netflix.model.leafs.originals.interactive.InteractiveMoments
    public Map<String, Condition> preconditions() {
        return this.preconditions;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.netflix.model.leafs.originals.interactive.InteractiveMoments
    public Map<String, List<BaseGroupItem>> segmentGroups() {
        return this.segmentGroups;
    }

    @Override // com.netflix.model.leafs.originals.interactive.InteractiveMoments
    public ArrayList<String> segmentHistory() {
        return this.segmentHistory;
    }

    @Override // com.netflix.model.leafs.originals.interactive.InteractiveMoments
    public Map<String, List<SegmentStateItem>> segmentState() {
        return this.segmentState;
    }

    @Override // com.netflix.model.leafs.originals.interactive.InteractiveMoments
    public Snapshots snapshots() {
        return this.snapshots;
    }

    @Override // com.netflix.model.leafs.originals.interactive.InteractiveMoments
    public StateHistory stateHistory() {
        return this.stateHistory;
    }

    @Override // com.netflix.model.leafs.originals.interactive.InteractiveMoments
    public String type() {
        return this.type;
    }

    @Override // com.netflix.model.leafs.originals.interactive.InteractiveMoments
    public UiDefinition uiDefinition() {
        return this.uiDefinition;
    }

    @Override // com.netflix.model.leafs.originals.interactive.InteractiveMoments
    public String version() {
        return this.version;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$AutoValue_InteractiveMoments(String str, PlayerControls playerControls, UiDefinition uiDefinition, CommonMetaData commonMetaData, ArrayList<String> arrayList, StateHistory stateHistory, Snapshots snapshots, Map<String, List<Moment>> map, Map<String, Moment> map2, Map<String, List<SegmentStateItem>> map3, Map<String, Condition> map4, String str2, String str3, Map<String, List<BaseGroupItem>> map5, Map<String, ChoiceMapOverride> map6) {
        this.type = str;
        this.playerControls = playerControls;
        this.uiDefinition = uiDefinition;
        this.commonMetadata = commonMetaData;
        if (arrayList == null) {
            throw new NullPointerException("Null segmentHistory");
        }
        this.segmentHistory = arrayList;
        if (stateHistory == null) {
            throw new NullPointerException("Null stateHistory");
        }
        this.stateHistory = stateHistory;
        if (snapshots == null) {
            throw new NullPointerException("Null snapshots");
        }
        this.snapshots = snapshots;
        if (map == null) {
            throw new NullPointerException("Null momentsBySegment");
        }
        this.momentsBySegment = map;
        this.momentsById = map2;
        if (map3 == null) {
            throw new NullPointerException("Null segmentState");
        }
        this.segmentState = map3;
        if (map4 == null) {
            throw new NullPointerException("Null preconditions");
        }
        this.preconditions = map4;
        this.audioLocale = str2;
        this.version = str3;
        if (map5 == null) {
            throw new NullPointerException("Null segmentGroups");
        }
        this.segmentGroups = map5;
        this.choiceMapOverrides = map6;
    }

    public String toString() {
        return "InteractiveMoments{type=" + this.type + ", playerControls=" + this.playerControls + ", uiDefinition=" + this.uiDefinition + ", commonMetadata=" + this.commonMetadata + ", segmentHistory=" + this.segmentHistory + ", stateHistory=" + this.stateHistory + ", snapshots=" + this.snapshots + ", momentsBySegment=" + this.momentsBySegment + ", momentsById=" + this.momentsById + ", segmentState=" + this.segmentState + ", preconditions=" + this.preconditions + ", audioLocale=" + this.audioLocale + ", version=" + this.version + ", segmentGroups=" + this.segmentGroups + ", choiceMapOverrides=" + this.choiceMapOverrides + "}";
    }

    public boolean equals(Object obj) {
        Map<String, Moment> map;
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof InteractiveMoments) {
            InteractiveMoments interactiveMoments = (InteractiveMoments) obj;
            String str3 = this.type;
            if (str3 != null ? str3.equals(interactiveMoments.type()) : interactiveMoments.type() == null) {
                PlayerControls playerControls = this.playerControls;
                if (playerControls != null ? playerControls.equals(interactiveMoments.playerControls()) : interactiveMoments.playerControls() == null) {
                    UiDefinition uiDefinition = this.uiDefinition;
                    if (uiDefinition != null ? uiDefinition.equals(interactiveMoments.uiDefinition()) : interactiveMoments.uiDefinition() == null) {
                        CommonMetaData commonMetaData = this.commonMetadata;
                        if (commonMetaData != null ? commonMetaData.equals(interactiveMoments.commonMetadata()) : interactiveMoments.commonMetadata() == null) {
                            if (this.segmentHistory.equals(interactiveMoments.segmentHistory()) && this.stateHistory.equals(interactiveMoments.stateHistory()) && this.snapshots.equals(interactiveMoments.snapshots()) && this.momentsBySegment.equals(interactiveMoments.momentsBySegment()) && ((map = this.momentsById) != null ? map.equals(interactiveMoments.momentsById()) : interactiveMoments.momentsById() == null) && this.segmentState.equals(interactiveMoments.segmentState()) && this.preconditions.equals(interactiveMoments.preconditions()) && ((str = this.audioLocale) != null ? str.equals(interactiveMoments.audioLocale()) : interactiveMoments.audioLocale() == null) && ((str2 = this.version) != null ? str2.equals(interactiveMoments.version()) : interactiveMoments.version() == null) && this.segmentGroups.equals(interactiveMoments.segmentGroups())) {
                                Map<String, ChoiceMapOverride> map2 = this.choiceMapOverrides;
                                if (map2 == null) {
                                    if (interactiveMoments.choiceMapOverrides() == null) {
                                        return true;
                                    }
                                } else if (map2.equals(interactiveMoments.choiceMapOverrides())) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        String str = this.type;
        int hashCode = str == null ? 0 : str.hashCode();
        PlayerControls playerControls = this.playerControls;
        int hashCode2 = playerControls == null ? 0 : playerControls.hashCode();
        UiDefinition uiDefinition = this.uiDefinition;
        int hashCode3 = uiDefinition == null ? 0 : uiDefinition.hashCode();
        CommonMetaData commonMetaData = this.commonMetadata;
        int hashCode4 = commonMetaData == null ? 0 : commonMetaData.hashCode();
        int hashCode5 = this.segmentHistory.hashCode();
        int hashCode6 = this.stateHistory.hashCode();
        int hashCode7 = this.snapshots.hashCode();
        int hashCode8 = this.momentsBySegment.hashCode();
        Map<String, Moment> map = this.momentsById;
        int hashCode9 = map == null ? 0 : map.hashCode();
        int hashCode10 = this.segmentState.hashCode();
        int hashCode11 = this.preconditions.hashCode();
        String str2 = this.audioLocale;
        int hashCode12 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.version;
        int hashCode13 = str3 == null ? 0 : str3.hashCode();
        int hashCode14 = this.segmentGroups.hashCode();
        Map<String, ChoiceMapOverride> map2 = this.choiceMapOverrides;
        return ((((((((((((((((((((((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ hashCode5) * 1000003) ^ hashCode6) * 1000003) ^ hashCode7) * 1000003) ^ hashCode8) * 1000003) ^ hashCode9) * 1000003) ^ hashCode10) * 1000003) ^ hashCode11) * 1000003) ^ hashCode12) * 1000003) ^ hashCode13) * 1000003) ^ hashCode14) * 1000003) ^ (map2 == null ? 0 : map2.hashCode());
    }

    @Override // com.netflix.model.leafs.originals.interactive.InteractiveMoments
    public InteractiveMoments.Builder toBuilder() {
        return new Builder(this);
    }

    /* renamed from: com.netflix.model.leafs.originals.interactive.$$AutoValue_InteractiveMoments$Builder */
    /* loaded from: classes.dex */
    static final class Builder extends InteractiveMoments.Builder {
        private String audioLocale;
        private Map<String, ChoiceMapOverride> choiceMapOverrides;
        private CommonMetaData commonMetadata;
        private Map<String, Moment> momentsById;
        private Map<String, List<Moment>> momentsBySegment;
        private PlayerControls playerControls;
        private Map<String, Condition> preconditions;
        private Map<String, List<BaseGroupItem>> segmentGroups;
        private ArrayList<String> segmentHistory;
        private Map<String, List<SegmentStateItem>> segmentState;
        private Snapshots snapshots;
        private StateHistory stateHistory;
        private String type;
        private UiDefinition uiDefinition;
        private String version;

        @Override // com.netflix.model.leafs.originals.interactive.InteractiveMoments.Builder
        public InteractiveMoments.Builder audioLocale(String str) {
            this.audioLocale = str;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.InteractiveMoments.Builder
        public InteractiveMoments.Builder choiceMapOverrides(Map<String, ChoiceMapOverride> map) {
            this.choiceMapOverrides = map;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.InteractiveMoments.Builder
        public InteractiveMoments.Builder commonMetadata(CommonMetaData commonMetaData) {
            this.commonMetadata = commonMetaData;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.InteractiveMoments.Builder
        public InteractiveMoments.Builder momentsById(Map<String, Moment> map) {
            this.momentsById = map;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.InteractiveMoments.Builder
        public InteractiveMoments.Builder playerControls(PlayerControls playerControls) {
            this.playerControls = playerControls;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.InteractiveMoments.Builder
        public InteractiveMoments.Builder type(String str) {
            this.type = str;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.InteractiveMoments.Builder
        public InteractiveMoments.Builder uiDefinition(UiDefinition uiDefinition) {
            this.uiDefinition = uiDefinition;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.InteractiveMoments.Builder
        public InteractiveMoments.Builder version(String str) {
            this.version = str;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Builder() {
        }

        private Builder(InteractiveMoments interactiveMoments) {
            this.type = interactiveMoments.type();
            this.playerControls = interactiveMoments.playerControls();
            this.uiDefinition = interactiveMoments.uiDefinition();
            this.commonMetadata = interactiveMoments.commonMetadata();
            this.segmentHistory = interactiveMoments.segmentHistory();
            this.stateHistory = interactiveMoments.stateHistory();
            this.snapshots = interactiveMoments.snapshots();
            this.momentsBySegment = interactiveMoments.momentsBySegment();
            this.momentsById = interactiveMoments.momentsById();
            this.segmentState = interactiveMoments.segmentState();
            this.preconditions = interactiveMoments.preconditions();
            this.audioLocale = interactiveMoments.audioLocale();
            this.version = interactiveMoments.version();
            this.segmentGroups = interactiveMoments.segmentGroups();
            this.choiceMapOverrides = interactiveMoments.choiceMapOverrides();
        }

        @Override // com.netflix.model.leafs.originals.interactive.InteractiveMoments.Builder
        public InteractiveMoments.Builder segmentHistory(ArrayList<String> arrayList) {
            if (arrayList != null) {
                this.segmentHistory = arrayList;
                return this;
            }
            throw new NullPointerException("Null segmentHistory");
        }

        @Override // com.netflix.model.leafs.originals.interactive.InteractiveMoments.Builder
        public InteractiveMoments.Builder stateHistory(StateHistory stateHistory) {
            if (stateHistory != null) {
                this.stateHistory = stateHistory;
                return this;
            }
            throw new NullPointerException("Null stateHistory");
        }

        @Override // com.netflix.model.leafs.originals.interactive.InteractiveMoments.Builder
        public InteractiveMoments.Builder snapshots(Snapshots snapshots) {
            if (snapshots != null) {
                this.snapshots = snapshots;
                return this;
            }
            throw new NullPointerException("Null snapshots");
        }

        @Override // com.netflix.model.leafs.originals.interactive.InteractiveMoments.Builder
        public InteractiveMoments.Builder momentsBySegment(Map<String, List<Moment>> map) {
            if (map != null) {
                this.momentsBySegment = map;
                return this;
            }
            throw new NullPointerException("Null momentsBySegment");
        }

        @Override // com.netflix.model.leafs.originals.interactive.InteractiveMoments.Builder
        public InteractiveMoments.Builder segmentState(Map<String, List<SegmentStateItem>> map) {
            if (map != null) {
                this.segmentState = map;
                return this;
            }
            throw new NullPointerException("Null segmentState");
        }

        @Override // com.netflix.model.leafs.originals.interactive.InteractiveMoments.Builder
        public InteractiveMoments.Builder preconditions(Map<String, Condition> map) {
            if (map != null) {
                this.preconditions = map;
                return this;
            }
            throw new NullPointerException("Null preconditions");
        }

        @Override // com.netflix.model.leafs.originals.interactive.InteractiveMoments.Builder
        public InteractiveMoments.Builder segmentGroups(Map<String, List<BaseGroupItem>> map) {
            if (map != null) {
                this.segmentGroups = map;
                return this;
            }
            throw new NullPointerException("Null segmentGroups");
        }

        @Override // com.netflix.model.leafs.originals.interactive.InteractiveMoments.Builder
        public InteractiveMoments build() {
            String str = "";
            if (this.segmentHistory == null) {
                str = " segmentHistory";
            }
            if (this.stateHistory == null) {
                str = str + " stateHistory";
            }
            if (this.snapshots == null) {
                str = str + " snapshots";
            }
            if (this.momentsBySegment == null) {
                str = str + " momentsBySegment";
            }
            if (this.segmentState == null) {
                str = str + " segmentState";
            }
            if (this.preconditions == null) {
                str = str + " preconditions";
            }
            if (this.segmentGroups == null) {
                str = str + " segmentGroups";
            }
            if (!str.isEmpty()) {
                throw new IllegalStateException("Missing required properties:" + str);
            }
            return new AutoValue_InteractiveMoments(this.type, this.playerControls, this.uiDefinition, this.commonMetadata, this.segmentHistory, this.stateHistory, this.snapshots, this.momentsBySegment, this.momentsById, this.segmentState, this.preconditions, this.audioLocale, this.version, this.segmentGroups, this.choiceMapOverrides);
        }
    }
}
