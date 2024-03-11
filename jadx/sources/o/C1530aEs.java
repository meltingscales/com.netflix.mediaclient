package o;

import o.C2432afv;
import o.C2438agA;
import o.C2529ahm;

/* renamed from: o.aEs  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1530aEs extends aEV implements InterfaceC5148btL {
    private final C2438agA.a d;
    private final C2529ahm.e e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1530aEs(C2529ahm.e eVar, C2438agA.a aVar) {
        super(eVar);
        C8632dsu.c((Object) eVar, "");
        C8632dsu.c((Object) aVar, "");
        this.e = eVar;
        this.d = aVar;
    }

    @Override // o.aEV, o.InterfaceC5222bug
    public InterfaceC5149btM getEvidence() {
        String a;
        C2432afv.e e = this.d.c().e();
        if (e == null || (a = e.a()) == null) {
            return null;
        }
        return new d(a);
    }

    /* renamed from: o.aEs$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC5149btM {
        private String b;
        private String d;

        @Override // o.InterfaceC5149btM
        public String getImageKey() {
            return this.d;
        }

        @Override // o.InterfaceC5149btM
        public String getTcardUrl() {
            return this.b;
        }

        d(String str) {
            C2432afv.d d = C1530aEs.this.d.c().d();
            this.d = d != null ? d.d() : null;
            this.b = str;
        }

        @Override // o.InterfaceC5149btM
        public String getImageUrl() {
            C2432afv.d d = C1530aEs.this.d.c().d();
            if (d == null || !C8632dsu.c(d.a(), Boolean.TRUE)) {
                return null;
            }
            return d.b();
        }
    }

    @Override // o.InterfaceC5148btL
    public boolean b() {
        String e;
        return (!C8632dsu.c(this.d.e(), Boolean.TRUE) || (e = this.e.e()) == null || e.length() == 0) ? false : true;
    }

    @Override // o.InterfaceC5148btL
    public boolean c() {
        return C8632dsu.c(this.d.d(), Boolean.TRUE);
    }

    @Override // o.InterfaceC5148btL
    public String a() {
        return this.e.e();
    }

    @Override // o.InterfaceC5148btL
    public String d() {
        C2432afv.b b = this.d.c().b();
        if (b != null) {
            return b.c();
        }
        return null;
    }
}
