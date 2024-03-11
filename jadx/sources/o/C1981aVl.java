package o;

import android.os.Handler;
import com.netflix.mediaclient.servicemgr.IClientLogging;

/* renamed from: o.aVl  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1981aVl implements InterfaceC1979aVj {
    private InterfaceC4208baF a;
    private IClientLogging b;
    private Handler d;
    private C1987aVr e;

    public C1981aVl(IClientLogging iClientLogging) {
        this.b = iClientLogging;
    }

    public void c(Handler handler, InterfaceC4208baF interfaceC4208baF) {
        this.d = handler;
        this.a = interfaceC4208baF;
        e();
    }

    public void a() {
        if (this.e != null) {
            d();
            this.e.c(AbstractApplicationC1040Mh.d());
        }
    }

    @Override // o.InterfaceC1979aVj
    public void c(String str, String str2, String str3, C1980aVk c1980aVk, AbstractC4564bgr abstractC4564bgr) {
        if (this.e == null) {
            e();
        }
        this.e.b(str, str2, str3, c1980aVk, abstractC4564bgr);
    }

    private void e() {
        C1987aVr c1987aVr = new C1987aVr(AbstractApplicationC1040Mh.d(), this.a, this.b);
        this.e = c1987aVr;
        c1987aVr.b();
        b();
    }

    private void b() {
        this.d.post(new Runnable() { // from class: o.aVl.4
            @Override // java.lang.Runnable
            public void run() {
                C1981aVl.this.a.e((InterfaceC4208baF) C1981aVl.this.e);
            }
        });
    }

    private void d() {
        this.d.post(new Runnable() { // from class: o.aVl.3
            @Override // java.lang.Runnable
            public void run() {
                C1981aVl.this.a.d(C1981aVl.this.e);
            }
        });
    }
}
