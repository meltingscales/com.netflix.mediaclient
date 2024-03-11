package com.netflix.model.leafs.originals.interactive;

import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.netflix.model.leafs.originals.interactive.C$$$AutoValue_Moment;
import com.netflix.model.leafs.originals.interactive.C$AutoValue_Moment;
import com.netflix.model.leafs.originals.interactive.C$AutoValue_Moment_MomentOverride;
import com.netflix.model.leafs.originals.interactive.C$AutoValue_Moment_TimeoutSegment;
import com.netflix.model.leafs.originals.interactive.condition.Condition;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.C8168dfL;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class Moment implements Parcelable {
    public static final long INVALID_TIME_MS = -1;
    private String mType = null;
    private String mSubType = null;

    /* loaded from: classes.dex */
    public static abstract class Builder {
        public abstract Builder accessibilityDescription(String str);

        public abstract Builder action(Action action);

        public abstract Builder activationWindow(List<Long> list);

        public abstract Builder answerSequence(List<Integer> list);

        public abstract Builder assetManifest(AssetManifest assetManifest);

        public abstract Builder bodyText(String str);

        public abstract Moment build();

        public abstract Builder choices(List<Choice> list);

        public abstract Builder config(InteractiveSceneConfig interactiveSceneConfig);

        public abstract Builder correctIndex(Integer num);

        public abstract Builder correctInput(List<Integer> list);

        public abstract Builder counterValue(String str);

        public abstract Builder defaultChoiceIndex(Integer num);

        public abstract Builder endMs(Long l);

        public abstract Builder ftueText(String str);

        public abstract Builder headerImage(ImageAssetId imageAssetId);

        public abstract Builder headerText(String str);

        public abstract Builder id(String str);

        public abstract Builder image(ImageAssetId imageAssetId);

        public abstract Builder impressionData(ImpressionData impressionData);

        public abstract Builder interactiveStrings(StringsObject stringsObject);

        public abstract Builder isFallbackTutorial(boolean z);

        public abstract Builder layoutType(String str);

        public abstract Builder momentType(String str);

        public abstract Builder nextSegmentId(String str);

        public abstract Builder overrides(List<MomentOverride> list);

        public abstract Builder precondition(Condition condition);

        public abstract Builder preconditionId(String str);

        public abstract Builder preconditionTokens(Map<String, String> map);

        public abstract Builder questions(List<Moment> list);

        public abstract Builder startMs(Long l);

        public abstract Builder text(String str);

        public abstract Builder timeoutSegment(TimeoutSegment timeoutSegment);

        public abstract Builder toastText(String str);

        public abstract Builder tokenizedTrackingInfo(TrackingInfo trackingInfo);

        public abstract Builder trackingInfo(TrackingInfo trackingInfo);

        public abstract Builder uiDisplayMS(Long l);

        public abstract Builder uiHideMS(Long l);

        public abstract Builder unlockCharImage(ImageAssetId imageAssetId);
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface InteractiveIntent {
        public static final String DUBS_SUBS_CHANGE = "dubs_subs_change";
        public static final String MOMENT_REFRESH = "moment_refresh";
        public static final String NEW_SESSION = "new_session";
        public static final String PLAYBACK_START = "playback_start";
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface TYPE {
        public static final String NOTIFICATION = "notification";
        public static final String SCENE = "scene";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract String accessibilityDescription();

    public abstract Action action();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract List<Long> activationWindow();

    public abstract List<Integer> answerSequence();

    public abstract AssetManifest assetManifest();

    public abstract String bodyText();

    public abstract List<Choice> choices();

    public abstract InteractiveSceneConfig config();

    public abstract Integer correctIndex();

    public abstract List<Integer> correctInput();

    public abstract String counterValue();

    public abstract Integer defaultChoiceIndex();

    public abstract Long endMs();

    @Deprecated
    public abstract String ftueText();

    public abstract ImageAssetId headerImage();

    public abstract String headerText();

    public abstract String id();

    public abstract ImageAssetId image();

    public abstract ImpressionData impressionData();

    @SerializedName("strings")
    public abstract StringsObject interactiveStrings();

    public abstract boolean isFallbackTutorial();

    public abstract String layoutType();

    /* JADX INFO: Access modifiers changed from: package-private */
    @SerializedName("type")
    public abstract String momentType();

    public abstract String nextSegmentId();

    public abstract List<MomentOverride> overrides();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract Condition precondition();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract String preconditionId();

    public abstract Map<String, String> preconditionTokens();

    public abstract List<Moment> questions();

    public abstract Long startMs();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract String text();

    @SerializedName("timeoutSegment")
    public abstract TimeoutSegment timeoutSegment();

    public abstract Builder toBuilder();

    public abstract String toastText();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract TrackingInfo tokenizedTrackingInfo();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract TrackingInfo trackingInfo();

    public abstract Long uiDisplayMS();

    public abstract Long uiHideMS();

    public abstract ImageAssetId unlockCharImage();

    public String type() {
        if (this.mType == null) {
            setMomentType();
        }
        return this.mType;
    }

    public String subType() {
        if (this.mSubType == null) {
            setMomentType();
        }
        return this.mSubType;
    }

    @Deprecated
    public boolean isInterstitialPostPlay() {
        InteractiveSceneConfig config = config();
        return config != null && config.isInterstitialPostplay();
    }

    private void setMomentType() {
        String str;
        synchronized (this) {
            String momentType = momentType();
            if (momentType != null) {
                String[] split = momentType.split(":");
                this.mSubType = split.length > 1 ? split[1] : "";
                str = split.length > 0 ? split[0] : "";
            } else {
                this.mSubType = "";
                str = "";
            }
            this.mType = str;
        }
    }

    public TrackingInfo trackingInfo(InteractiveMoments interactiveMoments) {
        return tokenizedTrackingInfo(interactiveMoments);
    }

    public boolean evaluatePreConditions(InteractiveMoments interactiveMoments) {
        if (interactiveMoments != null) {
            Condition precondition = precondition();
            if (precondition == null) {
                precondition = interactiveMoments.preconditions().get(preconditionId());
            }
            if (precondition != null) {
                return precondition.meetsCondition(interactiveMoments);
            }
            return true;
        }
        return true;
    }

    public String text(InteractiveMoments interactiveMoments) {
        return getTokenizedString(interactiveMoments, text());
    }

    public String accessibilityDescription(InteractiveMoments interactiveMoments) {
        return getTokenizedString(interactiveMoments, accessibilityDescription());
    }

    private String getTokenizedString(InteractiveMoments interactiveMoments, String str) {
        JsonElement value;
        String asString;
        if (interactiveMoments != null && str != null) {
            Map<String, String> preconditionTokens = preconditionTokens();
            if (C8168dfL.h(str) && preconditionTokens != null && !preconditionTokens.isEmpty()) {
                for (Map.Entry<String, String> entry : preconditionTokens.entrySet()) {
                    Condition condition = interactiveMoments.preconditions().get(entry.getKey());
                    if (condition != null && (value = condition.getValue(interactiveMoments)) != null && value.isJsonPrimitive()) {
                        if (value.getAsJsonPrimitive().isNumber()) {
                            asString = String.valueOf(value.getAsJsonPrimitive().getAsInt());
                        } else {
                            asString = value.getAsJsonPrimitive().getAsString();
                        }
                        str = str.replace(entry.getValue(), asString);
                    }
                }
            }
        }
        return str;
    }

    public boolean isFakeChoicePoint() {
        List<Choice> choices = choices();
        if (choices != null) {
            for (Choice choice : choices) {
                if (choice != null && (choice.segmentId() != null || choice.segmentGroup() != null)) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    public boolean isInWindow(long j) {
        List<Long> activationWindow = activationWindow();
        return (activationWindow == null || activationWindow.size() != 2) ? j >= startMs().longValue() && j < endMs().longValue() : j >= activationWindow.get(0).longValue() && j < activationWindow.get(1).longValue();
    }

    TrackingInfo tokenizedTrackingInfo(InteractiveMoments interactiveMoments) {
        TrackingInfo trackingInfo = tokenizedTrackingInfo();
        if (trackingInfo != null) {
            try {
                JSONObject copyValues = trackingInfo.copyValues(new JSONObject());
                JSONObject jSONObject = new JSONObject();
                Iterator keys = copyValues.keys();
                while (keys.hasNext()) {
                    String str = (String) keys.next();
                    Object obj = copyValues.get(str);
                    if (obj instanceof String) {
                        jSONObject.put(str, getTokenizedString(interactiveMoments, (String) obj));
                    } else {
                        jSONObject.put(str, obj);
                    }
                }
                TrackingInfo trackingInfo2 = trackingInfo();
                if (trackingInfo2 != null) {
                    return new TrackingInfo(trackingInfo2.copyValues(jSONObject));
                }
                return new TrackingInfo(jSONObject);
            } catch (JSONException unused) {
                return trackingInfo;
            }
        }
        return trackingInfo();
    }

    /* loaded from: classes.dex */
    public static abstract class TimeoutSegment implements Parcelable {
        private boolean seenTimeoutSegment = false;

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract String segmentId();

        public String getTimeoutSegmentId() {
            if (this.seenTimeoutSegment) {
                return null;
            }
            this.seenTimeoutSegment = true;
            return segmentId();
        }

        public static TypeAdapter<TimeoutSegment> typeAdapter(Gson gson) {
            return new C$AutoValue_Moment_TimeoutSegment.GsonTypeAdapter(gson);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class MomentOverride implements Parcelable {
        public abstract Moment data();

        public abstract String preconditionId();

        public static TypeAdapter<MomentOverride> typeAdapter(Gson gson) {
            return new C$AutoValue_Moment_MomentOverride.GsonTypeAdapter(gson);
        }
    }

    public Moment merge(Moment moment) {
        Builder builder = toBuilder();
        if (moment == null) {
            return builder.build();
        }
        if (id() == null || id().equals("")) {
            builder.id(moment.id());
        }
        if (startMs() == null || startMs().longValue() == -1) {
            builder.startMs(moment.startMs());
        }
        if (endMs() == null || endMs().longValue() == -1) {
            builder.endMs(moment.endMs());
        }
        if (moment.assetManifest() != null) {
            if (assetManifest() != null) {
                builder.assetManifest(assetManifest().merge(moment.assetManifest()));
            } else {
                builder.assetManifest(moment.assetManifest());
            }
        }
        if (momentType() == null || momentType().isEmpty()) {
            builder.momentType(moment.momentType());
        }
        builder.isFallbackTutorial(moment.isFallbackTutorial());
        if (action() == null) {
            builder.action(moment.action());
        }
        if (layoutType() == null) {
            builder.layoutType(moment.layoutType());
        }
        if (uiDisplayMS() == null || uiDisplayMS().longValue() == -1) {
            builder.uiDisplayMS(moment.uiDisplayMS());
        }
        if (uiHideMS() == null || uiHideMS().longValue() == -1) {
            builder.uiHideMS(moment.uiHideMS());
        }
        if (defaultChoiceIndex() == null) {
            if (moment.defaultChoiceIndex() == null) {
                builder.defaultChoiceIndex(0);
            } else {
                builder.defaultChoiceIndex(moment.defaultChoiceIndex());
            }
        }
        if (choices() == null) {
            builder.choices(moment.choices());
        }
        if (questions() == null) {
            builder.questions(moment.questions());
        }
        if (config() == null) {
            builder.config(moment.config());
        }
        if (trackingInfo() == null) {
            builder.trackingInfo(moment.trackingInfo());
        } else if (moment.trackingInfo() != null) {
            builder.trackingInfo(moment.trackingInfo().merge(trackingInfo()));
        }
        if (timeoutSegment() == null) {
            builder.timeoutSegment(moment.timeoutSegment());
        }
        if (headerText() == null) {
            builder.headerText(moment.headerText());
        }
        if (counterValue() == null) {
            builder.counterValue(moment.counterValue());
        }
        if (image() == null) {
            builder.image(moment.image());
        }
        if (bodyText() == null) {
            builder.bodyText(moment.bodyText());
        }
        if (nextSegmentId() == null) {
            builder.nextSegmentId(moment.nextSegmentId());
        }
        if (precondition() == null) {
            builder.precondition(moment.precondition());
        }
        if (preconditionId() == null) {
            builder.preconditionId(moment.preconditionId());
        }
        if (ftueText() == null) {
            builder.ftueText(moment.ftueText());
        }
        if (toastText() == null) {
            builder.toastText(moment.toastText());
        }
        if (text() == null) {
            builder.text(moment.text());
        }
        if (preconditionTokens() == null) {
            builder.preconditionTokens(moment.preconditionTokens());
        }
        if (impressionData() == null) {
            builder.impressionData(moment.impressionData());
        }
        if (activationWindow() == null) {
            builder.activationWindow(moment.activationWindow());
        }
        if (answerSequence() == null) {
            builder.answerSequence(moment.answerSequence());
        }
        if (headerImage() == null) {
            builder.headerImage(moment.headerImage());
        }
        if (moment.interactiveStrings() != null) {
            if (interactiveStrings() != null) {
                builder.interactiveStrings(moment.interactiveStrings().merge(interactiveStrings()));
            } else {
                builder.interactiveStrings(moment.interactiveStrings());
            }
        }
        if (unlockCharImage() == null) {
            builder.unlockCharImage(moment.unlockCharImage());
        }
        if (tokenizedTrackingInfo() == null) {
            builder.tokenizedTrackingInfo(moment.tokenizedTrackingInfo());
        }
        if (correctIndex() == null) {
            builder.correctIndex(moment.correctIndex());
        }
        if (correctInput() == null) {
            builder.correctInput(moment.correctInput());
        }
        return builder.build();
    }

    public static TypeAdapter<Moment> typeAdapter(Gson gson) {
        return new C$AutoValue_Moment.GsonTypeAdapter(gson).setDefaultId("").setDefaultUiDisplayMS(-1L).setDefaultUiHideMS(-1L).setDefaultStartMs(-1L).setDefaultEndMs(-1L).setDefaultDefaultChoiceIndex(0).setDefaultIsFallbackTutorial(false).setDefaultConfig(InteractiveSceneConfig.emptyConfig());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Moment) {
            Moment moment = (Moment) obj;
            String momentType = momentType();
            Action action = action();
            String layoutType = layoutType();
            if (id().equals(moment.id()) && startMs().equals(moment.startMs()) && endMs().equals(moment.endMs()) && (momentType != null ? momentType.equals(moment.momentType()) : moment.momentType() == null) && (action != null ? action.equals(moment.action()) : moment.action() == null)) {
                if (layoutType == null) {
                    if (moment.layoutType() == null) {
                        return true;
                    }
                } else if (layoutType.equals(moment.layoutType())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        String momentType = momentType();
        Action action = action();
        String layoutType = layoutType();
        int hashCode = id().hashCode();
        int hashCode2 = startMs().hashCode();
        int hashCode3 = endMs().hashCode();
        int hashCode4 = momentType == null ? 0 : momentType.hashCode();
        return ((((hashCode4 ^ ((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003)) * 1000003) ^ (action == null ? 0 : action.hashCode())) * 1000003) ^ (layoutType != null ? layoutType.hashCode() : 0);
    }

    public static Builder builder() {
        return new C$$$AutoValue_Moment.Builder();
    }
}
