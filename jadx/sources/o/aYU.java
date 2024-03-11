package o;

import com.netflix.msl.msg.MessageContext;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public class aYU implements MessageContext {
    private boolean a;
    private final InterfaceC2089aZl b;
    private boolean c;
    dkF d;
    private final int e;
    private InterfaceC8383djo f;
    private boolean g;
    private byte[] h;
    private boolean i;
    private String j;
    private boolean k;
    private final boolean l;
    private boolean m;
    private AbstractC8424dlb n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f13455o;
    private String q;

    @Override // com.netflix.msl.msg.MessageContext
    public String b() {
        return this.j;
    }

    @Override // com.netflix.msl.msg.MessageContext
    public AbstractC8424dlb d(MessageContext.ReauthCode reauthCode, boolean z, boolean z2) {
        if (reauthCode == null && z2) {
            return this.n;
        }
        return null;
    }

    @Override // com.netflix.msl.msg.MessageContext
    public dkF e() {
        return null;
    }

    @Override // com.netflix.msl.msg.MessageContext
    public dkR f() {
        return null;
    }

    @Override // com.netflix.msl.msg.MessageContext
    public boolean g() {
        return this.a;
    }

    @Override // com.netflix.msl.msg.MessageContext
    public boolean h() {
        return this.i;
    }

    @Override // com.netflix.msl.msg.MessageContext
    public String i() {
        return this.q;
    }

    @Override // com.netflix.msl.msg.MessageContext
    public boolean j() {
        return this.g;
    }

    @Override // com.netflix.msl.msg.MessageContext
    public boolean k() {
        return this.m;
    }

    @Override // com.netflix.msl.msg.MessageContext
    public boolean l() {
        return this.f13455o;
    }

    @Override // com.netflix.msl.msg.MessageContext
    public boolean n() {
        return this.k;
    }

    public aYU(Boolean bool, Boolean bool2, Boolean bool3, String str, dkF dkf, AbstractC8424dlb abstractC8424dlb, byte[] bArr, String str2, InterfaceC8383djo interfaceC8383djo, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, InterfaceC2089aZl interfaceC2089aZl, Boolean bool8, int i) {
        this.a = bool != null ? bool.booleanValue() : true;
        this.i = bool2 != null ? bool2.booleanValue() : true;
        this.g = bool3 != null ? bool3.booleanValue() : false;
        this.q = str;
        this.d = dkf;
        this.n = abstractC8424dlb;
        this.h = bArr;
        this.j = str2;
        this.f = interfaceC8383djo;
        this.f13455o = bool4 != null ? bool4.booleanValue() : false;
        this.c = bool5 != null ? bool5.booleanValue() : false;
        this.m = bool6 != null ? bool6.booleanValue() : false;
        this.k = bool7 != null ? bool7.booleanValue() : false;
        this.b = interfaceC2089aZl;
        this.l = bool8.booleanValue();
        this.e = i;
    }

    @Override // com.netflix.msl.msg.MessageContext
    public Map<String, AbstractC8393djy> c() {
        return Collections.emptyMap();
    }

    @Override // com.netflix.msl.msg.MessageContext
    public Set<AbstractC8412dkq> a() {
        AbstractC8412dkq i = this.f.i();
        if (i != null) {
            return Collections.singleton(i);
        }
        return Collections.emptySet();
    }

    @Override // com.netflix.msl.msg.MessageContext
    public void c(dkL dkl, boolean z) {
        if (this.c) {
            if (dkl == null) {
                C1044Mm.d("msl_AndroidRequestMessageContext", "updateServiceTokens:: builder is null! This should not happen!");
                return;
            }
            Set<dkQ> b2 = dkl.b();
            HashSet<dkQ> hashSet = new HashSet();
            for (dkQ dkq : b2) {
                if (dkq == null) {
                    C1044Mm.d("msl_AndroidRequestMessageContext", "Service token is null, this should NOT happen");
                } else if (C8168dfL.g(dkq.d())) {
                    C1044Mm.d("msl_AndroidRequestMessageContext", "Service token name is empty, this should NOT happen");
                } else {
                    C1044Mm.a("msl_AndroidRequestMessageContext", "Excluding service token %s", dkq.d());
                    hashSet.add(dkq);
                }
            }
            for (dkQ dkq2 : hashSet) {
                dkl.b(dkq2);
            }
        }
    }

    @Override // com.netflix.msl.msg.MessageContext
    public void e(dkE dke) {
        byte[] bArr = this.h;
        if (bArr != null) {
            try {
                if (this.l) {
                    e(this.e, dke, bArr);
                } else {
                    dke.write(bArr);
                }
            } finally {
                dke.close();
            }
        }
    }

    private void e(int i, dkE dke, byte[] bArr) {
        int length = bArr.length;
        if (i < 1024) {
            throw new IllegalArgumentException("chunk size invalid (" + i + " < 1024)");
        }
        int i2 = 1;
        int i3 = 0;
        int i4 = length;
        while (i4 > 0) {
            int min = Math.min(i4, i);
            C1044Mm.e("msl_AndroidRequestMessageContext", "Writing chunk #" + i2 + ":" + min + "bytes at " + i3 + " : total =" + length);
            dke.write(bArr, i3, min);
            i4 -= min;
            i3 += min;
            if (i4 > 0) {
                dke.flush();
            }
            i2++;
        }
    }

    @Override // com.netflix.msl.msg.MessageContext
    public void e(InterfaceC8413dkr interfaceC8413dkr, InputStream inputStream) {
        InterfaceC2089aZl interfaceC2089aZl = this.b;
        if (interfaceC2089aZl != null) {
            interfaceC2089aZl.a(interfaceC8413dkr, inputStream);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aYU ayu = (aYU) obj;
        if (this.a == ayu.a && this.i == ayu.i && this.g == ayu.g && this.f13455o == ayu.f13455o && this.m == ayu.m && this.k == ayu.k) {
            String str = this.j;
            if (str == null ? ayu.j == null : str.equals(ayu.j)) {
                dkF dkf = this.d;
                if (dkf == null ? ayu.d == null : dkf.equals(ayu.d)) {
                    String str2 = this.q;
                    if (str2 == null ? ayu.q == null : str2.equals(ayu.q)) {
                        AbstractC8424dlb abstractC8424dlb = this.n;
                        if (abstractC8424dlb == null ? ayu.n == null : abstractC8424dlb.equals(ayu.n)) {
                            if (Arrays.equals(this.h, ayu.h) && this.c == ayu.c) {
                                InterfaceC8383djo interfaceC8383djo = this.f;
                                InterfaceC8383djo interfaceC8383djo2 = ayu.f;
                                return interfaceC8383djo != null ? interfaceC8383djo.equals(interfaceC8383djo2) : interfaceC8383djo2 == null;
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        boolean z = this.a;
        boolean z2 = this.i;
        boolean z3 = this.g;
        String str = this.j;
        int hashCode = str != null ? str.hashCode() : 0;
        dkF dkf = this.d;
        int hashCode2 = dkf != null ? dkf.hashCode() : 0;
        String str2 = this.q;
        int hashCode3 = str2 != null ? str2.hashCode() : 0;
        AbstractC8424dlb abstractC8424dlb = this.n;
        int hashCode4 = abstractC8424dlb != null ? abstractC8424dlb.hashCode() : 0;
        int hashCode5 = Arrays.hashCode(this.h);
        InterfaceC8383djo interfaceC8383djo = this.f;
        return ((((((((((((((((((((((((z ? 1 : 0) * 31) + (z2 ? 1 : 0)) * 31) + (z3 ? 1 : 0)) * 31) + hashCode) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (interfaceC8383djo != null ? interfaceC8383djo.hashCode() : 0)) * 31) + (this.f13455o ? 1 : 0)) * 31) + (this.c ? 1 : 0)) * 31) + (this.m ? 1 : 0)) * 31) + (this.k ? 1 : 0);
    }

    public String toString() {
        return "AndroidRequestMessageContext{encrypted=" + this.a + ", integrityProtected=" + this.i + ", nonReplayable=" + this.g + ", remoteEntityIdentity='" + this.j + "', debugContext=" + this.d + ", userId='" + this.q + "', userAuthData=" + this.n + ", payload=" + Arrays.toString(this.h) + ", keyRequestDataProvider=" + this.f + ", requestingTokens=" + this.f13455o + ", excludeServiceTokens=" + this.c + ", sendEntityauthdataWithMasterTokenEnabled=" + this.m + ", restrictEntityauthWithMasterTokenToKeyRenewal=" + this.k + ", useChunking =" + this.l + ", chunkSize =" + this.e + '}';
    }

    public static b d() {
        return new b();
    }

    /* loaded from: classes3.dex */
    public static class b {
        private Boolean a;
        private InterfaceC2089aZl b;
        private int c;
        private dkF d;
        private Boolean e;
        private Boolean f;
        private byte[] g;
        private InterfaceC8383djo h;
        private Boolean i;
        private String j;
        private AbstractC8424dlb k;
        private Boolean l;
        private Boolean m;
        private Boolean n;

        /* renamed from: o  reason: collision with root package name */
        private boolean f13456o;
        private String r;

        public b a(Boolean bool) {
            this.l = bool;
            return this;
        }

        public b a(byte[] bArr) {
            this.g = bArr;
            return this;
        }

        public b b(int i) {
            this.c = i;
            return this;
        }

        public b b(Boolean bool) {
            this.m = bool;
            return this;
        }

        public b b(InterfaceC8383djo interfaceC8383djo) {
            this.h = interfaceC8383djo;
            return this;
        }

        public b c(Boolean bool) {
            this.i = bool;
            return this;
        }

        public b c(String str) {
            this.r = str;
            return this;
        }

        public b c(AbstractC8424dlb abstractC8424dlb) {
            this.k = abstractC8424dlb;
            return this;
        }

        public b d(Boolean bool) {
            this.e = bool;
            return this;
        }

        public b d(dkF dkf) {
            this.d = dkf;
            return this;
        }

        public b e(Boolean bool) {
            this.a = bool;
            return this;
        }

        public b e(InterfaceC2089aZl interfaceC2089aZl) {
            this.b = interfaceC2089aZl;
            return this;
        }

        public b i(Boolean bool) {
            this.n = bool;
            return this;
        }

        b() {
        }

        public b c(boolean z) {
            this.m = Boolean.valueOf(z);
            return this;
        }

        public b f(Boolean bool) {
            this.f13456o = bool.booleanValue();
            return this;
        }

        public aYU d() {
            return new aYU(this.a, this.f, this.i, this.r, this.d, this.k, this.g, this.j, this.h, this.l, this.e, this.n, this.m, this.b, Boolean.valueOf(this.f13456o), this.c);
        }

        public String toString() {
            return "AndroidRequestMessageContextBuilder{encrypted=" + this.a + ", integrityProtected=" + this.f + ", nonReplayable=" + this.i + ", userId='" + this.r + "', debugContext=" + this.d + ", userAuthData=" + this.k + ", payload=" + Arrays.toString(this.g) + ", remoteEntityIdentity='" + this.j + "', keyRequestDataProvider=" + this.h + ", requestingTokens=" + this.l + ", excludeServiceTokens=" + this.e + ", useChunking =" + this.f13456o + ", chunkSize =" + this.c + '}';
        }
    }
}
