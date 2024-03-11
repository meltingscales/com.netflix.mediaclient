package com.netflix.mediaclient.ui.offline.downloadedforyou;

import com.netflix.cl.model.AppView;
import com.netflix.cl.model.event.session.Focus;
import com.netflix.cl.model.event.session.command.ChangeValueCommand;
import com.netflix.cl.model.event.session.command.Command;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.clutils.CLv2Utils;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.model.leafs.originals.interactive.Prefetch;
import java.util.HashMap;
import java.util.List;
import o.AbstractC2914ap;
import o.AbstractC7383cvF;
import o.C1332Xp;
import o.C1645aIz;
import o.C5342bwu;
import o.C7387cvJ;
import o.C7388cvK;
import o.C8126deW;
import o.C8258dgw;
import o.C8569dql;
import o.C8632dsu;
import o.InterfaceC4208baF;
import o.InterfaceC5203buN;
import o.InterfaceC5204buO;
import o.InterfaceC5283bvo;
import o.InterfaceC7221csC;

/* loaded from: classes4.dex */
public final class DownloadedForYouSettingsController extends AbstractC2914ap {
    public static final int $stable = 8;
    private final InterfaceC7221csC downloadsFeatures;
    private boolean isOptedIn;
    private final d listener;
    private final NetflixActivity netflixActivity;
    private final List<InterfaceC5283bvo> profiles;

    /* loaded from: classes4.dex */
    public interface d {
        void a();
    }

    public final InterfaceC7221csC getDownloadsFeatures() {
        return this.downloadsFeatures;
    }

    public final d getListener() {
        return this.listener;
    }

    public final NetflixActivity getNetflixActivity() {
        return this.netflixActivity;
    }

    public final List<InterfaceC5283bvo> getProfiles() {
        return this.profiles;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DownloadedForYouSettingsController(NetflixActivity netflixActivity, List<? extends InterfaceC5283bvo> list, d dVar, InterfaceC7221csC interfaceC7221csC) {
        super(AbstractC2914ap.defaultModelBuildingHandler, ((C5342bwu) C1332Xp.b(C5342bwu.class)).c());
        C8632dsu.c((Object) netflixActivity, "");
        C8632dsu.c((Object) dVar, "");
        C8632dsu.c((Object) interfaceC7221csC, "");
        this.netflixActivity = netflixActivity;
        this.profiles = list;
        this.listener = dVar;
        this.downloadsFeatures = interfaceC7221csC;
        this.isOptedIn = C8258dgw.a.e().j();
    }

    @Override // o.AbstractC2914ap
    public void buildModels() {
        C1645aIz.a(this.netflixActivity, new DownloadedForYouSettingsController$buildModels$1(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void buildProfileItemsForDownloadsForYou() {
        InterfaceC4208baF t;
        InterfaceC4208baF t2;
        ServiceManager c = ServiceManager.c(this.netflixActivity);
        if (c == null || (t = c.t()) == null) {
            return;
        }
        t.t();
        ServiceManager c2 = ServiceManager.c(this.netflixActivity);
        InterfaceC5204buO l = (c2 == null || (t2 = c2.t()) == null) ? null : t2.l();
        InterfaceC5203buN c3 = l != null ? l.c(l.b()) : null;
        if (c3 == null) {
            return;
        }
        C8632dsu.d(c3);
        long j = c3.j();
        long j2 = (long) Prefetch.NANOSECONDS_PER_SECOND;
        float f = (float) (j / j2);
        C8258dgw.a aVar = C8258dgw.a;
        float e = aVar.e().e();
        float j3 = (float) ((c3.j() - c3.c()) / j2);
        boolean z = ((double) (aVar.e().d(t) - aVar.e().e())) > 0.5d;
        List<InterfaceC5283bvo> list = this.profiles;
        if (list != null) {
            int i = 0;
            for (Object obj : list) {
                if (i < 0) {
                    C8569dql.h();
                }
                InterfaceC5283bvo interfaceC5283bvo = (InterfaceC5283bvo) obj;
                C7387cvJ c7387cvJ = new C7387cvJ();
                c7387cvJ.b((CharSequence) interfaceC5283bvo.getProfileGuid());
                c7387cvJ.c((CharSequence) interfaceC5283bvo.getProfileName());
                c7387cvJ.e(interfaceC5283bvo.getAvatarUrl());
                c7387cvJ.a(i >= this.profiles.size() - 1);
                c7387cvJ.d(this.isOptedIn);
                c7387cvJ.e(z);
                C8258dgw e2 = C8258dgw.a.e();
                String profileGuid = interfaceC5283bvo.getProfileGuid();
                C8632dsu.a(profileGuid, "");
                c7387cvJ.d(e2.d(profileGuid));
                c7387cvJ.b((AbstractC7383cvF.c) new a(interfaceC5283bvo, this));
                add(c7387cvJ);
                i++;
            }
        }
        C7388cvK c7388cvK = new C7388cvK();
        c7388cvK.e((CharSequence) "bottom_model");
        c7388cvK.e(j3);
        c7388cvK.c(e);
        c7388cvK.a(f);
        c7388cvK.b(this.isOptedIn);
        add(c7388cvK);
    }

    /* loaded from: classes4.dex */
    public static final class a implements AbstractC7383cvF.c {
        final /* synthetic */ DownloadedForYouSettingsController c;
        final /* synthetic */ InterfaceC5283bvo d;

        a(InterfaceC5283bvo interfaceC5283bvo, DownloadedForYouSettingsController downloadedForYouSettingsController) {
            this.d = interfaceC5283bvo;
            this.c = downloadedForYouSettingsController;
        }

        @Override // o.AbstractC7383cvF.c
        public void a(float f, float f2) {
            String profileGuid;
            C8258dgw e = C8258dgw.a.e();
            String profileGuid2 = this.d.getProfileGuid();
            String str = "";
            C8632dsu.a(profileGuid2, "");
            e.a(profileGuid2, f2);
            if (f <= 0.0f && f2 > 0.0f) {
                this.c.getListener().a();
            }
            HashMap hashMap = new HashMap();
            String profileGuid3 = this.d.getProfileGuid();
            C8632dsu.a(profileGuid3, "");
            hashMap.put("profile", profileGuid3);
            InterfaceC5283bvo a = C8126deW.a(this.c.getNetflixActivity());
            if (a != null && (profileGuid = a.getProfileGuid()) != null) {
                str = profileGuid;
            }
            hashMap.put("current_profile", str);
            CLv2Utils.INSTANCE.b(new Focus(AppView.downloadedForYouStorageSelector, CLv2Utils.a(hashMap)), (Command) new ChangeValueCommand(Float.valueOf(f2)), false);
            this.c.requestModelBuild();
        }
    }
}
