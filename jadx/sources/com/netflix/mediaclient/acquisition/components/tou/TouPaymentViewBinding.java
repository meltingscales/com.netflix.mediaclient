package com.netflix.mediaclient.acquisition.components.tou;

import o.C8632dsu;

/* loaded from: classes3.dex */
public final class TouPaymentViewBinding extends TouViewBinding<TouPaymentViewModel> {
    public static final int $stable = 8;
    private final TermsOfUseView touView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TouPaymentViewBinding(TermsOfUseView termsOfUseView) {
        super(termsOfUseView);
        C8632dsu.c((Object) termsOfUseView, "");
        this.touView = termsOfUseView;
    }

    @Override // com.netflix.mediaclient.acquisition.components.tou.TouViewBinding
    public void bind(TouPaymentViewModel touPaymentViewModel) {
        C8632dsu.c((Object) touPaymentViewModel, "");
        super.bind((TouPaymentViewBinding) touPaymentViewModel);
        this.touView.setInternationalTransactionMessageVisible(touPaymentViewModel.getShowInternationalTransactionMessage());
        this.touView.setSchufaTextVisible(touPaymentViewModel.getShowSchufaText());
        if (touPaymentViewModel.getShowSchufaText()) {
            this.touView.setTouDebitBankText(touPaymentViewModel.getTouDebitBankText());
        }
        if (touPaymentViewModel.getShouldShowCashDisclaimer()) {
            TermsOfUseView termsOfUseView = this.touView;
            String cashServiceFeeDisclaimer = touPaymentViewModel.getCashServiceFeeDisclaimer();
            String cashNonRefundableDisclaimer = touPaymentViewModel.getCashNonRefundableDisclaimer();
            termsOfUseView.setCashDisclaimer(cashServiceFeeDisclaimer + " " + cashNonRefundableDisclaimer);
        }
        this.touView.setTouDebitBankVisible(touPaymentViewModel.getShowSchufaText());
        this.touView.setCardChainingDisclosureVisible(touPaymentViewModel.getShowCardChainingDisclosureText());
    }
}
