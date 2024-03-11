package o;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: o.dHw  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC7855dHw {
    public static final c d = new c(null);
    public static final InterfaceC7855dHw a = new a();

    dIH a(File file);

    void a(File file, File file2);

    void b(File file);

    boolean c(File file);

    dIH d(File file);

    void e(File file);

    long h(File file);

    dIJ i(File file);

    /* renamed from: o.dHw$c */
    /* loaded from: classes5.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }
    }

    /* renamed from: o.dHw$a */
    /* loaded from: classes5.dex */
    public static final class a implements InterfaceC7855dHw {
        public String toString() {
            return "FileSystem.SYSTEM";
        }

        a() {
        }

        @Override // o.InterfaceC7855dHw
        public dIJ i(File file) {
            C8632dsu.d(file, "");
            return dIw.c(file);
        }

        @Override // o.InterfaceC7855dHw
        public dIH d(File file) {
            dIH c;
            dIH c2;
            C8632dsu.d(file, "");
            try {
                c2 = dIx.c(file, false, 1, null);
                return c2;
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                c = dIx.c(file, false, 1, null);
                return c;
            }
        }

        @Override // o.InterfaceC7855dHw
        public dIH a(File file) {
            C8632dsu.d(file, "");
            try {
                return dIw.e(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                return dIw.e(file);
            }
        }

        @Override // o.InterfaceC7855dHw
        public void b(File file) {
            C8632dsu.d(file, "");
            if (file.delete() || !file.exists()) {
                return;
            }
            throw new IOException("failed to delete " + file);
        }

        @Override // o.InterfaceC7855dHw
        public boolean c(File file) {
            C8632dsu.d(file, "");
            return file.exists();
        }

        @Override // o.InterfaceC7855dHw
        public long h(File file) {
            C8632dsu.d(file, "");
            return file.length();
        }

        @Override // o.InterfaceC7855dHw
        public void a(File file, File file2) {
            C8632dsu.d(file, "");
            C8632dsu.d(file2, "");
            b(file2);
            if (file.renameTo(file2)) {
                return;
            }
            throw new IOException("failed to rename " + file + " to " + file2);
        }

        @Override // o.InterfaceC7855dHw
        public void e(File file) {
            C8632dsu.d(file, "");
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                throw new IOException("not a readable directory: " + file);
            }
            for (File file2 : listFiles) {
                C8632dsu.b(file2, "");
                if (file2.isDirectory()) {
                    e(file2);
                }
                if (!file2.delete()) {
                    throw new IOException("failed to delete " + file2);
                }
            }
        }
    }
}
