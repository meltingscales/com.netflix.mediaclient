package o;

import android.annotation.SuppressLint;
import android.content.Context;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.browse.api.task.TaskMode;
import com.netflix.mediaclient.commanderinfra.impl.PrefetchInfraImpl$fetchTargetProfile$1;
import com.netflix.mediaclient.commanderinfra.impl.PrefetchInfraImpl$fetchTargetProfileData$1;
import com.netflix.mediaclient.commanderinfra.impl.PrefetchInfraImpl$prefetchFeatureEducationAssets$2;
import com.netflix.mediaclient.commanderinfra.impl.PrefetchInfraImpl$selectSeason$1$1;
import com.netflix.mediaclient.servicemgr.interface_.ContextualText;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import dagger.hilt.android.scopes.ActivityScoped;
import io.reactivex.rxkotlin.SubscribersKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import javax.inject.Inject;
import kotlin.Result;
import kotlinx.coroutines.CoroutineExceptionHandler;
import o.C1307Wq;
import o.C8632dsu;
import o.C9646uN;
import o.InterfaceC1300Wj;
import o.InterfaceC9638uF;
import o.bDW;
import o.dpR;

@ActivityScoped
/* renamed from: o.Wq  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1307Wq implements VB {
    public static final a c = new a(null);
    private final aDB a;
    private final InterfaceC1285Vu b;
    private final dwU d;
    private final InterfaceC1300Wj e;
    private final dwQ g;
    private final dwQ j;

    /* renamed from: o.Wq$f */
    /* loaded from: classes3.dex */
    public static final class f extends dqT implements CoroutineExceptionHandler {
        public f(CoroutineExceptionHandler.c cVar) {
            super(cVar);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(dqZ dqz, Throwable th) {
            a aVar = C1307Wq.c;
        }
    }

    /* renamed from: o.Wq$j */
    /* loaded from: classes3.dex */
    public static final class j extends dqT implements CoroutineExceptionHandler {
        public j(CoroutineExceptionHandler.c cVar) {
            super(cVar);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(dqZ dqz, Throwable th) {
            a aVar = C1307Wq.c;
        }
    }

    @Inject
    public C1307Wq(InterfaceC1285Vu interfaceC1285Vu, InterfaceC1300Wj interfaceC1300Wj, aDB adb, dwQ dwq, dwQ dwq2, dwU dwu) {
        C8632dsu.c((Object) interfaceC1285Vu, "");
        C8632dsu.c((Object) interfaceC1300Wj, "");
        C8632dsu.c((Object) adb, "");
        C8632dsu.c((Object) dwq, "");
        C8632dsu.c((Object) dwq2, "");
        C8632dsu.c((Object) dwu, "");
        this.b = interfaceC1285Vu;
        this.e = interfaceC1300Wj;
        this.a = adb;
        this.g = dwq;
        this.j = dwq2;
        this.d = dwu;
    }

    /* renamed from: o.Wq$a */
    /* loaded from: classes3.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("PrefetchInfraImpl");
        }
    }

    /* renamed from: o.Wq$e */
    /* loaded from: classes3.dex */
    public static final class e extends AbstractC1761aNg {
        private final InterfaceC8585dra<InterfaceC5198buI> c;

        /* JADX WARN: Multi-variable type inference failed */
        public e(InterfaceC8585dra<? super InterfaceC5198buI> interfaceC8585dra) {
            C8632dsu.c((Object) interfaceC8585dra, "");
            this.c = interfaceC8585dra;
        }

        @Override // o.AbstractC1761aNg, o.InterfaceC1757aNc
        @SuppressLint({"CheckResult"})
        public void a(InterfaceC5238buw interfaceC5238buw, Status status) {
            C8632dsu.c((Object) status, "");
            C1307Wq.c.getLogTag();
            InterfaceC8585dra<InterfaceC5198buI> interfaceC8585dra = this.c;
            Result.c cVar = Result.e;
            interfaceC8585dra.resumeWith(Result.e(interfaceC5238buw));
        }
    }

    /* renamed from: o.Wq$c */
    /* loaded from: classes3.dex */
    public static final class c extends AbstractC1761aNg {
        private final InterfaceC8585dra<InterfaceC5198buI> d;

        /* JADX WARN: Multi-variable type inference failed */
        public c(InterfaceC8585dra<? super InterfaceC5198buI> interfaceC8585dra) {
            C8632dsu.c((Object) interfaceC8585dra, "");
            this.d = interfaceC8585dra;
        }

        @Override // o.AbstractC1761aNg, o.InterfaceC1757aNc
        @SuppressLint({"CheckResult"})
        public void a(InterfaceC5227bul interfaceC5227bul, Status status) {
            C8632dsu.c((Object) status, "");
            C1307Wq.c.getLogTag();
            InterfaceC8585dra<InterfaceC5198buI> interfaceC8585dra = this.d;
            Result.c cVar = Result.e;
            interfaceC8585dra.resumeWith(Result.e(interfaceC5227bul));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x03c9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0403 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01e2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0203  */
    /* JADX WARN: Type inference failed for: r27v5 */
    /* JADX WARN: Type inference failed for: r27v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r28v7 */
    /* JADX WARN: Type inference failed for: r28v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v20, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v22, types: [java.util.List] */
    @Override // o.VB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object d(java.lang.String r49, o.InterfaceC8585dra<? super o.C1295We> r50) {
        /*
            Method dump skipped, instructions count: 1245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1307Wq.d(java.lang.String, o.dra):java.lang.Object");
    }

    /* renamed from: o.Wq$d */
    /* loaded from: classes3.dex */
    public static final class d<T> implements dyQ {
        final /* synthetic */ C1307Wq a;
        final /* synthetic */ int e;

        d(int i, C1307Wq c1307Wq) {
            this.e = i;
            this.a = c1307Wq;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00da  */
        @Override // o.dyQ
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(o.bDW r11, o.InterfaceC8585dra<? super o.dpR> r12) {
            /*
                r10 = this;
                boolean r0 = r12 instanceof com.netflix.mediaclient.commanderinfra.impl.PrefetchInfraImpl$fetchVideoMetadata$6$1$emit$1
                if (r0 == 0) goto L13
                r0 = r12
                com.netflix.mediaclient.commanderinfra.impl.PrefetchInfraImpl$fetchVideoMetadata$6$1$emit$1 r0 = (com.netflix.mediaclient.commanderinfra.impl.PrefetchInfraImpl$fetchVideoMetadata$6$1$emit$1) r0
                int r1 = r0.d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 + r2
                r0.d = r1
                goto L18
            L13:
                com.netflix.mediaclient.commanderinfra.impl.PrefetchInfraImpl$fetchVideoMetadata$6$1$emit$1 r0 = new com.netflix.mediaclient.commanderinfra.impl.PrefetchInfraImpl$fetchVideoMetadata$6$1$emit$1
                r0.<init>(r10, r12)
            L18:
                r5 = r0
                java.lang.Object r12 = r5.b
                java.lang.Object r0 = o.C8588drd.c()
                int r1 = r5.d
                r2 = 1
                if (r1 == 0) goto L33
                if (r1 != r2) goto L2b
                o.C8556dpz.d(r12)
                goto Ld6
            L2b:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r12)
                throw r11
            L33:
                o.C8556dpz.d(r12)
                boolean r12 = r11 instanceof o.bDW.e
                if (r12 == 0) goto Ldc
                int r12 = r10.e
                if (r12 <= 0) goto L3f
                goto L46
            L3f:
                r12 = r11
                o.bDW$e r12 = (o.bDW.e) r12
                int r12 = r12.a()
            L46:
                o.bDW$e r11 = (o.bDW.e) r11
                java.util.List r1 = r11.d()
                java.util.Iterator r1 = r1.iterator()
            L50:
                boolean r3 = r1.hasNext()
                r4 = 0
                if (r3 == 0) goto L65
                java.lang.Object r3 = r1.next()
                r6 = r3
                o.buF r6 = (o.InterfaceC5195buF) r6
                int r6 = r6.x()
                if (r6 != r12) goto L50
                goto L66
            L65:
                r3 = r4
            L66:
                o.buF r3 = (o.InterfaceC5195buF) r3
                java.util.List r11 = r11.d()
                java.util.ArrayList r12 = new java.util.ArrayList
                r1 = 10
                int r1 = o.C8570dqm.a(r11, r1)
                r12.<init>(r1)
                java.util.Iterator r11 = r11.iterator()
            L7b:
                boolean r1 = r11.hasNext()
                java.lang.String r6 = ""
                if (r1 == 0) goto La8
                java.lang.Object r1 = r11.next()
                o.buF r1 = (o.InterfaceC5195buF) r1
                java.lang.String r7 = r1.getTitle()
                o.C8632dsu.a(r7, r6)
                int r8 = r1.x()
                java.lang.String r9 = r1.getId()
                o.C8632dsu.a(r9, r6)
                int r1 = r1.D_()
                o.Wa r6 = new o.Wa
                r6.<init>(r7, r8, r9, r1)
                r12.add(r6)
                goto L7b
            La8:
                if (r3 == 0) goto Ld8
                o.Wq r1 = r10.a
                java.lang.String r11 = r3.getTitle()
                o.C8632dsu.a(r11, r6)
                int r4 = r3.x()
                java.lang.String r7 = r3.getId()
                o.C8632dsu.a(r7, r6)
                int r3 = r3.D_()
                o.Wa r6 = new o.Wa
                r6.<init>(r11, r4, r7, r3)
                r5.d = r2
                r4 = 0
                r11 = 4
                r7 = 0
                r2 = r12
                r3 = r6
                r6 = r11
                java.lang.Object r11 = o.C1307Wq.e(r1, r2, r3, r4, r5, r6, r7)
                if (r11 != r0) goto Ld6
                return r0
            Ld6:
                o.dpR r4 = o.dpR.c
            Ld8:
                if (r4 != 0) goto Ldc
                o.Wq$a r11 = o.C1307Wq.c
            Ldc:
                o.dpR r11 = o.dpR.c
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C1307Wq.d.emit(o.bDW, o.dra):java.lang.Object");
        }
    }

    @Override // o.VB
    public void a(String str) {
        C8632dsu.c((Object) str, "");
        C8737dwr.c(this.d, this.j, null, new PrefetchInfraImpl$fetchTargetProfile$1(str, null), 2, null);
    }

    @Override // o.VB
    public void b(int i) {
        C1291Wa d2 = d(i);
        if (d2 != null) {
            C8737dwr.c(this.d, new j(CoroutineExceptionHandler.Key).plus(this.j), null, new PrefetchInfraImpl$selectSeason$1$1(this, d2, null), 2, null);
        }
    }

    @Override // o.VB
    public void c(VZ vz, String str, InterfaceC5283bvo interfaceC5283bvo) {
        C8632dsu.c((Object) vz, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) interfaceC5283bvo, "");
        C8737dwr.c(this.d, this.j, null, new PrefetchInfraImpl$fetchTargetProfileData$1(str, vz, interfaceC5283bvo, null), 2, null);
    }

    public static /* synthetic */ Object e(C1307Wq c1307Wq, List list, C1291Wa c1291Wa, int i, InterfaceC8585dra interfaceC8585dra, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return c1307Wq.e(list, c1291Wa, i, interfaceC8585dra);
    }

    private final Object e(List<C1291Wa> list, C1291Wa c1291Wa, int i, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        Object e2;
        if (!AbstractApplicationC1040Mh.getInstance().i().r()) {
            return dpR.c;
        }
        if (c1291Wa != null) {
            long nanoTime = System.nanoTime();
            if (i >= c1291Wa.b()) {
                return dpR.c;
            }
            int i2 = i + 39;
            if (i2 >= c1291Wa.b()) {
                i2 = c1291Wa.b() - 1;
            }
            int i3 = i2;
            String a2 = c1291Wa.a();
            if (C8168dfL.g(a2)) {
                return dpR.c;
            }
            Object collect = C7672dBb.d(this.e.e(new InterfaceC1300Wj.d(a2, nanoTime, i, i3, null, c1291Wa))).collect(new b(list, c1291Wa), interfaceC8585dra);
            e2 = C8586drb.e();
            if (collect == e2) {
                return collect;
            }
        }
        return dpR.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.Wq$b */
    /* loaded from: classes3.dex */
    public static final class b<T> implements dyQ {
        final /* synthetic */ C1291Wa c;
        final /* synthetic */ List<C1291Wa> d;

        b(List<C1291Wa> list, C1291Wa c1291Wa) {
            this.d = list;
            this.c = c1291Wa;
        }

        @Override // o.dyQ
        /* renamed from: b */
        public final Object emit(bDW bdw, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
            if (bdw instanceof bDW.d) {
                C1307Wq.this.e(this.d, this.c, ((bDW.d) bdw).b());
            }
            return dpR.c;
        }
    }

    private final Object b(String str, boolean z, InterfaceC8585dra<? super InterfaceC5198buI> interfaceC8585dra) {
        InterfaceC8585dra b2;
        Object e2;
        b2 = C8590drf.b(interfaceC8585dra);
        C8587drc c8587drc = new C8587drc(b2);
        InterfaceC1912aSw b3 = AbstractApplicationC1040Mh.getInstance().i().b();
        Objects.requireNonNull(b3);
        if (z) {
            b3.c(str, null, true, TaskMode.FROM_CACHE_OR_NETWORK, new c(c8587drc), "CdxAgent");
        } else {
            b3.e(str, null, true, TaskMode.FROM_CACHE_OR_NETWORK, new e(c8587drc), "CdxAgent", C8589dre.e(false));
        }
        Object b4 = c8587drc.b();
        e2 = C8586drb.e();
        if (b4 == e2) {
            C8592drh.c(interfaceC8585dra);
        }
        return b4;
    }

    public static /* synthetic */ void b(C1307Wq c1307Wq, List list, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        c1307Wq.d(list, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(o.InterfaceC8585dra<? super o.dpR> r11) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1307Wq.b(o.dra):java.lang.Object");
    }

    private final C1291Wa d(int i) {
        VV d2;
        List<C1291Wa> c2;
        VX b2 = C1317Xa.e.d().b();
        Object obj = null;
        if (b2 == null || (d2 = b2.d()) == null || (c2 = d2.c()) == null) {
            return null;
        }
        Iterator<T> it = c2.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((C1291Wa) next).d() == i) {
                obj = next;
                break;
            }
        }
        return (C1291Wa) obj;
    }

    @Override // o.VB
    public void e() {
        c.getLogTag();
        b(this, VP.c.b(), 0, 2, null);
    }

    @Override // o.VB
    public void c() {
        c.getLogTag();
        C8737dwr.c(this.d, new f(CoroutineExceptionHandler.Key).plus(this.j), null, new PrefetchInfraImpl$prefetchFeatureEducationAssets$2(this, null), 2, null);
    }

    @SuppressLint({"CheckResult"})
    private final void d(List<String> list, int i) {
        c.getLogTag();
        for (final String str : list) {
            if (str != null) {
                C9646uN.b b2 = C9646uN.d.a().e(str).a(i).b(i).c(false).b();
                InterfaceC9638uF.e eVar = InterfaceC9638uF.a;
                Context d2 = AbstractApplicationC1040Mh.d();
                C8632dsu.a(d2, "");
                SubscribersKt.subscribeBy$default(eVar.d(d2).d(b2), new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.commanderinfra.impl.PrefetchInfraImpl$prefetchImage$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* synthetic */ dpR invoke(Throwable th) {
                        b(th);
                        return dpR.c;
                    }

                    public final void b(Throwable th) {
                        C8632dsu.c((Object) th, "");
                        C1307Wq.a aVar = C1307Wq.c;
                    }
                }, (drM) null, 2, (Object) null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(List<C1291Wa> list, C1291Wa c1291Wa, List<InterfaceC5227bul> list2) {
        ArrayList arrayList;
        int d2;
        VX vx = null;
        if (list2 != null) {
            d2 = C8572dqo.d(list2, 10);
            arrayList = new ArrayList(d2);
            for (InterfaceC5227bul interfaceC5227bul : list2) {
                String title = interfaceC5227bul.getTitle();
                C8632dsu.a(title, "");
                int aw_ = interfaceC5227bul.aw_();
                String text = interfaceC5227bul.e(ContextualText.TextContext.d).text();
                String ce_ = interfaceC5227bul.ce_();
                C8632dsu.a(ce_, "");
                int g = interfaceC5227bul.aE_().g();
                String ca_ = interfaceC5227bul.ca_();
                C8632dsu.a(ca_, "");
                boolean isAvailableToPlay = interfaceC5227bul.isAvailableToPlay();
                int b2 = C1323Xg.b.b(interfaceC5227bul);
                InterfaceC5160btX aE_ = interfaceC5227bul.aE_();
                VideoType type = interfaceC5227bul.getType();
                C8632dsu.a(type, "");
                boolean aU_ = interfaceC5227bul.aU_();
                String bY_ = interfaceC5227bul.bY_();
                C8632dsu.a(bY_, "");
                arrayList.add(new VW(title, aw_, text, ce_, g, ca_, isAvailableToPlay, b2, aE_, type, aU_, bY_));
            }
        } else {
            arrayList = null;
        }
        C1317Xa c1317Xa = C1317Xa.e;
        InterfaceC8812dzl<VX> d3 = c1317Xa.d();
        VX b3 = c1317Xa.d().b();
        if (b3 != null) {
            vx = VX.e(b3, null, null, null, null, null, null, new VV(list, c1291Wa != null ? Integer.valueOf(c1291Wa.d()) : null, c1291Wa, arrayList), 63, null);
        }
        d3.d(vx);
    }
}
