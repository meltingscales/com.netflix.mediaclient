package com.netflix.mediaclient.acquisition.screens.signupContainer;

import android.view.View;
import androidx.fragment.app.Fragment;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class SignupNativeActivity$launchFragment$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ Fragment $fragment;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignupNativeActivity$launchFragment$1(Fragment fragment, InterfaceC8585dra<? super SignupNativeActivity$launchFragment$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.$fragment = fragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new SignupNativeActivity$launchFragment$1(this.$fragment, interfaceC8585dra);
    }

    @Override // o.drX
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((SignupNativeActivity$launchFragment$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C8586drb.e();
        if (this.label == 0) {
            C8556dpz.d(obj);
            View view = this.$fragment.getView();
            if (view != null) {
                view.sendAccessibilityEvent(32);
            }
            return dpR.c;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
