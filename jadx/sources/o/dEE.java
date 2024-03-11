package o;

import java.lang.annotation.Annotation;
import java.util.List;
import o.InterfaceC7707dCj;

/* loaded from: classes5.dex */
public final class dEE {
    public static final /* synthetic */ void c(InterfaceC7721dCx interfaceC7721dCx) {
        e(interfaceC7721dCx);
    }

    public static final void e(InterfaceC7721dCx interfaceC7721dCx) {
        b(interfaceC7721dCx);
    }

    public static final void b(InterfaceC7720dCw interfaceC7720dCw) {
        e(interfaceC7720dCw);
    }

    public static final dEH e(InterfaceC7720dCw interfaceC7720dCw) {
        C8632dsu.c((Object) interfaceC7720dCw, "");
        dEH deh = interfaceC7720dCw instanceof dEH ? (dEH) interfaceC7720dCw : null;
        if (deh != null) {
            return deh;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got " + dsA.a(interfaceC7720dCw.getClass()));
    }

    public static final dEN b(InterfaceC7721dCx interfaceC7721dCx) {
        C8632dsu.c((Object) interfaceC7721dCx, "");
        dEN den = interfaceC7721dCx instanceof dEN ? (dEN) interfaceC7721dCx : null;
        if (den != null) {
            return den;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got " + dsA.a(interfaceC7721dCx.getClass()));
    }

    /* loaded from: classes5.dex */
    public static final class e implements InterfaceC7707dCj {
        private final InterfaceC8554dpx e;

        e(drO<? extends InterfaceC7707dCj> dro) {
            InterfaceC8554dpx b;
            b = dpB.b(dro);
            this.e = b;
        }

        @Override // o.InterfaceC7707dCj
        public boolean a() {
            return InterfaceC7707dCj.a.d(this);
        }

        @Override // o.InterfaceC7707dCj
        public List<Annotation> c() {
            return InterfaceC7707dCj.a.e(this);
        }

        @Override // o.InterfaceC7707dCj
        public boolean i() {
            return InterfaceC7707dCj.a.c(this);
        }

        private final InterfaceC7707dCj j() {
            return (InterfaceC7707dCj) this.e.getValue();
        }

        @Override // o.InterfaceC7707dCj
        public String d() {
            return j().d();
        }

        @Override // o.InterfaceC7707dCj
        public AbstractC7715dCr b() {
            return j().b();
        }

        @Override // o.InterfaceC7707dCj
        public int e() {
            return j().e();
        }

        @Override // o.InterfaceC7707dCj
        public String a(int i) {
            return j().a(i);
        }

        @Override // o.InterfaceC7707dCj
        public int b(String str) {
            C8632dsu.c((Object) str, "");
            return j().b(str);
        }

        @Override // o.InterfaceC7707dCj
        public List<Annotation> d(int i) {
            return j().d(i);
        }

        @Override // o.InterfaceC7707dCj
        public InterfaceC7707dCj c(int i) {
            return j().c(i);
        }

        @Override // o.InterfaceC7707dCj
        public boolean e(int i) {
            return j().e(i);
        }
    }

    public static final InterfaceC7707dCj d(drO<? extends InterfaceC7707dCj> dro) {
        return new e(dro);
    }
}
