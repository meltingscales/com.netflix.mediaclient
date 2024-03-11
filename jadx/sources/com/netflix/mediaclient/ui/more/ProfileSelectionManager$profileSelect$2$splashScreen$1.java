package com.netflix.mediaclient.ui.more;

import android.view.View;
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
final class ProfileSelectionManager$profileSelect$2$splashScreen$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    int b;
    final /* synthetic */ InterfaceC5283bvo c;
    final /* synthetic */ C6705ciO d;
    final /* synthetic */ View e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileSelectionManager$profileSelect$2$splashScreen$1(C6705ciO c6705ciO, InterfaceC5283bvo interfaceC5283bvo, View view, InterfaceC8585dra<? super ProfileSelectionManager$profileSelect$2$splashScreen$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.d = c6705ciO;
        this.c = interfaceC5283bvo;
        this.e = view;
    }

    @Override // o.drX
    /* renamed from: c */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((ProfileSelectionManager$profileSelect$2$splashScreen$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new ProfileSelectionManager$profileSelect$2$splashScreen$1(this.d, this.c, this.e, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        Object b;
        e = C8586drb.e();
        int i = this.b;
        if (i == 0) {
            C8556dpz.d(obj);
            C6705ciO c6705ciO = this.d;
            InterfaceC5283bvo interfaceC5283bvo = this.c;
            View view = this.e;
            this.b = 1;
            b = c6705ciO.b(interfaceC5283bvo, view, this);
            if (b == e) {
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
