package io.reactivex.rxkotlin;

import io.reactivex.functions.Action;
import o.C8632dsu;
import o.drO;

/* loaded from: classes5.dex */
final class SubscribersKt$sam$io_reactivex_functions_Action$0 implements Action {
    private final /* synthetic */ drO function;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SubscribersKt$sam$io_reactivex_functions_Action$0(drO dro) {
        this.function = dro;
    }

    @Override // io.reactivex.functions.Action
    public final /* synthetic */ void run() {
        C8632dsu.b(this.function.invoke(), "");
    }
}
