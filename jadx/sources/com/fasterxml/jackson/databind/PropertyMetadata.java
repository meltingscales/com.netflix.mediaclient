package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import java.io.Serializable;

/* loaded from: classes5.dex */
public class PropertyMetadata implements Serializable {
    public static final PropertyMetadata a = new PropertyMetadata(Boolean.TRUE, null, null, null, null, null, null);
    public static final PropertyMetadata b = new PropertyMetadata(Boolean.FALSE, null, null, null, null, null, null);
    public static final PropertyMetadata c = new PropertyMetadata(null, null, null, null, null, null, null);
    private static final long serialVersionUID = -1;
    protected final String d;
    protected Nulls e;
    protected final String f;
    protected final transient b g;
    protected Nulls h;
    protected final Boolean i;
    protected final Integer j;

    public Nulls a() {
        return this.h;
    }

    public Nulls c() {
        return this.e;
    }

    public b e() {
        return this.g;
    }

    /* loaded from: classes5.dex */
    public static final class b {
        public final AnnotatedMember a;
        public final boolean b;

        protected b(AnnotatedMember annotatedMember, boolean z) {
            this.a = annotatedMember;
            this.b = z;
        }

        public static b d(AnnotatedMember annotatedMember) {
            return new b(annotatedMember, true);
        }

        public static b e(AnnotatedMember annotatedMember) {
            return new b(annotatedMember, false);
        }

        public static b a(AnnotatedMember annotatedMember) {
            return new b(annotatedMember, false);
        }
    }

    protected PropertyMetadata(Boolean bool, String str, Integer num, String str2, b bVar, Nulls nulls, Nulls nulls2) {
        this.i = bool;
        this.f = str;
        this.j = num;
        this.d = (str2 == null || str2.isEmpty()) ? null : null;
        this.g = bVar;
        this.h = nulls;
        this.e = nulls2;
    }

    public static PropertyMetadata b(Boolean bool, String str, Integer num, String str2) {
        if (str == null && num == null && str2 == null) {
            return bool == null ? c : bool.booleanValue() ? a : b;
        }
        return new PropertyMetadata(bool, str, num, str2, null, null, null);
    }

    protected Object readResolve() {
        if (this.f == null && this.j == null && this.d == null && this.g == null && this.h == null && this.e == null) {
            Boolean bool = this.i;
            return bool == null ? c : bool.booleanValue() ? a : b;
        }
        return this;
    }

    public PropertyMetadata c(String str) {
        return new PropertyMetadata(this.i, str, this.j, this.d, this.g, this.h, this.e);
    }

    public PropertyMetadata b(b bVar) {
        return new PropertyMetadata(this.i, this.f, this.j, this.d, bVar, this.h, this.e);
    }

    public PropertyMetadata a(Nulls nulls, Nulls nulls2) {
        return new PropertyMetadata(this.i, this.f, this.j, this.d, this.g, nulls, nulls2);
    }

    public boolean d() {
        Boolean bool = this.i;
        return bool != null && bool.booleanValue();
    }
}
