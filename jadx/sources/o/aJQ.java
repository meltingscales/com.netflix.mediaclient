package o;

import com.netflix.mediaclient.media.subtitles.Subtitle;

/* loaded from: classes3.dex */
public class aJQ {
    private static final String b = "com.netflix.mediaclient.playerui.util.SelectTrackHelper";

    public static Subtitle e(String str, InterfaceC5085bsB interfaceC5085bsB) {
        Subtitle[] q = interfaceC5085bsB.q();
        if (q != null) {
            for (Subtitle subtitle : q) {
                if (!subtitle.isForcedNarrativeOrNone() && subtitle.getLanguageCodeBcp47().equals(str)) {
                    return subtitle;
                }
            }
        }
        C1044Mm.d(b, "Cannot find subtitle corresponding to current locale");
        return null;
    }
}
