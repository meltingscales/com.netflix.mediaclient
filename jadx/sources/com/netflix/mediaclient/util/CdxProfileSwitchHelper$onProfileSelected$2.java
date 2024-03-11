package com.netflix.mediaclient.util;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.RepeatOnLifecycleKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8130dea;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC5283bvo;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes5.dex */
public final class CdxProfileSwitchHelper$onProfileSelected$2 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ InterfaceC5283bvo a;
    final /* synthetic */ C8130dea d;
    int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CdxProfileSwitchHelper$onProfileSelected$2(C8130dea c8130dea, InterfaceC5283bvo interfaceC5283bvo, InterfaceC8585dra<? super CdxProfileSwitchHelper$onProfileSelected$2> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.d = c8130dea;
        this.a = interfaceC5283bvo;
    }

    @Override // o.drX
    /* renamed from: c */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((CdxProfileSwitchHelper$onProfileSelected$2) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new CdxProfileSwitchHelper$onProfileSelected$2(this.d, this.a, interfaceC8585dra);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.netflix.mediaclient.util.CdxProfileSwitchHelper$onProfileSelected$2$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
        int a;
        final /* synthetic */ InterfaceC5283bvo c;
        final /* synthetic */ C8130dea e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(C8130dea c8130dea, InterfaceC5283bvo interfaceC5283bvo, InterfaceC8585dra<? super AnonymousClass1> interfaceC8585dra) {
            super(2, interfaceC8585dra);
            this.e = c8130dea;
            this.c = interfaceC5283bvo;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
            return new AnonymousClass1(this.e, this.c, interfaceC8585dra);
        }

        @Override // o.drX
        /* renamed from: e */
        public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
            return ((AnonymousClass1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object e;
            Object a;
            e = C8586drb.e();
            int i = this.a;
            if (i == 0) {
                C8556dpz.d(obj);
                C8130dea c8130dea = this.e;
                InterfaceC5283bvo interfaceC5283bvo = this.c;
                this.a = 1;
                a = c8130dea.a(interfaceC5283bvo, this);
                if (a == e) {
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

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        LifecycleOwner lifecycleOwner;
        e = C8586drb.e();
        int i = this.e;
        if (i == 0) {
            C8556dpz.d(obj);
            lifecycleOwner = this.d.d;
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.d, this.a, null);
            this.e = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycleOwner, state, anonymousClass1, this) == e) {
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
