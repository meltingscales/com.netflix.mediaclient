package o;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.netflix.android.org.json.zip.JSONzip;
import com.netflix.msl.io.MslEncoderParseException;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: o.dkm  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC8408dkm implements AutoCloseable, InterfaceC8405dkj {
    private static final char[] c = "0123456789ABCDEF".toCharArray();

    public void b() {
    }

    public int d() {
        return -1;
    }

    protected abstract JsonParser e();

    private static String e(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            int i2 = i * 2;
            char[] cArr2 = c;
            cArr[i2] = cArr2[(b & 255) >>> 4];
            cArr[i2 + 1] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    @Override // java.lang.AutoCloseable, o.InterfaceC8405dkj
    public void close() {
        try {
            e().close();
        } catch (IOException e) {
            throw new MslEncoderParseException(MslEncoderParseException.Type.INTERNAL, "Exception thrown closing Jackson CBORParser", e);
        }
    }

    @Override // o.InterfaceC8405dkj
    public JsonToken k() {
        try {
            return e().Q();
        } catch (IOException e) {
            MslEncoderParseException.Type type = MslEncoderParseException.Type.INTERNAL;
            throw new MslEncoderParseException(type, "Parse failed, exception thrown from nextToken() @ " + f(), e);
        }
    }

    @Override // o.InterfaceC8405dkj
    public void j() {
        if (c() == JsonToken.START_OBJECT) {
            return;
        }
        MslEncoderParseException.Type type = MslEncoderParseException.Type.MISSING_START_OBJECT;
        throw new MslEncoderParseException(type, "Parse failed, expected start object token @ " + f());
    }

    @Override // o.InterfaceC8405dkj
    public void h() {
        if (c() == JsonToken.START_ARRAY) {
            return;
        }
        MslEncoderParseException.Type type = MslEncoderParseException.Type.MISSING_START_ARRAY;
        throw new MslEncoderParseException(type, "Parse failed, expected start array token @ " + f());
    }

    @Override // o.InterfaceC8405dkj
    public JsonToken c() {
        return e().f();
    }

    @Override // o.InterfaceC8405dkj
    public int g() {
        try {
            return e().D();
        } catch (IOException e) {
            throw new MslEncoderParseException(MslEncoderParseException.Type.INTERNAL, "parser getTextLength() threw exception", e);
        }
    }

    @Override // o.InterfaceC8405dkj
    public String i() {
        try {
            return e().l();
        } catch (IOException e) {
            MslEncoderParseException.Type type = MslEncoderParseException.Type.MISSING_NAME;
            throw new MslEncoderParseException(type, "Parse failed, getCurrentName() IOException @ " + f(), e);
        }
    }

    @Override // o.InterfaceC8405dkj
    public Object o() {
        JsonToken c2 = c();
        if (c2 == null) {
            MslEncoderParseException.Type type = MslEncoderParseException.Type.UNRECOGNIZED_TOKEN;
            throw new MslEncoderParseException(type, "Parse failed, no token @ " + f());
        }
        try {
            switch (AnonymousClass3.c[c2.ordinal()]) {
                case 1:
                    return l();
                case 2:
                    return a();
                case 3:
                    JsonParser.NumberType v = e().v();
                    if (v == JsonParser.NumberType.INT) {
                        return Integer.valueOf(e().u());
                    }
                    if (v == JsonParser.NumberType.LONG) {
                        return Long.valueOf(e().w());
                    }
                    MslEncoderParseException.Type type2 = MslEncoderParseException.Type.UNSUPPORTED_INT;
                    throw new MslEncoderParseException(type2, "Parse failed, unsupported int type @ " + f());
                case 4:
                    JsonParser.NumberType v2 = e().v();
                    if (v2 == JsonParser.NumberType.DOUBLE) {
                        return Double.valueOf(e().p());
                    }
                    if (v2 == JsonParser.NumberType.FLOAT) {
                        return Float.valueOf(e().s());
                    }
                    MslEncoderParseException.Type type3 = MslEncoderParseException.Type.UNSUPPORTED_FLOAT;
                    throw new MslEncoderParseException(type3, "Parse failed, unsupported float type @ " + f());
                case 5:
                case 6:
                    return Boolean.valueOf(e().g());
                case 7:
                    return null;
                default:
                    MslEncoderParseException.Type type4 = MslEncoderParseException.Type.UNRECOGNIZED_TOKEN;
                    throw new MslEncoderParseException(type4, "Parse failed, unrecognized token " + c2.name() + " @ " + f());
            }
        } catch (IOException e) {
            MslEncoderParseException.Type type5 = MslEncoderParseException.Type.INTERNAL;
            throw new MslEncoderParseException(type5, "Parse failed, IOException thrown @ " + f(), e);
        }
    }

    /* renamed from: o.dkm$3  reason: invalid class name */
    /* loaded from: classes5.dex */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[JsonToken.values().length];
            c = iArr;
            try {
                iArr[JsonToken.VALUE_EMBEDDED_OBJECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                c[JsonToken.VALUE_STRING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                c[JsonToken.VALUE_NUMBER_INT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                c[JsonToken.VALUE_NUMBER_FLOAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                c[JsonToken.VALUE_TRUE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                c[JsonToken.VALUE_FALSE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                c[JsonToken.VALUE_NULL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    protected Object a() {
        return e().A();
    }

    protected Object l() {
        JsonToken c2 = c();
        if (c2 != JsonToken.VALUE_EMBEDDED_OBJECT) {
            MslEncoderParseException.Type type = MslEncoderParseException.Type.UNEXPECTED_TOKEN;
            throw new MslEncoderParseException(type, "Parse failed, unexpected token " + c2.name() + " @ " + f());
        }
        try {
            return e().q();
        } catch (IOException e) {
            MslEncoderParseException.Type type2 = MslEncoderParseException.Type.INTERNAL;
            throw new MslEncoderParseException(type2, "Parse failed, IOException thrown from CBORParser.getEmbeddedObject() @ " + f(), e);
        }
    }

    @Override // o.InterfaceC8405dkj
    public String f() {
        try {
            JsonLocation k = e().k();
            Object d = k.d();
            if (d instanceof byte[]) {
                byte[] bArr = (byte[]) d;
                int intValue = new Long(k.e()).intValue();
                int min = Math.min((bArr.length - intValue) - 1, (int) JSONzip.end);
                if (min < 0) {
                    return null;
                }
                return e(Arrays.copyOfRange(bArr, intValue, min + intValue));
            }
            return null;
        } catch (Exception unused) {
            return "";
        }
    }
}
