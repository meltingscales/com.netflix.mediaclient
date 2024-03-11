package com.netflix.mediaclient.media;

import o.C8632dsu;

/* loaded from: classes3.dex */
public final class PreferredLanguageData {
    private final String audioCode;
    private final Boolean isAssistive;
    private final Boolean isClosedCaption;
    private final String subtitleCode;

    public static /* synthetic */ PreferredLanguageData copy$default(PreferredLanguageData preferredLanguageData, String str, Boolean bool, String str2, Boolean bool2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = preferredLanguageData.audioCode;
        }
        if ((i & 2) != 0) {
            bool = preferredLanguageData.isAssistive;
        }
        if ((i & 4) != 0) {
            str2 = preferredLanguageData.subtitleCode;
        }
        if ((i & 8) != 0) {
            bool2 = preferredLanguageData.isClosedCaption;
        }
        return preferredLanguageData.copy(str, bool, str2, bool2);
    }

    public final String component1() {
        return this.audioCode;
    }

    public final Boolean component2() {
        return this.isAssistive;
    }

    public final String component3() {
        return this.subtitleCode;
    }

    public final Boolean component4() {
        return this.isClosedCaption;
    }

    public final PreferredLanguageData copy(String str, Boolean bool, String str2, Boolean bool2) {
        return new PreferredLanguageData(str, bool, str2, bool2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PreferredLanguageData) {
            PreferredLanguageData preferredLanguageData = (PreferredLanguageData) obj;
            return C8632dsu.c((Object) this.audioCode, (Object) preferredLanguageData.audioCode) && C8632dsu.c(this.isAssistive, preferredLanguageData.isAssistive) && C8632dsu.c((Object) this.subtitleCode, (Object) preferredLanguageData.subtitleCode) && C8632dsu.c(this.isClosedCaption, preferredLanguageData.isClosedCaption);
        }
        return false;
    }

    public final String getAudioCode() {
        return this.audioCode;
    }

    public final String getSubtitleCode() {
        return this.subtitleCode;
    }

    public int hashCode() {
        String str = this.audioCode;
        int hashCode = str == null ? 0 : str.hashCode();
        Boolean bool = this.isAssistive;
        int hashCode2 = bool == null ? 0 : bool.hashCode();
        String str2 = this.subtitleCode;
        int hashCode3 = str2 == null ? 0 : str2.hashCode();
        Boolean bool2 = this.isClosedCaption;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final Boolean isAssistive() {
        return this.isAssistive;
    }

    public final Boolean isClosedCaption() {
        return this.isClosedCaption;
    }

    public String toString() {
        String str = this.audioCode;
        Boolean bool = this.isAssistive;
        String str2 = this.subtitleCode;
        Boolean bool2 = this.isClosedCaption;
        return "PreferredLanguageData(audioCode=" + str + ", isAssistive=" + bool + ", subtitleCode=" + str2 + ", isClosedCaption=" + bool2 + ")";
    }

    public PreferredLanguageData(String str, Boolean bool, String str2, Boolean bool2) {
        this.audioCode = str;
        this.isAssistive = bool;
        this.subtitleCode = str2;
        this.isClosedCaption = bool2;
    }
}
