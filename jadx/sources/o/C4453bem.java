package o;

import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;

/* renamed from: o.bem  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4453bem {
    public static String c(Format format) {
        char c;
        String str = format.sampleMimeType;
        if (str != null) {
            str.hashCode();
            int hashCode = str.hashCode();
            if (hashCode == -1004728940) {
                if (str.equals("text/vtt")) {
                    c = 0;
                }
                c = 65535;
            } else if (hashCode != 1187329061) {
                if (hashCode == 1693976202 && str.equals("application/ttml+xml")) {
                    c = 2;
                }
                c = 65535;
            } else {
                if (str.equals("application/nflx-cmisc")) {
                    c = 1;
                }
                c = 65535;
            }
            return c != 0 ? c != 1 ? c != 2 ? "unknownTimedTextProfile" : "im2t".equals(format.codecs) ? "imsc1.1" : "dfxp-ls-sdh" : "nflx-cmisc" : "webvtt-lssdh-ios8";
        }
        return "unknownTimedTextProfile";
    }

    public static int b(String str) {
        if ("application/nflx-cmisc".equals(str)) {
            return 3;
        }
        return MimeTypes.getTrackType(str);
    }
}
