package com.netflix.mediaclient.acquisition.screens.signupContainer;

import kotlin.jvm.internal.FunctionReferenceImpl;
import o.dpR;
import o.drO;

/* loaded from: classes3.dex */
final /* synthetic */ class SignupNativeActivity$fetchMode$1$onAfterNetworkAction$1 extends FunctionReferenceImpl implements drO<dpR> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public SignupNativeActivity$fetchMode$1$onAfterNetworkAction$1(Object obj) {
        super(0, obj, ErrorDialogHelper.class, "goToSignin", "goToSignin()V", 0);
    }

    @Override // o.drO
    public /* bridge */ /* synthetic */ dpR invoke() {
        invoke2();
        return dpR.c;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((ErrorDialogHelper) this.receiver).goToSignin();
    }
}
