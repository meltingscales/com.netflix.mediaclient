package com.netflix.falkor.task;

import android.content.Context;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.android.app.StatusException;
import com.netflix.mediaclient.servicemgr.interface_.LoMoType;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.AbstractC8997hK;
import o.C0987Kg;
import o.C1344Yb;
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
public final class GraphQLListActions$addVideoToRemindMe$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ drM<aLO<? extends Pair<Boolean, ? extends Status>>, dpR> a;
    final /* synthetic */ Integer b;
    final /* synthetic */ String c;
    int d;
    final /* synthetic */ String e;
    final /* synthetic */ C0987Kg i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GraphQLListActions$addVideoToRemindMe$1(String str, Integer num, String str2, C0987Kg c0987Kg, drM<? super aLO<? extends Pair<Boolean, ? extends Status>>, dpR> drm, InterfaceC8585dra<? super GraphQLListActions$addVideoToRemindMe$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.e = str;
        this.b = num;
        this.c = str2;
        this.i = c0987Kg;
        this.a = drm;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new GraphQLListActions$addVideoToRemindMe$1(this.e, this.b, this.c, this.i, this.a, interfaceC8585dra);
    }

    @Override // o.drX
    /* renamed from: d */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((GraphQLListActions$addVideoToRemindMe$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        aCG acg;
        Object c;
        e = C8586drb.e();
        int i = this.d;
        if (i == 0) {
            C8556dpz.d(obj);
            String str = this.e;
            AbstractC8997hK.c cVar = AbstractC8997hK.d;
            Integer num = this.b;
            C1344Yb c1344Yb = new C1344Yb(new C3381axs(str, cVar.b(num != null ? num.toString() : null), cVar.b(this.c), null, 8, null));
            acg = this.i.c;
            this.d = 1;
            c = aCE.d.c(acg, c1344Yb, null, false, null, false, this, 30, null);
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
        C1344Yb.c cVar2 = (C1344Yb.c) aCK.e((C8954gU) c);
        dwQ dwq = this.i.f;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(cVar2, this.e, this.i, this.a, null);
        this.d = 2;
        if (C8738dws.c(dwq, anonymousClass1, this) == e) {
            return e;
        }
        return dpR.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.netflix.falkor.task.GraphQLListActions$addVideoToRemindMe$1$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
        final /* synthetic */ C1344Yb.c a;
        final /* synthetic */ C0987Kg b;
        final /* synthetic */ String c;
        int d;
        final /* synthetic */ drM<aLO<? extends Pair<Boolean, ? extends Status>>, dpR> e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(C1344Yb.c cVar, String str, C0987Kg c0987Kg, drM<? super aLO<? extends Pair<Boolean, ? extends Status>>, dpR> drm, InterfaceC8585dra<? super AnonymousClass1> interfaceC8585dra) {
            super(2, interfaceC8585dra);
            this.a = cVar;
            this.c = str;
            this.b = c0987Kg;
            this.e = drm;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
            return new AnonymousClass1(this.a, this.c, this.b, this.e, interfaceC8585dra);
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
            if (this.d == 0) {
                C8556dpz.d(obj);
                C1344Yb.b a = this.a.a();
                if (a != null && C8632dsu.c(a.b(), C8589dre.e(true))) {
                    aSC.e(this.c, true);
                    InterfaceC4004bSr.a aVar = InterfaceC4004bSr.c;
                    context = this.b.b;
                    String a2 = LoMoType.REMINDERS.a();
                    C8632dsu.a(a2, "");
                    aVar.c(context, a2, null, null, null);
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
