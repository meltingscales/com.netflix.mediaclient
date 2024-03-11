package o;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.dataformat.cbor.CBORParser;
import com.netflix.msl.MslInternalException;
import com.netflix.msl.io.MslEncoderParseException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes5.dex */
public class djQ extends AbstractC8408dkm {
    private final CBORParser e;

    @Override // o.AbstractC8408dkm
    protected JsonParser e() {
        return this.e;
    }

    public djQ(byte[] bArr) {
        try {
            this.e = djV.d().createParser(bArr);
        } catch (IOException e) {
            throw new MslEncoderParseException(MslEncoderParseException.Type.INTERNAL, "Could not create Jackson CBORParser", e);
        }
    }

    public djQ(InputStream inputStream) {
        try {
            this.e = djV.d().createParser(inputStream);
        } catch (IOException e) {
            throw new MslEncoderParseException(MslEncoderParseException.Type.INTERNAL, "Could not create Jackson CBORParser", e);
        }
    }

    @Override // o.AbstractC8408dkm, o.InterfaceC8405dkj
    public void b() {
        if (this.e.am() == 55799) {
            return;
        }
        MslEncoderParseException.Type type = MslEncoderParseException.Type.NO_SELF_DESCRIBE_TAG;
        throw new MslEncoderParseException(type, "CBOR parse failed, missing CBOR self-describe tag @ " + f());
    }

    @Override // o.AbstractC8408dkm, o.InterfaceC8405dkj
    public int d() {
        C9599sk z = this.e.z();
        if (z == null) {
            throw new MslInternalException("Unexpected null CBORReadContext");
        }
        int n = z.n();
        if (n < 0) {
            return Integer.MIN_VALUE;
        }
        return n;
    }
}
