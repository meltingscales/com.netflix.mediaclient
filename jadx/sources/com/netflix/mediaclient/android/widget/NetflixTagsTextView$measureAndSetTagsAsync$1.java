package com.netflix.mediaclient.android.widget;

import android.text.SpannableStringBuilder;
import android.widget.TextView;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class NetflixTagsTextView$measureAndSetTagsAsync$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    int b;
    final /* synthetic */ int c;
    final /* synthetic */ NetflixTagsTextView e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetflixTagsTextView$measureAndSetTagsAsync$1(int i, NetflixTagsTextView netflixTagsTextView, InterfaceC8585dra<? super NetflixTagsTextView$measureAndSetTagsAsync$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.c = i;
        this.e = netflixTagsTextView;
    }

    @Override // o.drX
    /* renamed from: a */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((NetflixTagsTextView$measureAndSetTagsAsync$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new NetflixTagsTextView$measureAndSetTagsAsync$1(this.c, this.e, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.b;
        if (i == 0) {
            C8556dpz.d(obj);
            int i2 = this.c;
            int paddingLeft = this.e.getPaddingLeft();
            int paddingRight = this.e.getPaddingRight();
            NetflixTagsTextView netflixTagsTextView = this.e;
            this.b = 1;
            obj = netflixTagsTextView.a((i2 - paddingLeft) - paddingRight, this);
            if (obj == e) {
                return e;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        this.e.setText((SpannableStringBuilder) obj, TextView.BufferType.SPANNABLE);
        return dpR.c;
    }
}
