package com.netflix.mediaclient.ui.home.impl.mynetflix;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.CommandValue;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.cl.model.event.discrete.Selected;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.interface_.LoMo;
import com.netflix.mediaclient.servicemgr.interface_.LoMoType;
import com.netflix.mediaclient.ui.R;
import com.netflix.mediaclient.ui.home.impl.lolomo.LolomoEpoxyController;
import com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment;
import com.netflix.mediaclient.ui.home.impl.mynetflix.MyNetflixEpoxyController;
import com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerVideoGroupViewModel;
import com.netflix.mediaclient.util.EchoShowUtils;
import com.netflix.model.leafs.social.NotificationsListSummary;
import o.AbstractC3073as;
import o.AbstractC5100bsQ;
import o.C1729aMb;
import o.C3794bKx;
import o.C4049bUi;
import o.C5843cKk;
import o.C8119deP;
import o.C8120deQ;
import o.C8126deW;
import o.C8168dfL;
import o.C8632dsu;
import o.C9737vz;
import o.C9834xU;
import o.C9935zP;
import o.InterfaceC2023aX;
import o.InterfaceC5155btS;
import o.InterfaceC5840cKh;
import o.InterfaceC7303ctf;
import o.bJH;
import o.bJK;
import o.bLW;
import o.bSJ;
import o.bSM;
import o.bSY;
import o.bTX;
import o.dpR;
import o.drM;
import o.drO;
import o.drX;

/* loaded from: classes4.dex */
public final class MyNetflixEpoxyController extends LolomoEpoxyController {
    private final InterfaceC7303ctf offlineApi;

    /* loaded from: classes4.dex */
    public final /* synthetic */ class a {
        public static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[LoMoType.values().length];
            try {
                iArr[LoMoType.MY_PROFILES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LoMoType.MY_DOWNLOADS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LoMoType.TRAILERS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LoMoType.RECENTLY_WATCHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LoMoType.INSTANT_QUEUE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[LoMoType.NOTIFICATIONS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            d = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int errorLoadingLolomo$lambda$1$lambda$0(int i, int i2, int i3) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int errorLoadingLolomo$lambda$4$lambda$2(int i, int i2, int i3) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int errorLoadingLolomo$lambda$6$lambda$5(int i, int i2, int i3) {
        return i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyNetflixEpoxyController(LolomoMvRxFragment.d dVar, Context context, C9935zP c9935zP, bSY bsy, bLW blw, bTX btx, drX<? super LoMo, ? super Integer, dpR> drx, drM<? super LoMo, dpR> drm, drO<MiniPlayerVideoGroupViewModel> dro, AbstractC5100bsQ abstractC5100bsQ, InterfaceC7303ctf interfaceC7303ctf) {
        super(dVar, context, c9935zP, bsy, blw, btx, drx, drm, dro, abstractC5100bsQ);
        C8632dsu.c((Object) dVar, "");
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) c9935zP, "");
        C8632dsu.c((Object) bsy, "");
        C8632dsu.c((Object) btx, "");
        C8632dsu.c((Object) drx, "");
        C8632dsu.c((Object) drm, "");
        C8632dsu.c((Object) dro, "");
        C8632dsu.c((Object) interfaceC7303ctf, "");
        this.offlineApi = interfaceC7303ctf;
    }

    @Override // com.netflix.mediaclient.ui.home.impl.HomeEpoxyController
    public void addInitialLoadingShimmer(C4049bUi c4049bUi) {
        C8632dsu.c((Object) c4049bUi, "");
        addTopRows();
        if (C9737vz.d(getContext()) || C8120deQ.a() || EchoShowUtils.d.c(getContext())) {
            bJH.c(bSM.d.b, this, getContext(), c4049bUi);
        } else {
            bJH.c(bSM.i.a, this, getContext(), c4049bUi);
        }
    }

    @Override // com.netflix.mediaclient.ui.home.impl.HomeEpoxyController
    public void errorLoadingLolomo(InterfaceC2023aX interfaceC2023aX, String str) {
        C8632dsu.c((Object) interfaceC2023aX, "");
        addTopRows();
        bJK bjk = new bJK();
        bjk.d((CharSequence) "filler-middle");
        bjk.b(new AbstractC3073as.b() { // from class: o.bWh
            @Override // o.AbstractC3073as.b
            public final int b(int i, int i2, int i3) {
                int errorLoadingLolomo$lambda$1$lambda$0;
                errorLoadingLolomo$lambda$1$lambda$0 = MyNetflixEpoxyController.errorLoadingLolomo$lambda$1$lambda$0(i, i2, i3);
                return errorLoadingLolomo$lambda$1$lambda$0;
            }
        });
        interfaceC2023aX.add(bjk);
        C3794bKx c3794bKx = new C3794bKx();
        c3794bKx.b((CharSequence) "error-lolomo-retry");
        c3794bKx.c(new AbstractC3073as.b() { // from class: o.bWe
            @Override // o.AbstractC3073as.b
            public final int b(int i, int i2, int i3) {
                int errorLoadingLolomo$lambda$4$lambda$2;
                errorLoadingLolomo$lambda$4$lambda$2 = MyNetflixEpoxyController.errorLoadingLolomo$lambda$4$lambda$2(i, i2, i3);
                return errorLoadingLolomo$lambda$4$lambda$2;
            }
        });
        c3794bKx.c((CharSequence) C8168dfL.d(C9834xU.h.j));
        c3794bKx.e((CharSequence) C8168dfL.d(C9834xU.h.f));
        c3794bKx.d(new View.OnClickListener() { // from class: o.bWg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyNetflixEpoxyController.errorLoadingLolomo$lambda$4$lambda$3(MyNetflixEpoxyController.this, view);
            }
        });
        c3794bKx.a(bSY.a(getHomeModelTracking(), false, 1, null));
        c3794bKx.c((drO<? extends TrackingInfo>) MyNetflixEpoxyController$errorLoadingLolomo$2$3.b);
        interfaceC2023aX.add(c3794bKx);
        bJK bjk2 = new bJK();
        bjk2.d((CharSequence) "filler-bottom");
        bjk2.b(new AbstractC3073as.b() { // from class: o.bWf
            @Override // o.AbstractC3073as.b
            public final int b(int i, int i2, int i3) {
                int errorLoadingLolomo$lambda$6$lambda$5;
                errorLoadingLolomo$lambda$6$lambda$5 = MyNetflixEpoxyController.errorLoadingLolomo$lambda$6$lambda$5(i, i2, i3);
                return errorLoadingLolomo$lambda$6$lambda$5;
            }
        });
        interfaceC2023aX.add(bjk2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void errorLoadingLolomo$lambda$4$lambda$3(MyNetflixEpoxyController myNetflixEpoxyController, View view) {
        C8632dsu.c((Object) myNetflixEpoxyController, "");
        myNetflixEpoxyController.emit(new bSJ.n(null, 0, 3, null));
        Logger.INSTANCE.logEvent(new Selected(AppView.tryAgainButton, null, CommandValue.RetryCommand, null));
    }

    @Override // com.netflix.mediaclient.ui.home.impl.lolomo.LolomoEpoxyController, com.netflix.mediaclient.ui.home.impl.HomeEpoxyController
    public boolean addEmptyRow(InterfaceC2023aX interfaceC2023aX, LoMo loMo, C1729aMb c1729aMb, C4049bUi c4049bUi, int i, InterfaceC5155btS interfaceC5155btS, TrackingInfoHolder trackingInfoHolder) {
        C8632dsu.c((Object) interfaceC2023aX, "");
        C8632dsu.c((Object) loMo, "");
        C8632dsu.c((Object) c1729aMb, "");
        C8632dsu.c((Object) c4049bUi, "");
        C8632dsu.c((Object) interfaceC5155btS, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        switch (a.d[loMo.getType().ordinal()]) {
            case 1:
                getComponents().h().a(interfaceC2023aX);
                return true;
            case 2:
                InterfaceC5840cKh h = getComponents().h();
                String title = loMo.getTitle();
                C8632dsu.d((Object) title);
                h.b(interfaceC2023aX, title);
                return true;
            case 3:
            case 4:
            case 5:
                if (C8632dsu.c((Object) c4049bUi.b(), (Object) "myProfile")) {
                    getComponents().h().b(interfaceC2023aX, loMo.getType());
                    return true;
                }
                break;
            case 6:
                C5843cKk b = c4049bUi.s().b();
                NotificationsListSummary b2 = b.b();
                if (((!b.c().isEmpty()) && b2 != null) || C8119deP.c(C8126deW.c())) {
                    getComponents().h().d(interfaceC2023aX, b2, trackingInfoHolder);
                    return true;
                }
                break;
            default:
                return super.addEmptyRow(interfaceC2023aX, loMo, c1729aMb, c4049bUi, i, interfaceC5155btS, trackingInfoHolder);
        }
        return false;
    }

    private final void addTopRows() {
        getComponents().h().a(this);
        if (C8119deP.c(C8126deW.c())) {
            getComponents().h().d(this, null, null);
        }
        if (this.offlineApi.c((Activity) C9737vz.e(getContext(), NetflixActivity.class))) {
            InterfaceC5840cKh h = getComponents().h();
            String string = getContext().getResources().getString(R.o.lG);
            C8632dsu.a(string, "");
            h.b(this, string);
        }
    }
}
