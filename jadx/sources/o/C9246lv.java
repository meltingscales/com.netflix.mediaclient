package o;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Writer;

/* renamed from: o.lv  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C9246lv extends C9248lx {
    private final C9210lL c;
    private final Writer d;

    /* renamed from: o.lv$a */
    /* loaded from: classes2.dex */
    public interface a {
        void toStream(C9246lv c9246lv);
    }

    @Override // o.C9248lx
    public /* bridge */ /* synthetic */ C9248lx a() {
        return super.a();
    }

    @Override // o.C9248lx
    public /* bridge */ /* synthetic */ C9248lx a(long j) {
        return super.a(j);
    }

    @Override // o.C9248lx
    public /* bridge */ /* synthetic */ C9248lx a(Number number) {
        return super.a(number);
    }

    @Override // o.C9248lx
    public /* bridge */ /* synthetic */ C9248lx b() {
        return super.b();
    }

    @Override // o.C9248lx
    public /* bridge */ /* synthetic */ C9248lx b(Boolean bool) {
        return super.b(bool);
    }

    @Override // o.C9248lx
    public /* bridge */ /* synthetic */ C9248lx b(boolean z) {
        return super.b(z);
    }

    @Override // o.C9248lx
    public /* bridge */ /* synthetic */ C9248lx c() {
        return super.c();
    }

    @Override // o.C9248lx, java.io.Closeable, java.lang.AutoCloseable
    public /* bridge */ /* synthetic */ void close() {
        super.close();
    }

    @Override // o.C9248lx
    public /* bridge */ /* synthetic */ C9248lx d() {
        return super.d();
    }

    @Override // o.C9248lx
    public /* bridge */ /* synthetic */ C9248lx e() {
        return super.e();
    }

    @Override // o.C9248lx
    public /* bridge */ /* synthetic */ C9248lx e(String str) {
        return super.e(str);
    }

    @Override // o.C9248lx, java.io.Flushable
    public /* bridge */ /* synthetic */ void flush() {
        super.flush();
    }

    public C9246lv(Writer writer) {
        super(writer);
        e(false);
        this.d = writer;
        this.c = new C9210lL();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9246lv(C9246lv c9246lv, C9210lL c9210lL) {
        super(c9246lv.d);
        e(c9246lv.f());
        this.d = c9246lv.d;
        this.c = c9210lL;
    }

    @Override // o.C9248lx
    /* renamed from: a */
    public C9246lv c(String str) {
        super.c(str);
        return this;
    }

    public void c(Object obj, boolean z) {
        if (obj instanceof a) {
            ((a) obj).toStream(this);
        } else {
            this.c.a(obj, this, z);
        }
    }

    public void c(Object obj) {
        c(obj, false);
    }

    public void c(File file) {
        Throwable th;
        BufferedReader bufferedReader;
        if (file == null || file.length() <= 0) {
            return;
        }
        super.flush();
        j();
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
        } catch (Throwable th2) {
            th = th2;
            bufferedReader = null;
        }
        try {
            C9244lt.e(bufferedReader, this.d);
            C9244lt.b(bufferedReader);
            this.d.flush();
        } catch (Throwable th3) {
            th = th3;
            C9244lt.b(bufferedReader);
            throw th;
        }
    }
}
