package o;

import com.netflix.mediaclient.servicemgr.ZuulAgent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: o.bsh  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5117bsh implements InterfaceC5171bti {
    private final List<InterfaceC5171bti> e = Collections.synchronizedList(new ArrayList());

    public final void b(InterfaceC5171bti interfaceC5171bti) {
        C8632dsu.c((Object) interfaceC5171bti, "");
        List<InterfaceC5171bti> list = this.e;
        C8632dsu.a(list, "");
        synchronized (list) {
            this.e.add(interfaceC5171bti);
        }
    }

    public final void a(InterfaceC5171bti interfaceC5171bti) {
        C8632dsu.c((Object) interfaceC5171bti, "");
        List<InterfaceC5171bti> list = this.e;
        C8632dsu.a(list, "");
        synchronized (list) {
            this.e.remove(interfaceC5171bti);
        }
    }

    @Override // o.InterfaceC5171bti
    public boolean e(String str) {
        C8632dsu.c((Object) str, "");
        List<InterfaceC5171bti> list = this.e;
        C8632dsu.a(list, "");
        synchronized (list) {
            for (InterfaceC5171bti interfaceC5171bti : this.e) {
                if (interfaceC5171bti.e(str)) {
                    return true;
                }
            }
            dpR dpr = dpR.c;
            return false;
        }
    }

    @Override // o.InterfaceC5171bti
    public void b(ZuulAgent.e eVar) {
        C8632dsu.c((Object) eVar, "");
        List<InterfaceC5171bti> list = this.e;
        C8632dsu.a(list, "");
        synchronized (list) {
            for (InterfaceC5171bti interfaceC5171bti : this.e) {
                interfaceC5171bti.b(eVar);
            }
            dpR dpr = dpR.c;
        }
    }

    @Override // o.InterfaceC5171bti
    public void b() {
        List<InterfaceC5171bti> list = this.e;
        C8632dsu.a(list, "");
        synchronized (list) {
            for (InterfaceC5171bti interfaceC5171bti : this.e) {
                interfaceC5171bti.b();
            }
            dpR dpr = dpR.c;
        }
    }

    @Override // o.InterfaceC5171bti
    public boolean a() {
        List<InterfaceC5171bti> list = this.e;
        C8632dsu.a(list, "");
        synchronized (list) {
            for (InterfaceC5171bti interfaceC5171bti : this.e) {
                if (interfaceC5171bti.a()) {
                    return true;
                }
            }
            dpR dpr = dpR.c;
            return false;
        }
    }
}
