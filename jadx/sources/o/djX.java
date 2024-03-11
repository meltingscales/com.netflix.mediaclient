package o;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.dataformat.cbor.CBORGenerator;
import com.netflix.msl.io.MslEncoderException;
import com.netflix.msl.io.MslEncodingSymbol;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Set;

/* loaded from: classes5.dex */
public class djX {
    private final JsonFactory a;
    private final AbstractC8399dkd d;
    private final C8404dki e;

    public djX(C8404dki c8404dki, AbstractC8399dkd abstractC8399dkd) {
        this.e = c8404dki;
        this.d = abstractC8399dkd;
        if (c8404dki.equals(C8404dki.b)) {
            this.a = djZ.b();
        } else if (c8404dki.equals(C8404dki.d)) {
            this.a = djV.d();
        } else {
            throw new IllegalArgumentException("Unsupported format");
        }
    }

    public byte[] c(C8401dkf c8401dkf) {
        return a(c8401dkf);
    }

    private byte[] a(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            JsonGenerator createGenerator = this.a.createGenerator(byteArrayOutputStream);
            e(obj, createGenerator);
            if (createGenerator != null) {
                createGenerator.close();
            }
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new MslEncoderException("Jackson threw IOException during encoding", e);
        }
    }

    private void e(Object obj, JsonGenerator jsonGenerator) {
        if (obj instanceof String) {
            e((String) obj, jsonGenerator);
        } else if (obj instanceof Boolean) {
            c((Boolean) obj, jsonGenerator);
        } else if (obj instanceof Integer) {
            b((Integer) obj, jsonGenerator);
        } else if (obj instanceof Long) {
            a((Long) obj, jsonGenerator);
        } else if (obj instanceof Double) {
            a((Double) obj, jsonGenerator);
        } else if (obj instanceof byte[]) {
            c((byte[]) obj, jsonGenerator);
        } else if (obj instanceof C8401dkf) {
            d((C8401dkf) obj, jsonGenerator);
        } else if (obj instanceof C8398dkc) {
            a((C8398dkc) obj, jsonGenerator);
        } else if (obj instanceof InterfaceC8400dke) {
            e((InterfaceC8400dke) obj, jsonGenerator);
        } else if (obj instanceof C8407dkl) {
            e((C8407dkl) obj, jsonGenerator);
        } else if (obj == null) {
            d(jsonGenerator);
        } else {
            throw new IOException("Illegal type found during encoding");
        }
    }

    private void d(C8401dkf c8401dkf, JsonGenerator jsonGenerator) {
        Set<String> d = c8401dkf.d();
        d(jsonGenerator, d.size());
        for (String str : d) {
            d(jsonGenerator, str);
            e(c8401dkf.f(str), jsonGenerator);
        }
        jsonGenerator.o();
    }

    private void d(JsonGenerator jsonGenerator, int i) {
        if (this.e.equals(C8404dki.d)) {
            ((CBORGenerator) jsonGenerator).h(i);
        } else {
            jsonGenerator.l();
        }
    }

    private void d(JsonGenerator jsonGenerator, String str) {
        if (this.e.equals(C8404dki.d)) {
            Integer a = MslEncodingSymbol.a(str);
            if (a == null) {
                jsonGenerator.a(str);
                return;
            } else {
                jsonGenerator.c(a.intValue());
                return;
            }
        }
        jsonGenerator.a(str);
    }

    private void a(C8398dkc c8398dkc, JsonGenerator jsonGenerator) {
        int b = c8398dkc.b();
        jsonGenerator.e(b);
        for (int i = 0; i < b; i++) {
            e(c8398dkc.b(i), jsonGenerator);
        }
        jsonGenerator.i();
    }

    private void e(InterfaceC8400dke interfaceC8400dke, JsonGenerator jsonGenerator) {
        try {
            d(interfaceC8400dke.b(this.d, this.e), jsonGenerator);
        } catch (MslEncoderException e) {
            throw new IOException("MSL Encoder error", e);
        }
    }

    private void e(C8407dkl c8407dkl, JsonGenerator jsonGenerator) {
        e(c8407dkl.c(), jsonGenerator);
    }

    private void e(String str, JsonGenerator jsonGenerator) {
        jsonGenerator.i(str);
    }

    private void c(Boolean bool, JsonGenerator jsonGenerator) {
        jsonGenerator.a(bool.booleanValue());
    }

    private void b(Integer num, JsonGenerator jsonGenerator) {
        jsonGenerator.c(num.intValue());
    }

    private void a(Long l, JsonGenerator jsonGenerator) {
        jsonGenerator.b(l.longValue());
    }

    private void a(Double d, JsonGenerator jsonGenerator) {
        jsonGenerator.e(d.doubleValue());
    }

    private void c(byte[] bArr, JsonGenerator jsonGenerator) {
        jsonGenerator.a(bArr);
    }

    private void d(JsonGenerator jsonGenerator) {
        jsonGenerator.k();
    }
}
