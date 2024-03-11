package o;

import com.fasterxml.jackson.core.JsonParser;
import com.netflix.msl.io.MslEncoderParseException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes5.dex */
public class djW extends AbstractC8408dkm {
    private final JsonParser e;

    @Override // o.AbstractC8408dkm
    protected JsonParser e() {
        return this.e;
    }

    public djW(byte[] bArr) {
        try {
            JsonParser createParser = djZ.b().createParser(bArr);
            this.e = createParser;
            createParser.b(JsonParser.Feature.ALLOW_SINGLE_QUOTES, true);
        } catch (IOException e) {
            throw new MslEncoderParseException(MslEncoderParseException.Type.INTERNAL, "Could not create Jackson JsonParser", e);
        }
    }

    public djW(InputStream inputStream) {
        try {
            JsonParser createParser = djZ.b().createParser(inputStream);
            this.e = createParser;
            createParser.b(JsonParser.Feature.ALLOW_SINGLE_QUOTES, true);
        } catch (IOException e) {
            throw new MslEncoderParseException(MslEncoderParseException.Type.INTERNAL, "Could not create Jackson JsonParser", e);
        }
    }

    @Override // o.AbstractC8408dkm
    protected Object a() {
        return new C8407dkl(e().A());
    }
}
