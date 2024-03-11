package o;

import com.netflix.msl.MslConstants;
import com.netflix.msl.MslEncodingException;
import com.netflix.msl.io.MslEncoderException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: o.dkz  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C8421dkz implements InterfaceC8400dke {
    private final Set<MslConstants.CompressionAlgorithm> a;
    private final int b;
    private final List<String> d;
    private final Set<C8404dki> e;

    public Set<MslConstants.CompressionAlgorithm> b() {
        return this.a;
    }

    public Set<C8404dki> d() {
        return this.e;
    }

    public static C8421dkz a(C8421dkz c8421dkz, C8421dkz c8421dkz2) {
        int i;
        if (c8421dkz == null || c8421dkz2 == null) {
            return null;
        }
        EnumSet noneOf = EnumSet.noneOf(MslConstants.CompressionAlgorithm.class);
        noneOf.addAll(c8421dkz.a);
        noneOf.retainAll(c8421dkz2.a);
        ArrayList arrayList = new ArrayList(c8421dkz.d);
        arrayList.retainAll(c8421dkz2.d);
        HashSet hashSet = new HashSet();
        hashSet.addAll(c8421dkz.e);
        hashSet.retainAll(c8421dkz2.e);
        int i2 = c8421dkz.b;
        int i3 = -1;
        if (i2 != -1 && (i = c8421dkz2.b) != -1) {
            i3 = Math.min(i2, i);
        }
        return new C8421dkz(noneOf, arrayList, hashSet, i3);
    }

    public C8421dkz(Set<MslConstants.CompressionAlgorithm> set, List<String> list, Set<C8404dki> set2) {
        this(set, list, set2, -1);
    }

    public C8421dkz(Set<MslConstants.CompressionAlgorithm> set, List<String> list, Set<C8404dki> set2, int i) {
        this.a = Collections.unmodifiableSet(set == null ? EnumSet.noneOf(MslConstants.CompressionAlgorithm.class) : set);
        this.d = Collections.unmodifiableList(list == null ? new ArrayList<>() : list);
        this.e = Collections.unmodifiableSet(set2 == null ? new HashSet<>() : set2);
        this.b = i;
    }

    public C8421dkz(C8401dkf c8401dkf) {
        try {
            EnumSet noneOf = EnumSet.noneOf(MslConstants.CompressionAlgorithm.class);
            C8398dkc i = c8401dkf.i("compressionalgos");
            for (int i2 = 0; i != null && i2 < i.b(); i2++) {
                try {
                    noneOf.add(MslConstants.CompressionAlgorithm.valueOf(i.d(i2)));
                } catch (IllegalArgumentException unused) {
                }
            }
            this.a = Collections.unmodifiableSet(noneOf);
            ArrayList arrayList = new ArrayList();
            C8398dkc i3 = c8401dkf.i("languages");
            for (int i4 = 0; i3 != null && i4 < i3.b(); i4++) {
                arrayList.add(i3.d(i4));
            }
            this.d = Collections.unmodifiableList(arrayList);
            HashSet hashSet = new HashSet();
            C8398dkc i5 = c8401dkf.i("encoderformats");
            for (int i6 = 0; i5 != null && i6 < i5.b(); i6++) {
                C8404dki c = C8404dki.c(i5.d(i6));
                if (c != null) {
                    hashSet.add(c);
                }
            }
            this.e = Collections.unmodifiableSet(hashSet);
            this.b = c8401dkf.b("maxpayloadchunksize", -1);
        } catch (MslEncoderException e) {
            throw new MslEncodingException(C8373dje.bd, "capabilities " + c8401dkf, e);
        }
    }

    @Override // o.InterfaceC8400dke
    public byte[] c(AbstractC8399dkd abstractC8399dkd, C8404dki c8404dki) {
        return abstractC8399dkd.c(b(abstractC8399dkd, c8404dki), c8404dki);
    }

    @Override // o.InterfaceC8400dke
    public C8401dkf b(AbstractC8399dkd abstractC8399dkd, C8404dki c8404dki) {
        C8401dkf e = abstractC8399dkd.e();
        e.e("compressionalgos", abstractC8399dkd.e(this.a));
        e.e("languages", this.d);
        e.e("maxpayloadchunksize", Integer.valueOf(this.b));
        C8398dkc c = abstractC8399dkd.c();
        for (C8404dki c8404dki2 : this.e) {
            c.b(-1, c8404dki2.d());
        }
        e.e("encoderformats", c);
        return e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8421dkz) {
            C8421dkz c8421dkz = (C8421dkz) obj;
            return this.a.equals(c8421dkz.a) && this.d.equals(c8421dkz.d) && this.e.equals(c8421dkz.e) && this.b == c8421dkz.b;
        }
        return false;
    }

    public int hashCode() {
        return (this.a.hashCode() ^ this.d.hashCode()) ^ this.e.hashCode();
    }
}
