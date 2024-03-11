package com.netflix.model.leafs.originals.interactive;

import com.google.gson.annotations.SerializedName;
import com.netflix.model.leafs.originals.interactive.Moment;
import com.netflix.model.leafs.originals.interactive.condition.Condition;
import java.util.List;
import java.util.Map;

/* renamed from: com.netflix.model.leafs.originals.interactive.$$$AutoValue_Moment  reason: invalid class name */
/* loaded from: classes.dex */
abstract class C$$$AutoValue_Moment extends Moment {
    private final String accessibilityDescription;
    private final Action action;
    private final List<Long> activationWindow;
    private final List<Integer> answerSequence;
    private final AssetManifest assetManifest;
    private final String bodyText;
    private final List<Choice> choices;
    private final InteractiveSceneConfig config;
    private final Integer correctIndex;
    private final List<Integer> correctInput;
    private final String counterValue;
    private final Integer defaultChoiceIndex;
    private final Long endMs;
    private final String ftueText;
    private final ImageAssetId headerImage;
    private final String headerText;
    private final String id;
    private final ImageAssetId image;
    private final ImpressionData impressionData;
    private final StringsObject interactiveStrings;
    private final boolean isFallbackTutorial;
    private final String layoutType;
    private final String momentType;
    private final String nextSegmentId;
    private final List<Moment.MomentOverride> overrides;
    private final Condition precondition;
    private final String preconditionId;
    private final Map<String, String> preconditionTokens;
    private final List<Moment> questions;
    private final Long startMs;
    private final String text;
    private final Moment.TimeoutSegment timeoutSegment;
    private final String toastText;
    private final TrackingInfo tokenizedTrackingInfo;
    private final TrackingInfo trackingInfo;
    private final Long uiDisplayMS;
    private final Long uiHideMS;
    private final ImageAssetId unlockCharImage;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.netflix.model.leafs.originals.interactive.Moment
    public String accessibilityDescription() {
        return this.accessibilityDescription;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Moment
    public Action action() {
        return this.action;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.netflix.model.leafs.originals.interactive.Moment
    public List<Long> activationWindow() {
        return this.activationWindow;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Moment
    public List<Integer> answerSequence() {
        return this.answerSequence;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Moment
    public AssetManifest assetManifest() {
        return this.assetManifest;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Moment
    public String bodyText() {
        return this.bodyText;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Moment
    public List<Choice> choices() {
        return this.choices;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Moment
    public InteractiveSceneConfig config() {
        return this.config;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Moment
    public Integer correctIndex() {
        return this.correctIndex;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Moment
    public List<Integer> correctInput() {
        return this.correctInput;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Moment
    public String counterValue() {
        return this.counterValue;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Moment
    public Integer defaultChoiceIndex() {
        return this.defaultChoiceIndex;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Moment
    public Long endMs() {
        return this.endMs;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Moment
    @Deprecated
    public String ftueText() {
        return this.ftueText;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Moment
    public ImageAssetId headerImage() {
        return this.headerImage;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Moment
    public String headerText() {
        return this.headerText;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Moment
    public String id() {
        return this.id;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Moment
    public ImageAssetId image() {
        return this.image;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Moment
    public ImpressionData impressionData() {
        return this.impressionData;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Moment
    @SerializedName("strings")
    public StringsObject interactiveStrings() {
        return this.interactiveStrings;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Moment
    public boolean isFallbackTutorial() {
        return this.isFallbackTutorial;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Moment
    public String layoutType() {
        return this.layoutType;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.netflix.model.leafs.originals.interactive.Moment
    @SerializedName("type")
    public String momentType() {
        return this.momentType;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Moment
    public String nextSegmentId() {
        return this.nextSegmentId;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Moment
    public List<Moment.MomentOverride> overrides() {
        return this.overrides;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.netflix.model.leafs.originals.interactive.Moment
    public Condition precondition() {
        return this.precondition;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.netflix.model.leafs.originals.interactive.Moment
    public String preconditionId() {
        return this.preconditionId;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Moment
    public Map<String, String> preconditionTokens() {
        return this.preconditionTokens;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Moment
    public List<Moment> questions() {
        return this.questions;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Moment
    public Long startMs() {
        return this.startMs;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.netflix.model.leafs.originals.interactive.Moment
    public String text() {
        return this.text;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Moment
    @SerializedName("timeoutSegment")
    public Moment.TimeoutSegment timeoutSegment() {
        return this.timeoutSegment;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Moment
    public String toastText() {
        return this.toastText;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.netflix.model.leafs.originals.interactive.Moment
    public TrackingInfo tokenizedTrackingInfo() {
        return this.tokenizedTrackingInfo;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.netflix.model.leafs.originals.interactive.Moment
    public TrackingInfo trackingInfo() {
        return this.trackingInfo;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Moment
    public Long uiDisplayMS() {
        return this.uiDisplayMS;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Moment
    public Long uiHideMS() {
        return this.uiHideMS;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Moment
    public ImageAssetId unlockCharImage() {
        return this.unlockCharImage;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$$AutoValue_Moment(String str, Long l, Long l2, AssetManifest assetManifest, String str2, boolean z, Action action, String str3, Long l3, Long l4, Integer num, List<Choice> list, List<Moment> list2, InteractiveSceneConfig interactiveSceneConfig, TrackingInfo trackingInfo, Moment.TimeoutSegment timeoutSegment, String str4, String str5, ImageAssetId imageAssetId, String str6, String str7, Condition condition, String str8, String str9, String str10, String str11, Map<String, String> map, String str12, ImpressionData impressionData, List<Long> list3, List<Integer> list4, ImageAssetId imageAssetId2, StringsObject stringsObject, ImageAssetId imageAssetId3, Integer num2, List<Integer> list5, TrackingInfo trackingInfo2, List<Moment.MomentOverride> list6) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.id = str;
        if (l == null) {
            throw new NullPointerException("Null startMs");
        }
        this.startMs = l;
        if (l2 == null) {
            throw new NullPointerException("Null endMs");
        }
        this.endMs = l2;
        this.assetManifest = assetManifest;
        this.momentType = str2;
        this.isFallbackTutorial = z;
        this.action = action;
        this.layoutType = str3;
        if (l3 == null) {
            throw new NullPointerException("Null uiDisplayMS");
        }
        this.uiDisplayMS = l3;
        if (l4 == null) {
            throw new NullPointerException("Null uiHideMS");
        }
        this.uiHideMS = l4;
        if (num == null) {
            throw new NullPointerException("Null defaultChoiceIndex");
        }
        this.defaultChoiceIndex = num;
        this.choices = list;
        this.questions = list2;
        this.config = interactiveSceneConfig;
        this.trackingInfo = trackingInfo;
        this.timeoutSegment = timeoutSegment;
        this.headerText = str4;
        this.counterValue = str5;
        this.image = imageAssetId;
        this.bodyText = str6;
        this.nextSegmentId = str7;
        this.precondition = condition;
        this.preconditionId = str8;
        this.ftueText = str9;
        this.toastText = str10;
        this.text = str11;
        this.preconditionTokens = map;
        this.accessibilityDescription = str12;
        this.impressionData = impressionData;
        this.activationWindow = list3;
        this.answerSequence = list4;
        this.headerImage = imageAssetId2;
        this.interactiveStrings = stringsObject;
        this.unlockCharImage = imageAssetId3;
        this.correctIndex = num2;
        this.correctInput = list5;
        this.tokenizedTrackingInfo = trackingInfo2;
        this.overrides = list6;
    }

    public String toString() {
        return "Moment{id=" + this.id + ", startMs=" + this.startMs + ", endMs=" + this.endMs + ", assetManifest=" + this.assetManifest + ", momentType=" + this.momentType + ", isFallbackTutorial=" + this.isFallbackTutorial + ", action=" + this.action + ", layoutType=" + this.layoutType + ", uiDisplayMS=" + this.uiDisplayMS + ", uiHideMS=" + this.uiHideMS + ", defaultChoiceIndex=" + this.defaultChoiceIndex + ", choices=" + this.choices + ", questions=" + this.questions + ", config=" + this.config + ", trackingInfo=" + this.trackingInfo + ", timeoutSegment=" + this.timeoutSegment + ", headerText=" + this.headerText + ", counterValue=" + this.counterValue + ", image=" + this.image + ", bodyText=" + this.bodyText + ", nextSegmentId=" + this.nextSegmentId + ", precondition=" + this.precondition + ", preconditionId=" + this.preconditionId + ", ftueText=" + this.ftueText + ", toastText=" + this.toastText + ", text=" + this.text + ", preconditionTokens=" + this.preconditionTokens + ", accessibilityDescription=" + this.accessibilityDescription + ", impressionData=" + this.impressionData + ", activationWindow=" + this.activationWindow + ", answerSequence=" + this.answerSequence + ", headerImage=" + this.headerImage + ", interactiveStrings=" + this.interactiveStrings + ", unlockCharImage=" + this.unlockCharImage + ", correctIndex=" + this.correctIndex + ", correctInput=" + this.correctInput + ", tokenizedTrackingInfo=" + this.tokenizedTrackingInfo + ", overrides=" + this.overrides + "}";
    }

    @Override // com.netflix.model.leafs.originals.interactive.Moment
    public Moment.Builder toBuilder() {
        return new Builder(this);
    }

    /* renamed from: com.netflix.model.leafs.originals.interactive.$$$AutoValue_Moment$Builder */
    /* loaded from: classes.dex */
    static final class Builder extends Moment.Builder {
        private String accessibilityDescription;
        private Action action;
        private List<Long> activationWindow;
        private List<Integer> answerSequence;
        private AssetManifest assetManifest;
        private String bodyText;
        private List<Choice> choices;
        private InteractiveSceneConfig config;
        private Integer correctIndex;
        private List<Integer> correctInput;
        private String counterValue;
        private Integer defaultChoiceIndex;
        private Long endMs;
        private String ftueText;
        private ImageAssetId headerImage;
        private String headerText;
        private String id;
        private ImageAssetId image;
        private ImpressionData impressionData;
        private StringsObject interactiveStrings;
        private Boolean isFallbackTutorial;
        private String layoutType;
        private String momentType;
        private String nextSegmentId;
        private List<Moment.MomentOverride> overrides;
        private Condition precondition;
        private String preconditionId;
        private Map<String, String> preconditionTokens;
        private List<Moment> questions;
        private Long startMs;
        private String text;
        private Moment.TimeoutSegment timeoutSegment;
        private String toastText;
        private TrackingInfo tokenizedTrackingInfo;
        private TrackingInfo trackingInfo;
        private Long uiDisplayMS;
        private Long uiHideMS;
        private ImageAssetId unlockCharImage;

        @Override // com.netflix.model.leafs.originals.interactive.Moment.Builder
        public Moment.Builder accessibilityDescription(String str) {
            this.accessibilityDescription = str;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.Moment.Builder
        public Moment.Builder action(Action action) {
            this.action = action;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.Moment.Builder
        public Moment.Builder activationWindow(List<Long> list) {
            this.activationWindow = list;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.Moment.Builder
        public Moment.Builder answerSequence(List<Integer> list) {
            this.answerSequence = list;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.Moment.Builder
        public Moment.Builder assetManifest(AssetManifest assetManifest) {
            this.assetManifest = assetManifest;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.Moment.Builder
        public Moment.Builder bodyText(String str) {
            this.bodyText = str;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.Moment.Builder
        public Moment.Builder choices(List<Choice> list) {
            this.choices = list;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.Moment.Builder
        public Moment.Builder config(InteractiveSceneConfig interactiveSceneConfig) {
            this.config = interactiveSceneConfig;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.Moment.Builder
        public Moment.Builder correctIndex(Integer num) {
            this.correctIndex = num;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.Moment.Builder
        public Moment.Builder correctInput(List<Integer> list) {
            this.correctInput = list;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.Moment.Builder
        public Moment.Builder counterValue(String str) {
            this.counterValue = str;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.Moment.Builder
        public Moment.Builder ftueText(String str) {
            this.ftueText = str;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.Moment.Builder
        public Moment.Builder headerImage(ImageAssetId imageAssetId) {
            this.headerImage = imageAssetId;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.Moment.Builder
        public Moment.Builder headerText(String str) {
            this.headerText = str;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.Moment.Builder
        public Moment.Builder image(ImageAssetId imageAssetId) {
            this.image = imageAssetId;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.Moment.Builder
        public Moment.Builder impressionData(ImpressionData impressionData) {
            this.impressionData = impressionData;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.Moment.Builder
        public Moment.Builder interactiveStrings(StringsObject stringsObject) {
            this.interactiveStrings = stringsObject;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.Moment.Builder
        public Moment.Builder layoutType(String str) {
            this.layoutType = str;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.Moment.Builder
        public Moment.Builder momentType(String str) {
            this.momentType = str;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.Moment.Builder
        public Moment.Builder nextSegmentId(String str) {
            this.nextSegmentId = str;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.Moment.Builder
        public Moment.Builder overrides(List<Moment.MomentOverride> list) {
            this.overrides = list;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.Moment.Builder
        public Moment.Builder precondition(Condition condition) {
            this.precondition = condition;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.Moment.Builder
        public Moment.Builder preconditionId(String str) {
            this.preconditionId = str;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.Moment.Builder
        public Moment.Builder preconditionTokens(Map<String, String> map) {
            this.preconditionTokens = map;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.Moment.Builder
        public Moment.Builder questions(List<Moment> list) {
            this.questions = list;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.Moment.Builder
        public Moment.Builder text(String str) {
            this.text = str;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.Moment.Builder
        public Moment.Builder timeoutSegment(Moment.TimeoutSegment timeoutSegment) {
            this.timeoutSegment = timeoutSegment;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.Moment.Builder
        public Moment.Builder toastText(String str) {
            this.toastText = str;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.Moment.Builder
        public Moment.Builder tokenizedTrackingInfo(TrackingInfo trackingInfo) {
            this.tokenizedTrackingInfo = trackingInfo;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.Moment.Builder
        public Moment.Builder trackingInfo(TrackingInfo trackingInfo) {
            this.trackingInfo = trackingInfo;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.Moment.Builder
        public Moment.Builder unlockCharImage(ImageAssetId imageAssetId) {
            this.unlockCharImage = imageAssetId;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Builder() {
        }

        private Builder(Moment moment) {
            this.id = moment.id();
            this.startMs = moment.startMs();
            this.endMs = moment.endMs();
            this.assetManifest = moment.assetManifest();
            this.momentType = moment.momentType();
            this.isFallbackTutorial = Boolean.valueOf(moment.isFallbackTutorial());
            this.action = moment.action();
            this.layoutType = moment.layoutType();
            this.uiDisplayMS = moment.uiDisplayMS();
            this.uiHideMS = moment.uiHideMS();
            this.defaultChoiceIndex = moment.defaultChoiceIndex();
            this.choices = moment.choices();
            this.questions = moment.questions();
            this.config = moment.config();
            this.trackingInfo = moment.trackingInfo();
            this.timeoutSegment = moment.timeoutSegment();
            this.headerText = moment.headerText();
            this.counterValue = moment.counterValue();
            this.image = moment.image();
            this.bodyText = moment.bodyText();
            this.nextSegmentId = moment.nextSegmentId();
            this.precondition = moment.precondition();
            this.preconditionId = moment.preconditionId();
            this.ftueText = moment.ftueText();
            this.toastText = moment.toastText();
            this.text = moment.text();
            this.preconditionTokens = moment.preconditionTokens();
            this.accessibilityDescription = moment.accessibilityDescription();
            this.impressionData = moment.impressionData();
            this.activationWindow = moment.activationWindow();
            this.answerSequence = moment.answerSequence();
            this.headerImage = moment.headerImage();
            this.interactiveStrings = moment.interactiveStrings();
            this.unlockCharImage = moment.unlockCharImage();
            this.correctIndex = moment.correctIndex();
            this.correctInput = moment.correctInput();
            this.tokenizedTrackingInfo = moment.tokenizedTrackingInfo();
            this.overrides = moment.overrides();
        }

        @Override // com.netflix.model.leafs.originals.interactive.Moment.Builder
        public Moment.Builder id(String str) {
            if (str != null) {
                this.id = str;
                return this;
            }
            throw new NullPointerException("Null id");
        }

        @Override // com.netflix.model.leafs.originals.interactive.Moment.Builder
        public Moment.Builder startMs(Long l) {
            if (l != null) {
                this.startMs = l;
                return this;
            }
            throw new NullPointerException("Null startMs");
        }

        @Override // com.netflix.model.leafs.originals.interactive.Moment.Builder
        public Moment.Builder endMs(Long l) {
            if (l != null) {
                this.endMs = l;
                return this;
            }
            throw new NullPointerException("Null endMs");
        }

        @Override // com.netflix.model.leafs.originals.interactive.Moment.Builder
        public Moment.Builder isFallbackTutorial(boolean z) {
            this.isFallbackTutorial = Boolean.valueOf(z);
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.Moment.Builder
        public Moment.Builder uiDisplayMS(Long l) {
            if (l != null) {
                this.uiDisplayMS = l;
                return this;
            }
            throw new NullPointerException("Null uiDisplayMS");
        }

        @Override // com.netflix.model.leafs.originals.interactive.Moment.Builder
        public Moment.Builder uiHideMS(Long l) {
            if (l != null) {
                this.uiHideMS = l;
                return this;
            }
            throw new NullPointerException("Null uiHideMS");
        }

        @Override // com.netflix.model.leafs.originals.interactive.Moment.Builder
        public Moment.Builder defaultChoiceIndex(Integer num) {
            if (num != null) {
                this.defaultChoiceIndex = num;
                return this;
            }
            throw new NullPointerException("Null defaultChoiceIndex");
        }

        @Override // com.netflix.model.leafs.originals.interactive.Moment.Builder
        public Moment build() {
            String str = "";
            if (this.id == null) {
                str = " id";
            }
            if (this.startMs == null) {
                str = str + " startMs";
            }
            if (this.endMs == null) {
                str = str + " endMs";
            }
            if (this.isFallbackTutorial == null) {
                str = str + " isFallbackTutorial";
            }
            if (this.uiDisplayMS == null) {
                str = str + " uiDisplayMS";
            }
            if (this.uiHideMS == null) {
                str = str + " uiHideMS";
            }
            if (this.defaultChoiceIndex == null) {
                str = str + " defaultChoiceIndex";
            }
            if (!str.isEmpty()) {
                throw new IllegalStateException("Missing required properties:" + str);
            }
            return new AutoValue_Moment(this.id, this.startMs, this.endMs, this.assetManifest, this.momentType, this.isFallbackTutorial.booleanValue(), this.action, this.layoutType, this.uiDisplayMS, this.uiHideMS, this.defaultChoiceIndex, this.choices, this.questions, this.config, this.trackingInfo, this.timeoutSegment, this.headerText, this.counterValue, this.image, this.bodyText, this.nextSegmentId, this.precondition, this.preconditionId, this.ftueText, this.toastText, this.text, this.preconditionTokens, this.accessibilityDescription, this.impressionData, this.activationWindow, this.answerSequence, this.headerImage, this.interactiveStrings, this.unlockCharImage, this.correctIndex, this.correctInput, this.tokenizedTrackingInfo, this.overrides);
        }
    }
}
