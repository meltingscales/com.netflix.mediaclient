package o;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: o.pY  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C9435pY {
    private final JavaType a;
    private final c[] b;
    private final C9542rZ[] c;
    private final String[] d;
    private final Map<String, Object> e;

    protected C9435pY(JavaType javaType, c[] cVarArr, Map<String, Object> map, String[] strArr, C9542rZ[] c9542rZArr) {
        this.a = javaType;
        this.b = cVarArr;
        this.e = map;
        this.d = strArr;
        this.c = c9542rZArr;
    }

    protected C9435pY(C9435pY c9435pY) {
        this.a = c9435pY.a;
        c[] cVarArr = c9435pY.b;
        this.b = cVarArr;
        this.e = c9435pY.e;
        int length = cVarArr.length;
        this.d = new String[length];
        this.c = new C9542rZ[length];
    }

    public static b d(JavaType javaType) {
        return new b(javaType);
    }

    public C9435pY a() {
        return new C9435pY(this);
    }

    public boolean c(JsonParser jsonParser, DeserializationContext deserializationContext, String str, Object obj) {
        Object obj2 = this.e.get(str);
        boolean z = false;
        if (obj2 == null) {
            return false;
        }
        String A = jsonParser.A();
        if (obj2 instanceof List) {
            for (Integer num : (List) obj2) {
                if (e(jsonParser, deserializationContext, str, obj, A, num.intValue())) {
                    z = true;
                }
            }
            return z;
        }
        return e(jsonParser, deserializationContext, str, obj, A, ((Integer) obj2).intValue());
    }

    private final boolean e(JsonParser jsonParser, DeserializationContext deserializationContext, String str, Object obj, String str2, int i) {
        if (this.b[i].e(str)) {
            if (obj != null && this.c[i] != null) {
                b(jsonParser, deserializationContext, obj, i, str2);
                this.c[i] = null;
                return true;
            }
            this.d[i] = str2;
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0094, code lost:
        if (r9.c[r0] != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a9, code lost:
        if (r9.d[r0] != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ab, code lost:
        r12 = r9.d;
        r8 = r12[r0];
        r12[r0] = null;
        b(r10, r11, r13, r0, r8);
        r9.c[r0] = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean e(com.fasterxml.jackson.core.JsonParser r10, com.fasterxml.jackson.databind.DeserializationContext r11, java.lang.String r12, java.lang.Object r13) {
        /*
            r9 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r9.e
            java.lang.Object r0 = r0.get(r12)
            if (r0 != 0) goto La
            r10 = 0
            return r10
        La:
            boolean r1 = r0 instanceof java.util.List
            r2 = 1
            if (r1 == 0) goto L73
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r13 = r0.iterator()
            java.lang.Object r0 = r13.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            o.pY$c[] r1 = r9.b
            int r3 = r0.intValue()
            r1 = r1[r3]
            boolean r12 = r1.e(r12)
            if (r12 == 0) goto L4d
            java.lang.String r11 = r10.A()
            r10.T()
            java.lang.String[] r10 = r9.d
            int r12 = r0.intValue()
            r10[r12] = r11
        L38:
            boolean r10 = r13.hasNext()
            if (r10 == 0) goto L72
            java.lang.String[] r10 = r9.d
            java.lang.Object r12 = r13.next()
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            r10[r12] = r11
            goto L38
        L4d:
            o.rZ r12 = new o.rZ
            r12.<init>(r10, r11)
            r12.b(r10)
            o.rZ[] r10 = r9.c
            int r11 = r0.intValue()
            r10[r11] = r12
        L5d:
            boolean r10 = r13.hasNext()
            if (r10 == 0) goto L72
            o.rZ[] r10 = r9.c
            java.lang.Object r11 = r13.next()
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            r10[r11] = r12
            goto L5d
        L72:
            return r2
        L73:
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            o.pY$c[] r1 = r9.b
            r1 = r1[r0]
            boolean r12 = r1.e(r12)
            if (r12 == 0) goto L97
            java.lang.String[] r12 = r9.d
            java.lang.String r1 = r10.A()
            r12[r0] = r1
            r10.T()
            if (r13 == 0) goto Lbe
            o.rZ[] r12 = r9.c
            r12 = r12[r0]
            if (r12 == 0) goto Lbe
            goto Lab
        L97:
            o.rZ r12 = new o.rZ
            r12.<init>(r10, r11)
            r12.b(r10)
            o.rZ[] r1 = r9.c
            r1[r0] = r12
            if (r13 == 0) goto Lbe
            java.lang.String[] r12 = r9.d
            r12 = r12[r0]
            if (r12 == 0) goto Lbe
        Lab:
            java.lang.String[] r12 = r9.d
            r8 = r12[r0]
            r1 = 0
            r12[r0] = r1
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r13
            r7 = r0
            r3.b(r4, r5, r6, r7, r8)
            o.rZ[] r10 = r9.c
            r10[r0] = r1
        Lbe:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C9435pY.e(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.String, java.lang.Object):boolean");
    }

    public Object c(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) {
        int length = this.b.length;
        for (int i = 0; i < length; i++) {
            String str = this.d[i];
            if (str == null) {
                C9542rZ c9542rZ = this.c[i];
                if (c9542rZ != null) {
                    if (c9542rZ.p().b()) {
                        JsonParser g = c9542rZ.g(jsonParser);
                        g.Q();
                        SettableBeanProperty e = this.b[i].e();
                        Object e2 = AbstractC9543ra.e(g, deserializationContext, e.d());
                        if (e2 != null) {
                            e.e(obj, e2);
                        } else if (!this.b[i].a()) {
                            deserializationContext.e(obj.getClass(), e.a(), "Missing external type id property '%s'", this.b[i].d());
                        } else {
                            str = this.b[i].b();
                        }
                    }
                }
            } else if (this.c[i] == null) {
                SettableBeanProperty e3 = this.b[i].e();
                if (e3.q() || deserializationContext.d(DeserializationFeature.FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY)) {
                    deserializationContext.e(obj.getClass(), e3.a(), "Missing property '%s' for external type id '%s'", e3.a(), this.b[i].d());
                }
                return obj;
            }
            b(jsonParser, deserializationContext, obj, i, str);
        }
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
        if (r12.d(com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY) != false) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object d(com.fasterxml.jackson.core.JsonParser r11, com.fasterxml.jackson.databind.DeserializationContext r12, o.C9491qb r13, com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator r14) {
        /*
            r10 = this;
            o.pY$c[] r0 = r10.b
            int r0 = r0.length
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            r3 = r2
        L7:
            if (r3 >= r0) goto Lc3
            java.lang.String[] r4 = r10.d
            r4 = r4[r3]
            o.pY$c[] r5 = r10.b
            r5 = r5[r3]
            if (r4 != 0) goto L3e
            o.rZ[] r6 = r10.c
            r6 = r6[r3]
            if (r6 != 0) goto L1b
            goto Lbf
        L1b:
            boolean r6 = r5.a()
            if (r6 != 0) goto L39
            com.fasterxml.jackson.databind.JavaType r6 = r10.a
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r7 = r5.e()
            java.lang.String r7 = r7.a()
            java.lang.String r8 = r5.d()
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            java.lang.String r9 = "Missing external type id property '%s'"
            r12.c(r6, r7, r9, r8)
            goto L71
        L39:
            java.lang.String r4 = r5.b()
            goto L71
        L3e:
            o.rZ[] r6 = r10.c
            r6 = r6[r3]
            if (r6 != 0) goto L71
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r6 = r5.e()
            boolean r7 = r6.q()
            if (r7 != 0) goto L56
            com.fasterxml.jackson.databind.DeserializationFeature r7 = com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY
            boolean r7 = r12.d(r7)
            if (r7 == 0) goto L71
        L56:
            com.fasterxml.jackson.databind.JavaType r7 = r10.a
            java.lang.String r8 = r6.a()
            java.lang.String r6 = r6.a()
            o.pY$c[] r9 = r10.b
            r9 = r9[r3]
            java.lang.String r9 = r9.d()
            java.lang.Object[] r6 = new java.lang.Object[]{r6, r9}
            java.lang.String r9 = "Missing property '%s' for external type id '%s'"
            r12.c(r7, r8, r9, r6)
        L71:
            o.rZ[] r6 = r10.c
            r6 = r6[r3]
            if (r6 == 0) goto L7d
            java.lang.Object r6 = r10.a(r11, r12, r3, r4)
            r1[r3] = r6
        L7d:
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r6 = r5.e()
            int r7 = r6.i()
            if (r7 < 0) goto Lbf
            r7 = r1[r3]
            r13.a(r6, r7)
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r5 = r5.c()
            if (r5 == 0) goto Lbf
            int r6 = r5.i()
            if (r6 < 0) goto Lbf
            com.fasterxml.jackson.databind.JavaType r6 = r5.d()
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            boolean r6 = r6.d(r7)
            if (r6 == 0) goto La5
            goto Lbc
        La5:
            o.rZ r6 = new o.rZ
            r6.<init>(r11, r12)
            r6.i(r4)
            o.pp r4 = r5.o()
            com.fasterxml.jackson.core.JsonParser r7 = r6.r()
            java.lang.Object r4 = r4.b(r7, r12)
            r6.close()
        Lbc:
            r13.a(r5, r4)
        Lbf:
            int r3 = r3 + 1
            goto L7
        Lc3:
            java.lang.Object r11 = r14.e(r12, r13)
        Lc7:
            if (r2 >= r0) goto Ldf
            o.pY$c[] r12 = r10.b
            r12 = r12[r2]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r12 = r12.e()
            int r13 = r12.i()
            if (r13 >= 0) goto Ldc
            r13 = r1[r2]
            r12.e(r11, r13)
        Ldc:
            int r2 = r2 + 1
            goto Lc7
        Ldf:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C9435pY.d(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, o.qb, com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator):java.lang.Object");
    }

    protected final Object a(JsonParser jsonParser, DeserializationContext deserializationContext, int i, String str) {
        JsonParser g = this.c[i].g(jsonParser);
        if (g.Q() == JsonToken.VALUE_NULL) {
            return null;
        }
        C9542rZ c9542rZ = new C9542rZ(jsonParser, deserializationContext);
        c9542rZ.n();
        c9542rZ.i(str);
        c9542rZ.b(g);
        c9542rZ.i();
        JsonParser g2 = c9542rZ.g(jsonParser);
        g2.Q();
        return this.b[i].e().a(g2, deserializationContext);
    }

    protected final void b(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, int i, String str) {
        JsonParser g = this.c[i].g(jsonParser);
        if (g.Q() == JsonToken.VALUE_NULL) {
            this.b[i].e().e(obj, (Object) null);
            return;
        }
        C9542rZ c9542rZ = new C9542rZ(jsonParser, deserializationContext);
        c9542rZ.n();
        c9542rZ.i(str);
        c9542rZ.b(g);
        c9542rZ.i();
        JsonParser g2 = c9542rZ.g(jsonParser);
        g2.Q();
        this.b[i].e().d(g2, deserializationContext, obj);
    }

    /* renamed from: o.pY$b */
    /* loaded from: classes5.dex */
    public static class b {
        private final JavaType e;
        private final List<c> b = new ArrayList();
        private final Map<String, Object> a = new HashMap();

        protected b(JavaType javaType) {
            this.e = javaType;
        }

        public void e(SettableBeanProperty settableBeanProperty, AbstractC9543ra abstractC9543ra) {
            Integer valueOf = Integer.valueOf(this.b.size());
            this.b.add(new c(settableBeanProperty, abstractC9543ra));
            c(settableBeanProperty.a(), valueOf);
            c(abstractC9543ra.b(), valueOf);
        }

        private void c(String str, Integer num) {
            Object obj = this.a.get(str);
            if (obj == null) {
                this.a.put(str, num);
            } else if (obj instanceof List) {
                ((List) obj).add(num);
            } else {
                LinkedList linkedList = new LinkedList();
                linkedList.add(obj);
                linkedList.add(num);
                this.a.put(str, linkedList);
            }
        }

        public C9435pY d(BeanPropertyMap beanPropertyMap) {
            int size = this.b.size();
            c[] cVarArr = new c[size];
            for (int i = 0; i < size; i++) {
                c cVar = this.b.get(i);
                SettableBeanProperty e = beanPropertyMap.e(cVar.d());
                if (e != null) {
                    cVar.e(e);
                }
                cVarArr[i] = cVar;
            }
            return new C9435pY(this.e, cVarArr, this.a, null, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.pY$c */
    /* loaded from: classes5.dex */
    public static final class c {
        private final SettableBeanProperty b;
        private final AbstractC9543ra c;
        private final String d;
        private SettableBeanProperty e;

        public SettableBeanProperty c() {
            return this.e;
        }

        public String d() {
            return this.d;
        }

        public SettableBeanProperty e() {
            return this.b;
        }

        public void e(SettableBeanProperty settableBeanProperty) {
            this.e = settableBeanProperty;
        }

        public c(SettableBeanProperty settableBeanProperty, AbstractC9543ra abstractC9543ra) {
            this.b = settableBeanProperty;
            this.c = abstractC9543ra;
            this.d = abstractC9543ra.b();
        }

        public boolean e(String str) {
            return str.equals(this.d);
        }

        public boolean a() {
            return this.c.a() != null;
        }

        public String b() {
            Class<?> a = this.c.a();
            if (a == null) {
                return null;
            }
            return this.c.d().e((Object) null, a);
        }
    }
}
