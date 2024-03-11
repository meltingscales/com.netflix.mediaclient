package com.netflix.mediaclient.ui.more;

import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.RepeatOnLifecycleKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C6705ciO;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC5283bvo;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes4.dex */
public final class ProfileSelectionManager$handleProfileSelection$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ InterfaceC5283bvo b;
    final /* synthetic */ View c;
    final /* synthetic */ C6705ciO d;
    int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileSelectionManager$handleProfileSelection$1(C6705ciO c6705ciO, InterfaceC5283bvo interfaceC5283bvo, View view, InterfaceC8585dra<? super ProfileSelectionManager$handleProfileSelection$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.d = c6705ciO;
        this.b = interfaceC5283bvo;
        this.c = view;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new ProfileSelectionManager$handleProfileSelection$1(this.d, this.b, this.c, interfaceC8585dra);
    }

    @Override // o.drX
    /* renamed from: e */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((ProfileSelectionManager$handleProfileSelection$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.netflix.mediaclient.ui.more.ProfileSelectionManager$handleProfileSelection$1$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
        int a;
        final /* synthetic */ C6705ciO b;
        final /* synthetic */ View c;
        final /* synthetic */ InterfaceC5283bvo d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(C6705ciO c6705ciO, InterfaceC5283bvo interfaceC5283bvo, View view, InterfaceC8585dra<? super AnonymousClass1> interfaceC8585dra) {
            super(2, interfaceC8585dra);
            this.b = c6705ciO;
            this.d = interfaceC5283bvo;
            this.c = view;
        }

        @Override // o.drX
        /* renamed from: a */
        public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
            return ((AnonymousClass1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
            return new AnonymousClass1(this.b, this.d, this.c, interfaceC8585dra);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object e;
            e = C8586drb.e();
            int i = this.a;
            if (i == 0) {
                C8556dpz.d(obj);
                C6705ciO c6705ciO = this.b;
                InterfaceC5283bvo interfaceC5283bvo = this.d;
                View view = this.c;
                this.a = 1;
                if (c6705ciO.d(interfaceC5283bvo, view, this) == e) {
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
            lifecycleOwner = this.d.b;
            Lifecycle.State state = Lifecycle.State.CREATED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.d, this.b, this.c, null);
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
