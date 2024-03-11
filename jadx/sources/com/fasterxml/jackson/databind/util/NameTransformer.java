package com.fasterxml.jackson.databind.util;

import java.io.Serializable;

/* loaded from: classes5.dex */
public abstract class NameTransformer {
    public static final NameTransformer e = new NopTransformer();

    public abstract String c(String str);

    /* loaded from: classes5.dex */
    protected static final class NopTransformer extends NameTransformer implements Serializable {
        private static final long serialVersionUID = 1;

        @Override // com.fasterxml.jackson.databind.util.NameTransformer
        public String c(String str) {
            return str;
        }

        protected NopTransformer() {
        }
    }

    protected NameTransformer() {
    }

    public static NameTransformer e(final String str, final String str2) {
        boolean z = true;
        boolean z2 = str != null && str.length() > 0;
        if (str2 == null || str2.length() <= 0) {
            z = false;
        }
        if (!z2) {
            return z ? new NameTransformer() { // from class: com.fasterxml.jackson.databind.util.NameTransformer.4
                @Override // com.fasterxml.jackson.databind.util.NameTransformer
                public String c(String str3) {
                    return str3 + str2;
                }

                public String toString() {
                    return "[SuffixTransformer('" + str2 + "')]";
                }
            } : e;
        } else if (z) {
            return new NameTransformer() { // from class: com.fasterxml.jackson.databind.util.NameTransformer.5
                @Override // com.fasterxml.jackson.databind.util.NameTransformer
                public String c(String str3) {
                    return str + str3 + str2;
                }

                public String toString() {
                    return "[PreAndSuffixTransformer('" + str + "','" + str2 + "')]";
                }
            };
        } else {
            return new NameTransformer() { // from class: com.fasterxml.jackson.databind.util.NameTransformer.2
                @Override // com.fasterxml.jackson.databind.util.NameTransformer
                public String c(String str3) {
                    return str + str3;
                }

                public String toString() {
                    return "[PrefixTransformer('" + str + "')]";
                }
            };
        }
    }

    public static NameTransformer b(NameTransformer nameTransformer, NameTransformer nameTransformer2) {
        return new Chained(nameTransformer, nameTransformer2);
    }

    /* loaded from: classes5.dex */
    public static class Chained extends NameTransformer implements Serializable {
        private static final long serialVersionUID = 1;
        protected final NameTransformer b;
        protected final NameTransformer d;

        public Chained(NameTransformer nameTransformer, NameTransformer nameTransformer2) {
            this.b = nameTransformer;
            this.d = nameTransformer2;
        }

        @Override // com.fasterxml.jackson.databind.util.NameTransformer
        public String c(String str) {
            return this.b.c(this.d.c(str));
        }

        public String toString() {
            return "[ChainedTransformer(" + this.b + ", " + this.d + ")]";
        }
    }
}
