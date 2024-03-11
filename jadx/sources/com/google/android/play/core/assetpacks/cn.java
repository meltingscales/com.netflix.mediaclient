package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

/* loaded from: classes5.dex */
final class cn extends OutputStream {
    private final ds a = new ds();
    private final File b;
    private final eo c;
    private long d;
    private long e;
    private FileOutputStream f;
    private eu g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public cn(File file, eo eoVar) {
        this.b = file;
        this.c = eoVar;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        write(new byte[]{(byte) i}, 0, 1);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        int min;
        while (i2 > 0) {
            if (this.d == 0 && this.e == 0) {
                int b = this.a.b(bArr, i, i2);
                if (b == -1) {
                    return;
                }
                i += b;
                i2 -= b;
                eu c = this.a.c();
                this.g = c;
                if (c.d()) {
                    this.d = 0L;
                    this.c.l(this.g.f(), 0, this.g.f().length);
                    this.e = this.g.f().length;
                } else if (!this.g.h() || this.g.g()) {
                    byte[] f = this.g.f();
                    this.c.l(f, 0, f.length);
                    this.d = this.g.b();
                } else {
                    this.c.j(this.g.f());
                    File file = new File(this.b, this.g.c());
                    file.getParentFile().mkdirs();
                    this.d = this.g.b();
                    this.f = new FileOutputStream(file);
                }
            }
            if (!this.g.g()) {
                if (this.g.d()) {
                    this.c.e(this.e, bArr, i, i2);
                    this.e += i2;
                    min = i2;
                } else if (!this.g.h()) {
                    min = (int) Math.min(i2, this.d);
                    this.c.e((this.g.f().length + this.g.b()) - this.d, bArr, i, min);
                    this.d -= min;
                } else {
                    min = (int) Math.min(i2, this.d);
                    this.f.write(bArr, i, min);
                    long j = this.d - min;
                    this.d = j;
                    if (j == 0) {
                        this.f.close();
                    }
                }
                i += min;
                i2 -= min;
            }
        }
    }
}
