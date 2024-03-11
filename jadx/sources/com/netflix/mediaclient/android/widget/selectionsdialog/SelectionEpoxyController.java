package com.netflix.mediaclient.android.widget.selectionsdialog;

import android.view.View;
import com.airbnb.epoxy.TypedEpoxyController;
import com.netflix.mediaclient.android.widget.selectionsdialog.SelectionEpoxyController;
import o.AbstractC1224Tl;
import o.C1238Tz;
import o.C6452cda;
import o.C6460cdi;
import o.C8632dsu;
import o.TE;
import o.dpR;
import o.drO;

/* loaded from: classes3.dex */
public final class SelectionEpoxyController extends TypedEpoxyController<AbstractC1224Tl<? extends Object>> {
    public static final int $stable = 8;
    private final TE loggingHelper;
    private final drO<dpR> onItemClick;

    public SelectionEpoxyController(TE te, drO<dpR> dro) {
        C8632dsu.c((Object) dro, "");
        this.loggingHelper = te;
        this.onItemClick = dro;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.airbnb.epoxy.TypedEpoxyController
    public void buildModels(final AbstractC1224Tl<? extends Object> abstractC1224Tl) {
        C8632dsu.c((Object) abstractC1224Tl, "");
        int a = abstractC1224Tl.a();
        final int i = 0;
        while (i < a) {
            C1238Tz c1238Tz = new C1238Tz();
            c1238Tz.e((CharSequence) ("selection-" + i));
            c1238Tz.d((CharSequence) abstractC1224Tl.a(i));
            boolean z = true;
            c1238Tz.b(i == abstractC1224Tl.j());
            if (!C6452cda.b(abstractC1224Tl.e(i)) || !(abstractC1224Tl instanceof C6460cdi)) {
                z = false;
            }
            c1238Tz.c(z);
            c1238Tz.a(new View.OnClickListener() { // from class: o.TA
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SelectionEpoxyController.buildModels$lambda$1$lambda$0(i, abstractC1224Tl, this, view);
                }
            });
            add(c1238Tz);
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$1$lambda$0(int i, AbstractC1224Tl abstractC1224Tl, SelectionEpoxyController selectionEpoxyController, View view) {
        C8632dsu.c((Object) abstractC1224Tl, "");
        C8632dsu.c((Object) selectionEpoxyController, "");
        boolean z = i != abstractC1224Tl.j();
        TE te = selectionEpoxyController.loggingHelper;
        if (te != null) {
            te.b(abstractC1224Tl.e(i), z);
        }
        selectionEpoxyController.onItemClick.invoke();
        abstractC1224Tl.d(i);
        selectionEpoxyController.setData(abstractC1224Tl);
    }
}
