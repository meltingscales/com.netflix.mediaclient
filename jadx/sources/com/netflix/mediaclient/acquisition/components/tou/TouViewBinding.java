package com.netflix.mediaclient.acquisition.components.tou;

import android.annotation.SuppressLint;
import com.netflix.mediaclient.acquisition.components.tou.TouViewModel;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import o.C8632dsu;
import o.C9618tM;
import o.dpR;
import o.drM;

/* loaded from: classes3.dex */
public class TouViewBinding<T extends TouViewModel> {
    public static final int $stable = 8;
    private final TermsOfUseView touView;

    public TouViewBinding(TermsOfUseView termsOfUseView) {
        C8632dsu.c((Object) termsOfUseView, "");
        this.touView = termsOfUseView;
    }

    @SuppressLint({"CheckResult"})
    public void bind(final T t) {
        C8632dsu.c((Object) t, "");
        this.touView.setVisibility(t.isVisible() ? 0 : 8);
        this.touView.setCheckboxVisible(t.isCheckboxVisible());
        this.touView.setCheckboxChecked(t.isAccepted());
        this.touView.setText(t.getText());
        String rightOfWithdrawalText = t.getRightOfWithdrawalText();
        if (rightOfWithdrawalText != null) {
            this.touView.setRightofWithdrawalText(rightOfWithdrawalText);
        }
        Observable<Boolean> takeUntil = this.touView.rightOfWithdrawalCheckedChanges().takeUntil(C9618tM.d(this.touView));
        final drM<Boolean, dpR> drm = new drM<Boolean, dpR>() { // from class: com.netflix.mediaclient.acquisition.components.tou.TouViewBinding$bind$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: Incorrect types in method signature: (TT;)V */
            {
                super(1);
            }

            @Override // o.drM
            public /* bridge */ /* synthetic */ dpR invoke(Boolean bool) {
                invoke2(bool);
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Boolean bool) {
                TouViewModel touViewModel = TouViewModel.this;
                C8632dsu.d(bool);
                touViewModel.setRightOfWithdrawalAccepted(bool.booleanValue());
            }
        };
        takeUntil.subscribe(new Consumer() { // from class: com.netflix.mediaclient.acquisition.components.tou.TouViewBinding$$ExternalSyntheticLambda0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                TouViewBinding.bind$lambda$1(drM.this, obj);
            }
        });
        Observable<Boolean> takeUntil2 = this.touView.checkedChanges().takeUntil(C9618tM.d(this.touView));
        final drM<Boolean, dpR> drm2 = new drM<Boolean, dpR>() { // from class: com.netflix.mediaclient.acquisition.components.tou.TouViewBinding$bind$3
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: Incorrect types in method signature: (TT;)V */
            {
                super(1);
            }

            @Override // o.drM
            public /* bridge */ /* synthetic */ dpR invoke(Boolean bool) {
                invoke2(bool);
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Boolean bool) {
                TouViewModel touViewModel = TouViewModel.this;
                C8632dsu.d(bool);
                touViewModel.setAccepted(bool.booleanValue());
            }
        };
        takeUntil2.subscribe(new Consumer() { // from class: com.netflix.mediaclient.acquisition.components.tou.TouViewBinding$$ExternalSyntheticLambda1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                TouViewBinding.bind$lambda$2(drM.this, obj);
            }
        });
        this.touView.setShouldShowMandateModificationTermOfUse(t.getShouldShowMandateModificationTermOfUse());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$1(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$2(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }
}
