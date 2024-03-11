package o;

import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import kotlin.TypeCastException;

/* loaded from: classes5.dex */
public final class dHY implements HostnameVerifier {
    public static final dHY c = new dHY();

    private dHY() {
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String str, SSLSession sSLSession) {
        C8632dsu.d((Object) str, "");
        C8632dsu.d(sSLSession, "");
        try {
            Certificate certificate = sSLSession.getPeerCertificates()[0];
            if (certificate != null) {
                return d(str, (X509Certificate) certificate);
            }
            throw new TypeCastException("null cannot be cast to non-null type java.security.cert.X509Certificate");
        } catch (SSLException unused) {
            return false;
        }
    }

    public final boolean d(String str, X509Certificate x509Certificate) {
        C8632dsu.d((Object) str, "");
        C8632dsu.d(x509Certificate, "");
        return dGB.b(str) ? c(str, x509Certificate) : e(str, x509Certificate);
    }

    private final boolean c(String str, X509Certificate x509Certificate) {
        String a = C7831dGz.a(str);
        List<String> a2 = a(x509Certificate, 7);
        if (!(a2 instanceof Collection) || !a2.isEmpty()) {
            for (String str2 : a2) {
                if (C8632dsu.c((Object) a, (Object) C7831dGz.a(str2))) {
                    return true;
                }
            }
        }
        return false;
    }

    private final boolean e(String str, X509Certificate x509Certificate) {
        Locale locale = Locale.US;
        C8632dsu.b(locale, "");
        if (str == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        String lowerCase = str.toLowerCase(locale);
        C8632dsu.b(lowerCase, "");
        List<String> a = a(x509Certificate, 2);
        if (!(a instanceof Collection) || !a.isEmpty()) {
            for (String str2 : a) {
                if (c.b(lowerCase, str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    private final boolean b(String str, String str2) {
        boolean i;
        boolean a;
        boolean i2;
        boolean a2;
        boolean a3;
        boolean a4;
        boolean d;
        boolean i3;
        int b;
        boolean a5;
        int c2;
        if (str != null && str.length() != 0) {
            i = C8691duz.i(str, ".", false, 2, null);
            if (!i) {
                a = C8691duz.a(str, "..", false, 2, null);
                if (!a && str2 != null && str2.length() != 0) {
                    i2 = C8691duz.i(str2, ".", false, 2, null);
                    if (!i2) {
                        a2 = C8691duz.a(str2, "..", false, 2, null);
                        if (!a2) {
                            a3 = C8691duz.a(str, ".", false, 2, null);
                            if (!a3) {
                                str = str + ".";
                            }
                            String str3 = str;
                            a4 = C8691duz.a(str2, ".", false, 2, null);
                            if (!a4) {
                                str2 = str2 + ".";
                            }
                            Locale locale = Locale.US;
                            C8632dsu.b(locale, "");
                            if (str2 == null) {
                                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                            }
                            String lowerCase = str2.toLowerCase(locale);
                            C8632dsu.b(lowerCase, "");
                            d = duD.d((CharSequence) lowerCase, (CharSequence) "*", false, 2, (Object) null);
                            if (!d) {
                                return C8632dsu.c((Object) str3, (Object) lowerCase);
                            }
                            i3 = C8691duz.i(lowerCase, "*.", false, 2, null);
                            if (i3) {
                                b = duD.b((CharSequence) lowerCase, '*', 1, false, 4, (Object) null);
                                if (b == -1 && str3.length() >= lowerCase.length() && !C8632dsu.c((Object) "*.", (Object) lowerCase)) {
                                    String substring = lowerCase.substring(1);
                                    C8632dsu.b(substring, "");
                                    a5 = C8691duz.a(str3, substring, false, 2, null);
                                    if (a5) {
                                        int length = str3.length() - substring.length();
                                        if (length > 0) {
                                            c2 = duD.c((CharSequence) str3, '.', length - 1, false, 4, (Object) null);
                                            if (c2 != -1) {
                                                return false;
                                            }
                                        }
                                        return true;
                                    }
                                    return false;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final List<String> c(X509Certificate x509Certificate) {
        List<String> g;
        C8632dsu.d(x509Certificate, "");
        g = C8576dqs.g((Collection) a(x509Certificate, 7), (Iterable) a(x509Certificate, 2));
        return g;
    }

    private final List<String> a(X509Certificate x509Certificate, int i) {
        List<String> i2;
        List<String> i3;
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                i3 = C8569dql.i();
                return i3;
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && !(!C8632dsu.c(list.get(0), Integer.valueOf(i))) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            i2 = C8569dql.i();
            return i2;
        }
    }
}
