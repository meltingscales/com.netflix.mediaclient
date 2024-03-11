package o;

import android.app.Activity;
import android.content.DialogInterface;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AlertDialog;
import androidx.lifecycle.LifecycleOwnerKt;
import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.CommandValue;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.cl.model.event.session.Presentation;
import com.netflix.cl.model.event.session.action.RemoveFromViewingActivity;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.clutils.PlayContextImp;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.netflixactivity.api.NetflixActivityBase;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.ui.common.PlaybackLauncher;
import com.netflix.mediaclient.ui.profiles.MyNetflixRecentlyWatchedEventHandler$onRemoveFromRowClicked$1$1;
import com.netflix.mediaclient.ui.profiles.RecentlyWatchedVideoInfo;
import dagger.Lazy;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedFactory;
import dagger.assisted.AssistedInject;
import kotlin.jvm.internal.Ref;
import o.C5855cKw;
import o.InterfaceC3643bFl;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class cMC {
    private final dwQ a;
    private final Activity b;
    private final Lazy<InterfaceC3643bFl> c;
    private final Lazy<PlaybackLauncher> d;
    private final Lazy<cMK> e;
    private final Lazy<InterfaceC1126Pr> g;
    private final RecentlyWatchedVideoInfo j;

    @AssistedFactory
    /* loaded from: classes4.dex */
    public interface b {
        cMC c(RecentlyWatchedVideoInfo recentlyWatchedVideoInfo);
    }

    @AssistedInject
    public cMC(@Assisted RecentlyWatchedVideoInfo recentlyWatchedVideoInfo, Lazy<PlaybackLauncher> lazy, Lazy<InterfaceC1126Pr> lazy2, Lazy<InterfaceC3643bFl> lazy3, Activity activity, Lazy<cMK> lazy4, dwQ dwq) {
        C8632dsu.c((Object) recentlyWatchedVideoInfo, "");
        C8632dsu.c((Object) lazy, "");
        C8632dsu.c((Object) lazy2, "");
        C8632dsu.c((Object) lazy3, "");
        C8632dsu.c((Object) activity, "");
        C8632dsu.c((Object) lazy4, "");
        C8632dsu.c((Object) dwq, "");
        this.j = recentlyWatchedVideoInfo;
        this.d = lazy;
        this.g = lazy2;
        this.c = lazy3;
        this.b = activity;
        this.e = lazy4;
        this.a = dwq;
    }

    public final void c() {
        PlaybackLauncher playbackLauncher = this.d.get();
        C8632dsu.a(playbackLauncher, "");
        PlaybackLauncher playbackLauncher2 = playbackLauncher;
        String f = this.j.f();
        VideoType h = this.j.h();
        PlayContextImp b2 = TrackingInfoHolder.b(this.j.d(), false, 1, null);
        Activity activity = this.b;
        C8632dsu.d(activity);
        PlaybackLauncher.b.e(playbackLauncher2, f, h, b2, null, (NetflixActivityBase) activity, null, 40, null);
    }

    public final void a() {
        d();
    }

    public final void e() {
        InterfaceC3643bFl interfaceC3643bFl = this.c.get();
        C8632dsu.a(interfaceC3643bFl, "");
        InterfaceC3643bFl.c.a(interfaceC3643bFl, this.b, this.j.h() == VideoType.EPISODE ? VideoType.SHOW : this.j.h(), this.j.c(), this.j.i(), this.j.d(), "recently_watched", null, 64, null);
    }

    public final void b() {
        if (this.j.h() == VideoType.EPISODE) {
            this.g.get().e(this.j.f(), this.j.h(), this.j.b(), this.j.e());
        } else {
            this.g.get().b(this.j.f(), this.j.h(), this.j.i());
        }
    }

    private final void d() {
        TrackingInfo c = this.j.d().c((JSONObject) null);
        Logger logger = Logger.INSTANCE;
        final Long startSession = logger.startSession(new Presentation(AppView.removeFromRowConfirmation, c));
        final Long startSession2 = logger.startSession(new RemoveFromViewingActivity(AppView.removeFromViewingActivityButton, AppView.removeFromViewingActivityDialog, CommandValue.RemoveFromViewingActivityCommand, c));
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        new AlertDialog.Builder(this.b).setTitle(C5855cKw.i.n).setMessage(C1333Xq.d(C5855cKw.i.l).d(SignupConstants.Field.VIDEO_TITLE, this.j.i()).c()).setPositiveButton(C5855cKw.i.k, new DialogInterface.OnClickListener() { // from class: o.cMD
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                cMC.c(Ref.BooleanRef.this, this, startSession2, startSession, dialogInterface, i);
            }
        }).setNegativeButton(17039360, new DialogInterface.OnClickListener() { // from class: o.cMB
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                cMC.b(Ref.BooleanRef.this, startSession2, startSession, dialogInterface, i);
            }
        }).setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: o.cMA
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                cMC.a(Ref.BooleanRef.this, startSession2, startSession, dialogInterface);
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Ref.BooleanRef booleanRef, cMC cmc, Long l, Long l2, DialogInterface dialogInterface, int i) {
        C8632dsu.c((Object) booleanRef, "");
        C8632dsu.c((Object) cmc, "");
        booleanRef.a = true;
        Activity activity = cmc.b;
        C8632dsu.d(activity);
        C8737dwr.c(LifecycleOwnerKt.getLifecycleScope((ComponentActivity) activity), cmc.a, null, new MyNetflixRecentlyWatchedEventHandler$onRemoveFromRowClicked$1$1(cmc, l, l2, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Ref.BooleanRef booleanRef, Long l, Long l2, DialogInterface dialogInterface, int i) {
        C8632dsu.c((Object) booleanRef, "");
        booleanRef.a = true;
        Logger logger = Logger.INSTANCE;
        logger.cancelSession(l);
        logger.endSession(l2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Ref.BooleanRef booleanRef, Long l, Long l2, DialogInterface dialogInterface) {
        C8632dsu.c((Object) booleanRef, "");
        if (booleanRef.a) {
            return;
        }
        Logger logger = Logger.INSTANCE;
        logger.cancelSession(l);
        logger.endSession(l2);
    }
}
