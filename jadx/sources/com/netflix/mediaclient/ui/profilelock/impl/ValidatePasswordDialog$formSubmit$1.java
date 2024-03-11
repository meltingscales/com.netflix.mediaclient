package com.netflix.mediaclient.ui.profilelock.impl;

import android.text.Editable;
import android.widget.EditText;
import com.netflix.mediaclient.ui.profilelock.impl.ValidatePasswordDialog;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C5863cLd;
import o.C5875cLp;
import o.C8556dpz;
import o.C8586drb;
import o.C9935zP;
import o.InterfaceC8585dra;
import o.cKA;
import o.cKB;
import o.dpR;
import o.drX;
import o.dwU;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class ValidatePasswordDialog$formSubmit$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ ValidatePasswordDialog a;
    int c;
    final /* synthetic */ C9935zP d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ValidatePasswordDialog$formSubmit$1(ValidatePasswordDialog validatePasswordDialog, C9935zP c9935zP, InterfaceC8585dra<? super ValidatePasswordDialog$formSubmit$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.a = validatePasswordDialog;
        this.d = c9935zP;
    }

    @Override // o.drX
    /* renamed from: b */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((ValidatePasswordDialog$formSubmit$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new ValidatePasswordDialog$formSubmit$1(this.a, this.d, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        ValidatePasswordDialog.e eVar;
        C5875cLp c;
        EditText editText;
        Editable text;
        ValidatePasswordDialog.e eVar2;
        C5875cLp c2;
        e = C8586drb.e();
        int i = this.c;
        if (i == 0) {
            C8556dpz.d(obj);
            eVar = this.a.d;
            String str = (eVar == null || (c = eVar.c()) == null || (editText = c.e) == null || (text = editText.getText()) == null || (str = text.toString()) == null) ? "" : "";
            cKA g = this.a.g();
            this.c = 1;
            obj = g.d(str, this);
            if (obj == e) {
                return e;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        this.d.b(cKB.class, new cKB.a(booleanValue));
        if (!booleanValue) {
            eVar2 = this.a.d;
            EditText editText2 = (eVar2 == null || (c2 = eVar2.c()) == null) ? null : c2.e;
            if (editText2 != null) {
                editText2.setError(this.a.getString(C5863cLd.a.a));
            }
        }
        this.a.b(false);
        return dpR.c;
    }
}
