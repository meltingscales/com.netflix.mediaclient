package com.netflix.mediaclient.ui.usermarks.impl;

import android.view.View;
import com.airbnb.epoxy.TypedEpoxyController;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.clutils.PlayContextImp;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.PlayLocationType;
import com.netflix.mediaclient.ui.usermarks.impl.UserMarksEpoxyController;
import com.netflix.mediaclient.util.PlayContext;
import java.util.List;
import o.AbstractC8025dcb;
import o.AbstractC8027dcd;
import o.C7969dbY;
import o.C8033dcj;
import o.C8039dcp;
import o.C8049dcz;
import o.C8627dsp;
import o.C8632dsu;
import o.C9935zP;
import o.InterfaceC4573bh;

/* loaded from: classes5.dex */
public final class UserMarksEpoxyController extends TypedEpoxyController<C8049dcz> {
    private static final int VISIBLE_HEIGHT_PERCENTAGE_THRESHOLD = 50;
    private final C9935zP eventBusFactory;
    private final boolean hasPreviewPlayer;
    private final boolean sharingEnabled;
    private TrackingInfoHolder trackingInfoHolder;
    public static final a Companion = new a(null);
    public static final int $stable = 8;

    public UserMarksEpoxyController(C9935zP c9935zP, boolean z, boolean z2) {
        C8632dsu.c((Object) c9935zP, "");
        this.eventBusFactory = c9935zP;
        this.hasPreviewPlayer = z;
        this.sharingEnabled = z2;
        this.trackingInfoHolder = new TrackingInfoHolder(PlayLocationType.USER_MARKS);
    }

    /* loaded from: classes5.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.airbnb.epoxy.TypedEpoxyController
    public void buildModels(final C8049dcz c8049dcz) {
        List<C7969dbY> a2;
        if (c8049dcz == null || (a2 = c8049dcz.a()) == null) {
            return;
        }
        if (a2.isEmpty()) {
            C8039dcp c8039dcp = new C8039dcp();
            c8039dcp.d((CharSequence) "UserMarkEmptyState");
            add(c8039dcp);
            return;
        }
        for (final C7969dbY c7969dbY : a2) {
            TrackingInfoHolder trackingInfoHolder = this.trackingInfoHolder;
            int parseInt = Integer.parseInt(c7969dbY.i());
            PlayContext playContext = PlayContextImp.w;
            C8632dsu.a(playContext, "");
            this.trackingInfoHolder = trackingInfoHolder.d(parseInt, playContext);
            C8033dcj c8033dcj = new C8033dcj();
            String e = c7969dbY.e();
            c8033dcj.e((CharSequence) ("UserMarkModel:" + e));
            c8033dcj.e(c7969dbY.i());
            c8033dcj.b(c7969dbY.e());
            c8033dcj.d((CharSequence) c7969dbY.c());
            c8033dcj.c((CharSequence) c7969dbY.f());
            c8033dcj.b((CharSequence) C7969dbY.e.b(c7969dbY.g()));
            c8033dcj.c(c7969dbY.a());
            c8033dcj.d(this.hasPreviewPlayer && C8632dsu.c(c7969dbY, c8049dcz.b()));
            c8033dcj.c(c8049dcz.c());
            c8033dcj.e(this.sharingEnabled);
            c8033dcj.c(this.trackingInfoHolder);
            c8033dcj.b(new View.OnClickListener() { // from class: o.dcl
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UserMarksEpoxyController.buildModels$lambda$8$lambda$7$lambda$6$lambda$1(UserMarksEpoxyController.this, c7969dbY, view);
                }
            });
            c8033dcj.c(new View.OnClickListener() { // from class: o.dcn
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UserMarksEpoxyController.buildModels$lambda$8$lambda$7$lambda$6$lambda$2(UserMarksEpoxyController.this, c7969dbY, view);
                }
            });
            c8033dcj.e(new View.OnClickListener() { // from class: o.dco
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UserMarksEpoxyController.buildModels$lambda$8$lambda$7$lambda$6$lambda$3(UserMarksEpoxyController.this, c7969dbY, view);
                }
            });
            c8033dcj.d(new InterfaceC4573bh() { // from class: o.dct
                @Override // o.InterfaceC4573bh
                public final void b(AbstractC3073as abstractC3073as, Object obj, float f, float f2, int i, int i2) {
                    UserMarksEpoxyController.buildModels$lambda$8$lambda$7$lambda$6$lambda$5(C8049dcz.this, (C8033dcj) abstractC3073as, (AbstractC8025dcb.e) obj, f, f2, i, i2);
                }
            });
            add(c8033dcj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$8$lambda$7$lambda$6$lambda$1(UserMarksEpoxyController userMarksEpoxyController, C7969dbY c7969dbY, View view) {
        C8632dsu.c((Object) userMarksEpoxyController, "");
        C8632dsu.c((Object) c7969dbY, "");
        if (userMarksEpoxyController.hasPreviewPlayer) {
            userMarksEpoxyController.emit(new AbstractC8027dcd.d(c7969dbY));
        } else {
            userMarksEpoxyController.emit(new AbstractC8027dcd.c(c7969dbY));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$8$lambda$7$lambda$6$lambda$2(UserMarksEpoxyController userMarksEpoxyController, C7969dbY c7969dbY, View view) {
        C8632dsu.c((Object) userMarksEpoxyController, "");
        C8632dsu.c((Object) c7969dbY, "");
        userMarksEpoxyController.emit(new AbstractC8027dcd.e(c7969dbY));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$8$lambda$7$lambda$6$lambda$3(UserMarksEpoxyController userMarksEpoxyController, C7969dbY c7969dbY, View view) {
        C8632dsu.c((Object) userMarksEpoxyController, "");
        C8632dsu.c((Object) c7969dbY, "");
        userMarksEpoxyController.emit(new AbstractC8027dcd.a(c7969dbY));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$8$lambda$7$lambda$6$lambda$5(C8049dcz c8049dcz, C8033dcj c8033dcj, AbstractC8025dcb.e eVar, float f, float f2, int i, int i2) {
        TrackingInfoHolder y = c8033dcj.y();
        if (f > 50.0f) {
            c8049dcz.e().d(c8033dcj.k(), AppView.userMarksHome, y);
        }
    }

    private final void emit(AbstractC8027dcd abstractC8027dcd) {
        this.eventBusFactory.b(AbstractC8027dcd.class, abstractC8027dcd);
    }
}
