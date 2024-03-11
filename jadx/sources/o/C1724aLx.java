package o;

import android.content.Intent;
import android.net.Uri;
import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.context.DeepLinkInput;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.protocol.nflx.NflxHandler;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: o.aLx  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1724aLx {
    public static NflxHandler b(NetflixActivity netflixActivity, Intent intent, long j) {
        if (netflixActivity.getServiceManager() != null) {
            C8194dfl.a(intent);
        }
        C1044Mm.b("NflxHandler", "Handle NFLX intent starts...%s", intent);
        if (intent == null) {
            C1044Mm.b("NflxHandler", "null intent");
            return new C1726aLz();
        } else if (!"android.intent.action.VIEW".equalsIgnoreCase(intent.getAction())) {
            C1044Mm.b("NflxHandler", "unknown action");
            return new C1726aLz();
        } else if (intent.getData() == null) {
            C1044Mm.b("NflxHandler", "no uri");
            return new C1726aLz();
        } else {
            C1044Mm.b("NflxHandler", intent);
            return c(netflixActivity, intent.getData(), j);
        }
    }

    public static NflxHandler c(NetflixActivity netflixActivity, Uri uri, long j) {
        C8143den.a("NflxHandler", uri);
        if ("http".equalsIgnoreCase(uri.getScheme()) && "movi.es".equalsIgnoreCase(uri.getHost())) {
            return d(netflixActivity, uri.toString(), j);
        }
        if (!"nflx".equalsIgnoreCase(uri.getScheme())) {
            C1044Mm.b("NflxHandler", "unknown scheme");
            return new C1726aLz();
        } else if (!"www.netflix.com".equalsIgnoreCase(uri.getHost())) {
            C1044Mm.b("NflxHandler", "invalid host");
            return new C1726aLz();
        } else if (!"/browse".equalsIgnoreCase(uri.getPath())) {
            C1044Mm.b("NflxHandler", "invalid path");
            return new C1726aLz();
        } else {
            String queryParameter = uri.getQueryParameter("q");
            if (C8168dfL.g(queryParameter)) {
                C1044Mm.b("NflxHandler", "no nflx params");
                return new C1726aLz();
            }
            return e(netflixActivity, queryParameter, j);
        }
    }

    private static NflxHandler e(NetflixActivity netflixActivity, String str, long j) {
        String[] split = str.split("[?&]");
        HashMap hashMap = new HashMap();
        for (String str2 : split) {
            int indexOf = str2.indexOf("=");
            if (indexOf <= 0) {
                C1044Mm.j("NflxHandler", "No params found for: " + str2);
            } else {
                hashMap.put(str2.substring(0, indexOf), str2.substring(indexOf + 1));
            }
        }
        return a(netflixActivity, hashMap, j, str);
    }

    private static NflxHandler a(NetflixActivity netflixActivity, Map<String, String> map, long j, String str) {
        NflxHandler c1726aLz;
        AppView appView;
        boolean z;
        if (map.size() <= 0) {
            C1044Mm.j("NflxHandler", "no params exist");
            return new C1726aLz();
        } else if (map.get("profileGate") != null) {
            return new aLC(netflixActivity, map, j);
        } else {
            String e = C8194dfl.e(map);
            if (e == null) {
                C1044Mm.j("NflxHandler", "Action is null!");
                return new C1726aLz();
            }
            String lowerCase = e.toLowerCase(Locale.US);
            NflxHandler.Response response = NflxHandler.Response.HANDLING;
            if ("home".equalsIgnoreCase(lowerCase)) {
                C1044Mm.b("NflxHandler", "handleHomeAction starts...");
                appView = AppView.browseTitles;
                c1726aLz = new C1722aLv(netflixActivity, map);
            } else {
                if (C8194dfl.a(lowerCase)) {
                    C1044Mm.b("NflxHandler", "handle play starts...");
                    appView = AppView.playback;
                    c1726aLz = new aLE(netflixActivity, map);
                } else if (C8194dfl.f(lowerCase)) {
                    C1044Mm.b("NflxHandler", "view details starts...");
                    Logger.INSTANCE.addContext(new DeepLinkInput(Boolean.FALSE, b(map), Double.valueOf(1.0d)));
                    appView = AppView.movieDetails;
                    c1726aLz = new aLG(netflixActivity, map);
                } else if (C8194dfl.c(lowerCase)) {
                    C1044Mm.b("NflxHandler", "genre starts...");
                    appView = AppView.browseTitles;
                    c1726aLz = new C1721aLu(netflixActivity, map);
                } else if ("search".equalsIgnoreCase(lowerCase)) {
                    C1044Mm.b("NflxHandler", "search starts...");
                    appView = AppView.search;
                    c1726aLz = new aLB(netflixActivity, map);
                } else if ("sync".equalsIgnoreCase(lowerCase)) {
                    C1044Mm.b("NflxHandler", "sync starts...");
                    appView = AppView.browseTitles;
                    c1726aLz = new aLD(netflixActivity, map);
                } else if ("iq".equalsIgnoreCase(lowerCase)) {
                    C1044Mm.b("NflxHandler", "Add to instant queue starts...");
                    Logger.INSTANCE.addContext(new DeepLinkInput(Boolean.FALSE, b(map), Double.valueOf(1.0d)));
                    appView = AppView.movieDetails;
                    c1726aLz = new C1717aLq(netflixActivity, map);
                } else if ("download".equalsIgnoreCase(lowerCase)) {
                    C1044Mm.b("NflxHandler", "Add to donwload queue starts...");
                    appView = AppView.movieDetails;
                    c1726aLz = new C1719aLs(netflixActivity, map);
                } else {
                    C1044Mm.j("NflxHandler", "Unknown Nflx action: " + lowerCase);
                    c1726aLz = new C1726aLz();
                    appView = null;
                    response = NflxHandler.Response.NOT_HANDLING;
                }
                z = false;
                C8194dfl.b(netflixActivity, response, z, appView, j);
                return c1726aLz;
            }
            z = true;
            C8194dfl.b(netflixActivity, response, z, appView, j);
            return c1726aLz;
        }
    }

    private static String b(Map<String, String> map) {
        String str = map.get("movieid");
        return C8168dfL.h(str) ? str : C8194dfl.c(map);
    }

    private static NflxHandler d(NetflixActivity netflixActivity, String str, long j) {
        netflixActivity.getServiceManager().h();
        C1044Mm.b("NflxHandler", "view details from tiny url starts...");
        Logger.INSTANCE.addContext(new DeepLinkInput(Boolean.FALSE, str, Double.valueOf(1.0d)));
        str.contains("source=android");
        HashMap hashMap = new HashMap();
        hashMap.put("u", str);
        C8194dfl.b(netflixActivity, NflxHandler.Response.HANDLING, false, AppView.movieDetails, j);
        return new aLG(netflixActivity, hashMap);
    }
}
