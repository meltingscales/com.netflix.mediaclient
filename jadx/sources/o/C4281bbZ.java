package o;

import android.os.StatFs;
import com.netflix.mediaclient.service.offline.registry.OfflineRegistryInterface;
import java.io.File;
import java.util.Iterator;
import java.util.List;

/* renamed from: o.bbZ  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4281bbZ implements InterfaceC5203buN {
    private final int a;
    private final OfflineRegistryInterface b;
    private final String c;
    private final C4280bbY d;
    private final List<C4276bbU> e;
    private long i = 0;

    public void a(long j) {
        this.i += j;
    }

    public void b(long j) {
        this.i = j;
    }

    public String d() {
        return this.c;
    }

    public List<C4276bbU> e() {
        return this.e;
    }

    @Override // o.InterfaceC5203buN
    public long h() {
        return this.i;
    }

    public int i() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public File b() {
        return this.d.d();
    }

    @Override // o.InterfaceC5203buN
    public boolean n() {
        return this.d.b();
    }

    @Override // o.InterfaceC5203buN
    public long j() {
        return this.d.c();
    }

    @Override // o.InterfaceC5203buN
    public long c() {
        return this.d.e();
    }

    @Override // o.InterfaceC5203buN
    public long a() {
        return this.d.a();
    }

    @Override // o.InterfaceC5203buN
    public boolean f() {
        return this.b.b() == this.a;
    }

    public C4281bbZ(OfflineRegistryInterface offlineRegistryInterface, List<C4276bbU> list, C4280bbY c4280bbY, int i, String str) {
        this.b = offlineRegistryInterface;
        this.e = list;
        this.d = c4280bbY;
        this.a = i;
        this.c = str;
    }

    public boolean g() {
        return this.e.size() > 0;
    }

    public void c(InterfaceC4299bbr interfaceC4299bbr) {
        this.e.add((C4276bbU) interfaceC4299bbr);
    }

    public void e(InterfaceC4299bbr interfaceC4299bbr) {
        Iterator<C4276bbU> it = this.e.iterator();
        while (it.hasNext()) {
            if (it.next().h().equals(interfaceC4299bbr.h())) {
                it.remove();
                return;
            }
        }
    }

    public void k() {
        StatFs a = C8196dfn.a(b());
        if (a != null) {
            this.d.c(a);
        }
    }
}
