package com.netflix.mediaclient.ui.lightbox.impl;

import android.content.Context;
import com.airbnb.epoxy.TypedEpoxyController;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.ui.lightbox.api.LightBoxItem;
import com.netflix.mediaclient.ui.lightbox.impl.LightboxEpoxyController;
import com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerControlsType;
import com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerVideoGroupViewModel;
import com.netflix.mediaclient.util.AccessibilityUtils;
import com.netflix.mediaclient.util.PlayContext;
import java.util.List;
import o.AbstractC5271bvc;
import o.AbstractC6719cic;
import o.AbstractC6729cim;
import o.C4201bZz;
import o.C5105bsV;
import o.C6652chO;
import o.C6692ciB;
import o.C6734cir;
import o.C8067ddQ;
import o.C8126deW;
import o.C8569dql;
import o.C8632dsu;
import o.C9935zP;
import o.InterfaceC4467bf;
import o.InterfaceC6718cib;
import o.bLE;
import o.drO;

/* loaded from: classes4.dex */
public class LightboxEpoxyController extends TypedEpoxyController<List<? extends LightBoxItem>> {
    private final AppView appView;
    private final Context context;
    private final C9935zP eventBusFac;
    private final MiniPlayerVideoGroupViewModel miniPlayerViewModel;

    public LightboxEpoxyController(Context context, MiniPlayerVideoGroupViewModel miniPlayerVideoGroupViewModel, C9935zP c9935zP, AppView appView) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) miniPlayerVideoGroupViewModel, "");
        C8632dsu.c((Object) c9935zP, "");
        C8632dsu.c((Object) appView, "");
        this.context = context;
        this.miniPlayerViewModel = miniPlayerVideoGroupViewModel;
        this.eventBusFac = c9935zP;
        this.appView = appView;
    }

    private final void renderVideo(LightBoxItem.Video video, int i) {
        final AbstractC5271bvc.b bVar = new AbstractC5271bvc.b(Long.parseLong(video.d()));
        C6734cir c6734cir = new C6734cir();
        c6734cir.b((CharSequence) ("carousel-item-" + i));
        c6734cir.b(C4201bZz.b.e);
        c6734cir.e(video.e());
        c6734cir.e(MiniPlayerControlsType.e);
        c6734cir.b(video.d());
        c6734cir.d(bVar.d());
        c6734cir.d((PlayContext) video.b().d(true));
        c6734cir.c(video.c());
        c6734cir.a(false);
        c6734cir.b(false);
        c6734cir.a(this.appView);
        c6734cir.j(this.appView.name());
        c6734cir.b(this.miniPlayerViewModel);
        c6734cir.b((InterfaceC6718cib) new C6652chO(this.appView));
        c6734cir.b(this.eventBusFac);
        c6734cir.c(new InterfaceC4467bf() { // from class: o.bZw
            @Override // o.InterfaceC4467bf
            public final void c(AbstractC3073as abstractC3073as, Object obj, int i2) {
                LightboxEpoxyController.renderVideo$lambda$3$lambda$2(LightboxEpoxyController.this, bVar, (C6734cir) abstractC3073as, (AbstractC6729cim.b) obj, i2);
            }
        });
        add(c6734cir);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void renderVideo$lambda$3$lambda$2(LightboxEpoxyController lightboxEpoxyController, AbstractC5271bvc.b bVar, C6734cir c6734cir, AbstractC6729cim.b bVar2, int i) {
        C8632dsu.c((Object) lightboxEpoxyController, "");
        C8632dsu.c((Object) bVar, "");
        lightboxEpoxyController.miniPlayerViewModel.c(bVar);
        lightboxEpoxyController.miniPlayerViewModel.a(new C5105bsV("gdpTrailer", false, new drO<String>() { // from class: com.netflix.mediaclient.ui.lightbox.impl.LightboxEpoxyController$renderVideo$1$1$1
            @Override // o.drO
            /* renamed from: d */
            public final String invoke() {
                String d2 = C8126deW.d();
                C8632dsu.a(d2, "");
                return d2;
            }
        }, 2, null));
        if (lightboxEpoxyController.canAutoplayTrailer(lightboxEpoxyController.context)) {
            lightboxEpoxyController.eventBusFac.b(AbstractC6719cic.class, new AbstractC6719cic.e.c(0, 0));
        }
    }

    private final boolean canAutoplayTrailer(Context context) {
        return (!C6692ciB.a.e() || AccessibilityUtils.a(context) || C8067ddQ.c()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.airbnb.epoxy.TypedEpoxyController
    public void buildModels(List<? extends LightBoxItem> list) {
        if (list != null) {
            int i = 0;
            for (Object obj : list) {
                if (i < 0) {
                    C8569dql.h();
                }
                LightBoxItem lightBoxItem = (LightBoxItem) obj;
                if (lightBoxItem instanceof LightBoxItem.Image) {
                    renderImage((LightBoxItem.Image) lightBoxItem, i);
                } else if (lightBoxItem instanceof LightBoxItem.Video) {
                    renderVideo((LightBoxItem.Video) lightBoxItem, i);
                }
                i++;
            }
        }
    }

    private final void renderImage(LightBoxItem.Image image, int i) {
        bLE ble = new bLE();
        ble.d((CharSequence) ("carousel-item-" + i));
        ble.b(image.a());
        ble.e(C4201bZz.b.c);
        add(ble);
    }
}
