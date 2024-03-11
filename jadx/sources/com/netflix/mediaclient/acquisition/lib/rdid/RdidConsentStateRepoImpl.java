package com.netflix.mediaclient.acquisition.lib.rdid;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.netflix.cl.Logger;
import com.netflix.cl.model.event.discrete.DebugEvent;
import com.netflix.mediaclient.acquisition.lib.rdid.RdidDeviceConsentState;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert;
import dagger.Binds;
import dagger.Lazy;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.C1045Mp;
import o.C5338bwq;
import o.C8057ddG;
import o.C8572dqo;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC5323bwb;
import o.InterfaceC8585dra;
import o.XH;
import o.aCI;
import o.dpR;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class RdidConsentStateRepoImpl implements RdidConsentStateRepo {
    public static final Companion Companion = new Companion(null);
    private final C8057ddG advertisingIdClient;
    private final InterfaceC5323bwb consentStateDao;
    private final XH featureRepo;
    private final Lazy<aCI> graphQLRepo;

    @Module
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes6.dex */
    public interface RdidConsentStateRepoModule {
        @Singleton
        @Binds
        RdidConsentStateRepo bindRdidConsentStateRepo(RdidConsentStateRepoImpl rdidConsentStateRepoImpl);
    }

    @Inject
    public RdidConsentStateRepoImpl(Lazy<aCI> lazy, InterfaceC5323bwb interfaceC5323bwb, C8057ddG c8057ddG, XH xh) {
        C8632dsu.c((Object) lazy, "");
        C8632dsu.c((Object) interfaceC5323bwb, "");
        C8632dsu.c((Object) c8057ddG, "");
        C8632dsu.c((Object) xh, "");
        this.graphQLRepo = lazy;
        this.consentStateDao = interfaceC5323bwb;
        this.advertisingIdClient = c8057ddG;
        this.featureRepo = xh;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(8:5|6|7|(1:(1:(1:(1:(3:13|14|15)(2:17|18))(6:19|20|21|(2:23|(1:25))|14|15))(8:26|27|28|29|(2:32|30)|33|34|(1:36)(5:37|21|(0)|14|15)))(2:38|39))(5:47|48|(1:50)(1:55)|51|(1:53)(1:54))|40|(2:43|(1:45)(6:46|29|(1:30)|33|34|(0)(0)))|14|15))|58|6|7|(0)(0)|40|(2:43|(0)(0))|14|15) */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0157, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0158, code lost:
        r2 = new org.json.JSONObject();
        r2.put("name", com.netflix.mediaclient.acquisition.lib.rdid.RdidConsentStateRepoImpl.Companion.getLogTag());
        r2.put(com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert.ICON_ERROR, "Couldn't record rdid: " + r0);
        com.netflix.cl.Logger.INSTANCE.logEvent(new com.netflix.cl.model.event.discrete.DebugEvent(r2));
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b8 A[Catch: Exception -> 0x0157, LOOP:0: B:44:0x00b2->B:46:0x00b8, LOOP_END, TryCatch #0 {Exception -> 0x0157, blocks: (B:14:0x0035, B:19:0x004a, B:51:0x0114, B:53:0x012b, B:22:0x0057, B:43:0x00a1, B:44:0x00b2, B:46:0x00b8, B:47:0x00da, B:25:0x0063, B:36:0x0089, B:39:0x0091, B:28:0x006a, B:32:0x007b), top: B:60:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012b A[Catch: Exception -> 0x0157, TRY_LEAVE, TryCatch #0 {Exception -> 0x0157, blocks: (B:14:0x0035, B:19:0x004a, B:51:0x0114, B:53:0x012b, B:22:0x0057, B:43:0x00a1, B:44:0x00b2, B:46:0x00b8, B:47:0x00da, B:25:0x0063, B:36:0x0089, B:39:0x0091, B:28:0x006a, B:32:0x007b), top: B:60:0x002b }] */
    @Override // com.netflix.mediaclient.acquisition.lib.rdid.RdidConsentStateRepo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object maybeRecordRdid(o.InterfaceC8585dra<? super o.dpR> r19) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.acquisition.lib.rdid.RdidConsentStateRepoImpl.maybeRecordRdid(o.dra):java.lang.Object");
    }

    @Override // com.netflix.mediaclient.acquisition.lib.rdid.RdidConsentStateRepo
    public Object getRdidCtaConsentStates(InterfaceC8585dra<? super List<RdidCtaConsentState>> interfaceC8585dra) {
        int d;
        List<C5338bwq> d2 = this.consentStateDao.d();
        d = C8572dqo.d(d2, 10);
        ArrayList arrayList = new ArrayList(d);
        for (C5338bwq c5338bwq : d2) {
            arrayList.add(new RdidCtaConsentState(c5338bwq.d(), c5338bwq.e(), c5338bwq.c()));
        }
        return arrayList;
    }

    @Override // com.netflix.mediaclient.acquisition.lib.rdid.RdidConsentStateRepo
    public Object getRdidDeviceConsentState(InterfaceC8585dra<? super RdidDeviceConsentState> interfaceC8585dra) {
        Object approved;
        try {
            AdvertisingIdClient.Info e = this.advertisingIdClient.e();
            if (e.isLimitAdTrackingEnabled()) {
                approved = RdidDeviceConsentState.Denied.INSTANCE;
            } else {
                String id = e.getId();
                C8632dsu.d((Object) id);
                approved = new RdidDeviceConsentState.Approved(id);
            }
            return approved;
        } catch (Exception e2) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("name", Companion.getLogTag());
            jSONObject.put(UmaAlert.ICON_ERROR, "Couldn't determine Rdid: " + e2);
            Logger.INSTANCE.logEvent(new DebugEvent(jSONObject));
            return RdidDeviceConsentState.Undetermined.INSTANCE;
        }
    }

    @Override // com.netflix.mediaclient.acquisition.lib.rdid.RdidConsentStateRepo
    public Object storeRdidCtaConsentState(RdidCtaConsentState rdidCtaConsentState, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        this.consentStateDao.a(new C5338bwq(rdidCtaConsentState.getConsentId(), rdidCtaConsentState.getDisplayedAt(), rdidCtaConsentState.isDenied()));
        return dpR.c;
    }

    /* loaded from: classes3.dex */
    public static final class Companion extends C1045Mp {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
            super("RdidConsentRepo");
        }
    }
}
