package com.netflix.mediaclient.ui.home.impl.games;

import android.content.Context;
import android.view.View;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.interface_.LoMo;
import com.netflix.mediaclient.servicemgr.interface_.LoMoType;
import com.netflix.mediaclient.ui.home.impl.games.GamesLolomoEpoxyController;
import com.netflix.mediaclient.ui.home.impl.lolomo.LolomoEpoxyController;
import com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment;
import com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerVideoGroupViewModel;
import o.AbstractC3073as;
import o.AbstractC4034bTu;
import o.AbstractC5100bsQ;
import o.C1729aMb;
import o.C3814bLq;
import o.C4022bTi;
import o.C4037bTx;
import o.C4049bUi;
import o.C4076bVi;
import o.C8632dsu;
import o.C8691duz;
import o.C8980gu;
import o.C9935zP;
import o.InterfaceC2023aX;
import o.InterfaceC5155btS;
import o.InterfaceC5223buh;
import o.bLW;
import o.bSY;
import o.bTX;
import o.dpR;
import o.drM;
import o.drO;
import o.drX;

/* loaded from: classes4.dex */
public final class GamesLolomoEpoxyController extends LolomoEpoxyController {
    private final C4037bTx gameHandleViewModel;

    /* loaded from: classes4.dex */
    public final /* synthetic */ class e {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[LoMoType.values().length];
            try {
                iArr[LoMoType.GAME_IDENTITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int addTitle$lambda$1$lambda$0(int i, int i2, int i3) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int buildGameIdentityRow$lambda$4$lambda$2(int i, int i2, int i3) {
        return i;
    }

    public final C4037bTx getGameHandleViewModel() {
        return this.gameHandleViewModel;
    }

    @Override // com.netflix.mediaclient.ui.home.impl.HomeEpoxyController
    public boolean isFlatGallery(InterfaceC5155btS interfaceC5155btS) {
        C8632dsu.c((Object) interfaceC5155btS, "");
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GamesLolomoEpoxyController(LolomoMvRxFragment.d dVar, Context context, C9935zP c9935zP, bSY bsy, bLW blw, bTX btx, drX<? super LoMo, ? super Integer, dpR> drx, drM<? super LoMo, dpR> drm, drO<MiniPlayerVideoGroupViewModel> dro, AbstractC5100bsQ abstractC5100bsQ, C4037bTx c4037bTx) {
        super(dVar, context, c9935zP, bsy, blw, btx, drx, drm, dro, abstractC5100bsQ);
        C8632dsu.c((Object) dVar, "");
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) c9935zP, "");
        C8632dsu.c((Object) bsy, "");
        C8632dsu.c((Object) btx, "");
        C8632dsu.c((Object) drx, "");
        C8632dsu.c((Object) drm, "");
        C8632dsu.c((Object) dro, "");
        C8632dsu.c((Object) c4037bTx, "");
        this.gameHandleViewModel = c4037bTx;
    }

    @Override // com.netflix.mediaclient.ui.home.impl.lolomo.LolomoEpoxyController, com.netflix.mediaclient.ui.home.impl.HomeEpoxyController
    public void addTitle(InterfaceC2023aX interfaceC2023aX, LoMo loMo, C1729aMb c1729aMb, boolean z) {
        String title;
        boolean g;
        C8632dsu.c((Object) interfaceC2023aX, "");
        C8632dsu.c((Object) loMo, "");
        C8632dsu.c((Object) c1729aMb, "");
        if (!c1729aMb.q() || (title = loMo.getTitle()) == null) {
            return;
        }
        g = C8691duz.g(title);
        if (g) {
            return;
        }
        C3814bLq c3814bLq = new C3814bLq();
        String id = loMo.getId();
        c3814bLq.b((CharSequence) ("row-title-" + id));
        if (loMo.getListPos() == 0) {
            c3814bLq.d(C4022bTi.a.g);
        } else {
            c3814bLq.d(getStandardTitleLayoutId(loMo.getListPos(), loMo));
        }
        c3814bLq.d((CharSequence) loMo.getTitle());
        c3814bLq.d(new AbstractC3073as.b() { // from class: o.bTt
            @Override // o.AbstractC3073as.b
            public final int b(int i, int i2, int i3) {
                int addTitle$lambda$1$lambda$0;
                addTitle$lambda$1$lambda$0 = GamesLolomoEpoxyController.addTitle$lambda$1$lambda$0(i, i2, i3);
                return addTitle$lambda$1$lambda$0;
            }
        });
        interfaceC2023aX.add(c3814bLq);
    }

    @Override // com.netflix.mediaclient.ui.home.impl.lolomo.LolomoEpoxyController, com.netflix.mediaclient.ui.home.impl.HomeEpoxyController
    public boolean addEmptyRow(InterfaceC2023aX interfaceC2023aX, LoMo loMo, C1729aMb c1729aMb, C4049bUi c4049bUi, int i, InterfaceC5155btS interfaceC5155btS, TrackingInfoHolder trackingInfoHolder) {
        C8632dsu.c((Object) interfaceC2023aX, "");
        C8632dsu.c((Object) loMo, "");
        C8632dsu.c((Object) c1729aMb, "");
        C8632dsu.c((Object) c4049bUi, "");
        C8632dsu.c((Object) interfaceC5155btS, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        if (e.a[loMo.getType().ordinal()] == 1) {
            if (hideGameIdentityRow()) {
                return false;
            }
            buildGameIdentityRow(interfaceC2023aX, trackingInfoHolder);
            return true;
        }
        return super.addEmptyRow(interfaceC2023aX, loMo, c1729aMb, c4049bUi, i, interfaceC5155btS, trackingInfoHolder);
    }

    private final boolean hideGameIdentityRow() {
        return ((Boolean) C8980gu.c(this.gameHandleViewModel, new drM<C4037bTx.e, Boolean>() { // from class: com.netflix.mediaclient.ui.home.impl.games.GamesLolomoEpoxyController$hideGameIdentityRow$1
            @Override // o.drM
            /* renamed from: d */
            public final Boolean invoke(C4037bTx.e eVar) {
                C8632dsu.c((Object) eVar, "");
                String d2 = eVar.d();
                return Boolean.valueOf(!(d2 == null || d2.length() == 0));
            }
        })).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildGameIdentityRow$lambda$4$lambda$3(GamesLolomoEpoxyController gamesLolomoEpoxyController, View view) {
        C8632dsu.c((Object) gamesLolomoEpoxyController, "");
        gamesLolomoEpoxyController.getEventBusFactory().b(AbstractC4034bTu.class, AbstractC4034bTu.b.d);
    }

    private final void buildGameIdentityRow(InterfaceC2023aX interfaceC2023aX, TrackingInfoHolder trackingInfoHolder) {
        C4076bVi c4076bVi = new C4076bVi();
        c4076bVi.b((CharSequence) "game-identity-row");
        c4076bVi.b(AppView.gameEducationBanner);
        c4076bVi.e(trackingInfoHolder);
        c4076bVi.a(bSY.a(getHomeModelTracking(), false, 1, null));
        c4076bVi.d(bSY.b(getHomeModelTracking(), (InterfaceC5223buh) null, (LoMoType) null, 3, (Object) null));
        c4076bVi.e(new AbstractC3073as.b() { // from class: o.bTv
            @Override // o.AbstractC3073as.b
            public final int b(int i, int i2, int i3) {
                int buildGameIdentityRow$lambda$4$lambda$2;
                buildGameIdentityRow$lambda$4$lambda$2 = GamesLolomoEpoxyController.buildGameIdentityRow$lambda$4$lambda$2(i, i2, i3);
                return buildGameIdentityRow$lambda$4$lambda$2;
            }
        });
        c4076bVi.e(new View.OnClickListener() { // from class: o.bTz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GamesLolomoEpoxyController.buildGameIdentityRow$lambda$4$lambda$3(GamesLolomoEpoxyController.this, view);
            }
        });
        interfaceC2023aX.add(c4076bVi);
    }
}
