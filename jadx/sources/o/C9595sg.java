package o;

import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.format.MatchStrength;
import com.fasterxml.jackson.dataformat.cbor.CBORParser;
import java.io.InputStream;

/* renamed from: o.sg  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C9595sg {
    protected final byte[] a;
    protected int b;
    protected final InputStream c;
    protected final C9389of d;
    protected final boolean e;
    protected int f;
    protected int h;

    public C9595sg(C9389of c9389of, InputStream inputStream) {
        this.d = c9389of;
        this.c = inputStream;
        this.a = c9389of.e();
        this.h = 0;
        this.b = 0;
        this.f = 0;
        this.e = true;
    }

    public C9595sg(C9389of c9389of, byte[] bArr, int i, int i2) {
        this.d = c9389of;
        this.c = null;
        this.a = bArr;
        this.h = i;
        this.b = i2 + i;
        this.f = -i;
        this.e = false;
    }

    public CBORParser a(int i, int i2, int i3, ObjectCodec objectCodec, C9377oT c9377oT) {
        C9377oT d = c9377oT.d(i);
        e(1);
        return new CBORParser(this.d, i2, i3, objectCodec, d, this.c, this.a, this.h, this.b, this.e);
    }

    public static MatchStrength b(InterfaceC9390og interfaceC9390og) {
        if (!interfaceC9390og.b()) {
            return MatchStrength.INCONCLUSIVE;
        }
        byte e = interfaceC9390og.e();
        if (e == -65) {
            if (interfaceC9390og.b()) {
                byte e2 = interfaceC9390og.e();
                if (e2 == -1) {
                    return MatchStrength.SOLID_MATCH;
                }
                if (C9591sc.b(3, e2)) {
                    return MatchStrength.SOLID_MATCH;
                }
                return MatchStrength.INCONCLUSIVE;
            }
        } else if (e == -97) {
            if (interfaceC9390og.b()) {
                if (interfaceC9390og.e() == -1) {
                    return MatchStrength.SOLID_MATCH;
                }
                return MatchStrength.WEAK_MATCH;
            }
        } else if (C9591sc.b(6, e)) {
            if (e == -39 && interfaceC9390og.b() && interfaceC9390og.e() == -39 && interfaceC9390og.b() && interfaceC9390og.e() == -9) {
                return MatchStrength.FULL_MATCH;
            }
            return MatchStrength.WEAK_MATCH;
        } else if (C9591sc.b(7, e)) {
            if (e == -12 || e == -11 || e == -10) {
                return MatchStrength.SOLID_MATCH;
            }
            return MatchStrength.NO_MATCH;
        }
        return MatchStrength.INCONCLUSIVE;
    }

    protected boolean e(int i) {
        if (this.c == null) {
            return false;
        }
        int i2 = this.b - this.h;
        while (i2 < i) {
            InputStream inputStream = this.c;
            byte[] bArr = this.a;
            int i3 = this.b;
            int read = inputStream.read(bArr, i3, bArr.length - i3);
            if (read < 1) {
                return false;
            }
            this.b += read;
            i2 += read;
        }
        return true;
    }
}
