package o;

import android.content.Context;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.ui.home.impl.games.GameHandleViewModel$fetchHandle$2;
import kotlinx.coroutines.CoroutineExceptionHandler;
import o.AbstractApplicationC1040Mh;
import o.C1332Xp;
import o.C4037bTx;
import o.C8632dsu;
import o.C8927fu;
import o.C8932fz;
import o.InterfaceC5283bvo;
import o.InterfaceC8906fZ;
import o.aCG;

/* renamed from: o.bTx  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4037bTx extends C9943zX<e> {
    public static final c e = new c(null);
    private final InterfaceC8554dpx a;
    private String b;

    public final String j() {
        return this.b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4037bTx(e eVar) {
        super(eVar);
        InterfaceC8554dpx b2;
        C8632dsu.c((Object) eVar, "");
        b2 = dpB.b(new drO<aCG>() { // from class: com.netflix.mediaclient.ui.home.impl.games.GameHandleViewModel$graphqlRepository$2
            @Override // o.drO
            /* renamed from: d */
            public final aCG invoke() {
                C1332Xp c1332Xp = C1332Xp.b;
                Context context = (Context) C1332Xp.b(Context.class);
                UserAgent k = AbstractApplicationC1040Mh.getInstance().i().k();
                InterfaceC5283bvo j = k != null ? k.j() : null;
                if (j == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                C8632dsu.a(j, "");
                return aCG.b.e(context, j);
            }
        });
        this.a = b2;
    }

    /* renamed from: o.bTx$c */
    /* loaded from: classes4.dex */
    public static final class c implements InterfaceC8906fZ<C4037bTx, e> {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }

        public C4037bTx create(AbstractC8979gt abstractC8979gt, e eVar) {
            return (C4037bTx) InterfaceC8906fZ.b.d(this, abstractC8979gt, eVar);
        }

        /* renamed from: initialState */
        public e m3165initialState(AbstractC8979gt abstractC8979gt) {
            C8632dsu.c((Object) abstractC8979gt, "");
            return new e(null, new C8932fz(null, 1, null), 1, null);
        }
    }

    private final aCG h() {
        return (aCG) this.a.getValue();
    }

    public static /* synthetic */ void e(C4037bTx c4037bTx, boolean z, boolean z2, C9935zP c9935zP, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        if ((i & 4) != 0) {
            c9935zP = null;
        }
        c4037bTx.b(z, z2, c9935zP);
    }

    public final void b(boolean z, boolean z2, C9935zP c9935zP) {
        b(new drM<e, e>() { // from class: com.netflix.mediaclient.ui.home.impl.games.GameHandleViewModel$fetchHandle$1
            @Override // o.drM
            /* renamed from: a */
            public final C4037bTx.e invoke(C4037bTx.e eVar) {
                C8632dsu.c((Object) eVar, "");
                return C4037bTx.e.copy$default(eVar, null, new C8932fz(null, 1, null), 1, null);
            }
        });
        C8737dwr.c(e(), new b(CoroutineExceptionHandler.Key, this), null, new GameHandleViewModel$fetchHandle$2(this, z, z2, c9935zP, null), 2, null);
    }

    /* renamed from: o.bTx$b */
    /* loaded from: classes4.dex */
    public static final class b extends dqT implements CoroutineExceptionHandler {
        final /* synthetic */ C4037bTx d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(CoroutineExceptionHandler.c cVar, C4037bTx c4037bTx) {
            super(cVar);
            this.d = c4037bTx;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(dqZ dqz, final Throwable th) {
            this.d.b(new drM<e, e>() { // from class: com.netflix.mediaclient.ui.home.impl.games.GameHandleViewModel$fetchHandle$handler$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                /* renamed from: a */
                public final C4037bTx.e invoke(C4037bTx.e eVar) {
                    C8632dsu.c((Object) eVar, "");
                    return C4037bTx.e.copy$default(eVar, null, new C8927fu(th, null, 2, null), 1, null);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(boolean r10, o.InterfaceC8585dra<? super o.dpR> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.netflix.mediaclient.ui.home.impl.games.GameHandleViewModel$fetchConfigRequest$1
            if (r0 == 0) goto L13
            r0 = r11
            com.netflix.mediaclient.ui.home.impl.games.GameHandleViewModel$fetchConfigRequest$1 r0 = (com.netflix.mediaclient.ui.home.impl.games.GameHandleViewModel$fetchConfigRequest$1) r0
            int r1 = r0.a
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.a = r1
            goto L18
        L13:
            com.netflix.mediaclient.ui.home.impl.games.GameHandleViewModel$fetchConfigRequest$1 r0 = new com.netflix.mediaclient.ui.home.impl.games.GameHandleViewModel$fetchConfigRequest$1
            r0.<init>(r9, r11)
        L18:
            r6 = r0
            java.lang.Object r11 = r6.e
            java.lang.Object r0 = o.C8588drd.c()
            int r1 = r6.a
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2e
            java.lang.Object r10 = r6.b
            o.bTx r10 = (o.C4037bTx) r10
            o.C8556dpz.d(r11)
            goto L5b
        L2e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L36:
            o.C8556dpz.d(r11)
            o.aCG r1 = r9.h()
            o.Zm r11 = new o.Zm
            r11.<init>()
            if (r10 == 0) goto L47
            com.netflix.mediaclient.graphqlrepo.api.client.fetcher.QueryMode r10 = com.netflix.mediaclient.graphqlrepo.api.client.fetcher.QueryMode.d
            goto L49
        L47:
            com.netflix.mediaclient.graphqlrepo.api.client.fetcher.QueryMode r10 = com.netflix.mediaclient.graphqlrepo.api.client.fetcher.QueryMode.b
        L49:
            r3 = r10
            r6.b = r9
            r6.a = r2
            r4 = 0
            r5 = 1
            r7 = 4
            r8 = 0
            r2 = r11
            java.lang.Object r11 = o.aCE.d.d(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r11 != r0) goto L5a
            return r0
        L5a:
            r10 = r9
        L5b:
            o.gU r11 = (o.C8954gU) r11
            java.util.List<o.hw> r0 = r11.e
            r1 = 0
            if (r0 == 0) goto L6d
            com.netflix.mediaclient.ui.home.impl.games.GameHandleViewModel$fetchConfigRequest$2$1 r2 = new com.netflix.mediaclient.ui.home.impl.games.GameHandleViewModel$fetchConfigRequest$2$1
            r2.<init>()
            r10.b(r2)
            o.dpR r0 = o.dpR.c
            goto L6e
        L6d:
            r0 = r1
        L6e:
            if (r0 != 0) goto L96
            D extends o.hE$b r11 = r11.d
            o.Zm$e r11 = (o.C1388Zm.e) r11
            if (r11 == 0) goto L8c
            o.Zm$d r11 = r11.a()
            if (r11 == 0) goto L8c
            o.Zm$c r11 = r11.c()
            if (r11 == 0) goto L8c
            o.Zm$a r11 = r11.b()
            if (r11 == 0) goto L8c
            java.lang.String r1 = r11.e()
        L8c:
            com.netflix.mediaclient.ui.home.impl.games.GameHandleViewModel$fetchConfigRequest$3$1 r11 = new com.netflix.mediaclient.ui.home.impl.games.GameHandleViewModel$fetchConfigRequest$3$1
            r11.<init>()
            r10.b(r11)
            r10.b = r1
        L96:
            o.dpR r10 = o.dpR.c
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C4037bTx.a(boolean, o.dra):java.lang.Object");
    }

    /* renamed from: o.bTx$e */
    /* loaded from: classes4.dex */
    public static final class e implements InterfaceC8962gc {
        private final AbstractC8918fl<Boolean> c;
        private final String d;

        public e() {
            this(null, null, 3, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ e copy$default(e eVar, String str, AbstractC8918fl abstractC8918fl, int i, Object obj) {
            if ((i & 1) != 0) {
                str = eVar.d;
            }
            if ((i & 2) != 0) {
                abstractC8918fl = eVar.c;
            }
            return eVar.c(str, abstractC8918fl);
        }

        public final e c(String str, AbstractC8918fl<Boolean> abstractC8918fl) {
            C8632dsu.c((Object) abstractC8918fl, "");
            return new e(str, abstractC8918fl);
        }

        public final String component1() {
            return this.d;
        }

        public final AbstractC8918fl<Boolean> component2() {
            return this.c;
        }

        public final String d() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.d, (Object) eVar.d) && C8632dsu.c(this.c, eVar.c);
            }
            return false;
        }

        public int hashCode() {
            String str = this.d;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.c.hashCode();
        }

        public String toString() {
            String str = this.d;
            AbstractC8918fl<Boolean> abstractC8918fl = this.c;
            return "GameHandleState(profileHandle=" + str + ", fetchHandleRequest=" + abstractC8918fl + ")";
        }

        public e(String str, AbstractC8918fl<Boolean> abstractC8918fl) {
            C8632dsu.c((Object) abstractC8918fl, "");
            this.d = str;
            this.c = abstractC8918fl;
        }

        public /* synthetic */ e(String str, AbstractC8918fl abstractC8918fl, int i, C8627dsp c8627dsp) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? C8974go.e : abstractC8918fl);
        }

        public final boolean e() {
            AbstractC8918fl<Boolean> abstractC8918fl = this.c;
            return (abstractC8918fl instanceof C8932fz) || (abstractC8918fl instanceof C8974go);
        }
    }
}
