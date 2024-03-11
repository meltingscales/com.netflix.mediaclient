package o;

import com.netflix.mediaclient.service.pushnotification.Payload;

/* loaded from: classes3.dex */
public final class aXK extends AbstractC2049aXz {
    public aXK(String str, int i, String str2, String str3, Integer num, boolean z, String str4, String str5, String str6, String str7) {
        super("PLAYER_PLAY");
        a(str, i, str2, str3, num, z, str4, str5);
        c(Payload.PARAM_ORIGINATOR, "USER");
        c("groupNames", str6);
        c("uiVer", str7);
    }

    private void a(String str, int i, String str2, String str3, Integer num, boolean z, String str4, String str5) {
        c("catalogId", str);
        a("trackId", i);
        c("esn", str2);
        a("enablePostPlay", true);
        a("enableSkipIntro", true);
        c("controllerName", str5);
        if (aMH.c().b()) {
            a("isPinVerified", true);
        }
        if (z) {
            a("isPreReleasePinVerified", true);
        }
        if (str4 != null) {
            c("prereleasePin", str4);
        }
        if (str3 != null) {
            c("episodeId", str3);
        }
        if (num != null && num.intValue() >= 0) {
            a("startTime", num.intValue());
        }
        a("enableNrdpPostPlay", true);
    }
}
