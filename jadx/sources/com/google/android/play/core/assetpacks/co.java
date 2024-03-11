package com.google.android.play.core.assetpacks;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class co {
    private final Map a = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final double a(String str) {
        synchronized (this) {
            Double d = (Double) this.a.get(str);
            if (d == null) {
                return 0.0d;
            }
            return d.doubleValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final double b(String str, dg dgVar) {
        double d;
        synchronized (this) {
            d = (((ce) dgVar).f + 1.0d) / ((ce) dgVar).g;
            this.a.put(str, Double.valueOf(d));
        }
        return d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(String str) {
        synchronized (this) {
            this.a.put(str, Double.valueOf(0.0d));
        }
    }
}
