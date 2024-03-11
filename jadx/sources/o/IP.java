package o;

import com.netflix.mediaclient.android.app.Status;
import java.util.List;

/* loaded from: classes3.dex */
public final class IP extends IQ {
    public static final b a = new b(null);

    @Override // o.IU
    public void a(IY iy, InterfaceC1757aNc interfaceC1757aNc, C1244Uf c1244Uf) {
        C8632dsu.c((Object) iy, "");
    }

    @Override // o.IQ, o.IO
    public boolean a() {
        return true;
    }

    @Override // o.IO
    public void b(InterfaceC1757aNc interfaceC1757aNc, Status status) {
    }

    @Override // o.IQ, o.IO
    public boolean e() {
        return true;
    }

    public IP() {
        super("AgreeTOUTask");
    }

    /* loaded from: classes3.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("AgreeTOUTask");
        }
    }

    @Override // o.IO
    public void c(List<InterfaceC1242Ud> list) {
        C8632dsu.c((Object) list, "");
        InterfaceC1242Ud b2 = IE.b("user", "agreetou");
        C8632dsu.a(b2, "");
        list.add(b2);
    }

    @Override // o.IQ, o.IU
    public void e(HZ hz) {
        C8632dsu.c((Object) hz, "");
        a.getLogTag();
    }
}
