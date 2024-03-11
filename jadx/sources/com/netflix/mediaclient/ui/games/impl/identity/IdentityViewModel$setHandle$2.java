package com.netflix.mediaclient.ui.games.impl.identity;

import android.content.Context;
import com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel;
import com.netflix.mediaclient.util.ConnectivityUtils;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C1332Xp;
import o.C8556dpz;
import o.C8586drb;
import o.C9935zP;
import o.InterfaceC8585dra;
import o.bQC;
import o.dpR;
import o.drX;
import o.dwU;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class IdentityViewModel$setHandle$2 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    int b;
    final /* synthetic */ IdentityViewModel c;
    final /* synthetic */ String d;
    final /* synthetic */ C9935zP e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdentityViewModel$setHandle$2(IdentityViewModel identityViewModel, String str, C9935zP c9935zP, InterfaceC8585dra<? super IdentityViewModel$setHandle$2> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.c = identityViewModel;
        this.d = str;
        this.e = c9935zP;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new IdentityViewModel$setHandle$2(this.c, this.d, this.e, interfaceC8585dra);
    }

    @Override // o.drX
    /* renamed from: d */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((IdentityViewModel$setHandle$2) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.b;
        if (i == 0) {
            C8556dpz.d(obj);
            C1332Xp c1332Xp = C1332Xp.b;
            if (ConnectivityUtils.n((Context) C1332Xp.b(Context.class))) {
                IdentityViewModel identityViewModel = this.c;
                String str = this.d;
                this.b = 1;
                obj = identityViewModel.a(str, this);
                if (obj == e) {
                    return e;
                }
            } else {
                this.e.b(bQC.a.class, new bQC.a(IdentityViewModel.SetHandleErrorType.b, null, 2, null));
                return dpR.c;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        bQC bqc = (bQC) obj;
        if (bqc != null) {
            this.e.b(bQC.class, bqc);
        }
        return dpR.c;
    }
}
