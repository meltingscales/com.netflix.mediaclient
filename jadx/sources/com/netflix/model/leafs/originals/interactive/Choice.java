package com.netflix.model.leafs.originals.interactive;

import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.netflix.model.leafs.originals.interactive.C$$$AutoValue_Choice;
import com.netflix.model.leafs.originals.interactive.C$$AutoValue_Choice_ChoiceAction;
import com.netflix.model.leafs.originals.interactive.C$AutoValue_Choice;
import com.netflix.model.leafs.originals.interactive.C$AutoValue_Choice_ChoiceAction;
import com.netflix.model.leafs.originals.interactive.C$AutoValue_Choice_ChoiceOverride;
import com.netflix.model.leafs.originals.interactive.template.ImageElement;
import java.util.List;

/* loaded from: classes.dex */
public abstract class Choice implements Parcelable {
    public boolean isDefaultChoice = false;
    public boolean isEnabled = true;

    /* loaded from: classes.dex */
    public static abstract class Builder {
        public abstract Choice build();

        public abstract Builder setAccessibilityDescription(String str);

        public abstract Builder setAction(ChoiceAction choiceAction);

        public abstract Builder setBackground(ImageElement imageElement);

        public abstract Builder setChoiceSegmentId(String str);

        public abstract Builder setCode(String str);

        public abstract Builder setDefaultData(Choice choice);

        public abstract Builder setForeground(ImageElement imageElement);

        public abstract Builder setIcon(ImageElement imageElement);

        public abstract Builder setId(String str);

        public abstract Builder setImage(ImageAssetId imageAssetId);

        public abstract Builder setImpressionData(ImpressionData impressionData);

        public abstract Builder setOptionType(String str);

        public abstract Builder setOverrides(List<ChoiceOverride> list);

        public abstract Builder setPreconditionId(String str);

        public abstract Builder setPreviewImage(ImageElement imageElement);

        public abstract Builder setSegmentGroup(String str);

        public abstract Builder setStartTimeMs(long j);

        public abstract Builder setSubText(String str);

        public abstract Builder setText(String str);

        public abstract Builder setTrackingInfo(TrackingInfo trackingInfo);
    }

    public abstract String accessibilityDescription();

    public abstract ChoiceAction action();

    public abstract ImageElement background();

    /* JADX INFO: Access modifiers changed from: package-private */
    @SerializedName("segmentId")
    public abstract String choiceSegmentId();

    public abstract String code();

    @SerializedName("default")
    public abstract Choice defaultData();

    public abstract ImageElement foreground();

    public abstract ImageElement icon();

    public abstract String id();

    public abstract ImageAssetId image();

    public abstract ImpressionData impressionData();

    public abstract String optionType();

    public abstract List<ChoiceOverride> overrides();

    public abstract String preconditionId();

    public abstract ImageElement previewImage();

    @SerializedName("sg")
    public abstract String segmentGroup();

    public abstract long startTimeMs();

    public abstract String subText();

    public abstract String text();

    public abstract Builder toBuilder();

    public abstract TrackingInfo trackingInfo();

    public String segmentId() {
        String segmentId;
        String choiceSegmentId = choiceSegmentId();
        ChoiceAction action = action();
        return (action == null || (segmentId = action.segmentId()) == null) ? choiceSegmentId : segmentId;
    }

    public static Builder builder() {
        return new C$$$AutoValue_Choice.Builder();
    }

    public static TypeAdapter<Choice> typeAdapter(Gson gson) {
        return new C$AutoValue_Choice.GsonTypeAdapter(gson).setDefaultId("").setDefaultStartTimeMs(0L);
    }

    public Choice merge(Choice choice) {
        Builder builder = toBuilder();
        if (choice == null) {
            return builder.build();
        }
        if (id() == null) {
            builder.setId(choice.id());
        }
        if (choiceSegmentId() == null) {
            builder.setChoiceSegmentId(choice.choiceSegmentId());
        }
        if (segmentGroup() == null) {
            builder.setSegmentGroup(choice.segmentGroup());
        }
        if (startTimeMs() <= 0) {
            builder.setStartTimeMs(choice.startTimeMs());
        }
        if (text() == null) {
            builder.setText(choice.text());
        }
        if (subText() == null) {
            builder.setSubText(choice.subText());
        }
        if (accessibilityDescription() == null) {
            builder.setAccessibilityDescription(choice.accessibilityDescription());
        }
        if (image() == null) {
            builder.setImage(choice.image());
        }
        if (code() == null) {
            builder.setCode(choice.code());
        }
        if (action() == null) {
            builder.setAction(choice.action());
        }
        if (trackingInfo() == null) {
            builder.setTrackingInfo(choice.trackingInfo());
        }
        if (impressionData() == null) {
            builder.setImpressionData(choice.impressionData());
        }
        if (optionType() == null) {
            builder.setOptionType(choice.optionType());
        }
        if (preconditionId() == null) {
            builder.setPreconditionId(choice.preconditionId());
        }
        if (background() == null) {
            builder.setBackground(choice.background());
        }
        if (foreground() == null) {
            builder.setForeground(choice.foreground());
        }
        if (icon() == null) {
            builder.setIcon(choice.icon());
        }
        if (previewImage() == null) {
            builder.setPreviewImage(choice.previewImage());
        }
        if (defaultData() == null) {
            builder.setDefaultData(choice.defaultData());
        }
        if (overrides() == null) {
            builder.setOverrides(choice.overrides());
        }
        return builder.build();
    }

    /* loaded from: classes.dex */
    public static abstract class ChoiceAction implements Parcelable {

        /* loaded from: classes.dex */
        public static abstract class Builder {
            public abstract ChoiceAction build();

            public abstract Builder setAncestorId(String str);

            public abstract Builder setBookmarkPosition(Float f);

            public abstract Builder setMomentsIntent(String str);

            public abstract Builder setRequestId(String str);

            public abstract Builder setSegmentId(String str);

            public abstract Builder setSourceOfPlay(String str);

            public abstract Builder setStartTimeMs(Long l);

            public abstract Builder setTrackId(Integer num);

            public abstract Builder setType(String str);

            public abstract Builder setUiLabel(String str);

            public abstract Builder setVideoId(String str);
        }

        public abstract String ancestorId();

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract Float bookmarkPosition();

        public abstract String momentsIntent();

        public abstract String requestId();

        public abstract String segmentId();

        public abstract String sourceOfPlay();

        public abstract Long startTimeMs();

        public abstract Builder toBuilder();

        public abstract Integer trackId();

        public abstract String type();

        public abstract String uiLabel();

        public abstract String videoId();

        public Long bookmarkPositionMs() {
            Float bookmarkPosition = bookmarkPosition();
            return Long.valueOf(bookmarkPosition == null ? -1L : bookmarkPosition.floatValue() * 1000.0f);
        }

        public static Builder builder() {
            return new C$$AutoValue_Choice_ChoiceAction.Builder();
        }

        public static TypeAdapter<ChoiceAction> typeAdapter(Gson gson) {
            return new C$AutoValue_Choice_ChoiceAction.GsonTypeAdapter(gson).setDefaultType("").setDefaultUiLabel("branching");
        }
    }

    /* loaded from: classes.dex */
    public static abstract class ChoiceOverride implements Parcelable {
        public abstract Choice data();

        public abstract String preconditionId();

        public static TypeAdapter<ChoiceOverride> typeAdapter(Gson gson) {
            return new C$AutoValue_Choice_ChoiceOverride.GsonTypeAdapter(gson);
        }
    }
}
