package com.netflix.mediaclient.ui.more;

import com.netflix.cl.model.AppView;
import io.reactivex.Observable;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C6705ciO;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC5283bvo;
import o.InterfaceC8585dra;
import o.cNW;
import o.dAU;
import o.dpR;
import o.drO;
import o.drX;
import o.dwU;

/* loaded from: classes4.dex */
final class ProfileSelectionManager$profileSelect$2$selectProfile$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super cNW.b>, Object> {
    int b;
    final /* synthetic */ InterfaceC5283bvo c;
    final /* synthetic */ C6705ciO e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileSelectionManager$profileSelect$2$selectProfile$1(C6705ciO c6705ciO, InterfaceC5283bvo interfaceC5283bvo, InterfaceC8585dra<? super ProfileSelectionManager$profileSelect$2$selectProfile$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.e = c6705ciO;
        this.c = interfaceC5283bvo;
    }

    @Override // o.drX
    /* renamed from: a */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super cNW.b> interfaceC8585dra) {
        return ((ProfileSelectionManager$profileSelect$2$selectProfile$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new ProfileSelectionManager$profileSelect$2$selectProfile$1(this.e, this.c, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.b;
        if (i == 0) {
            C8556dpz.d(obj);
            Observable<cNW.b> e2 = this.e.e.d().e(this.e.d, this.c, AppView.accountMenu);
            AnonymousClass1 anonymousClass1 = new drO<cNW.b>() { // from class: com.netflix.mediaclient.ui.more.ProfileSelectionManager$profileSelect$2$selectProfile$1.1
                @Override // o.drO
                /* renamed from: e */
                public final cNW.b invoke() {
                    return new cNW.b(2, null, false, 6, null);
                }
            };
            this.b = 1;
            obj = dAU.d(e2, anonymousClass1, this);
            if (obj == e) {
                return e;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        return obj;
    }
}