package o;

import android.content.Context;
import android.util.Pair;
import com.airbnb.lottie.network.FileExtension;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipInputStream;

/* renamed from: o.ea  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C8854ea {
    private final C8855eb b;
    private final InterfaceC8856ec d;

    public C8854ea(C8855eb c8855eb, InterfaceC8856ec interfaceC8856ec) {
        this.b = c8855eb;
        this.d = interfaceC8856ec;
    }

    public C6849cl<C3658bG> a(Context context, String str, String str2) {
        C3658bG b = b(context, str, str2);
        if (b != null) {
            return new C6849cl<>(b);
        }
        C8909fc.e("Animation for " + str + " not found in cache. Fetching from network.");
        return d(context, str, str2);
    }

    private C3658bG b(Context context, String str, String str2) {
        C8855eb c8855eb;
        Pair<FileExtension, InputStream> b;
        C6849cl<C3658bG> a;
        if (str2 == null || (c8855eb = this.b) == null || (b = c8855eb.b(str)) == null) {
            return null;
        }
        FileExtension fileExtension = (FileExtension) b.first;
        InputStream inputStream = (InputStream) b.second;
        if (fileExtension == FileExtension.ZIP) {
            a = C3743bJ.d(context, new ZipInputStream(inputStream), str2);
        } else {
            a = C3743bJ.a(inputStream, str2);
        }
        if (a.b() != null) {
            return a.b();
        }
        return null;
    }

    private C6849cl<C3658bG> d(Context context, String str, String str2) {
        C8909fc.e("Fetching " + str);
        Closeable closeable = null;
        try {
            try {
                InterfaceC7887dW a = this.d.a(str);
                if (!a.b()) {
                    C6849cl<C3658bG> c6849cl = new C6849cl<>(new IllegalArgumentException(a.e()));
                    try {
                        a.close();
                    } catch (IOException e) {
                        C8909fc.a("LottieFetchResult close failed ", e);
                    }
                    return c6849cl;
                }
                C6849cl<C3658bG> d = d(context, str, a.a(), a.d(), str2);
                StringBuilder sb = new StringBuilder();
                sb.append("Completed fetch from network. Success: ");
                sb.append(d.b() != null);
                C8909fc.e(sb.toString());
                try {
                    a.close();
                } catch (IOException e2) {
                    C8909fc.a("LottieFetchResult close failed ", e2);
                }
                return d;
            } catch (Exception e3) {
                C6849cl<C3658bG> c6849cl2 = new C6849cl<>(e3);
                if (0 != 0) {
                    try {
                        closeable.close();
                    } catch (IOException e4) {
                        C8909fc.a("LottieFetchResult close failed ", e4);
                    }
                }
                return c6849cl2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    closeable.close();
                } catch (IOException e5) {
                    C8909fc.a("LottieFetchResult close failed ", e5);
                }
            }
            throw th;
        }
    }

    private C6849cl<C3658bG> d(Context context, String str, InputStream inputStream, String str2, String str3) {
        C6849cl<C3658bG> c;
        FileExtension fileExtension;
        C8855eb c8855eb;
        if (str2 == null) {
            str2 = "application/json";
        }
        if (str2.contains("application/zip") || str2.contains("application/x-zip") || str2.contains("application/x-zip-compressed") || str.split("\\?")[0].endsWith(".lottie")) {
            C8909fc.e("Handling zip response.");
            FileExtension fileExtension2 = FileExtension.ZIP;
            c = c(context, str, inputStream, str3);
            fileExtension = fileExtension2;
        } else {
            C8909fc.e("Received json response.");
            fileExtension = FileExtension.JSON;
            c = d(str, inputStream, str3);
        }
        if (str3 != null && c.b() != null && (c8855eb = this.b) != null) {
            c8855eb.d(str, fileExtension);
        }
        return c;
    }

    private C6849cl<C3658bG> c(Context context, String str, InputStream inputStream, String str2) {
        C8855eb c8855eb;
        if (str2 == null || (c8855eb = this.b) == null) {
            return C3743bJ.d(context, new ZipInputStream(inputStream), (String) null);
        }
        return C3743bJ.d(context, new ZipInputStream(new FileInputStream(c8855eb.b(str, inputStream, FileExtension.ZIP))), str);
    }

    private C6849cl<C3658bG> d(String str, InputStream inputStream, String str2) {
        C8855eb c8855eb;
        if (str2 == null || (c8855eb = this.b) == null) {
            return C3743bJ.a(inputStream, (String) null);
        }
        return C3743bJ.a(new FileInputStream(c8855eb.b(str, inputStream, FileExtension.JSON).getAbsolutePath()), str);
    }
}
