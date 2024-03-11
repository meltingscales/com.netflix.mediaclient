package com.netflix.clcs.ui;

import androidx.compose.ui.focus.FocusRequester;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes2.dex */
public final class ClcsPinEntryKt$ClcsPinEntry$3$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    int c;
    final /* synthetic */ FocusRequester d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClcsPinEntryKt$ClcsPinEntry$3$1(FocusRequester focusRequester, InterfaceC8585dra<? super ClcsPinEntryKt$ClcsPinEntry$3$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.d = focusRequester;
    }

    @Override // o.drX
    /* renamed from: b */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((ClcsPinEntryKt$ClcsPinEntry$3$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new ClcsPinEntryKt$ClcsPinEntry$3$1(this.d, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C8586drb.e();
        if (this.c == 0) {
            C8556dpz.d(obj);
            this.d.requestFocus();
            return dpR.c;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
