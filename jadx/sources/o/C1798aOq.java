package o;

import com.netflix.mediaclient.cdx.api.PairingType;
import com.netflix.mediaclient.clutils.CLv2Utils;
import com.netflix.mediaclient.service.cdx.log.MessageFailureCause;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: o.aOq  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1798aOq extends C1045Mp {
    public static final C1798aOq a = new C1798aOq();

    private C1798aOq() {
        super("nf_cdx_pairing_utils");
    }

    public final void a(String str) {
        Map d;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str != null) {
            linkedHashMap.put("companionSessionId", str);
        }
        d = dqE.d();
        CLv2Utils.d("PromptMaxImpressionReached", d, linkedHashMap, new String[]{"MobileCompanion"});
        C8159dfC.c(new C1778aNx("PromptMaxImpressionReached", linkedHashMap));
    }

    public final void c(C1255Uq c1255Uq, String str, PairingType pairingType, MessageFailureCause messageFailureCause) {
        Map d;
        C8632dsu.c((Object) c1255Uq, "");
        C8632dsu.c((Object) pairingType, "");
        C8632dsu.c((Object) messageFailureCause, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(UmaAlert.ICON_ERROR, messageFailureCause.name());
        linkedHashMap.put("type", pairingType.name());
        if (str != null) {
            linkedHashMap.put("companionSessionId", str);
        }
        C8159dfC.c(new C1778aNx("PairingFailure", linkedHashMap));
        d = dqE.d();
        CLv2Utils.d("PairingFailure", d, linkedHashMap, new String[]{"MobileCompanion"});
    }

    public final void c(C1255Uq c1255Uq, String str, MessageFailureCause messageFailureCause) {
        Map d;
        C8632dsu.c((Object) c1255Uq, "");
        C8632dsu.c((Object) messageFailureCause, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(UmaAlert.ICON_ERROR, messageFailureCause.name());
        if (str != null) {
            linkedHashMap.put("companionSessionId", str);
        }
        C8159dfC.c(new C1778aNx("UnpairingFailure", linkedHashMap));
        d = dqE.d();
        CLv2Utils.d("UnpairingFailure", d, linkedHashMap, new String[]{"MobileCompanion"});
    }

    public final void b(C1255Uq c1255Uq, String str, PairingType pairingType) {
        Map d;
        C8632dsu.c((Object) c1255Uq, "");
        C8632dsu.c((Object) pairingType, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("type", pairingType.name());
        if (str != null) {
            linkedHashMap.put("companionSessionId", str);
        }
        C8159dfC.c(new C1778aNx("PairingSuccess", linkedHashMap));
        d = dqE.d();
        CLv2Utils.d("PairingSuccess", d, linkedHashMap, new String[]{"MobileCompanion"});
    }

    public final void e(C1255Uq c1255Uq, String str) {
        Map d;
        C8632dsu.c((Object) c1255Uq, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str != null) {
            linkedHashMap.put("companionSessionId", str);
        }
        C8159dfC.c(new C1778aNx("UnpairingSuccess", linkedHashMap));
        d = dqE.d();
        CLv2Utils.d("UnpairingSuccess", d, linkedHashMap, new String[]{"MobileCompanion"});
    }
}
