package o;

import android.net.Uri;
import com.netflix.cl.model.android.MinusOneCardType;
import com.netflix.cl.model.android.MinusOneRequestType;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.service.pservice.PDiskData;
import java.util.List;

/* renamed from: o.dlp  reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C8438dlp {
    public static String e(C4935bpK c4935bpK) {
        return c4935bpK.b ? c4935bpK.f : c4935bpK.a;
    }

    public static String a(C4935bpK c4935bpK) {
        return c4935bpK.b ? c4935bpK.m : c4935bpK.s;
    }

    public static boolean d(List<C4935bpK> list) {
        return list != null && list.size() > 0;
    }

    public static List<C4935bpK> c(List<C4935bpK> list, List<C4935bpK> list2) {
        if (list2 == null) {
            return list;
        }
        if (list != null && list.size() > 0) {
            list2.addAll(list);
        }
        return list2;
    }

    public static String b(String str, String str2) {
        return "source=" + str2 + "&" + str;
    }

    private static String e(String str, String str2, String str3, String str4) {
        Uri.Builder appendPath = Uri.parse("https://www.netflix.com/").buildUpon().appendPath(str);
        if (C8168dfL.h(str2)) {
            appendPath.appendPath(str2);
        }
        if (C8168dfL.h(str4)) {
            appendPath.encodedQuery(str4);
        }
        appendPath.appendQueryParameter(NetflixActivity.EXTRA_SOURCE, str3);
        return appendPath.toString();
    }

    public static String b(String str, String str2, String str3) {
        return e(SignupConstants.Field.VIDEO_TITLE, str, str2, str3);
    }

    public static String a(String str, String str2, String str3) {
        return e("watch", str, str2, str3);
    }

    public static String d(String str, String str2) {
        return e("browse", null, str, str2);
    }

    public static String e(PDiskData pDiskData, PDiskData.ListType listType) {
        return pDiskData.lomoTrackMap.get(listType.d());
    }

    public static String b(PDiskData pDiskData, PDiskData.ListType listType, String str, MinusOneCardType minusOneCardType, MinusOneRequestType minusOneRequestType) {
        StringBuilder sb = new StringBuilder();
        if (PDiskData.ListType.UNKNOWN != listType && pDiskData.lomoTrackMap.get(listType.d()) != null) {
            sb.append(pDiskData.lomoTrackMap.get(listType.d()));
            sb.append("&");
        }
        if (C8168dfL.h(str)) {
            sb.append("listName=");
            sb.append(str);
            sb.append("&");
        }
        if (minusOneCardType != null) {
            sb.append("cardType=");
            sb.append(minusOneCardType);
            sb.append("&");
        }
        if (minusOneRequestType != null) {
            sb.append("trigger=");
            sb.append(minusOneRequestType);
        }
        return sb.toString();
    }

    public static String b(PDiskData pDiskData, PDiskData.ListType listType) {
        return pDiskData.lomoMap.get(listType.d());
    }

    public static boolean c(PDiskData pDiskData) {
        if (pDiskData == null) {
            return false;
        }
        return d(pDiskData.billboardList) || d(pDiskData.cwList) || d(pDiskData.standardFirstList) || d(pDiskData.standardSecondList);
    }

    public static PDiskData.ListType e(PDiskData pDiskData, List<C4935bpK> list, boolean z) {
        if (!z) {
            return PDiskData.ListType.NON_MEMBER;
        }
        if (list == null || list.size() == 0) {
            return PDiskData.ListType.UNKNOWN;
        }
        String str = list.get(0).a;
        if (e(str, pDiskData.billboardList)) {
            return PDiskData.ListType.BILLBOARD;
        }
        if (e(str, pDiskData.cwList)) {
            return PDiskData.ListType.CW;
        }
        if (e(str, pDiskData.iqList)) {
            return PDiskData.ListType.IQ;
        }
        if (e(str, pDiskData.standardFirstList)) {
            return PDiskData.ListType.STANDARD_FIRST;
        }
        if (e(str, pDiskData.standardSecondList)) {
            return PDiskData.ListType.STANDARD_SECOND;
        }
        return PDiskData.ListType.NON_MEMBER;
    }

    private static boolean e(String str, List<C4935bpK> list) {
        if (list == null || list.size() == 0) {
            return false;
        }
        for (C4935bpK c4935bpK : list) {
            if (C8168dfL.d(str, c4935bpK.a)) {
                return true;
            }
        }
        return false;
    }
}
