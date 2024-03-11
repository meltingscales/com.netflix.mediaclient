package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import o.C9526rJ;
import o.C9537rU;

/* loaded from: classes5.dex */
public class TypeParser implements Serializable {
    private static final long serialVersionUID = 1;
    protected final TypeFactory b;

    public TypeParser(TypeFactory typeFactory) {
        this.b = typeFactory;
    }

    public JavaType b(String str) {
        c cVar = new c(str.trim());
        JavaType a = a(cVar);
        if (cVar.hasMoreTokens()) {
            throw e(cVar, "Unexpected tokens after complete type");
        }
        return a;
    }

    protected JavaType a(c cVar) {
        if (!cVar.hasMoreTokens()) {
            throw e(cVar, "Unexpected end-of-string");
        }
        Class<?> c2 = c(cVar.nextToken(), cVar);
        if (cVar.hasMoreTokens()) {
            String nextToken = cVar.nextToken();
            if ("<".equals(nextToken)) {
                return this.b.a((C9526rJ) null, c2, TypeBindings.b(c2, c(cVar)));
            }
            cVar.b(nextToken);
        }
        return this.b.a((C9526rJ) null, c2, TypeBindings.a());
    }

    protected List<JavaType> c(c cVar) {
        ArrayList arrayList = new ArrayList();
        while (cVar.hasMoreTokens()) {
            arrayList.add(a(cVar));
            if (!cVar.hasMoreTokens()) {
                break;
            }
            String nextToken = cVar.nextToken();
            if (">".equals(nextToken)) {
                return arrayList;
            }
            if (!",".equals(nextToken)) {
                throw e(cVar, "Unexpected token '" + nextToken + "', expected ',' or '>')");
            }
        }
        throw e(cVar, "Unexpected end-of-string");
    }

    protected Class<?> c(String str, c cVar) {
        try {
            return this.b.d(str);
        } catch (Exception e) {
            C9537rU.h(e);
            throw e(cVar, "Cannot locate class '" + str + "', problem: " + e.getMessage());
        }
    }

    protected IllegalArgumentException e(c cVar, String str) {
        return new IllegalArgumentException(String.format("Failed to parse type '%s' (remaining: '%s'): %s", cVar.c(), cVar.b(), str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class c extends StringTokenizer {
        protected final String b;
        protected int d;
        protected String e;

        public void b(String str) {
            this.e = str;
        }

        public String c() {
            return this.b;
        }

        public c(String str) {
            super(str, "<,>", true);
            this.b = str;
        }

        @Override // java.util.StringTokenizer
        public boolean hasMoreTokens() {
            return this.e != null || super.hasMoreTokens();
        }

        @Override // java.util.StringTokenizer
        public String nextToken() {
            String str = this.e;
            if (str != null) {
                this.e = null;
                return str;
            }
            String nextToken = super.nextToken();
            this.d += nextToken.length();
            return nextToken.trim();
        }

        public String b() {
            return this.b.substring(this.d);
        }
    }
}
