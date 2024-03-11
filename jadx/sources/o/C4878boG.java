package o;

import com.netflix.mediaclient.servicemgr.interface_.offline.DownloadState;

/* renamed from: o.boG  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4878boG {
    public static final C4878boG b = new C4878boG();

    private C4878boG() {
    }

    public final void b(String str, InterfaceC4224baV interfaceC4224baV) {
        InterfaceC4218baP n;
        C8632dsu.c((Object) str, "");
        InterfaceC4208baF c = c();
        if (c == null || (n = c.n()) == null) {
            return;
        }
        n.d(str, interfaceC4224baV);
    }

    public final boolean e(String str) {
        DownloadState au_;
        C8632dsu.c((Object) str, "");
        C1332Xp c1332Xp = C1332Xp.b;
        InterfaceC5206buQ c = ((InterfaceC5298bwC) C1332Xp.b(InterfaceC5298bwC.class)).c(str);
        return (c == null || (au_ = c.au_()) == null || au_ == DownloadState.Complete) ? false : true;
    }

    private final InterfaceC4208baF c() {
        return AbstractApplicationC1040Mh.getInstance().i().l();
    }

    public final long a(long j) {
        InterfaceC4218baP n;
        InterfaceC4208baF c = c();
        if (c == null || (n = c.n()) == null) {
            return -1L;
        }
        return n.c(String.valueOf(j));
    }
}
