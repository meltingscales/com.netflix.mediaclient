package com.netflix.mediaclient.protocol.netflixcom;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.NetflixApplication;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.service.webclient.model.leafs.MdeConfig;
import com.netflix.mediaclient.service.webclient.model.leafs.PartnerIntegrationConfig;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.ui.home.HomeActivity;
import com.netflix.mediaclient.ui.launch.NetflixComLaunchActivity;
import com.netflix.mediaclient.util.PlayContext;
import com.netflix.model.leafs.originals.interactive.Moment;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import o.AbstractApplicationC1040Mh;
import o.AbstractC1608aHp;
import o.ActivityC4183bZh;
import o.C1044Mm;
import o.C7017coI;
import o.C8069ddS;
import o.C8153dex;
import o.C8168dfL;
import o.C8198dfp;
import o.C8241dgf;
import o.InterfaceC1593aHa;
import o.InterfaceC1598aHf;
import o.InterfaceC4360bcz;
import o.InterfaceC5085bsB;
import o.InterfaceC5131bsv;
import o.InterfaceC5160btX;
import o.InterfaceC5844cKl;
import o.InterfaceC6235cYw;
import o.InterfaceC7306cti;
import o.InterfaceC8098ddv;
import o.aOV;
import o.cNT;

/* loaded from: classes3.dex */
public enum DeepLinkUtils {
    INSTANCE;

    public static String c() {
        InterfaceC5085bsB c2;
        if (InterfaceC4360bcz.e().c() != null) {
            String str = c2.H() + "";
            C1044Mm.c("DeepLinkUtils", "getCurrentPlaybackIdLocal has local playback %s", str);
            return str;
        }
        InterfaceC4360bcz.e d = InterfaceC4360bcz.e().d();
        if (d != null) {
            long d2 = d.d();
            long a = d.a();
            long currentTimeMillis = System.currentTimeMillis();
            if (d2 > 0 && currentTimeMillis - a <= TimeUnit.MINUTES.toMillis(1L)) {
                return d2 + "";
            }
        }
        C1044Mm.a("DeepLinkUtils", "getCurrentPlaybackIdLocal no playback found");
        return null;
    }

    public static String d() {
        String str;
        InterfaceC5131bsv i = AbstractApplicationC1040Mh.getInstance().i().i();
        if (i != null) {
            C8241dgf.e n = i.n();
            Object[] objArr = new Object[1];
            objArr[0] = Boolean.valueOf(n != null);
            C1044Mm.c("DeepLinkUtils", "getCurrentPlaybackIdRemote has videoIds on mdx %b", objArr);
            if (n != null) {
                if (C8168dfL.h(n.e)) {
                    str = n.e;
                } else {
                    str = n.a;
                }
                C1044Mm.c("DeepLinkUtils", "getCurrentPlaybackIdRemote has remote playback %s", str);
                if (C8168dfL.h(str)) {
                    return str;
                }
            }
        }
        C1044Mm.a("DeepLinkUtils", "getCurrentPlaybackIdRemote no playback found");
        return null;
    }

    public void d(NetflixActivity netflixActivity) {
        synchronized (this) {
            netflixActivity.startActivity(HomeActivity.d((Context) netflixActivity, netflixActivity.getUiScreen(), false));
            netflixActivity.overridePendingTransition(0, 0);
        }
    }

    public void c(NetflixActivity netflixActivity) {
        synchronized (this) {
            cNT a = cNT.a(netflixActivity);
            Intent c2 = a.c(netflixActivity, AppView.webLink);
            a.d(c2);
            netflixActivity.startActivity(c2);
            netflixActivity.overridePendingTransition(0, 0);
        }
    }

    public void b(NetflixActivity netflixActivity) {
        synchronized (this) {
            UserAgent u = netflixActivity.getServiceManager().u();
            if (u != null && u.g() != null) {
                C7017coI.a().d(AbstractC1608aHp.a.e).d(new AbstractC1608aHp.e(u.g(), u.t().booleanValue(), true)).b(netflixActivity);
            } else {
                InterfaceC1598aHf.a("NetflixComUtils userAgent or profileGuid was null in startProfilesIconActivity");
            }
        }
    }

    public void a(NetflixActivity netflixActivity) {
        synchronized (this) {
            netflixActivity.startActivity(new Intent(netflixActivity, NetflixComLaunchActivity.class));
            netflixActivity.overridePendingTransition(0, 0);
        }
    }

    public void d(NetflixActivity netflixActivity, InterfaceC5160btX interfaceC5160btX, VideoType videoType, PlayContext playContext) {
        synchronized (this) {
            Intent b = C8153dex.B() ? InterfaceC5844cKl.e(netflixActivity).b() : InterfaceC7306cti.d((Context) netflixActivity).b(netflixActivity);
            b.putExtra(NetflixActivity.EXTRA_VIDEO_ID, interfaceC5160btX.aH_());
            b.putExtra(NetflixActivity.EXTRA_VIDEO_TYPE_STRING_VALUE, videoType.getValue());
            b.putExtra(NetflixActivity.EXTRA_PLAY_CONTEXT, playContext);
            b.addFlags(131072);
            netflixActivity.startActivity(b);
            netflixActivity.overridePendingTransition(0, 0);
        }
    }

    public void e(NetflixActivity netflixActivity) {
        synchronized (this) {
            Intent d = InterfaceC8098ddv.c(netflixActivity).d((Context) netflixActivity);
            d.addFlags(872415232);
            netflixActivity.startActivity(d);
            netflixActivity.overridePendingTransition(0, 0);
        }
    }

    public void d(NetflixActivity netflixActivity, boolean z) {
        synchronized (this) {
            InterfaceC6235cYw a = InterfaceC6235cYw.a(netflixActivity);
            if (netflixActivity.isTaskRoot()) {
                netflixActivity.startActivity(HomeActivity.d((Context) netflixActivity, netflixActivity.getUiScreen(), false));
                netflixActivity.overridePendingTransition(0, 0);
            }
            netflixActivity.startActivity((z ? a.c() : a.d()).addFlags(67239936));
            netflixActivity.overridePendingTransition(0, 0);
        }
    }

    public void b(Activity activity, Uri uri) {
        synchronized (this) {
            Intent c2 = C8069ddS.c(uri.buildUpon().appendQueryParameter("s", "a").build());
            InterfaceC1593aHa.b("Unhandled deeplink redirected to browser: " + c2.toString());
            try {
                activity.startActivity(c2);
            } catch (Exception e) {
                InterfaceC1598aHf.e("Exception when redirecting unhandled deeplink to browser", e);
                activity.startActivity(ActivityC4183bZh.d(activity, AppView.webLink));
            }
        }
    }

    public String a(Uri uri) {
        String queryParameter;
        synchronized (this) {
            queryParameter = uri.getQueryParameter("trkid");
            if (C8168dfL.g(queryParameter)) {
                queryParameter = uri.getQueryParameter("trkId");
            }
        }
        return queryParameter;
    }

    public long b(Map<String, String> map) {
        long longValue;
        synchronized (this) {
            String str = map.get("t");
            longValue = C8198dfp.c(str) ? C8198dfp.a(str).longValue() : -1L;
        }
        return longValue;
    }

    public String c(Map<String, String> map) {
        String str;
        synchronized (this) {
            str = map.get(Moment.TYPE.SCENE);
        }
        return str;
    }

    public boolean d(Map<String, String> map) {
        synchronized (this) {
            String str = map.get("stopremote");
            if (str != null) {
                if (str.equalsIgnoreCase("true")) {
                    return true;
                }
            }
            return false;
        }
    }

    public String e(Map<String, String> map) {
        String str;
        synchronized (this) {
            str = map.get("targetip");
        }
        return str;
    }

    public String a(Map<String, String> map) {
        String str;
        synchronized (this) {
            str = map.get("targetname");
        }
        return str;
    }

    public void d(NetflixActivity netflixActivity, String str, String str2) {
        synchronized (this) {
            netflixActivity.startActivity(HomeActivity.b(netflixActivity, netflixActivity.getUiScreen(), false, str, str2));
            netflixActivity.overridePendingTransition(0, 0);
        }
    }

    public static boolean a() {
        PartnerIntegrationConfig M;
        MdeConfig mdeConfig;
        aOV d = AbstractApplicationC1040Mh.getInstance().i().d();
        if (d == null || (M = d.M()) == null || (mdeConfig = M.mdeConfig()) == null) {
            return false;
        }
        return mdeConfig.isDisabled();
    }

    public static boolean a(NetflixActivity netflixActivity, Intent intent, Map<String, String> map) {
        String str = map.get("pid");
        if (str == null) {
            return false;
        }
        UserAgent u = netflixActivity.getServiceManager().u();
        if (u == null) {
            C1044Mm.d("DeepLinkUtils", "unable to process profile specified in deeplink, user agent is null");
            return false;
        }
        String g = u.g();
        C1044Mm.a("DeepLinkUtils", "deeplink opened with profile %s, current profile is %s", str, g);
        if (str.equals(g)) {
            C1044Mm.e("DeepLinkUtils", "deeplink profile matches current profile, no profile switch required");
            return false;
        }
        C1044Mm.a("DeepLinkUtils", "deeplink profile doesn't match current profile, switching profiles");
        intent.setData(c(intent.getData(), "pid"));
        NetflixApplication.getInstance().c(intent);
        netflixActivity.startActivity(cNT.a(netflixActivity).e(netflixActivity, AppView.webLink, false, str));
        return true;
    }

    private static Uri c(Uri uri, String str) {
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        Uri.Builder clearQuery = uri.buildUpon().clearQuery();
        for (String str2 : queryParameterNames) {
            if (!str2.equals(str)) {
                clearQuery.appendQueryParameter(str2, uri.getQueryParameter(str2));
            }
        }
        return clearQuery.build();
    }
}
