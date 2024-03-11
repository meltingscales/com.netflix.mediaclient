package o;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class aFA {
    public static final aFA e = new aFA();

    private aFA() {
    }

    public final dEP c(dEP dep) {
        List b;
        Set W;
        C8632dsu.c((Object) dep, "");
        b = duD.b((CharSequence) "ads|deppProductization|downloads|games|graphql|hendrix_migration_test|hendrixTest|home|insomnia|localDiscovery|net|nonMemberHome|player|PlayerUIGraphqlMigration|postPlay|profile|pushNotifications|requests", new char[]{'|'}, false, 0, 6, (Object) null);
        W = C8576dqs.W(b);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, dEI> entry : dep.entrySet()) {
            if (W.contains(entry.getKey())) {
                dEI value = entry.getValue();
                dEP dep2 = value instanceof dEP ? (dEP) value : null;
                if (dep2 != null) {
                    for (Map.Entry<String, dEI> entry2 : dep2.entrySet()) {
                        String key = entry.getKey();
                        String key2 = entry2.getKey();
                        linkedHashMap.put(((Object) key) + "." + ((Object) key2), entry2.getValue());
                    }
                }
            } else {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return new dEP(linkedHashMap);
    }
}
