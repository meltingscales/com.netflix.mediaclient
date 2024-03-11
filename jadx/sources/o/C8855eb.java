package o;

import android.util.Pair;
import com.airbnb.lottie.network.FileExtension;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;

/* renamed from: o.eb  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C8855eb {
    private final InterfaceC8858ee e;

    public C8855eb(InterfaceC8858ee interfaceC8858ee) {
        this.e = interfaceC8858ee;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Pair<FileExtension, InputStream> b(String str) {
        FileExtension fileExtension;
        try {
            File d = d(str);
            if (d == null) {
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(d);
            if (d.getAbsolutePath().endsWith(".zip")) {
                fileExtension = FileExtension.ZIP;
            } else {
                fileExtension = FileExtension.JSON;
            }
            C8909fc.e("Cache hit for " + str + " at " + d.getAbsolutePath());
            return new Pair<>(fileExtension, fileInputStream);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public File b(String str, InputStream inputStream, FileExtension fileExtension) {
        File file = new File(a(), d(str, fileExtension, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    return file;
                }
            }
        } finally {
            inputStream.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(String str, FileExtension fileExtension) {
        File file = new File(a(), d(str, fileExtension, true));
        File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
        boolean renameTo = file.renameTo(file2);
        C8909fc.e("Copying temp file to real file (" + file2 + ")");
        if (renameTo) {
            return;
        }
        C8909fc.b("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + ".");
    }

    private File d(String str) {
        File file = new File(a(), d(str, FileExtension.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(a(), d(str, FileExtension.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        return null;
    }

    private File a() {
        File e = this.e.e();
        if (e.isFile()) {
            e.delete();
        }
        if (!e.exists()) {
            e.mkdirs();
        }
        return e;
    }

    private static String d(String str, FileExtension fileExtension, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("lottie_cache_");
        sb.append(str.replaceAll("\\W+", ""));
        sb.append(z ? fileExtension.c() : fileExtension.c);
        return sb.toString();
    }
}
