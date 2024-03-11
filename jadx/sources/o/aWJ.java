package o;

import java.net.InetAddress;

/* loaded from: classes3.dex */
public final class aWJ {
    private final InetAddress b;
    private final String e;

    public final InetAddress a() {
        return this.b;
    }

    public final String b() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aWJ) {
            aWJ awj = (aWJ) obj;
            return C8632dsu.c(this.b, awj.b) && C8632dsu.c((Object) this.e, (Object) awj.e);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.b.hashCode();
        String str = this.e;
        return (hashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        InetAddress inetAddress = this.b;
        String str = this.e;
        return "LocalDevice(address=" + inetAddress + ", url=" + str + ")";
    }

    public aWJ(InetAddress inetAddress, String str) {
        C8632dsu.c((Object) inetAddress, "");
        this.b = inetAddress;
        this.e = str;
    }
}
