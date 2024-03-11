package com.netflix.mediaclient.ui.more;

import android.view.View;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C6705ciO;
import o.InterfaceC5283bvo;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes4.dex */
public final class ProfileSelectionManager$profileSelect$2 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super Boolean>, Object> {
    final /* synthetic */ View a;
    final /* synthetic */ InterfaceC5283bvo b;
    final /* synthetic */ InterfaceC5283bvo c;
    final /* synthetic */ C6705ciO d;
    int e;
    private /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileSelectionManager$profileSelect$2(C6705ciO c6705ciO, InterfaceC5283bvo interfaceC5283bvo, InterfaceC5283bvo interfaceC5283bvo2, View view, InterfaceC8585dra<? super ProfileSelectionManager$profileSelect$2> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.d = c6705ciO;
        this.b = interfaceC5283bvo;
        this.c = interfaceC5283bvo2;
        this.a = view;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        ProfileSelectionManager$profileSelect$2 profileSelectionManager$profileSelect$2 = new ProfileSelectionManager$profileSelect$2(this.d, this.b, this.c, this.a, interfaceC8585dra);
        profileSelectionManager$profileSelect$2.i = obj;
        return profileSelectionManager$profileSelect$2;
    }

    @Override // o.drX
    /* renamed from: e */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super Boolean> interfaceC8585dra) {
        return ((ProfileSelectionManager$profileSelect$2) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a1 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.more.ProfileSelectionManager$profileSelect$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
