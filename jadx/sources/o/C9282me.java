package o;

import android.util.JsonReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import o.C9246lv;
import o.C9246lv.a;

/* renamed from: o.me  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9282me<T extends C9246lv.a> {
    private final ReentrantReadWriteLock c = new ReentrantReadWriteLock();
    private final File d;

    public final File b() {
        return this.d;
    }

    public C9282me(File file) {
        this.d = file;
    }

    public final void a(T t) {
        ReentrantReadWriteLock.WriteLock writeLock = this.c.writeLock();
        writeLock.lock();
        try {
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(b()), C8674dui.i);
            BufferedWriter bufferedWriter = outputStreamWriter instanceof BufferedWriter ? (BufferedWriter) outputStreamWriter : new BufferedWriter(outputStreamWriter, 8192);
            t.toStream(new C9246lv(bufferedWriter));
            C8608drx.a(bufferedWriter, null);
        } finally {
            writeLock.unlock();
        }
    }

    public final T d(drM<? super JsonReader, ? extends T> drm) {
        ReentrantReadWriteLock.ReadLock readLock = this.c.readLock();
        readLock.lock();
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(b()), C8674dui.i);
            BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
            T invoke = drm.invoke(new JsonReader(bufferedReader));
            C8608drx.a(bufferedReader, null);
            return invoke;
        } finally {
            readLock.unlock();
        }
    }
}
