package com.netflix.falkor.task;

import android.content.Context;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.android.app.StatusException;
import com.netflix.mediaclient.servicemgr.interface_.LoMoType;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.AbstractC8997hK;
import o.C0987Kg;
import o.C1399Zx;
import o.C3381axs;
import o.C8556dpz;
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
public final class GraphQLListActions$removeVideoFromMyList$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    int a;
    final /* synthetic */ String b;
    final /* synthetic */ drM<aLO<? extends Pair<Boolean, ? extends Status>>, dpR> c;
    final /* synthetic */ String d;
    final /* synthetic */ C0987Kg e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GraphQLListActions$removeVideoFromMyList$1(String str, String str2, C0987Kg c0987Kg, drM<? super aLO<? extends Pair<Boolean, ? extends Status>>, dpR> drm, InterfaceC8585dra<? super GraphQLListActions$removeVideoFromMyList$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.b = str;
        this.d = str2;
        this.e = c0987Kg;
        this.c = drm;
    }

    @Override // o.drX
    /* renamed from: b */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((GraphQLListActions$removeVideoFromMyList$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new GraphQLListActions$removeVideoFromMyList$1(this.b, this.d, this.e, this.c, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        aCG acg;
        Object c;
        e = C8586drb.e();
        int i = this.a;
        if (i == 0) {
            C8556dpz.d(obj);
            C1399Zx c1399Zx = new C1399Zx(new C3381axs(this.b, null, AbstractC8997hK.d.b(this.d), null, 10, null));
            acg = this.e.c;
            this.a = 1;
            c = aCE.d.c(acg, c1399Zx, null, false, null, false, this, 30, null);
            if (c == e) {
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
            c = obj;
        }
        C1399Zx.e eVar = (C1399Zx.e) aCK.e((C8954gU) c);
        dwQ dwq = this.e.f;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(eVar, this.b, this.e, this.c, null);
        this.a = 2;
        if (C8738dws.c(dwq, anonymousClass1, this) == e) {
            return e;
        }
        return dpR.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.netflix.falkor.task.GraphQLListActions$removeVideoFromMyList$1$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
        final /* synthetic */ C0987Kg a;
        final /* synthetic */ drM<aLO<? extends Pair<Boolean, ? extends Status>>, dpR> b;
        int c;
        final /* synthetic */ C1399Zx.e d;
        final /* synthetic */ String e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(C1399Zx.e eVar, String str, C0987Kg c0987Kg, drM<? super aLO<? extends Pair<Boolean, ? extends Status>>, dpR> drm, InterfaceC8585dra<? super AnonymousClass1> interfaceC8585dra) {
            super(2, interfaceC8585dra);
            this.d = eVar;
            this.e = str;
            this.a = c0987Kg;
            this.b = drm;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
            return new AnonymousClass1(this.d, this.e, this.a, this.b, interfaceC8585dra);
        }

        @Override // o.drX
        /* renamed from: e */
        public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
            return ((AnonymousClass1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Context context;
            C8586drb.e();
            if (this.c == 0) {
                C8556dpz.d(obj);
                C1399Zx.b d = this.d.d();
                if (d != null && C8632dsu.c(d.b(), C8589dre.e(false))) {
                    aSC.c(this.e, false);
                    InterfaceC4004bSr.a aVar = InterfaceC4004bSr.c;
                    context = this.a.b;
                    String a = LoMoType.INSTANT_QUEUE.a();
                    C8632dsu.a(a, "");
                    aVar.c(context, a, null, null, null);
                    this.b.invoke(new aLZ(dpD.a(C8589dre.e(false), InterfaceC1078Nw.aJ)));
                } else {
                    this.b.invoke(new aLL(new StatusException(InterfaceC1078Nw.ad)));
                }
                return dpR.c;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
