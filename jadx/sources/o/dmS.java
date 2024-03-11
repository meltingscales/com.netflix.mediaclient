package o;

import androidx.compose.runtime.Composer;
import o.InterfaceC8466dmq;

/* loaded from: classes5.dex */
public final class dmS {
    private final InterfaceC8466dmq.a a;
    private final InterfaceC8612dsa<InterfaceC8466dmq.a, Composer, Integer, dpR> e;

    public final InterfaceC8612dsa<InterfaceC8466dmq.a, Composer, Integer, dpR> a() {
        return this.e;
    }

    public final InterfaceC8466dmq.a b() {
        return this.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public dmS(InterfaceC8466dmq.a aVar, InterfaceC8612dsa<? super InterfaceC8466dmq.a, ? super Composer, ? super Integer, dpR> interfaceC8612dsa) {
        C8632dsu.c((Object) aVar, "");
        C8632dsu.c((Object) interfaceC8612dsa, "");
        this.a = aVar;
        this.e = interfaceC8612dsa;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || dmS.class != obj.getClass()) {
            return false;
        }
        dmS dms = (dmS) obj;
        return C8632dsu.c(this.a, dms.a) && C8632dsu.c(this.e, dms.e);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.e.hashCode();
    }

    public String toString() {
        InterfaceC8466dmq.a aVar = this.a;
        return "RecordContentProvider(record=" + aVar + ")";
    }
}
