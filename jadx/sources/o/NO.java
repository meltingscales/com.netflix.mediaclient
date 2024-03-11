package o;

import com.google.gson.annotations.SerializedName;
import o.NX;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class NO extends NX {
    private final NV e;

    @Override // o.NX
    @SerializedName("osInfo")
    public NV d() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public NO(NV nv) {
        this.e = nv;
    }

    public String toString() {
        return "DeviceHistoryData{currentOsInfo=" + this.e + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof NX) {
            NV nv = this.e;
            NV d2 = ((NX) obj).d();
            return nv == null ? d2 == null : nv.equals(d2);
        }
        return false;
    }

    public int hashCode() {
        NV nv = this.e;
        return (nv == null ? 0 : nv.hashCode()) ^ 1000003;
    }

    @Override // o.NX
    public NX.e a() {
        return new d(this);
    }

    /* loaded from: classes.dex */
    static final class d extends NX.e {
        private NV c;

        @Override // o.NX.e
        public NX.e e(NV nv) {
            this.c = nv;
            return this;
        }

        d() {
        }

        private d(NX nx) {
            this.c = nx.d();
        }

        @Override // o.NX.e
        public NX b() {
            return new NT(this.c);
        }
    }
}
