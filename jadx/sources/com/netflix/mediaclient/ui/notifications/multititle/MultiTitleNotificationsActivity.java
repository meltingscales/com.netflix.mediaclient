package com.netflix.mediaclient.ui.notifications.multititle;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.cl.model.event.session.Focus;
import com.netflix.cl.model.event.session.command.Command;
import com.netflix.cl.model.event.session.command.ViewDetailsCommand;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.android.widget.NetflixActionBar;
import com.netflix.mediaclient.clutils.CLv2Utils;
import com.netflix.mediaclient.clutils.PlayContextImp;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.R;
import com.netflix.mediaclient.ui.experience.BrowseExperience;
import com.netflix.mediaclient.ui.notifications.multititle.MultiTitleNotificationsActivity;
import com.netflix.mediaclient.util.PlayContext;
import com.netflix.model.leafs.social.UserNotificationLandingTrackingInfo;
import com.netflix.model.leafs.social.multititle.NotificationLandingPage;
import com.netflix.model.leafs.social.multititle.NotificationModule;
import com.netflix.model.leafs.social.multititle.NotificationModuleList;
import com.netflix.model.leafs.social.multititle.NotificationRatingInfoModule;
import com.netflix.model.leafs.social.multititle.NotificationTemplate;
import dagger.hilt.android.AndroidEntryPoint;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import o.AbstractActivityC7163cqy;
import o.AbstractC7118cqF;
import o.ActivityC7126cqN;
import o.ActivityC7127cqO;
import o.ActivityC7128cqP;
import o.C6491ceM;
import o.C7115cqC;
import o.C8054ddD;
import o.C8150deu;
import o.C8153dex;
import o.C8263dhA;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC5091bsH;
import o.InterfaceC6068cSu;
import o.InterfaceC8554dpx;
import o.aIA;
import o.bDG;
import o.dpB;
import o.drO;
import org.json.JSONObject;

@aIA
@AndroidEntryPoint
/* loaded from: classes4.dex */
public abstract class MultiTitleNotificationsActivity extends AbstractActivityC7163cqy implements bDG {
    public static final e d = new e(null);
    private UserNotificationLandingTrackingInfo a;
    private NotificationLandingPage b;
    private final InterfaceC8554dpx c;
    @Inject
    public InterfaceC6068cSu search;

    public void c(NotificationLandingPage notificationLandingPage) {
        this.b = notificationLandingPage;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean canShowDownloadProgressBar() {
        return true;
    }

    public NotificationLandingPage m() {
        return this.b;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean showSettingsInMenu() {
        return false;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean showSignOutInMenu() {
        return false;
    }

    public MultiTitleNotificationsActivity() {
        InterfaceC8554dpx b2;
        b2 = dpB.b(new drO<C7115cqC>() { // from class: com.netflix.mediaclient.ui.notifications.multititle.MultiTitleNotificationsActivity$viewModel$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: b */
            public final C7115cqC invoke() {
                return (C7115cqC) new ViewModelProvider(MultiTitleNotificationsActivity.this).get(C7115cqC.class);
            }
        });
        this.c = b2;
    }

    public final C7115cqC l() {
        return (C7115cqC) this.c.getValue();
    }

    public final InterfaceC6068cSu o() {
        InterfaceC6068cSu interfaceC6068cSu = this.search;
        if (interfaceC6068cSu != null) {
            return interfaceC6068cSu;
        }
        C8632dsu.d("");
        return null;
    }

    /* loaded from: classes4.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        public final Intent a(Context context, NotificationLandingPage notificationLandingPage, UserNotificationLandingTrackingInfo userNotificationLandingTrackingInfo) {
            C8632dsu.c((Object) context, "");
            C8632dsu.c((Object) notificationLandingPage, "");
            return c(this, context, notificationLandingPage, userNotificationLandingTrackingInfo, null, false, 24, null);
        }

        private e() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Intent c(e eVar, Context context, NotificationLandingPage notificationLandingPage, UserNotificationLandingTrackingInfo userNotificationLandingTrackingInfo, HashMap hashMap, boolean z, int i, Object obj) {
            HashMap<String, String> hashMap2 = hashMap;
            if ((i & 8) != 0) {
                hashMap2 = null;
            }
            HashMap<String, String> hashMap3 = hashMap2;
            if ((i & 16) != 0) {
                z = false;
            }
            return eVar.b(context, notificationLandingPage, userNotificationLandingTrackingInfo, hashMap3, z);
        }

        public final Intent b(Context context, NotificationLandingPage notificationLandingPage, UserNotificationLandingTrackingInfo userNotificationLandingTrackingInfo, HashMap<String, String> hashMap, boolean z) {
            C8632dsu.c((Object) context, "");
            C8632dsu.c((Object) notificationLandingPage, "");
            Intent intent = new Intent(context, b(z));
            intent.putExtra("landingPage", notificationLandingPage);
            if (userNotificationLandingTrackingInfo != null) {
                intent.putExtra("trackingInfo", userNotificationLandingTrackingInfo);
            }
            if (hashMap != null) {
                intent.putExtra("notificationParams", hashMap);
            }
            return intent;
        }

        private final Class<? extends MultiTitleNotificationsActivity> b(boolean z) {
            return C8150deu.h() ? z ? ActivityC7127cqO.class : ActivityC7128cqP.class : ActivityC7126cqN.class;
        }
    }

    @Override // o.MO, com.netflix.mediaclient.android.activity.NetflixActivity, com.netflix.mediaclient.netflixactivity.api.NetflixActivityBase, o.AbstractActivityC1635aIp, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        NetflixActionBar netflixActionBar;
        super.onCreate(bundle);
        NetflixActionBar netflixActionBar2 = getNetflixActionBar();
        if (netflixActionBar2 != null) {
            netflixActionBar2.c(getActionBarStateBuilder().b(false).e("").c());
        }
        if (t() && (netflixActionBar = getNetflixActionBar()) != null) {
            netflixActionBar.a(0);
        }
        c((NotificationLandingPage) super.getIntent().getParcelableExtra("landingPage"));
        this.a = (UserNotificationLandingTrackingInfo) super.getIntent().getParcelableExtra("trackingInfo");
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public void onCreateOptionsMenu(Menu menu, Menu menu2) {
        C8632dsu.c((Object) menu, "");
        C6491ceM.c(this, menu);
        if (C8153dex.Q()) {
            return;
        }
        o().a(menu).setVisible(true);
    }

    /* loaded from: classes4.dex */
    public static final class b implements InterfaceC5091bsH {
        final /* synthetic */ MultiTitleNotificationsActivity e;

        b(MultiTitleNotificationsActivity multiTitleNotificationsActivity) {
            this.e = multiTitleNotificationsActivity;
        }

        @Override // o.InterfaceC5091bsH
        public void onManagerReady(ServiceManager serviceManager, Status status) {
            C8632dsu.c((Object) serviceManager, "");
            C8632dsu.c((Object) status, "");
            if (C8054ddD.l(MultiTitleNotificationsActivity.this)) {
                return;
            }
            NotificationLandingPage m = MultiTitleNotificationsActivity.this.m();
            if (m != null) {
                MultiTitleNotificationsActivity multiTitleNotificationsActivity = MultiTitleNotificationsActivity.this;
                multiTitleNotificationsActivity.l().a(m, multiTitleNotificationsActivity.k());
            }
            MutableLiveData<List<AbstractC7118cqF>> a = MultiTitleNotificationsActivity.this.l().a();
            MultiTitleNotificationsActivity multiTitleNotificationsActivity2 = this.e;
            final MultiTitleNotificationsActivity multiTitleNotificationsActivity3 = MultiTitleNotificationsActivity.this;
            a.observe(multiTitleNotificationsActivity2, new Observer() { // from class: o.cqB
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    MultiTitleNotificationsActivity.b.a(MultiTitleNotificationsActivity.this, (List) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(MultiTitleNotificationsActivity multiTitleNotificationsActivity, List list) {
            C8632dsu.c((Object) multiTitleNotificationsActivity, "");
            if (multiTitleNotificationsActivity.h() instanceof MultiTitleNotificationsFrag) {
                Fragment h = multiTitleNotificationsActivity.h();
                C8632dsu.d(h);
                ((MultiTitleNotificationsFrag) h).d(list);
            }
        }

        @Override // o.InterfaceC5091bsH
        public void onManagerUnavailable(ServiceManager serviceManager, Status status) {
            C8632dsu.c((Object) status, "");
            if (C8054ddD.l(MultiTitleNotificationsActivity.this) || !(MultiTitleNotificationsActivity.this.h() instanceof MultiTitleNotificationsFrag)) {
                return;
            }
            Fragment h = MultiTitleNotificationsActivity.this.h();
            C8632dsu.d(h);
            ((MultiTitleNotificationsFrag) h).onManagerUnavailable(serviceManager, status);
        }
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public InterfaceC5091bsH createManagerStatusListener() {
        return new b(this);
    }

    @Override // o.MO
    public int j() {
        return t() ? R.i.ad : R.i.af;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public void setTheme() {
        if (t()) {
            if (BrowseExperience.e()) {
                setTheme(R.l.t);
                return;
            } else {
                setTheme(R.l.l);
                return;
            }
        }
        super.setTheme();
    }

    @Override // o.MO
    public Fragment d() {
        return new MultiTitleNotificationsFrag();
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public AppView getUiScreen() {
        return AppView.notificationLanding;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public C8263dhA getDataContext() {
        UserNotificationLandingTrackingInfo userNotificationLandingTrackingInfo = this.a;
        if (userNotificationLandingTrackingInfo != null) {
            C8263dhA c8263dhA = new C8263dhA();
            c8263dhA.e(userNotificationLandingTrackingInfo.toJSONObject().toString());
            return c8263dhA;
        }
        return null;
    }

    @Override // o.bDG
    public PlayContext y_() {
        PlayContext playContext = PlayContextImp.f13167o;
        C8632dsu.a(playContext, "");
        return playContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JSONObject r() {
        return new JSONObject().put("actionType", "dismissButton");
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C8632dsu.c((Object) menuItem, "");
        b(new TrackingInfo() { // from class: o.cqz
            @Override // com.netflix.cl.model.JsonSerializer
            public final JSONObject toJSONObject() {
                JSONObject r;
                r = MultiTitleNotificationsActivity.r();
                return r;
            }
        });
        return super.onOptionsItemSelected(menuItem);
    }

    public void b(TrackingInfo trackingInfo) {
        C8632dsu.c((Object) trackingInfo, "");
        CLv2Utils.INSTANCE.b(new Focus(AppView.notificationLandingItem, trackingInfo), (Command) new ViewDetailsCommand(), true);
    }

    protected final HashMap<String, String> k() {
        Intent intent = getIntent();
        Serializable serializableExtra = intent != null ? intent.getSerializableExtra("notificationParams") : null;
        if (serializableExtra instanceof HashMap) {
            return (HashMap) serializableExtra;
        }
        return null;
    }

    private final boolean t() {
        NotificationModuleList modulesList;
        List<NotificationModule> modules;
        Intent intent = getIntent();
        Boolean bool = null;
        NotificationLandingPage notificationLandingPage = intent != null ? (NotificationLandingPage) intent.getParcelableExtra("landingPage") : null;
        if (!(notificationLandingPage instanceof NotificationLandingPage)) {
            notificationLandingPage = null;
        }
        boolean z = false;
        if (notificationLandingPage == null) {
            return false;
        }
        NotificationTemplate template = notificationLandingPage.template();
        if (template != null && (modulesList = template.modulesList()) != null && (modules = modulesList.modules()) != null) {
            if (!modules.isEmpty()) {
                Iterator<T> it = modules.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((NotificationModule) it.next()) instanceof NotificationRatingInfoModule) {
                        z = true;
                        break;
                    }
                }
            }
            bool = Boolean.valueOf(z);
        }
        return C8632dsu.c(bool, Boolean.TRUE);
    }

    public final void p() {
        if (t() && (h() instanceof MultiTitleNotificationsFrag)) {
            Fragment h = h();
            C8632dsu.d(h);
            ((MultiTitleNotificationsFrag) h).e();
        }
    }
}
