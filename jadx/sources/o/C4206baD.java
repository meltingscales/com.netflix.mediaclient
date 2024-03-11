package o;

import android.content.Context;
import android.os.Handler;
import com.netflix.cl.ExtLogger;
import com.netflix.cl.Logger;
import com.netflix.cl.util.CLUtils;
import com.netflix.cl.util.NamedLogSessionLookup;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.clutils.PlayContextImp;
import com.netflix.mediaclient.service.offline.agent.CreateRequest;
import com.netflix.mediaclient.service.offline.registry.OfflineRegistryInterface;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.servicemgr.interface_.offline.DownloadState;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.baD  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C4206baD {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Handler handler, String str) {
    }

    C4206baD() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<String> e(List<InterfaceC4290bbi> list) {
        ArrayList arrayList = new ArrayList();
        for (InterfaceC4290bbi interfaceC4290bbi : list) {
            if (interfaceC4290bbi.au_() == DownloadState.Complete) {
                arrayList.add(interfaceC4290bbi.aH_());
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean e(long j, String str, List<InterfaceC4290bbi> list) {
        long j2 = 50000000;
        for (InterfaceC4290bbi interfaceC4290bbi : list) {
            if (interfaceC4290bbi.au_() != DownloadState.Complete && interfaceC4290bbi.d().startsWith(str)) {
                j2 += interfaceC4290bbi.aP_() - interfaceC4290bbi.h();
            }
        }
        if (j2 > j) {
            C1044Mm.d("nf_offlineAgent", "ensureEnoughDiskSpaceForNewRequest freeSpaceNeeded=" + j2 + " freeSpace=" + j);
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static InterfaceC4290bbi d(String str, List<InterfaceC4290bbi> list) {
        if (str == null) {
            return null;
        }
        for (InterfaceC4290bbi interfaceC4290bbi : list) {
            if (str.equals(interfaceC4290bbi.aH_())) {
                return interfaceC4290bbi;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean d(UserAgent userAgent, OfflineRegistryInterface offlineRegistryInterface) {
        String n = userAgent.n();
        String h = offlineRegistryInterface.h();
        if (C8168dfL.h(n) && C8168dfL.h(h) && !n.equals(h)) {
            C1044Mm.d("nf_offlineAgent", "primaryProfileGuid don't match... going to delete all content");
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Map<String, Boolean> map, List<InterfaceC4290bbi> list) {
        if (map == null || map.size() <= 0) {
            return;
        }
        for (InterfaceC4290bbi interfaceC4290bbi : list) {
            Boolean bool = map.get(interfaceC4290bbi.aH_());
            if (bool != null) {
                interfaceC4290bbi.i().b(!bool.booleanValue());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static InterfaceC4290bbi a(List<InterfaceC4290bbi> list) {
        for (InterfaceC4290bbi interfaceC4290bbi : list) {
            if (interfaceC4290bbi.au_() == DownloadState.Creating) {
                return interfaceC4290bbi;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(Context context) {
        return System.currentTimeMillis() - C8157dfA.b(context, "pref_offline_license_sync_time", 0L) > TimeUnit.HOURS.toMillis(24L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(Context context) {
        C8157dfA.e(context, "pref_offline_license_sync_time", 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(Context context) {
        C8157dfA.e(context, "pref_offline_license_sync_time", System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(Context context) {
        return C8157dfA.d(context, "pref_offline_license_sync_count_zero", 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(Context context, int i) {
        C8157dfA.a(context, "pref_offline_license_sync_count_zero", i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:5:0x000a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean c(java.util.List<o.InterfaceC4290bbi> r3) {
        /*
            java.util.Iterator r3 = r3.iterator()
        L4:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L22
            java.lang.Object r0 = r3.next()
            o.bbi r0 = (o.InterfaceC4290bbi) r0
            com.netflix.mediaclient.servicemgr.interface_.offline.DownloadState r1 = r0.au_()
            com.netflix.mediaclient.servicemgr.interface_.offline.DownloadState r2 = com.netflix.mediaclient.servicemgr.interface_.offline.DownloadState.Creating
            if (r1 == r2) goto L20
            com.netflix.mediaclient.servicemgr.interface_.offline.DownloadState r0 = r0.au_()
            com.netflix.mediaclient.servicemgr.interface_.offline.DownloadState r1 = com.netflix.mediaclient.servicemgr.interface_.offline.DownloadState.CreateFailed
            if (r0 != r1) goto L4
        L20:
            r3 = 1
            return r3
        L22:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C4206baD.c(java.util.List):boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<AbstractC4561bgo> b(List<InterfaceC4299bbr> list) {
        ArrayList arrayList = new ArrayList();
        for (InterfaceC4299bbr interfaceC4299bbr : list) {
            AbstractC4561bgo s = interfaceC4299bbr.s();
            if (s != null && C8168dfL.h(s.d())) {
                arrayList.add(s);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Status status, InterfaceC4290bbi interfaceC4290bbi) {
        String y = interfaceC4290bbi.y();
        if (interfaceC4290bbi.au_() != DownloadState.Complete) {
            CLUtils.cancelNamedSession(y);
        }
        Long removeSessionId = NamedLogSessionLookup.INSTANCE.removeSessionId(y);
        if (status.i()) {
            ExtLogger.INSTANCE.failedAction(removeSessionId, C8169dfM.d(status));
        } else {
            Logger.INSTANCE.endSession(removeSessionId);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map<String, InterfaceC5206buQ> d(List<InterfaceC4290bbi> list) {
        HashMap hashMap = new HashMap();
        for (InterfaceC4290bbi interfaceC4290bbi : list) {
            hashMap.put(interfaceC4290bbi.aH_(), interfaceC4290bbi);
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean d(InterfaceC4299bbr interfaceC4299bbr, List<C4281bbZ> list) {
        for (C4281bbZ c4281bbZ : list) {
            if (c4281bbZ.i() == interfaceC4299bbr.n()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String c(InterfaceC4299bbr interfaceC4299bbr) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("playableId", interfaceC4299bbr.h());
            jSONObject.put("oxid", interfaceC4299bbr.i());
            jSONObject.put("dxid", interfaceC4299bbr.g());
            jSONObject.put("downloadState", interfaceC4299bbr.t().b());
            jSONObject.put("stopReason", interfaceC4299bbr.H().e());
            jSONObject.put("timeStateChanged", interfaceC4299bbr.M());
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static InterfaceC5283bvo b(UserAgent userAgent, CreateRequest createRequest) {
        InterfaceC5283bvo j = userAgent.j();
        if (j != null && createRequest.b.equals(j.getProfileGuid())) {
            InterfaceC1593aHa.b("SPY-35474 currentProfile matches with requestProfile");
            return j;
        }
        InterfaceC5283bvo e = e(userAgent, createRequest.b);
        InterfaceC1593aHa.b("SPY-35474 currentProfile does not match with requestProfile");
        return e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(UserAgent userAgent, InterfaceC4290bbi interfaceC4290bbi, C4242ban c4242ban) {
        String u = interfaceC4290bbi.u();
        if (e(userAgent, u) != null) {
            c4242ban.d(u);
        }
    }

    private static InterfaceC5283bvo e(UserAgent userAgent, String str) {
        List<? extends InterfaceC5283bvo> b = userAgent.b();
        if (b != null) {
            for (InterfaceC5283bvo interfaceC5283bvo : new ArrayList(b)) {
                if (str.equals(interfaceC5283bvo.getProfileGuid())) {
                    return interfaceC5283bvo;
                }
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(String str, List<InterfaceC4290bbi> list) {
        for (InterfaceC4290bbi interfaceC4290bbi : list) {
            if (C4284bbc.b(interfaceC4290bbi.aQ_(), str)) {
                return true;
            }
        }
        return false;
    }

    static boolean d(InterfaceC4290bbi interfaceC4290bbi, String str) {
        C4284bbc aQ_ = interfaceC4290bbi.aQ_();
        if (aQ_ != null) {
            C1044Mm.c("nf_offlineAgent", "hasWidevineLevelChanged %s %s -> %s", interfaceC4290bbi.aH_(), C4284bbc.b(aQ_), str);
        }
        return C4284bbc.b(aQ_, str);
    }

    static boolean d(InterfaceC4290bbi interfaceC4290bbi) {
        C4284bbc aQ_ = interfaceC4290bbi.aQ_();
        if (aQ_ == null || aQ_.c > 540) {
            C1044Mm.c("nf_offlineAgent", "isLicenseReplaceable license not replaceable %s", C4284bbc.b(aQ_));
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C4242ban e(InterfaceC4290bbi interfaceC4290bbi) {
        return new C4242ban(interfaceC4290bbi.aH_(), new PlayContextImp(interfaceC4290bbi.n(), interfaceC4290bbi.l(), interfaceC4290bbi.as_(), interfaceC4290bbi.at_()), VideoType.create(interfaceC4290bbi.bc_()), false, interfaceC4290bbi.s());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<String> c(String str) {
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            arrayList.add(str);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C4225baW d(List<InterfaceC4290bbi> list, String str) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (InterfaceC4290bbi interfaceC4290bbi : list) {
            if (interfaceC4290bbi.au_() == DownloadState.Complete && d(interfaceC4290bbi, str)) {
                if (d(interfaceC4290bbi)) {
                    C1044Mm.c("nf_offlineAgent", "createLicenseReplaceOrDownloadList Ab52550:4, replacing %s", interfaceC4290bbi.aH_());
                    arrayList.add(interfaceC4290bbi.aH_());
                } else {
                    C1044Mm.c("nf_offlineAgent", "createLicenseReplaceOrDownloadList Ab52550:4, re-downloading %s", interfaceC4290bbi.aH_());
                    arrayList2.add(interfaceC4290bbi);
                }
            }
        }
        return new C4225baW(arrayList, arrayList2);
    }
}
