package com.netflix.mediaclient.ui.notificationpermission.impl;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.content.ContextCompat;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.service.user.UserAgent;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Inject;
import javax.inject.Provider;
import o.AbstractApplicationC1040Mh;
import o.C1045Mp;
import o.C8126deW;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC5283bvo;
import o.InterfaceC7089cpd;

/* loaded from: classes4.dex */
public final class NotificationPermissionHelperImpl implements InterfaceC7089cpd {
    private final Provider<Boolean> b;
    private final Context e;
    public static final d d = new d(null);
    public static final int a = 8;

    @Module
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes6.dex */
    public interface NotificationPermissionHelperModule {
        @Binds
        InterfaceC7089cpd c(NotificationPermissionHelperImpl notificationPermissionHelperImpl);
    }

    @Inject
    public NotificationPermissionHelperImpl(@ApplicationContext Context context, Provider<Boolean> provider) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) provider, "");
        this.e = context;
        this.b = provider;
    }

    /* loaded from: classes4.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("NotificationPermissionHelperImpl");
        }
    }

    @Override // o.InterfaceC7089cpd
    public boolean b() {
        if (Build.VERSION.SDK_INT >= 33) {
            return ContextCompat.checkSelfPermission(this.e, "android.permission.POST_NOTIFICATIONS") == 0;
        }
        return NotificationManagerCompat.from(this.e).areNotificationsEnabled();
    }

    @Override // o.InterfaceC7089cpd
    public boolean c() {
        if (Build.VERSION.SDK_INT < 33) {
            return i();
        }
        InterfaceC5283bvo b = C8126deW.b();
        return (b == null || b.isKidsProfile() || b() || h() || d()) ? false : true;
    }

    public boolean i() {
        if (this.b.get().booleanValue() && b()) {
            UserAgent k = AbstractApplicationC1040Mh.getInstance().i().k();
            if (C8632dsu.c((Object) (k != null ? k.a() : null), (Object) "KR") && !h()) {
                return true;
            }
        }
        return false;
    }

    @Override // o.InterfaceC7089cpd
    public void a(AppView appView) {
        C8632dsu.c((Object) appView, "");
        Intent intent = new Intent("com.netflix.mediaclient.intent.action.PUSH_NOTIFICATION_OPTIN");
        intent.putExtra(NetflixActivity.EXTRA_SOURCE, appView.name());
        intent.addCategory("com.netflix.mediaclient.intent.category.PUSH");
        LocalBroadcastManager.getInstance(this.e).sendBroadcast(intent);
    }

    @Override // o.InterfaceC7089cpd
    public void c(AppView appView) {
        C8632dsu.c((Object) appView, "");
        Intent intent = new Intent("com.netflix.mediaclient.intent.action.PUSH_NOTIFICATION_OPTOUT");
        intent.putExtra(NetflixActivity.EXTRA_SOURCE, appView.name());
        intent.addCategory("com.netflix.mediaclient.intent.category.PUSH");
        LocalBroadcastManager.getInstance(this.e).sendBroadcast(intent);
    }

    @Override // o.InterfaceC7089cpd
    public void a() {
        f().edit().putLong("KEY_RATIONALE_SHOWN_TIMESTAMP", System.currentTimeMillis()).apply();
    }

    @Override // o.InterfaceC7089cpd
    public void e() {
        f().edit().putBoolean("KEY_RATIONALE_NEGATIVE", true).apply();
    }

    private final SharedPreferences f() {
        SharedPreferences sharedPreferences = this.e.getSharedPreferences("com.netflix.mediaclient.ui.notificationpermission", 0);
        C8632dsu.a(sharedPreferences, "");
        return sharedPreferences;
    }

    public final boolean h() {
        return f().getLong("KEY_RATIONALE_SHOWN_TIMESTAMP", -1L) != -1;
    }

    public final boolean d() {
        return f().getBoolean("KEY_RATIONALE_NEGATIVE", false);
    }
}
