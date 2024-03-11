package o;

import com.netflix.clcs.models.RdidDeviceConsent;
import java.util.List;

/* loaded from: classes2.dex */
public final class FM {
    private final RdidDeviceConsent a;
    private final Boolean c;
    private final boolean d;
    private final List<FS> e;

    public final List<FS> b() {
        return this.e;
    }

    public final RdidDeviceConsent c() {
        return this.a;
    }

    public final Boolean d() {
        return this.c;
    }

    public final boolean e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FM) {
            FM fm = (FM) obj;
            return this.a == fm.a && C8632dsu.c(this.e, fm.e) && this.d == fm.d && C8632dsu.c(this.c, fm.c);
        }
        return false;
    }

    public int hashCode() {
        RdidDeviceConsent rdidDeviceConsent = this.a;
        int hashCode = rdidDeviceConsent == null ? 0 : rdidDeviceConsent.hashCode();
        List<FS> list = this.e;
        int hashCode2 = list == null ? 0 : list.hashCode();
        int hashCode3 = Boolean.hashCode(this.d);
        Boolean bool = this.c;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        RdidDeviceConsent rdidDeviceConsent = this.a;
        List<FS> list = this.e;
        boolean z = this.d;
        Boolean bool = this.c;
        return "InterstitialCommonParameters(rdidDeviceConsent=" + rdidDeviceConsent + ", rdidCtaConsents=" + list + ", isConsumptionOnly=" + z + ", ignoreSnoozing=" + bool + ")";
    }

    public FM(RdidDeviceConsent rdidDeviceConsent, List<FS> list, boolean z, Boolean bool) {
        this.a = rdidDeviceConsent;
        this.e = list;
        this.d = z;
        this.c = bool;
    }
}
