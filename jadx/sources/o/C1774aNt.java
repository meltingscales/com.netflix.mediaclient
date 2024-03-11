package o;

import com.google.gson.JsonObject;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.cdx.api.NavigationCommand;
import com.netflix.mediaclient.cdx.api.Route;
import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: o.aNt  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1774aNt extends C1045Mp {
    public static final C1774aNt c = new C1774aNt();

    private C1774aNt() {
        super("nf_cdx_util");
    }

    private final JsonObject j(C1772aNr c1772aNr) {
        JsonObject jsonObject = new JsonObject();
        C1777aNw d = c1772aNr.d();
        if (d != null) {
            jsonObject.addProperty("companionSessionId", d.c());
        }
        return jsonObject;
    }

    private final JsonObject g(C1772aNr c1772aNr) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("friendlyName", c1772aNr.e());
        C1777aNw d = c1772aNr.d();
        if (d != null) {
            jsonObject.addProperty("companionSessionId", d.c());
        }
        return jsonObject;
    }

    public final C1787aOf i(C1772aNr c1772aNr) {
        C8632dsu.c((Object) c1772aNr, "");
        return new C1787aOf(c1772aNr.b(), c1772aNr.c().a());
    }

    public final C1785aOd b(C1772aNr c1772aNr, NavigationCommand navigationCommand) {
        C8632dsu.c((Object) c1772aNr, "");
        C8632dsu.c((Object) navigationCommand, "");
        int b = c1772aNr.b();
        String a = c1772aNr.c().a();
        JsonObject j = j(c1772aNr);
        j.addProperty("cmd", navigationCommand.name());
        dpR dpr = dpR.c;
        return new C1785aOd(b, a, j);
    }

    public final aNU e(C1772aNr c1772aNr) {
        C8632dsu.c((Object) c1772aNr, "");
        return new aNU(c1772aNr.b(), c1772aNr.c().a(), j(c1772aNr));
    }

    public final C1791aOj b(C1772aNr c1772aNr, String str) {
        C8632dsu.c((Object) c1772aNr, "");
        C8632dsu.c((Object) str, "");
        int b = c1772aNr.b();
        String a = c1772aNr.c().a();
        JsonObject j = j(c1772aNr);
        j.addProperty("component", "Search");
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("term", str);
        dpR dpr = dpR.c;
        j.add("params", jsonObject);
        return new C1791aOj(b, a, j);
    }

    public final C1783aOb c(C1772aNr c1772aNr, String str) {
        C8632dsu.c((Object) c1772aNr, "");
        C8632dsu.c((Object) str, "");
        int b = c1772aNr.b();
        String a = c1772aNr.c().a();
        JsonObject j = j(c1772aNr);
        j.addProperty(SignupConstants.Field.VIDEO_ID, str);
        dpR dpr = dpR.c;
        return new C1783aOb(b, a, j);
    }

    public final C1790aOi c(C1772aNr c1772aNr, Route route) {
        C8632dsu.c((Object) c1772aNr, "");
        C8632dsu.c((Object) route, "");
        int b = c1772aNr.b();
        String a = c1772aNr.c().a();
        JsonObject j = j(c1772aNr);
        j.addProperty("component", route.name());
        dpR dpr = dpR.c;
        return new C1790aOi(b, a, j);
    }

    public final aNZ b(C1772aNr c1772aNr) {
        C8632dsu.c((Object) c1772aNr, "");
        return new aNZ(c1772aNr.b(), c1772aNr.c().a(), g(c1772aNr));
    }

    public final aNX c(C1772aNr c1772aNr) {
        C8632dsu.c((Object) c1772aNr, "");
        return new aNX(c1772aNr.b(), c1772aNr.c().a(), g(c1772aNr));
    }

    public final C1795aOn b(C1772aNr c1772aNr, boolean z) {
        C8632dsu.c((Object) c1772aNr, "");
        int b = c1772aNr.b();
        String a = c1772aNr.c().a();
        JsonObject j = j(c1772aNr);
        j.addProperty("enabled", Boolean.valueOf(z));
        dpR dpr = dpR.c;
        return new C1795aOn(b, a, j);
    }

    public final C1788aOg a(C1772aNr c1772aNr, String str, String str2) {
        C8632dsu.c((Object) c1772aNr, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        int b = c1772aNr.b();
        String a = c1772aNr.c().a();
        JsonObject j = j(c1772aNr);
        j.addProperty("audioTrackId", str);
        j.addProperty("timedTextTrackId", str2);
        dpR dpr = dpR.c;
        return new C1788aOg(b, a, j);
    }

    public final C1784aOc d(C1772aNr c1772aNr) {
        C8632dsu.c((Object) c1772aNr, "");
        return new C1784aOc(c1772aNr.b(), c1772aNr.c().a(), j(c1772aNr));
    }

    public final C1794aOm h(C1772aNr c1772aNr) {
        C8632dsu.c((Object) c1772aNr, "");
        return new C1794aOm(c1772aNr.b(), c1772aNr.c().a(), j(c1772aNr));
    }

    public final C1796aOo e(C1772aNr c1772aNr, String str) {
        C8632dsu.c((Object) c1772aNr, "");
        C8632dsu.c((Object) str, "");
        int b = c1772aNr.b();
        String a = c1772aNr.c().a();
        JsonObject j = j(c1772aNr);
        j.addProperty("viewableId", str);
        dpR dpr = dpR.c;
        return new C1796aOo(b, a, j);
    }

    public final C1792aOk f(C1772aNr c1772aNr) {
        C8632dsu.c((Object) c1772aNr, "");
        int b = c1772aNr.b();
        String a = c1772aNr.c().a();
        JsonObject j = j(c1772aNr);
        j.addProperty("cmd", "subscribeToPlayer");
        dpR dpr = dpR.c;
        return new C1792aOk(b, a, j);
    }

    public final C1789aOh a(C1772aNr c1772aNr, String str) {
        C8632dsu.c((Object) c1772aNr, "");
        C8632dsu.c((Object) str, "");
        int b = c1772aNr.b();
        String a = c1772aNr.c().a();
        JsonObject j = j(c1772aNr);
        j.addProperty("profileGUID", str);
        dpR dpr = dpR.c;
        return new C1789aOh(b, a, j);
    }

    public final aNY a(C1772aNr c1772aNr, UD ud) {
        C8632dsu.c((Object) c1772aNr, "");
        C8632dsu.c((Object) ud, "");
        int b = c1772aNr.b();
        String a = c1772aNr.c().a();
        JsonObject j = j(c1772aNr);
        j.add(SignupConstants.Error.DEBUG_INFO_ACTION, c.a(ud));
        dpR dpr = dpR.c;
        return new aNY(b, a, j);
    }

    private final JsonObject a(UD ud) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("type", ud.b());
        if (ud instanceof C1257Us) {
            JsonObject jsonObject2 = new JsonObject();
            jsonObject2.addProperty("currentTime", Long.valueOf(((C1257Us) ud).d()));
            jsonObject.add(NotificationFactory.DATA, jsonObject2);
        } else if (ud instanceof UB) {
            JsonObject jsonObject3 = new JsonObject();
            jsonObject3.addProperty("rating", Integer.valueOf(((UB) ud).a().c()));
            jsonObject.add(NotificationFactory.DATA, jsonObject3);
        }
        return jsonObject;
    }

    public final C1786aOe a(C1772aNr c1772aNr) {
        C8632dsu.c((Object) c1772aNr, "");
        int b = c1772aNr.b();
        String a = c1772aNr.c().a();
        JsonObject g = g(c1772aNr);
        g.addProperty("deviceType", "mobileCompanion");
        dpR dpr = dpR.c;
        return new C1786aOe(b, a, g);
    }

    public final List<C1258Ut> e(JSONArray jSONArray) {
        C8654dtp g;
        int B;
        C8632dsu.c((Object) jSONArray, "");
        ArrayList arrayList = new ArrayList();
        g = C8657dts.g(0, jSONArray.length());
        B = C8576dqs.B(g);
        for (int i = 0; i < B; i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            String optString = jSONObject.optString("trackId", "");
            String optString2 = jSONObject.optString("languageDescription", "");
            C8632dsu.d((Object) optString);
            C8632dsu.d((Object) optString2);
            arrayList.add(new C1258Ut(optString, optString2));
        }
        return arrayList;
    }
}
