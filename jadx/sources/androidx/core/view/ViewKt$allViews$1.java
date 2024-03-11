package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dtQ;
import o.dtW;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ViewKt$allViews$1 extends RestrictedSuspendLambda implements drX<dtW<? super View>, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ View $this_allViews;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewKt$allViews$1(View view, InterfaceC8585dra<? super ViewKt$allViews$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.$this_allViews = view;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        ViewKt$allViews$1 viewKt$allViews$1 = new ViewKt$allViews$1(this.$this_allViews, interfaceC8585dra);
        viewKt$allViews$1.L$0 = obj;
        return viewKt$allViews$1;
    }

    @Override // o.drX
    public final Object invoke(dtW<? super View> dtw, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((ViewKt$allViews$1) create(dtw, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        dtW dtw;
        e = C8586drb.e();
        int i = this.label;
        if (i == 0) {
            C8556dpz.d(obj);
            dtw = (dtW) this.L$0;
            View view = this.$this_allViews;
            this.L$0 = dtw;
            this.label = 1;
            if (dtw.d((dtW) view, (InterfaceC8585dra<? super dpR>) this) == e) {
                return e;
            }
        } else if (i != 1) {
            if (i == 2) {
                C8556dpz.d(obj);
                return dpR.c;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            dtw = (dtW) this.L$0;
            C8556dpz.d(obj);
        }
        View view2 = this.$this_allViews;
        if (view2 instanceof ViewGroup) {
            dtQ<View> descendants = ViewGroupKt.getDescendants((ViewGroup) view2);
            this.L$0 = null;
            this.label = 2;
            if (dtw.b(descendants, this) == e) {
                return e;
            }
        }
        return dpR.c;
    }
}
