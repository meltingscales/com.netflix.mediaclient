package com.netflix.mediaclient.ui.profile.impl;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import com.netflix.mediaclient.ui.R;
import com.netflix.mediaclient.ui.profiles.MyNetflixActivity;
import com.netflix.mediaclient.ui.profiles.ProfileSelectionActivity;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Inject;
import o.ActivityC5881cLv;
import o.C1045Mp;
import o.C5928cNo;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC5283bvo;
import o.InterfaceC5844cKl;
import o.InterfaceC5846cKn;
import o.cMQ;
import o.cNV;
import o.cNY;

/* loaded from: classes4.dex */
public final class ProfileImpl implements InterfaceC5844cKl {
    private final Application c;
    public static final d e = new d(null);
    public static final int a = 8;

    @Module
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes6.dex */
    public interface ProfileModule {
        @Binds
        InterfaceC5844cKl c(ProfileImpl profileImpl);
    }

    @Override // o.InterfaceC5844cKl
    public int j() {
        return R.g.eM;
    }

    @Inject
    public ProfileImpl(Application application) {
        C8632dsu.c((Object) application, "");
        this.c = application;
    }

    /* loaded from: classes4.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("ProfileImpl");
        }
    }

    @Override // o.InterfaceC5844cKl
    public Intent e() {
        return MyNetflixActivity.d.e(this.c);
    }

    @Override // o.InterfaceC5844cKl
    public Intent b() {
        return MyNetflixActivity.d.d(this.c);
    }

    @Override // o.InterfaceC5844cKl
    public InterfaceC5846cKn g() {
        return cNY.a;
    }

    @Override // o.InterfaceC5844cKl
    /* renamed from: f */
    public C5928cNo a() {
        return C5928cNo.b;
    }

    @Override // o.InterfaceC5844cKl
    /* renamed from: i */
    public cNV d() {
        return cNV.e;
    }

    @Override // o.InterfaceC5844cKl
    /* renamed from: h */
    public cMQ c() {
        return new cMQ();
    }

    @Override // o.InterfaceC5844cKl
    public boolean b(Activity activity) {
        C8632dsu.c((Object) activity, "");
        return activity instanceof ProfileSelectionActivity;
    }

    @Override // o.InterfaceC5844cKl
    public void a(Activity activity, InterfaceC5283bvo interfaceC5283bvo) {
        C8632dsu.c((Object) activity, "");
        C8632dsu.c((Object) interfaceC5283bvo, "");
        ActivityC5881cLv.c cVar = ActivityC5881cLv.a;
        String profileName = interfaceC5283bvo.getProfileName();
        C8632dsu.a(profileName, "");
        String profileGuid = interfaceC5283bvo.getProfileGuid();
        C8632dsu.a(profileGuid, "");
        activity.startActivity(cVar.a(profileName, profileGuid));
    }
}
