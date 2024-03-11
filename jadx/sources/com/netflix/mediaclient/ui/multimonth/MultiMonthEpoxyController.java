package com.netflix.mediaclient.ui.multimonth;

import android.net.Uri;
import android.view.View;
import com.netflix.mediaclient.ui.R;
import com.netflix.mediaclient.ui.multimonth.MultiMonthEpoxyController;
import java.util.List;
import java.util.Map;
import o.AbstractC2914ap;
import o.C1045Mp;
import o.C6861clL;
import o.C6870clU;
import o.C6874clY;
import o.C6899clx;
import o.C6929cma;
import o.C6931cmc;
import o.C6933cme;
import o.C6935cmg;
import o.C6936cmh;
import o.C6938cmj;
import o.C6940cml;
import o.C6942cmn;
import o.C6943cmo;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC4308bc;
import o.dpD;
import o.dpR;
import o.dqE;
import o.drM;
import o.drO;

/* loaded from: classes4.dex */
public class MultiMonthEpoxyController extends AbstractC2914ap {
    private static final String ASK_ME_LATER_STRING_KEY = "ASK_ME_LATER";
    private static final String BUY_NOW_AND_SAVE_STRING_KEY = "BUY_NOW_AND_SAVE";
    public static final d Companion = new d(null);
    private static final String EXPIRING_SOON_STRING_KEY = "EXPIRING_SOON";
    private static final String FINAL_OFFER_STRING_KEY = "FINAL_OFFER";
    private static final String LIMITED_TIME_OFFER_STRING_KEY = "LIMITED_TIME_OFFER";
    private static final String NO_THANKS_STRING_KEY = "NO_THANKS";
    private static final Map<String, Integer> stringResourceKeyMap;
    private final drO<dpR> onDismissClicked;
    private final drM<C6861clL, dpR> onOfferSelected;
    private final drM<String, dpR> onSubmitClicked;
    private CharSequence selectedOfferId;
    private C6899clx viewModel;

    public final CharSequence getSelectedOfferId() {
        return this.selectedOfferId;
    }

    public final void setSelectedOfferId(CharSequence charSequence) {
        this.selectedOfferId = charSequence;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MultiMonthEpoxyController(drM<? super C6861clL, dpR> drm, drM<? super String, dpR> drm2, drO<dpR> dro) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c((Object) drm2, "");
        C8632dsu.c((Object) dro, "");
        this.onOfferSelected = drm;
        this.onSubmitClicked = drm2;
        this.onDismissClicked = dro;
    }

    /* loaded from: classes4.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("MultiMonthEpoxyController");
        }
    }

    static {
        Map<String, Integer> c;
        c = dqE.c(dpD.a(LIMITED_TIME_OFFER_STRING_KEY, Integer.valueOf(R.o.gV)), dpD.a(BUY_NOW_AND_SAVE_STRING_KEY, Integer.valueOf(R.o.ao)), dpD.a(ASK_ME_LATER_STRING_KEY, Integer.valueOf(R.o.Y)), dpD.a(EXPIRING_SOON_STRING_KEY, Integer.valueOf(R.o.bT)), dpD.a(FINAL_OFFER_STRING_KEY, Integer.valueOf(R.o.bR)), dpD.a(NO_THANKS_STRING_KEY, Integer.valueOf(R.o.hD)));
        stringResourceKeyMap = c;
    }

    public final void setData(C6899clx c6899clx) {
        C8632dsu.c((Object) c6899clx, "");
        this.viewModel = c6899clx;
        requestModelBuild();
    }

    @Override // o.AbstractC2914ap
    public void buildModels() {
        dpR dpr;
        C6899clx c6899clx = this.viewModel;
        if (c6899clx != null) {
            List<C6861clL> a = c6899clx.a();
            boolean f = c6899clx.f();
            C6943cmo c6943cmo = new C6943cmo();
            c6943cmo.c((CharSequence) "header");
            String h = c6899clx.h();
            if (h != null) {
                c6943cmo.d(h);
            }
            c6943cmo.a(f);
            C6899clx c6899clx2 = this.viewModel;
            Integer num = stringResourceKeyMap.get(c6899clx2 != null ? c6899clx2.d() : null);
            c6943cmo.c(num != null ? num.intValue() : R.o.gV);
            add(c6943cmo);
            if (f && a.size() >= 1) {
                C6861clL c6861clL = a.get(0);
                C6931cmc c6931cmc = new C6931cmc();
                c6931cmc.e((CharSequence) "offer-choice-save-discount");
                c6931cmc.c(c6861clL.b());
                add(c6931cmc);
                C6870clU c6870clU = new C6870clU();
                c6870clU.d((CharSequence) "offer-choice-save-discount-month");
                c6870clU.d(c6861clL.c());
                add(c6870clU);
                C6874clY c6874clY = new C6874clY();
                c6874clY.d((CharSequence) "offer-choice-full-price");
                c6874clY.e(c6861clL.a());
                add(c6874clY);
                C6929cma c6929cma = new C6929cma();
                c6929cma.b((CharSequence) "offer-choice-discounted-price");
                c6929cma.a(c6861clL.e());
                c6929cma.c(c6861clL.c());
                add(c6929cma);
                this.selectedOfferId = c6861clL.d();
                this.onOfferSelected.invoke(c6861clL);
            } else {
                for (final C6861clL c6861clL2 : a) {
                    C6935cmg c6935cmg = new C6935cmg();
                    c6935cmg.c((CharSequence) ("offer-choice-" + c6861clL2.d()));
                    c6935cmg.c(c6861clL2.c());
                    c6935cmg.a(c6861clL2.b());
                    c6935cmg.d((CharSequence) c6861clL2.e());
                    c6935cmg.e((CharSequence) c6861clL2.a());
                    c6935cmg.c(c6861clL2.g());
                    CharSequence charSequence = this.selectedOfferId;
                    if (charSequence != null) {
                        c6935cmg.b(C8632dsu.c((Object) charSequence, (Object) c6861clL2.d()));
                        if (C8632dsu.c((Object) charSequence, (Object) c6861clL2.d())) {
                            this.onOfferSelected.invoke(c6861clL2);
                        }
                        dpr = dpR.c;
                    } else {
                        dpr = null;
                    }
                    if (dpr == null) {
                        c6935cmg.b(c6861clL2.f());
                        if (c6861clL2.f()) {
                            this.selectedOfferId = c6861clL2.d();
                            this.onOfferSelected.invoke(c6861clL2);
                        }
                    }
                    c6935cmg.c(new InterfaceC4308bc() { // from class: o.clA
                        @Override // o.InterfaceC4308bc
                        public final void c(AbstractC3073as abstractC3073as, Object obj, View view, int i) {
                            MultiMonthEpoxyController.buildModels$lambda$16$lambda$11$lambda$10$lambda$9(MultiMonthEpoxyController.this, c6861clL2, (C6935cmg) abstractC3073as, (C6933cme) obj, view, i);
                        }
                    });
                    add(c6935cmg);
                }
            }
            C6942cmn c6942cmn = new C6942cmn();
            c6942cmn.e((CharSequence) "submit-button");
            String c = c6899clx.c();
            final String b = c6899clx.b();
            Map<String, Integer> map = stringResourceKeyMap;
            Integer num2 = map.get(c);
            c6942cmn.d(num2 != null ? num2.intValue() : R.o.ao);
            c6942cmn.b(new InterfaceC4308bc() { // from class: o.clF
                @Override // o.InterfaceC4308bc
                public final void c(AbstractC3073as abstractC3073as, Object obj, View view, int i) {
                    MultiMonthEpoxyController.buildModels$lambda$16$lambda$13$lambda$12(b, this, (C6942cmn) abstractC3073as, (C6940cml) obj, view, i);
                }
            });
            add(c6942cmn);
            C6936cmh c6936cmh = new C6936cmh();
            c6936cmh.d((CharSequence) "dismiss-button");
            Integer num3 = map.get(c6899clx.e());
            c6936cmh.e(num3 != null ? num3.intValue() : R.o.Y);
            c6936cmh.b(new InterfaceC4308bc() { // from class: o.clG
                @Override // o.InterfaceC4308bc
                public final void c(AbstractC3073as abstractC3073as, Object obj, View view, int i) {
                    MultiMonthEpoxyController.buildModels$lambda$16$lambda$15$lambda$14(MultiMonthEpoxyController.this, (C6936cmh) abstractC3073as, (C6938cmj) obj, view, i);
                }
            });
            add(c6936cmh);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$16$lambda$11$lambda$10$lambda$9(MultiMonthEpoxyController multiMonthEpoxyController, C6861clL c6861clL, C6935cmg c6935cmg, C6933cme c6933cme, View view, int i) {
        C8632dsu.c((Object) multiMonthEpoxyController, "");
        C8632dsu.c((Object) c6861clL, "");
        multiMonthEpoxyController.selectedOfferId = c6861clL.d();
        multiMonthEpoxyController.requestModelBuild();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$16$lambda$13$lambda$12(String str, MultiMonthEpoxyController multiMonthEpoxyController, C6942cmn c6942cmn, C6940cml c6940cml, View view, int i) {
        C8632dsu.c((Object) multiMonthEpoxyController, "");
        Uri build = Uri.parse(str).buildUpon().appendQueryParameter("prepaidOfferId", String.valueOf(multiMonthEpoxyController.selectedOfferId)).build();
        drM<String, dpR> drm = multiMonthEpoxyController.onSubmitClicked;
        String uri = build.toString();
        C8632dsu.a(uri, "");
        drm.invoke(uri);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$16$lambda$15$lambda$14(MultiMonthEpoxyController multiMonthEpoxyController, C6936cmh c6936cmh, C6938cmj c6938cmj, View view, int i) {
        C8632dsu.c((Object) multiMonthEpoxyController, "");
        multiMonthEpoxyController.onDismissClicked.invoke();
    }
}
