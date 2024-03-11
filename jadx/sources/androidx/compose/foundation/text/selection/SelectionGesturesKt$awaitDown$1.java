package androidx.compose.foundation.text.selection;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.InterfaceC8585dra;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SelectionGesturesKt$awaitDown$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SelectionGesturesKt$awaitDown$1(InterfaceC8585dra<? super SelectionGesturesKt$awaitDown$1> interfaceC8585dra) {
        super(interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object awaitDown;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        awaitDown = SelectionGesturesKt.awaitDown(null, this);
        return awaitDown;
    }
}
