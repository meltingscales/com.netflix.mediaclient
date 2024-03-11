package o;

/* renamed from: o.Mp  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1045Mp {
    private final String logTag;

    public final String getLogTag() {
        return this.logTag;
    }

    public final void logD(String str, drO<String> dro) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) dro, "");
    }

    public final void logDx(drM<? super Object, dpR> drm) {
        C8632dsu.c((Object) drm, "");
    }

    public final void logE(drO<String> dro) {
        C8632dsu.c((Object) dro, "");
    }

    public final void logEx(drM<? super Object, dpR> drm) {
        C8632dsu.c((Object) drm, "");
    }

    public final void logI(drO<String> dro) {
        C8632dsu.c((Object) dro, "");
    }

    public final void logIx(drM<? super Object, dpR> drm) {
        C8632dsu.c((Object) drm, "");
    }

    public final void logPerfDebug(drO<String> dro) {
        C8632dsu.c((Object) dro, "");
    }

    public final void logPerfRelease(drO<String> dro) {
        C8632dsu.c((Object) dro, "");
    }

    public final void logV(String str, drO<String> dro) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) dro, "");
    }

    public final void logVDump(drO<String> dro) {
        C8632dsu.c((Object) dro, "");
    }

    public final void logVx(drM<? super Object, dpR> drm) {
        C8632dsu.c((Object) drm, "");
    }

    public final void logW(drO<String> dro) {
        C8632dsu.c((Object) dro, "");
    }

    public final void logWx(drM<? super Object, dpR> drm) {
        C8632dsu.c((Object) drm, "");
    }

    public C1045Mp(String str) {
        C8632dsu.c((Object) str, "");
        this.logTag = str;
    }

    public static /* synthetic */ void logV$default(C1045Mp c1045Mp, String str, drO dro, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logV");
        }
        if ((i & 1) != 0) {
            str = c1045Mp.getLogTag();
        }
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) dro, "");
    }

    public static /* synthetic */ void logD$default(C1045Mp c1045Mp, String str, drO dro, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logD");
        }
        if ((i & 1) != 0) {
            str = c1045Mp.getLogTag();
        }
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) dro, "");
    }
}
