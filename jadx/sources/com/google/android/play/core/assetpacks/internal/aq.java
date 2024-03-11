package com.google.android.play.core.assetpacks.internal;

/* loaded from: classes5.dex */
public final class aq implements as {
    private static final Object a = new Object();
    private volatile as b;
    private volatile Object c = a;

    private aq(as asVar) {
        this.b = asVar;
    }

    public static as b(as asVar) {
        asVar.getClass();
        return asVar instanceof aq ? asVar : new aq(asVar);
    }

    public static aq c(as asVar) {
        return asVar instanceof aq ? (aq) asVar : new aq(asVar);
    }

    @Override // com.google.android.play.core.assetpacks.internal.as
    public final Object a() {
        Object obj = this.c;
        Object obj2 = a;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.c;
                if (obj == obj2) {
                    obj = this.b.a();
                    Object obj3 = this.c;
                    if (obj3 != obj2 && obj3 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.c = obj;
                    this.b = null;
                }
            }
        }
        return obj;
    }
}
