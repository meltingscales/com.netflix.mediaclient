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

/* loaded from: classes4.dex */
final class ValidatePasswordDialog$onViewCreated$2$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ ValidatePasswordDialog a;
    int b;
    final /* synthetic */ EditText d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ValidatePasswordDialog$onViewCreated$2$1(EditText editText, ValidatePasswordDialog validatePasswordDialog, InterfaceC8585dra<? super ValidatePasswordDialog$onViewCreated$2$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.d = editText;
        this.a = validatePasswordDialog;
    }

    @Override // o.drX
    /* renamed from: a */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((ValidatePasswordDialog$onViewCreated$2$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new ValidatePasswordDialog$onViewCreated$2$1(this.d, this.a, interfaceC8585dra);
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
        this.d.requestFocus();
        FragmentActivity activity = this.a.getActivity();
        if (activity != null && (inputMethodManager = (InputMethodManager) ContextCompat.getSystemService(activity, InputMethodManager.class)) != null) {
            C8589dre.e(inputMethodManager.showSoftInput(this.d, 1));
        }
        return dpR.c;
    }
}
