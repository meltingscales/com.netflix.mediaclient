package o;

import com.netflix.msl.MslEncodingException;
import com.netflix.msl.io.MslEncoderException;
import java.util.Objects;

/* loaded from: classes5.dex */
public class dkP implements InterfaceC8400dke {
    private final boolean a;

    public boolean a() {
        return this.a;
    }

    public dkP(C8401dkf c8401dkf) {
        try {
            this.a = c8401dkf.h("pdi") && c8401dkf.a("pdi");
        } catch (MslEncoderException e) {
            C8373dje c8373dje = C8373dje.bd;
            throw new MslEncodingException(c8373dje, "mastertoken requirements" + c8401dkf, e);
        }
    }

    @Override // o.InterfaceC8400dke
    public byte[] c(AbstractC8399dkd abstractC8399dkd, C8404dki c8404dki) {
        return abstractC8399dkd.c(b(abstractC8399dkd, c8404dki), c8404dki);
    }

    @Override // o.InterfaceC8400dke
    public C8401dkf b(AbstractC8399dkd abstractC8399dkd, C8404dki c8404dki) {
        C8401dkf e = abstractC8399dkd.e();
        boolean z = this.a;
        if (z) {
            e.e("pdi", Boolean.valueOf(z));
        }
        return e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.a == ((dkP) obj).a;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.a));
    }
}
