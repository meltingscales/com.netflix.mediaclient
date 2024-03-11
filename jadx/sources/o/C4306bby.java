package o;

import com.netflix.mediaclient.servicemgr.interface_.offline.DownloadState;

/* renamed from: o.bby  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4306bby implements InterfaceC4217baO {
    private final C4256bbA b;
    private final InterfaceC4299bbr d;
    private long e;

    public long b() {
        return this.e;
    }

    @Override // o.InterfaceC4217baO
    public void b(long j) {
        this.e = j;
    }

    public C4306bby(C4256bbA c4256bbA, InterfaceC4299bbr interfaceC4299bbr) {
        C8632dsu.c((Object) c4256bbA, "");
        C8632dsu.c((Object) interfaceC4299bbr, "");
        this.b = c4256bbA;
        this.d = interfaceC4299bbr;
        this.e = -1L;
    }

    @Override // o.InterfaceC4217baO
    public long b(String str) {
        C8632dsu.c((Object) str, "");
        C4287bbf c4287bbf = this.b.e.get(str);
        if (c4287bbf != null) {
            return c4287bbf.d;
        }
        return -1L;
    }

    @Override // o.InterfaceC4217baO
    public boolean a() {
        return this.d.t() == DownloadState.Complete;
    }

    @Override // o.InterfaceC4217baO
    public String c() {
        return this.d.h();
    }
}
