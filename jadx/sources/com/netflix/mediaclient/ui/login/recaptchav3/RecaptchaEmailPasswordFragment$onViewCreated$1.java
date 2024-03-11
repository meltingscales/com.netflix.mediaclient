package com.netflix.mediaclient.ui.login.recaptchav3;

import android.widget.ScrollView;
import com.netflix.mediaclient.ui.login.recaptchav3.RecaptchaEmailPasswordFragment$onViewCreated$1;
import kotlin.jvm.internal.Lambda;
import o.dpR;
import o.drO;

/* loaded from: classes4.dex */
public final class RecaptchaEmailPasswordFragment$onViewCreated$1 extends Lambda implements drO<dpR> {
    final /* synthetic */ ScrollView c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecaptchaEmailPasswordFragment$onViewCreated$1(ScrollView scrollView) {
        super(0);
        this.c = scrollView;
    }

    @Override // o.drO
    public /* synthetic */ dpR invoke() {
        a();
        return dpR.c;
    }

    public final void a() {
        final ScrollView scrollView = this.c;
        scrollView.post(new Runnable() { // from class: o.cbI
            @Override // java.lang.Runnable
            public final void run() {
                RecaptchaEmailPasswordFragment$onViewCreated$1.d(scrollView);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(ScrollView scrollView) {
        scrollView.smoothScrollTo(0, scrollView.getChildAt(0).getHeight());
    }
}
