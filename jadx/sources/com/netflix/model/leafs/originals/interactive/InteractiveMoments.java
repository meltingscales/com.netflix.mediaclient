package com.netflix.model.leafs.originals.interactive;

import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.netflix.model.leafs.originals.interactive.C$$AutoValue_InteractiveMoments;
import com.netflix.model.leafs.originals.interactive.C$AutoValue_InteractiveMoments;
import com.netflix.model.leafs.originals.interactive.condition.Condition;
import com.netflix.model.leafs.originals.interactive.condition.Snapshots;
import com.netflix.model.leafs.originals.interactive.condition.State;
import com.netflix.model.leafs.originals.interactive.condition.StateHistory;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import o.C1332Xp;

/* loaded from: classes.dex */
public abstract class InteractiveMoments implements Parcelable {

    /* loaded from: classes.dex */
    public static abstract class Builder {
        public abstract Builder audioLocale(String str);

        public abstract InteractiveMoments build();

        public abstract Builder choiceMapOverrides(Map<String, ChoiceMapOverride> map);

        public abstract Builder commonMetadata(CommonMetaData commonMetaData);

        public abstract Builder momentsById(Map<String, Moment> map);

        public abstract Builder momentsBySegment(Map<String, List<Moment>> map);

        public abstract Builder playerControls(PlayerControls playerControls);

        public abstract Builder preconditions(Map<String, Condition> map);

        public abstract Builder segmentGroups(Map<String, List<BaseGroupItem>> map);

        public abstract Builder segmentHistory(ArrayList<String> arrayList);

        public abstract Builder segmentState(Map<String, List<SegmentStateItem>> map);

        public abstract Builder snapshots(Snapshots snapshots);

        public abstract Builder stateHistory(StateHistory stateHistory);

        public abstract Builder type(String str);

        public abstract Builder uiDefinition(UiDefinition uiDefinition);

        public abstract Builder version(String str);
    }

    public abstract String audioLocale();

    public abstract Map<String, ChoiceMapOverride> choiceMapOverrides();

    public abstract CommonMetaData commonMetadata();

    public abstract Map<String, Moment> momentsById();

    public abstract Map<String, List<Moment>> momentsBySegment();

    public abstract PlayerControls playerControls();

    public abstract Map<String, Condition> preconditions();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract Map<String, List<BaseGroupItem>> segmentGroups();

    public abstract ArrayList<String> segmentHistory();

    public abstract Map<String, List<SegmentStateItem>> segmentState();

    public abstract Snapshots snapshots();

    public abstract StateHistory stateHistory();

    public abstract Builder toBuilder();

    public abstract String type();

    public abstract UiDefinition uiDefinition();

    public abstract String version();

    public String getNextSegmentIdForCurrentSegment(String str) {
        List<BaseGroupItem> list = segmentGroups().get(str);
        if (list != null) {
            for (BaseGroupItem baseGroupItem : list) {
                String meetsConditions = baseGroupItem.meetsConditions(this);
                if (meetsConditions != null) {
                    return meetsConditions;
                }
            }
            return null;
        }
        return null;
    }

    public static Builder builder() {
        return new C$$AutoValue_InteractiveMoments.Builder();
    }

    public static TypeAdapter<InteractiveMoments> typeAdapter(Gson gson) {
        return new C$AutoValue_InteractiveMoments.GsonTypeAdapter(gson).setDefaultMomentsBySegment(Collections.emptyMap()).setDefaultSegmentHistory(new ArrayList<>()).setDefaultSnapshots(new Snapshots()).setDefaultStateHistory(StateHistory.create(new State(), new State())).setDefaultPreconditions(Collections.emptyMap()).setDefaultSegmentGroups(Collections.emptyMap()).setDefaultSegmentState(Collections.emptyMap());
    }

    public static InteractiveMoments fromJsonString(Reader reader) {
        return typeAdapter((Gson) C1332Xp.b(Gson.class)).fromJson(reader);
    }
}
