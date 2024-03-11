package com.netflix.model.leafs.originals.interactive;

import com.netflix.model.leafs.originals.interactive.Choice;

/* renamed from: com.netflix.model.leafs.originals.interactive.$$AutoValue_Choice_ChoiceAction  reason: invalid class name */
/* loaded from: classes.dex */
abstract class C$$AutoValue_Choice_ChoiceAction extends Choice.ChoiceAction {
    private final String ancestorId;
    private final Float bookmarkPosition;
    private final String momentsIntent;
    private final String requestId;
    private final String segmentId;
    private final String sourceOfPlay;
    private final Long startTimeMs;
    private final Integer trackId;
    private final String type;
    private final String uiLabel;
    private final String videoId;

    @Override // com.netflix.model.leafs.originals.interactive.Choice.ChoiceAction
    public String ancestorId() {
        return this.ancestorId;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.netflix.model.leafs.originals.interactive.Choice.ChoiceAction
    public Float bookmarkPosition() {
        return this.bookmarkPosition;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Choice.ChoiceAction
    public String momentsIntent() {
        return this.momentsIntent;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Choice.ChoiceAction
    public String requestId() {
        return this.requestId;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Choice.ChoiceAction
    public String segmentId() {
        return this.segmentId;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Choice.ChoiceAction
    public String sourceOfPlay() {
        return this.sourceOfPlay;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Choice.ChoiceAction
    public Long startTimeMs() {
        return this.startTimeMs;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Choice.ChoiceAction
    public Integer trackId() {
        return this.trackId;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Choice.ChoiceAction
    public String type() {
        return this.type;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Choice.ChoiceAction
    public String uiLabel() {
        return this.uiLabel;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Choice.ChoiceAction
    public String videoId() {
        return this.videoId;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$AutoValue_Choice_ChoiceAction(String str, String str2, Integer num, String str3, Float f, String str4, String str5, String str6, Long l, String str7, String str8) {
        if (str == null) {
            throw new NullPointerException("Null type");
        }
        this.type = str;
        this.videoId = str2;
        this.trackId = num;
        this.ancestorId = str3;
        this.bookmarkPosition = f;
        this.uiLabel = str4;
        this.sourceOfPlay = str5;
        this.segmentId = str6;
        this.startTimeMs = l;
        this.momentsIntent = str7;
        this.requestId = str8;
    }

    public String toString() {
        return "ChoiceAction{type=" + this.type + ", videoId=" + this.videoId + ", trackId=" + this.trackId + ", ancestorId=" + this.ancestorId + ", bookmarkPosition=" + this.bookmarkPosition + ", uiLabel=" + this.uiLabel + ", sourceOfPlay=" + this.sourceOfPlay + ", segmentId=" + this.segmentId + ", startTimeMs=" + this.startTimeMs + ", momentsIntent=" + this.momentsIntent + ", requestId=" + this.requestId + "}";
    }

    public boolean equals(Object obj) {
        String str;
        Integer num;
        String str2;
        Float f;
        String str3;
        String str4;
        String str5;
        Long l;
        String str6;
        if (obj == this) {
            return true;
        }
        if (obj instanceof Choice.ChoiceAction) {
            Choice.ChoiceAction choiceAction = (Choice.ChoiceAction) obj;
            if (this.type.equals(choiceAction.type()) && ((str = this.videoId) != null ? str.equals(choiceAction.videoId()) : choiceAction.videoId() == null) && ((num = this.trackId) != null ? num.equals(choiceAction.trackId()) : choiceAction.trackId() == null) && ((str2 = this.ancestorId) != null ? str2.equals(choiceAction.ancestorId()) : choiceAction.ancestorId() == null) && ((f = this.bookmarkPosition) != null ? f.equals(choiceAction.bookmarkPosition()) : choiceAction.bookmarkPosition() == null) && ((str3 = this.uiLabel) != null ? str3.equals(choiceAction.uiLabel()) : choiceAction.uiLabel() == null) && ((str4 = this.sourceOfPlay) != null ? str4.equals(choiceAction.sourceOfPlay()) : choiceAction.sourceOfPlay() == null) && ((str5 = this.segmentId) != null ? str5.equals(choiceAction.segmentId()) : choiceAction.segmentId() == null) && ((l = this.startTimeMs) != null ? l.equals(choiceAction.startTimeMs()) : choiceAction.startTimeMs() == null) && ((str6 = this.momentsIntent) != null ? str6.equals(choiceAction.momentsIntent()) : choiceAction.momentsIntent() == null)) {
                String str7 = this.requestId;
                if (str7 == null) {
                    if (choiceAction.requestId() == null) {
                        return true;
                    }
                } else if (str7.equals(choiceAction.requestId())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.type.hashCode();
        String str = this.videoId;
        int hashCode2 = str == null ? 0 : str.hashCode();
        Integer num = this.trackId;
        int hashCode3 = num == null ? 0 : num.hashCode();
        String str2 = this.ancestorId;
        int hashCode4 = str2 == null ? 0 : str2.hashCode();
        Float f = this.bookmarkPosition;
        int hashCode5 = f == null ? 0 : f.hashCode();
        String str3 = this.uiLabel;
        int hashCode6 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.sourceOfPlay;
        int hashCode7 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.segmentId;
        int hashCode8 = str5 == null ? 0 : str5.hashCode();
        Long l = this.startTimeMs;
        int hashCode9 = l == null ? 0 : l.hashCode();
        String str6 = this.momentsIntent;
        int hashCode10 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.requestId;
        return ((((((((((((((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ hashCode5) * 1000003) ^ hashCode6) * 1000003) ^ hashCode7) * 1000003) ^ hashCode8) * 1000003) ^ hashCode9) * 1000003) ^ hashCode10) * 1000003) ^ (str7 != null ? str7.hashCode() : 0);
    }

    @Override // com.netflix.model.leafs.originals.interactive.Choice.ChoiceAction
    public Choice.ChoiceAction.Builder toBuilder() {
        return new Builder(this);
    }

    /* renamed from: com.netflix.model.leafs.originals.interactive.$$AutoValue_Choice_ChoiceAction$Builder */
    /* loaded from: classes.dex */
    static final class Builder extends Choice.ChoiceAction.Builder {
        private String ancestorId;
        private Float bookmarkPosition;
        private String momentsIntent;
        private String requestId;
        private String segmentId;
        private String sourceOfPlay;
        private Long startTimeMs;
        private Integer trackId;
        private String type;
        private String uiLabel;
        private String videoId;

        @Override // com.netflix.model.leafs.originals.interactive.Choice.ChoiceAction.Builder
        public Choice.ChoiceAction.Builder setAncestorId(String str) {
            this.ancestorId = str;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.Choice.ChoiceAction.Builder
        public Choice.ChoiceAction.Builder setBookmarkPosition(Float f) {
            this.bookmarkPosition = f;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.Choice.ChoiceAction.Builder
        public Choice.ChoiceAction.Builder setMomentsIntent(String str) {
            this.momentsIntent = str;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.Choice.ChoiceAction.Builder
        public Choice.ChoiceAction.Builder setRequestId(String str) {
            this.requestId = str;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.Choice.ChoiceAction.Builder
        public Choice.ChoiceAction.Builder setSegmentId(String str) {
            this.segmentId = str;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.Choice.ChoiceAction.Builder
        public Choice.ChoiceAction.Builder setSourceOfPlay(String str) {
            this.sourceOfPlay = str;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.Choice.ChoiceAction.Builder
        public Choice.ChoiceAction.Builder setStartTimeMs(Long l) {
            this.startTimeMs = l;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.Choice.ChoiceAction.Builder
        public Choice.ChoiceAction.Builder setTrackId(Integer num) {
            this.trackId = num;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.Choice.ChoiceAction.Builder
        public Choice.ChoiceAction.Builder setUiLabel(String str) {
            this.uiLabel = str;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.Choice.ChoiceAction.Builder
        public Choice.ChoiceAction.Builder setVideoId(String str) {
            this.videoId = str;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Builder() {
        }

        private Builder(Choice.ChoiceAction choiceAction) {
            this.type = choiceAction.type();
            this.videoId = choiceAction.videoId();
            this.trackId = choiceAction.trackId();
            this.ancestorId = choiceAction.ancestorId();
            this.bookmarkPosition = choiceAction.bookmarkPosition();
            this.uiLabel = choiceAction.uiLabel();
            this.sourceOfPlay = choiceAction.sourceOfPlay();
            this.segmentId = choiceAction.segmentId();
            this.startTimeMs = choiceAction.startTimeMs();
            this.momentsIntent = choiceAction.momentsIntent();
            this.requestId = choiceAction.requestId();
        }

        @Override // com.netflix.model.leafs.originals.interactive.Choice.ChoiceAction.Builder
        public Choice.ChoiceAction.Builder setType(String str) {
            if (str != null) {
                this.type = str;
                return this;
            }
            throw new NullPointerException("Null type");
        }

        @Override // com.netflix.model.leafs.originals.interactive.Choice.ChoiceAction.Builder
        public Choice.ChoiceAction build() {
            String str = "";
            if (this.type == null) {
                str = " type";
            }
            if (!str.isEmpty()) {
                throw new IllegalStateException("Missing required properties:" + str);
            }
            return new AutoValue_Choice_ChoiceAction(this.type, this.videoId, this.trackId, this.ancestorId, this.bookmarkPosition, this.uiLabel, this.sourceOfPlay, this.segmentId, this.startTimeMs, this.momentsIntent, this.requestId);
        }
    }
}
