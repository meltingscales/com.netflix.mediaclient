package com.netflix.mediaclient.ui.mdx;

import android.content.res.Resources;
import android.view.View;
import com.airbnb.epoxy.TypedEpoxyController;
import com.netflix.mediaclient.ui.R;
import com.netflix.mediaclient.ui.mdx.CastSheetEpoxyController;
import kotlin.NoWhenBranchMatchedException;
import o.AbstractC6563cff;
import o.AbstractC6571cfn;
import o.C1781aO;
import o.C6495ceQ;
import o.C6496ceR;
import o.C6504ceZ;
import o.C6562cfe;
import o.C6568cfk;
import o.C6573cfp;
import o.C8632dsu;
import o.C9935zP;

/* loaded from: classes4.dex */
public final class CastSheetEpoxyController extends TypedEpoxyController<AbstractC6571cfn> {
    public static final int $stable = 8;
    private final C9935zP eventBusFactory;
    private final Resources resources;

    public CastSheetEpoxyController(C9935zP c9935zP, Resources resources) {
        C8632dsu.c((Object) c9935zP, "");
        C8632dsu.c((Object) resources, "");
        this.eventBusFactory = c9935zP;
        this.resources = resources;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.airbnb.epoxy.TypedEpoxyController
    public void buildModels(AbstractC6571cfn abstractC6571cfn) {
        C8632dsu.c((Object) abstractC6571cfn, "");
        addSheetHeader(this, getCastState(abstractC6571cfn));
        if (abstractC6571cfn instanceof AbstractC6571cfn.d) {
            AbstractC6571cfn.d dVar = (AbstractC6571cfn.d) abstractC6571cfn;
            int size = dVar.d().size();
            for (final int i = 0; i < size; i++) {
                String str = dVar.d().get(i);
                C6562cfe c6562cfe = new C6562cfe();
                c6562cfe.c((CharSequence) str);
                c6562cfe.e((CharSequence) str);
                c6562cfe.e(new View.OnClickListener() { // from class: o.cfj
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        CastSheetEpoxyController.buildModels$lambda$1$lambda$0(CastSheetEpoxyController.this, i, view);
                    }
                });
                add(c6562cfe);
            }
        } else if (!(abstractC6571cfn instanceof AbstractC6571cfn.c)) {
            if (C8632dsu.c(abstractC6571cfn, AbstractC6571cfn.b.d)) {
                addNoDevicesBody(this);
            }
        } else {
            C6504ceZ c6504ceZ = new C6504ceZ();
            AbstractC6571cfn.c cVar = (AbstractC6571cfn.c) abstractC6571cfn;
            String e = cVar.e();
            c6504ceZ.e((CharSequence) e);
            c6504ceZ.c((CharSequence) e);
            c6504ceZ.b((CharSequence) cVar.a());
            c6504ceZ.d((CharSequence) cVar.d());
            c6504ceZ.d(new View.OnClickListener() { // from class: o.cfg
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CastSheetEpoxyController.buildModels$lambda$3$lambda$2(CastSheetEpoxyController.this, view);
                }
            });
            add(c6504ceZ);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$1$lambda$0(CastSheetEpoxyController castSheetEpoxyController, int i, View view) {
        C8632dsu.c((Object) castSheetEpoxyController, "");
        castSheetEpoxyController.eventBusFactory.b(AbstractC6563cff.class, new AbstractC6563cff.b(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$3$lambda$2(CastSheetEpoxyController castSheetEpoxyController, View view) {
        C8632dsu.c((Object) castSheetEpoxyController, "");
        castSheetEpoxyController.eventBusFactory.b(AbstractC6563cff.class, AbstractC6563cff.d.d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addSheetHeader$lambda$7$lambda$6$lambda$5(CastSheetEpoxyController castSheetEpoxyController, View view) {
        C8632dsu.c((Object) castSheetEpoxyController, "");
        castSheetEpoxyController.eventBusFactory.b(AbstractC6563cff.class, AbstractC6563cff.e.e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addNoDevicesBody$lambda$11$lambda$10$lambda$9(CastSheetEpoxyController castSheetEpoxyController, View view) {
        C8632dsu.c((Object) castSheetEpoxyController, "");
        castSheetEpoxyController.eventBusFactory.b(AbstractC6563cff.class, AbstractC6563cff.a.e);
    }

    private final CastState getCastState(AbstractC6571cfn abstractC6571cfn) {
        if (abstractC6571cfn instanceof AbstractC6571cfn.d) {
            return CastState.c;
        }
        if (abstractC6571cfn instanceof AbstractC6571cfn.c) {
            return CastState.b;
        }
        if (C8632dsu.c(abstractC6571cfn, AbstractC6571cfn.b.d)) {
            return CastState.d;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final void addSheetHeader(final CastSheetEpoxyController castSheetEpoxyController, CastState castState) {
        C1781aO c1781aO = new C1781aO();
        c1781aO.b((CharSequence) "cast-sheet-header-group");
        c1781aO.e(R.i.x);
        C6573cfp c6573cfp = new C6573cfp();
        c6573cfp.d((CharSequence) "cast-sheet-header-group-title");
        c6573cfp.e(castState);
        c1781aO.add(c6573cfp);
        C6496ceR c6496ceR = new C6496ceR();
        c6496ceR.e((CharSequence) "cast-sheet-header-group-close-button");
        c6496ceR.d((CharSequence) castSheetEpoxyController.resources.getString(R.o.j));
        c6496ceR.b(new View.OnClickListener() { // from class: o.cfh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CastSheetEpoxyController.addSheetHeader$lambda$7$lambda$6$lambda$5(CastSheetEpoxyController.this, view);
            }
        });
        c1781aO.add(c6496ceR);
        add(c1781aO);
    }

    private final void addNoDevicesBody(final CastSheetEpoxyController castSheetEpoxyController) {
        C1781aO c1781aO = new C1781aO();
        c1781aO.b((CharSequence) "cast-sheet-no-devices-group");
        c1781aO.e(R.i.w);
        C6495ceQ c6495ceQ = new C6495ceQ();
        c6495ceQ.d((CharSequence) "cast-sheet-no-devices-body");
        c1781aO.add(c6495ceQ);
        C6568cfk c6568cfk = new C6568cfk();
        c6568cfk.c((CharSequence) "cast-sheet-no-devices-help-button");
        c6568cfk.e(new View.OnClickListener() { // from class: o.cfb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CastSheetEpoxyController.addNoDevicesBody$lambda$11$lambda$10$lambda$9(CastSheetEpoxyController.this, view);
            }
        });
        c1781aO.add(c6568cfk);
        add(c1781aO);
    }
}
