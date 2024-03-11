package o;

import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.json.JsonMapper;
import java.io.IOException;

/* renamed from: o.rs  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C9561rs {
    private static final ObjectWriter a;
    private static final ObjectReader b;
    private static final ObjectWriter c;
    private static final JsonMapper e;

    C9561rs() {
    }

    static {
        JsonMapper jsonMapper = new JsonMapper();
        e = jsonMapper;
        a = jsonMapper.writer();
        c = jsonMapper.writer().b();
        b = jsonMapper.readerFor(AbstractC9454pr.class);
    }

    public static String d(AbstractC9454pr abstractC9454pr) {
        try {
            return a.a(abstractC9454pr);
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static byte[] b(Object obj) {
        return e.writeValueAsBytes(obj);
    }

    public static AbstractC9454pr e(byte[] bArr) {
        return (AbstractC9454pr) b.c(bArr);
    }
}
