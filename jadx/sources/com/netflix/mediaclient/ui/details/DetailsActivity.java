package com.netflix.mediaclient.ui.details;

import android.content.Intent;
import android.os.Bundle;
import android.util.Base64;
import androidx.fragment.app.Fragment;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.CommandValue;
import com.netflix.cl.model.event.session.Session;
import com.netflix.cl.model.event.session.action.AddToPlaylist;
import com.netflix.cl.model.event.session.action.RemoveFromPlaylist;
import com.netflix.falkor.task.MutateMyListQueueTask;
import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.android.widget.NetflixActionBar;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.clutils.CLv2Utils;
import com.netflix.mediaclient.clutils.EmptyPlayContext;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.service.offline.agent.CreateRequest;
import com.netflix.mediaclient.servicemgr.IClientLogging;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.ui.R;
import com.netflix.mediaclient.ui.details.DetailsActivity;
import com.netflix.mediaclient.util.PlayContext;
import dagger.Lazy;
import dagger.hilt.android.AndroidEntryPoint;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import javax.inject.Inject;
import kotlin.Pair;
import o.C1004Kx;
import o.C1044Mm;
import o.C1180Rt;
import o.C1596aHd;
import o.C3651bFt;
import o.C6907cmE;
import o.C8054ddD;
import o.C8194dfl;
import o.C8263dhA;
import o.C9694vI;
import o.InterfaceC1078Nw;
import o.InterfaceC1598aHf;
import o.InterfaceC5091bsH;
import o.InterfaceC5157btU;
import o.aIA;
import o.aIB;
import o.aLN;
import o.aLO;
import o.aLP;
import o.aLZ;
import o.bDG;
import o.bFK;
import o.dpR;
import o.drM;
import org.chromium.net.NetError;

@aIA
@AndroidEntryPoint
/* loaded from: classes4.dex */
public abstract class DetailsActivity extends bFK implements C1180Rt.d, InterfaceC5091bsH, bDG {
    private static byte e$ss2$3710 = 24;
    private static int f = 1;
    private static int i;
    public String a;
    protected String b;
    private DetailsActivityAction c;
    private ServiceManager g;
    private boolean h;
    private String j;
    @Inject
    public Lazy<C3651bFt> remindMeDeeplinkHandler;
    public int e = AppView.UNKNOWN.ordinal();
    protected PlayContext d = new EmptyPlayContext("DetailsActivity", NetError.ERR_INVALID_HTTP_RESPONSE);

    public void b(DetailsActivityAction detailsActivityAction, String str) {
        this.c = detailsActivityAction;
        this.j = str;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean canApplyBrowseExperience() {
        return true;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public InterfaceC5091bsH createManagerStatusListener() {
        return this;
    }

    public void e(String str) {
        this.a = str;
    }

    public String l() {
        return this.j;
    }

    public DetailsActivityAction m() {
        return this.c;
    }

    public String o() {
        return this.a;
    }

    public abstract VideoType p();

    @Override // o.bDG
    public PlayContext y_() {
        return this.d;
    }

    @Override // o.MO, com.netflix.mediaclient.android.activity.NetflixActivity, com.netflix.mediaclient.netflixactivity.api.NetflixActivityBase, o.AbstractActivityC1635aIp, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(getClass().getClassLoader());
            this.h = bundle.getBoolean("notification_beacon_sent");
        }
        c();
        this.c = (DetailsActivityAction) getIntent().getSerializableExtra("extra_action");
        this.j = getIntent().getStringExtra("extra_action_token");
        TrackingInfoHolder trackingInfoHolder = (TrackingInfoHolder) getIntent().getParcelableExtra(NetflixActivity.EXTRA_TRACKINGINFO_HOLDER);
        if (trackingInfoHolder != null) {
            d(trackingInfoHolder.d(false));
        } else {
            d((PlayContext) getIntent().getParcelableExtra(NetflixActivity.EXTRA_PLAY_CONTEXT));
        }
        this.e = getIntent().getIntExtra("extra_model_view_id", AppView.UNKNOWN.ordinal());
        setTitle(getResources().getString(R.o.r, getIntent().getStringExtra("extra_video_title")));
        if (s()) {
            if (!this.h) {
                this.h = true;
                C8194dfl.a(getIntent());
            }
            r();
        }
        super.onCreate(bundle);
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public void onConfigureActionBarState(NetflixActionBar.b.C0051b c0051b) {
        c0051b.l(false);
    }

    public Map<String, String> b(IClientLogging.CompletionReason completionReason) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", completionReason.name());
        if (p() != null) {
            hashMap.put("videoType", p().name());
        }
        return hashMap;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("notification_beacon_sent", this.h);
        super.onSaveInstanceState(bundle);
    }

    @Override // o.InterfaceC5091bsH
    public void onManagerReady(ServiceManager serviceManager, Status status) {
        C1044Mm.b("DetailsActivity", "ServiceManager ready");
        this.g = serviceManager;
        Fragment h = h();
        if (h != null) {
            ((InterfaceC5091bsH) h).onManagerReady(serviceManager, status);
        } else {
            InterfaceC1598aHf.a(new C1596aHd("SPY-37550: DetailsActivity primary fragment is null").b(true).b(ErrorType.c));
        }
        Fragment f2 = f();
        if (f2 != null) {
            ((InterfaceC5091bsH) f2).onManagerReady(serviceManager, status);
        }
        if (!this.h) {
            this.h = true;
            C8194dfl.a(getIntent());
        }
        r();
    }

    @Override // o.InterfaceC5091bsH
    public void onManagerUnavailable(ServiceManager serviceManager, Status status) {
        C1044Mm.j("DetailsActivity", "ServiceManager unavailable");
        ((InterfaceC5091bsH) h()).onManagerUnavailable(serviceManager, status);
        Fragment f2 = f();
        if (f2 != null) {
            ((InterfaceC5091bsH) f2).onManagerUnavailable(serviceManager, status);
        }
    }

    protected void c() {
        String stringExtra = getIntent().getStringExtra(NetflixActivity.EXTRA_VIDEO_ID);
        Objects.requireNonNull(stringExtra);
        this.a = stringExtra;
        this.b = getIntent().getStringExtra(NetflixActivity.EXTRA_EPISODE_ID);
    }

    private boolean s() {
        return m() != DetailsActivityAction.c;
    }

    private void r() {
        if (m() == null) {
            C1044Mm.e("DetailsActivity", "No action task specified");
            return;
        }
        if (DetailsActivityAction.a.equals(m())) {
            C1044Mm.e("DetailsActivity", "Action add to my list started");
            e(true);
        } else if (DetailsActivityAction.i.equals(m())) {
            C1044Mm.e("DetailsActivity", "Action remove from my list started");
            e(false);
        } else if (DetailsActivityAction.j.equals(m())) {
            C1044Mm.e("DetailsActivity", "Action remind me started");
            aIB.e.c(this, new aIB.e() { // from class: o.bFc
                @Override // o.aIB.e
                public final void run(ServiceManager serviceManager) {
                    DetailsActivity.this.a(serviceManager);
                }
            });
        } else if (DetailsActivityAction.c.equals(m())) {
            C1044Mm.e("DetailsActivity", "Action download started");
            t();
        } else if (m() == DetailsActivityAction.d) {
            C1044Mm.e("DetailsActivity", "Action like started");
            b(2);
        } else if (m() == DetailsActivityAction.b) {
            C1044Mm.e("DetailsActivity", "Action dislike started");
            b(1);
        } else if (m() == DetailsActivityAction.e) {
            C1044Mm.e("DetailsActivity", "Action love started");
            b(3);
        }
        this.c = null;
        this.j = null;
        getIntent().removeExtra("extra_action");
        getIntent().removeExtra("extra_action_token");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(ServiceManager serviceManager) {
        this.remindMeDeeplinkHandler.get().e(this.a, p());
    }

    public int k() {
        int trackId = this.d.getTrackId();
        if (trackId <= 0) {
            InterfaceC1598aHf.a("DetailsActivity invalid trackid!");
        }
        return trackId;
    }

    private void e(boolean z) {
        Session removeFromPlaylist;
        aLP a = aLN.a.a(C9694vI.a(this));
        PlayContext y_ = y_();
        if (z) {
            removeFromPlaylist = new AddToPlaylist(AppView.addToMyListButton, getUiScreen(), CommandValue.AddToPlaylistCommand, CLv2Utils.INSTANCE.d(this.a, y_));
        } else {
            removeFromPlaylist = new RemoveFromPlaylist(AppView.removeFromMyListButton, getUiScreen(), CommandValue.RemoveFromPlaylistCommand, CLv2Utils.INSTANCE.d(this.a, y_));
        }
        final Long startSession = Logger.INSTANCE.startSession(removeFromPlaylist);
        a.b(new MutateMyListQueueTask(z ? MutateMyListQueueTask.Mutation.a : MutateMyListQueueTask.Mutation.b, o(), p(), y_.a(), this.j, k()), new drM() { // from class: o.bFd
            @Override // o.drM
            public final Object invoke(Object obj) {
                dpR a2;
                a2 = DetailsActivity.this.a(startSession, (aLO) obj);
                return a2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ dpR a(Long l, aLO alo) {
        C1044Mm.d("DetailsActivity", "mutateInQueueTask result %s", alo);
        if (alo instanceof aLZ) {
            new c("DetailsActivity", l).a((Status) ((Pair) ((aLZ) alo).e()).c());
        }
        return dpR.c;
    }

    private void t() {
        C1044Mm.e("DetailsActivity", "handleAddToDownloads");
        VideoType p = p();
        if (p == VideoType.SHOW) {
            p = VideoType.EPISODE;
        }
        this.g.t().b(new CreateRequest(this.b, p, y_()));
    }

    private void b(int i2) {
        C1044Mm.a("DetailsActivity", "handleRateTitle %s", Integer.valueOf(i2));
        if (i2 != 2 && i2 != 1 && i2 != 3) {
            InterfaceC1598aHf.a("Only Thumbs.THUMBS_UP, Thumbs.THUMBS_DOWN, Thumbs.THUMBS_WAY_UP are allowed by deeplink action, got " + i2);
            return;
        }
        aLP a = aLN.a.a(C9694vI.a(this));
        final String stringExtra = getIntent().getStringExtra("extra_video_title");
        a.b(new C1004Kx(o(), i2, k()), new drM() { // from class: o.bFg
            @Override // o.drM
            public final Object invoke(Object obj) {
                dpR a2;
                a2 = DetailsActivity.this.a(stringExtra, (aLO) obj);
                return a2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ dpR a(String str, aLO alo) {
        String string;
        int i2 = 2 % 2;
        if (!(alo instanceof aLZ)) {
            string = getString(R.o.dD);
            if (!(!string.startsWith("'!#+"))) {
                int i3 = f + 125;
                i = i3 % 128;
                int i4 = i3 % 2;
                Object[] objArr = new Object[1];
                z(string.substring(4), objArr);
                string = ((String) objArr[0]).intern();
                int i5 = f + 7;
                i = i5 % 128;
                int i6 = i5 % 2;
            }
        } else {
            int i7 = f + 103;
            i = i7 % 128;
            int i8 = i7 % 2;
            string = getString(R.o.fm, str);
            a((InterfaceC5157btU) ((Pair) ((aLZ) alo).e()).b(), o());
        }
        C8054ddD.a(this, string, 1);
        return dpR.c;
    }

    private void a(InterfaceC5157btU interfaceC5157btU, String str) {
        if (interfaceC5157btU == null) {
            C1044Mm.j("DetailsActivity", "null user rating - can't notify listeners");
            return;
        }
        C1044Mm.a("DetailsActivity", "Broadcasting thumb ratings change, video=%s, rating=%s", str, Integer.valueOf(interfaceC5157btU.getUserThumbRating()));
        LocalBroadcastManager.getInstance(this).sendBroadcast(new Intent("com.netflix.falkor.ACTION_NOTIFY_OF_RATINGS_CHANGE").putExtra(NetflixActivity.EXTRA_VIDEO_ID, str).putExtra("extra_user_thumb_rating", interfaceC5157btU.getUserThumbRating()));
    }

    @Override // o.C1180Rt.d
    public void e() {
        a(h());
        a(f());
    }

    private void a(Fragment fragment) {
        if (fragment == null || !(fragment instanceof C1180Rt.d)) {
            return;
        }
        C1044Mm.b("DetailsActivity", "Found frag to execute retry request...");
        ((C1180Rt.d) fragment).e();
    }

    public void d(PlayContext playContext) {
        if (playContext != null) {
            this.d = playContext;
        } else {
            InterfaceC1598aHf.a("DetailsActivity setting playcontext with null");
        }
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public AppView getUiScreen() {
        return AppView.movieDetails;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public C8263dhA getDataContext() {
        return new C8263dhA(this.d, this.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c extends C6907cmE {
        public c(String str, Long l) {
            super(str, l);
        }

        @Override // o.C6907cmE, o.C5087bsD, o.InterfaceC5094bsK
        public void a(Status status) {
            super.a(status);
            int i = R.o.dx;
            if (InterfaceC1078Nw.aJ == status) {
                i = R.o.fj;
            } else if (status.c() == StatusCode.ALREADY_IN_QUEUE) {
                i = R.o.gN;
            } else if (status.c() == StatusCode.NOT_VALID) {
                i = R.o.dz;
            }
            C8054ddD.c(DetailsActivity.this, i, 1);
        }

        @Override // o.C6907cmE, o.C5087bsD, o.InterfaceC5094bsK
        public void c(Status status) {
            super.c(status);
            int i = R.o.dC;
            if (InterfaceC1078Nw.aJ == status) {
                i = R.o.fn;
            } else if (status.c() == StatusCode.NOT_IN_QUEUE) {
                C1044Mm.j("DetailsActivity", "It was already removed");
                i = R.o.fn;
            }
            C8054ddD.c(DetailsActivity.this, i, 1);
        }
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        if (i2 == 2) {
            this.offlineApi.e(this, i2, strArr, iArr);
        } else {
            super.onRequestPermissionsResult(i2, strArr, iArr);
        }
    }

    private void z(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i2 = 0; i2 < decode.length; i2++) {
            bArr[i2] = (byte) (decode[(decode.length - i2) - 1] ^ e$ss2$3710);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
