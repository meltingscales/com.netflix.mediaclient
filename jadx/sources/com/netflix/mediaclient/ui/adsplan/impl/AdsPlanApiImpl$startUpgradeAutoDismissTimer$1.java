package com.netflix.mediaclient.ui.adsplan.impl;

import androidx.lifecycle.LifecycleOwnerKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C5305bwJ;
import o.C8556dpz;
import o.C8586drb;
import o.C8749dxc;
import o.InterfaceC6675chl;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes4.dex */
public final class AdsPlanApiImpl$startUpgradeAutoDismissTimer$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    int d;
    final /* synthetic */ C5305bwJ e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdsPlanApiImpl$startUpgradeAutoDismissTimer$1(C5305bwJ c5305bwJ, InterfaceC8585dra<? super AdsPlanApiImpl$startUpgradeAutoDismissTimer$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.e = c5305bwJ;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new AdsPlanApiImpl$startUpgradeAutoDismissTimer$1(this.e, interfaceC8585dra);
    }

    @Override // o.drX
    /* renamed from: e */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((AdsPlanApiImpl$startUpgradeAutoDismissTimer$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.d;
        if (i == 0) {
            C8556dpz.d(obj);
            long a = C5305bwJ.e.a();
            this.d = 1;
            if (C8749dxc.b(a, this) == e) {
                return e;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        LifecycleOwnerKt.getLifecycleScope(this.e.o()).launchWhenResumed(new AnonymousClass1(this.e, null));
        return dpR.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.netflix.mediaclient.ui.adsplan.impl.AdsPlanApiImpl$startUpgradeAutoDismissTimer$1$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
        final /* synthetic */ C5305bwJ c;
        int e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(C5305bwJ c5305bwJ, InterfaceC8585dra<? super AnonymousClass1> interfaceC8585dra) {
            super(2, interfaceC8585dra);
            this.c = c5305bwJ;
        }

        @Override // o.drX
        /* renamed from: b */
        public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
            return ((AnonymousClass1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
            return new AnonymousClass1(this.c, interfaceC8585dra);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            InterfaceC6675chl interfaceC6675chl;
            C8586drb.e();
            if (this.e == 0) {
                C8556dpz.d(obj);
                interfaceC6675chl = this.c.m;
                interfaceC6675chl.e("Cfour.ChangePlanScreen.SwitchedOutOfCfourPlan.Modal");
                return dpR.c;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
