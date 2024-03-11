package com.airbnb.lottie.parser.moshi;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import o.C7872dIo;
import o.C8845eR;
import o.C8848eU;
import o.InterfaceC7871dIn;
import o.dIA;
import okio.ByteString;

/* loaded from: classes2.dex */
public abstract class JsonReader implements Closeable {
    private static final String[] h = new String[128];
    public boolean a;
    public boolean d;
    public int f;
    public int[] c = new int[32];
    public String[] e = new String[32];
    public int[] b = new int[32];

    /* loaded from: classes2.dex */
    public enum Token {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    public abstract void a();

    public abstract int c(e eVar);

    public abstract void c();

    public abstract void d();

    public abstract void e();

    public abstract boolean f();

    public abstract double g();

    public abstract boolean h();

    public abstract String i();

    public abstract int j();

    public abstract void k();

    public abstract Token l();

    public abstract void m();

    public abstract String o();

    static {
        for (int i = 0; i <= 31; i++) {
            h[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = h;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public static JsonReader a(InterfaceC7871dIn interfaceC7871dIn) {
        return new C8848eU(interfaceC7871dIn);
    }

    public final void a(int i) {
        int i2 = this.f;
        int[] iArr = this.c;
        if (i2 == iArr.length) {
            if (i2 == 256) {
                throw new JsonDataException("Nesting too deep at " + b());
            }
            this.c = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.e;
            this.e = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.b;
            this.b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.c;
        int i3 = this.f;
        this.f = i3 + 1;
        iArr3[i3] = i;
    }

    public final JsonEncodingException d(String str) {
        throw new JsonEncodingException(str + " at path " + b());
    }

    public final String b() {
        return C8845eR.a(this.f, this.c, this.e, this.b);
    }

    /* loaded from: classes2.dex */
    public static final class e {
        public final String[] b;
        public final dIA e;

        private e(String[] strArr, dIA dia) {
            this.b = strArr;
            this.e = dia;
        }

        public static e d(String... strArr) {
            try {
                ByteString[] byteStringArr = new ByteString[strArr.length];
                C7872dIo c7872dIo = new C7872dIo();
                for (int i = 0; i < strArr.length; i++) {
                    JsonReader.b(c7872dIo, strArr[i]);
                    c7872dIo.l();
                    byteStringArr[i] = c7872dIo.r();
                }
                return new e((String[]) strArr.clone(), dIA.a(byteStringArr));
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(o.dIq r7, java.lang.String r8) {
        /*
            java.lang.String[] r0 = com.airbnb.lottie.parser.moshi.JsonReader.h
            r1 = 34
            r7.c(r1)
            int r2 = r8.length()
            r3 = 0
            r4 = r3
        Ld:
            if (r3 >= r2) goto L36
            char r5 = r8.charAt(r3)
            r6 = 128(0x80, float:1.794E-43)
            if (r5 >= r6) goto L1c
            r5 = r0[r5]
            if (r5 != 0) goto L29
            goto L33
        L1c:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L23
            java.lang.String r5 = "\\u2028"
            goto L29
        L23:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L33
            java.lang.String r5 = "\\u2029"
        L29:
            if (r4 >= r3) goto L2e
            r7.c(r8, r4, r3)
        L2e:
            r7.b(r5)
            int r4 = r3 + 1
        L33:
            int r3 = r3 + 1
            goto Ld
        L36:
            if (r4 >= r2) goto L3b
            r7.c(r8, r4, r2)
        L3b:
            r7.c(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.parser.moshi.JsonReader.b(o.dIq, java.lang.String):void");
    }
}
