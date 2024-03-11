package o;

import android.content.Context;
import android.os.Handler;
import com.netflix.mediaclient.ngpstore.api.NgpStoreApi;
import com.netflix.mediaclient.service.user.UserAgent;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* renamed from: o.bqN  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4991bqN {
    C4991bqN() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<InterfaceC5283bvo> c(String str) {
        C1044Mm.a("nf_service_useragent", "populateListOfUserProfiles with json %s", str);
        if (C8168dfL.g(str)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = (JSONArray) new JSONTokener(str).nextValue();
            for (int i = 0; i < jSONArray.length(); i++) {
                aEY c = aEY.e.c(jSONArray.opt(i).toString());
                C1044Mm.a("nf_service_useragent", "has userprofile %s", c);
                C8177dfU.a(c, i, "build");
                arrayList.add(c);
            }
            return arrayList;
        } catch (JSONException e) {
            C1044Mm.d("nf_service_useragent", "error while populateListOfUserProfiles " + e);
            InterfaceC1597aHe.c("SPY-35474 error in buildListOfUserProfiles", e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Context context, List<InterfaceC5283bvo> list, List<InterfaceC5283bvo> list2) {
        JSONArray jSONArray = new JSONArray();
        boolean z = false;
        for (InterfaceC5283bvo interfaceC5283bvo : list) {
            try {
                JSONObject jsonObject = interfaceC5283bvo.toJsonObject();
                if (list2 != null && C8168dfL.g(interfaceC5283bvo.getAvatarUrl())) {
                    for (InterfaceC5283bvo interfaceC5283bvo2 : list2) {
                        if (interfaceC5283bvo.getProfileGuid().equals(interfaceC5283bvo2.getProfileGuid()) && !C8168dfL.g(interfaceC5283bvo2.getAvatarUrl())) {
                            InterfaceC1593aHa.b("Profile missing avatarUrl; using previous url");
                            jsonObject.put("avatarUrl", interfaceC5283bvo2.getAvatarUrl());
                        }
                    }
                }
                jSONArray.put(jsonObject.toString());
            } catch (JSONException unused) {
                z = true;
            }
            if (!interfaceC5283bvo.isProfileValid()) {
                z = true;
            }
        }
        if (z) {
            ArrayList arrayList = new ArrayList();
            for (InterfaceC5283bvo interfaceC5283bvo3 : list) {
                arrayList.add(interfaceC5283bvo3.toLoggingString());
            }
            InterfaceC1593aHa.b(arrayList.toString());
            InterfaceC1597aHe.b(new C1596aHd("Trying to persist invalid profiles").b(false));
            if (C8168dfL.h(C8157dfA.e(context, "useragent_userprofiles_data", (String) null))) {
                return;
            }
        }
        C8157dfA.a(context, "useragent_userprofiles_data", jSONArray.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(Context context, InterfaceC5282bvn interfaceC5282bvn) {
        C8157dfA.a(context, "useragent_user_data", interfaceC5282bvn.toString());
    }

    public static void a(Context context) {
        C8157dfA.e(context, "pref_ngp_logout_serviced_time", System.currentTimeMillis());
        C8157dfA.e.j(context);
    }

    public static boolean a(Context context, NgpStoreApi.d dVar) {
        long b = C8157dfA.b(context, "pref_ngp_logout_serviced_time", 0L);
        C1044Mm.c("nf_service_useragent", "%s onNgpStoreReadDone %s logOutServicedTime=%d", context.getPackageName(), dVar, Long.valueOf(b));
        if (dVar != null) {
            long j = dVar.a;
            if (j <= 0 || b >= j) {
                return false;
            }
            C1044Mm.c("nf_service_useragent", "%s shouldServiceSharedLogout will logout", context.getPackageName());
            a(context);
            return true;
        }
        return false;
    }

    public static void a(Handler handler, final boolean z, final UserAgent.b bVar) {
        handler.post(new Runnable() { // from class: o.bqN.3
            @Override // java.lang.Runnable
            public void run() {
                UserAgent.b.this.d(z);
            }
        });
    }
}
