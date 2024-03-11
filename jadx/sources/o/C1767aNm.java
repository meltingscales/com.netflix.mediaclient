package o;

import com.netflix.cl.ExtLogger;
import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.CommandValue;
import com.netflix.cl.model.event.session.Session;
import com.netflix.cl.model.event.session.action.AddToPlaylist;
import com.netflix.cl.model.event.session.action.RemoveFromPlaylist;
import com.netflix.falkor.task.MutateRemindMeGenericTask;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import io.reactivex.Observable;
import kotlin.Pair;
import o.C1767aNm;
import o.C8632dsu;
import o.aLO;
import o.dpR;

/* renamed from: o.aNm */
/* loaded from: classes3.dex */
public final class C1767aNm {
    private final Observable<dpR> b;
    public static final b e = new b(null);
    public static final int a = 8;

    public C1767aNm(Observable<dpR> observable) {
        C8632dsu.c((Object) observable, "");
        this.b = observable;
    }

    /* renamed from: o.aNm$b */
    /* loaded from: classes3.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("RemindMeUpdater");
        }
    }

    public final void d(boolean z, Long l, drM<? super Boolean, dpR> drm, aLO<? extends Pair<Boolean, ? extends Status>> alo) {
        boolean z2;
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
            if (alo instanceof aLL) {
                ExtLogger.INSTANCE.failedAction(l, ((aLL) alo).b().getMessage());
            }
            z2 = false;
        }
        drm.invoke(Boolean.valueOf(z2));
    }

    public final void c(String str, VideoType videoType, final boolean z, AppView appView, TrackingInfoHolder trackingInfoHolder, String str2, final drM<? super Boolean, dpR> drm) {
        Session removeFromPlaylist;
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) videoType, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        C8632dsu.c((Object) drm, "");
        e.getLogTag();
        if (videoType == VideoType.GAMES) {
            throw new IllegalArgumentException("Remind Me actions are not supported for games".toString());
        }
        if (z) {
            removeFromPlaylist = new AddToPlaylist(AppView.remindMeButton, appView, CommandValue.AddToPlaylistCommand, TrackingInfoHolder.e(trackingInfoHolder, null, 1, null));
        } else {
            removeFromPlaylist = new RemoveFromPlaylist(AppView.remindMeButton, appView, CommandValue.RemoveFromPlaylistCommand, TrackingInfoHolder.e(trackingInfoHolder, null, 1, null));
        }
        final Long startSession = Logger.INSTANCE.startSession(removeFromPlaylist);
        if (C8153dex.ab()) {
            C0987Kg d = C0987Kg.e.d();
            if (z) {
                d.b(str, Integer.valueOf(trackingInfoHolder.a()), str2, new drM<aLO<? extends Pair<? extends Boolean, ? extends Status>>, dpR>() { // from class: com.netflix.mediaclient.service.browse.data.RemindMeUpdater$updateRemindMe$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* synthetic */ dpR invoke(aLO<? extends Pair<? extends Boolean, ? extends Status>> alo) {
                        e(alo);
                        return dpR.c;
                    }

                    public final void e(aLO<? extends Pair<Boolean, ? extends Status>> alo) {
                        C8632dsu.c((Object) alo, "");
                        C1767aNm.this.d(z, startSession, drm, alo);
                    }
                });
                return;
            } else if (z) {
                return;
            } else {
                d.e(str, str2, new drM<aLO<? extends Pair<? extends Boolean, ? extends Status>>, dpR>() { // from class: com.netflix.mediaclient.service.browse.data.RemindMeUpdater$updateRemindMe$4
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
                        C1767aNm.this.d(z, startSession, drm, alo);
                    }
                });
                return;
            }
        }
        aLN.a.a(this.b).b(new MutateRemindMeGenericTask(z ? MutateRemindMeGenericTask.Mutation.d : MutateRemindMeGenericTask.Mutation.e, str, videoType, trackingInfoHolder.a()), new drM<aLO<? extends Pair<? extends Boolean, ? extends Status>>, dpR>() { // from class: com.netflix.mediaclient.service.browse.data.RemindMeUpdater$updateRemindMe$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(aLO<? extends Pair<? extends Boolean, ? extends Status>> alo) {
                d(alo);
                return dpR.c;
            }

            public final void d(aLO<? extends Pair<Boolean, ? extends Status>> alo) {
                C8632dsu.c((Object) alo, "");
                C1767aNm.e.getLogTag();
                C1767aNm.this.d(z, startSession, drm, alo);
            }
        });
    }
}
