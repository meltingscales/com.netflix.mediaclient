package o;

import io.reactivex.disposables.Disposable;
import io.reactivex.rxkotlin.SubscribersKt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o.C1044Mm;
import o.C8632dsu;
import o.aJR;
import o.dpR;

/* loaded from: classes3.dex */
public final class aJR {
    public static final aJR a = new aJR();
    private static Disposable b;
    private static final List<String> c;

    private aJR() {
    }

    static {
        List<String> synchronizedList = Collections.synchronizedList(new ArrayList());
        C8632dsu.a(synchronizedList, "");
        c = synchronizedList;
    }

    public final boolean c(String str) {
        boolean contains;
        if (str != null) {
            List<String> list = c;
            synchronized (list) {
                contains = list.contains(str);
            }
            return !contains;
        }
        return true;
    }

    public final void a(String str) {
        C8632dsu.c((Object) str, "");
        e();
        List<String> list = c;
        synchronized (list) {
            list.add(str);
        }
    }

    private final void e() {
        if (b == null) {
            b = SubscribersKt.subscribeBy$default(ND.a.a(), new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.playerui.util.SubtitlesOnMuteHelper$listenForUserSessionEnd$1
                @Override // o.drM
                public /* synthetic */ dpR invoke(Throwable th) {
                    a(th);
                    return dpR.c;
                }

                public final void a(Throwable th) {
                    C8632dsu.c((Object) th, "");
                    C1044Mm.d("SubtitlesOnMuteHelper", th.getMessage());
                }
            }, (drO) null, new drM<dpR, dpR>() { // from class: com.netflix.mediaclient.playerui.util.SubtitlesOnMuteHelper$listenForUserSessionEnd$2
                @Override // o.drM
                public /* synthetic */ dpR invoke(dpR dpr) {
                    d(dpr);
                    return dpR.c;
                }

                public final void d(dpR dpr) {
                    C8632dsu.c((Object) dpr, "");
                    aJR.a.a();
                }
            }, 2, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a() {
        Disposable disposable = b;
        if (disposable != null) {
            disposable.dispose();
        }
        b = null;
        List<String> list = c;
        synchronized (list) {
            list.clear();
            dpR dpr = dpR.c;
        }
    }
}
