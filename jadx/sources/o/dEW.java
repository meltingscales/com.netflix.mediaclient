package o;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class dEW implements dBT<dEP> {
    public static final dEW b = new dEW();
    private static final InterfaceC7707dCj a = c.d;

    @Override // o.dBT, o.dBZ, o.dBP
    public InterfaceC7707dCj e() {
        return a;
    }

    private dEW() {
    }

    /* loaded from: classes5.dex */
    static final class c implements InterfaceC7707dCj {
        private final /* synthetic */ InterfaceC7707dCj b = C7706dCi.a(C7706dCi.b(dsE.b), dEF.a).e();
        public static final c d = new c();
        private static final String a = "kotlinx.serialization.json.JsonObject";

        @Override // o.InterfaceC7707dCj
        public String a(int i) {
            return this.b.a(i);
        }

        @Override // o.InterfaceC7707dCj
        public boolean a() {
            return this.b.a();
        }

        @Override // o.InterfaceC7707dCj
        public int b(String str) {
            C8632dsu.c((Object) str, "");
            return this.b.b(str);
        }

        @Override // o.InterfaceC7707dCj
        public AbstractC7715dCr b() {
            return this.b.b();
        }

        @Override // o.InterfaceC7707dCj
        public List<Annotation> c() {
            return this.b.c();
        }

        @Override // o.InterfaceC7707dCj
        public InterfaceC7707dCj c(int i) {
            return this.b.c(i);
        }

        @Override // o.InterfaceC7707dCj
        public String d() {
            return a;
        }

        @Override // o.InterfaceC7707dCj
        public List<Annotation> d(int i) {
            return this.b.d(i);
        }

        @Override // o.InterfaceC7707dCj
        public int e() {
            return this.b.e();
        }

        @Override // o.InterfaceC7707dCj
        public boolean e(int i) {
            return this.b.e(i);
        }

        @Override // o.InterfaceC7707dCj
        public boolean i() {
            return this.b.i();
        }

        private c() {
        }
    }

    @Override // o.dBZ
    /* renamed from: a */
    public void e(InterfaceC7721dCx interfaceC7721dCx, dEP dep) {
        C8632dsu.c((Object) interfaceC7721dCx, "");
        C8632dsu.c((Object) dep, "");
        dEE.e(interfaceC7721dCx);
        C7706dCi.a(C7706dCi.b(dsE.b), dEF.a).e(interfaceC7721dCx, dep);
    }

    @Override // o.dBP
    /* renamed from: a */
    public dEP b(InterfaceC7720dCw interfaceC7720dCw) {
        C8632dsu.c((Object) interfaceC7720dCw, "");
        dEE.b(interfaceC7720dCw);
        return new dEP((Map) C7706dCi.a(C7706dCi.b(dsE.b), dEF.a).b(interfaceC7720dCw));
    }
}
