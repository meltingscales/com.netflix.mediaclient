package o;

import java.lang.annotation.Annotation;
import java.util.List;

/* loaded from: classes5.dex */
public final class dEC implements dBT<dEB> {
    public static final dEC d = new dEC();
    private static final InterfaceC7707dCj c = c.e;

    @Override // o.dBT, o.dBZ, o.dBP
    public InterfaceC7707dCj e() {
        return c;
    }

    private dEC() {
    }

    /* loaded from: classes5.dex */
    static final class c implements InterfaceC7707dCj {
        private final /* synthetic */ InterfaceC7707dCj a = C7706dCi.e(dEF.a).e();
        public static final c e = new c();
        private static final String c = "kotlinx.serialization.json.JsonArray";

        @Override // o.InterfaceC7707dCj
        public String a(int i) {
            return this.a.a(i);
        }

        @Override // o.InterfaceC7707dCj
        public boolean a() {
            return this.a.a();
        }

        @Override // o.InterfaceC7707dCj
        public int b(String str) {
            C8632dsu.c((Object) str, "");
            return this.a.b(str);
        }

        @Override // o.InterfaceC7707dCj
        public AbstractC7715dCr b() {
            return this.a.b();
        }

        @Override // o.InterfaceC7707dCj
        public List<Annotation> c() {
            return this.a.c();
        }

        @Override // o.InterfaceC7707dCj
        public InterfaceC7707dCj c(int i) {
            return this.a.c(i);
        }

        @Override // o.InterfaceC7707dCj
        public String d() {
            return c;
        }

        @Override // o.InterfaceC7707dCj
        public List<Annotation> d(int i) {
            return this.a.d(i);
        }

        @Override // o.InterfaceC7707dCj
        public int e() {
            return this.a.e();
        }

        @Override // o.InterfaceC7707dCj
        public boolean e(int i) {
            return this.a.e(i);
        }

        @Override // o.InterfaceC7707dCj
        public boolean i() {
            return this.a.i();
        }

        private c() {
        }
    }

    @Override // o.dBZ
    /* renamed from: a */
    public void e(InterfaceC7721dCx interfaceC7721dCx, dEB deb) {
        C8632dsu.c((Object) interfaceC7721dCx, "");
        C8632dsu.c((Object) deb, "");
        dEE.e(interfaceC7721dCx);
        C7706dCi.e(dEF.a).e(interfaceC7721dCx, deb);
    }

    @Override // o.dBP
    /* renamed from: e */
    public dEB b(InterfaceC7720dCw interfaceC7720dCw) {
        C8632dsu.c((Object) interfaceC7720dCw, "");
        dEE.b(interfaceC7720dCw);
        return new dEB((List) C7706dCi.e(dEF.a).b(interfaceC7720dCw));
    }
}
