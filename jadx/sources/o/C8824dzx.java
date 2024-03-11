package o;

import java.util.List;
import kotlinx.coroutines.flow.SharingCommand;
import kotlinx.coroutines.flow.StartedWhileSubscribed$command$1;
import kotlinx.coroutines.flow.StartedWhileSubscribed$command$2;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* renamed from: o.dzx  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8824dzx implements InterfaceC8817dzq {
    private final long b;
    private final long e;

    public C8824dzx(long j, long j2) {
        this.e = j;
        this.b = j2;
        if (j < 0) {
            throw new IllegalArgumentException(("stopTimeout(" + j + " ms) cannot be negative").toString());
        } else if (j2 >= 0) {
        } else {
            throw new IllegalArgumentException(("replayExpiration(" + j2 + " ms) cannot be negative").toString());
        }
    }

    @Override // o.InterfaceC8817dzq
    public dyS<SharingCommand> e(InterfaceC8822dzv<Integer> interfaceC8822dzv) {
        return dyR.e(dyR.d(dyR.c((dyS) interfaceC8822dzv, (InterfaceC8612dsa) new StartedWhileSubscribed$command$1(this, null)), (drX) new StartedWhileSubscribed$command$2(null)));
    }

    public String toString() {
        List e;
        List o2;
        String d;
        e = C8566dqi.e(2);
        if (this.e > 0) {
            e.add("stopTimeout=" + this.e + "ms");
        }
        if (this.b < Long.MAX_VALUE) {
            e.add("replayExpiration=" + this.b + "ms");
        }
        o2 = C8566dqi.o(e);
        StringBuilder sb = new StringBuilder();
        sb.append("SharingStarted.WhileSubscribed(");
        d = C8576dqs.d(o2, null, null, null, 0, null, null, 63, null);
        sb.append(d);
        sb.append(')');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj instanceof C8824dzx) {
            C8824dzx c8824dzx = (C8824dzx) obj;
            if (this.e == c8824dzx.e && this.b == c8824dzx.b) {
                return true;
            }
        }
        return false;
    }

    @IgnoreJRERequirement
    public int hashCode() {
        return (Long.hashCode(this.e) * 31) + Long.hashCode(this.b);
    }
}
