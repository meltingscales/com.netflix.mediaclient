package o;

import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.InvalidParameterException;

/* renamed from: o.dgf  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8241dgf {
    public static e c(String str, String str2) {
        e eVar = new e();
        eVar.b = str;
        eVar.d = str2;
        if (C8168dfL.g(str) && C8168dfL.g(str2)) {
            return null;
        }
        if (C8168dfL.h(str)) {
            eVar.c = false;
            if (str.matches("[0-9]+")) {
                eVar.a = str;
            } else {
                try {
                    String[] split = new URI(str).getPath().split("/");
                    if (split.length >= 1) {
                        eVar.a = split[split.length - 1];
                    } else {
                        throw new InvalidParameterException("catalogIdUrl expects at least one segment: " + str);
                    }
                } catch (URISyntaxException unused) {
                    throw new InvalidParameterException("catalogIdUrl is not a URL or ID: " + str);
                }
            }
        }
        if (C8168dfL.h(str2)) {
            eVar.c = true;
            if (str2.matches("[0-9]+")) {
                eVar.e = str2;
            } else {
                try {
                    String[] split2 = new URI(str2).getPath().split("/");
                    if (split2.length >= 2) {
                        eVar.e = split2[split2.length - 1];
                        if (C8168dfL.g(eVar.a)) {
                            eVar.a = split2[split2.length - 2];
                        }
                    } else {
                        throw new InvalidParameterException("episodeIdUrl expects at least two segments: " + str2);
                    }
                } catch (URISyntaxException unused2) {
                    throw new InvalidParameterException("episodeId is not a URL or ID: " + str2);
                }
            }
        }
        return eVar;
    }

    /* renamed from: o.dgf$e */
    /* loaded from: classes.dex */
    public static class e {
        public String a;
        public String b;
        public boolean c;
        public String d;
        public String e;

        public e(boolean z, String str, String str2, String str3, String str4) {
            this.c = z;
            this.d = str;
            this.b = str2;
            this.e = str3;
            this.a = str4;
        }

        public e() {
        }

        public VideoType d() {
            return this.c ? VideoType.EPISODE : VideoType.MOVIE;
        }
    }

    public static InterfaceC9814xA a(int i) {
        if (i <= 0) {
            i = 2500;
        }
        return new C9852xm(i, 2, 1.0f);
    }
}
