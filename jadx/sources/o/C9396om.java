package o;

import java.io.Writer;

/* renamed from: o.om  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C9396om extends Writer {
    private final C9443pg b;

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
    }

    public C9396om(C9382oY c9382oY) {
        this.b = new C9443pg(c9382oY);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c) {
        write(c);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence) {
        String charSequence2 = charSequence.toString();
        this.b.c(charSequence2, 0, charSequence2.length());
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence, int i, int i2) {
        String charSequence2 = charSequence.subSequence(i, i2).toString();
        this.b.c(charSequence2, 0, charSequence2.length());
        return this;
    }

    @Override // java.io.Writer
    public void write(char[] cArr) {
        this.b.c(cArr, 0, cArr.length);
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) {
        this.b.c(cArr, i, i2);
    }

    @Override // java.io.Writer
    public void write(int i) {
        this.b.e((char) i);
    }

    @Override // java.io.Writer
    public void write(String str) {
        this.b.c(str, 0, str.length());
    }

    @Override // java.io.Writer
    public void write(String str, int i, int i2) {
        this.b.c(str, i, i2);
    }

    public String d() {
        String a = this.b.a();
        this.b.m();
        return a;
    }
}
