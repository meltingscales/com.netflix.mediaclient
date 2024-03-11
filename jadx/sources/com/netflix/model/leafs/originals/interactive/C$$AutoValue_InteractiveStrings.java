package com.netflix.model.leafs.originals.interactive;

import com.netflix.model.leafs.originals.interactive.InteractiveStrings;
import java.util.Map;

/* renamed from: com.netflix.model.leafs.originals.interactive.$$AutoValue_InteractiveStrings  reason: invalid class name */
/* loaded from: classes.dex */
abstract class C$$AutoValue_InteractiveStrings extends InteractiveStrings {
    private final String category;
    private final String categoryAccessibilityDescription;
    private final String currentScore;
    private final String earned;
    private final String header;
    private final Map<String, String> mappings;
    private final String maxScore;
    private final String nextPlayerHeader;
    private final String nextPlayerSubHeader;
    private final String p1Score;
    private final String pointsToUnlock;
    private final Map<String, String> preconditionTokens;
    private final String question;
    private final String score;
    private final String scoreAccessibilityDescription;
    private final String share;
    private final String subHeader;
    private final String targetScore;
    private final String theme;
    private final String unlock;
    private final String unlockAccessibilityDescription;

    @Override // com.netflix.model.leafs.originals.interactive.InteractiveStrings
    public String category() {
        return this.category;
    }

    @Override // com.netflix.model.leafs.originals.interactive.InteractiveStrings
    public String categoryAccessibilityDescription() {
        return this.categoryAccessibilityDescription;
    }

    @Override // com.netflix.model.leafs.originals.interactive.InteractiveStrings
    public String currentScore() {
        return this.currentScore;
    }

    @Override // com.netflix.model.leafs.originals.interactive.InteractiveStrings
    public String earned() {
        return this.earned;
    }

    @Override // com.netflix.model.leafs.originals.interactive.InteractiveStrings
    public String header() {
        return this.header;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.netflix.model.leafs.originals.interactive.InteractiveStrings
    public Map<String, String> mappings() {
        return this.mappings;
    }

    @Override // com.netflix.model.leafs.originals.interactive.InteractiveStrings
    public String maxScore() {
        return this.maxScore;
    }

    @Override // com.netflix.model.leafs.originals.interactive.InteractiveStrings
    public String nextPlayerHeader() {
        return this.nextPlayerHeader;
    }

    @Override // com.netflix.model.leafs.originals.interactive.InteractiveStrings
    public String nextPlayerSubHeader() {
        return this.nextPlayerSubHeader;
    }

    @Override // com.netflix.model.leafs.originals.interactive.InteractiveStrings
    public String p1Score() {
        return this.p1Score;
    }

    @Override // com.netflix.model.leafs.originals.interactive.InteractiveStrings
    public String pointsToUnlock() {
        return this.pointsToUnlock;
    }

    @Override // com.netflix.model.leafs.originals.interactive.InteractiveStrings
    public Map<String, String> preconditionTokens() {
        return this.preconditionTokens;
    }

    @Override // com.netflix.model.leafs.originals.interactive.InteractiveStrings
    public String question() {
        return this.question;
    }

    @Override // com.netflix.model.leafs.originals.interactive.InteractiveStrings
    public String score() {
        return this.score;
    }

    @Override // com.netflix.model.leafs.originals.interactive.InteractiveStrings
    public String scoreAccessibilityDescription() {
        return this.scoreAccessibilityDescription;
    }

    @Override // com.netflix.model.leafs.originals.interactive.InteractiveStrings
    public String share() {
        return this.share;
    }

    @Override // com.netflix.model.leafs.originals.interactive.InteractiveStrings
    public String subHeader() {
        return this.subHeader;
    }

    @Override // com.netflix.model.leafs.originals.interactive.InteractiveStrings
    public String targetScore() {
        return this.targetScore;
    }

    @Override // com.netflix.model.leafs.originals.interactive.InteractiveStrings
    public String theme() {
        return this.theme;
    }

    @Override // com.netflix.model.leafs.originals.interactive.InteractiveStrings
    public String unlock() {
        return this.unlock;
    }

    @Override // com.netflix.model.leafs.originals.interactive.InteractiveStrings
    public String unlockAccessibilityDescription() {
        return this.unlockAccessibilityDescription;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$AutoValue_InteractiveStrings(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, Map<String, String> map, Map<String, String> map2) {
        this.pointsToUnlock = str;
        this.unlock = str2;
        this.earned = str3;
        this.score = str4;
        this.maxScore = str5;
        this.question = str6;
        this.category = str7;
        this.scoreAccessibilityDescription = str8;
        this.unlockAccessibilityDescription = str9;
        this.categoryAccessibilityDescription = str10;
        this.theme = str11;
        this.share = str12;
        this.header = str13;
        this.targetScore = str14;
        this.nextPlayerSubHeader = str15;
        this.nextPlayerHeader = str16;
        this.subHeader = str17;
        this.currentScore = str18;
        this.p1Score = str19;
        this.preconditionTokens = map;
        this.mappings = map2;
    }

    public String toString() {
        return "InteractiveStrings{pointsToUnlock=" + this.pointsToUnlock + ", unlock=" + this.unlock + ", earned=" + this.earned + ", score=" + this.score + ", maxScore=" + this.maxScore + ", question=" + this.question + ", category=" + this.category + ", scoreAccessibilityDescription=" + this.scoreAccessibilityDescription + ", unlockAccessibilityDescription=" + this.unlockAccessibilityDescription + ", categoryAccessibilityDescription=" + this.categoryAccessibilityDescription + ", theme=" + this.theme + ", share=" + this.share + ", header=" + this.header + ", targetScore=" + this.targetScore + ", nextPlayerSubHeader=" + this.nextPlayerSubHeader + ", nextPlayerHeader=" + this.nextPlayerHeader + ", subHeader=" + this.subHeader + ", currentScore=" + this.currentScore + ", p1Score=" + this.p1Score + ", preconditionTokens=" + this.preconditionTokens + ", mappings=" + this.mappings + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InteractiveStrings) {
            InteractiveStrings interactiveStrings = (InteractiveStrings) obj;
            String str = this.pointsToUnlock;
            if (str != null ? str.equals(interactiveStrings.pointsToUnlock()) : interactiveStrings.pointsToUnlock() == null) {
                String str2 = this.unlock;
                if (str2 != null ? str2.equals(interactiveStrings.unlock()) : interactiveStrings.unlock() == null) {
                    String str3 = this.earned;
                    if (str3 != null ? str3.equals(interactiveStrings.earned()) : interactiveStrings.earned() == null) {
                        String str4 = this.score;
                        if (str4 != null ? str4.equals(interactiveStrings.score()) : interactiveStrings.score() == null) {
                            String str5 = this.maxScore;
                            if (str5 != null ? str5.equals(interactiveStrings.maxScore()) : interactiveStrings.maxScore() == null) {
                                String str6 = this.question;
                                if (str6 != null ? str6.equals(interactiveStrings.question()) : interactiveStrings.question() == null) {
                                    String str7 = this.category;
                                    if (str7 != null ? str7.equals(interactiveStrings.category()) : interactiveStrings.category() == null) {
                                        String str8 = this.scoreAccessibilityDescription;
                                        if (str8 != null ? str8.equals(interactiveStrings.scoreAccessibilityDescription()) : interactiveStrings.scoreAccessibilityDescription() == null) {
                                            String str9 = this.unlockAccessibilityDescription;
                                            if (str9 != null ? str9.equals(interactiveStrings.unlockAccessibilityDescription()) : interactiveStrings.unlockAccessibilityDescription() == null) {
                                                String str10 = this.categoryAccessibilityDescription;
                                                if (str10 != null ? str10.equals(interactiveStrings.categoryAccessibilityDescription()) : interactiveStrings.categoryAccessibilityDescription() == null) {
                                                    String str11 = this.theme;
                                                    if (str11 != null ? str11.equals(interactiveStrings.theme()) : interactiveStrings.theme() == null) {
                                                        String str12 = this.share;
                                                        if (str12 != null ? str12.equals(interactiveStrings.share()) : interactiveStrings.share() == null) {
                                                            String str13 = this.header;
                                                            if (str13 != null ? str13.equals(interactiveStrings.header()) : interactiveStrings.header() == null) {
                                                                String str14 = this.targetScore;
                                                                if (str14 != null ? str14.equals(interactiveStrings.targetScore()) : interactiveStrings.targetScore() == null) {
                                                                    String str15 = this.nextPlayerSubHeader;
                                                                    if (str15 != null ? str15.equals(interactiveStrings.nextPlayerSubHeader()) : interactiveStrings.nextPlayerSubHeader() == null) {
                                                                        String str16 = this.nextPlayerHeader;
                                                                        if (str16 != null ? str16.equals(interactiveStrings.nextPlayerHeader()) : interactiveStrings.nextPlayerHeader() == null) {
                                                                            String str17 = this.subHeader;
                                                                            if (str17 != null ? str17.equals(interactiveStrings.subHeader()) : interactiveStrings.subHeader() == null) {
                                                                                String str18 = this.currentScore;
                                                                                if (str18 != null ? str18.equals(interactiveStrings.currentScore()) : interactiveStrings.currentScore() == null) {
                                                                                    String str19 = this.p1Score;
                                                                                    if (str19 != null ? str19.equals(interactiveStrings.p1Score()) : interactiveStrings.p1Score() == null) {
                                                                                        Map<String, String> map = this.preconditionTokens;
                                                                                        if (map != null ? map.equals(interactiveStrings.preconditionTokens()) : interactiveStrings.preconditionTokens() == null) {
                                                                                            Map<String, String> map2 = this.mappings;
                                                                                            if (map2 == null) {
                                                                                                if (interactiveStrings.mappings() == null) {
                                                                                                    return true;
                                                                                                }
                                                                                            } else if (map2.equals(interactiveStrings.mappings())) {
                                                                                                return true;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
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
        String str = this.pointsToUnlock;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.unlock;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.earned;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.score;
        int hashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.maxScore;
        int hashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.question;
        int hashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.category;
        int hashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.scoreAccessibilityDescription;
        int hashCode8 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.unlockAccessibilityDescription;
        int hashCode9 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.categoryAccessibilityDescription;
        int hashCode10 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.theme;
        int hashCode11 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.share;
        int hashCode12 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.header;
        int hashCode13 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.targetScore;
        int hashCode14 = str14 == null ? 0 : str14.hashCode();
        String str15 = this.nextPlayerSubHeader;
        int hashCode15 = str15 == null ? 0 : str15.hashCode();
        String str16 = this.nextPlayerHeader;
        int hashCode16 = str16 == null ? 0 : str16.hashCode();
        String str17 = this.subHeader;
        int hashCode17 = str17 == null ? 0 : str17.hashCode();
        String str18 = this.currentScore;
        int hashCode18 = str18 == null ? 0 : str18.hashCode();
        String str19 = this.p1Score;
        int hashCode19 = str19 == null ? 0 : str19.hashCode();
        Map<String, String> map = this.preconditionTokens;
        int hashCode20 = map == null ? 0 : map.hashCode();
        Map<String, String> map2 = this.mappings;
        return ((((((((((((((((((((((((((((((((((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ hashCode5) * 1000003) ^ hashCode6) * 1000003) ^ hashCode7) * 1000003) ^ hashCode8) * 1000003) ^ hashCode9) * 1000003) ^ hashCode10) * 1000003) ^ hashCode11) * 1000003) ^ hashCode12) * 1000003) ^ hashCode13) * 1000003) ^ hashCode14) * 1000003) ^ hashCode15) * 1000003) ^ hashCode16) * 1000003) ^ hashCode17) * 1000003) ^ hashCode18) * 1000003) ^ hashCode19) * 1000003) ^ hashCode20) * 1000003) ^ (map2 == null ? 0 : map2.hashCode());
    }

    @Override // com.netflix.model.leafs.originals.interactive.InteractiveStrings
    public InteractiveStrings.Builder toBuilder() {
        return new Builder(this);
    }

    /* renamed from: com.netflix.model.leafs.originals.interactive.$$AutoValue_InteractiveStrings$Builder */
    /* loaded from: classes.dex */
    static final class Builder extends InteractiveStrings.Builder {
        private String category;
        private String categoryAccessibilityDescription;
        private String currentScore;
        private String earned;
        private String header;
        private Map<String, String> mappings;
        private String maxScore;
        private String nextPlayerHeader;
        private String nextPlayerSubHeader;
        private String p1Score;
        private String pointsToUnlock;
        private Map<String, String> preconditionTokens;
        private String question;
        private String score;
        private String scoreAccessibilityDescription;
        private String share;
        private String subHeader;
        private String targetScore;
        private String theme;
        private String unlock;
        private String unlockAccessibilityDescription;

        @Override // com.netflix.model.leafs.originals.interactive.InteractiveStrings.Builder
        public InteractiveStrings.Builder category(String str) {
            this.category = str;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.InteractiveStrings.Builder
        public InteractiveStrings.Builder categoryAccessibilityDescription(String str) {
            this.categoryAccessibilityDescription = str;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.InteractiveStrings.Builder
        public InteractiveStrings.Builder currentScore(String str) {
            this.currentScore = str;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.InteractiveStrings.Builder
        public InteractiveStrings.Builder earned(String str) {
            this.earned = str;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.InteractiveStrings.Builder
        public InteractiveStrings.Builder header(String str) {
            this.header = str;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.InteractiveStrings.Builder
        public InteractiveStrings.Builder mappings(Map<String, String> map) {
            this.mappings = map;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.InteractiveStrings.Builder
        public InteractiveStrings.Builder maxScore(String str) {
            this.maxScore = str;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.InteractiveStrings.Builder
        public InteractiveStrings.Builder nextPlayerHeader(String str) {
            this.nextPlayerHeader = str;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.InteractiveStrings.Builder
        public InteractiveStrings.Builder nextPlayerSubHeader(String str) {
            this.nextPlayerSubHeader = str;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.InteractiveStrings.Builder
        public InteractiveStrings.Builder p1Score(String str) {
            this.p1Score = str;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.InteractiveStrings.Builder
        public InteractiveStrings.Builder pointsToUnlock(String str) {
            this.pointsToUnlock = str;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.InteractiveStrings.Builder
        public InteractiveStrings.Builder preconditionTokens(Map<String, String> map) {
            this.preconditionTokens = map;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.InteractiveStrings.Builder
        public InteractiveStrings.Builder question(String str) {
            this.question = str;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.InteractiveStrings.Builder
        public InteractiveStrings.Builder score(String str) {
            this.score = str;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.InteractiveStrings.Builder
        public InteractiveStrings.Builder scoreAccessibilityDescription(String str) {
            this.scoreAccessibilityDescription = str;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.InteractiveStrings.Builder
        public InteractiveStrings.Builder share(String str) {
            this.share = str;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.InteractiveStrings.Builder
        public InteractiveStrings.Builder subHeader(String str) {
            this.subHeader = str;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.InteractiveStrings.Builder
        public InteractiveStrings.Builder targetScore(String str) {
            this.targetScore = str;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.InteractiveStrings.Builder
        public InteractiveStrings.Builder theme(String str) {
            this.theme = str;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.InteractiveStrings.Builder
        public InteractiveStrings.Builder unlock(String str) {
            this.unlock = str;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.InteractiveStrings.Builder
        public InteractiveStrings.Builder unlockAccessibilityDescription(String str) {
            this.unlockAccessibilityDescription = str;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Builder() {
        }

        private Builder(InteractiveStrings interactiveStrings) {
            this.pointsToUnlock = interactiveStrings.pointsToUnlock();
            this.unlock = interactiveStrings.unlock();
            this.earned = interactiveStrings.earned();
            this.score = interactiveStrings.score();
            this.maxScore = interactiveStrings.maxScore();
            this.question = interactiveStrings.question();
            this.category = interactiveStrings.category();
            this.scoreAccessibilityDescription = interactiveStrings.scoreAccessibilityDescription();
            this.unlockAccessibilityDescription = interactiveStrings.unlockAccessibilityDescription();
            this.categoryAccessibilityDescription = interactiveStrings.categoryAccessibilityDescription();
            this.theme = interactiveStrings.theme();
            this.share = interactiveStrings.share();
            this.header = interactiveStrings.header();
            this.targetScore = interactiveStrings.targetScore();
            this.nextPlayerSubHeader = interactiveStrings.nextPlayerSubHeader();
            this.nextPlayerHeader = interactiveStrings.nextPlayerHeader();
            this.subHeader = interactiveStrings.subHeader();
            this.currentScore = interactiveStrings.currentScore();
            this.p1Score = interactiveStrings.p1Score();
            this.preconditionTokens = interactiveStrings.preconditionTokens();
            this.mappings = interactiveStrings.mappings();
        }

        @Override // com.netflix.model.leafs.originals.interactive.InteractiveStrings.Builder
        public InteractiveStrings build() {
            return new AutoValue_InteractiveStrings(this.pointsToUnlock, this.unlock, this.earned, this.score, this.maxScore, this.question, this.category, this.scoreAccessibilityDescription, this.unlockAccessibilityDescription, this.categoryAccessibilityDescription, this.theme, this.share, this.header, this.targetScore, this.nextPlayerSubHeader, this.nextPlayerHeader, this.subHeader, this.currentScore, this.p1Score, this.preconditionTokens, this.mappings);
        }
    }
}
