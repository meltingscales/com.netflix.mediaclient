package com.netflix.mediaclient.ui.games.impl.identity;

import android.content.Context;
import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel;
import kotlin.text.Regex;
import kotlinx.coroutines.CoroutineExceptionHandler;
import o.AbstractApplicationC1040Mh;
import o.AbstractC8918fl;
import o.AbstractC8979gt;
import o.C1044Mm;
import o.C1332Xp;
import o.C2313adr;
import o.C2381afF;
import o.C8600drp;
import o.C8627dsp;
import o.C8632dsu;
import o.C8737dwr;
import o.C8927fu;
import o.C8932fz;
import o.C8974go;
import o.C9935zP;
import o.C9943zX;
import o.InterfaceC5283bvo;
import o.InterfaceC8554dpx;
import o.InterfaceC8598drn;
import o.InterfaceC8906fZ;
import o.InterfaceC8962gc;
import o.aCG;
import o.bQA;
import o.bQC;
import o.dpB;
import o.dpR;
import o.dqT;
import o.dqZ;
import o.drM;
import o.drO;
import o.dxD;

/* loaded from: classes4.dex */
public final class IdentityViewModel extends C9943zX<b> {
    public static final c b = new c(null);
    private static final Regex c = new Regex("^[\\p{script=latin}0-9]{3,16}$");
    private dxD a;
    private final bQA d;
    private final InterfaceC8554dpx e;
    private String f;
    private dxD g;
    private Regex h;
    private int i;
    private int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdentityViewModel(b bVar) {
        super(bVar);
        InterfaceC8554dpx b2;
        C8632dsu.c((Object) bVar, "");
        this.i = 3;
        this.j = 16;
        this.h = c;
        this.d = new bQA();
        b2 = dpB.b(new drO<aCG>() { // from class: com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$graphqlRepository$2
            @Override // o.drO
            /* renamed from: d */
            public final aCG invoke() {
                C1332Xp c1332Xp = C1332Xp.b;
                Context context = (Context) C1332Xp.b(Context.class);
                UserAgent k = AbstractApplicationC1040Mh.getInstance().i().k();
                InterfaceC5283bvo j2 = k != null ? k.j() : null;
                if (j2 == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                C8632dsu.a(j2, "");
                return aCG.b.e(context, j2);
            }
        });
        this.e = b2;
    }

    /* loaded from: classes4.dex */
    public static final class c implements InterfaceC8906fZ<IdentityViewModel, b> {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }

        public IdentityViewModel create(AbstractC8979gt abstractC8979gt, b bVar) {
            return (IdentityViewModel) InterfaceC8906fZ.b.d(this, abstractC8979gt, bVar);
        }

        /* renamed from: initialState */
        public b m3021initialState(AbstractC8979gt abstractC8979gt) {
            C8632dsu.c((Object) abstractC8979gt, "");
            return new b(null, null, null, null, null, 31, null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class g extends dqT implements CoroutineExceptionHandler {
        final /* synthetic */ IdentityViewModel a;
        final /* synthetic */ C9935zP b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(CoroutineExceptionHandler.c cVar, IdentityViewModel identityViewModel, C9935zP c9935zP) {
            super(cVar);
            this.a = identityViewModel;
            this.b = c9935zP;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(dqZ dqz, final Throwable th) {
            this.a.b(new drM<b, b>() { // from class: com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$setHandle$handler$1$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                /* renamed from: c */
                public final IdentityViewModel.b invoke(IdentityViewModel.b bVar) {
                    C8632dsu.c((Object) bVar, "");
                    return IdentityViewModel.b.copy$default(bVar, null, null, null, new C8927fu(th, null, 2, null), null, 23, null);
                }
            });
            this.b.b(bQC.a.class, new bQC.a(SetHandleErrorType.a, null, 2, null));
        }
    }

    /* loaded from: classes4.dex */
    public static final class h extends dqT implements CoroutineExceptionHandler {
        final /* synthetic */ IdentityViewModel c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(CoroutineExceptionHandler.c cVar, IdentityViewModel identityViewModel) {
            super(cVar);
            this.c = identityViewModel;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(dqZ dqz, final Throwable th) {
            this.c.b(new drM<b, b>() { // from class: com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$fetchConfig$handler$1$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                /* renamed from: c */
                public final IdentityViewModel.b invoke(IdentityViewModel.b bVar) {
                    C8632dsu.c((Object) bVar, "");
                    return IdentityViewModel.b.copy$default(bVar, null, null, null, null, new C8927fu(th, null, 2, null), 15, null);
                }
            });
            C1044Mm.e("IdentityViewModel", "fetchHandleConfig: failed. Using client fallback");
        }
    }

    /* loaded from: classes4.dex */
    public static final class j extends dqT implements CoroutineExceptionHandler {
        final /* synthetic */ IdentityViewModel b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(CoroutineExceptionHandler.c cVar, IdentityViewModel identityViewModel) {
            super(cVar);
            this.b = identityViewModel;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(dqZ dqz, final Throwable th) {
            this.b.b(new drM<b, b>() { // from class: com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$checkHandleAvailability$handler$1$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                /* renamed from: e */
                public final IdentityViewModel.b invoke(IdentityViewModel.b bVar) {
                    C8632dsu.c((Object) bVar, "");
                    return IdentityViewModel.b.copy$default(bVar, null, null, new C8927fu(th, IdentityViewModel.a.i.a), null, null, 27, null);
                }
            });
            bQA.e(this.b.d, a.i.a.d(), false, 2, null);
        }
    }

    private final aCG f() {
        return (aCG) this.e.getValue();
    }

    public final void i() {
        b(new drM<b, b>() { // from class: com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$fetchConfig$1
            @Override // o.drM
            /* renamed from: b */
            public final IdentityViewModel.b invoke(IdentityViewModel.b bVar) {
                C8632dsu.c((Object) bVar, "");
                return IdentityViewModel.b.copy$default(bVar, null, null, null, null, new C8932fz(null, 1, null), 15, null);
            }
        });
        C8737dwr.c(e(), new h(CoroutineExceptionHandler.Key, this), null, new IdentityViewModel$fetchConfig$2(this, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(o.InterfaceC8585dra<? super o.dpR> r13) {
        /*
            Method dump skipped, instructions count: 421
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel.c(o.dra):java.lang.Object");
    }

    public final void c(C9935zP c9935zP, String str) {
        dxD c2;
        C8632dsu.c((Object) c9935zP, "");
        C8632dsu.c((Object) str, "");
        dxD dxd = this.g;
        if (dxd != null) {
            dxD.b.b(dxd, null, 1, null);
        }
        b(new drM<b, b>() { // from class: com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$setHandle$1
            @Override // o.drM
            /* renamed from: e */
            public final IdentityViewModel.b invoke(IdentityViewModel.b bVar) {
                C8632dsu.c((Object) bVar, "");
                return IdentityViewModel.b.copy$default(bVar, null, null, null, new C8932fz(null, 1, null), null, 23, null);
            }
        });
        c2 = C8737dwr.c(e(), new g(CoroutineExceptionHandler.Key, this, c9935zP), null, new IdentityViewModel$setHandle$2(this, str, c9935zP, null), 2, null);
        this.g = c2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b6  */
    /* JADX WARN: Type inference failed for: r14v17, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v38, types: [T, o.bQC$a] */
    /* JADX WARN: Type inference failed for: r2v41, types: [T, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r13, o.InterfaceC8585dra<? super o.bQC> r14) {
        /*
            Method dump skipped, instructions count: 466
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel.a(java.lang.String, o.dra):java.lang.Object");
    }

    public final void c(final String str) {
        dxD c2;
        C8632dsu.c((Object) str, "");
        dxD dxd = this.a;
        if (dxd != null) {
            dxD.b.b(dxd, null, 1, null);
        }
        b(new drM<b, b>() { // from class: com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$checkHandleAvailability$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: c */
            public final IdentityViewModel.b invoke(IdentityViewModel.b bVar) {
                C8632dsu.c((Object) bVar, "");
                return IdentityViewModel.b.copy$default(bVar, null, str, null, null, null, 29, null);
            }
        });
        b(new drM<b, b>() { // from class: com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$checkHandleAvailability$2
            @Override // o.drM
            /* renamed from: a */
            public final IdentityViewModel.b invoke(IdentityViewModel.b bVar) {
                C8632dsu.c((Object) bVar, "");
                return IdentityViewModel.b.copy$default(bVar, null, null, new C8932fz(IdentityViewModel.a.C0067a.a), null, null, 27, null);
            }
        });
        this.d.b();
        c2 = C8737dwr.c(e(), new j(CoroutineExceptionHandler.Key, this), null, new IdentityViewModel$checkHandleAvailability$3(str, this, null), 2, null);
        this.a = c2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(java.lang.String r12, o.InterfaceC8585dra<? super o.dpR> r13) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel.c(java.lang.String, o.dra):java.lang.Object");
    }

    public final void h() {
        e(new drM<b, dpR>() { // from class: com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$handleNetworkChange$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(IdentityViewModel.b bVar) {
                b(bVar);
                return dpR.c;
            }

            public final void b(IdentityViewModel.b bVar) {
                C8632dsu.c((Object) bVar, "");
                String c2 = bVar.c();
                if (c2 == null || c2.length() == 0) {
                    return;
                }
                IdentityViewModel.this.c(bVar.c());
            }
        });
    }

    private final d c(C2313adr c2313adr) {
        C2313adr.b b2;
        C2381afF b3;
        C2313adr.f d2;
        C2381afF b4;
        return new d((c2313adr == null || (d2 = c2313adr.d()) == null || (b4 = d2.b()) == null) ? null : b4.c(), (c2313adr == null || (b2 = c2313adr.b()) == null || (b3 = b2.b()) == null) ? null : b3.c(), c2313adr != null ? c2313adr.e() : null);
    }

    /* loaded from: classes4.dex */
    public static final class b implements InterfaceC8962gc {
        private final AbstractC8918fl<a> a;
        private final String b;
        private final AbstractC8918fl<e> c;
        private final String d;
        private final AbstractC8918fl<Boolean> e;

        public b() {
            this(null, null, null, null, null, 31, null);
        }

        public static /* synthetic */ b copy$default(b bVar, String str, String str2, AbstractC8918fl abstractC8918fl, AbstractC8918fl abstractC8918fl2, AbstractC8918fl abstractC8918fl3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = bVar.d;
            }
            if ((i & 2) != 0) {
                str2 = bVar.b;
            }
            String str3 = str2;
            AbstractC8918fl<a> abstractC8918fl4 = abstractC8918fl;
            if ((i & 4) != 0) {
                abstractC8918fl4 = bVar.a;
            }
            AbstractC8918fl abstractC8918fl5 = abstractC8918fl4;
            AbstractC8918fl<Boolean> abstractC8918fl6 = abstractC8918fl2;
            if ((i & 8) != 0) {
                abstractC8918fl6 = bVar.e;
            }
            AbstractC8918fl abstractC8918fl7 = abstractC8918fl6;
            AbstractC8918fl<e> abstractC8918fl8 = abstractC8918fl3;
            if ((i & 16) != 0) {
                abstractC8918fl8 = bVar.c;
            }
            return bVar.e(str, str3, abstractC8918fl5, abstractC8918fl7, abstractC8918fl8);
        }

        public final String a() {
            return this.d;
        }

        public final AbstractC8918fl<a> b() {
            return this.a;
        }

        public final String c() {
            return this.b;
        }

        public final String component1() {
            return this.d;
        }

        public final String component2() {
            return this.b;
        }

        public final AbstractC8918fl<a> component3() {
            return this.a;
        }

        public final AbstractC8918fl<Boolean> component4() {
            return this.e;
        }

        public final AbstractC8918fl<e> component5() {
            return this.c;
        }

        public final AbstractC8918fl<Boolean> d() {
            return this.e;
        }

        public final b e(String str, String str2, AbstractC8918fl<? extends a> abstractC8918fl, AbstractC8918fl<Boolean> abstractC8918fl2, AbstractC8918fl<e> abstractC8918fl3) {
            C8632dsu.c((Object) abstractC8918fl, "");
            C8632dsu.c((Object) abstractC8918fl2, "");
            C8632dsu.c((Object) abstractC8918fl3, "");
            return new b(str, str2, abstractC8918fl, abstractC8918fl2, abstractC8918fl3);
        }

        public final AbstractC8918fl<e> e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.d, (Object) bVar.d) && C8632dsu.c((Object) this.b, (Object) bVar.b) && C8632dsu.c(this.a, bVar.a) && C8632dsu.c(this.e, bVar.e) && C8632dsu.c(this.c, bVar.c);
            }
            return false;
        }

        public int hashCode() {
            String str = this.d;
            int hashCode = str == null ? 0 : str.hashCode();
            String str2 = this.b;
            return (((((((hashCode * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.a.hashCode()) * 31) + this.e.hashCode()) * 31) + this.c.hashCode();
        }

        public final boolean i() {
            return false;
        }

        public String toString() {
            String str = this.d;
            String str2 = this.b;
            AbstractC8918fl<a> abstractC8918fl = this.a;
            AbstractC8918fl<Boolean> abstractC8918fl2 = this.e;
            AbstractC8918fl<e> abstractC8918fl3 = this.c;
            return "IdentityState(profileHandle=" + str + ", userInput=" + str2 + ", checkHandleState=" + abstractC8918fl + ", setHandleState=" + abstractC8918fl2 + ", handleConfig=" + abstractC8918fl3 + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(String str, String str2, AbstractC8918fl<? extends a> abstractC8918fl, AbstractC8918fl<Boolean> abstractC8918fl2, AbstractC8918fl<e> abstractC8918fl3) {
            C8632dsu.c((Object) abstractC8918fl, "");
            C8632dsu.c((Object) abstractC8918fl2, "");
            C8632dsu.c((Object) abstractC8918fl3, "");
            this.d = str;
            this.b = str2;
            this.a = abstractC8918fl;
            this.e = abstractC8918fl2;
            this.c = abstractC8918fl3;
        }

        public /* synthetic */ b(String str, String str2, AbstractC8918fl abstractC8918fl, AbstractC8918fl abstractC8918fl2, AbstractC8918fl abstractC8918fl3, int i, C8627dsp c8627dsp) {
            this((i & 1) != 0 ? null : str, (i & 2) == 0 ? str2 : null, (i & 4) != 0 ? C8974go.e : abstractC8918fl, (i & 8) != 0 ? C8974go.e : abstractC8918fl2, (i & 16) != 0 ? C8974go.e : abstractC8918fl3);
        }

        public final boolean g() {
            AbstractC8918fl<e> abstractC8918fl = this.c;
            return (abstractC8918fl instanceof C8932fz) || (abstractC8918fl instanceof C8974go);
        }
    }

    /* loaded from: classes4.dex */
    public static abstract class a {
        public static final e b = new e(null);
        private final String c;

        /* loaded from: classes4.dex */
        public interface b {
            String d();
        }

        public /* synthetic */ a(String str, C8627dsp c8627dsp) {
            this(str);
        }

        /* loaded from: classes4.dex */
        public static final class e {
            public /* synthetic */ e(C8627dsp c8627dsp) {
                this();
            }

            private e() {
            }
        }

        private a(String str) {
            this.c = str;
        }

        /* loaded from: classes4.dex */
        public static final class j extends a {
            public static final j d = new j();

            private j() {
                super("RESET", null);
            }
        }

        /* renamed from: com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0067a extends a {
            public static final C0067a a = new C0067a();

            private C0067a() {
                super("CHECKING", null);
            }
        }

        /* loaded from: classes4.dex */
        public static final class c extends a {
            public static final c e = new c();

            private c() {
                super("AVAILABLE", null);
            }
        }

        /* loaded from: classes4.dex */
        public static final class f extends a implements b {
            private final String a;

            public f() {
                this(null, 1, null);
            }

            @Override // com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel.a.b
            public String d() {
                return this.a;
            }

            public /* synthetic */ f(String str, int i, C8627dsp c8627dsp) {
                this((i & 1) != 0 ? "-202" : str);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(String str) {
                super("UNAVAILABLE", null);
                C8632dsu.c((Object) str, "");
                this.a = str;
            }
        }

        /* loaded from: classes4.dex */
        public static final class o extends a implements b {
            public static final o d = new o();
            private static final String c = "-200";

            @Override // com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel.a.b
            public String d() {
                return c;
            }

            private o() {
                super("VALIDATION_ERROR", null);
            }
        }

        /* loaded from: classes4.dex */
        public static final class d extends a implements b {
            public static final d a = new d();
            private static final String c = "-200";

            @Override // com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel.a.b
            public String d() {
                return c;
            }

            private d() {
                super("MAX_CHAR_COUNT_ERROR", null);
            }
        }

        /* loaded from: classes4.dex */
        public static final class h extends a implements b {
            public static final h a = new h();
            private static final String c = "-200";

            @Override // com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel.a.b
            public String d() {
                return c;
            }

            private h() {
                super("MIN_CHAR_COUNT_ERROR", null);
            }
        }

        /* loaded from: classes4.dex */
        public static final class g extends a implements b {
            public static final g d = new g();
            private static final String e = String.valueOf(StatusCode.NO_CONNECTIVITY.getValue());

            @Override // com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel.a.b
            public String d() {
                return e;
            }

            private g() {
                super("NO_NETWORK_ERROR", null);
            }
        }

        /* loaded from: classes4.dex */
        public static final class i extends a implements b {
            public static final i a = new i();
            private static final String c = String.valueOf(StatusCode.NETWORK_ERROR.getValue());

            @Override // com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel.a.b
            public String d() {
                return c;
            }

            private i() {
                super("NETWORK_ERROR", null);
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class SetHandleErrorType {
        private static final /* synthetic */ InterfaceC8598drn g;
        private static final /* synthetic */ SetHandleErrorType[] i;
        public static final SetHandleErrorType d = new SetHandleErrorType("UNAVAILABLE", 0);
        public static final SetHandleErrorType c = new SetHandleErrorType("MODERATION_ERROR", 1);
        public static final SetHandleErrorType e = new SetHandleErrorType("VALIDATION_ERROR", 2);
        public static final SetHandleErrorType b = new SetHandleErrorType("NO_NETWORK_ERROR", 3);
        public static final SetHandleErrorType a = new SetHandleErrorType("NETWORK_ERROR", 4);

        private static final /* synthetic */ SetHandleErrorType[] d() {
            return new SetHandleErrorType[]{d, c, e, b, a};
        }

        public static SetHandleErrorType valueOf(String str) {
            return (SetHandleErrorType) Enum.valueOf(SetHandleErrorType.class, str);
        }

        public static SetHandleErrorType[] values() {
            return (SetHandleErrorType[]) i.clone();
        }

        private SetHandleErrorType(String str, int i2) {
        }

        static {
            SetHandleErrorType[] d2 = d();
            i = d2;
            g = C8600drp.e(d2);
        }
    }

    /* loaded from: classes4.dex */
    public static final class d {
        private final String a;
        private final String d;
        private final String e;

        public d() {
            this(null, null, null, 7, null);
        }

        public final String a() {
            return this.d;
        }

        public final String c() {
            return this.e;
        }

        public final String d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.a, (Object) dVar.a) && C8632dsu.c((Object) this.d, (Object) dVar.d) && C8632dsu.c((Object) this.e, (Object) dVar.e);
            }
            return false;
        }

        public int hashCode() {
            String str = this.a;
            int hashCode = str == null ? 0 : str.hashCode();
            String str2 = this.d;
            int hashCode2 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.e;
            return (((hashCode * 31) + hashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            String str = this.a;
            String str2 = this.d;
            String str3 = this.e;
            return "Alert(title=" + str + ", message=" + str2 + ", errorCode=" + str3 + ")";
        }

        public d(String str, String str2, String str3) {
            this.a = str;
            this.d = str2;
            this.e = str3;
        }

        public /* synthetic */ d(String str, String str2, String str3, int i, C8627dsp c8627dsp) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
        }
    }

    /* loaded from: classes4.dex */
    public static final class e {
        private final int a;
        private final Regex b;
        private final int c;

        public e() {
            this(0, 0, null, 7, null);
        }

        public final int a() {
            return this.a;
        }

        public final int e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return this.c == eVar.c && this.a == eVar.a && C8632dsu.c(this.b, eVar.b);
            }
            return false;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.c) * 31) + Integer.hashCode(this.a)) * 31) + this.b.hashCode();
        }

        public String toString() {
            int i = this.c;
            int i2 = this.a;
            Regex regex = this.b;
            return "HandleConfig(minLength=" + i + ", maxLength=" + i2 + ", regex=" + regex + ")";
        }

        public e(int i, int i2, Regex regex) {
            C8632dsu.c((Object) regex, "");
            this.c = i;
            this.a = i2;
            this.b = regex;
        }

        public /* synthetic */ e(int i, int i2, Regex regex, int i3, C8627dsp c8627dsp) {
            this((i3 & 1) != 0 ? 3 : i, (i3 & 2) != 0 ? 16 : i2, (i3 & 4) != 0 ? IdentityViewModel.c : regex);
        }
    }
}
