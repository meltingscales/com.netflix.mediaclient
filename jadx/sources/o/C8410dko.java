package o;

import com.fasterxml.jackson.core.JsonToken;
import com.netflix.msl.io.MslEncoderParseException;
import com.netflix.msl.io.MslEncodingSymbol;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: o.dko  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C8410dko implements AutoCloseable {
    private final C8402dkg d;
    private final InterfaceC8405dkj e;

    public C8410dko(C8402dkg c8402dkg, InterfaceC8405dkj interfaceC8405dkj) {
        this.d = c8402dkg;
        this.e = interfaceC8405dkj;
        e();
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        this.e.close();
    }

    public C8401dkf d() {
        this.e.b();
        return b(1);
    }

    public void e() {
        this.e.k();
    }

    public boolean a() {
        return this.e.c() != null;
    }

    private C8401dkf b(int i) {
        if (i > 16) {
            MslEncoderParseException.Type type = MslEncoderParseException.Type.RECURSION;
            throw new MslEncoderParseException(type, "Parse failed, max recursion depth exceeded @ " + this.e.f());
        }
        this.e.j();
        f();
        c();
        HashMap hashMap = new HashMap();
        int i2 = 0;
        while (this.e.k() != JsonToken.END_OBJECT) {
            i2++;
            if (i2 > 32) {
                MslEncoderParseException.Type type2 = MslEncoderParseException.Type.ITEM_TOO_LONG;
                throw new MslEncoderParseException(type2, "Parse failed, item too long @ " + this.e.f());
            } else if (this.e.c() != JsonToken.FIELD_NAME) {
                MslEncoderParseException.Type type3 = MslEncoderParseException.Type.UNEXPECTED_TOKEN;
                throw new MslEncoderParseException(type3, "Parse failed, unexpected token @ " + this.e.f());
            } else if (this.e.g() > 64) {
                MslEncoderParseException.Type type4 = MslEncoderParseException.Type.OBJECT_FIELDNAME_TOO_LONG;
                throw new MslEncoderParseException(type4, "Parse failed, large field name @ " + this.e.f());
            } else {
                String i3 = this.e.i();
                String e = MslEncodingSymbol.e(i3);
                if (e != null) {
                    i3 = e;
                }
                e(i3);
                this.e.k();
                hashMap.put(i3, a(i));
            }
        }
        try {
            return new C8401dkf(hashMap);
        } catch (IllegalArgumentException unused) {
            throw new MslEncoderParseException(MslEncoderParseException.Type.INVALID_TYPE, "Parse failed, unsupported type found while parsing");
        }
    }

    private C8398dkc e(int i) {
        if (i > 16) {
            MslEncoderParseException.Type type = MslEncoderParseException.Type.RECURSION;
            throw new MslEncoderParseException(type, "Parse max recursion depth exceeded @ " + this.e.f());
        }
        this.e.h();
        b();
        c();
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (this.e.k() != JsonToken.END_ARRAY) {
            i2++;
            if (i2 > 32) {
                MslEncoderParseException.Type type2 = MslEncoderParseException.Type.ITEM_TOO_LONG;
                throw new MslEncoderParseException(type2, "Parse failed, item too long @ " + this.e.f());
            }
            arrayList.add(a(i));
        }
        try {
            return new C8398dkc(arrayList);
        } catch (IllegalArgumentException unused) {
            throw new MslEncoderParseException(MslEncoderParseException.Type.INVALID_TYPE, "Parse failed, unsupported type found while parsing");
        }
    }

    private Object a(int i) {
        JsonToken c = this.e.c();
        if (c == null) {
            MslEncoderParseException.Type type = MslEncoderParseException.Type.UNEXPECTED_TOKEN;
            throw new MslEncoderParseException(type, "Parse failed, missing token @ " + this.e.f());
        } else if (c == JsonToken.START_OBJECT) {
            C8402dkg c8402dkg = this.d;
            if (c8402dkg != null) {
                c8402dkg.c(i);
            }
            return b(i + 1);
        } else if (c == JsonToken.START_ARRAY) {
            C8402dkg c8402dkg2 = this.d;
            if (c8402dkg2 != null) {
                c8402dkg2.c(i);
            }
            return e(i + 1);
        } else {
            C8402dkg c8402dkg3 = this.d;
            if (c8402dkg3 != null) {
                c8402dkg3.c();
            }
            return this.e.o();
        }
    }

    private void c() {
        int d = this.e.d();
        if (d == Integer.MIN_VALUE) {
            MslEncoderParseException.Type type = MslEncoderParseException.Type.INDEFINITE_LENGTH_ITEM;
            throw new MslEncoderParseException(type, "CBOR parse failed, indefinite length object @ " + this.e.f());
        } else if (d <= 32) {
        } else {
            MslEncoderParseException.Type type2 = MslEncoderParseException.Type.ITEM_TOO_LONG;
            throw new MslEncoderParseException(type2, "Parse failed, item too long @ " + this.e.f());
        }
    }

    private void f() {
        C8402dkg c8402dkg = this.d;
        if (c8402dkg != null) {
            c8402dkg.b();
        }
    }

    private void b() {
        C8402dkg c8402dkg = this.d;
        if (c8402dkg != null) {
            c8402dkg.a();
        }
    }

    private void e(String str) {
        if (this.d != null) {
            if (MslEncodingSymbol.b(str)) {
                this.d.c(str);
            } else {
                this.d.d();
            }
        }
    }
}
