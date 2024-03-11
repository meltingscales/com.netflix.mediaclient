package com.netflix.mediaclient.ui.profilelock.impl;

import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.C8589dre;
import o.C8749dxc;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class ProfileLockPinDialog$onViewCreated$1$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    int b;
    final /* synthetic */ ProfileLockPinDialog c;
    final /* synthetic */ EditText e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileLockPinDialog$onViewCreated$1$1(EditText editText, ProfileLockPinDialog profileLockPinDialog, InterfaceC8585dra<? super ProfileLockPinDialog$onViewCreated$1$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.e = editText;
        this.c = profileLockPinDialog;
    }

    @Override // o.drX
    /* renamed from: b */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((ProfileLockPinDialog$onViewCreated$1$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new ProfileLockPinDialog$onViewCreated$1$1(this.e, this.c, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        InputMethodManager inputMethodManager;
        e = C8586drb.e();
        int i = this.b;
        if (i == 0) {
            C8556dpz.d(obj);
            this.b = 1;
            if (C8749dxc.b(100L, this) == e) {
                return e;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        this.e.requestFocus();
        FragmentActivity activity = this.c.getActivity();
        if (activity != null && (inputMethodManager = (InputMethodManager) ContextCompat.getSystemService(activity, InputMethodManager.class)) != null) {
            C8589dre.e(inputMethodManager.showSoftInput(this.e, 1));
        }
        return dpR.c;
    }
}
