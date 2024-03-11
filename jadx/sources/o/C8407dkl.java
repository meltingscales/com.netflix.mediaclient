package o;

import com.netflix.msl.io.MslEncoderException;
import java.util.Objects;

/* renamed from: o.dkl  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C8407dkl {
    private byte[] a;
    private final String e;

    public String c() {
        return this.e;
    }

    public C8407dkl(String str) {
        if (str == null) {
            throw new IllegalArgumentException("StringOrBinary cannot be built with a null");
        }
        this.e = str;
        this.a = null;
    }

    public byte[] d() {
        if (this.a == null) {
            try {
                this.a = C8427dle.e(this.e);
            } catch (IllegalArgumentException unused) {
                throw new MslEncoderException("base64 decoding found non binary data.");
            }
        }
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8407dkl) {
            return this.e.equals(((C8407dkl) obj).e);
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.e);
    }
}
