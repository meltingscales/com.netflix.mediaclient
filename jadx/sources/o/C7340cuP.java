package o;

import android.content.BroadcastReceiver;
import java.util.List;

/* renamed from: o.cuP  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7340cuP extends C1045Mp {
    public static final C7340cuP d = new C7340cuP();

    private C7340cuP() {
        super("SmartDownloadController");
    }

    public final List<C7460cwd> a(String str) {
        List<C7460cwd> b = C7353cuc.b(str);
        C8632dsu.a(b, "");
        return b;
    }

    public final C7460cwd d(String str) {
        C8632dsu.c((Object) str, "");
        return C7353cuc.e(str);
    }

    public final void b(BroadcastReceiver broadcastReceiver) {
        C8632dsu.c((Object) broadcastReceiver, "");
        getLogTag();
        C8116deM.c(AbstractApplicationC1040Mh.d(), broadcastReceiver, "com.netflix.mediaclient.intent.category.PLAYER", "com.netflix.mediaclient.intent.action.PLAYER_LOCAL_PLAYBACK_STARTED", "com.netflix.mediaclient.intent.action.PLAYER_LOCAL_PLAYBACK_ENDED");
    }
}
