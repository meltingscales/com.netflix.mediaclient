package o;

import com.netflix.mediaclient.ui.epoxymodels.api.controller.ControllerVideoDataOverrides;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;

/* loaded from: classes4.dex */
public final class bLJ {
    private final Map<ControllerVideoDataOverrides.VideoOverrideName, Pair<bLL, Set<Integer>>> a;

    public bLJ(bLL bll, int i) {
        Set a;
        Map<ControllerVideoDataOverrides.VideoOverrideName, Pair<bLL, Set<Integer>>> b;
        C8632dsu.c((Object) bll, "");
        ControllerVideoDataOverrides.VideoOverrideName e = bll.e();
        a = dqP.a(Integer.valueOf(i));
        b = dqD.b(new Pair(e, new Pair(bll, a)));
        this.a = b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private bLJ(Map<ControllerVideoDataOverrides.VideoOverrideName, ? extends Pair<? extends bLL, ? extends Set<Integer>>> map) {
        this.a = map;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
        r0 = o.C8576dqs.V(r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final o.bLJ b(o.bLL r4, int r5) {
        /*
            r3 = this;
            java.lang.String r0 = ""
            o.C8632dsu.c(r4, r0)
            java.util.Map<com.netflix.mediaclient.ui.epoxymodels.api.controller.ControllerVideoDataOverrides$VideoOverrideName, kotlin.Pair<o.bLL, java.util.Set<java.lang.Integer>>> r0 = r3.a
            com.netflix.mediaclient.ui.epoxymodels.api.controller.ControllerVideoDataOverrides$VideoOverrideName r1 = r4.e()
            java.lang.Object r0 = r0.get(r1)
            kotlin.Pair r0 = (kotlin.Pair) r0
            if (r0 == 0) goto L23
            java.lang.Object r0 = r0.a()
            java.util.Set r0 = (java.util.Set) r0
            if (r0 == 0) goto L23
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Set r0 = o.C8570dqm.v(r0)
            if (r0 != 0) goto L28
        L23:
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
        L28:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0.add(r5)
            java.util.Map<com.netflix.mediaclient.ui.epoxymodels.api.controller.ControllerVideoDataOverrides$VideoOverrideName, kotlin.Pair<o.bLL, java.util.Set<java.lang.Integer>>> r5 = r3.a
            java.util.Map r5 = o.dqF.d(r5)
            com.netflix.mediaclient.ui.epoxymodels.api.controller.ControllerVideoDataOverrides$VideoOverrideName r1 = r4.e()
            kotlin.Pair r2 = new kotlin.Pair
            r2.<init>(r4, r0)
            r5.put(r1, r2)
            o.bLJ r4 = new o.bLJ
            r4.<init>(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bLJ.b(o.bLL, int):o.bLJ");
    }

    public final Boolean a(ControllerVideoDataOverrides.VideoOverrideName videoOverrideName) {
        C8632dsu.c((Object) videoOverrideName, "");
        bLL e = e(videoOverrideName);
        bLM blm = e instanceof bLM ? (bLM) e : null;
        if (blm != null) {
            return blm.b();
        }
        return null;
    }

    private final bLL e(ControllerVideoDataOverrides.VideoOverrideName videoOverrideName) {
        Pair<bLL, Set<Integer>> pair = this.a.get(videoOverrideName);
        if (pair != null) {
            bLL b = pair.b();
            if (!pair.c().isEmpty()) {
                return b;
            }
            return null;
        }
        return null;
    }

    public final bLJ a(Set<Integer> set) {
        Set V;
        C8632dsu.c((Object) set, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<ControllerVideoDataOverrides.VideoOverrideName, Pair<bLL, Set<Integer>>> entry : this.a.entrySet()) {
            ControllerVideoDataOverrides.VideoOverrideName key = entry.getKey();
            Pair<bLL, Set<Integer>> value = entry.getValue();
            bLL b = value.b();
            V = C8576dqs.V(value.c());
            V.removeAll(set);
            if (!V.isEmpty()) {
                linkedHashMap.put(key, new Pair(b, V));
            }
        }
        if (!linkedHashMap.isEmpty()) {
            return new bLJ(linkedHashMap);
        }
        return null;
    }

    public String toString() {
        Map<ControllerVideoDataOverrides.VideoOverrideName, Pair<bLL, Set<Integer>>> map = this.a;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<ControllerVideoDataOverrides.VideoOverrideName, Pair<bLL, Set<Integer>>> entry : map.entrySet()) {
            Pair<bLL, Set<Integer>> value = entry.getValue();
            ControllerVideoDataOverrides.VideoOverrideName e = value.d().e();
            Set<Integer> a = value.a();
            arrayList.add("name: " + entry.getKey() + " value: " + e + " ids: " + a);
        }
        return "VideoDataOverrides(outstandingActionsMap=" + arrayList;
    }
}
