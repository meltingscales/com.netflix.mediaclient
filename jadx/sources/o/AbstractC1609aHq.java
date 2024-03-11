package o;

import com.google.gson.annotations.SerializedName;
import o.aHV;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.aHq  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1609aHq extends aHV {
    private final int d;
    private final int e;

    @Override // o.aHV
    @SerializedName("retryAfterSeconds")
    public int b() {
        return this.e;
    }

    @Override // o.aHV
    @SerializedName("maxRetries")
    public int d() {
        return this.d;
    }

    public int hashCode() {
        return ((this.d ^ 1000003) * 1000003) ^ this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC1609aHq(int i, int i2) {
        this.d = i;
        this.e = i2;
    }

    public String toString() {
        return "ServerRetryPolicy{maxRetries=" + this.d + ", retryAfterSeconds=" + this.e + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aHV) {
            aHV ahv = (aHV) obj;
            return this.d == ahv.d() && this.e == ahv.b();
        }
        return false;
    }

    @Override // o.aHV
    protected aHV.d a() {
        return new d(this);
    }

    /* renamed from: o.aHq$d */
    /* loaded from: classes.dex */
    static final class d extends aHV.d {
        private Integer c;
        private Integer d;

        d() {
        }

        private d(aHV ahv) {
            this.c = Integer.valueOf(ahv.d());
            this.d = Integer.valueOf(ahv.b());
        }

        @Override // o.aHV.d
        aHV.d a(int i) {
            this.c = Integer.valueOf(i);
            return this;
        }

        @Override // o.aHV.d
        aHV.d e(int i) {
            this.d = Integer.valueOf(i);
            return this;
        }

        @Override // o.aHV.d
        aHV a() {
            String str = "";
            if (this.c == null) {
                str = " maxRetries";
            }
            if (this.d == null) {
                str = str + " retryAfterSeconds";
            }
            if (!str.isEmpty()) {
                throw new IllegalStateException("Missing required properties:" + str);
            }
            return new C1615aHw(this.c.intValue(), this.d.intValue());
        }
    }
}
