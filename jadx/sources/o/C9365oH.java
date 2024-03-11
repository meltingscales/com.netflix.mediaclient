package o;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.format.MatchStrength;
import java.io.ByteArrayInputStream;
import java.io.CharConversionException;
import java.io.DataInput;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import org.chromium.net.PrivateKeyType;

/* renamed from: o.oH  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9365oH {
    private boolean a;
    private int b;
    private final C9389of c;
    private final boolean d;
    private final InputStream e;
    private int f;
    private final byte[] h;
    private int i;

    private boolean c(int i) {
        if ((65280 & i) == 0) {
            this.a = true;
        } else if ((i & PrivateKeyType.INVALID) != 0) {
            return false;
        } else {
            this.a = false;
        }
        this.b = 2;
        return true;
    }

    public C9365oH(C9389of c9389of, InputStream inputStream) {
        this.a = true;
        this.c = c9389of;
        this.e = inputStream;
        this.h = c9389of.e();
        this.i = 0;
        this.f = 0;
        this.d = true;
    }

    public C9365oH(C9389of c9389of, byte[] bArr, int i, int i2) {
        this.a = true;
        this.c = c9389of;
        this.e = null;
        this.h = bArr;
        this.i = i;
        this.f = i + i2;
        this.d = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003e, code lost:
        if (c(r1 >>> 16) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005b, code lost:
        if (c((r1[r4 + 1] & 255) | ((r1[r4] & 255) << 8)) != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.fasterxml.jackson.core.JsonEncoding c() {
        /*
            r8 = this;
            r0 = 4
            boolean r1 = r8.a(r0)
            r2 = 1
            r3 = 2
            if (r1 == 0) goto L41
            byte[] r1 = r8.h
            int r4 = r8.i
            r5 = r1[r4]
            int r6 = r4 + 1
            r6 = r1[r6]
            int r7 = r4 + 2
            r7 = r1[r7]
            int r4 = r4 + 3
            r1 = r1[r4]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r4 = r5 << 24
            r5 = r6 & 255(0xff, float:3.57E-43)
            int r5 = r5 << 16
            r4 = r4 | r5
            r5 = r7 & 255(0xff, float:3.57E-43)
            int r5 = r5 << 8
            r4 = r4 | r5
            r1 = r1 | r4
            boolean r4 = r8.b(r1)
            if (r4 == 0) goto L31
            goto L5d
        L31:
            boolean r4 = r8.e(r1)
            if (r4 == 0) goto L38
            goto L5d
        L38:
            int r1 = r1 >>> 16
            boolean r1 = r8.c(r1)
            if (r1 == 0) goto L84
            goto L5d
        L41:
            boolean r1 = r8.a(r3)
            if (r1 == 0) goto L84
            byte[] r1 = r8.h
            int r4 = r8.i
            r5 = r1[r4]
            int r4 = r4 + r2
            r1 = r1[r4]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r4 = r5 & 255(0xff, float:3.57E-43)
            int r4 = r4 << 8
            r1 = r1 | r4
            boolean r1 = r8.c(r1)
            if (r1 == 0) goto L84
        L5d:
            int r1 = r8.b
            if (r1 == r2) goto L81
            if (r1 == r3) goto L77
            if (r1 != r0) goto L6f
            boolean r0 = r8.a
            if (r0 == 0) goto L6c
            com.fasterxml.jackson.core.JsonEncoding r0 = com.fasterxml.jackson.core.JsonEncoding.UTF32_BE
            goto L86
        L6c:
            com.fasterxml.jackson.core.JsonEncoding r0 = com.fasterxml.jackson.core.JsonEncoding.UTF32_LE
            goto L86
        L6f:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Internal error"
            r0.<init>(r1)
            throw r0
        L77:
            boolean r0 = r8.a
            if (r0 == 0) goto L7e
            com.fasterxml.jackson.core.JsonEncoding r0 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE
            goto L86
        L7e:
            com.fasterxml.jackson.core.JsonEncoding r0 = com.fasterxml.jackson.core.JsonEncoding.UTF16_LE
            goto L86
        L81:
            com.fasterxml.jackson.core.JsonEncoding r0 = com.fasterxml.jackson.core.JsonEncoding.UTF8
            goto L86
        L84:
            com.fasterxml.jackson.core.JsonEncoding r0 = com.fasterxml.jackson.core.JsonEncoding.UTF8
        L86:
            o.of r1 = r8.c
            r1.d(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C9365oH.c():com.fasterxml.jackson.core.JsonEncoding");
    }

    public static int e(DataInput dataInput) {
        int readUnsignedByte = dataInput.readUnsignedByte();
        if (readUnsignedByte != 239) {
            return readUnsignedByte;
        }
        int readUnsignedByte2 = dataInput.readUnsignedByte();
        if (readUnsignedByte2 != 187) {
            throw new IOException("Unexpected byte 0x" + Integer.toHexString(readUnsignedByte2) + " following 0xEF; should get 0xBB as part of UTF-8 BOM");
        }
        int readUnsignedByte3 = dataInput.readUnsignedByte();
        if (readUnsignedByte3 != 191) {
            throw new IOException("Unexpected byte 0x" + Integer.toHexString(readUnsignedByte3) + " following 0xEF 0xBB; should get 0xBF as part of UTF-8 BOM");
        }
        return dataInput.readUnsignedByte();
    }

    public Reader e() {
        JsonEncoding i = this.c.i();
        int b = i.b();
        if (b != 8 && b != 16) {
            if (b == 32) {
                C9389of c9389of = this.c;
                return new C9401or(c9389of, this.e, this.h, this.i, this.f, c9389of.i().a());
            }
            throw new RuntimeException("Internal error");
        }
        InputStream inputStream = this.e;
        if (inputStream == null) {
            inputStream = new ByteArrayInputStream(this.h, this.i, this.f);
        } else if (this.i < this.f) {
            inputStream = new C9397on(this.c, inputStream, this.h, this.i, this.f);
        }
        return new InputStreamReader(inputStream, i.d());
    }

    public JsonParser e(int i, ObjectCodec objectCodec, C9377oT c9377oT, C9381oX c9381oX, int i2) {
        int i3 = this.i;
        JsonEncoding c = c();
        int i4 = this.i;
        if (c == JsonEncoding.UTF8 && JsonFactory.Feature.CANONICALIZE_FIELD_NAMES.a(i2)) {
            return new C9374oQ(this.c, i, this.e, objectCodec, c9377oT.d(i2), this.h, this.i, this.f, i4 - i3, this.d);
        }
        return new C9369oL(this.c, i, e(), objectCodec, c9381oX.e(i2));
    }

    public static MatchStrength b(InterfaceC9390og interfaceC9390og) {
        if (!interfaceC9390og.b()) {
            return MatchStrength.INCONCLUSIVE;
        }
        byte e = interfaceC9390og.e();
        if (e == -17) {
            if (!interfaceC9390og.b()) {
                return MatchStrength.INCONCLUSIVE;
            }
            if (interfaceC9390og.e() != -69) {
                return MatchStrength.NO_MATCH;
            }
            if (!interfaceC9390og.b()) {
                return MatchStrength.INCONCLUSIVE;
            }
            if (interfaceC9390og.e() != -65) {
                return MatchStrength.NO_MATCH;
            }
            if (!interfaceC9390og.b()) {
                return MatchStrength.INCONCLUSIVE;
            }
            e = interfaceC9390og.e();
        }
        int b = b(interfaceC9390og, e);
        if (b < 0) {
            return MatchStrength.INCONCLUSIVE;
        }
        if (b == 123) {
            int d = d(interfaceC9390og);
            if (d < 0) {
                return MatchStrength.INCONCLUSIVE;
            }
            if (d == 34 || d == 125) {
                return MatchStrength.SOLID_MATCH;
            }
            return MatchStrength.NO_MATCH;
        } else if (b == 91) {
            int d2 = d(interfaceC9390og);
            if (d2 < 0) {
                return MatchStrength.INCONCLUSIVE;
            }
            if (d2 == 93 || d2 == 91) {
                return MatchStrength.SOLID_MATCH;
            }
            return MatchStrength.SOLID_MATCH;
        } else {
            MatchStrength matchStrength = MatchStrength.WEAK_MATCH;
            if (b == 34) {
                return matchStrength;
            }
            if (b > 57 || b < 48) {
                if (b == 45) {
                    int d3 = d(interfaceC9390og);
                    if (d3 < 0) {
                        return MatchStrength.INCONCLUSIVE;
                    }
                    return (d3 > 57 || d3 < 48) ? MatchStrength.NO_MATCH : matchStrength;
                } else if (b == 110) {
                    return e(interfaceC9390og, "ull", matchStrength);
                } else {
                    if (b == 116) {
                        return e(interfaceC9390og, "rue", matchStrength);
                    }
                    if (b == 102) {
                        return e(interfaceC9390og, "alse", matchStrength);
                    }
                    return MatchStrength.NO_MATCH;
                }
            }
            return matchStrength;
        }
    }

    private static MatchStrength e(InterfaceC9390og interfaceC9390og, String str, MatchStrength matchStrength) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!interfaceC9390og.b()) {
                return MatchStrength.INCONCLUSIVE;
            }
            if (interfaceC9390og.e() != str.charAt(i)) {
                return MatchStrength.NO_MATCH;
            }
        }
        return matchStrength;
    }

    private static int d(InterfaceC9390og interfaceC9390og) {
        if (interfaceC9390og.b()) {
            return b(interfaceC9390og, interfaceC9390og.e());
        }
        return -1;
    }

    private static int b(InterfaceC9390og interfaceC9390og, byte b) {
        while (true) {
            int i = b & 255;
            if (i != 32 && i != 13 && i != 10 && i != 9) {
                return i;
            }
            if (!interfaceC9390og.b()) {
                return -1;
            }
            b = interfaceC9390og.e();
        }
    }

    private boolean b(int i) {
        if (i == -16842752) {
            b("3412");
        } else if (i == -131072) {
            this.i += 4;
            this.b = 4;
            this.a = false;
            return true;
        } else if (i == 65279) {
            this.a = true;
            this.i += 4;
            this.b = 4;
            return true;
        } else if (i == 65534) {
            b("2143");
        }
        int i2 = i >>> 16;
        if (i2 == 65279) {
            this.i += 2;
            this.b = 2;
            this.a = true;
            return true;
        } else if (i2 == 65534) {
            this.i += 2;
            this.b = 2;
            this.a = false;
            return true;
        } else if ((i >>> 8) == 15711167) {
            this.i += 3;
            this.b = 1;
            this.a = true;
            return true;
        } else {
            return false;
        }
    }

    private boolean e(int i) {
        if ((i >> 8) == 0) {
            this.a = true;
        } else if ((16777215 & i) == 0) {
            this.a = false;
        } else if (((-16711681) & i) == 0) {
            b("3412");
        } else if ((i & (-65281)) != 0) {
            return false;
        } else {
            b("2143");
        }
        this.b = 4;
        return true;
    }

    private void b(String str) {
        throw new CharConversionException("Unsupported UCS-4 endianness (" + str + ") detected");
    }

    protected boolean a(int i) {
        int read;
        int i2 = this.f - this.i;
        while (i2 < i) {
            InputStream inputStream = this.e;
            if (inputStream == null) {
                read = -1;
            } else {
                byte[] bArr = this.h;
                int i3 = this.f;
                read = inputStream.read(bArr, i3, bArr.length - i3);
            }
            if (read < 1) {
                return false;
            }
            this.f += read;
            i2 += read;
        }
        return true;
    }
}
