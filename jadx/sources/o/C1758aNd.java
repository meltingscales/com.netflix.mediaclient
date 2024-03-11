package o;

import com.netflix.cl.ExtLogger;
import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.CommandValue;
import com.netflix.cl.model.event.session.Session;
import com.netflix.cl.model.event.session.action.AddToPlaylist;
import com.netflix.cl.model.event.session.action.RemoveFromPlaylist;
import com.netflix.falkor.task.MutateMyListQueueTask;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import io.reactivex.Observable;
import kotlin.Pair;
import o.C1758aNd;
import o.C8632dsu;
import o.aLO;
import o.dpR;

/* renamed from: o.aNd  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1758aNd {
    private final Observable<dpR> d;
    public static final d b = new d(null);
    public static final int a = 8;

    public C1758aNd(Observable<dpR> observable) {
        C8632dsu.c((Object) observable, "");
        this.d = observable;
    }

    /* renamed from: o.aNd$d */
    /* loaded from: classes3.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("MyListUpdater");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(boolean z, Long l, drM<? super Boolean, dpR> drm, aLO<? extends Pair<Boolean, ? extends Status>> alo) {
        boolean z2;
        Throwable b2;
        if (alo instanceof aLZ) {
            Pair pair = (Pair) ((aLZ) alo).e();
            Status status = (Status) pair.c();
            z2 = C8632dsu.c((Boolean) pair.b(), Boolean.valueOf(z));
            if (z2) {
                Logger.INSTANCE.endSession(l);
            } else {
                ExtLogger.INSTANCE.failedAction(l, C8169dfM.b(status));
            }
        } else {
            ExtLogger extLogger = ExtLogger.INSTANCE;
            String str = null;
            aLL all = alo instanceof aLL ? (aLL) alo : null;
            if (all != null && (b2 = all.b()) != null) {
                str = b2.getMessage();
            }
            extLogger.failedAction(l, str);
            z2 = false;
        }
        drm.invoke(Boolean.valueOf(z2));
    }

    public final void b(String str, VideoType videoType, final boolean z, AppView appView, TrackingInfoHolder trackingInfoHolder, String str2, String str3, final drM<? super Boolean, dpR> drm) {
        Session removeFromPlaylist;
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) videoType, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        C8632dsu.c((Object) drm, "");
        b.getLogTag();
        if (z) {
            removeFromPlaylist = new AddToPlaylist(AppView.addToMyListButton, appView, CommandValue.AddToPlaylistCommand, TrackingInfoHolder.e(trackingInfoHolder, null, 1, null));
        } else {
            removeFromPlaylist = new RemoveFromPlaylist(AppView.removeFromMyListButton, appView, CommandValue.RemoveFromPlaylistCommand, TrackingInfoHolder.e(trackingInfoHolder, null, 1, null));
        }
        final Long startSession = Logger.INSTANCE.startSession(removeFromPlaylist);
        if (C8153dex.ab()) {
            C0987Kg d2 = C0987Kg.e.d();
            if (z && videoType != VideoType.GAMES) {
                d2.a(str, Integer.valueOf(trackingInfoHolder.a()), str3, new drM<aLO<? extends Pair<? extends Boolean, ? extends Status>>, dpR>() { // from class: com.netflix.mediaclient.service.browse.data.MyListUpdater$updateMyList$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* synthetic */ dpR invoke(aLO<? extends Pair<? extends Boolean, ? extends Status>> alo) {
                        c(alo);
                        return dpR.c;
                    }

                    public final void c(aLO<? extends Pair<Boolean, ? extends Status>> alo) {
                        C8632dsu.c((Object) alo, "");
                        C1758aNd.this.c(z, startSession, drm, alo);
                    }
                });
                return;
            } else if (z && videoType == VideoType.GAMES) {
                d2.a(str, new drM<aLO<? extends Pair<? extends Boolean, ? extends Status>>, dpR>() { // from class: com.netflix.mediaclient.service.browse.data.MyListUpdater$updateMyList$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* synthetic */ dpR invoke(aLO<? extends Pair<? extends Boolean, ? extends Status>> alo) {
                        b(alo);
                        return dpR.c;
                    }

                    public final void b(aLO<? extends Pair<Boolean, ? extends Status>> alo) {
                        C8632dsu.c((Object) alo, "");
                        C1758aNd.this.c(z, startSession, drm, alo);
                    }
                });
                return;
            } else if (!z && videoType != VideoType.GAMES) {
                d2.a(str, str3, new drM<aLO<? extends Pair<? extends Boolean, ? extends Status>>, dpR>() { // from class: com.netflix.mediaclient.service.browse.data.MyListUpdater$updateMyList$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* synthetic */ dpR invoke(aLO<? extends Pair<? extends Boolean, ? extends Status>> alo) {
                        a(alo);
                        return dpR.c;
                    }

                    public final void a(aLO<? extends Pair<Boolean, ? extends Status>> alo) {
                        C8632dsu.c((Object) alo, "");
                        C1758aNd.this.c(z, startSession, drm, alo);
                    }
                });
                return;
            } else if (z || videoType != VideoType.GAMES) {
                return;
            } else {
                d2.b(str, new drM<aLO<? extends Pair<? extends Boolean, ? extends Status>>, dpR>() { // from class: com.netflix.mediaclient.service.browse.data.MyListUpdater$updateMyList$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* synthetic */ dpR invoke(aLO<? extends Pair<? extends Boolean, ? extends Status>> alo) {
                        a(alo);
                        return dpR.c;
                    }

                    public final void a(aLO<? extends Pair<Boolean, ? extends Status>> alo) {
                        C8632dsu.c((Object) alo, "");
                        C1758aNd.this.c(z, startSession, drm, alo);
                    }
                });
                return;
            }
        }
        aLN.a.a(this.d).b(new MutateMyListQueueTask(z ? MutateMyListQueueTask.Mutation.a : MutateMyListQueueTask.Mutation.b, str, videoType, str2, str3, trackingInfoHolder.a()), new drM<aLO<? extends Pair<? extends Boolean, ? extends Status>>, dpR>() { // from class: com.netflix.mediaclient.service.browse.data.MyListUpdater$updateMyList$6
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(aLO<? extends Pair<? extends Boolean, ? extends Status>> alo) {
                a(alo);
                return dpR.c;
            }

            public final void a(aLO<? extends Pair<Boolean, ? extends Status>> alo) {
                C8632dsu.c((Object) alo, "");
                C1758aNd.b.getLogTag();
                C1758aNd.this.c(z, startSession, drm, alo);
            }
        });
    }
}
