package o;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.protocol.netflixcom.DeepLinkProfilesHandler;
import com.netflix.mediaclient.protocol.netflixcom.DeepLinkUtils;
import com.netflix.mediaclient.protocol.nflx.NflxHandler;
import com.netflix.mediaclient.ui.details.DetailsActivityAction;
import com.netflix.model.leafs.originals.interactive.Moment;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.android.EntryPointAccessors;
import dagger.hilt.components.SingletonComponent;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import o.C1709aLi;
import o.C1711aLk;
import o.C1712aLl;
import o.aKS;
import org.chromium.net.ConnectionSubtype;

/* loaded from: classes3.dex */
public class aKQ {

    /* JADX INFO: Access modifiers changed from: package-private */
    @EntryPoint
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes3.dex */
    public interface e {
        aKW B();

        C1709aLi.c C();

        aKS.d D();

        C1711aLk.e S();

        C1712aLl.d aa();

        C1715aLo ab();

        InterfaceC7084cpY f();
    }

    public static boolean e(Intent intent) {
        if (intent == null || intent.getData() == null || !e(intent.getData().getScheme())) {
            return false;
        }
        return "www.netflix.com".equalsIgnoreCase(intent.getData().getAuthority()) || "msg.netflix.com".equalsIgnoreCase(intent.getData().getAuthority()) || "app.netflix.com".equalsIgnoreCase(intent.getData().getAuthority()) || "qr.netflix.com".equalsIgnoreCase(intent.getData().getAuthority()) || ((e) EntryPointAccessors.fromApplication(AbstractApplicationC1040Mh.d(), e.class)).f().e(intent);
    }

    private static boolean e(String str) {
        return "http".equalsIgnoreCase(str) || "https".equalsIgnoreCase(str);
    }

    public static boolean e(Activity activity, Intent intent) {
        List<String> a;
        aKP c;
        Uri data = intent.getData();
        boolean z = true;
        if (data != null && (c = c(activity, (a = a(data)), C8196dfn.b(intent.getData()), data.getAuthority())) != null) {
            z = true ^ c.c(a);
        }
        if (z) {
            DeepLinkUtils.INSTANCE.b(activity, intent.getData());
            activity.finish();
        }
        return z;
    }

    public static NflxHandler.Response c(NetflixActivity netflixActivity, Intent intent) {
        return d(netflixActivity, intent, true);
    }

    public static NflxHandler.Response d(NetflixActivity netflixActivity, Intent intent, boolean z) {
        Uri data = intent.getData();
        String stringExtra = intent.getStringExtra(NetflixActivity.EXTRA_SOURCE);
        if (C8168dfL.g(stringExtra) && data != null) {
            try {
                stringExtra = data.getQueryParameter(NetflixActivity.EXTRA_SOURCE);
            } catch (UnsupportedOperationException unused) {
            }
        }
        List<String> a = a(data);
        Map<String, String> b = C8196dfn.b(data);
        if (C8168dfL.h(stringExtra)) {
            b.put(NetflixActivity.EXTRA_SOURCE, stringExtra);
        }
        String stringExtra2 = intent.getStringExtra("internalCurrentLocalPlayableId");
        if (stringExtra2 != null) {
            b.put("internalCurrentLocalPlayableId", stringExtra2);
        }
        String stringExtra3 = intent.getStringExtra("internalCurrentRemotePlayableId");
        if (stringExtra3 != null) {
            b.put("internalCurrentRemotePlayableId", stringExtra3);
        }
        aKP c = c(netflixActivity, a, b, data.getAuthority());
        if (c != null && c.H_() && !z) {
            C1044Mm.j("NetflixComHandlerFact", "handle:: Authorization is required and user is NOT signed in for handler %s!", c.getClass().getSimpleName());
            return NflxHandler.Response.NOT_HANDLING;
        } else if (c == null && !z) {
            C1044Mm.j("NetflixComHandlerFact", "handle:: not handling and user is NOT signed! Drop it.");
            return NflxHandler.Response.NOT_HANDLING;
        } else {
            InterfaceC1593aHa.b("uri: " + data.toString());
            if (c == null || !c.c(a)) {
                C1044Mm.j("NetflixComHandlerFact", "Got null creator for data: " + data.toString() + ". Redirecting user to browser.");
            } else {
                C1044Mm.a("NetflixComHandlerFact", "tryHandle url " + data.toString());
                NflxHandler.Response d = c.d(netflixActivity, intent, a, DeepLinkUtils.INSTANCE.a(data));
                if (d == NflxHandler.Response.NOT_HANDLING) {
                    InterfaceC1598aHf.a(new C1596aHd("SPY-7518 - couldn't handle the following data: " + data.toString()).b(false));
                } else {
                    ((e) EntryPointAccessors.fromApplication(netflixActivity, e.class)).f().e(netflixActivity, intent);
                    return d;
                }
            }
            DeepLinkUtils.INSTANCE.b(netflixActivity, data);
            return NflxHandler.Response.HANDLING;
        }
    }

    public static List<String> a(Uri uri) {
        if (uri == null) {
            return Collections.emptyList();
        }
        List<String> pathSegments = uri.getPathSegments();
        return (pathSegments.size() <= 1 || !Pattern.compile("^[a-zA-Z]{2}(?:-[a-zA-Z]{2}){0,1}(?:-[a-zA-Z]{2})?$").matcher(pathSegments.get(0)).matches()) ? pathSegments : pathSegments.subList(1, pathSegments.size());
    }

    public static aKP b(Context context, Intent intent) {
        Uri data = intent.getData();
        String stringExtra = intent.getStringExtra(NetflixActivity.EXTRA_SOURCE);
        List<String> a = a(data);
        Map<String, String> b = C8196dfn.b(data);
        if (C8168dfL.h(stringExtra)) {
            b.put(NetflixActivity.EXTRA_SOURCE, stringExtra);
        }
        return c(context, a, b, data == null ? "" : data.getAuthority());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static aKP c(Context context, List<String> list, Map<String, String> map, String str) {
        char c;
        boolean z = false;
        String str2 = list.size() > 0 ? list.get(0) : "";
        if ("msg.netflix.com".equalsIgnoreCase(str)) {
            return new C1701aLa();
        }
        if (SignupConstants.Field.VIDEO_TITLE.equals(str2) && map.containsKey("fromWatch") && map.get("fromWatch").equals("true")) {
            str2 = "watch";
        }
        e eVar = (e) EntryPointAccessors.fromApplication(context, e.class);
        str2.hashCode();
        switch (str2.hashCode()) {
            case -2132879654:
                if (str2.equals("specials")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -2120335645:
                if (str2.equals("mobilehelp")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1380604278:
                if (str2.equals("browse")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1289032093:
                if (str2.equals("extras")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1284617557:
                if (str2.equals("bU4kXkYg")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1211103221:
                if (str2.equals("oAuth2Init")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -1177318867:
                if (str2.equals("account")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -1002263574:
                if (str2.equals("profiles")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -906336856:
                if (str2.equals("search")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -775651618:
                if (str2.equals("connection")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 0:
                if (str2.equals("")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 67:
                if (str2.equals("C")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 96417:
                if (str2.equals("add")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 2338445:
                if (str2.equals("Kids")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 3165170:
                if (str2.equals("game")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 3208483:
                if (str2.equals("hook")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 3321751:
                if (str2.equals("like")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 3327858:
                if (str2.equals("love")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 3545755:
                if (str2.equals("sync")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 73596745:
                if (str2.equals("Login")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 110371416:
                if (str2.equals(SignupConstants.Field.VIDEO_TITLE)) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 112903375:
                if (str2.equals("watch")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 146190785:
                if (str2.equals("438c60eb")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 595233003:
                if (str2.equals(Moment.TYPE.NOTIFICATION)) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case 764960417:
                if (str2.equals("extrasFeed")) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case 765913729:
                if (str2.equals("extrasfeed")) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case 1103133536:
                if (str2.equals("remind-me")) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case 1113304014:
                if (str2.equals("oAuth2Login")) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case 1262397671:
                if (str2.equals("multimonth")) {
                    c = 28;
                    break;
                }
                c = 65535;
                break;
            case 1427818632:
                if (str2.equals("download")) {
                    c = 29;
                    break;
                }
                c = 65535;
                break;
            case 1671642405:
                if (str2.equals("dislike")) {
                    c = 30;
                    break;
                }
                c = 65535;
                break;
            case 1998230186:
                if (str2.equals("Browse")) {
                    c = 31;
                    break;
                }
                c = 65535;
                break;
            case 2074637936:
                if (str2.equals("nmwatch")) {
                    c = ' ';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
            case 2:
            case ConnectionSubtype.SUBTYPE_WIFI_AC /* 31 */:
                if (map.containsKey("so") && map.get("so").equalsIgnoreCase("su")) {
                    z = true;
                }
                return new aKL(z, map);
            case 1:
                return new aKO();
            case 3:
            case 24:
            case 25:
            case 26:
                return new aKJ(map);
            case 4:
                return eVar.ab();
            case 5:
                return eVar.B();
            case 6:
                return new aKD();
            case 7:
                return new DeepLinkProfilesHandler();
            case '\b':
                return new C1702aLb(map);
            case '\t':
            case 11:
                return eVar.S().e(map);
            case '\n':
                return new aKN();
            case '\f':
                return new aKK(map);
            case '\r':
                return new aKV(map);
            case 14:
                return new aKR(map);
            case 15:
                return new aKM();
            case 16:
                return new aKX(DetailsActivityAction.d, map);
            case 17:
                return new aKX(DetailsActivityAction.e, map);
            case 18:
                return new aKY();
            case 19:
                return new aKT();
            case 20:
                return new C1705aLe(map);
            case 21:
            case ' ':
                C1713aLm c1713aLm = new C1713aLm();
                DeepLinkUtils deepLinkUtils = DeepLinkUtils.INSTANCE;
                c1713aLm.e(deepLinkUtils.b(map));
                c1713aLm.c(deepLinkUtils.c(map));
                c1713aLm.e(deepLinkUtils.d(map));
                c1713aLm.e(list.size() > 3 ? list.get(3) : null, false, null);
                return new C1707aLg(c1713aLm);
            case 22:
                return eVar.aa().b(map);
            case 23:
                return eVar.D().c(map);
            case ConnectionSubtype.SUBTYPE_10_GIGABIT_ETHERNET /* 27 */:
                return eVar.C().e(map);
            case ConnectionSubtype.SUBTYPE_WIFI_B /* 28 */:
                return new aKU();
            case ConnectionSubtype.SUBTYPE_WIFI_G /* 29 */:
                return new aKI();
            case ConnectionSubtype.SUBTYPE_WIFI_N /* 30 */:
                return new aKX(DetailsActivityAction.b, map);
            default:
                String str3 = "SPY-7518 - got unsupported suffix: " + str2;
                C1044Mm.d("NetflixComHandlerFact", str3);
                InterfaceC1598aHf.a(new C1596aHd(str3).b(false));
                return null;
        }
    }
}
