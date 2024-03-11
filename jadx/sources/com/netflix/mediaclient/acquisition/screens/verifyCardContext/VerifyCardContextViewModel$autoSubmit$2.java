package com.netflix.mediaclient.acquisition.screens.verifyCardContext;

import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Lambda;
import o.C8632dsu;
import o.dpR;
import o.drM;
import o.drO;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class VerifyCardContextViewModel$autoSubmit$2 extends Lambda implements drO<Observable<dpR>> {
    final /* synthetic */ VerifyCardContextViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifyCardContextViewModel$autoSubmit$2(VerifyCardContextViewModel verifyCardContextViewModel) {
        super(0);
        this.this$0 = verifyCardContextViewModel;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.drO
    public final Observable<dpR> invoke() {
        VerifyCardContextParsedData verifyCardContextParsedData;
        verifyCardContextParsedData = this.this$0.parsedData;
        if (verifyCardContextParsedData.getShouldAutoSubmit()) {
            Observable<Long> timer = Observable.timer(VerifyCardContextViewModel.AUTO_SUBMIT_TIMEOUT_MS, TimeUnit.MILLISECONDS);
            final AnonymousClass1 anonymousClass1 = new drM<Long, dpR>() { // from class: com.netflix.mediaclient.acquisition.screens.verifyCardContext.VerifyCardContextViewModel$autoSubmit$2.1
                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(Long l) {
                    C8632dsu.c((Object) l, "");
                }

                @Override // o.drM
                public /* bridge */ /* synthetic */ dpR invoke(Long l) {
                    invoke2(l);
                    return dpR.c;
                }
            };
            return timer.map(new Function() { // from class: com.netflix.mediaclient.acquisition.screens.verifyCardContext.VerifyCardContextViewModel$autoSubmit$2$$ExternalSyntheticLambda0
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    dpR invoke$lambda$0;
                    invoke$lambda$0 = VerifyCardContextViewModel$autoSubmit$2.invoke$lambda$0(drM.this, obj);
                    return invoke$lambda$0;
                }
            });
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dpR invoke$lambda$0(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (dpR) drm.invoke(obj);
    }
}
