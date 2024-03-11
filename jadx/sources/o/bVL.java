package o;

import android.content.Context;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.interface_.LoMo;
import com.netflix.mediaclient.servicemgr.interface_.details.LiveState;
import com.netflix.mediaclient.ui.home.impl.lolomo.LolomoEpoxyController;
import com.netflix.model.leafs.originals.BillboardAsset;
import com.netflix.model.leafs.originals.BillboardSummary;
import o.AbstractC3073as;
import o.InterfaceC6419ccu;

/* loaded from: classes4.dex */
public final class bVL {
    private final bSY b;
    private final Context c;

    /* JADX INFO: Access modifiers changed from: private */
    public static final int a(int i, int i2, int i3) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int d(int i, int i2, int i3) {
        return i;
    }

    public bVL(Context context, bSY bsy) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) bsy, "");
        this.c = context;
        this.b = bsy;
    }

    public final void b(InterfaceC2023aX interfaceC2023aX, C4049bUi c4049bUi, LoMo loMo, InterfaceC5222bug<? extends InterfaceC5223buh> interfaceC5222bug, TrackingInfoHolder trackingInfoHolder) {
        String boxartId;
        BillboardAsset background;
        C8632dsu.c((Object) interfaceC2023aX, "");
        C8632dsu.c((Object) c4049bUi, "");
        C8632dsu.c((Object) loMo, "");
        C8632dsu.c((Object) interfaceC5222bug, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        InterfaceC5180btr interfaceC5180btr = (InterfaceC5180btr) C9726vo.d(interfaceC5222bug.getVideo(), InterfaceC5180btr.class);
        InterfaceC5223buh video = interfaceC5222bug.getVideo();
        BillboardSummary f = interfaceC5180btr.f();
        if (f == null || (background = f.getBackground()) == null || (boxartId = background.getImageKey()) == null) {
            boxartId = interfaceC5180btr.getBoxartId();
        }
        TrackingInfoHolder b = trackingInfoHolder.b(video, boxartId, 0);
        bZK l = c4049bUi.l();
        String aH_ = interfaceC5180btr.aH_();
        LiveState a = l.a(aH_ != null ? Integer.valueOf(Integer.parseInt(aH_)) : null);
        if (InterfaceC6419ccu.c.b(this.c)) {
            bVG bvg = new bVG();
            int listPos = loMo.getListPos();
            bvg.e((CharSequence) ("billboard-" + listPos));
            bvg.a(interfaceC5180btr);
            bvg.e(0);
            bvg.c(a);
            bvg.d(b);
            bvg.d(LolomoEpoxyController.Companion.b());
            bvg.a(bSY.a(this.b, false, 1, null));
            bvg.a(this.b.e(interfaceC5180btr, loMo.getType()));
            bvg.b(bSI.c(loMo));
            bvg.c(c4049bUi.a());
            bvg.e(new AbstractC3073as.b() { // from class: o.bVK
                @Override // o.AbstractC3073as.b
                public final int b(int i, int i2, int i3) {
                    int a2;
                    a2 = bVL.a(i, i2, i3);
                    return a2;
                }
            });
            interfaceC2023aX.add(bvg);
            return;
        }
        C4070bVc c4070bVc = new C4070bVc();
        int listPos2 = loMo.getListPos();
        c4070bVc.e((CharSequence) ("billboard-" + listPos2));
        c4070bVc.a(interfaceC5180btr);
        c4070bVc.d(0);
        c4070bVc.c(a);
        c4070bVc.d(b);
        c4070bVc.b(LolomoEpoxyController.Companion.b());
        c4070bVc.a(bSY.a(this.b, false, 1, null));
        c4070bVc.b(this.b.e(interfaceC5180btr, loMo.getType()));
        c4070bVc.b(bSI.c(loMo));
        c4070bVc.b(c4049bUi.a());
        c4070bVc.e(new AbstractC3073as.b() { // from class: o.bVJ
            @Override // o.AbstractC3073as.b
            public final int b(int i, int i2, int i3) {
                int d;
                d = bVL.d(i, i2, i3);
                return d;
            }
        });
        interfaceC2023aX.add(c4070bVc);
    }
}
