package com.netflix.mediaclient.ui.notifications;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.cl.model.context.DeepLinkInput;
import com.netflix.cl.model.event.session.Focus;
import com.netflix.cl.model.event.session.Presentation;
import com.netflix.cl.model.event.session.command.Command;
import com.netflix.cl.model.event.session.command.PlayCommand;
import com.netflix.cl.model.event.session.command.ViewDetailsCommand;
import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.acquisition.screens.onRamp.OnRampFragment;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.android.fragment.NetflixFrag;
import com.netflix.mediaclient.android.widget.NetflixActionBar;
import com.netflix.mediaclient.clutils.CLv2Utils;
import com.netflix.mediaclient.clutils.PlayContextImp;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.service.falkor.NotificationsListStatus;
import com.netflix.mediaclient.service.pushnotification.Payload;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.servicemgr.interface_.NotificationSummaryItem;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.ui.R;
import com.netflix.mediaclient.ui.notifications.NotificationsFrag;
import com.netflix.mediaclient.ui.notifications.multititle.MultiTitleNotificationsActivity;
import com.netflix.mediaclient.ui.player.PlayerExtras;
import com.netflix.mediaclient.util.PlayContext;
import com.netflix.model.leafs.social.NotificationsListSummary;
import com.netflix.model.leafs.social.multititle.NotificationLandingPage;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import o.AbstractC5164btb;
import o.AbstractC7135cqW;
import o.C1044Mm;
import o.C1588aGw;
import o.C1596aHd;
import o.C5087bsD;
import o.C7068cpI;
import o.C7085cpZ;
import o.C7142cqd;
import o.C8054ddD;
import o.C8119deP;
import o.C8153dex;
import o.C8168dfL;
import o.C8187dfe;
import o.C9870yD;
import o.InterfaceC1078Nw;
import o.InterfaceC1598aHf;
import o.InterfaceC3643bFl;
import o.InterfaceC7081cpV;
import o.InterfaceC7141cqc;
import o.SS;
import o.bDI;
import o.bEX;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class NotificationsFrag extends NetflixFrag implements InterfaceC7141cqc {
    private static int A = 1;
    private static byte e$ss2$7719 = 24;
    private static int y;
    protected SS b;
    protected NotificationsListSummary e;
    private boolean k;
    private c l;
    private boolean m;
    @Inject
    public bDI playerUI;
    private boolean r;
    private InterfaceC7081cpV s;
    private boolean u;
    private Long v;
    private boolean w;
    public boolean n = true;
    protected final Map<String, Long> j = new HashMap();
    private boolean t = true;
    private final Set<NotificationSummaryItem> q = new HashSet();
    private boolean p = true;

    /* renamed from: o  reason: collision with root package name */
    protected NotificationsListStatus f13295o = NotificationsListStatus.a;
    private final BroadcastReceiver x = new BroadcastReceiver() { // from class: com.netflix.mediaclient.ui.notifications.NotificationsFrag.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            NotificationsFrag.this.f13295o = C8119deP.e(intent, "NotificationsFrag");
            SS ss = NotificationsFrag.this.b;
            if (ss != null && ss.getFirstVisiblePosition() == 0) {
                NotificationsFrag.this.U();
            } else {
                NotificationsFrag.this.u = true;
            }
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ JSONObject a(JSONObject jSONObject) {
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ JSONObject c(JSONObject jSONObject) {
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ JSONObject h(JSONObject jSONObject) {
        return jSONObject;
    }

    protected int F() {
        return 20;
    }

    protected int I() {
        return C7142cqd.a.l;
    }

    protected boolean L() {
        return false;
    }

    protected boolean O() {
        return true;
    }

    protected boolean R() {
        return false;
    }

    protected boolean a() {
        return true;
    }

    @Override // o.InterfaceC1077Nv
    public boolean isLoadingData() {
        return this.p;
    }

    @Override // o.InterfaceC7141cqc
    public void b(InterfaceC7081cpV interfaceC7081cpV) {
        this.s = interfaceC7081cpV;
        if (this.p) {
            return;
        }
        S();
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null && bundle.containsKey("notifications_list")) {
            this.t = bundle.getBoolean("has_load_more_list");
            this.e = (NotificationsListSummary) bundle.getParcelable("notifications_list");
            C8119deP.a(bundle.getParcelableArray("notifications_list_to_be_read"), this.q);
            this.w = bundle.getBoolean("were_notifications_fetched");
            this.f13295o = (NotificationsListStatus) bundle.getParcelable("notification_list_status");
            this.n = bundle.getBoolean("extra_show_notifications");
            S();
        }
        X();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C1044Mm.b("NotificationsFrag", "Creating new frag view...");
        this.k = true;
        View inflate = layoutInflater.inflate(C7142cqd.a.k, viewGroup, false);
        SS ss = (SS) inflate.findViewById(C7142cqd.b.v);
        this.b = ss;
        ss.setItemsCanFocus(true);
        this.b.setAsStatic(L());
        T();
        return inflate;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, o.InterfaceC5091bsH
    public void onManagerReady(ServiceManager serviceManager, Status status) {
        super.onManagerReady(serviceManager, status);
        if (R()) {
            return;
        }
        T();
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public void e(View view) {
        if (C8153dex.B()) {
            C9870yD.d(view, 1, this.i + ((NetflixFrag) this).d);
            C9870yD.d(view, 3, this.h);
        }
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public boolean bD_() {
        int i = 2 % 2;
        int i2 = y + 89;
        A = i2 % 128;
        int i3 = i2 % 2;
        NetflixActivity by_ = by_();
        NetflixActionBar netflixActionBar = by_.getNetflixActionBar();
        if (netflixActionBar != null) {
            int i4 = A + 41;
            y = i4 % 128;
            int i5 = i4 % 2;
            NetflixActionBar.b.C0051b i6 = by_.getActionBarStateBuilder().h(true).f(true).i(true);
            String string = by_.getString(R.o.hH);
            if (string.startsWith("'!#+")) {
                int i7 = y + 45;
                A = i7 % 128;
                int i8 = i7 % 2;
                String substring = string.substring(4);
                Object[] objArr = new Object[1];
                z(substring, objArr);
                string = ((String) objArr[0]).intern();
            }
            netflixActionBar.c(i6.e((CharSequence) string).c());
            return true;
        }
        return false;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.e != null) {
            bundle.putBoolean("has_load_more_list", Q());
            bundle.putParcelable("notifications_list", this.e);
            Set<NotificationSummaryItem> set = this.q;
            bundle.putParcelableArray("notifications_list_to_be_read", (Parcelable[]) set.toArray(new NotificationSummaryItem[set.size()]));
            bundle.putBoolean("were_notifications_fetched", this.w);
            bundle.putParcelable("notification_list_status", this.f13295o);
            bundle.putBoolean("extra_show_notifications", this.n);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean Q() {
        return a() && this.t;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        Y();
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        V();
        b(true);
    }

    @Override // o.InterfaceC7141cqc
    public void e(String str) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("notificationCnt", J());
            jSONObject.put("unreadNotificationCnt", M());
        } catch (JSONException e) {
            C1044Mm.j("NotificationsFrag", "could not put data into clv2Model for notifications logging %s", e);
        }
        Long l = this.v;
        if (l == null) {
            this.v = Logger.INSTANCE.startSession(new Presentation(AppView.notificationSelector, new TrackingInfo() { // from class: o.cpL
                @Override // com.netflix.cl.model.JsonSerializer
                public final JSONObject toJSONObject() {
                    JSONObject h;
                    h = NotificationsFrag.h(JSONObject.this);
                    return h;
                }
            }));
        } else {
            InterfaceC1598aHf.a(new C1596aHd(String.format(Locale.US, "%s: notifications %s unended presentation started session with id: %d", "NotificationsFrag", str, l)).b(false));
        }
    }

    public void b(boolean z) {
        if (C8153dex.B()) {
            if (z && this.v == null) {
                e("NotificationsFrag");
                a(true);
            } else if (z || this.v == null) {
            } else {
                a(false);
                d("NotificationsFrag");
            }
        }
    }

    @Override // o.InterfaceC7141cqc
    public void d(String str) {
        Long l = this.v;
        if (l == null) {
            InterfaceC1598aHf.a(new C1596aHd(String.format(Locale.US, "%s: notifications %s is null for presentation ended session", "NotificationsFrag", str)).b(false));
            return;
        }
        Logger.INSTANCE.endSession(l);
        this.v = null;
    }

    @Override // o.InterfaceC7141cqc
    public void a(boolean z) {
        for (int i = 0; i < W(); i++) {
            NotificationSummaryItem notificationSummaryItem = this.e.notifications().get(i);
            if (z) {
                JSONObject jSONObject = new JSONObject();
                final JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject.put("position", i);
                    jSONObject.put("read", notificationSummaryItem.read());
                    jSONObject.put(Payload.PARAM_MESSAGE_GUID, notificationSummaryItem.messageGuid());
                    jSONObject.put("titleId", notificationSummaryItem.videoId());
                    jSONObject2.put("position", i);
                    jSONObject2.put("notificationState", notificationSummaryItem.read() ? "read" : "unread");
                    jSONObject2.put(Payload.PARAM_MESSAGE_GUID, notificationSummaryItem.messageGuid());
                    jSONObject2.put("titleId", notificationSummaryItem.videoId());
                    AppView appView = AppView.notificationItem;
                    CLv2Utils.c(false, appView, new TrackingInfo() { // from class: o.cpM
                        @Override // com.netflix.cl.model.JsonSerializer
                        public final JSONObject toJSONObject() {
                            JSONObject c2;
                            c2 = NotificationsFrag.c(JSONObject.this);
                            return c2;
                        }
                    }, null, false);
                    if (this.j.get(notificationSummaryItem.messageGuid()) == null) {
                        this.j.put(notificationSummaryItem.messageGuid(), Logger.INSTANCE.startSession(new Presentation(appView, new TrackingInfo() { // from class: o.cpN
                            @Override // com.netflix.cl.model.JsonSerializer
                            public final JSONObject toJSONObject() {
                                JSONObject a;
                                a = NotificationsFrag.a(JSONObject.this);
                                return a;
                            }
                        })));
                    }
                } catch (JSONException e) {
                    InterfaceC1598aHf.e(String.format("%s: could not put data into model: %s", "NotificationsFrag", jSONObject.toString()), e);
                }
            } else {
                Long l = this.j.get(notificationSummaryItem.messageGuid());
                if (l == null) {
                    InterfaceC1598aHf.a(new C1596aHd(String.format("%s: Presentation sessionId is null for notification with id %s and title %s", "NotificationsFrag", notificationSummaryItem.messageGuid(), notificationSummaryItem.videoTitle())).b(false));
                } else {
                    Logger.INSTANCE.endSession(l);
                    this.j.put(notificationSummaryItem.messageGuid(), null);
                }
            }
        }
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        b(false);
    }

    @Override // o.InterfaceC7141cqc
    public void P() {
        U();
    }

    private void T() {
        if (!this.k) {
            C1044Mm.b("NotificationsFrag", "Can't complete init - views not created");
        } else if (bl_() == null) {
            C1044Mm.b("NotificationsFrag", "Can't complete init - manager not ready");
        } else {
            c cVar = new c();
            this.l = cVar;
            this.b.setAdapter((ListAdapter) cVar);
            if (this.e == null) {
                U();
                return;
            }
            this.p = false;
            this.l.b("completeInitIfPossible");
        }
    }

    protected int G() {
        if (this.n && e()) {
            return Q() ? this.e.notifications().size() + 1 : this.e.notifications().size();
        }
        return 0;
    }

    void S() {
        if (K()) {
            this.n = true;
        }
        InterfaceC7081cpV interfaceC7081cpV = this.s;
        if (interfaceC7081cpV != null) {
            interfaceC7081cpV.d(e());
        }
    }

    protected boolean K() {
        List<NotificationSummaryItem> notifications;
        NotificationsListSummary notificationsListSummary = this.e;
        if (notificationsListSummary != null && (notifications = notificationsListSummary.notifications()) != null) {
            for (NotificationSummaryItem notificationSummaryItem : notifications) {
                if (!notificationSummaryItem.read()) {
                    return true;
                }
            }
        }
        return false;
    }

    public int M() {
        NotificationsListSummary notificationsListSummary = this.e;
        int i = 0;
        if (notificationsListSummary != null && notificationsListSummary.notifications() != null) {
            for (NotificationSummaryItem notificationSummaryItem : this.e.notifications()) {
                if (!notificationSummaryItem.read()) {
                    i++;
                }
            }
        }
        return i;
    }

    public int J() {
        NotificationsListSummary notificationsListSummary = this.e;
        if (notificationsListSummary == null || notificationsListSummary.notifications() == null) {
            return 0;
        }
        return this.e.notifications().size();
    }

    @Override // o.InterfaceC7141cqc
    public void N() {
        NotificationsListSummary notificationsListSummary = this.e;
        if (notificationsListSummary == null || notificationsListSummary.notifications() == null || this.e.notifications().size() <= 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        int W = W();
        for (int i = 0; i < W; i++) {
            NotificationSummaryItem notificationSummaryItem = this.e.notifications().get(i);
            if (!notificationSummaryItem.read() && notificationSummaryItem.eventGuid() != null) {
                arrayList.add(notificationSummaryItem.eventGuid());
            }
        }
        if (arrayList.size() <= 0 || bl_() == null || bl_().j() == null) {
            return;
        }
        bl_().j().c(arrayList, new b());
    }

    private int W() {
        NotificationsListSummary notificationsListSummary = this.e;
        if (notificationsListSummary == null || notificationsListSummary.notifications() == null) {
            return 0;
        }
        return F() < this.e.notifications().size() ? F() : this.e.notifications().size();
    }

    @Override // o.InterfaceC7141cqc
    public boolean e() {
        NotificationsListSummary notificationsListSummary = this.e;
        return (notificationsListSummary == null || notificationsListSummary.notifications() == null || this.e.notifications().size() <= 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c extends BaseAdapter {
        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        private c() {
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetInvalidated() {
            SS ss = NotificationsFrag.this.b;
            if (ss != null) {
                ss.setLastNotifiedCount(getCount(), "notifyDataSetInvalidated");
            }
            super.notifyDataSetInvalidated();
        }

        public void b(String str) {
            SS ss = NotificationsFrag.this.b;
            if (ss != null) {
                ss.setLastNotifiedCount(getCount(), str);
            }
            super.notifyDataSetChanged();
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            b("notifyDataSetChanged");
        }

        @Override // android.widget.Adapter
        public int getCount() {
            if (!NotificationsFrag.this.w || NotificationsFrag.this.r) {
                return 0;
            }
            return NotificationsFrag.this.G();
        }

        @Override // android.widget.Adapter
        /* renamed from: c */
        public NotificationSummaryItem getItem(int i) {
            if (!NotificationsFrag.this.e() || i > NotificationsFrag.this.e.notifications().size() - 1) {
                return null;
            }
            return NotificationsFrag.this.e.notifications().get(i);
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            NotificationSummaryItem item = getItem(i);
            AbstractC7135cqW abstractC7135cqW = (AbstractC7135cqW) C7085cpZ.a(item == null ? null : item.getNotificationType());
            if (view == null) {
                view = NotificationsFrag.this.getActivity().getLayoutInflater().inflate(NotificationsFrag.this.I(), viewGroup, false);
                view.setTag(AbstractC7135cqW.c(view));
            }
            C7068cpI c7068cpI = (C7068cpI) view.getTag();
            if (!NotificationsFrag.this.Q() && !NotificationsFrag.this.e()) {
                AbstractC7135cqW.e(c7068cpI, R.o.ca);
                view.setOnClickListener(null);
            } else if (abstractC7135cqW == null) {
                AbstractC7135cqW.e(c7068cpI, R.o.hG);
                view.setOnClickListener(null);
            } else if (NotificationsFrag.this.getActivity() != null && NetflixActivity.getImageLoader(NotificationsFrag.this.getActivity()) != null) {
                abstractC7135cqW.a(c7068cpI, item, NotificationsFrag.this.getActivity());
                e(abstractC7135cqW, item, c7068cpI, view, i);
                if (!item.read()) {
                    NotificationsFrag.this.q.add(item);
                }
                if (i == 0 && NotificationsFrag.this.u) {
                    NotificationsFrag.this.U();
                    NotificationsFrag.this.u = false;
                }
            }
            return view;
        }

        private void e(AbstractC7135cqW abstractC7135cqW, NotificationSummaryItem notificationSummaryItem, C7068cpI c7068cpI, View view, int i) {
            View.OnClickListener e;
            NotificationsFrag notificationsFrag = NotificationsFrag.this;
            if (notificationsFrag.e == null) {
                C1044Mm.d("NotificationsFrag", "Got null notifications list data");
                return;
            }
            NetflixActivity bj_ = notificationsFrag.bj_();
            View a = abstractC7135cqW.a(c7068cpI);
            if (NotificationsFrag.this.O() && a != null) {
                a.setOnClickListener(NotificationsFrag.this.a(notificationSummaryItem, i));
            }
            if (notificationSummaryItem.landingPage() != null && notificationSummaryItem.urlTarget() != null) {
                e = NotificationsFrag.this.d(notificationSummaryItem, bj_);
            } else if (!TextUtils.isEmpty(notificationSummaryItem.urlTarget())) {
                e = NotificationsFrag.this.e(notificationSummaryItem.urlTarget(), notificationSummaryItem, i, bj_);
            } else {
                e = NotificationsFrag.this.e(notificationSummaryItem.imageTarget(), notificationSummaryItem, i);
            }
            C1044Mm.a("NotificationsFrag", "updateAvailableButtons, setting click listener: " + e);
            c7068cpI.g().setOnClickListener(e);
            view.setOnClickListener(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public View.OnClickListener a(final NotificationSummaryItem notificationSummaryItem, int i) {
        final String videoId = notificationSummaryItem.videoId();
        final VideoType videoType = notificationSummaryItem.videoType();
        NotificationsListSummary notificationsListSummary = this.e;
        final PlayContextImp playContextImp = new PlayContextImp(notificationsListSummary.requestId(), notificationsListSummary.playerTrackId(), 0, 0);
        return new View.OnClickListener() { // from class: com.netflix.mediaclient.ui.notifications.NotificationsFrag.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                C1044Mm.a("NotificationsFrag", "on playback item clicked, videoId: " + videoId);
                if (C8168dfL.g(videoId)) {
                    InterfaceC1598aHf.a("SPY-16126 Empty videoID");
                    return;
                }
                NotificationsFrag.this.b(videoId, playContextImp, videoType);
                if (notificationSummaryItem.urlTarget() != null) {
                    NotificationsFrag.this.b(notificationSummaryItem.urlTarget(), new PlayCommand(null));
                } else {
                    InterfaceC1598aHf.a(String.format("%s: Clv2 error - urlTarget null", "NotificationsFrag"));
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, Command command) {
        DeepLinkInput deepLinkInput = new DeepLinkInput(Boolean.FALSE, str, Double.valueOf(1.0d));
        Logger logger = Logger.INSTANCE;
        long addContext = logger.addContext(deepLinkInput);
        CLv2Utils.d(command);
        logger.removeContext(Long.valueOf(addContext));
    }

    private View.OnClickListener d(final NotificationSummaryItem notificationSummaryItem, int i) {
        final String videoId = notificationSummaryItem.videoId();
        final VideoType videoType = notificationSummaryItem.videoType();
        final NotificationsListSummary notificationsListSummary = this.e;
        final String requestId = notificationsListSummary.requestId();
        return new View.OnClickListener() { // from class: com.netflix.mediaclient.ui.notifications.NotificationsFrag.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                NotificationSummaryItem notificationSummaryItem2;
                ServiceManager bl_ = NotificationsFrag.this.bl_();
                C1044Mm.a("NotificationsFrag", "on display item clicked, videoId: " + videoId);
                if (bl_ == null || bl_.j() == null || (notificationSummaryItem2 = notificationSummaryItem) == null || NotificationsFrag.this.e == null) {
                    return;
                }
                if (!notificationSummaryItem2.read() && notificationSummaryItem.eventGuid() != null) {
                    bl_.j().e(notificationSummaryItem.eventGuid(), new b());
                }
                PlayContextImp playContextImp = new PlayContextImp(requestId, notificationsListSummary.mdpTrackId(), 0, 0);
                TrackingInfoHolder d = new TrackingInfoHolder(playContextImp.j()).d(Integer.parseInt(videoId), playContextImp);
                NetflixActivity by_ = NotificationsFrag.this.by_();
                InterfaceC3643bFl.a((Context) by_).b(by_, videoType, videoId, notificationSummaryItem.videoTitle(), d, "SocialNotif", new PlayerExtras());
                if (notificationSummaryItem.urlTarget() != null) {
                    NotificationsFrag.this.b(notificationSummaryItem.urlTarget(), new ViewDetailsCommand());
                } else {
                    InterfaceC1598aHf.a(String.format("%s: Clv2 error - urlTarget null", "NotificationsFrag"));
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public JSONObject e(NotificationSummaryItem notificationSummaryItem, int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            NotificationLandingPage landingPage = notificationSummaryItem.landingPage();
            if (landingPage != null && notificationSummaryItem.trackingInfo() != null) {
                jSONObject = notificationSummaryItem.trackingInfo().toJSONObject();
                jSONObject.put("trackId", landingPage.trackId());
            } else {
                jSONObject.put("trackId", this.e.baseTrackId());
            }
            jSONObject.put("position", i);
            jSONObject.put(Payload.PARAM_MESSAGE_GUID, notificationSummaryItem.messageGuid());
            jSONObject.put("titleId", notificationSummaryItem.videoId());
        } catch (JSONException e) {
            C1044Mm.j("NotificationsFrag", "getModelObject() got an exception", e);
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public View.OnClickListener d(final NotificationSummaryItem notificationSummaryItem, final NetflixActivity netflixActivity) {
        return new View.OnClickListener() { // from class: o.cpO
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NotificationsFrag.d(NotificationSummaryItem.this, netflixActivity, view);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(NotificationSummaryItem notificationSummaryItem, NetflixActivity netflixActivity, View view) {
        NotificationLandingPage landingPage = notificationSummaryItem.landingPage();
        C1044Mm.a("NotificationsFrag", "on multi title item clicked, landing page: " + landingPage);
        if (landingPage == null) {
            return;
        }
        CLv2Utils.INSTANCE.b(new Focus(AppView.notificationItem, CLv2Utils.a(notificationSummaryItem.trackingInfo())), (Command) new ViewDetailsCommand(), true);
        netflixActivity.startActivity(MultiTitleNotificationsActivity.d.a(netflixActivity, landingPage, notificationSummaryItem.trackingInfo()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public View.OnClickListener e(final String str, final NotificationSummaryItem notificationSummaryItem, final int i, final NetflixActivity netflixActivity) {
        final TrackingInfo trackingInfo = new TrackingInfo() { // from class: o.cpR
            @Override // com.netflix.cl.model.JsonSerializer
            public final JSONObject toJSONObject() {
                JSONObject e;
                e = NotificationsFrag.this.e(notificationSummaryItem, i);
                return e;
            }
        };
        return new View.OnClickListener() { // from class: o.cpQ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NotificationsFrag.this.b(str, notificationSummaryItem, netflixActivity, trackingInfo, view);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(String str, NotificationSummaryItem notificationSummaryItem, NetflixActivity netflixActivity, TrackingInfo trackingInfo, View view) {
        C1044Mm.a("NotificationsFrag", "on deep link item clicked, url: " + str);
        if (bl_() != null && bl_().j() != null && notificationSummaryItem.eventGuid() != null) {
            bl_().j().e(notificationSummaryItem.eventGuid(), new b());
        }
        C1588aGw.e(netflixActivity).c(bEX.b.e(new Intent("android.intent.action.VIEW", Uri.parse(str))));
        CLv2Utils.INSTANCE.b(new Focus(AppView.notificationItem, trackingInfo), (Command) new ViewDetailsCommand(), true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b extends AbstractC5164btb {
        b() {
        }

        @Override // o.AbstractC5164btb, o.InterfaceC5094bsK
        public void l(List<NotificationSummaryItem> list, Status status) {
            super.l(list, status);
            if (status.i()) {
                if (C8054ddD.l(NotificationsFrag.this.bj_())) {
                    return;
                }
                NotificationsFrag.this.bj_().getServiceManager().j().c(true);
                return;
            }
            NotificationsListSummary notificationsListSummary = NotificationsFrag.this.e;
            if (notificationsListSummary != null && notificationsListSummary.notifications() != null && list != null) {
                ArrayList arrayList = new ArrayList();
                for (NotificationSummaryItem notificationSummaryItem : NotificationsFrag.this.e.notifications()) {
                    NotificationSummaryItem notificationSummaryItem2 = notificationSummaryItem;
                    for (NotificationSummaryItem notificationSummaryItem3 : list) {
                        if (notificationSummaryItem.eventGuid() != null && notificationSummaryItem3.eventGuid() != null && notificationSummaryItem.eventGuid().equals(notificationSummaryItem3.eventGuid())) {
                            notificationSummaryItem2 = notificationSummaryItem.makeCopy(notificationSummaryItem3.read());
                        }
                    }
                    arrayList.add(notificationSummaryItem2);
                }
                NotificationsFrag notificationsFrag = NotificationsFrag.this;
                notificationsFrag.e = notificationsFrag.e.makeCopy(arrayList);
                if (C8054ddD.l(NotificationsFrag.this.bj_())) {
                    return;
                }
                NotificationsFrag.this.bj_().getServiceManager().j().c(true);
                return;
            }
            InterfaceC1598aHf.a(String.format("%s: mNotifications: %s, notificationsMarkedAsRead: %s", "NotificationsFrag", NotificationsFrag.this.e, list));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public View.OnClickListener e(String str, NotificationSummaryItem notificationSummaryItem, int i) {
        if (str == null) {
            C1044Mm.j("NotificationsFrag", "SPY-8161 - Got null target value");
            InterfaceC1598aHf.a("SPY-8161 - Got null target value");
            return d(notificationSummaryItem, i);
        }
        String upperCase = str.toUpperCase();
        upperCase.hashCode();
        if (upperCase.equals("DISPLAY")) {
            return d(notificationSummaryItem, i);
        }
        if (upperCase.equals("PLAYBACK")) {
            return a(notificationSummaryItem, i);
        }
        String str2 = "SPY-8161 - Got unsupported target value: " + str;
        C1044Mm.j("NotificationsFrag", str2);
        InterfaceC1598aHf.a(str2);
        return d(notificationSummaryItem, i);
    }

    private void V() {
        ServiceManager bl_ = bl_();
        if (bl_ != null) {
            int lastVisiblePosition = this.b.getLastVisiblePosition();
            for (int firstVisiblePosition = this.b.getFirstVisiblePosition(); firstVisiblePosition <= lastVisiblePosition; firstVisiblePosition++) {
                c cVar = this.l;
                if (cVar != null && cVar.getItem(firstVisiblePosition) != null) {
                    NotificationSummaryItem item = this.l.getItem(firstVisiblePosition);
                    bl_.d(item.videoId(), item.inQueue());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, PlayContext playContext, VideoType videoType) {
        startActivity(this.playerUI.a(requireContext(), str, videoType, playContext, new PlayerExtras(-1L)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U() {
        ServiceManager bl_ = bl_();
        if (bl_ != null) {
            this.p = true;
            bl_.j().a(new AnonymousClass3("NotificationsFrag", bl_));
        }
    }

    /* renamed from: com.netflix.mediaclient.ui.notifications.NotificationsFrag$3  reason: invalid class name */
    /* loaded from: classes4.dex */
    public class AnonymousClass3 extends C5087bsD {
        final /* synthetic */ ServiceManager d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(String str, ServiceManager serviceManager) {
            super(str);
            this.d = serviceManager;
        }

        @Override // o.C5087bsD, o.InterfaceC5094bsK
        public void d(NotificationsListSummary notificationsListSummary, Status status) {
            super.d(notificationsListSummary, status);
            NotificationsFrag.this.d(InterfaceC1078Nw.aJ);
            if (notificationsListSummary == null || notificationsListSummary.notifications() == null) {
                InterfaceC1598aHf.a(new C1596aHd(String.format("%s: NotificationsListSummary is returning %s", "NotificationsFrag", notificationsListSummary)).b(false));
                return;
            }
            List<NotificationSummaryItem> notifications = notificationsListSummary.notifications();
            if (NotificationsFrag.this.b(status)) {
                return;
            }
            NotificationsFrag.this.t = notifications != null && notifications.size() == NotificationsFrag.this.F();
            if (NotificationsFrag.this.F() < notifications.size()) {
                NotificationsFrag notificationsFrag = NotificationsFrag.this;
                notificationsFrag.e = notificationsListSummary.makeCopy(notifications.subList(0, notificationsFrag.F()));
            } else {
                NotificationsFrag.this.e = notificationsListSummary;
            }
            NotificationsFrag.this.S();
            if (!NotificationsFrag.this.w) {
                this.d.j().c(false);
                NotificationsFrag.this.w = true;
            }
            if (NotificationsFrag.this.l != null) {
                NotificationsFrag.this.l.b("fetchNotificationsList.onNotificationsListFetched");
            }
            if (NotificationsFrag.this.F() == 20) {
                C8187dfe.a(new Runnable() { // from class: o.cpT
                    @Override // java.lang.Runnable
                    public final void run() {
                        NotificationsFrag.AnonymousClass3.this.d();
                    }
                }, OnRampFragment.ARTIFICIAL_PERSONALIZATION_WAIT_TIME);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d() {
            if (C8054ddD.l(NotificationsFrag.this.getActivity())) {
                return;
            }
            NotificationsFrag.this.N();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(Status status) {
        this.p = false;
        if (status.c() != StatusCode.NETWORK_ERROR) {
            this.r = false;
            return false;
        }
        this.r = true;
        c cVar = this.l;
        if (cVar != null) {
            cVar.b("checkForNetworkError " + this.r);
        }
        return true;
    }

    private void X() {
        if (this.m) {
            return;
        }
        this.m = true;
        LocalBroadcastManager.getInstance(getActivity()).registerReceiver(this.x, new IntentFilter("com.netflix.mediaclient.intent.action.BA_IRIS_NOTIFICATION_LIST_UPDATED"));
    }

    private void Y() {
        if (this.m) {
            LocalBroadcastManager.getInstance(getActivity()).unregisterReceiver(this.x);
            this.m = false;
        }
    }

    private void z(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$7719);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
