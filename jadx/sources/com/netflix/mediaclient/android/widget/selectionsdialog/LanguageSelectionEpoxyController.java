package com.netflix.mediaclient.android.widget.selectionsdialog;

import android.view.View;
import com.airbnb.epoxy.TypedEpoxyController;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.event.session.Focus;
import com.netflix.cl.model.event.session.command.ChangeValueCommand;
import com.netflix.cl.model.event.session.command.Command;
import com.netflix.mediaclient.android.widget.selectionsdialog.LanguageSelectionEpoxyController;
import com.netflix.mediaclient.clutils.CLv2Utils;
import o.AbstractC1228Tp;
import o.C1235Tw;
import o.C8632dsu;
import o.dpR;
import o.drO;

/* loaded from: classes3.dex */
public final class LanguageSelectionEpoxyController extends TypedEpoxyController<AbstractC1228Tp<? extends Object>> {
    public static final int $stable = 0;
    private final drO<dpR> onItemClick;

    public LanguageSelectionEpoxyController(drO<dpR> dro) {
        C8632dsu.c((Object) dro, "");
        this.onItemClick = dro;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.airbnb.epoxy.TypedEpoxyController
    public void buildModels(final AbstractC1228Tp<? extends Object> abstractC1228Tp) {
        C8632dsu.c((Object) abstractC1228Tp, "");
        int a = abstractC1228Tp.a();
        final int i = 0;
        while (i < a) {
            C1235Tw c1235Tw = new C1235Tw();
            c1235Tw.c((CharSequence) ("language-selection-" + i));
            c1235Tw.b((CharSequence) abstractC1228Tp.a(i));
            c1235Tw.a(i == abstractC1228Tp.j());
            c1235Tw.c(abstractC1228Tp.f(i));
            c1235Tw.d(new View.OnClickListener() { // from class: o.Ts
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LanguageSelectionEpoxyController.buildModels$lambda$1$lambda$0(AbstractC1228Tp.this, i, this, view);
                }
            });
            add(c1235Tw);
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$1$lambda$0(AbstractC1228Tp abstractC1228Tp, int i, LanguageSelectionEpoxyController languageSelectionEpoxyController, View view) {
        C8632dsu.c((Object) abstractC1228Tp, "");
        C8632dsu.c((Object) languageSelectionEpoxyController, "");
        abstractC1228Tp.d(i);
        languageSelectionEpoxyController.onItemClick.invoke();
        languageSelectionEpoxyController.setData(abstractC1228Tp);
        CLv2Utils.INSTANCE.b(new Focus(AppView.audioSubtitlesSelector, null), (Command) new ChangeValueCommand(abstractC1228Tp.g()), false);
    }
}
