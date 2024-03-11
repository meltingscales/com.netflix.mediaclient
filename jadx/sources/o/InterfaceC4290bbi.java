package o;

import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.service.player.bladerunnerclient.volley.ClientActionFromLase;
import com.netflix.mediaclient.servicemgr.interface_.offline.StopReason;
import o.InterfaceC4208baF;
import o.InterfaceC4348bcn;

/* renamed from: o.bbi  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC4290bbi extends InterfaceC5206buQ {

    /* renamed from: o.bbi$a */
    /* loaded from: classes3.dex */
    public interface a {
        void c(InterfaceC4348bcn.c cVar, String str, Status status);
    }

    /* renamed from: o.bbi$c */
    /* loaded from: classes3.dex */
    public interface c {
        void c(InterfaceC4290bbi interfaceC4290bbi);
    }

    /* renamed from: o.bbi$d */
    /* loaded from: classes3.dex */
    public interface d {
        void b(InterfaceC4299bbr interfaceC4299bbr);
    }

    boolean a();

    void b();

    void b(ClientActionFromLase clientActionFromLase);

    void b(a aVar);

    void b(c cVar);

    String d();

    void d(StopReason stopReason);

    void d(InterfaceC4208baF.c cVar);

    Status e(boolean z);

    InterfaceC4299bbr e();

    void e(boolean z, InterfaceC4208baF.d dVar);

    void f();

    void g();

    InterfaceC4299bbr i();

    void j();
}
