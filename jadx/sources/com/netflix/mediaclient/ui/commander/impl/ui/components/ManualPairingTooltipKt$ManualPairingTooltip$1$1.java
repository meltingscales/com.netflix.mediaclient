package com.netflix.mediaclient.ui.commander.impl.ui.components;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.C8738dws;
import o.GF;
import o.InterfaceC8585dra;
import o.dpR;
import o.drO;
import o.drX;
import o.dwQ;
import o.dwU;

/* loaded from: classes4.dex */
public final class ManualPairingTooltipKt$ManualPairingTooltip$1$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ drO<dpR> a;
    int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManualPairingTooltipKt$ManualPairingTooltip$1$1(drO<dpR> dro, InterfaceC8585dra<? super ManualPairingTooltipKt$ManualPairingTooltip$1$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.a = dro;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new ManualPairingTooltipKt$ManualPairingTooltip$1$1(this.a, interfaceC8585dra);
    }

    @Override // o.drX
    /* renamed from: d */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((ManualPairingTooltipKt$ManualPairingTooltip$1$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.netflix.mediaclient.ui.commander.impl.ui.components.ManualPairingTooltipKt$ManualPairingTooltip$1$1$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
        int c;
        final /* synthetic */ drO<dpR> e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(drO<dpR> dro, InterfaceC8585dra<? super AnonymousClass1> interfaceC8585dra) {
            super(2, interfaceC8585dra);
            this.e = dro;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
            return new AnonymousClass1(this.e, interfaceC8585dra);
        }

        @Override // o.drX
        /* renamed from: e */
        public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
            return ((AnonymousClass1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C8586drb.e();
            if (this.c == 0) {
                C8556dpz.d(obj);
                this.e.invoke();
                return dpR.c;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.e;
        if (i == 0) {
            C8556dpz.d(obj);
            dwQ d = GF.d();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.a, null);
            this.e = 1;
            if (C8738dws.c(d, anonymousClass1, this) == e) {
                return e;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        return dpR.c;
    }
}
