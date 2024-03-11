package o;

import com.netflix.mediaclient.commanderinfra.api.util.PlaybackControlKey;
import com.netflix.mediaclient.commanderinfra.api.util.PlaybackKey;
import javax.inject.Singleton;

@Singleton
/* renamed from: o.Xe  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1321Xe extends C1045Mp implements UC {
    public static final C1321Xe c = new C1321Xe();

    private C1321Xe() {
        super("NotificationCallback");
    }

    @Override // o.UC
    public void d(String str) {
        C8632dsu.c((Object) str, "");
        getLogTag();
        switch (str.hashCode()) {
            case -190239744:
                if (str.equals("com.netflix.mediaclient.intent.action.CDX_ACTION_RESUME")) {
                    getLogTag();
                    C1328Xl.b.b(PlaybackControlKey.b);
                    return;
                }
                return;
            case -190132082:
                if (str.equals("com.netflix.mediaclient.intent.action.CDX_ACTION_REWIND")) {
                    getLogTag();
                    C1328Xl.b.a(PlaybackKey.f);
                    return;
                }
                return;
            case 653265415:
                if (str.equals("com.netflix.mediaclient.intent.action.CDX_ACTION_PLAY_NEXT_EPISODE")) {
                    getLogTag();
                    C1328Xl.b.a(PlaybackKey.a);
                    return;
                }
                return;
            case 917809458:
                if (str.equals("com.netflix.mediaclient.intent.action.CDX_ACTION_FORWARD")) {
                    getLogTag();
                    C1328Xl.b.a(PlaybackKey.c);
                    return;
                }
                return;
            case 1238824867:
                if (str.equals("com.netflix.mediaclient.intent.action.CDX_ACTION_PAUSE")) {
                    getLogTag();
                    C1328Xl.b.b(PlaybackControlKey.a);
                    return;
                }
                return;
            case 1507893727:
                if (str.equals("com.netflix.mediaclient.intent.action.CDX_ACTION_SKIP_INTRO")) {
                    getLogTag();
                    C1328Xl.b.a(PlaybackKey.g);
                    return;
                }
                return;
            default:
                return;
        }
    }
}
