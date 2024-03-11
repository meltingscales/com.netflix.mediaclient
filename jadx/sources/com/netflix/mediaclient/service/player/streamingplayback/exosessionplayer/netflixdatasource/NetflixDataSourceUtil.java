package com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixdatasource;

import android.net.Uri;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSpec;
import com.netflix.mediaclient.service.player.StreamProfileType;
import o.C4632biF;
import o.aZD;

/* loaded from: classes3.dex */
public class NetflixDataSourceUtil {

    /* loaded from: classes3.dex */
    public enum DataSourceRequestType {
        MediaFragment,
        Header,
        Subtitles,
        RequestUnknown
    }

    public static String d(String str, String str2, int i, boolean z) {
        return c("nflx://" + str2, str, false, i, z);
    }

    public static String a(String str, String str2, int i, boolean z) {
        return c("nflx://" + str2, str, true, i, z);
    }

    public static String c(String str, String str2, boolean z, int i, boolean z2) {
        String str3 = str.contains("?") ? "&" : "?";
        String str4 = z ? "true" : "false";
        String str5 = z2 ? "true" : "false";
        return str + str3 + "samurai-is-header=" + str4 + "&samurai-tracktype=" + i + "&samurai-live=" + str5 + "&samurai-pbcid=" + str2;
    }

    public static int b(long j, StreamProfileType streamProfileType) {
        return (((int) (j / (streamProfileType == StreamProfileType.b ? 400 : 2000))) * 12) + 8192;
    }

    public static DataSourceRequestType c(DataSpec dataSpec) {
        Uri uri = dataSpec.uri;
        if (uri == null) {
            return DataSourceRequestType.RequestUnknown;
        }
        if (uri.getBooleanQueryParameter("samurai-is-header", false)) {
            return DataSourceRequestType.Header;
        }
        if (d(dataSpec) == 3) {
            return DataSourceRequestType.Subtitles;
        }
        return DataSourceRequestType.MediaFragment;
    }

    public static int d(DataSpec dataSpec) {
        if ("nflx".equals(dataSpec.uri.getScheme())) {
            return Integer.parseInt(dataSpec.uri.getQueryParameter("samurai-tracktype"));
        }
        return C4632biF.d(dataSpec.key);
    }

    public static String a(DataSpec dataSpec) {
        if ("nflx".equals(dataSpec.uri.getScheme())) {
            return dataSpec.uri.getHost();
        }
        C4632biF.c a = C4632biF.a(dataSpec.key);
        if (a == null) {
            return null;
        }
        return a.b;
    }

    public static long d(String str, long j) {
        if (str != null && !str.isEmpty() && !aZD.d(str)) {
            try {
                return Util.parseXsDateTime(str) + j;
            } catch (ParserException unused) {
            }
        }
        return -9223372036854775807L;
    }

    public static long b(DataSpec dataSpec) {
        String queryParameter = dataSpec.uri.getQueryParameter("samurai-req-wall");
        if (queryParameter != null) {
            try {
                return Long.parseLong(queryParameter);
            } catch (Exception unused) {
                return -9223372036854775807L;
            }
        }
        return -9223372036854775807L;
    }
}
