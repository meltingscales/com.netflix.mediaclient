package com.netflix.falkor.task;

import android.content.Context;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.android.app.StatusException;
import com.netflix.mediaclient.servicemgr.interface_.LoMoType;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C0987Kg;
import o.C1392Zq;
import o.C8556dpz;
import o.C8576dqs;
import o.C8586drb;
import o.C8589dre;
import o.C8632dsu;
import o.C8738dws;
import o.C8954gU;
import o.InterfaceC1078Nw;
import o.InterfaceC4004bSr;
import o.InterfaceC8585dra;
import o.aCE;
import o.aCG;
import o.aCK;
import o.aLL;
import o.aLO;
import o.aLZ;
import o.aSC;
import o.dpD;
import o.dpR;
import o.drM;
import o.drX;
import o.dwQ;
import o.dwU;

/* loaded from: classes3.dex */
public final class GraphQLListActions$removeGameFromMyList$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    int b;
    final /* synthetic */ String c;
    final /* synthetic */ C0987Kg d;
    final /* synthetic */ drM<aLO<? extends Pair<Boolean, ? extends Status>>, dpR> e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GraphQLListActions$removeGameFromMyList$1(String str, C0987Kg c0987Kg, drM<? super aLO<? extends Pair<Boolean, ? extends Status>>, dpR> drm, InterfaceC8585dra<? super GraphQLListActions$removeGameFromMyList$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.c = str;
        this.d = c0987Kg;
        this.e = drm;
    }

    @Override // o.drX
    /* renamed from: c */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((GraphQLListActions$removeGameFromMyList$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new GraphQLListActions$removeGameFromMyList$1(this.c, this.d, this.e, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        aCG acg;
        C1392Zq.d d;
        C1392Zq.c a;
        e = C8586drb.e();
        int i = this.b;
        if (i == 0) {
            C8556dpz.d(obj);
            C1392Zq c1392Zq = new C1392Zq(this.c);
            acg = this.d.c;
            this.b = 1;
            obj = aCE.d.c(acg, c1392Zq, null, false, null, false, this, 30, null);
            if (obj == e) {
                return e;
            }
        } else if (i != 1) {
            if (i == 2) {
                C8556dpz.d(obj);
                return dpR.c;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        C1392Zq.b bVar = (C1392Zq.b) aCK.e((C8954gU) obj);
        C1392Zq.g e2 = bVar.e();
        List<C1392Zq.e> b = e2 != null ? e2.b() : null;
        boolean z = b == null || b.isEmpty();
        C1392Zq.g e3 = bVar.e();
        boolean z2 = z && ((e3 == null || (d = e3.d()) == null || (a = d.a()) == null) ? false : C8632dsu.c(a.b(), C8589dre.e(false)));
        dwQ dwq = this.d.f;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(z2, this.c, this.d, this.e, z, bVar, null);
        this.b = 2;
        if (C8738dws.c(dwq, anonymousClass1, this) == e) {
            return e;
        }
        return dpR.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.netflix.falkor.task.GraphQLListActions$removeGameFromMyList$1$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
        final /* synthetic */ String a;
        final /* synthetic */ drM<aLO<? extends Pair<Boolean, ? extends Status>>, dpR> b;
        final /* synthetic */ C1392Zq.b c;
        final /* synthetic */ boolean d;
        final /* synthetic */ boolean e;
        final /* synthetic */ C0987Kg g;
        int h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(boolean z, String str, C0987Kg c0987Kg, drM<? super aLO<? extends Pair<Boolean, ? extends Status>>, dpR> drm, boolean z2, C1392Zq.b bVar, InterfaceC8585dra<? super AnonymousClass1> interfaceC8585dra) {
            super(2, interfaceC8585dra);
            this.e = z;
            this.a = str;
            this.g = c0987Kg;
            this.b = drm;
            this.d = z2;
            this.c = bVar;
        }

        @Override // o.drX
        /* renamed from: b */
        public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
            return ((AnonymousClass1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
            return new AnonymousClass1(this.e, this.a, this.g, this.b, this.d, this.c, interfaceC8585dra);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Throwable th;
            List<C1392Zq.e> b;
            Context context;
            C8586drb.e();
            if (this.h == 0) {
                C8556dpz.d(obj);
                if (this.e) {
                    aSC.a(this.a, false);
                    InterfaceC4004bSr.a aVar = InterfaceC4004bSr.c;
                    context = this.g.b;
                    String a = LoMoType.MY_GAMES.a();
                    C8632dsu.a(a, "");
                    aVar.c(context, a, null, null, null);
                    this.b.invoke(new aLZ(dpD.a(C8589dre.e(false), InterfaceC1078Nw.aJ)));
                } else {
                    if (this.d) {
                        th = new StatusException(InterfaceC1078Nw.ad);
                    } else {
                        C1392Zq.g e = this.c.e();
                        th = new Throwable((e == null || (b = e.b()) == null) ? null : C8576dqs.d(b, null, null, null, 0, null, null, 63, null));
                    }
                    this.b.invoke(new aLL(th));
                }
                return dpR.c;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
