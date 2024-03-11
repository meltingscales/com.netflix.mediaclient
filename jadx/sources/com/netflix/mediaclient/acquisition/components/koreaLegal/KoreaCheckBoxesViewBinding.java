package com.netflix.mediaclient.acquisition.components.koreaLegal;

import com.netflix.mediaclient.acquisition.components.form2.BooleanViewModel;
import java.util.ArrayList;
import java.util.List;
import o.C8572dqo;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class KoreaCheckBoxesViewBinding {
    public static final int $stable = 8;
    private final KoreaCheckBoxesView koreaCheckBoxesView;

    public KoreaCheckBoxesViewBinding(KoreaCheckBoxesView koreaCheckBoxesView) {
        C8632dsu.c((Object) koreaCheckBoxesView, "");
        this.koreaCheckBoxesView = koreaCheckBoxesView;
    }

    public final void bind(KoreaCheckBoxesViewModel koreaCheckBoxesViewModel) {
        int d;
        C8632dsu.c((Object) koreaCheckBoxesViewModel, "");
        this.koreaCheckBoxesView.setMainCheckboxViewModel(koreaCheckBoxesViewModel.getMainCheckboxViewModel());
        this.koreaCheckBoxesView.setAllCheckBoxText(koreaCheckBoxesViewModel.getAllBoxesText());
        this.koreaCheckBoxesView.setCheckBoxViewModels(koreaCheckBoxesViewModel.getCheckBoxViewModels());
        KoreaCheckBoxesView koreaCheckBoxesView = this.koreaCheckBoxesView;
        List<BooleanViewModel> checkBoxViewModels = koreaCheckBoxesViewModel.getCheckBoxViewModels();
        d = C8572dqo.d(checkBoxViewModels, 10);
        ArrayList arrayList = new ArrayList(d);
        for (BooleanViewModel booleanViewModel : checkBoxViewModels) {
            arrayList.add(koreaCheckBoxesViewModel.textForViewModel(booleanViewModel));
        }
        koreaCheckBoxesView.setCheckBoxTitleTexts(arrayList);
        if (koreaCheckBoxesViewModel.getBottomTermsVisible()) {
            this.koreaCheckBoxesView.setBottomTermsText(koreaCheckBoxesViewModel.getBottomTermsText());
        }
    }
}
