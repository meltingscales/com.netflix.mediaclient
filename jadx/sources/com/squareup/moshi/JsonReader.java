package com.squareup.moshi;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import o.C7872dIo;
import o.InterfaceC7871dIn;
import o.dIA;
import o.dnG;
import o.dnH;
import o.dnM;
import okio.ByteString;

/* loaded from: classes5.dex */
public abstract class JsonReader implements Closeable {
    public boolean c;
    public boolean d;
    public int h;
    public int[] e = new int[32];
    public String[] b = new String[32];
    public int[] a = new int[32];

    /* loaded from: classes5.dex */
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

    public abstract void b();

    public abstract int c(c cVar);

    public abstract void c();

    public abstract int d(c cVar);

    public abstract void e();

    public abstract int f();

    public abstract double g();

    public abstract boolean h();

    public abstract boolean i();

    public final boolean j() {
        return this.c;
    }

    public abstract void k();

    public abstract Token l();

    public abstract String m();

    public abstract long n();

    public abstract <T> T o();

    public abstract void p();

    public abstract void t();

    public static JsonReader a(InterfaceC7871dIn interfaceC7871dIn) {
        return new dnG(interfaceC7871dIn);
    }

    public final void e(int i) {
        int i2 = this.h;
        int[] iArr = this.e;
        if (i2 == iArr.length) {
            if (i2 == 256) {
                throw new JsonDataException("Nesting too deep at " + d());
            }
            this.e = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.b;
            this.b = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.a;
            this.a = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.e;
        int i3 = this.h;
        this.h = i3 + 1;
        iArr3[i3] = i;
    }

    public final JsonEncodingException b(String str) {
        throw new JsonEncodingException(str + " at path " + d());
    }

    public final String d() {
        return dnH.a(this.h, this.e, this.b, this.a);
    }

    /* loaded from: classes5.dex */
    public static final class c {
        public final String[] a;
        public final dIA b;

        private c(String[] strArr, dIA dia) {
            this.a = strArr;
            this.b = dia;
        }

        public static c a(String... strArr) {
            try {
                ByteString[] byteStringArr = new ByteString[strArr.length];
                C7872dIo c7872dIo = new C7872dIo();
                for (int i = 0; i < strArr.length; i++) {
                    dnM.a(c7872dIo, strArr[i]);
                    c7872dIo.l();
                    byteStringArr[i] = c7872dIo.r();
                }
                return new c((String[]) strArr.clone(), dIA.a(byteStringArr));
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }
    }
}
