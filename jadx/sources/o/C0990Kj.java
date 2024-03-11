package o;

import com.netflix.android.volley.Request;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.browse.api.task.NetworkPriority;
import java.util.List;
import o.C8143den;

/* renamed from: o.Kj  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0990Kj<T> extends IV {
    private final InterfaceC0989Ki<T> h;
    private final InterfaceC1755aNa<T> i;

    public C0990Kj(C0954Iz<?> c0954Iz, IG ig, InterfaceC0989Ki<T> interfaceC0989Ki, InterfaceC1755aNa<T> interfaceC1755aNa) {
        super(interfaceC0989Ki.h(), c0954Iz, ig, interfaceC1755aNa);
        this.b = interfaceC0989Ki.j();
        this.h = interfaceC0989Ki;
        interfaceC0989Ki.d(c0954Iz);
        this.i = interfaceC1755aNa;
    }

    @Override // o.IT
    protected void d(List<InterfaceC1242Ud> list) {
        this.h.d(list);
    }

    @Override // o.IT
    protected void e() {
        this.h.f();
    }

    @Override // o.IT
    protected void a(InterfaceC1757aNc interfaceC1757aNc, C1244Uf c1244Uf) {
        this.h.e(this.d.d(), this.i, c1244Uf);
    }

    @Override // o.IT
    protected void a(InterfaceC1757aNc interfaceC1757aNc, Status status) {
        this.h.e(this.d.d(), this.i, status);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.IT
    public List<C8143den.d> c() {
        return this.h.c();
    }

    @Override // o.IT
    protected boolean e(List<InterfaceC1242Ud> list) {
        return this.h.a(list);
    }

    @Override // o.IT
    protected boolean a() {
        return this.h.e();
    }

    @Override // o.IT
    protected boolean v() {
        return this.h.g();
    }

    @Override // o.IT
    protected boolean y() {
        return this.h.a();
    }

    @Override // o.IT
    protected boolean u() {
        return this.h.b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.IT
    public Request.Priority b() {
        if (this.h.i() == null) {
            return null;
        }
        int i = AnonymousClass5.d[this.h.i().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return null;
                    }
                    return Request.Priority.IMMEDIATE;
                }
                return Request.Priority.NORMAL;
            }
            return Request.Priority.HIGH;
        }
        return Request.Priority.LOW;
    }

    /* renamed from: o.Kj$5  reason: invalid class name */
    /* loaded from: classes3.dex */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[NetworkPriority.values().length];
            d = iArr;
            try {
                iArr[NetworkPriority.e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                d[NetworkPriority.c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                d[NetworkPriority.d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                d[NetworkPriority.a.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Override // o.IT
    protected boolean x() {
        return this.h.d();
    }

    @Override // o.IT
    protected void e(HZ hz) {
        this.h.c(hz);
    }
}
