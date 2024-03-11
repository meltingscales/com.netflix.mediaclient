package o;

import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.servicemgr.interface_.offline.StopReason;
import com.netflix.mediaclient.ui.offline.OfflineFragmentV2;
import java.util.List;

/* renamed from: o.ctH  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7279ctH implements InterfaceC4209baG {
    private final OfflineFragmentV2 b;
    public static final c d = new c(null);
    public static final int c = 8;

    @Override // o.InterfaceC4209baG
    public void b(String str) {
        C8632dsu.c((Object) str, "");
    }

    @Override // o.InterfaceC4209baG
    public void b(InterfaceC5206buQ interfaceC5206buQ) {
        C8632dsu.c((Object) interfaceC5206buQ, "");
    }

    public C7279ctH(OfflineFragmentV2 offlineFragmentV2) {
        C8632dsu.c((Object) offlineFragmentV2, "");
        this.b = offlineFragmentV2;
    }

    /* renamed from: o.ctH$c */
    /* loaded from: classes4.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("OfflineFragmentListener");
        }
    }

    @Override // o.InterfaceC4209baG
    public void a(InterfaceC5206buQ interfaceC5206buQ) {
        C8632dsu.c((Object) interfaceC5206buQ, "");
        this.b.X();
    }

    @Override // o.InterfaceC4209baG
    public void d(InterfaceC5206buQ interfaceC5206buQ, StopReason stopReason) {
        C8632dsu.c((Object) interfaceC5206buQ, "");
        C8632dsu.c((Object) stopReason, "");
        this.b.X();
    }

    @Override // o.InterfaceC4209baG
    public void b(String str, Status status, boolean z) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) status, "");
        this.b.X();
    }

    @Override // o.InterfaceC4209baG
    public void c(List<String> list, Status status) {
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) status, "");
        this.b.X();
    }

    @Override // o.InterfaceC4209baG
    public void d(Status status) {
        C8632dsu.c((Object) status, "");
        this.b.X();
    }

    @Override // o.InterfaceC4209baG
    public void b(Status status) {
        C8632dsu.c((Object) status, "");
        this.b.X();
    }

    @Override // o.InterfaceC4209baG
    public void e(InterfaceC5206buQ interfaceC5206buQ, Status status) {
        C8632dsu.c((Object) interfaceC5206buQ, "");
        C8632dsu.c((Object) status, "");
        this.b.X();
    }

    @Override // o.InterfaceC4209baG
    public void d(InterfaceC5206buQ interfaceC5206buQ, Status status) {
        C8632dsu.c((Object) interfaceC5206buQ, "");
        C8632dsu.c((Object) status, "");
        this.b.X();
    }

    @Override // o.InterfaceC4209baG
    public void c(InterfaceC5206buQ interfaceC5206buQ, int i) {
        C8632dsu.c((Object) interfaceC5206buQ, "");
        this.b.c(interfaceC5206buQ, i);
    }

    @Override // o.InterfaceC4209baG
    public void e(boolean z) {
        this.b.e(z);
    }

    @Override // o.InterfaceC4209baG
    public void b(String str, Status status) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) status, "");
        this.b.X();
    }

    @Override // o.InterfaceC4209baG
    public boolean c() {
        return !this.b.bn_();
    }
}
