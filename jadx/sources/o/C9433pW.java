package o;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.std.StdValueInstantiator;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import java.lang.reflect.Member;
import java.util.HashMap;

/* renamed from: o.pW  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C9433pW {
    protected static final String[] e = {"default", "from-String", "from-int", "from-long", "from-double", "from-boolean", "delegate", "property-based"};
    protected SettableBeanProperty[] a;
    protected final AbstractC9445pi b;
    protected final boolean d;
    protected final boolean f;
    protected SettableBeanProperty[] h;
    protected SettableBeanProperty[] j;
    protected final AnnotatedWithParams[] c = new AnnotatedWithParams[9];
    protected int g = 0;
    protected boolean i = false;

    public C9433pW(AbstractC9445pi abstractC9445pi, MapperConfig<?> mapperConfig) {
        this.b = abstractC9445pi;
        this.d = mapperConfig.f();
        this.f = mapperConfig.a(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS);
    }

    public ValueInstantiator b(DeserializationContext deserializationContext) {
        DeserializationConfig c = deserializationContext.c();
        JavaType c2 = c(deserializationContext, this.c[6], this.h);
        JavaType c3 = c(deserializationContext, this.c[8], this.a);
        StdValueInstantiator stdValueInstantiator = new StdValueInstantiator(c, this.b.t());
        AnnotatedWithParams[] annotatedWithParamsArr = this.c;
        stdValueInstantiator.e(annotatedWithParamsArr[0], annotatedWithParamsArr[6], c2, this.h, annotatedWithParamsArr[7], this.j);
        stdValueInstantiator.a(this.c[8], c3, this.a);
        stdValueInstantiator.a(this.c[1]);
        stdValueInstantiator.d(this.c[2]);
        stdValueInstantiator.e(this.c[3]);
        stdValueInstantiator.c(this.c[4]);
        stdValueInstantiator.b(this.c[5]);
        return stdValueInstantiator;
    }

    public void a(AnnotatedWithParams annotatedWithParams) {
        this.c[0] = (AnnotatedWithParams) c(annotatedWithParams);
    }

    public void e(AnnotatedWithParams annotatedWithParams, boolean z) {
        a(annotatedWithParams, 1, z);
    }

    public void a(AnnotatedWithParams annotatedWithParams, boolean z) {
        a(annotatedWithParams, 2, z);
    }

    public void d(AnnotatedWithParams annotatedWithParams, boolean z) {
        a(annotatedWithParams, 3, z);
    }

    public void b(AnnotatedWithParams annotatedWithParams, boolean z) {
        a(annotatedWithParams, 4, z);
    }

    public void c(AnnotatedWithParams annotatedWithParams, boolean z) {
        a(annotatedWithParams, 5, z);
    }

    public void d(AnnotatedWithParams annotatedWithParams, boolean z, SettableBeanProperty[] settableBeanPropertyArr, int i) {
        if (annotatedWithParams.c(i).r()) {
            if (a(annotatedWithParams, 8, z)) {
                this.a = settableBeanPropertyArr;
            }
        } else if (a(annotatedWithParams, 6, z)) {
            this.h = settableBeanPropertyArr;
        }
    }

    public void e(AnnotatedWithParams annotatedWithParams, boolean z, SettableBeanProperty[] settableBeanPropertyArr) {
        Integer num;
        if (a(annotatedWithParams, 7, z)) {
            if (settableBeanPropertyArr.length > 1) {
                HashMap hashMap = new HashMap();
                int length = settableBeanPropertyArr.length;
                for (int i = 0; i < length; i++) {
                    String a = settableBeanPropertyArr[i].a();
                    if ((!a.isEmpty() || settableBeanPropertyArr[i].g() == null) && (num = (Integer) hashMap.put(a, Integer.valueOf(i))) != null) {
                        throw new IllegalArgumentException(String.format("Duplicate creator property \"%s\" (index %s vs %d) for type %s ", a, num, Integer.valueOf(i), C9537rU.u(this.b.o())));
                    }
                }
            }
            this.j = settableBeanPropertyArr;
        }
    }

    public boolean a() {
        return this.c[0] != null;
    }

    public boolean b() {
        return this.c[6] != null;
    }

    public boolean e() {
        return this.c[7] != null;
    }

    private JavaType c(DeserializationContext deserializationContext, AnnotatedWithParams annotatedWithParams, SettableBeanProperty[] settableBeanPropertyArr) {
        if (!this.i || annotatedWithParams == null) {
            return null;
        }
        int i = 0;
        if (settableBeanPropertyArr != null) {
            int length = settableBeanPropertyArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (settableBeanPropertyArr[i2] == null) {
                    i = i2;
                    break;
                } else {
                    i2++;
                }
            }
        }
        DeserializationConfig c = deserializationContext.c();
        JavaType c2 = annotatedWithParams.c(i);
        AnnotationIntrospector h = c.h();
        if (h != null) {
            AnnotatedParameter d = annotatedWithParams.d(i);
            Object b = h.b((AbstractC9509qt) d);
            if (b != null) {
                return c2.a(deserializationContext.d(d, b));
            }
            return h.e(c, d, c2);
        }
        return c2;
    }

    private <T extends AnnotatedMember> T c(T t) {
        if (t != null && this.d) {
            C9537rU.b((Member) t.b(), this.f);
        }
        return t;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
        if ((!r9) != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected boolean a(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams r7, int r8, boolean r9) {
        /*
            r6 = this;
            r0 = 1
            int r1 = r0 << r8
            r6.i = r0
            com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] r2 = r6.c
            r2 = r2[r8]
            if (r2 == 0) goto L65
            int r3 = r6.g
            r3 = r3 & r1
            r4 = 0
            if (r3 == 0) goto L14
            if (r9 != 0) goto L18
            return r4
        L14:
            r3 = r9 ^ 1
            if (r3 == 0) goto L65
        L18:
            java.lang.Class r3 = r2.getClass()
            java.lang.Class r5 = r7.getClass()
            if (r3 != r5) goto L65
            java.lang.Class r3 = r2.e(r4)
            java.lang.Class r5 = r7.e(r4)
            if (r3 != r5) goto L5e
            boolean r3 = r6.d(r7)
            if (r3 == 0) goto L33
            return r4
        L33:
            boolean r3 = r6.d(r2)
            if (r3 == 0) goto L3a
            goto L65
        L3a:
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String[] r3 = o.C9433pW.e
            r8 = r3[r8]
            r1[r4] = r8
            if (r9 == 0) goto L48
            java.lang.String r8 = "explicitly marked"
            goto L4a
        L48:
            java.lang.String r8 = "implicitly discovered"
        L4a:
            r1[r0] = r8
            r8 = 2
            r1[r8] = r2
            r8 = 3
            r1[r8] = r7
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Conflicting %s creators: already had %s creator %s, encountered another: %s"
            java.lang.String r8 = java.lang.String.format(r8, r1)
            r7.<init>(r8)
            throw r7
        L5e:
            boolean r2 = r5.isAssignableFrom(r3)
            if (r2 == 0) goto L65
            return r4
        L65:
            if (r9 == 0) goto L6c
            int r9 = r6.g
            r9 = r9 | r1
            r6.g = r9
        L6c:
            com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] r9 = r6.c
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r7 = r6.c(r7)
            com.fasterxml.jackson.databind.introspect.AnnotatedWithParams r7 = (com.fasterxml.jackson.databind.introspect.AnnotatedWithParams) r7
            r9[r8] = r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C9433pW.a(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams, int, boolean):boolean");
    }

    protected boolean d(AnnotatedWithParams annotatedWithParams) {
        return C9537rU.t(annotatedWithParams.g()) && "valueOf".equals(annotatedWithParams.d());
    }
}
