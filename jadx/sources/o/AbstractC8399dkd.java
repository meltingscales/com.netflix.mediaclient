package o;

import com.fasterxml.jackson.core.JsonFactory;
import com.netflix.msl.MslInternalException;
import com.netflix.msl.io.MslEncoderException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: o.dkd  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC8399dkd {
    public abstract C8404dki b(Set<C8404dki> set);

    public abstract C8401dkf c(byte[] bArr);

    public abstract byte[] c(C8401dkf c8401dkf, C8404dki c8404dki);

    protected abstract AbstractC8409dkn d(InputStream inputStream, C8404dki c8404dki);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(String str) {
        StringBuilder sb = new StringBuilder();
        if (str == null || str.length() == 0) {
            sb.append("\"\"");
            return sb.toString();
        }
        int length = str.length();
        sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
        int i = 0;
        char c = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt == '\f') {
                sb.append("\\f");
            } else if (charAt != '\r') {
                if (charAt != '\"') {
                    if (charAt == '/') {
                        if (c == '<') {
                            sb.append('\\');
                        }
                        sb.append(charAt);
                    } else if (charAt != '\\') {
                        switch (charAt) {
                            case '\b':
                                sb.append("\\b");
                                continue;
                            case '\t':
                                sb.append("\\t");
                                continue;
                            case '\n':
                                sb.append("\\n");
                                continue;
                            default:
                                if (charAt < ' ' || ((charAt >= 128 && charAt < 160) || (charAt >= 8192 && charAt < 8448))) {
                                    sb.append("\\u");
                                    String hexString = Integer.toHexString(charAt);
                                    sb.append((CharSequence) "0000", 0, 4 - hexString.length());
                                    sb.append(hexString);
                                    break;
                                } else {
                                    sb.append(charAt);
                                    continue;
                                }
                        }
                    }
                }
                sb.append('\\');
                sb.append(charAt);
            } else {
                sb.append("\\r");
            }
            i++;
            c = charAt;
        }
        sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String d(Object obj) {
        if (obj == null || obj.equals(null)) {
            return "null";
        }
        if ((obj instanceof C8401dkf) || (obj instanceof C8398dkc)) {
            return obj.toString();
        }
        if (obj instanceof Map) {
            return new C8401dkf((Map) obj).toString();
        }
        if (obj instanceof Collection) {
            return new C8398dkc((Collection) obj).toString();
        }
        if (obj instanceof Object[]) {
            return new C8398dkc((Object[]) obj).toString();
        }
        if ((obj instanceof Number) || (obj instanceof Boolean)) {
            return obj.toString();
        }
        if (obj instanceof byte[]) {
            return C8427dle.e((byte[]) obj);
        }
        return a(obj.toString());
    }

    public AbstractC8409dkn a(InputStream inputStream) {
        InputStream c = c(inputStream);
        return d(c, d(c));
    }

    protected C8404dki d(InputStream inputStream) {
        if (!inputStream.markSupported()) {
            throw new MslInternalException("InputStream with mark/reset is required to identify encoder format");
        }
        byte[] bArr = new byte[3];
        inputStream.mark(3);
        int read = inputStream.read(bArr);
        if (read == -1) {
            throw new MslEncoderException("End of stream reached when attempting to read the byte stream identifier sequence.");
        }
        inputStream.reset();
        C8404dki d = d(Arrays.copyOf(bArr, Math.min(read, 3)));
        if (d != null) {
            return d;
        }
        throw new MslEncoderException("Unidentified encoder format");
    }

    protected InputStream c(InputStream inputStream) {
        return inputStream.markSupported() ? inputStream : new C8414dks(inputStream);
    }

    public C8401dkf e() {
        return e((Map<String, Object>) null);
    }

    public C8401dkf e(Map<String, Object> map) {
        return new C8401dkf(map);
    }

    public C8404dki d(byte[] bArr) {
        if (bArr.length < 1) {
            throw new MslEncoderException("No encoding identifier found.");
        }
        C8404dki a = C8404dki.a(bArr);
        if (a != null) {
            return a;
        }
        throw new MslEncoderException("Unidentified encoder format.");
    }

    public C8398dkc c() {
        return e((Collection<?>) null);
    }

    public C8398dkc e(Collection<?> collection) {
        return new C8398dkc(collection);
    }
}
