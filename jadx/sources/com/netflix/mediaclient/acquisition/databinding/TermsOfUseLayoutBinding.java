package com.netflix.mediaclient.acquisition.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.Barrier;
import androidx.viewbinding.ViewBindings;
import com.netflix.mediaclient.acquisition.R;
import o.C1204Sr;

/* loaded from: classes6.dex */
public final class TermsOfUseLayoutBinding {
    public final Barrier barrier;
    public final C1204Sr cardChainingDisclosure;
    public final C1204Sr cashPaymentDisclaimerText;
    public final C1204Sr internationalPaymentsText;
    public final CheckBox rightOfWithdrawalCheckbox;
    public final C1204Sr rightOfWithdrawalText;
    public final LinearLayout rightOfWithdrawalView;
    private final View rootView;
    public final C1204Sr schufaText;
    public final CheckBox touCheckbox;
    public final C1204Sr touDebitBank;
    public final C1204Sr touErrorMessage;
    public final C1204Sr touMandateModificationTerms;
    public final C1204Sr touText;

    public View getRoot() {
        return this.rootView;
    }

    private TermsOfUseLayoutBinding(View view, Barrier barrier, C1204Sr c1204Sr, C1204Sr c1204Sr2, C1204Sr c1204Sr3, CheckBox checkBox, C1204Sr c1204Sr4, LinearLayout linearLayout, C1204Sr c1204Sr5, CheckBox checkBox2, C1204Sr c1204Sr6, C1204Sr c1204Sr7, C1204Sr c1204Sr8, C1204Sr c1204Sr9) {
        this.rootView = view;
        this.barrier = barrier;
        this.cardChainingDisclosure = c1204Sr;
        this.cashPaymentDisclaimerText = c1204Sr2;
        this.internationalPaymentsText = c1204Sr3;
        this.rightOfWithdrawalCheckbox = checkBox;
        this.rightOfWithdrawalText = c1204Sr4;
        this.rightOfWithdrawalView = linearLayout;
        this.schufaText = c1204Sr5;
        this.touCheckbox = checkBox2;
        this.touDebitBank = c1204Sr6;
        this.touErrorMessage = c1204Sr7;
        this.touMandateModificationTerms = c1204Sr8;
        this.touText = c1204Sr9;
    }

    public static TermsOfUseLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.terms_of_use_layout, viewGroup);
        return bind(viewGroup);
    }

    public static TermsOfUseLayoutBinding bind(View view) {
        int i = R.id.barrier;
        Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i);
        if (barrier != null) {
            i = R.id.cardChainingDisclosure;
            C1204Sr c1204Sr = (C1204Sr) ViewBindings.findChildViewById(view, i);
            if (c1204Sr != null) {
                i = R.id.cashPaymentDisclaimerText;
                C1204Sr c1204Sr2 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                if (c1204Sr2 != null) {
                    i = R.id.internationalPaymentsText;
                    C1204Sr c1204Sr3 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                    if (c1204Sr3 != null) {
                        i = R.id.rightOfWithdrawalCheckbox;
                        CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(view, i);
                        if (checkBox != null) {
                            i = R.id.rightOfWithdrawalText;
                            C1204Sr c1204Sr4 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                            if (c1204Sr4 != null) {
                                i = R.id.rightOfWithdrawalView;
                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                if (linearLayout != null) {
                                    i = R.id.schufaText;
                                    C1204Sr c1204Sr5 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                                    if (c1204Sr5 != null) {
                                        i = R.id.touCheckbox;
                                        CheckBox checkBox2 = (CheckBox) ViewBindings.findChildViewById(view, i);
                                        if (checkBox2 != null) {
                                            i = R.id.touDebitBank;
                                            C1204Sr c1204Sr6 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                                            if (c1204Sr6 != null) {
                                                i = R.id.touErrorMessage;
                                                C1204Sr c1204Sr7 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                                                if (c1204Sr7 != null) {
                                                    i = R.id.touMandateModificationTerms;
                                                    C1204Sr c1204Sr8 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                                                    if (c1204Sr8 != null) {
                                                        i = R.id.touText;
                                                        C1204Sr c1204Sr9 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                                                        if (c1204Sr9 != null) {
                                                            return new TermsOfUseLayoutBinding(view, barrier, c1204Sr, c1204Sr2, c1204Sr3, checkBox, c1204Sr4, linearLayout, c1204Sr5, checkBox2, c1204Sr6, c1204Sr7, c1204Sr8, c1204Sr9);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
