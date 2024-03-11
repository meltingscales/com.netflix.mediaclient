package o;

import java.io.File;
import o.InterfaceC8248dgm;

/* renamed from: o.dgv  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C8257dgv implements InterfaceC8248dgm.d {
    private final long b;
    private String c;
    private final long d;
    private final String e;

    @Override // o.InterfaceC8248dgm.d
    public long a() {
        return this.b;
    }

    @Override // o.InterfaceC8248dgm.d
    public long b() {
        return this.d;
    }

    @Override // o.InterfaceC8248dgm.d
    public String c() {
        return this.c;
    }

    @Override // o.InterfaceC8248dgm.d
    public String e() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8257dgv(String str, File file) {
        this.e = file.getName();
        this.d = file.lastModified();
        this.b = file.length();
        this.c = str;
    }

    public String toString() {
        return "FileSystemEntryImpl{mFileName='" + this.e + "', mTs=" + this.d + ", mSizeInBytes=" + this.b + ", mProfileId='" + this.c + "'}";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(String str, String str2) {
        if (C8168dfL.h(str2)) {
            return str2;
        }
        int length = str.length() / 2;
        int hashCode = str.substring(0, length).hashCode();
        return String.valueOf(hashCode) + String.valueOf(str.substring(length).hashCode());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String e(File file, File file2) {
        File parentFile = file2.getParentFile();
        if (parentFile == null || file.getName().equals(parentFile.getName())) {
            return null;
        }
        String name = parentFile.getName();
        if (C8168dfL.h(name)) {
            return C8137deh.b(name);
        }
        return null;
    }
}
