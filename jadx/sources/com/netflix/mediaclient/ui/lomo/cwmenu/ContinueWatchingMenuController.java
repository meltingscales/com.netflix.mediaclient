package com.netflix.mediaclient.ui.lomo.cwmenu;

import android.content.DialogInterface;
import android.view.View;
import androidx.appcompat.app.AlertDialog;
import com.netflix.android.widgetry.widget.menu.MenuController;
import com.netflix.cl.ExtLogger;
import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.CommandValue;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.cl.model.event.discrete.Closed;
import com.netflix.cl.model.event.session.Presentation;
import com.netflix.cl.model.event.session.action.RemoveFromPlaylist;
import com.netflix.cl.model.event.session.command.ViewDetailsCommand;
import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.clutils.CLv2Utils;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.service.webclient.volley.StatusCodeError;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.ui.R;
import com.netflix.mediaclient.ui.lomo.cwmenu.ContinueWatchingMenuController;
import io.reactivex.rxkotlin.SubscribersKt;
import kotlin.Pair;
import kotlin.jvm.internal.Ref;
import o.AbstractC5164btb;
import o.AbstractC6507cec;
import o.C0998Kr;
import o.C1004Kx;
import o.C3796bKz;
import o.C6512ceh;
import o.C6514cej;
import o.C6517cem;
import o.C6518cen;
import o.C7350cuZ;
import o.C8054ddD;
import o.C8169dfM;
import o.C8632dsu;
import o.InterfaceC3643bFl;
import o.InterfaceC5125bsp;
import o.InterfaceC5157btU;
import o.InterfaceC7303ctf;
import o.InterfaceC8366diy;
import o.aLP;
import o.cPU;
import o.dpR;
import o.drM;
import o.drO;
import o.drX;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class ContinueWatchingMenuController extends MenuController<AbstractC6507cec> {
    public static final int $stable = 8;
    private int currentThumbsRating;
    private final aLP falcorRepository;
    private final NetflixActivity netflixActivity;
    private boolean ratingApiCallInProgress;
    private final TrackingInfo trackingInfo;
    private final TrackingInfoHolder trackingInfoHolder;
    private final InterfaceC8366diy video;

    @Override // com.netflix.android.widgetry.widget.menu.MenuController
    public void addFooters() {
    }

    @Override // com.netflix.android.widgetry.widget.menu.MenuController
    public void addHeaders() {
    }

    protected final TrackingInfoHolder getTrackingInfoHolder() {
        return this.trackingInfoHolder;
    }

    protected final InterfaceC8366diy getVideo() {
        return this.video;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContinueWatchingMenuController(InterfaceC8366diy interfaceC8366diy, TrackingInfoHolder trackingInfoHolder, NetflixActivity netflixActivity, aLP alp) {
        super(null, 1, null);
        C8632dsu.c((Object) interfaceC8366diy, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        C8632dsu.c((Object) netflixActivity, "");
        C8632dsu.c((Object) alp, "");
        this.video = interfaceC8366diy;
        this.trackingInfoHolder = trackingInfoHolder;
        this.netflixActivity = netflixActivity;
        this.falcorRepository = alp;
        this.trackingInfo = trackingInfoHolder.c((JSONObject) null);
        this.currentThumbsRating = interfaceC8366diy.getUserThumbRating();
    }

    @Override // com.netflix.android.widgetry.widget.menu.MenuController
    public void addItems() {
        String aC_;
        InterfaceC8366diy interfaceC8366diy;
        int i;
        C6517cem c6517cem = new C6517cem();
        c6517cem.a((CharSequence) "cw_menu_title");
        VideoType type = this.video.getType();
        VideoType videoType = VideoType.MOVIE;
        if (type == videoType) {
            aC_ = this.video.getTitle();
        } else {
            aC_ = this.video.aC_();
        }
        c6517cem.e((CharSequence) aC_);
        c6517cem.e(new View.OnClickListener() { // from class: o.cdQ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ContinueWatchingMenuController.addItems$lambda$1$lambda$0(ContinueWatchingMenuController.this, view);
            }
        });
        add(c6517cem);
        C6514cej c6514cej = new C6514cej();
        c6514cej.c((CharSequence) "cw_menu_more_info_row");
        c6514cej.a(Integer.valueOf(C3796bKz.e.b));
        VideoType type2 = this.video.getType();
        VideoType videoType2 = VideoType.SHOW;
        c6514cej.e(Integer.valueOf(type2 == videoType2 ? R.o.dw : R.o.db));
        c6514cej.b(new View.OnClickListener() { // from class: o.cdO
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ContinueWatchingMenuController.addItems$lambda$3$lambda$2(ContinueWatchingMenuController.this, view);
            }
        });
        add(c6514cej);
        if (this.video.getType() == videoType2) {
            interfaceC8366diy = this.video.b(0.7f);
        } else {
            interfaceC8366diy = this.video.getType() == videoType ? this.video : null;
        }
        if (interfaceC8366diy != null && InterfaceC7303ctf.c.a(this.netflixActivity).c(this.netflixActivity, interfaceC8366diy)) {
            if (this.video.getType() == videoType2) {
                i = C8632dsu.c((Object) this.video.bU_(), (Object) interfaceC8366diy.getId()) ? R.o.bc : R.o.bd;
            } else {
                i = C7350cuZ.a.a;
            }
            C6512ceh c6512ceh = new C6512ceh();
            c6512ceh.a((CharSequence) "cw_menu_download");
            if (this.video.getType() == videoType2) {
                videoType = VideoType.EPISODE;
            }
            c6512ceh.c(videoType);
            c6512ceh.b(interfaceC8366diy.getId());
            c6512ceh.d(interfaceC8366diy.isPlayable());
            c6512ceh.b(Integer.valueOf(i));
            c6512ceh.c(this.trackingInfoHolder);
            add(c6512ceh);
        }
        int i2 = this.currentThumbsRating;
        boolean z = i2 == 0;
        if (z || i2 == 1) {
            final C6518cen c6518cen = new C6518cen();
            c6518cen.a((CharSequence) "cw_menu_thumbs_down");
            c6518cen.j(this.currentThumbsRating);
            c6518cen.d(1);
            c6518cen.d(c6518cen.i());
            c6518cen.a(new View.OnClickListener() { // from class: o.cdN
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ContinueWatchingMenuController.addItems$lambda$6$lambda$5(ContinueWatchingMenuController.this, c6518cen, view);
                }
            });
            add(c6518cen);
        }
        if (z || this.currentThumbsRating == 2) {
            final C6518cen c6518cen2 = new C6518cen();
            c6518cen2.a((CharSequence) "cw_menu_thumbs_up");
            c6518cen2.j(this.currentThumbsRating);
            c6518cen2.d(2);
            c6518cen2.d(c6518cen2.i());
            c6518cen2.a(new View.OnClickListener() { // from class: o.cdR
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ContinueWatchingMenuController.addItems$lambda$8$lambda$7(ContinueWatchingMenuController.this, c6518cen2, view);
                }
            });
            add(c6518cen2);
        }
        if (z || this.currentThumbsRating == 3) {
            final C6518cen c6518cen3 = new C6518cen();
            c6518cen3.a((CharSequence) "cw_menu_thumbs_way_up");
            c6518cen3.j(this.currentThumbsRating);
            c6518cen3.d(3);
            c6518cen3.d(c6518cen3.i());
            c6518cen3.a(new View.OnClickListener() { // from class: o.cdW
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ContinueWatchingMenuController.addItems$lambda$10$lambda$9(ContinueWatchingMenuController.this, c6518cen3, view);
                }
            });
            add(c6518cen3);
        }
        C6514cej c6514cej2 = new C6514cej();
        c6514cej2.c((CharSequence) "cw_menu_remove_from_row");
        c6514cej2.a(Integer.valueOf(R.e.v));
        c6514cej2.e(Integer.valueOf(R.o.lb));
        c6514cej2.c(true);
        c6514cej2.b(new View.OnClickListener() { // from class: o.cdV
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ContinueWatchingMenuController.addItems$lambda$12$lambda$11(ContinueWatchingMenuController.this, view);
            }
        });
        add(c6514cej2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addItems$lambda$1$lambda$0(ContinueWatchingMenuController continueWatchingMenuController, View view) {
        C8632dsu.c((Object) continueWatchingMenuController, "");
        Logger.INSTANCE.logEvent(new Closed(AppView.titleActionMenu, null, CommandValue.CloseCommand, continueWatchingMenuController.trackingInfo));
        continueWatchingMenuController.getItemClickSubject().onNext(AbstractC6507cec.e.c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addItems$lambda$3$lambda$2(ContinueWatchingMenuController continueWatchingMenuController, View view) {
        C8632dsu.c((Object) continueWatchingMenuController, "");
        CLv2Utils.INSTANCE.d(AppView.movieDetails, CommandValue.ViewDetailsCommand, continueWatchingMenuController.trackingInfo, null, new ViewDetailsCommand(), true, null);
        InterfaceC3643bFl.c.a(continueWatchingMenuController.netflixActivity).d(continueWatchingMenuController.netflixActivity, continueWatchingMenuController.video, continueWatchingMenuController.trackingInfoHolder, "CwMenuSelectorDialog");
        continueWatchingMenuController.getItemClickSubject().onNext(AbstractC6507cec.e.c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addItems$lambda$6$lambda$5(ContinueWatchingMenuController continueWatchingMenuController, C6518cen c6518cen, View view) {
        C8632dsu.c((Object) continueWatchingMenuController, "");
        C8632dsu.c((Object) c6518cen, "");
        continueWatchingMenuController.onThumbsRatingClicked(c6518cen.l() == 1 ? 0 : 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addItems$lambda$8$lambda$7(ContinueWatchingMenuController continueWatchingMenuController, C6518cen c6518cen, View view) {
        C8632dsu.c((Object) continueWatchingMenuController, "");
        C8632dsu.c((Object) c6518cen, "");
        continueWatchingMenuController.onThumbsRatingClicked(c6518cen.l() == 2 ? 0 : 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addItems$lambda$10$lambda$9(ContinueWatchingMenuController continueWatchingMenuController, C6518cen c6518cen, View view) {
        C8632dsu.c((Object) continueWatchingMenuController, "");
        C8632dsu.c((Object) c6518cen, "");
        continueWatchingMenuController.onThumbsRatingClicked(c6518cen.l() == 3 ? 0 : 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addItems$lambda$12$lambda$11(ContinueWatchingMenuController continueWatchingMenuController, View view) {
        C8632dsu.c((Object) continueWatchingMenuController, "");
        continueWatchingMenuController.onRemoveFromRowClicked();
    }

    private final void onThumbsRatingClicked(final int i) {
        this.ratingApiCallInProgress = true;
        getItemClickSubject().onNext(AbstractC6507cec.d.d);
        final int i2 = this.currentThumbsRating;
        this.currentThumbsRating = i;
        requestModelBuild();
        this.netflixActivity.getHandler().postDelayed(new Runnable() { // from class: o.cdT
            @Override // java.lang.Runnable
            public final void run() {
                ContinueWatchingMenuController.onThumbsRatingClicked$lambda$13(i, this);
            }
        }, 1000L);
        final drX<Long, StatusCode, dpR> drx = new drX<Long, StatusCode, dpR>() { // from class: com.netflix.mediaclient.ui.lomo.cwmenu.ContinueWatchingMenuController$onThumbsRatingClicked$onSetThumbsRatingError$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(Long l, StatusCode statusCode) {
                b(l, statusCode);
                return dpR.c;
            }

            public final void b(Long l, StatusCode statusCode) {
                C8632dsu.c((Object) statusCode, "");
                ContinueWatchingMenuController.this.getItemClickSubject().onNext(AbstractC6507cec.b.a);
                ExtLogger.INSTANCE.failedAction(l, C8169dfM.b(statusCode));
                C8054ddD.c(ContinueWatchingMenuController.this.netflixActivity, R.o.dI, 1);
                ContinueWatchingMenuController.this.currentThumbsRating = i2;
                ContinueWatchingMenuController.this.ratingApiCallInProgress = false;
                ContinueWatchingMenuController.this.requestModelBuild();
            }
        };
        final Long startSession = Logger.INSTANCE.startSession(cPU.e.d(i, AppView.thumbButton, AppView.titleActionMenu, this.trackingInfo));
        aLP alp = this.falcorRepository;
        String id = this.video.getId();
        C8632dsu.a(id, "");
        SubscribersKt.subscribeBy$default(alp.e(new C1004Kx(id, i, this.trackingInfoHolder.a())), new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.lomo.cwmenu.ContinueWatchingMenuController$onThumbsRatingClicked$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Throwable th) {
                a(th);
                return dpR.c;
            }

            public final void a(Throwable th) {
                StatusCode statusCode;
                C8632dsu.c((Object) th, "");
                if (th instanceof StatusCodeError) {
                    statusCode = ((StatusCodeError) th).d();
                } else {
                    statusCode = StatusCode.UNKNOWN;
                }
                drX<Long, StatusCode, dpR> drx2 = drx;
                Long l = startSession;
                C8632dsu.d(statusCode);
                drx2.invoke(l, statusCode);
            }
        }, (drO) null, new drM<Pair<? extends InterfaceC5157btU, ? extends Status>, dpR>() { // from class: com.netflix.mediaclient.ui.lomo.cwmenu.ContinueWatchingMenuController$onThumbsRatingClicked$3
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Pair<? extends InterfaceC5157btU, ? extends Status> pair) {
                c(pair);
                return dpR.c;
            }

            public final void c(Pair<? extends InterfaceC5157btU, ? extends Status> pair) {
                C8632dsu.c((Object) pair, "");
                InterfaceC5157btU d = pair.d();
                Status a2 = pair.a();
                if (a2.j() && d != null) {
                    ContinueWatchingMenuController.this.getItemClickSubject().onNext(AbstractC6507cec.b.a);
                    Logger.INSTANCE.endSession(startSession);
                    ContinueWatchingMenuController.this.currentThumbsRating = d.getUserThumbRating();
                    ContinueWatchingMenuController.this.ratingApiCallInProgress = false;
                    ContinueWatchingMenuController.this.requestModelBuild();
                    return;
                }
                drX<Long, StatusCode, dpR> drx2 = drx;
                Long l = startSession;
                StatusCode c = a2.c();
                C8632dsu.a(c, "");
                drx2.invoke(l, c);
            }
        }, 2, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onThumbsRatingClicked$lambda$13(int i, ContinueWatchingMenuController continueWatchingMenuController) {
        C8632dsu.c((Object) continueWatchingMenuController, "");
        if (i == 0 || !continueWatchingMenuController.netflixActivity.getTutorialHelper().g()) {
            return;
        }
        continueWatchingMenuController.netflixActivity.dismissFullScreenDialog(true);
        NetflixActivity netflixActivity = continueWatchingMenuController.netflixActivity;
        if (netflixActivity.showDialog(cPU.e.e(netflixActivity).c())) {
            continueWatchingMenuController.netflixActivity.getTutorialHelper().d();
        }
    }

    private final void onRemoveFromRowClicked() {
        Logger logger = Logger.INSTANCE;
        final Long startSession = logger.startSession(new Presentation(AppView.removeFromPlaylistConfirmation, this.trackingInfo));
        final Long startSession2 = logger.startSession(new RemoveFromPlaylist(AppView.removeFromMyListButton, null, CommandValue.RemoveFromPlaylistCommand, this.trackingInfo));
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        new AlertDialog.Builder(this.netflixActivity).setMessage(R.o.aA).setPositiveButton(17039370, new DialogInterface.OnClickListener() { // from class: o.cdS
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ContinueWatchingMenuController.onRemoveFromRowClicked$lambda$14(Ref.BooleanRef.this, this, startSession2, startSession, dialogInterface, i);
            }
        }).setNegativeButton(17039360, new DialogInterface.OnClickListener() { // from class: o.cdU
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ContinueWatchingMenuController.onRemoveFromRowClicked$lambda$15(Ref.BooleanRef.this, startSession2, startSession, dialogInterface, i);
            }
        }).setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: o.cea
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                ContinueWatchingMenuController.onRemoveFromRowClicked$lambda$16(Ref.BooleanRef.this, startSession2, startSession, dialogInterface);
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onRemoveFromRowClicked$lambda$14(Ref.BooleanRef booleanRef, ContinueWatchingMenuController continueWatchingMenuController, Long l, Long l2, DialogInterface dialogInterface, int i) {
        C8632dsu.c((Object) booleanRef, "");
        C8632dsu.c((Object) continueWatchingMenuController, "");
        booleanRef.a = true;
        continueWatchingMenuController.getItemClickSubject().onNext(AbstractC6507cec.d.d);
        InterfaceC5125bsp j = continueWatchingMenuController.netflixActivity.getServiceManager().j();
        String id = continueWatchingMenuController.video.getId();
        C8632dsu.a(id, "");
        j.b(new C0998Kr(id, continueWatchingMenuController.trackingInfoHolder.a()), new a(l, l2));
    }

    /* loaded from: classes4.dex */
    public static final class a extends AbstractC5164btb {
        final /* synthetic */ Long c;
        final /* synthetic */ Long e;

        a(Long l, Long l2) {
            this.e = l;
            this.c = l2;
        }

        @Override // o.AbstractC5164btb, o.InterfaceC5094bsK
        public void a(boolean z, Status status) {
            C8632dsu.c((Object) status, "");
            ContinueWatchingMenuController.this.getItemClickSubject().onNext(AbstractC6507cec.b.a);
            if (z) {
                Logger.INSTANCE.endSession(this.e);
                ContinueWatchingMenuController.this.netflixActivity.getServiceManager().j().d(true);
                ContinueWatchingMenuController.this.getItemClickSubject().onNext(AbstractC6507cec.e.c);
            } else {
                ExtLogger.INSTANCE.failedAction(this.e, C8169dfM.b(status));
                C8054ddD.c(ContinueWatchingMenuController.this.netflixActivity, R.o.dE, 1);
            }
            Logger.INSTANCE.endSession(this.c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onRemoveFromRowClicked$lambda$15(Ref.BooleanRef booleanRef, Long l, Long l2, DialogInterface dialogInterface, int i) {
        C8632dsu.c((Object) booleanRef, "");
        booleanRef.a = true;
        Logger logger = Logger.INSTANCE;
        logger.cancelSession(l);
        logger.endSession(l2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onRemoveFromRowClicked$lambda$16(Ref.BooleanRef booleanRef, Long l, Long l2, DialogInterface dialogInterface) {
        C8632dsu.c((Object) booleanRef, "");
        if (booleanRef.a) {
            return;
        }
        Logger logger = Logger.INSTANCE;
        logger.cancelSession(l);
        logger.endSession(l2);
    }
}
