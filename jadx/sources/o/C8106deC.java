package o;

import android.os.Environment;
import android.os.StatFs;
import io.reactivex.Single;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import io.reactivex.schedulers.Schedulers;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
import java.util.LinkedList;

/* renamed from: o.deC  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8106deC {
    public static boolean b(String str, String str2) {
        return new File(str).renameTo(new File(str2));
    }

    public static Single<Boolean> c(final File file, final File file2) {
        return Single.create(new SingleOnSubscribe() { // from class: o.deF
            @Override // io.reactivex.SingleOnSubscribe
            public final void subscribe(SingleEmitter singleEmitter) {
                C8106deC.a(file, file2, singleEmitter);
            }
        }).subscribeOn(Schedulers.io());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(File file, File file2, SingleEmitter singleEmitter) {
        C8166dfJ.c();
        singleEmitter.onSuccess(Boolean.valueOf(file.renameTo(file2)));
    }

    public static Single<Long> b(final File file, final File file2) {
        return Single.create(new SingleOnSubscribe() { // from class: o.deB
            @Override // io.reactivex.SingleOnSubscribe
            public final void subscribe(SingleEmitter singleEmitter) {
                C8106deC.e(file, file2, singleEmitter);
            }
        }).subscribeOn(Schedulers.io());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(File file, File file2, SingleEmitter singleEmitter) {
        C8166dfJ.c();
        FileChannel channel = new FileInputStream(file).getChannel();
        try {
            FileChannel channel2 = new FileOutputStream(file2).getChannel();
            singleEmitter.onSuccess(Long.valueOf(channel.transferTo(0L, channel.size(), channel2)));
            if (channel2 != null) {
                channel2.close();
            }
            channel.close();
        } catch (Throwable th) {
            if (channel != null) {
                try {
                    channel.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static byte[] j(File file) {
        FileInputStream fileInputStream;
        try {
            fileInputStream = h(file);
        } catch (Throwable th) {
            th = th;
            fileInputStream = null;
        }
        try {
            byte[] d = d((InputStream) fileInputStream);
            d((Closeable) fileInputStream);
            return d;
        } catch (Throwable th2) {
            th = th2;
            d((Closeable) fileInputStream);
            throw th;
        }
    }

    public static FileInputStream h(File file) {
        if (file.exists()) {
            if (file.isDirectory()) {
                throw new IOException("File '" + file + "' exists but is a directory");
            } else if (!file.canRead()) {
                throw new IOException("File '" + file + "' cannot be read");
            } else {
                return new FileInputStream(file);
            }
        }
        throw new FileNotFoundException("File '" + file + "' does not exist");
    }

    public static void d(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static byte[] d(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        a(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static long a(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[4096];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 == read) {
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += read;
        }
    }

    public static boolean e(File file) {
        return c(file, true);
    }

    public static boolean c(File file, boolean z) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            boolean z2 = true;
            if (listFiles != null && listFiles.length > 0) {
                boolean z3 = true;
                for (File file2 : listFiles) {
                    z3 = z3 && e(file2);
                }
                z2 = z3;
            }
            return z ? file.delete() : z2;
        }
        return file.delete();
    }

    public static Single<Boolean> d(final File file) {
        return Single.create(new SingleOnSubscribe() { // from class: o.deE
            @Override // io.reactivex.SingleOnSubscribe
            public final void subscribe(SingleEmitter singleEmitter) {
                C8106deC.d(file, singleEmitter);
            }
        }).subscribeOn(Schedulers.io());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(File file, SingleEmitter singleEmitter) {
        C8166dfJ.c();
        singleEmitter.onSuccess(Boolean.valueOf(file.isDirectory() || file.mkdirs()));
    }

    public static boolean b(String str) {
        File file = new File(str);
        return file.isDirectory() || file.mkdirs();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0033, code lost:
        if (r2 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0035, code lost:
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004e, code lost:
        if (r2 == null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean c(java.lang.String r5, byte[] r6) {
        /*
            java.lang.String r0 = "writeBytesToFile close IOException "
            java.lang.String r1 = "FileUtils"
            r2 = 0
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e java.io.FileNotFoundException -> L39
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e java.io.FileNotFoundException -> L39
            r3.write(r6)     // Catch: java.lang.Throwable -> L14 java.io.IOException -> L16 java.io.FileNotFoundException -> L19
            r3.close()     // Catch: java.io.IOException -> L12
            r5 = 1
            goto L55
        L12:
            r5 = move-exception
            goto L51
        L14:
            r5 = move-exception
            goto L57
        L16:
            r6 = move-exception
            r2 = r3
            goto L1f
        L19:
            r6 = move-exception
            r2 = r3
            goto L3a
        L1c:
            r5 = move-exception
            goto L56
        L1e:
            r6 = move-exception
        L1f:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1c
            r3.<init>()     // Catch: java.lang.Throwable -> L1c
            java.lang.String r4 = "writeBytesToFile IOException "
            r3.append(r4)     // Catch: java.lang.Throwable -> L1c
            r3.append(r5)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r5 = r3.toString()     // Catch: java.lang.Throwable -> L1c
            o.C1044Mm.e(r1, r5, r6)     // Catch: java.lang.Throwable -> L1c
            if (r2 == 0) goto L54
        L35:
            r2.close()     // Catch: java.io.IOException -> L12
            goto L54
        L39:
            r6 = move-exception
        L3a:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1c
            r3.<init>()     // Catch: java.lang.Throwable -> L1c
            java.lang.String r4 = "writeBytesToFile file not found "
            r3.append(r4)     // Catch: java.lang.Throwable -> L1c
            r3.append(r5)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r5 = r3.toString()     // Catch: java.lang.Throwable -> L1c
            o.C1044Mm.e(r1, r5, r6)     // Catch: java.lang.Throwable -> L1c
            if (r2 == 0) goto L54
            goto L35
        L51:
            o.C1044Mm.e(r1, r0, r5)
        L54:
            r5 = 0
        L55:
            return r5
        L56:
            r3 = r2
        L57:
            if (r3 == 0) goto L61
            r3.close()     // Catch: java.io.IOException -> L5d
            goto L61
        L5d:
            r6 = move-exception
            o.C1044Mm.e(r1, r0, r6)
        L61:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C8106deC.c(java.lang.String, byte[]):boolean");
    }

    public static long a(File file) {
        File[] listFiles;
        long j = 0;
        if (file != null && file.exists()) {
            if (!file.isDirectory()) {
                return file.length();
            }
            LinkedList linkedList = new LinkedList();
            linkedList.add(file);
            while (!linkedList.isEmpty()) {
                File file2 = (File) linkedList.remove();
                if (file2.exists() && (listFiles = file2.listFiles()) != null && listFiles.length != 0) {
                    for (File file3 : listFiles) {
                        if (file3.isDirectory()) {
                            linkedList.add(file3);
                        } else {
                            j += file3.length();
                        }
                    }
                }
            }
        }
        return j;
    }

    public static long f(File file) {
        if (file == null || !file.exists() || !file.isDirectory()) {
            C1044Mm.d("FileUtils", "Not directory or does not exists " + file.exists());
            return 0L;
        }
        return file.getUsableSpace();
    }

    public static boolean c(String str) {
        File file = new File(str);
        return file.exists() && file.isDirectory();
    }

    public static Single<Boolean> b(final File file) {
        return Single.create(new SingleOnSubscribe() { // from class: o.deG
            @Override // io.reactivex.SingleOnSubscribe
            public final void subscribe(SingleEmitter singleEmitter) {
                C8106deC.c(file, singleEmitter);
            }
        }).subscribeOn(Schedulers.io());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(File file, SingleEmitter singleEmitter) {
        C8166dfJ.c();
        singleEmitter.onSuccess(Boolean.valueOf(file.exists()));
    }

    public static long c() {
        return c(Environment.getDataDirectory());
    }

    public static long c(File file) {
        StatFs statFs = new StatFs(file.getAbsolutePath());
        return statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
    }
}
