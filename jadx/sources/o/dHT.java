package o;

import java.security.GeneralSecurityException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.TypeCastException;

/* loaded from: classes5.dex */
public final class dHT extends dHV {
    public static final b a = new b(null);
    private final dHZ e;

    public dHT(dHZ dhz) {
        C8632dsu.d(dhz, "");
        this.e = dhz;
    }

    @Override // o.dHV
    public List<Certificate> b(List<? extends Certificate> list, String str) {
        C8632dsu.d(list, "");
        C8632dsu.d((Object) str, "");
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        Object removeFirst = arrayDeque.removeFirst();
        C8632dsu.b(removeFirst, "");
        arrayList.add(removeFirst);
        boolean z = false;
        for (int i = 0; i < 9; i++) {
            Object obj = arrayList.get(arrayList.size() - 1);
            if (obj == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.security.cert.X509Certificate");
            }
            X509Certificate x509Certificate = (X509Certificate) obj;
            X509Certificate d = this.e.d(x509Certificate);
            if (d != null) {
                if (arrayList.size() > 1 || (!C8632dsu.c(x509Certificate, d))) {
                    arrayList.add(d);
                }
                if (c(d, d)) {
                    return arrayList;
                }
                z = true;
            } else {
                Iterator it = arrayDeque.iterator();
                C8632dsu.b(it, "");
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next == null) {
                        throw new TypeCastException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                    }
                    X509Certificate x509Certificate2 = (X509Certificate) next;
                    if (c(x509Certificate, x509Certificate2)) {
                        it.remove();
                        arrayList.add(x509Certificate2);
                    }
                }
                if (z) {
                    return arrayList;
                }
                throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate);
            }
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }

    private final boolean c(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        if (!C8632dsu.c(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN())) {
            return false;
        }
        try {
            x509Certificate.verify(x509Certificate2.getPublicKey());
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    public int hashCode() {
        return this.e.hashCode();
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof dHT) && C8632dsu.c(((dHT) obj).e, this.e));
    }

    /* loaded from: classes5.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }
    }
}
