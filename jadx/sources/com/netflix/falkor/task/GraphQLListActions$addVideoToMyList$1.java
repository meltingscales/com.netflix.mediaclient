package com.netflix.falkor.task;

import android.content.Context;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.android.app.StatusException;
import com.netflix.mediaclient.servicemgr.interface_.LoMoType;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.AbstractC8997hK;
import o.C0987Kg;
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
import o.XT;
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
public final class GraphQLListActions$addVideoToMyList$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ drM<aLO<? extends Pair<Boolean, ? extends Status>>, dpR> a;
    final /* synthetic */ String b;
    final /* synthetic */ Integer c;
    final /* synthetic */ String d;
    int e;
    final /* synthetic */ C0987Kg h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GraphQLListActions$addVideoToMyList$1(String str, Integer num, String str2, C0987Kg c0987Kg, drM<? super aLO<? extends Pair<Boolean, ? extends Status>>, dpR> drm, InterfaceC8585dra<? super GraphQLListActions$addVideoToMyList$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.d = str;
        this.c = num;
        this.b = str2;
        this.h = c0987Kg;
        this.a = drm;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new GraphQLListActions$addVideoToMyList$1(this.d, this.c, this.b, this.h, this.a, interfaceC8585dra);
    }

    @Override // o.drX
    /* renamed from: d */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((GraphQLListActions$addVideoToMyList$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        aCG acg;
        Object c;
        e = C8586drb.e();
        int i = this.e;
        if (i == 0) {
            C8556dpz.d(obj);
            String str = this.d;
            AbstractC8997hK.c cVar = AbstractC8997hK.d;
            Integer num = this.c;
            XT xt = new XT(new C3381axs(str, cVar.b(num != null ? num.toString() : null), cVar.b(this.b), null, 8, null));
            acg = this.h.c;
            this.e = 1;
            c = aCE.d.c(acg, xt, null, false, null, false, this, 30, null);
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
        XT.c cVar2 = (XT.c) aCK.e((C8954gU) c);
        dwQ dwq = this.h.f;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(cVar2, this.d, this.h, this.a, null);
        this.e = 2;
        if (C8738dws.c(dwq, anonymousClass1, this) == e) {
            return e;
        }
        return dpR.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.netflix.falkor.task.GraphQLListActions$addVideoToMyList$1$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
        final /* synthetic */ String a;
        final /* synthetic */ C0987Kg b;
        int c;
        final /* synthetic */ XT.c d;
        final /* synthetic */ drM<aLO<? extends Pair<Boolean, ? extends Status>>, dpR> e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(XT.c cVar, String str, C0987Kg c0987Kg, drM<? super aLO<? extends Pair<Boolean, ? extends Status>>, dpR> drm, InterfaceC8585dra<? super AnonymousClass1> interfaceC8585dra) {
            super(2, interfaceC8585dra);
            this.d = cVar;
            this.a = str;
            this.b = c0987Kg;
            this.e = drm;
        }

        @Override // o.drX
        /* renamed from: a */
        public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
            return ((AnonymousClass1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
            return new AnonymousClass1(this.d, this.a, this.b, this.e, interfaceC8585dra);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Context context;
            C8586drb.e();
            if (this.c == 0) {
                C8556dpz.d(obj);
                XT.a e = this.d.e();
                if (e != null && C8632dsu.c(e.d(), C8589dre.e(true))) {
                    aSC.c(this.a, true);
                    InterfaceC4004bSr.a aVar = InterfaceC4004bSr.c;
                    context = this.b.b;
                    String a = LoMoType.INSTANT_QUEUE.a();
                    C8632dsu.a(a, "");
                    aVar.c(context, a, null, null, null);
                    this.e.invoke(new aLZ(dpD.a(C8589dre.e(true), InterfaceC1078Nw.aJ)));
                } else {
                    this.e.invoke(new aLL(new StatusException(InterfaceC1078Nw.ad)));
                }
                return dpR.c;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
