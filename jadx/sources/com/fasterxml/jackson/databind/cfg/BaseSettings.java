package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import java.io.Serializable;
import java.text.DateFormat;
import java.util.Locale;
import java.util.TimeZone;
import o.AbstractC9415pE;
import o.AbstractC9464qA;
import o.C8543dpm;
import o.InterfaceC9489qZ;

/* loaded from: classes5.dex */
public final class BaseSettings implements Serializable {
    private static final TimeZone l = C8543dpm.c("UTC");
    private static final long serialVersionUID = 1;
    protected final Base64Variant a;
    protected final AbstractC9464qA b;
    protected final AbstractC9415pE c;
    protected final AnnotationIntrospector d;
    protected final DateFormat e;
    protected final PropertyNamingStrategy f;
    protected final Locale g;
    protected final TimeZone h;
    protected final TypeFactory i;
    protected final InterfaceC9489qZ<?> j;
    protected final PolymorphicTypeValidator n;

    public DateFormat a() {
        return this.e;
    }

    public AnnotationIntrospector b() {
        return this.d;
    }

    public AbstractC9464qA c() {
        return this.b;
    }

    public Base64Variant e() {
        return this.a;
    }

    public PropertyNamingStrategy f() {
        return this.f;
    }

    public PolymorphicTypeValidator g() {
        return this.n;
    }

    public Locale h() {
        return this.g;
    }

    public TimeZone i() {
        TimeZone timeZone = this.h;
        return timeZone == null ? l : timeZone;
    }

    public AbstractC9415pE j() {
        return this.c;
    }

    public TypeFactory m() {
        return this.i;
    }

    public boolean n() {
        return this.h != null;
    }

    public InterfaceC9489qZ<?> o() {
        return this.j;
    }

    public BaseSettings(AbstractC9464qA abstractC9464qA, AnnotationIntrospector annotationIntrospector, PropertyNamingStrategy propertyNamingStrategy, TypeFactory typeFactory, InterfaceC9489qZ<?> interfaceC9489qZ, DateFormat dateFormat, AbstractC9415pE abstractC9415pE, Locale locale, TimeZone timeZone, Base64Variant base64Variant, PolymorphicTypeValidator polymorphicTypeValidator) {
        this.b = abstractC9464qA;
        this.d = annotationIntrospector;
        this.f = propertyNamingStrategy;
        this.i = typeFactory;
        this.j = interfaceC9489qZ;
        this.e = dateFormat;
        this.c = abstractC9415pE;
        this.g = locale;
        this.h = timeZone;
        this.a = base64Variant;
        this.n = polymorphicTypeValidator;
    }

    public BaseSettings d() {
        return new BaseSettings(this.b.e(), this.d, this.f, this.i, this.j, this.e, this.c, this.g, this.h, this.a, this.n);
    }

    public BaseSettings d(AbstractC9464qA abstractC9464qA) {
        return this.b == abstractC9464qA ? this : new BaseSettings(abstractC9464qA, this.d, this.f, this.i, this.j, this.e, this.c, this.g, this.h, this.a, this.n);
    }

    public BaseSettings c(AnnotationIntrospector annotationIntrospector) {
        return this.d == annotationIntrospector ? this : new BaseSettings(this.b, annotationIntrospector, this.f, this.i, this.j, this.e, this.c, this.g, this.h, this.a, this.n);
    }

    public BaseSettings e(PropertyNamingStrategy propertyNamingStrategy) {
        return this.f == propertyNamingStrategy ? this : new BaseSettings(this.b, this.d, propertyNamingStrategy, this.i, this.j, this.e, this.c, this.g, this.h, this.a, this.n);
    }

    public BaseSettings c(TypeFactory typeFactory) {
        return this.i == typeFactory ? this : new BaseSettings(this.b, this.d, this.f, typeFactory, this.j, this.e, this.c, this.g, this.h, this.a, this.n);
    }

    public BaseSettings a(InterfaceC9489qZ<?> interfaceC9489qZ) {
        return this.j == interfaceC9489qZ ? this : new BaseSettings(this.b, this.d, this.f, this.i, interfaceC9489qZ, this.e, this.c, this.g, this.h, this.a, this.n);
    }

    public BaseSettings c(DateFormat dateFormat) {
        if (this.e == dateFormat) {
            return this;
        }
        if (dateFormat != null && n()) {
            dateFormat = d(dateFormat, this.h);
        }
        return new BaseSettings(this.b, this.d, this.f, this.i, this.j, dateFormat, this.c, this.g, this.h, this.a, this.n);
    }

    public BaseSettings d(AbstractC9415pE abstractC9415pE) {
        return this.c == abstractC9415pE ? this : new BaseSettings(this.b, this.d, this.f, this.i, this.j, this.e, abstractC9415pE, this.g, this.h, this.a, this.n);
    }

    public BaseSettings d(Locale locale) {
        return this.g == locale ? this : new BaseSettings(this.b, this.d, this.f, this.i, this.j, this.e, this.c, locale, this.h, this.a, this.n);
    }

    public BaseSettings b(TimeZone timeZone) {
        if (timeZone != null) {
            if (timeZone == this.h) {
                return this;
            }
            return new BaseSettings(this.b, this.d, this.f, this.i, this.j, d(this.e, timeZone), this.c, this.g, timeZone, this.a, this.n);
        }
        throw new IllegalArgumentException();
    }

    public BaseSettings d(Base64Variant base64Variant) {
        return base64Variant == this.a ? this : new BaseSettings(this.b, this.d, this.f, this.i, this.j, this.e, this.c, this.g, this.h, base64Variant, this.n);
    }

    public BaseSettings e(PolymorphicTypeValidator polymorphicTypeValidator) {
        return polymorphicTypeValidator == this.n ? this : new BaseSettings(this.b, this.d, this.f, this.i, this.j, this.e, this.c, this.g, this.h, this.a, polymorphicTypeValidator);
    }

    private DateFormat d(DateFormat dateFormat, TimeZone timeZone) {
        if (dateFormat instanceof StdDateFormat) {
            return ((StdDateFormat) dateFormat).a(timeZone);
        }
        DateFormat dateFormat2 = (DateFormat) dateFormat.clone();
        dateFormat2.setTimeZone(timeZone);
        return dateFormat2;
    }
}
