package com.netflix.mediaclient.acquisition.components.tou;

import android.content.Context;
import android.text.Spannable;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.netflix.mediaclient.acquisition.databinding.TermsOfUseLayoutBinding;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import o.C1204Sr;
import o.C8168dfL;
import o.C8627dsp;
import o.C8632dsu;
import o.C9629tX;
import o.C9696vK;
import o.dpR;
import o.drM;

/* loaded from: classes3.dex */
public final class TermsOfUseView extends ConstraintLayout implements TermsAndConsentsComponent {
    public static final int $stable = 8;
    private final TermsOfUseLayoutBinding binding;
    private final C1204Sr cardChainingDisclosure;
    private final C1204Sr cashPaymentDisclaimerText;
    private final C1204Sr internationalPaymentsText;
    private final CheckBox rightOfWithDrawalCheckBox;
    private final C1204Sr rightOfWithDrawalText;
    private final LinearLayout rightOfWithDrawalView;
    private final C1204Sr schufaText;
    private final CheckBox touCheckbox;
    private final C1204Sr touDebitBank;
    private final C1204Sr touErrorMessage;
    private final C1204Sr touMandateModificationTerms;
    private final C1204Sr touText;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TermsOfUseView(Context context) {
        this(context, null, 0, 6, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TermsOfUseView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C8632dsu.c((Object) context, "");
    }

    public static /* synthetic */ void getCashPaymentDisclaimerText$annotations() {
    }

    public static /* synthetic */ void getSchufaText$annotations() {
    }

    public static /* synthetic */ void getTouCheckbox$annotations() {
    }

    public static /* synthetic */ void getTouErrorMessage$annotations() {
    }

    public static /* synthetic */ void getTouText$annotations() {
    }

    public final C1204Sr getCashPaymentDisclaimerText() {
        return this.cashPaymentDisclaimerText;
    }

    public final C1204Sr getSchufaText() {
        return this.schufaText;
    }

    public final CheckBox getTouCheckbox() {
        return this.touCheckbox;
    }

    public final C1204Sr getTouErrorMessage() {
        return this.touErrorMessage;
    }

    public final C1204Sr getTouText() {
        return this.touText;
    }

    public /* synthetic */ TermsOfUseView(Context context, AttributeSet attributeSet, int i, int i2, C8627dsp c8627dsp) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TermsOfUseView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C8632dsu.c((Object) context, "");
        TermsOfUseLayoutBinding inflate = TermsOfUseLayoutBinding.inflate(LayoutInflater.from(context), this);
        C8632dsu.a(inflate, "");
        this.binding = inflate;
        C1204Sr c1204Sr = inflate.internationalPaymentsText;
        C8632dsu.a(c1204Sr, "");
        this.internationalPaymentsText = c1204Sr;
        C1204Sr c1204Sr2 = inflate.schufaText;
        C8632dsu.a(c1204Sr2, "");
        this.schufaText = c1204Sr2;
        C1204Sr c1204Sr3 = inflate.cashPaymentDisclaimerText;
        C8632dsu.a(c1204Sr3, "");
        this.cashPaymentDisclaimerText = c1204Sr3;
        C1204Sr c1204Sr4 = inflate.touDebitBank;
        C8632dsu.a(c1204Sr4, "");
        this.touDebitBank = c1204Sr4;
        C1204Sr c1204Sr5 = inflate.cardChainingDisclosure;
        C8632dsu.a(c1204Sr5, "");
        this.cardChainingDisclosure = c1204Sr5;
        CheckBox checkBox = inflate.touCheckbox;
        C8632dsu.a(checkBox, "");
        this.touCheckbox = checkBox;
        C1204Sr c1204Sr6 = inflate.touErrorMessage;
        C8632dsu.a(c1204Sr6, "");
        this.touErrorMessage = c1204Sr6;
        C1204Sr c1204Sr7 = inflate.touText;
        C8632dsu.a(c1204Sr7, "");
        this.touText = c1204Sr7;
        LinearLayout linearLayout = inflate.rightOfWithdrawalView;
        C8632dsu.a(linearLayout, "");
        this.rightOfWithDrawalView = linearLayout;
        CheckBox checkBox2 = inflate.rightOfWithdrawalCheckbox;
        C8632dsu.a(checkBox2, "");
        this.rightOfWithDrawalCheckBox = checkBox2;
        C1204Sr c1204Sr8 = inflate.rightOfWithdrawalText;
        C8632dsu.a(c1204Sr8, "");
        this.rightOfWithDrawalText = c1204Sr8;
        C1204Sr c1204Sr9 = inflate.touMandateModificationTerms;
        C8632dsu.a(c1204Sr9, "");
        this.touMandateModificationTerms = c1204Sr9;
        if (isInEditMode()) {
            return;
        }
        c1204Sr7.setOnClickListener(new View.OnClickListener() { // from class: com.netflix.mediaclient.acquisition.components.tou.TermsOfUseView$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TermsOfUseView._init_$lambda$0(TermsOfUseView.this, view);
            }
        });
        c1204Sr7.setMovementMethod(LinkMovementMethod.getInstance());
    }

    private final boolean isTouAccepted() {
        return this.touCheckbox.isChecked() || !isCheckboxVisible();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(TermsOfUseView termsOfUseView, View view) {
        C8632dsu.c((Object) termsOfUseView, "");
        if (termsOfUseView.isCheckboxVisible()) {
            CheckBox checkBox = termsOfUseView.touCheckbox;
            checkBox.setChecked(!checkBox.isChecked());
        }
    }

    public final void setText(String str) {
        C8632dsu.c((Object) str, "");
        C1204Sr c1204Sr = this.touText;
        Spanned c = C8168dfL.c(str);
        C8632dsu.d(c);
        C9696vK.c(c1204Sr, (Spannable) c);
    }

    public final void setCheckboxVisible(boolean z) {
        this.touCheckbox.setVisibility(z ? 0 : 8);
    }

    public final void setCheckboxChecked(boolean z) {
        this.touCheckbox.setChecked(z);
    }

    public final void setInternationalTransactionMessageVisible(boolean z) {
        this.internationalPaymentsText.setVisibility(z ? 0 : 8);
    }

    private final void ensureVisibleAndHideTouText() {
        if (getVisibility() != 0) {
            setVisibility(0);
            this.touText.setVisibility(8);
        }
    }

    public final void setSchufaTextVisible(boolean z) {
        this.schufaText.setVisibility(z ? 0 : 8);
        ensureVisibleAndHideTouText();
    }

    public final void setTouDebitBankVisible(boolean z) {
        this.touDebitBank.setVisibility(z ? 0 : 8);
        ensureVisibleAndHideTouText();
    }

    public final void setTouDebitBankText(String str) {
        C8632dsu.c((Object) str, "");
        this.touDebitBank.setText(str);
    }

    public final void setCashDisclaimer(String str) {
        C8632dsu.c((Object) str, "");
        this.cashPaymentDisclaimerText.setVisibility(0);
        this.cashPaymentDisclaimerText.setText(str);
    }

    public final void setCardChainingDisclosureVisible(boolean z) {
        this.cardChainingDisclosure.setVisibility(z ? 0 : 8);
        ensureVisibleAndHideTouText();
    }

    public final void setRightofWithdrawalText(String str) {
        C8632dsu.c((Object) str, "");
        if (C8168dfL.g(str)) {
            return;
        }
        this.rightOfWithDrawalView.setVisibility(0);
        this.rightOfWithDrawalText.setText(str);
    }

    public final boolean isRightOfWithdrawalAccepted() {
        if (this.rightOfWithDrawalView.getVisibility() != 0) {
            return true;
        }
        return this.rightOfWithDrawalCheckBox.isChecked();
    }

    private final boolean isCheckboxVisible() {
        return this.touCheckbox.getVisibility() == 0;
    }

    public final boolean hasAcceptedTermsOfUse() {
        updateErrorVisibility();
        return isTouAccepted() && isRightOfWithdrawalAccepted();
    }

    @Override // com.netflix.mediaclient.acquisition.components.tou.TermsAndConsentsComponent
    public boolean hasAcceptedRequiredCheckBoxes() {
        return hasAcceptedTermsOfUse();
    }

    public final void updateErrorVisibility() {
        this.touCheckbox.setActivated(true);
        this.touErrorMessage.setVisibility((isTouAccepted() && isRightOfWithdrawalAccepted()) ? 8 : 0);
    }

    public final Observable<Boolean> rightOfWithdrawalCheckedChanges() {
        Observable<Boolean> skip = C9629tX.e(this.rightOfWithDrawalCheckBox).skip(1L);
        final drM<Boolean, dpR> drm = new drM<Boolean, dpR>() { // from class: com.netflix.mediaclient.acquisition.components.tou.TermsOfUseView$rightOfWithdrawalCheckedChanges$1
            /* JADX INFO: Access modifiers changed from: package-private */
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
                TermsOfUseView.this.updateErrorVisibility();
            }
        };
        Observable<Boolean> doOnNext = skip.doOnNext(new Consumer() { // from class: com.netflix.mediaclient.acquisition.components.tou.TermsOfUseView$$ExternalSyntheticLambda1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                TermsOfUseView.rightOfWithdrawalCheckedChanges$lambda$1(drM.this, obj);
            }
        });
        C8632dsu.a(doOnNext, "");
        return doOnNext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void rightOfWithdrawalCheckedChanges$lambda$1(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    public final Observable<Boolean> checkedChanges() {
        Observable<Boolean> skip = C9629tX.e(this.touCheckbox).skip(1L);
        final drM<Boolean, dpR> drm = new drM<Boolean, dpR>() { // from class: com.netflix.mediaclient.acquisition.components.tou.TermsOfUseView$checkedChanges$1
            /* JADX INFO: Access modifiers changed from: package-private */
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
                TermsOfUseView.this.updateErrorVisibility();
            }
        };
        Observable<Boolean> doOnNext = skip.doOnNext(new Consumer() { // from class: com.netflix.mediaclient.acquisition.components.tou.TermsOfUseView$$ExternalSyntheticLambda2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                TermsOfUseView.checkedChanges$lambda$2(drM.this, obj);
            }
        });
        C8632dsu.a(doOnNext, "");
        return doOnNext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkedChanges$lambda$2(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    public final boolean getShouldShowMandateModificationTermOfUse() {
        return this.touMandateModificationTerms.getVisibility() == 0;
    }

    public final void setShouldShowMandateModificationTermOfUse(boolean z) {
        this.touMandateModificationTerms.setVisibility(z ? 0 : 8);
    }
}
