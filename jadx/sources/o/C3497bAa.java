package o;

import androidx.fragment.app.Fragment;
import com.netflix.mediaclient.ui.collectphone.api.CollectPhone;
import com.netflix.mediaclient.ui.collectphone.impl.collectphone.CollectPhoneFragment;
import java.util.List;
import o.AbstractC8918fl;
import o.C3497bAa;
import o.C8632dsu;
import o.C8927fu;
import o.C8974go;
import o.InterfaceC8966gg;
import o.dpR;

/* renamed from: o.bAa  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3497bAa extends C9943zX<e> {
    public static final c d = new c(null);
    private final CollectPhone.e b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3497bAa(e eVar, CollectPhone.e eVar2) {
        super(eVar);
        C8632dsu.c((Object) eVar, "");
        C8632dsu.c((Object) eVar2, "");
        this.b = eVar2;
        i();
    }

    private final void i() {
        b(this.b.a(), new drX<e, AbstractC8918fl<? extends dpR>, e>() { // from class: com.netflix.mediaclient.ui.collectphone.impl.collectphone.CollectPhoneViewModel$initialize$1
            {
                super(2);
            }

            @Override // o.drX
            /* renamed from: e */
            public final C3497bAa.e invoke(C3497bAa.e eVar, AbstractC8918fl<dpR> abstractC8918fl) {
                CollectPhone.e eVar2;
                CollectPhone.e eVar3;
                C8632dsu.c((Object) eVar, "");
                C8632dsu.c((Object) abstractC8918fl, "");
                eVar2 = C3497bAa.this.b;
                List<CollectPhone.d> b = eVar2.b();
                eVar3 = C3497bAa.this.b;
                return C3497bAa.e.copy$default(eVar, abstractC8918fl, b, eVar3.d(), false, false, null, 56, null);
            }
        });
    }

    public final void c(final CollectPhone.d dVar) {
        C8632dsu.c((Object) dVar, "");
        this.b.e(dVar.b());
        b(new drM<e, e>() { // from class: com.netflix.mediaclient.ui.collectphone.impl.collectphone.CollectPhoneViewModel$updateSelectedCountry$1
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: c */
            public final C3497bAa.e invoke(C3497bAa.e eVar) {
                C8632dsu.c((Object) eVar, "");
                return C3497bAa.e.copy$default(eVar, null, null, CollectPhone.d.this, false, false, null, 59, null);
            }
        });
    }

    public final void e(String str) {
        C8632dsu.c((Object) str, "");
        this.b.d(str);
        b(new drM<e, e>() { // from class: com.netflix.mediaclient.ui.collectphone.impl.collectphone.CollectPhoneViewModel$updatePhoneNumber$1
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: b */
            public final C3497bAa.e invoke(C3497bAa.e eVar) {
                CollectPhone.e eVar2;
                C8632dsu.c((Object) eVar, "");
                eVar2 = C3497bAa.this.b;
                return C3497bAa.e.copy$default(eVar, null, null, null, eVar2.c(), false, null, 55, null);
            }
        });
    }

    public final void j() {
        b(new drM<e, e>() { // from class: com.netflix.mediaclient.ui.collectphone.impl.collectphone.CollectPhoneViewModel$markPhoneNumberAsInvalid$1
            @Override // o.drM
            /* renamed from: d */
            public final C3497bAa.e invoke(C3497bAa.e eVar) {
                C8632dsu.c((Object) eVar, "");
                return C3497bAa.e.copy$default(eVar, null, null, null, false, false, C8974go.e, 23, null);
            }
        });
    }

    public final void h() {
        b(this.b.i(), new drX<e, AbstractC8918fl<? extends dpR>, e>() { // from class: com.netflix.mediaclient.ui.collectphone.impl.collectphone.CollectPhoneViewModel$submit$1
            @Override // o.drX
            /* renamed from: d */
            public final C3497bAa.e invoke(C3497bAa.e eVar, AbstractC8918fl<dpR> abstractC8918fl) {
                C8632dsu.c((Object) eVar, "");
                C8632dsu.c((Object) abstractC8918fl, "");
                return C3497bAa.e.copy$default(eVar, null, null, null, false, abstractC8918fl instanceof C8927fu, abstractC8918fl, 15, null);
            }
        });
    }

    public final void f() {
        b(new drM<e, e>() { // from class: com.netflix.mediaclient.ui.collectphone.impl.collectphone.CollectPhoneViewModel$revertSubmission$1
            @Override // o.drM
            /* renamed from: e */
            public final C3497bAa.e invoke(C3497bAa.e eVar) {
                C8632dsu.c((Object) eVar, "");
                return C3497bAa.e.copy$default(eVar, null, null, null, false, false, C8974go.e, 31, null);
            }
        });
        b(this.b.f(), new drX<e, AbstractC8918fl<? extends dpR>, e>() { // from class: com.netflix.mediaclient.ui.collectphone.impl.collectphone.CollectPhoneViewModel$revertSubmission$2
            @Override // o.drX
            /* renamed from: a */
            public final C3497bAa.e invoke(C3497bAa.e eVar, AbstractC8918fl<dpR> abstractC8918fl) {
                C8632dsu.c((Object) eVar, "");
                C8632dsu.c((Object) abstractC8918fl, "");
                return eVar;
            }
        });
    }

    /* renamed from: o.bAa$c */
    /* loaded from: classes4.dex */
    public static final class c implements InterfaceC8966gg<C3497bAa, e> {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }

        /* renamed from: initialState */
        public e m3156initialState(AbstractC8979gt abstractC8979gt) {
            return (e) InterfaceC8966gg.c.e(this, abstractC8979gt);
        }

        public C3497bAa create(AbstractC8979gt abstractC8979gt, e eVar) {
            CollectPhone.e d;
            C8632dsu.c((Object) abstractC8979gt, "");
            C8632dsu.c((Object) eVar, "");
            C8925fs c8925fs = abstractC8979gt instanceof C8925fs ? (C8925fs) abstractC8979gt : null;
            Fragment e = c8925fs != null ? c8925fs.e() : null;
            CollectPhoneFragment collectPhoneFragment = e instanceof CollectPhoneFragment ? (CollectPhoneFragment) e : null;
            if (collectPhoneFragment == null || (d = collectPhoneFragment.d()) == null) {
                return null;
            }
            return new C3497bAa(eVar, d);
        }
    }

    /* renamed from: o.bAa$e */
    /* loaded from: classes4.dex */
    public static final class e implements InterfaceC8962gc {
        private final CollectPhone.d a;
        private final boolean b;
        private final AbstractC8918fl<dpR> c;
        private final List<CollectPhone.d> d;
        private final boolean e;
        private final AbstractC8918fl<dpR> g;

        public e() {
            this(null, null, null, false, false, null, 63, null);
        }

        public static /* synthetic */ e copy$default(e eVar, AbstractC8918fl abstractC8918fl, List list, CollectPhone.d dVar, boolean z, boolean z2, AbstractC8918fl abstractC8918fl2, int i, Object obj) {
            AbstractC8918fl<dpR> abstractC8918fl3 = abstractC8918fl;
            if ((i & 1) != 0) {
                abstractC8918fl3 = eVar.c;
            }
            List<CollectPhone.d> list2 = list;
            if ((i & 2) != 0) {
                list2 = eVar.d;
            }
            List list3 = list2;
            if ((i & 4) != 0) {
                dVar = eVar.a;
            }
            CollectPhone.d dVar2 = dVar;
            if ((i & 8) != 0) {
                z = eVar.e;
            }
            boolean z3 = z;
            if ((i & 16) != 0) {
                z2 = eVar.b;
            }
            boolean z4 = z2;
            AbstractC8918fl<dpR> abstractC8918fl4 = abstractC8918fl2;
            if ((i & 32) != 0) {
                abstractC8918fl4 = eVar.g;
            }
            return eVar.e(abstractC8918fl3, list3, dVar2, z3, z4, abstractC8918fl4);
        }

        public final boolean a() {
            return this.b;
        }

        public final AbstractC8918fl<dpR> b() {
            return this.g;
        }

        public final List<CollectPhone.d> c() {
            return this.d;
        }

        public final AbstractC8918fl<dpR> component1() {
            return this.c;
        }

        public final List<CollectPhone.d> component2() {
            return this.d;
        }

        public final CollectPhone.d component3() {
            return this.a;
        }

        public final boolean component4() {
            return this.e;
        }

        public final boolean component5() {
            return this.b;
        }

        public final AbstractC8918fl<dpR> component6() {
            return this.g;
        }

        public final AbstractC8918fl<dpR> d() {
            return this.c;
        }

        public final CollectPhone.d e() {
            return this.a;
        }

        public final e e(AbstractC8918fl<dpR> abstractC8918fl, List<CollectPhone.d> list, CollectPhone.d dVar, boolean z, boolean z2, AbstractC8918fl<dpR> abstractC8918fl2) {
            C8632dsu.c((Object) abstractC8918fl, "");
            C8632dsu.c((Object) list, "");
            C8632dsu.c((Object) abstractC8918fl2, "");
            return new e(abstractC8918fl, list, dVar, z, z2, abstractC8918fl2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c(this.c, eVar.c) && C8632dsu.c(this.d, eVar.d) && C8632dsu.c(this.a, eVar.a) && this.e == eVar.e && this.b == eVar.b && C8632dsu.c(this.g, eVar.g);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.c.hashCode();
            int hashCode2 = this.d.hashCode();
            CollectPhone.d dVar = this.a;
            return (((((((((hashCode * 31) + hashCode2) * 31) + (dVar == null ? 0 : dVar.hashCode())) * 31) + Boolean.hashCode(this.e)) * 31) + Boolean.hashCode(this.b)) * 31) + this.g.hashCode();
        }

        public final boolean i() {
            return this.e;
        }

        public String toString() {
            AbstractC8918fl<dpR> abstractC8918fl = this.c;
            List<CollectPhone.d> list = this.d;
            CollectPhone.d dVar = this.a;
            boolean z = this.e;
            boolean z2 = this.b;
            AbstractC8918fl<dpR> abstractC8918fl2 = this.g;
            return "State(initialization=" + abstractC8918fl + ", countryList=" + list + ", selectedCountry=" + dVar + ", isPhoneNumberValid=" + z + ", shouldShowValidationErrors=" + z2 + ", submission=" + abstractC8918fl2 + ")";
        }

        public e(AbstractC8918fl<dpR> abstractC8918fl, List<CollectPhone.d> list, CollectPhone.d dVar, boolean z, boolean z2, AbstractC8918fl<dpR> abstractC8918fl2) {
            C8632dsu.c((Object) abstractC8918fl, "");
            C8632dsu.c((Object) list, "");
            C8632dsu.c((Object) abstractC8918fl2, "");
            this.c = abstractC8918fl;
            this.d = list;
            this.a = dVar;
            this.e = z;
            this.b = z2;
            this.g = abstractC8918fl2;
        }

        public /* synthetic */ e(AbstractC8918fl abstractC8918fl, List list, CollectPhone.d dVar, boolean z, boolean z2, AbstractC8918fl abstractC8918fl2, int i, C8627dsp c8627dsp) {
            this((i & 1) != 0 ? C8974go.e : abstractC8918fl, (i & 2) != 0 ? C8569dql.i() : list, (i & 4) != 0 ? null : dVar, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? C8974go.e : abstractC8918fl2);
        }

        public final boolean g() {
            return this.c instanceof InterfaceC8881fA;
        }

        public final boolean f() {
            return this.g instanceof C8932fz;
        }

        public final boolean h() {
            return this.g instanceof C8971gl;
        }
    }
}
