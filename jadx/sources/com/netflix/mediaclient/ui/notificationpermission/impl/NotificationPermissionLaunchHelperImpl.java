package com.netflix.mediaclient.ui.notificationpermission.impl;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import androidx.compose.ui.Modifier;
import com.netflix.android.org.json.zip.JSONzip;
import com.netflix.hawkins.consumer.icons.HawkinsIcon;
import com.netflix.hawkins.consumer.tokens.Theme;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import o.AbstractC1017Lk;
import o.C1045Mp;
import o.C1596aHd;
import o.C7104cps;
import o.C8168dfL;
import o.C8627dsp;
import o.C8632dsu;
import o.C9737vz;
import o.C9872yF;
import o.C9878yL;
import o.InterfaceC1597aHe;
import o.InterfaceC1601aHi;
import o.InterfaceC7091cpf;
import o.dqE;

/* loaded from: classes4.dex */
public final class NotificationPermissionLaunchHelperImpl implements InterfaceC7091cpf {
    public static final c a = new c(null);
    public static final int e = 8;
    private final NetflixActivity b;

    @Module
    @InstallIn({ActivityComponent.class})
    /* loaded from: classes6.dex */
    public interface NotificationPermissionLaunchHelperModule {
        @Binds
        InterfaceC7091cpf e(NotificationPermissionLaunchHelperImpl notificationPermissionLaunchHelperImpl);
    }

    @Inject
    public NotificationPermissionLaunchHelperImpl(Activity activity) {
        C8632dsu.c((Object) activity, "");
        this.b = (NetflixActivity) C9737vz.e(activity, NetflixActivity.class);
    }

    /* loaded from: classes4.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("NotificationPermissionLaunchHelperImpl");
        }
    }

    @Override // o.InterfaceC7091cpf
    public void a() {
        Map k;
        Throwable th;
        Intent intent = new Intent();
        if (Build.VERSION.SDK_INT >= 26) {
            intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
            intent.putExtra("android.provider.extra.APP_PACKAGE", this.b.getPackageName());
        } else {
            intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
            intent.putExtra("app_package", this.b.getPackageName());
            intent.putExtra("app_uid", this.b.getApplicationInfo().uid);
        }
        if (intent.resolveActivity(this.b.getPackageManager()) == null) {
            intent = new Intent();
            intent.addCategory("android.intent.category.DEFAULT");
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + this.b.getPackageName()));
        }
        try {
            this.b.startActivity(intent);
        } catch (ActivityNotFoundException e2) {
            C9872yF c9872yF = this.b.composeViewOverlayManager;
            HawkinsIcon.C0156ba c0156ba = HawkinsIcon.C0156ba.e;
            String d = C8168dfL.d(C7104cps.a.a);
            Theme theme = Theme.a;
            C8632dsu.d(c9872yF);
            C9878yL.d(c9872yF, (r22 & 1) != 0 ? Modifier.Companion : null, C8168dfL.d(C7104cps.a.b) + "\n" + C8168dfL.d(C7104cps.a.d), (r22 & 4) != 0 ? null : c0156ba, (r22 & 8) != 0 ? null : d, (r22 & 16) != 0 ? new AbstractC1017Lk.d(null, 1, null) : null, (r22 & 32) != 0 ? Theme.b : theme, (r22 & 64) != 0 ? 3000 : 7000, (r22 & 128) != 0, (r22 & JSONzip.end) != 0 ? null : null);
            InterfaceC1597aHe.d dVar = InterfaceC1597aHe.b;
            ErrorType errorType = ErrorType.c;
            k = dqE.k(new LinkedHashMap());
            C1596aHd c1596aHd = new C1596aHd("Not expecting to not find netflixActivity that handle ACTION_APP_NOTIFICATION_SETTINGS or ACTION_APPLICATION_DETAILS_SETTINGS", e2, errorType, true, k, false, false, 96, null);
            ErrorType errorType2 = c1596aHd.a;
            if (errorType2 != null) {
                c1596aHd.e.put("errorType", errorType2.c());
                String b = c1596aHd.b();
                if (b != null) {
                    c1596aHd.a(errorType2.c() + " " + b);
                }
            }
            if (c1596aHd.b() != null && c1596aHd.i != null) {
                th = new Throwable(c1596aHd.b(), c1596aHd.i);
            } else if (c1596aHd.b() != null) {
                th = new Throwable(c1596aHd.b());
            } else {
                th = c1596aHd.i;
                if (th == null) {
                    th = new Throwable("Handled exception with no message");
                } else if (th == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            InterfaceC1601aHi.d dVar2 = InterfaceC1601aHi.c;
            InterfaceC1597aHe c2 = dVar2.c();
            if (c2 != null) {
                c2.d(c1596aHd, th);
            } else {
                dVar2.e().b(c1596aHd, th);
            }
        }
    }
}
