package androidx.compose.material.ripple;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class RippleHostMap {
    private final Map<AndroidRippleIndicationInstance, RippleHostView> indicationToHostMap = new LinkedHashMap();
    private final Map<RippleHostView, AndroidRippleIndicationInstance> hostToIndicationMap = new LinkedHashMap();

    public final void set(AndroidRippleIndicationInstance androidRippleIndicationInstance, RippleHostView rippleHostView) {
        this.indicationToHostMap.put(androidRippleIndicationInstance, rippleHostView);
        this.hostToIndicationMap.put(rippleHostView, androidRippleIndicationInstance);
    }

    public final RippleHostView get(AndroidRippleIndicationInstance androidRippleIndicationInstance) {
        return this.indicationToHostMap.get(androidRippleIndicationInstance);
    }

    public final AndroidRippleIndicationInstance get(RippleHostView rippleHostView) {
        return this.hostToIndicationMap.get(rippleHostView);
    }

    public final void remove(AndroidRippleIndicationInstance androidRippleIndicationInstance) {
        RippleHostView rippleHostView = this.indicationToHostMap.get(androidRippleIndicationInstance);
        if (rippleHostView != null) {
            this.hostToIndicationMap.remove(rippleHostView);
        }
        this.indicationToHostMap.remove(androidRippleIndicationInstance);
    }
}
