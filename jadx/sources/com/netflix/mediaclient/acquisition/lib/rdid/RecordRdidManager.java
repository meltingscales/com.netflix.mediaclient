package com.netflix.mediaclient.acquisition.lib.rdid;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_RecordRdid;
import com.netflix.mediaclient.service.user.UserAgentListener;
import com.netflix.mediaclient.startup.ApplicationStartupListener;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;
import dagger.multibindings.IntoSet;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.C8126deW;
import o.C8586drb;
import o.C8627dsp;
import o.C8632dsu;
import o.C8737dwr;
import o.InterfaceC1270Vf;
import o.InterfaceC5283bvo;
import o.InterfaceC8585dra;
import o.dpR;
import o.dwQ;
import o.dwU;

/* loaded from: classes3.dex */
public final class RecordRdidManager implements ApplicationStartupListener, UserAgentListener {
    public static final Companion Companion = new Companion(null);
    public static final String PREF_LAST_RECORD_ATTEMPT_TIME_MILI_KEY = "lastRecordTimeMilisecondsKey";
    public static final String PREF_NAME = "rdidSharedPrefName";
    private final InterfaceC1270Vf clock;
    private final Context context;
    private final dwU coroutineScope;
    private final dwQ dispatcher;
    private final RdidConsentStateRepo rdidConsentStateRepo;
    private final SharedPreferences sharedPref;

    @Module
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes6.dex */
    public interface RdidConsentStateManagerModule {
        @Singleton
        @Binds
        @IntoSet
        ApplicationStartupListener bindApplicationStartupListener(RecordRdidManager recordRdidManager);

        @Singleton
        @Binds
        @IntoSet
        UserAgentListener bindProfileSelectionListener(RecordRdidManager recordRdidManager);
    }

    @Inject
    public RecordRdidManager(dwU dwu, dwQ dwq, @ApplicationContext Context context, InterfaceC1270Vf interfaceC1270Vf, RdidConsentStateRepo rdidConsentStateRepo) {
        C8632dsu.c((Object) dwu, "");
        C8632dsu.c((Object) dwq, "");
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) interfaceC1270Vf, "");
        C8632dsu.c((Object) rdidConsentStateRepo, "");
        this.coroutineScope = dwu;
        this.dispatcher = dwq;
        this.context = context;
        this.clock = interfaceC1270Vf;
        this.rdidConsentStateRepo = rdidConsentStateRepo;
        this.sharedPref = context.getSharedPreferences(PREF_NAME, 0);
    }

    @Override // com.netflix.mediaclient.service.user.UserAgentListener
    public void onProfileSelectionResultStatus(StatusCode statusCode) {
        UserAgentListener.b.a(this, statusCode);
    }

    @Override // com.netflix.mediaclient.service.user.UserAgentListener
    public void onProfileTypeChanged(String str) {
        UserAgentListener.b.c(this, str);
    }

    @Override // com.netflix.mediaclient.service.user.UserAgentListener
    public void onUserAccountActive() {
        UserAgentListener.b.a(this);
    }

    @Override // com.netflix.mediaclient.service.user.UserAgentListener
    public void onUserAccountDeactivated(List<? extends InterfaceC5283bvo> list, String str) {
        UserAgentListener.b.a(this, list, str);
    }

    @Override // com.netflix.mediaclient.service.user.UserAgentListener
    public void onUserLogOut() {
        UserAgentListener.b.b(this);
    }

    @Override // com.netflix.mediaclient.service.user.UserAgentListener
    public void onUserProfileDeactivated(InterfaceC5283bvo interfaceC5283bvo, List<? extends InterfaceC5283bvo> list) {
        UserAgentListener.b.c(this, interfaceC5283bvo, list);
    }

    @Override // com.netflix.mediaclient.startup.ApplicationStartupListener
    public void onApplicationCreated(Application application) {
        C8632dsu.c((Object) application, "");
        if (Config_FastProperty_RecordRdid.Companion.c()) {
            ProcessLifecycleOwner.Companion.get().getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.netflix.mediaclient.acquisition.lib.rdid.RecordRdidManager$onApplicationCreated$appObserver$1
                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public void onResume(LifecycleOwner lifecycleOwner) {
                    dwU dwu;
                    dwQ dwq;
                    C8632dsu.c((Object) lifecycleOwner, "");
                    if (C8126deW.a()) {
                        return;
                    }
                    dwu = RecordRdidManager.this.coroutineScope;
                    dwq = RecordRdidManager.this.dispatcher;
                    C8737dwr.c(dwu, dwq, null, new RecordRdidManager$onApplicationCreated$appObserver$1$onResume$1(RecordRdidManager.this, null), 2, null);
                }
            });
        }
    }

    @Override // com.netflix.mediaclient.service.user.UserAgentListener
    public void onUserProfileActive(InterfaceC5283bvo interfaceC5283bvo) {
        C8632dsu.c((Object) interfaceC5283bvo, "");
        if (interfaceC5283bvo.isKidsProfile() || !Config_FastProperty_RecordRdid.Companion.c()) {
            return;
        }
        C8737dwr.c(this.coroutineScope, this.dispatcher, null, new RecordRdidManager$onUserProfileActive$1(this, null), 2, null);
    }

    public final Object maybeRecordRdidIfLastCallOutdated$netflix_modules_lib_acquisition_impl_release(long j, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        Object e;
        if (this.clock.c() - this.sharedPref.getLong(PREF_LAST_RECORD_ATTEMPT_TIME_MILI_KEY, 0L) > j) {
            Object maybeRecordRdid = maybeRecordRdid(interfaceC8585dra);
            e = C8586drb.e();
            return maybeRecordRdid == e ? maybeRecordRdid : dpR.c;
        }
        return dpR.c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object maybeRecordRdid(o.InterfaceC8585dra<? super o.dpR> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.netflix.mediaclient.acquisition.lib.rdid.RecordRdidManager$maybeRecordRdid$1
            if (r0 == 0) goto L13
            r0 = r5
            com.netflix.mediaclient.acquisition.lib.rdid.RecordRdidManager$maybeRecordRdid$1 r0 = (com.netflix.mediaclient.acquisition.lib.rdid.RecordRdidManager$maybeRecordRdid$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.label = r1
            goto L18
        L13:
            com.netflix.mediaclient.acquisition.lib.rdid.RecordRdidManager$maybeRecordRdid$1 r0 = new com.netflix.mediaclient.acquisition.lib.rdid.RecordRdidManager$maybeRecordRdid$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = o.C8588drd.c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.L$0
            com.netflix.mediaclient.acquisition.lib.rdid.RecordRdidManager r0 = (com.netflix.mediaclient.acquisition.lib.rdid.RecordRdidManager) r0
            o.C8556dpz.d(r5)
            goto L46
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            o.C8556dpz.d(r5)
            com.netflix.mediaclient.acquisition.lib.rdid.RdidConsentStateRepo r5 = r4.rdidConsentStateRepo
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r5.maybeRecordRdid(r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            r0 = r4
        L46:
            android.content.SharedPreferences r5 = r0.sharedPref
            android.content.SharedPreferences$Editor r5 = r5.edit()
            o.Vf r0 = r0.clock
            long r0 = r0.c()
            java.lang.String r2 = "lastRecordTimeMilisecondsKey"
            android.content.SharedPreferences$Editor r5 = r5.putLong(r2, r0)
            r5.apply()
            o.dpR r5 = o.dpR.c
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.acquisition.lib.rdid.RecordRdidManager.maybeRecordRdid(o.dra):java.lang.Object");
    }

    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }
    }
}
