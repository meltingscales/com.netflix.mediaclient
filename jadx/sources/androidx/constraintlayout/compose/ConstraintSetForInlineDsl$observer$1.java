package androidx.constraintlayout.compose;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.Lambda;
import o.C8632dsu;
import o.dpR;
import o.drM;
import o.drO;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ConstraintSetForInlineDsl$observer$1 extends Lambda implements drM<drO<? extends dpR>, dpR> {
    final /* synthetic */ ConstraintSetForInlineDsl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintSetForInlineDsl$observer$1(ConstraintSetForInlineDsl constraintSetForInlineDsl) {
        super(1);
        this.this$0 = constraintSetForInlineDsl;
    }

    @Override // o.drM
    public /* bridge */ /* synthetic */ dpR invoke(drO<? extends dpR> dro) {
        invoke2((drO<dpR>) dro);
        return dpR.c;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(final drO<dpR> dro) {
        Handler handler;
        C8632dsu.c((Object) dro, "");
        if (!C8632dsu.c(Looper.myLooper(), Looper.getMainLooper())) {
            handler = this.this$0.handler;
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
                this.this$0.handler = handler;
            }
            handler.post(new Runnable() { // from class: androidx.constraintlayout.compose.ConstraintSetForInlineDsl$observer$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    ConstraintSetForInlineDsl$observer$1.m2604invoke$lambda1(drO.this);
                }
            });
            return;
        }
        dro.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invoke$lambda-1  reason: not valid java name */
    public static final void m2604invoke$lambda1(drO dro) {
        C8632dsu.c((Object) dro, "");
        dro.invoke();
    }
}
