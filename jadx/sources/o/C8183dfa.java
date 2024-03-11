package o;

import android.os.BadParcelableException;
import android.util.Pair;
import androidx.mediarouter.media.MediaRouter;
import com.google.android.gms.cast.CastDevice;
import java.net.InetAddress;

/* renamed from: o.dfa  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8183dfa {
    public static boolean e(InterfaceC5131bsv interfaceC5131bsv) {
        if (interfaceC5131bsv == null) {
            C1044Mm.j("MdxUtils", "MDX agent is null inside isAnyMdxTargetAvailable()...returning false!");
            return false;
        } else if (!interfaceC5131bsv.isReady()) {
            C1044Mm.e("MdxUtils", "MDX service is NOT ready");
            return false;
        } else {
            Pair<String, String>[] l = interfaceC5131bsv.l();
            if (l == null || l.length < 1) {
                C1044Mm.e("MdxUtils", "No MDX remote targets found");
                return false;
            }
            return true;
        }
    }

    public static String b(CastDevice castDevice) {
        InetAddress inetAddress;
        if (castDevice == null || (inetAddress = castDevice.getInetAddress()) == null) {
            return null;
        }
        return inetAddress.getHostAddress();
    }

    public static String d(MediaRouter.RouteInfo routeInfo) {
        try {
            return b(CastDevice.getFromBundle(routeInfo.getExtras()));
        } catch (BadParcelableException e) {
            C1044Mm.b("MdxUtils", e, "SPY-35084 - unable to read CastDevice extras", new Object[0]);
            return null;
        }
    }

    public static String e(String str) {
        int i;
        if (str == null) {
            return null;
        }
        String c = c("CastMediaRouteProviderService:", str);
        if (c != null) {
            return c;
        }
        String c2 = c("CastMediaRouteProviderService_Persistent:", str);
        if (c2 != null) {
            return c2;
        }
        int lastIndexOf = str.lastIndexOf(":");
        if (lastIndexOf >= 0 && str.length() > (i = lastIndexOf + 1)) {
            return str.substring(i);
        }
        return null;
    }

    private static String c(String str, String str2) {
        int length;
        int indexOf = str2.indexOf(str);
        if (indexOf >= 0 && str2.length() > (length = indexOf + str.length())) {
            return str2.substring(length);
        }
        return null;
    }
}
