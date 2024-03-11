package o;

import com.netflix.mediaclient.commanderinfra.impl.logging.CommanderFlexEventType;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class WL {
    public static final WL d = new WL();

    private WL() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void d(WL wl, String str, CommanderFlexEventType commanderFlexEventType, Map map, int i, Object obj) {
        if ((i & 4) != 0) {
            map = new LinkedHashMap();
        }
        wl.e(str, commanderFlexEventType, map);
    }

    public final void e(String str, CommanderFlexEventType commanderFlexEventType, Map<String, String> map) {
        C8632dsu.c((Object) commanderFlexEventType, "");
        C8632dsu.c((Object) map, "");
        CommanderFlexEventType.k.a(str, commanderFlexEventType, map);
        C8159dfC.c(new WN(str, commanderFlexEventType, map));
    }
}
