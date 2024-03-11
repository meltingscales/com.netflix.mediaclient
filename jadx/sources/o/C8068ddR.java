package o;

import android.media.AudioManager;

/* renamed from: o.ddR  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8068ddR extends C1045Mp {
    public static final C8068ddR d = new C8068ddR();
    public static C8060ddJ e;

    public static final void e(C8060ddJ c8060ddJ) {
        C8632dsu.c((Object) c8060ddJ, "");
        e = c8060ddJ;
    }

    private C8068ddR() {
        super("AudioUtils");
    }

    public static final void c() {
        if (C8054ddD.a()) {
            Object systemService = AbstractApplicationC1040Mh.d().getSystemService("audio");
            C8632dsu.d(systemService);
            ((AudioManager) systemService).setAllowedCapturePolicy(3);
        }
    }

    public static final void e() {
        d.getLogTag();
        if (e == null) {
            e(new C8060ddJ());
        }
    }
}
