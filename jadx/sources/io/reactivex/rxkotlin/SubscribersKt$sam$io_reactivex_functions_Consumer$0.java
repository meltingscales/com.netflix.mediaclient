package io.reactivex.rxkotlin;

import io.reactivex.functions.Consumer;
import o.C8632dsu;
import o.drM;

/* loaded from: classes5.dex */
final class SubscribersKt$sam$io_reactivex_functions_Consumer$0 implements Consumer {
    private final /* synthetic */ drM function;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SubscribersKt$sam$io_reactivex_functions_Consumer$0(drM drm) {
        this.function = drm;
    }

    @Override // io.reactivex.functions.Consumer
    public final /* synthetic */ void accept(Object obj) {
        C8632dsu.b(this.function.invoke(obj), "");
    }
}
