package com.netflix.model.leafs.originals.interactive;

import com.google.gson.annotations.SerializedName;
import com.netflix.model.leafs.originals.interactive.Choice;
import com.netflix.model.leafs.originals.interactive.template.ImageElement;
import java.util.List;

/* renamed from: com.netflix.model.leafs.originals.interactive.$$$AutoValue_Choice  reason: invalid class name */
/* loaded from: classes.dex */
abstract class C$$$AutoValue_Choice extends Choice {
    private final String accessibilityDescription;
    private final Choice.ChoiceAction action;
    private final ImageElement background;
    private final String choiceSegmentId;
    private final String code;
    private final Choice defaultData;
    private final ImageElement foreground;
    private final ImageElement icon;
    private final String id;
    private final ImageAssetId image;
    private final ImpressionData impressionData;
    private final String optionType;
    private final List<Choice.ChoiceOverride> overrides;
    private final String preconditionId;
    private final ImageElement previewImage;
    private final String segmentGroup;
    private final long startTimeMs;
    private final String subText;
    private final String text;
    private final TrackingInfo trackingInfo;

    @Override // com.netflix.model.leafs.originals.interactive.Choice
    public String accessibilityDescription() {
        return this.accessibilityDescription;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Choice
    public Choice.ChoiceAction action() {
        return this.action;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Choice
    public ImageElement background() {
        return this.background;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.netflix.model.leafs.originals.interactive.Choice
    @SerializedName("segmentId")
    public String choiceSegmentId() {
        return this.choiceSegmentId;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Choice
    public String code() {
        return this.code;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Choice
    @SerializedName("default")
    public Choice defaultData() {
        return this.defaultData;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Choice
    public ImageElement foreground() {
        return this.foreground;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Choice
    public ImageElement icon() {
        return this.icon;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Choice
    public String id() {
        return this.id;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Choice
    public ImageAssetId image() {
        return this.image;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Choice
    public ImpressionData impressionData() {
        return this.impressionData;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Choice
    public String optionType() {
        return this.optionType;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Choice
    public List<Choice.ChoiceOverride> overrides() {
        return this.overrides;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Choice
    public String preconditionId() {
        return this.preconditionId;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Choice
    public ImageElement previewImage() {
        return this.previewImage;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Choice
    @SerializedName("sg")
    public String segmentGroup() {
        return this.segmentGroup;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Choice
    public long startTimeMs() {
        return this.startTimeMs;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Choice
    public String subText() {
        return this.subText;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Choice
    public String text() {
        return this.text;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Choice
    public TrackingInfo trackingInfo() {
        return this.trackingInfo;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$$AutoValue_Choice(String str, String str2, String str3, long j, String str4, String str5, String str6, String str7, String str8, Choice.ChoiceAction choiceAction, TrackingInfo trackingInfo, ImpressionData impressionData, String str9, ImageAssetId imageAssetId, ImageElement imageElement, ImageElement imageElement2, ImageElement imageElement3, ImageElement imageElement4, Choice choice, List<Choice.ChoiceOverride> list) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.id = str;
        this.choiceSegmentId = str2;
        this.segmentGroup = str3;
        this.startTimeMs = j;
        this.text = str4;
        this.subText = str5;
        this.accessibilityDescription = str6;
        this.optionType = str7;
        this.code = str8;
        this.action = choiceAction;
        this.trackingInfo = trackingInfo;
        this.impressionData = impressionData;
        this.preconditionId = str9;
        this.image = imageAssetId;
        this.background = imageElement;
        this.previewImage = imageElement2;
        this.icon = imageElement3;
        this.foreground = imageElement4;
        this.defaultData = choice;
        this.overrides = list;
    }

    public String toString() {
        return "Choice{id=" + this.id + ", choiceSegmentId=" + this.choiceSegmentId + ", segmentGroup=" + this.segmentGroup + ", startTimeMs=" + this.startTimeMs + ", text=" + this.text + ", subText=" + this.subText + ", accessibilityDescription=" + this.accessibilityDescription + ", optionType=" + this.optionType + ", code=" + this.code + ", action=" + this.action + ", trackingInfo=" + this.trackingInfo + ", impressionData=" + this.impressionData + ", preconditionId=" + this.preconditionId + ", image=" + this.image + ", background=" + this.background + ", previewImage=" + this.previewImage + ", icon=" + this.icon + ", foreground=" + this.foreground + ", defaultData=" + this.defaultData + ", overrides=" + this.overrides + "}";
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        Choice.ChoiceAction choiceAction;
        TrackingInfo trackingInfo;
        ImpressionData impressionData;
        String str8;
        ImageAssetId imageAssetId;
        ImageElement imageElement;
        ImageElement imageElement2;
        ImageElement imageElement3;
        ImageElement imageElement4;
        Choice choice;
        if (obj == this) {
            return true;
        }
        if (obj instanceof Choice) {
            Choice choice2 = (Choice) obj;
            if (this.id.equals(choice2.id()) && ((str = this.choiceSegmentId) != null ? str.equals(choice2.choiceSegmentId()) : choice2.choiceSegmentId() == null) && ((str2 = this.segmentGroup) != null ? str2.equals(choice2.segmentGroup()) : choice2.segmentGroup() == null) && this.startTimeMs == choice2.startTimeMs() && ((str3 = this.text) != null ? str3.equals(choice2.text()) : choice2.text() == null) && ((str4 = this.subText) != null ? str4.equals(choice2.subText()) : choice2.subText() == null) && ((str5 = this.accessibilityDescription) != null ? str5.equals(choice2.accessibilityDescription()) : choice2.accessibilityDescription() == null) && ((str6 = this.optionType) != null ? str6.equals(choice2.optionType()) : choice2.optionType() == null) && ((str7 = this.code) != null ? str7.equals(choice2.code()) : choice2.code() == null) && ((choiceAction = this.action) != null ? choiceAction.equals(choice2.action()) : choice2.action() == null) && ((trackingInfo = this.trackingInfo) != null ? trackingInfo.equals(choice2.trackingInfo()) : choice2.trackingInfo() == null) && ((impressionData = this.impressionData) != null ? impressionData.equals(choice2.impressionData()) : choice2.impressionData() == null) && ((str8 = this.preconditionId) != null ? str8.equals(choice2.preconditionId()) : choice2.preconditionId() == null) && ((imageAssetId = this.image) != null ? imageAssetId.equals(choice2.image()) : choice2.image() == null) && ((imageElement = this.background) != null ? imageElement.equals(choice2.background()) : choice2.background() == null) && ((imageElement2 = this.previewImage) != null ? imageElement2.equals(choice2.previewImage()) : choice2.previewImage() == null) && ((imageElement3 = this.icon) != null ? imageElement3.equals(choice2.icon()) : choice2.icon() == null) && ((imageElement4 = this.foreground) != null ? imageElement4.equals(choice2.foreground()) : choice2.foreground() == null) && ((choice = this.defaultData) != null ? choice.equals(choice2.defaultData()) : choice2.defaultData() == null)) {
                List<Choice.ChoiceOverride> list = this.overrides;
                if (list == null) {
                    if (choice2.overrides() == null) {
                        return true;
                    }
                } else if (list.equals(choice2.overrides())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.id.hashCode();
        String str = this.choiceSegmentId;
        int hashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.segmentGroup;
        int hashCode3 = str2 == null ? 0 : str2.hashCode();
        long j = this.startTimeMs;
        int i = (int) (j ^ (j >>> 32));
        String str3 = this.text;
        int hashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.subText;
        int hashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.accessibilityDescription;
        int hashCode6 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.optionType;
        int hashCode7 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.code;
        int hashCode8 = str7 == null ? 0 : str7.hashCode();
        Choice.ChoiceAction choiceAction = this.action;
        int hashCode9 = choiceAction == null ? 0 : choiceAction.hashCode();
        TrackingInfo trackingInfo = this.trackingInfo;
        int hashCode10 = trackingInfo == null ? 0 : trackingInfo.hashCode();
        ImpressionData impressionData = this.impressionData;
        int hashCode11 = impressionData == null ? 0 : impressionData.hashCode();
        String str8 = this.preconditionId;
        int hashCode12 = str8 == null ? 0 : str8.hashCode();
        ImageAssetId imageAssetId = this.image;
        int hashCode13 = imageAssetId == null ? 0 : imageAssetId.hashCode();
        ImageElement imageElement = this.background;
        int hashCode14 = imageElement == null ? 0 : imageElement.hashCode();
        ImageElement imageElement2 = this.previewImage;
        int hashCode15 = imageElement2 == null ? 0 : imageElement2.hashCode();
        ImageElement imageElement3 = this.icon;
        int hashCode16 = imageElement3 == null ? 0 : imageElement3.hashCode();
        ImageElement imageElement4 = this.foreground;
        int hashCode17 = imageElement4 == null ? 0 : imageElement4.hashCode();
        Choice choice = this.defaultData;
        int hashCode18 = choice == null ? 0 : choice.hashCode();
        List<Choice.ChoiceOverride> list = this.overrides;
        return ((((((((((((((((((((((((((((((((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ i) * 1000003) ^ hashCode4) * 1000003) ^ hashCode5) * 1000003) ^ hashCode6) * 1000003) ^ hashCode7) * 1000003) ^ hashCode8) * 1000003) ^ hashCode9) * 1000003) ^ hashCode10) * 1000003) ^ hashCode11) * 1000003) ^ hashCode12) * 1000003) ^ hashCode13) * 1000003) ^ hashCode14) * 1000003) ^ hashCode15) * 1000003) ^ hashCode16) * 1000003) ^ hashCode17) * 1000003) ^ hashCode18) * 1000003) ^ (list == null ? 0 : list.hashCode());
    }

    @Override // com.netflix.model.leafs.originals.interactive.Choice
    public Choice.Builder toBuilder() {
        return new Builder(this);
    }

    /* renamed from: com.netflix.model.leafs.originals.interactive.$$$AutoValue_Choice$Builder */
    /* loaded from: classes.dex */
    static final class Builder extends Choice.Builder {
        private String accessibilityDescription;
        private Choice.ChoiceAction action;
        private ImageElement background;
        private String choiceSegmentId;
        private String code;
        private Choice defaultData;
        private ImageElement foreground;
        private ImageElement icon;
        private String id;
        private ImageAssetId image;
        private ImpressionData impressionData;
        private String optionType;
        private List<Choice.ChoiceOverride> overrides;
        private String preconditionId;
        private ImageElement previewImage;
        private String segmentGroup;
        private Long startTimeMs;
        private String subText;
        private String text;
        private TrackingInfo trackingInfo;

        @Override // com.netflix.model.leafs.originals.interactive.Choice.Builder
        public Choice.Builder setAccessibilityDescription(String str) {
            this.accessibilityDescription = str;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.Choice.Builder
        public Choice.Builder setAction(Choice.ChoiceAction choiceAction) {
            this.action = choiceAction;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.Choice.Builder
        public Choice.Builder setBackground(ImageElement imageElement) {
            this.background = imageElement;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.Choice.Builder
        public Choice.Builder setChoiceSegmentId(String str) {
            this.choiceSegmentId = str;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.Choice.Builder
        public Choice.Builder setCode(String str) {
            this.code = str;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.Choice.Builder
        public Choice.Builder setDefaultData(Choice choice) {
            this.defaultData = choice;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.Choice.Builder
        public Choice.Builder setForeground(ImageElement imageElement) {
            this.foreground = imageElement;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.Choice.Builder
        public Choice.Builder setIcon(ImageElement imageElement) {
            this.icon = imageElement;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.Choice.Builder
        public Choice.Builder setImage(ImageAssetId imageAssetId) {
            this.image = imageAssetId;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.Choice.Builder
        public Choice.Builder setImpressionData(ImpressionData impressionData) {
            this.impressionData = impressionData;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.Choice.Builder
        public Choice.Builder setOptionType(String str) {
            this.optionType = str;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.Choice.Builder
        public Choice.Builder setOverrides(List<Choice.ChoiceOverride> list) {
            this.overrides = list;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.Choice.Builder
        public Choice.Builder setPreconditionId(String str) {
            this.preconditionId = str;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.Choice.Builder
        public Choice.Builder setPreviewImage(ImageElement imageElement) {
            this.previewImage = imageElement;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.Choice.Builder
        public Choice.Builder setSegmentGroup(String str) {
            this.segmentGroup = str;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.Choice.Builder
        public Choice.Builder setSubText(String str) {
            this.subText = str;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.Choice.Builder
        public Choice.Builder setText(String str) {
            this.text = str;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.Choice.Builder
        public Choice.Builder setTrackingInfo(TrackingInfo trackingInfo) {
            this.trackingInfo = trackingInfo;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Builder() {
        }

        private Builder(Choice choice) {
            this.id = choice.id();
            this.choiceSegmentId = choice.choiceSegmentId();
            this.segmentGroup = choice.segmentGroup();
            this.startTimeMs = Long.valueOf(choice.startTimeMs());
            this.text = choice.text();
            this.subText = choice.subText();
            this.accessibilityDescription = choice.accessibilityDescription();
            this.optionType = choice.optionType();
            this.code = choice.code();
            this.action = choice.action();
            this.trackingInfo = choice.trackingInfo();
            this.impressionData = choice.impressionData();
            this.preconditionId = choice.preconditionId();
            this.image = choice.image();
            this.background = choice.background();
            this.previewImage = choice.previewImage();
            this.icon = choice.icon();
            this.foreground = choice.foreground();
            this.defaultData = choice.defaultData();
            this.overrides = choice.overrides();
        }

        @Override // com.netflix.model.leafs.originals.interactive.Choice.Builder
        public Choice.Builder setId(String str) {
            if (str != null) {
                this.id = str;
                return this;
            }
            throw new NullPointerException("Null id");
        }

        @Override // com.netflix.model.leafs.originals.interactive.Choice.Builder
        public Choice.Builder setStartTimeMs(long j) {
            this.startTimeMs = Long.valueOf(j);
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.Choice.Builder
        public Choice build() {
            String str = "";
            if (this.id == null) {
                str = " id";
            }
            if (this.startTimeMs == null) {
                str = str + " startTimeMs";
            }
            if (!str.isEmpty()) {
                throw new IllegalStateException("Missing required properties:" + str);
            }
            return new AutoValue_Choice(this.id, this.choiceSegmentId, this.segmentGroup, this.startTimeMs.longValue(), this.text, this.subText, this.accessibilityDescription, this.optionType, this.code, this.action, this.trackingInfo, this.impressionData, this.preconditionId, this.image, this.background, this.previewImage, this.icon, this.foreground, this.defaultData, this.overrides);
        }
    }
}
