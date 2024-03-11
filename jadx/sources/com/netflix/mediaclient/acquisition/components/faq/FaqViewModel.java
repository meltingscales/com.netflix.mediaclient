package com.netflix.mediaclient.acquisition.components.faq;

import com.netflix.mediaclient.acquisition.R;
import com.netflix.mediaclient.acquisition.lib.services.StringProvider;
import java.util.List;
import o.C8569dql;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC5417byP;

/* loaded from: classes3.dex */
public final class FaqViewModel {
    public static final String ITEM_ID_CANCEL = "cancel";
    public static final String ITEM_ID_COST = "cost";
    public static final String ITEM_ID_WHATS_DIFFERENT_WITH_ADS = "whats_different_with_ads";
    public static final String ITEM_ID_WHAT_IS_NETFLIX = "what_is_netflix";
    public static final String ITEM_ID_WHAT_TO_WATCH = "what_to_watch";
    public static final String ITEM_ID_WHERE_TO_WATCH = "where_to_watch";
    private final FaqBlockViewModel cancelFaqViewModel;
    private final List<FaqBlockViewModel> faqs;
    private final FaqBlockViewModel netflixCostFaqViewModel;
    private final FaqBlockViewModel whatCanWatchFaqViewModel;
    private final FaqBlockViewModel whatIsNetflixFaqViewModel;
    private final FaqBlockViewModel whatsDifferentWithAdsViewModel;
    private final FaqBlockViewModel whereToWatchFaqViewModel;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public final List<FaqBlockViewModel> getFaqs() {
        return this.faqs;
    }

    public FaqViewModel(StringProvider stringProvider, FaqViewParsedData faqViewParsedData, InterfaceC5417byP interfaceC5417byP) {
        FaqBlockViewModel faqBlockViewModel;
        List<FaqBlockViewModel> i;
        C8632dsu.c((Object) stringProvider, "");
        C8632dsu.c((Object) faqViewParsedData, "");
        C8632dsu.c((Object) interfaceC5417byP, "");
        FaqBlockViewModel faqBlockViewModel2 = new FaqBlockViewModel(stringProvider.getString(R.string.faq_what_is_netflix_header), faqViewParsedData.isCfourAvailable() ? interfaceC5417byP.b() : stringProvider.getString(R.string.faq_what_is_netflix_value), ITEM_ID_WHAT_IS_NETFLIX);
        this.whatIsNetflixFaqViewModel = faqBlockViewModel2;
        String string = stringProvider.getString(R.string.faq_netflix_cost_header);
        String c = stringProvider.getFormatter(R.string.faq_netflix_cost_value).d("lowestPlanPrice", faqViewParsedData.getLowestCostPlanPrice()).d("highestPlanPrice", faqViewParsedData.getHighestCostPlanPrice()).c();
        C8632dsu.a(c, "");
        FaqBlockViewModel faqBlockViewModel3 = new FaqBlockViewModel(string, c, ITEM_ID_COST);
        this.netflixCostFaqViewModel = faqBlockViewModel3;
        if (faqViewParsedData.isCfourAvailable()) {
            faqBlockViewModel = new FaqBlockViewModel(interfaceC5417byP.a(), faqViewParsedData.isDownloadsEnabled() ? interfaceC5417byP.g() : interfaceC5417byP.e(), ITEM_ID_WHATS_DIFFERENT_WITH_ADS);
        } else {
            faqBlockViewModel = null;
        }
        this.whatsDifferentWithAdsViewModel = faqBlockViewModel;
        FaqBlockViewModel faqBlockViewModel4 = new FaqBlockViewModel(stringProvider.getString(R.string.faq_where_watch_header), stringProvider.getString(R.string.faq_where_what_value), ITEM_ID_WHERE_TO_WATCH);
        this.whereToWatchFaqViewModel = faqBlockViewModel4;
        FaqBlockViewModel faqBlockViewModel5 = new FaqBlockViewModel(stringProvider.getString(R.string.faq_cancel_header), stringProvider.getString(R.string.faq_cancel_value), ITEM_ID_CANCEL);
        this.cancelFaqViewModel = faqBlockViewModel5;
        FaqBlockViewModel faqBlockViewModel6 = new FaqBlockViewModel(stringProvider.getString(R.string.faq_what_can_watch_header), stringProvider.getString(R.string.faq_what_can_watch_value), ITEM_ID_WHAT_TO_WATCH);
        this.whatCanWatchFaqViewModel = faqBlockViewModel6;
        i = C8569dql.i(faqBlockViewModel2, faqBlockViewModel3, faqBlockViewModel, faqBlockViewModel4, faqBlockViewModel5, faqBlockViewModel6);
        this.faqs = i;
    }

    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }
    }
}
