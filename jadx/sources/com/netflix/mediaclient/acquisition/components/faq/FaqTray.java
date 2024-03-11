package com.netflix.mediaclient.acquisition.components.faq;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.netflix.mediaclient.acquisition.R;
import com.netflix.mediaclient.acquisition.components.faq.FaqFragment;
import java.util.List;
import o.C8632dsu;
import o.C9834xU;
import o.TH;
import o.dpR;
import o.drM;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes3.dex */
public final class FaqTray extends TH {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FaqTray(Context context, List<FaqBlockViewModel> list, final FaqFragment.FaqInteractionListener faqInteractionListener, drM<? super View, dpR> drm) {
        super(context, R.layout.faq_tray, drm, null, 0, 0, 0, 0, context.getResources().getDimensionPixelSize(C9834xU.a.z), false, false, false, false, false, 16120, null);
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) faqInteractionListener, "");
        C8632dsu.c((Object) drm, "");
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.faqBlocksHolder);
        for (FaqBlockViewModel faqBlockViewModel : list) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            FaqBlockView faqBlockView = new FaqBlockView(context, null, 0, 6, null);
            faqBlockView.setLayoutParams(layoutParams);
            faqBlockView.bind(faqBlockViewModel, faqInteractionListener);
            faqBlockView.setTag(faqBlockViewModel.getFaqItemId());
            linearLayout.addView(faqBlockView);
        }
        findViewById(R.id.closeButton).setOnClickListener(new View.OnClickListener() { // from class: com.netflix.mediaclient.acquisition.components.faq.FaqTray$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FaqTray._init_$lambda$0(FaqFragment.FaqInteractionListener.this, this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(FaqFragment.FaqInteractionListener faqInteractionListener, FaqTray faqTray, View view) {
        C8632dsu.c((Object) faqInteractionListener, "");
        C8632dsu.c((Object) faqTray, "");
        faqInteractionListener.logFaqTrayClosed();
        faqTray.close();
    }
}
