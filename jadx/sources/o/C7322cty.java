package o;

import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: o.cty  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7322cty {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<C7460cwd> e(String str, List<C7460cwd> list) {
        ArrayList arrayList = new ArrayList();
        for (C7460cwd c7460cwd : list) {
            if (str.equals(c7460cwd.ay()) && (c7460cwd.V() == VideoType.MOVIE.getKey() || c7460cwd.V() == VideoType.EPISODE.getKey())) {
                arrayList.add(c7460cwd);
            }
        }
        return arrayList;
    }

    public static List<C7460cwd> b(String str, List<C7460cwd> list, String str2) {
        ArrayList arrayList = new ArrayList();
        for (C7460cwd c7460cwd : list) {
            if (str.equals(c7460cwd.ay()) && str2.equals(c7460cwd.aO_()) && c7460cwd.V() == VideoType.EPISODE.getKey()) {
                arrayList.add(c7460cwd);
            }
        }
        Collections.sort(arrayList, new Comparator() { // from class: o.ctF
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int b;
                b = C7322cty.b((C7460cwd) obj, (C7460cwd) obj2);
                return b;
            }
        });
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int b(C7460cwd c7460cwd, C7460cwd c7460cwd2) {
        int aw_;
        int aw_2;
        if (c7460cwd.aE_().x() != c7460cwd2.aE_().x()) {
            aw_ = c7460cwd.aE_().x();
            aw_2 = c7460cwd2.aE_().x();
        } else {
            aw_ = c7460cwd.aE_().aw_();
            aw_2 = c7460cwd2.aE_().aw_();
        }
        return aw_ - aw_2;
    }

    public static C7460cwd b(String str, List<C7460cwd> list) {
        for (C7460cwd c7460cwd : list) {
            if (str != null && str.equals(c7460cwd.getId()) && c7460cwd.V() == VideoType.SHOW.getKey()) {
                return c7460cwd;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<C7460cwd> a(Map<String, InterfaceC5206buQ> map, List<C5327bwf> list) {
        InterfaceC5206buQ interfaceC5206buQ;
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            C1044Mm.a("offlineFalkorUtils", "buildOfflineVideoDetailList skipping falkorData not found");
            return arrayList;
        }
        HashMap hashMap = new HashMap();
        for (C5327bwf c5327bwf : list) {
            hashMap.put(c5327bwf.aq, c5327bwf);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            C5327bwf c5327bwf2 = (C5327bwf) entry.getValue();
            C5327bwf c5327bwf3 = (C5327bwf) hashMap.get(c5327bwf2.T);
            if (c5327bwf3 == null) {
                C1044Mm.a("offlineFalkorUtils", "buildOfflineVideoDetailList skipping parent not found");
            } else {
                if (c5327bwf2.ao == VideoType.EPISODE.getKey() || c5327bwf2.ao == VideoType.MOVIE.getKey()) {
                    InterfaceC5206buQ interfaceC5206buQ2 = map.get(entry.getKey());
                    if (interfaceC5206buQ2 == null) {
                        C1044Mm.c("offlineFalkorUtils", "buildOfflineVideoDetailList skipping, OfflinePlayableViewData not found %s %s", entry.getKey(), c5327bwf2.am);
                    } else {
                        interfaceC5206buQ = interfaceC5206buQ2;
                    }
                } else {
                    interfaceC5206buQ = null;
                }
                arrayList.add(new C7460cwd((C5327bwf) entry.getValue(), interfaceC5206buQ, c5327bwf3));
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<C5327bwf> c(List<InterfaceC5206buQ> list) {
        ArrayList arrayList = new ArrayList();
        for (InterfaceC5206buQ interfaceC5206buQ : list) {
            C5327bwf c5327bwf = new C5327bwf();
            c5327bwf.aq = interfaceC5206buQ.aH_();
            c5327bwf.V = interfaceC5206buQ.aN_();
            arrayList.add(c5327bwf);
        }
        return arrayList;
    }

    public static List<InterfaceC7464cwh> a(List<C5336bwo> list) {
        ArrayList arrayList = new ArrayList();
        for (C5336bwo c5336bwo : list) {
            arrayList.add(new C7462cwf(c5336bwo));
        }
        return arrayList;
    }
}
