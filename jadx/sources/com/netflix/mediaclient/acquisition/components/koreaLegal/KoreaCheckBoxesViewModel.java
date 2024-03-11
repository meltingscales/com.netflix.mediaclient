package com.netflix.mediaclient.acquisition.components.koreaLegal;

import com.netflix.mediaclient.acquisition.R;
import com.netflix.mediaclient.acquisition.components.form2.BooleanViewModel;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.acquisition.lib.services.StringProvider;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import o.C1333Xq;
import o.C8569dql;
import o.C8576dqs;
import o.C8632dsu;
import o.InterfaceC8554dpx;
import o.dpB;
import o.drO;

/* loaded from: classes3.dex */
public final class KoreaCheckBoxesViewModel {
    public static final int $stable = 8;
    private final BooleanViewModel abroadCheckBoxViewModel;
    private final String allBoxesText;
    private final boolean bottomTermsVisible;
    private final BooleanViewModel cancelAnytimeCheckBoxViewModel;
    private final List<BooleanViewModel> checkBoxViewModels;
    private final BooleanViewModel gatewayCheckBoxViewModel;
    private MainCheckboxViewModel mainCheckboxViewModel;
    private final KoreaCheckBoxesParsedData parsedData;
    private final InterfaceC8554dpx showKoreaCheckBoxes$delegate;
    private final StringProvider stringProvider;
    private final BooleanViewModel termsCheckBoxViewModel;
    private final BooleanViewModel thirdPartyCheckBoxViewModel;

    public final String getAllBoxesText() {
        return this.allBoxesText;
    }

    public final boolean getBottomTermsVisible() {
        return this.bottomTermsVisible;
    }

    public final List<BooleanViewModel> getCheckBoxViewModels() {
        return this.checkBoxViewModels;
    }

    public final MainCheckboxViewModel getMainCheckboxViewModel() {
        return this.mainCheckboxViewModel;
    }

    public final void setMainCheckboxViewModel(MainCheckboxViewModel mainCheckboxViewModel) {
        C8632dsu.c((Object) mainCheckboxViewModel, "");
        this.mainCheckboxViewModel = mainCheckboxViewModel;
    }

    public KoreaCheckBoxesViewModel(StringProvider stringProvider, KoreaCheckBoxesParsedData koreaCheckBoxesParsedData, BooleanViewModel booleanViewModel, BooleanViewModel booleanViewModel2, BooleanViewModel booleanViewModel3, BooleanViewModel booleanViewModel4, BooleanViewModel booleanViewModel5) {
        InterfaceC8554dpx b;
        List i;
        List<BooleanViewModel> c;
        C8632dsu.c((Object) stringProvider, "");
        C8632dsu.c((Object) koreaCheckBoxesParsedData, "");
        this.stringProvider = stringProvider;
        this.parsedData = koreaCheckBoxesParsedData;
        this.termsCheckBoxViewModel = booleanViewModel;
        this.abroadCheckBoxViewModel = booleanViewModel2;
        this.gatewayCheckBoxViewModel = booleanViewModel3;
        this.thirdPartyCheckBoxViewModel = booleanViewModel4;
        this.cancelAnytimeCheckBoxViewModel = booleanViewModel5;
        String c2 = stringProvider.getFormatter(R.string.label_check_all).d("MIN_AGE", koreaCheckBoxesParsedData.getTermsOfUseMinimumVerificationAge()).c();
        C8632dsu.a(c2, "");
        this.allBoxesText = c2;
        this.bottomTermsVisible = !(koreaCheckBoxesParsedData.getHasAcceptedTermsOfUse() == null && koreaCheckBoxesParsedData.getTermsOfUse() == null) && booleanViewModel5 == null;
        b = dpB.b(new drO<Boolean>() { // from class: com.netflix.mediaclient.acquisition.components.koreaLegal.KoreaCheckBoxesViewModel$showKoreaCheckBoxes$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // o.drO
            public final Boolean invoke() {
                List G;
                G = C8576dqs.G(KoreaCheckBoxesViewModel.this.getCheckBoxViewModels());
                return Boolean.valueOf(!G.isEmpty());
            }
        });
        this.showKoreaCheckBoxes$delegate = b;
        this.mainCheckboxViewModel = new MainCheckboxViewModel(false);
        i = C8569dql.i(booleanViewModel, booleanViewModel2, booleanViewModel3, booleanViewModel4, booleanViewModel5);
        c = C8576dqs.c((Iterable) i, new Comparator() { // from class: com.netflix.mediaclient.acquisition.components.koreaLegal.KoreaCheckBoxesViewModel$special$$inlined$sortedBy$1
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                BooleanViewModel booleanViewModel6;
                BooleanViewModel booleanViewModel7;
                BooleanViewModel booleanViewModel8;
                BooleanViewModel booleanViewModel9;
                BooleanViewModel booleanViewModel10;
                Integer num;
                KoreaCheckBoxesParsedData koreaCheckBoxesParsedData2;
                KoreaCheckBoxesParsedData koreaCheckBoxesParsedData3;
                KoreaCheckBoxesParsedData koreaCheckBoxesParsedData4;
                KoreaCheckBoxesParsedData koreaCheckBoxesParsedData5;
                BooleanViewModel booleanViewModel11;
                BooleanViewModel booleanViewModel12;
                BooleanViewModel booleanViewModel13;
                BooleanViewModel booleanViewModel14;
                BooleanViewModel booleanViewModel15;
                KoreaCheckBoxesParsedData koreaCheckBoxesParsedData6;
                KoreaCheckBoxesParsedData koreaCheckBoxesParsedData7;
                KoreaCheckBoxesParsedData koreaCheckBoxesParsedData8;
                KoreaCheckBoxesParsedData koreaCheckBoxesParsedData9;
                int compareValues;
                KoreaCheckBoxesParsedData koreaCheckBoxesParsedData10;
                KoreaCheckBoxesParsedData koreaCheckBoxesParsedData11;
                BooleanViewModel booleanViewModel16 = (BooleanViewModel) t;
                booleanViewModel6 = KoreaCheckBoxesViewModel.this.termsCheckBoxViewModel;
                Integer num2 = null;
                if (C8632dsu.c(booleanViewModel16, booleanViewModel6)) {
                    koreaCheckBoxesParsedData11 = KoreaCheckBoxesViewModel.this.parsedData;
                    num = koreaCheckBoxesParsedData11.getTermsCheckedOrder();
                } else {
                    booleanViewModel7 = KoreaCheckBoxesViewModel.this.abroadCheckBoxViewModel;
                    if (C8632dsu.c(booleanViewModel16, booleanViewModel7)) {
                        koreaCheckBoxesParsedData5 = KoreaCheckBoxesViewModel.this.parsedData;
                        num = koreaCheckBoxesParsedData5.getAbroadCheckedOrder();
                    } else {
                        booleanViewModel8 = KoreaCheckBoxesViewModel.this.gatewayCheckBoxViewModel;
                        if (C8632dsu.c(booleanViewModel16, booleanViewModel8)) {
                            koreaCheckBoxesParsedData4 = KoreaCheckBoxesViewModel.this.parsedData;
                            num = koreaCheckBoxesParsedData4.getGatewayCheckedOrder();
                        } else {
                            booleanViewModel9 = KoreaCheckBoxesViewModel.this.thirdPartyCheckBoxViewModel;
                            if (C8632dsu.c(booleanViewModel16, booleanViewModel9)) {
                                koreaCheckBoxesParsedData3 = KoreaCheckBoxesViewModel.this.parsedData;
                                num = koreaCheckBoxesParsedData3.getThirdPartyCheckedOrder();
                            } else {
                                booleanViewModel10 = KoreaCheckBoxesViewModel.this.cancelAnytimeCheckBoxViewModel;
                                if (C8632dsu.c(booleanViewModel16, booleanViewModel10)) {
                                    koreaCheckBoxesParsedData2 = KoreaCheckBoxesViewModel.this.parsedData;
                                    num = koreaCheckBoxesParsedData2.getCancelAnytimeCheckedOrder();
                                } else {
                                    num = null;
                                }
                            }
                        }
                    }
                }
                int intValue = num != null ? num.intValue() : Integer.MAX_VALUE;
                BooleanViewModel booleanViewModel17 = (BooleanViewModel) t2;
                booleanViewModel11 = KoreaCheckBoxesViewModel.this.termsCheckBoxViewModel;
                if (C8632dsu.c(booleanViewModel17, booleanViewModel11)) {
                    koreaCheckBoxesParsedData10 = KoreaCheckBoxesViewModel.this.parsedData;
                    num2 = koreaCheckBoxesParsedData10.getTermsCheckedOrder();
                } else {
                    booleanViewModel12 = KoreaCheckBoxesViewModel.this.abroadCheckBoxViewModel;
                    if (C8632dsu.c(booleanViewModel17, booleanViewModel12)) {
                        koreaCheckBoxesParsedData9 = KoreaCheckBoxesViewModel.this.parsedData;
                        num2 = koreaCheckBoxesParsedData9.getAbroadCheckedOrder();
                    } else {
                        booleanViewModel13 = KoreaCheckBoxesViewModel.this.gatewayCheckBoxViewModel;
                        if (C8632dsu.c(booleanViewModel17, booleanViewModel13)) {
                            koreaCheckBoxesParsedData8 = KoreaCheckBoxesViewModel.this.parsedData;
                            num2 = koreaCheckBoxesParsedData8.getGatewayCheckedOrder();
                        } else {
                            booleanViewModel14 = KoreaCheckBoxesViewModel.this.thirdPartyCheckBoxViewModel;
                            if (C8632dsu.c(booleanViewModel17, booleanViewModel14)) {
                                koreaCheckBoxesParsedData7 = KoreaCheckBoxesViewModel.this.parsedData;
                                num2 = koreaCheckBoxesParsedData7.getThirdPartyCheckedOrder();
                            } else {
                                booleanViewModel15 = KoreaCheckBoxesViewModel.this.cancelAnytimeCheckBoxViewModel;
                                if (C8632dsu.c(booleanViewModel17, booleanViewModel15)) {
                                    koreaCheckBoxesParsedData6 = KoreaCheckBoxesViewModel.this.parsedData;
                                    num2 = koreaCheckBoxesParsedData6.getCancelAnytimeCheckedOrder();
                                }
                            }
                        }
                    }
                }
                compareValues = ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(intValue), Integer.valueOf(num2 != null ? num2.intValue() : Integer.MAX_VALUE));
                return compareValues;
            }
        });
        this.checkBoxViewModels = c;
    }

    public final boolean getShowKoreaCheckBoxes() {
        return ((Boolean) this.showKoreaCheckBoxes$delegate.getValue()).booleanValue();
    }

    public final String textForViewModel(BooleanViewModel booleanViewModel) {
        String c;
        C8632dsu.c((Object) booleanViewModel, "");
        if (C8632dsu.c(booleanViewModel, this.termsCheckBoxViewModel)) {
            return this.stringProvider.getString(R.string.label_check_termsOfUse);
        }
        if (C8632dsu.c(booleanViewModel, this.abroadCheckBoxViewModel)) {
            return this.stringProvider.getString(R.string.label_check_informationAbroadConsent);
        }
        if (C8632dsu.c(booleanViewModel, this.gatewayCheckBoxViewModel)) {
            c = this.stringProvider.getFormatter(R.string.label_check_personalInfoGateway).d("PAYMENT_GATEWAY_URL", "https://netflix.com/krpaymentconsent?netflixsource=android").c();
            C8632dsu.a(c, "");
        } else if (C8632dsu.c(booleanViewModel, this.thirdPartyCheckBoxViewModel)) {
            return this.stringProvider.getString(R.string.label_check_thirdPartyConsent);
        } else {
            if (!C8632dsu.c(booleanViewModel, this.cancelAnytimeCheckBoxViewModel)) {
                return "";
            }
            C1333Xq formatter = this.stringProvider.getFormatter(R.string.label_check_cancelMembershipAnytime);
            String planPrice = this.parsedData.getPlanPrice();
            if (planPrice == null) {
                planPrice = "";
            }
            c = formatter.d(SignupConstants.Field.PLAN_PRICE, planPrice).c();
            C8632dsu.a(c, "");
        }
        return c;
    }

    public final boolean hasAcceptedRequiredCheckboxes() {
        boolean z;
        if (getShowKoreaCheckBoxes()) {
            boolean isChecked = this.mainCheckboxViewModel.isChecked();
            List<BooleanViewModel> list = this.checkBoxViewModels;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (BooleanViewModel booleanViewModel : list) {
                    if (!booleanViewModel.getValue()) {
                        z = false;
                        break;
                    }
                }
            }
            z = true;
            boolean z2 = this.checkBoxViewModels.size() < 2;
            if (z && isChecked) {
                return true;
            }
            return z2 && z;
        }
        return true;
    }

    public final String getBottomTermsText() {
        String str;
        C1333Xq d = this.stringProvider.getFormatter(R.string.tou_kr_no_trial).d("price", this.parsedData.getPlanPrice());
        String planBillingFrequency = this.parsedData.getPlanBillingFrequency();
        if (planBillingFrequency != null) {
            str = planBillingFrequency.toLowerCase();
            C8632dsu.a(str, "");
        } else {
            str = null;
        }
        String c = d.d("planBillingFrequency", str).c();
        C8632dsu.a(c, "");
        return c;
    }
}
