package o;

import com.netflix.mediaclient.service.offline.download.DownloadableType;
import java.io.File;

/* renamed from: o.bcb  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4336bcb {
    public static String c(String str, String str2) {
        return str + "/" + str2 + ".manifest";
    }

    public static File c(String str, String str2, DownloadableType downloadableType) {
        return new File(e(str, str2, downloadableType));
    }

    public static String e(String str, String str2, DownloadableType downloadableType) {
        return str + "/" + str2 + "." + downloadableType.e();
    }

    public static String a(String str) {
        return str + "/registry.json";
    }

    public static String b(String str, String str2) {
        return str + "/" + str2;
    }

    public static String e(File file) {
        return file.getAbsolutePath() + "/of_meta_registry.json";
    }
}
