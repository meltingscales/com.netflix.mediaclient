package androidx.lifecycle;

import java.util.HashMap;
import java.util.Map;
import o.C8632dsu;

/* loaded from: classes2.dex */
public class MethodCallsLogger {
    private final Map<String, Integer> calledMethods = new HashMap();

    public boolean approveCall(String str, int i) {
        C8632dsu.c((Object) str, "");
        Integer num = this.calledMethods.get(str);
        int intValue = num != null ? num.intValue() : 0;
        boolean z = (intValue & i) != 0;
        this.calledMethods.put(str, Integer.valueOf(i | intValue));
        return !z;
    }
}
