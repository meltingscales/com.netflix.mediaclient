package com.netflix.falkor.task;

import android.content.Context;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.android.app.StatusException;
import com.netflix.mediaclient.servicemgr.interface_.LoMoType;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C0987Kg;
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
import o.XQ;
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
public final class GraphQLListActions$addGameToMyList$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    int a;
    final /* synthetic */ String b;
    final /* synthetic */ C0987Kg c;
    final /* synthetic */ drM<aLO<? extends Pair<Boolean, ? extends Status>>, dpR> e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GraphQLListActions$addGameToMyList$1(String str, C0987Kg c0987Kg, drM<? super aLO<? extends Pair<Boolean, ? extends Status>>, dpR> drm, InterfaceC8585dra<? super GraphQLListActions$addGameToMyList$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.b = str;
        this.c = c0987Kg;
        this.e = drm;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new GraphQLListActions$addGameToMyList$1(this.b, this.c, this.e, interfaceC8585dra);
    }

    @Override // o.drX
    /* renamed from: e */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((GraphQLListActions$addGameToMyList$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        aCG acg;
        XQ.d a;
        XQ.j b;
        e = C8586drb.e();
        int i = this.a;
        if (i == 0) {
            C8556dpz.d(obj);
            XQ xq = new XQ(this.b);
            acg = this.c.c;
            this.a = 1;
            obj = aCE.d.c(acg, xq, null, false, null, false, this, 30, null);
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
        XQ.e eVar = (XQ.e) aCK.e((C8954gU) obj);
        XQ.b c = eVar.c();
        List<XQ.a> c2 = c != null ? c.c() : null;
        boolean z = c2 == null || c2.isEmpty();
        XQ.b c3 = eVar.c();
        boolean z2 = z && ((c3 == null || (a = c3.a()) == null || (b = a.b()) == null) ? false : C8632dsu.c(b.a(), C8589dre.e(true)));
        dwQ dwq = this.c.f;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(z2, this.b, this.c, this.e, z, eVar, null);
        this.a = 2;
        if (C8738dws.c(dwq, anonymousClass1, this) == e) {
            return e;
        }
        return dpR.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.netflix.falkor.task.GraphQLListActions$addGameToMyList$1$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
        final /* synthetic */ boolean a;
        final /* synthetic */ String b;
        final /* synthetic */ boolean c;
        final /* synthetic */ XQ.e d;
        final /* synthetic */ drM<aLO<? extends Pair<Boolean, ? extends Status>>, dpR> e;
        int h;
        final /* synthetic */ C0987Kg i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(boolean z, String str, C0987Kg c0987Kg, drM<? super aLO<? extends Pair<Boolean, ? extends Status>>, dpR> drm, boolean z2, XQ.e eVar, InterfaceC8585dra<? super AnonymousClass1> interfaceC8585dra) {
            super(2, interfaceC8585dra);
            this.c = z;
            this.b = str;
            this.i = c0987Kg;
            this.e = drm;
            this.a = z2;
            this.d = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
            return new AnonymousClass1(this.c, this.b, this.i, this.e, this.a, this.d, interfaceC8585dra);
        }

        @Override // o.drX
        /* renamed from: d */
        public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
            return ((AnonymousClass1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Throwable th;
            List<XQ.a> c;
            Context context;
            C8586drb.e();
            if (this.h == 0) {
                C8556dpz.d(obj);
                if (this.c) {
                    aSC.a(this.b, true);
                    InterfaceC4004bSr.a aVar = InterfaceC4004bSr.c;
                    context = this.i.b;
                    String a = LoMoType.MY_GAMES.a();
                    C8632dsu.a(a, "");
                    aVar.c(context, a, null, null, null);
                    this.e.invoke(new aLZ(dpD.a(C8589dre.e(true), InterfaceC1078Nw.aJ)));
                } else {
                    if (this.a) {
                        th = new StatusException(InterfaceC1078Nw.ad);
                    } else {
                        XQ.b c2 = this.d.c();
                        th = new Throwable((c2 == null || (c = c2.c()) == null) ? null : C8576dqs.d(c, null, null, null, 0, null, null, 63, null));
                    }
                    this.e.invoke(new aLL(th));
                }
                return dpR.c;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
