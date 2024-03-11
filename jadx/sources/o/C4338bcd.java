package o;

import android.util.Base64;
import com.google.gson.Gson;
import com.netflix.mediaclient.service.offline.agent.CreateRequest;
import com.netflix.mediaclient.service.offline.download.DownloadableType;
import com.netflix.mediaclient.service.player.bladerunnerclient.OfflineLicenseResponse;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.servicemgr.interface_.offline.DownloadState;
import com.netflix.mediaclient.storage.db.entity.DownloadablePersistentData;
import com.netflix.mediaclient.util.ConnectivityUtils;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: o.bcd  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4338bcd {
    public static boolean c(int i) {
        return i == 420;
    }

    public static boolean e(int i) {
        return i == 403 || i == 404;
    }

    public static boolean b(InterfaceC4290bbi interfaceC4290bbi) {
        return interfaceC4290bbi.au_() == DownloadState.Stopped && interfaceC4290bbi.a();
    }

    public static boolean e(InterfaceC4290bbi interfaceC4290bbi) {
        return interfaceC4290bbi.au_() == DownloadState.InProgress;
    }

    public static List<String> b(List<DownloadablePersistentData> list) {
        ArrayList arrayList = new ArrayList();
        for (DownloadablePersistentData downloadablePersistentData : list) {
            arrayList.add(downloadablePersistentData.mDownloadableId);
        }
        return arrayList;
    }

    public static String d(byte[] bArr) {
        try {
            return new String(Base64.encode(bArr, 0), "utf-8");
        } catch (UnsupportedEncodingException e) {
            C1044Mm.b("nf_offlineUtils", e, "keySetIdToString UnsupportedEncodingException", new Object[0]);
            return "";
        }
    }

    public static byte[] b(InterfaceC4299bbr interfaceC4299bbr) {
        if (C8168dfL.h(interfaceC4299bbr.u())) {
            return e(interfaceC4299bbr.u());
        }
        return null;
    }

    private static byte[] e(String str) {
        try {
            return Base64.decode(str.getBytes("utf-8"), 0);
        } catch (UnsupportedEncodingException e) {
            C1044Mm.b("nf_offlineUtils", e, "keySetIdFromString UnsupportedEncodingException", new Object[0]);
            return new byte[0];
        }
    }

    public static boolean d(String str) {
        File file = new File(str);
        if (file.exists()) {
            return C8054ddD.d(file);
        }
        return true;
    }

    public static boolean c(InterfaceC4525bgE interfaceC4525bgE) {
        long currentTimeMillis = System.currentTimeMillis() - interfaceC4525bgE.X();
        if (currentTimeMillis > 0) {
            C1044Mm.d("nf_offlineUtils", "manifestExpired by " + TimeUnit.MILLISECONDS.toSeconds(currentTimeMillis) + " seconds");
            return true;
        }
        return false;
    }

    public static boolean b(InterfaceC4299bbr interfaceC4299bbr, List<C4222baT> list, List<C4261bbF> list2, List<C4307bbz> list3, List<C4304bbw> list4) {
        if (list.size() != interfaceC4299bbr.l().size()) {
            C1044Mm.d("nf_offlineUtils", "missing audio downloadables. expected=" + interfaceC4299bbr.l().size() + " got=" + list.size());
            return false;
        } else if (list2.size() != interfaceC4299bbr.L().size()) {
            C1044Mm.d("nf_offlineUtils", "missing video downloadables. expected=" + interfaceC4299bbr.L().size() + " got=" + list2.size());
            return false;
        } else if (list3.size() != interfaceC4299bbr.K().size()) {
            C1044Mm.d("nf_offlineUtils", "missing timed-text downloadables. expected=" + interfaceC4299bbr.K().size() + " got=" + list3.size());
            return false;
        } else if (list4.size() != interfaceC4299bbr.J().size()) {
            C1044Mm.d("nf_offlineUtils", "missing tickPlay downloadables. expected=" + interfaceC4299bbr.J().size() + " got=" + list4.size());
            return false;
        } else {
            return true;
        }
    }

    private static void d(List<File> list, String str, List<DownloadablePersistentData> list2, DownloadableType downloadableType) {
        for (DownloadablePersistentData downloadablePersistentData : list2) {
            list.add(C4336bcb.c(str, downloadablePersistentData.mDownloadableId, downloadableType));
        }
    }

    public static boolean a(String str, InterfaceC4299bbr interfaceC4299bbr) {
        C1044Mm.a("nf_offlineUtils", "deleteAllDownloadables");
        ArrayList<File> arrayList = new ArrayList();
        d(arrayList, str, interfaceC4299bbr.l(), DownloadableType.Audio);
        d(arrayList, str, interfaceC4299bbr.L(), DownloadableType.Video);
        d(arrayList, str, interfaceC4299bbr.K(), DownloadableType.Subtitle);
        d(arrayList, str, interfaceC4299bbr.J(), DownloadableType.TrickPlay);
        while (true) {
            boolean z = true;
            for (File file : arrayList) {
                if (file.exists()) {
                    boolean delete = file.delete();
                    if (!z || !delete) {
                        z = false;
                    }
                }
            }
            return z;
        }
    }

    public static C1980aVk c(InterfaceC4299bbr interfaceC4299bbr) {
        return new C1980aVk(interfaceC4299bbr.i(), interfaceC4299bbr.j(), interfaceC4299bbr.a(), interfaceC4299bbr.b(), interfaceC4299bbr.c(), interfaceC4299bbr.e(), interfaceC4299bbr.d());
    }

    public static boolean d(ConnectivityUtils.NetType netType) {
        return (netType == null || netType == ConnectivityUtils.NetType.mobile) ? false : true;
    }

    public static boolean c(ConnectivityUtils.NetType netType) {
        return (netType == null || netType == ConnectivityUtils.NetType.mobile) ? false : true;
    }

    public static void a(OfflineLicenseResponse offlineLicenseResponse, InterfaceC4299bbr interfaceC4299bbr) {
        Gson a = C8118deO.a();
        interfaceC4299bbr.a(offlineLicenseResponse.b);
        interfaceC4299bbr.e(offlineLicenseResponse.t);
        interfaceC4299bbr.a(d(offlineLicenseResponse.d));
        interfaceC4299bbr.d(offlineLicenseResponse.d());
        interfaceC4299bbr.d(offlineLicenseResponse.n);
        interfaceC4299bbr.a(offlineLicenseResponse.k);
        interfaceC4299bbr.c(offlineLicenseResponse.j);
        interfaceC4299bbr.b(offlineLicenseResponse.f13210o);
        interfaceC4299bbr.j(offlineLicenseResponse.s);
        interfaceC4299bbr.i(offlineLicenseResponse.q);
        interfaceC4299bbr.d(a.toJson(offlineLicenseResponse.g));
        interfaceC4299bbr.b(a.toJson(offlineLicenseResponse.i));
        interfaceC4299bbr.c(a.toJson(offlineLicenseResponse.f));
        interfaceC4299bbr.e(a.toJson(offlineLicenseResponse.h));
    }

    public static String e(InterfaceC4297bbp interfaceC4297bbp) {
        if (CreateRequest.DownloadRequestType.DownloadForYou.a().equals(interfaceC4297bbp.f())) {
            String j = interfaceC4297bbp.j();
            if (C8168dfL.g(j)) {
                return null;
            }
            UserAgent k = AbstractApplicationC1040Mh.getInstance().i().k();
            if (k == null || k.e(j) != null) {
                return j;
            }
            return null;
        }
        return null;
    }
}
