package o;

import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* loaded from: classes5.dex */
public final class dHU implements dHZ {
    private final Map<X500Principal, Set<X509Certificate>> e;

    public dHU(X509Certificate... x509CertificateArr) {
        C8632dsu.d(x509CertificateArr, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (X509Certificate x509Certificate : x509CertificateArr) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            C8632dsu.b(subjectX500Principal, "");
            Object obj = linkedHashMap.get(subjectX500Principal);
            if (obj == null) {
                obj = new LinkedHashSet();
                linkedHashMap.put(subjectX500Principal, obj);
            }
            ((Set) obj).add(x509Certificate);
        }
        this.e = linkedHashMap;
    }

    @Override // o.dHZ
    public X509Certificate d(X509Certificate x509Certificate) {
        C8632dsu.d(x509Certificate, "");
        Set<X509Certificate> set = this.e.get(x509Certificate.getIssuerX500Principal());
        Object obj = null;
        if (set != null) {
            Iterator<T> it = set.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                try {
                    x509Certificate.verify(((X509Certificate) next).getPublicKey());
                    obj = next;
                    break;
                } catch (Exception unused) {
                }
            }
            return (X509Certificate) obj;
        }
        return null;
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof dHU) && C8632dsu.c(((dHU) obj).e, this.e));
    }

    public int hashCode() {
        return this.e.hashCode();
    }
}
