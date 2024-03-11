package o;

import com.squareup.moshi.JsonDataException;
import java.io.Closeable;
import java.io.Flushable;
import java.util.Arrays;

/* loaded from: classes5.dex */
public abstract class dnK implements Closeable, Flushable {
    boolean c;
    String e;
    boolean g;
    boolean i;
    int h = 0;
    int[] f = new int[32];
    String[] j = new String[32];
    int[] d = new int[32];
    int a = -1;

    public abstract dnK a();

    public abstract dnK a(double d);

    public abstract dnK a(boolean z);

    public abstract dnK b();

    public abstract dnK b(String str);

    public abstract dnK c();

    public abstract dnK d();

    public abstract dnK d(String str);

    public abstract dnK e();

    public abstract dnK e(long j);

    public abstract dnK e(Number number);

    public static dnK b(dIq diq) {
        return new dnM(diq);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int i() {
        int i = this.h;
        if (i == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        return this.f[i - 1];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean g() {
        int i = this.h;
        int[] iArr = this.f;
        if (i != iArr.length) {
            return false;
        }
        if (i == 256) {
            throw new JsonDataException("Nesting too deep at " + f() + ": circular reference?");
        }
        this.f = Arrays.copyOf(iArr, iArr.length * 2);
        String[] strArr = this.j;
        this.j = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        int[] iArr2 = this.d;
        this.d = Arrays.copyOf(iArr2, iArr2.length * 2);
        if (this instanceof dnL) {
            dnL dnl = (dnL) this;
            Object[] objArr = dnl.b;
            dnl.b = Arrays.copyOf(objArr, objArr.length * 2);
            return true;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(int i) {
        int[] iArr = this.f;
        int i2 = this.h;
        this.h = i2 + 1;
        iArr[i2] = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(int i) {
        this.f[this.h - 1] = i;
    }

    public final void j() {
        int i = i();
        if (i != 5 && i != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        this.i = true;
    }

    public final String f() {
        return dnH.a(this.h, this.f, this.j, this.d);
    }
}
