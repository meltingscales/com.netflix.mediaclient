package androidx.media3.exoplayer.dash.manifest;

import androidx.media3.common.util.Util;

/* loaded from: classes2.dex */
public final class ProgramInformation {
    public final String copyright;
    public final String lang;
    public final String moreInformationURL;
    public final String source;
    public final String title;

    public ProgramInformation(String str, String str2, String str3, String str4, String str5) {
        this.title = str;
        this.source = str2;
        this.copyright = str3;
        this.moreInformationURL = str4;
        this.lang = str5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ProgramInformation) {
            ProgramInformation programInformation = (ProgramInformation) obj;
            return Util.areEqual(this.title, programInformation.title) && Util.areEqual(this.source, programInformation.source) && Util.areEqual(this.copyright, programInformation.copyright) && Util.areEqual(this.moreInformationURL, programInformation.moreInformationURL) && Util.areEqual(this.lang, programInformation.lang);
        }
        return false;
    }

    public int hashCode() {
        String str = this.title;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.source;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.copyright;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.moreInformationURL;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.lang;
        return ((((((((hashCode + 527) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (str5 != null ? str5.hashCode() : 0);
    }
}
