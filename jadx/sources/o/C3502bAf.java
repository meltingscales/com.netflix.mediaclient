package o;

import androidx.fragment.app.Fragment;
import com.netflix.mediaclient.ui.collectphone.api.CollectPhone;
import com.netflix.mediaclient.ui.collectphone.impl.collectphone.CollectPhoneFragment;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.rxkotlin.DisposableKt;
import o.AbstractC8918fl;
import o.C3502bAf;
import o.C8632dsu;
import o.C8971gl;
import o.C8974go;
import o.InterfaceC8966gg;
import o.dpR;
import o.drX;

/* renamed from: o.bAf  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3502bAf extends C9943zX<c> {
    public static final e c = new e(null);
    private final CompositeDisposable a;
    private final CollectPhone.e e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3502bAf(c cVar, CollectPhone.e eVar) {
        super(cVar);
        C8632dsu.c((Object) cVar, "");
        C8632dsu.c((Object) eVar, "");
        this.e = eVar;
        this.a = new CompositeDisposable();
    }

    @Override // o.C9943zX, o.AbstractC8919fm, o.AbstractC8899fS
    public void d() {
        super.d();
        this.a.clear();
    }

    public final void i() {
        b(new drM<c, c>() { // from class: com.netflix.mediaclient.ui.collectphone.impl.collectphone.VerifyPhoneViewModel$initialize$1
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: b */
            public final C3502bAf.c invoke(C3502bAf.c cVar) {
                CollectPhone.e eVar;
                C8632dsu.c((Object) cVar, "");
                eVar = C3502bAf.this.e;
                return C3502bAf.c.copy$default(cVar, eVar.e(), null, false, false, null, null, null, 114, null);
            }
        });
        this.a.clear();
        DisposableKt.addTo(b(this.e.h(), new drX<c, AbstractC8918fl<? extends String>, c>() { // from class: com.netflix.mediaclient.ui.collectphone.impl.collectphone.VerifyPhoneViewModel$initialize$2
            {
                super(2);
            }

            @Override // o.drX
            /* renamed from: d */
            public final C3502bAf.c invoke(C3502bAf.c cVar, AbstractC8918fl<String> abstractC8918fl) {
                CollectPhone.e eVar;
                C8632dsu.c((Object) cVar, "");
                C8632dsu.c((Object) abstractC8918fl, "");
                if (abstractC8918fl instanceof C8971gl) {
                    eVar = C3502bAf.this.e;
                    eVar.a((String) ((C8971gl) abstractC8918fl).c());
                    C3502bAf.this.n();
                }
                return C3502bAf.c.copy$default(cVar, null, null, false, false, abstractC8918fl, null, null, 111, null);
            }
        }), this.a);
    }

    public final void c(final String str) {
        C8632dsu.c((Object) str, "");
        this.e.a(str);
        b(new drM<c, c>() { // from class: com.netflix.mediaclient.ui.collectphone.impl.collectphone.VerifyPhoneViewModel$updatePin$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: d */
            public final C3502bAf.c invoke(C3502bAf.c cVar) {
                C8632dsu.c((Object) cVar, "");
                return C3502bAf.c.copy$default(cVar, null, str, false, false, null, null, null, 125, null);
            }
        });
    }

    public final void h() {
        b(this.e.g(), new drX<c, AbstractC8918fl<? extends dpR>, c>() { // from class: com.netflix.mediaclient.ui.collectphone.impl.collectphone.VerifyPhoneViewModel$resendCode$1
            @Override // o.drX
            /* renamed from: c */
            public final C3502bAf.c invoke(C3502bAf.c cVar, AbstractC8918fl<dpR> abstractC8918fl) {
                C8632dsu.c((Object) cVar, "");
                C8632dsu.c((Object) abstractC8918fl, "");
                return C3502bAf.c.copy$default(cVar, null, null, false, false, null, abstractC8918fl, null, 95, null);
            }
        });
    }

    public final void n() {
        e(new drM<c, dpR>() { // from class: com.netflix.mediaclient.ui.collectphone.impl.collectphone.VerifyPhoneViewModel$submit$1
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C3502bAf.c cVar) {
                e(cVar);
                return dpR.c;
            }

            public final void e(C3502bAf.c cVar) {
                CollectPhone.e eVar;
                C8632dsu.c((Object) cVar, "");
                if (cVar.h()) {
                    return;
                }
                C3502bAf c3502bAf = C3502bAf.this;
                eVar = c3502bAf.e;
                c3502bAf.b(eVar.j(), new drX<C3502bAf.c, AbstractC8918fl<? extends dpR>, C3502bAf.c>() { // from class: com.netflix.mediaclient.ui.collectphone.impl.collectphone.VerifyPhoneViewModel$submit$1.1
                    @Override // o.drX
                    /* renamed from: e */
                    public final C3502bAf.c invoke(C3502bAf.c cVar2, AbstractC8918fl<dpR> abstractC8918fl) {
                        C8632dsu.c((Object) cVar2, "");
                        C8632dsu.c((Object) abstractC8918fl, "");
                        return C3502bAf.c.copy$default(cVar2, null, null, false, false, null, null, abstractC8918fl, 63, null);
                    }
                });
            }
        });
    }

    public final void f() {
        b(new drM<c, c>() { // from class: com.netflix.mediaclient.ui.collectphone.impl.collectphone.VerifyPhoneViewModel$markPinAsInvalid$1
            @Override // o.drM
            /* renamed from: c */
            public final C3502bAf.c invoke(C3502bAf.c cVar) {
                C8632dsu.c((Object) cVar, "");
                return C3502bAf.c.copy$default(cVar, null, null, false, true, null, null, C8974go.e, 51, null);
            }
        });
    }

    public final void j() {
        b(new drM<c, c>() { // from class: com.netflix.mediaclient.ui.collectphone.impl.collectphone.VerifyPhoneViewModel$markPinAsExpired$1
            @Override // o.drM
            /* renamed from: a */
            public final C3502bAf.c invoke(C3502bAf.c cVar) {
                C8632dsu.c((Object) cVar, "");
                return C3502bAf.c.copy$default(cVar, null, null, true, false, null, null, C8974go.e, 51, null);
            }
        });
    }

    /* renamed from: o.bAf$e */
    /* loaded from: classes4.dex */
    public static final class e implements InterfaceC8966gg<C3502bAf, c> {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }

        /* renamed from: initialState */
        public c m3157initialState(AbstractC8979gt abstractC8979gt) {
            return (c) InterfaceC8966gg.c.e(this, abstractC8979gt);
        }

        public C3502bAf create(AbstractC8979gt abstractC8979gt, c cVar) {
            CollectPhone.e d;
            C8632dsu.c((Object) abstractC8979gt, "");
            C8632dsu.c((Object) cVar, "");
            C8925fs c8925fs = abstractC8979gt instanceof C8925fs ? (C8925fs) abstractC8979gt : null;
            Fragment e = c8925fs != null ? c8925fs.e() : null;
            CollectPhoneFragment collectPhoneFragment = e instanceof CollectPhoneFragment ? (CollectPhoneFragment) e : null;
            if (collectPhoneFragment == null || (d = collectPhoneFragment.d()) == null) {
                return null;
            }
            return new C3502bAf(cVar, d);
        }
    }

    /* renamed from: o.bAf$c */
    /* loaded from: classes4.dex */
    public static final class c implements InterfaceC8962gc {
        private final String a;
        private final boolean b;
        private final AbstractC8918fl<String> c;
        private final String d;
        private final boolean e;
        private final AbstractC8918fl<dpR> h;
        private final AbstractC8918fl<dpR> j;

        public c() {
            this(null, null, false, false, null, null, null, 127, null);
        }

        public static /* synthetic */ c copy$default(c cVar, String str, String str2, boolean z, boolean z2, AbstractC8918fl abstractC8918fl, AbstractC8918fl abstractC8918fl2, AbstractC8918fl abstractC8918fl3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = cVar.a;
            }
            if ((i & 2) != 0) {
                str2 = cVar.d;
            }
            String str3 = str2;
            if ((i & 4) != 0) {
                z = cVar.b;
            }
            boolean z3 = z;
            if ((i & 8) != 0) {
                z2 = cVar.e;
            }
            boolean z4 = z2;
            AbstractC8918fl<String> abstractC8918fl4 = abstractC8918fl;
            if ((i & 16) != 0) {
                abstractC8918fl4 = cVar.c;
            }
            AbstractC8918fl abstractC8918fl5 = abstractC8918fl4;
            AbstractC8918fl<dpR> abstractC8918fl6 = abstractC8918fl2;
            if ((i & 32) != 0) {
                abstractC8918fl6 = cVar.j;
            }
            AbstractC8918fl abstractC8918fl7 = abstractC8918fl6;
            AbstractC8918fl<dpR> abstractC8918fl8 = abstractC8918fl3;
            if ((i & 64) != 0) {
                abstractC8918fl8 = cVar.h;
            }
            return cVar.d(str, str3, z3, z4, abstractC8918fl5, abstractC8918fl7, abstractC8918fl8);
        }

        public final boolean a() {
            return this.b;
        }

        public final String c() {
            return this.a;
        }

        public final String component1() {
            return this.a;
        }

        public final String component2() {
            return this.d;
        }

        public final boolean component3() {
            return this.b;
        }

        public final boolean component4() {
            return this.e;
        }

        public final AbstractC8918fl<String> component5() {
            return this.c;
        }

        public final AbstractC8918fl<dpR> component6() {
            return this.j;
        }

        public final AbstractC8918fl<dpR> component7() {
            return this.h;
        }

        public final c d(String str, String str2, boolean z, boolean z2, AbstractC8918fl<String> abstractC8918fl, AbstractC8918fl<dpR> abstractC8918fl2, AbstractC8918fl<dpR> abstractC8918fl3) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            C8632dsu.c((Object) abstractC8918fl, "");
            C8632dsu.c((Object) abstractC8918fl2, "");
            C8632dsu.c((Object) abstractC8918fl3, "");
            return new c(str, str2, z, z2, abstractC8918fl, abstractC8918fl2, abstractC8918fl3);
        }

        public final AbstractC8918fl<dpR> d() {
            return this.h;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.a, (Object) cVar.a) && C8632dsu.c((Object) this.d, (Object) cVar.d) && this.b == cVar.b && this.e == cVar.e && C8632dsu.c(this.c, cVar.c) && C8632dsu.c(this.j, cVar.j) && C8632dsu.c(this.h, cVar.h);
            }
            return false;
        }

        public int hashCode() {
            return (((((((((((this.a.hashCode() * 31) + this.d.hashCode()) * 31) + Boolean.hashCode(this.b)) * 31) + Boolean.hashCode(this.e)) * 31) + this.c.hashCode()) * 31) + this.j.hashCode()) * 31) + this.h.hashCode();
        }

        public final boolean i() {
            return this.e;
        }

        public String toString() {
            String str = this.a;
            String str2 = this.d;
            boolean z = this.b;
            boolean z2 = this.e;
            AbstractC8918fl<String> abstractC8918fl = this.c;
            AbstractC8918fl<dpR> abstractC8918fl2 = this.j;
            AbstractC8918fl<dpR> abstractC8918fl3 = this.h;
            return "State(phoneNumber=" + str + ", pin=" + str2 + ", isPinExpired=" + z + ", isPinInvalid=" + z2 + ", autoPin=" + abstractC8918fl + ", resendCode=" + abstractC8918fl2 + ", submission=" + abstractC8918fl3 + ")";
        }

        public c(String str, String str2, boolean z, boolean z2, AbstractC8918fl<String> abstractC8918fl, AbstractC8918fl<dpR> abstractC8918fl2, AbstractC8918fl<dpR> abstractC8918fl3) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            C8632dsu.c((Object) abstractC8918fl, "");
            C8632dsu.c((Object) abstractC8918fl2, "");
            C8632dsu.c((Object) abstractC8918fl3, "");
            this.a = str;
            this.d = str2;
            this.b = z;
            this.e = z2;
            this.c = abstractC8918fl;
            this.j = abstractC8918fl2;
            this.h = abstractC8918fl3;
        }

        public /* synthetic */ c(String str, String str2, boolean z, boolean z2, AbstractC8918fl abstractC8918fl, AbstractC8918fl abstractC8918fl2, AbstractC8918fl abstractC8918fl3, int i, C8627dsp c8627dsp) {
            this((i & 1) != 0 ? "" : str, (i & 2) == 0 ? str2 : "", (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? C8974go.e : abstractC8918fl, (i & 32) != 0 ? C8974go.e : abstractC8918fl2, (i & 64) != 0 ? C8974go.e : abstractC8918fl3);
        }

        public final boolean e() {
            return this.d.length() == 6;
        }

        public final boolean h() {
            return this.h instanceof C8932fz;
        }

        public final boolean j() {
            return this.h instanceof C8971gl;
        }

        public final String b() {
            AbstractC8918fl<String> abstractC8918fl = this.c;
            C8971gl c8971gl = abstractC8918fl instanceof C8971gl ? (C8971gl) abstractC8918fl : null;
            if (c8971gl != null) {
                return (String) c8971gl.c();
            }
            return null;
        }
    }
}
