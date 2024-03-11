package o;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: o.rY  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C9541rY extends AbstractC9465qB {
    protected final PropertyName b;
    protected final AnnotatedMember c;
    protected final JsonInclude.Value d;
    protected final AnnotationIntrospector e;
    protected final PropertyMetadata h;

    @Override // o.AbstractC9465qB
    public boolean C() {
        return false;
    }

    @Override // o.AbstractC9465qB
    public boolean D() {
        return false;
    }

    @Override // o.AbstractC9465qB
    public JsonInclude.Value d() {
        return this.d;
    }

    @Override // o.AbstractC9465qB
    public PropertyMetadata n() {
        return this.h;
    }

    @Override // o.AbstractC9465qB
    public PropertyName o() {
        return this.b;
    }

    @Override // o.AbstractC9465qB
    public AnnotatedMember s() {
        return this.c;
    }

    protected C9541rY(AnnotationIntrospector annotationIntrospector, AnnotatedMember annotatedMember, PropertyName propertyName, PropertyMetadata propertyMetadata, JsonInclude.Value value) {
        this.e = annotationIntrospector;
        this.c = annotatedMember;
        this.b = propertyName;
        this.h = propertyMetadata == null ? PropertyMetadata.b : propertyMetadata;
        this.d = value;
    }

    public static C9541rY d(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, PropertyName propertyName) {
        return a(mapperConfig, annotatedMember, propertyName, null, AbstractC9465qB.a);
    }

    public static C9541rY d(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, PropertyName propertyName, PropertyMetadata propertyMetadata, JsonInclude.Include include) {
        return new C9541rY(mapperConfig.h(), annotatedMember, propertyName, propertyMetadata, (include == null || include == JsonInclude.Include.USE_DEFAULTS) ? AbstractC9465qB.a : JsonInclude.Value.d(include, (JsonInclude.Include) null));
    }

    public static C9541rY a(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, PropertyName propertyName, PropertyMetadata propertyMetadata, JsonInclude.Value value) {
        return new C9541rY(mapperConfig.h(), annotatedMember, propertyName, propertyMetadata, value);
    }

    @Override // o.AbstractC9465qB, o.InterfaceC9539rW
    public String a() {
        return this.b.c();
    }

    @Override // o.AbstractC9465qB
    public boolean e(PropertyName propertyName) {
        return this.b.equals(propertyName);
    }

    @Override // o.AbstractC9465qB
    public PropertyName w() {
        AnnotatedMember annotatedMember;
        AnnotationIntrospector annotationIntrospector = this.e;
        if (annotationIntrospector == null || (annotatedMember = this.c) == null) {
            return null;
        }
        return annotationIntrospector.D(annotatedMember);
    }

    @Override // o.AbstractC9465qB
    public JavaType q() {
        AnnotatedMember annotatedMember = this.c;
        if (annotatedMember == null) {
            return TypeFactory.b();
        }
        return annotatedMember.a();
    }

    @Override // o.AbstractC9465qB
    public Class<?> p() {
        AnnotatedMember annotatedMember = this.c;
        return annotatedMember == null ? Object.class : annotatedMember.e();
    }

    @Override // o.AbstractC9465qB
    public boolean v() {
        return u() != null;
    }

    @Override // o.AbstractC9465qB
    public boolean x() {
        return this.c instanceof AnnotatedField;
    }

    @Override // o.AbstractC9465qB
    public boolean y() {
        return this.c instanceof AnnotatedParameter;
    }

    @Override // o.AbstractC9465qB
    public AnnotatedMethod m() {
        AnnotatedMember annotatedMember = this.c;
        if ((annotatedMember instanceof AnnotatedMethod) && ((AnnotatedMethod) annotatedMember).f() == 0) {
            return (AnnotatedMethod) this.c;
        }
        return null;
    }

    @Override // o.AbstractC9465qB
    public AnnotatedMethod u() {
        AnnotatedMember annotatedMember = this.c;
        if ((annotatedMember instanceof AnnotatedMethod) && ((AnnotatedMethod) annotatedMember).f() == 1) {
            return (AnnotatedMethod) this.c;
        }
        return null;
    }

    @Override // o.AbstractC9465qB
    public AnnotatedField l() {
        AnnotatedMember annotatedMember = this.c;
        if (annotatedMember instanceof AnnotatedField) {
            return (AnnotatedField) annotatedMember;
        }
        return null;
    }

    @Override // o.AbstractC9465qB
    public AnnotatedParameter j() {
        AnnotatedMember annotatedMember = this.c;
        if (annotatedMember instanceof AnnotatedParameter) {
            return (AnnotatedParameter) annotatedMember;
        }
        return null;
    }

    @Override // o.AbstractC9465qB
    public Iterator<AnnotatedParameter> k() {
        AnnotatedParameter j = j();
        if (j == null) {
            return C9537rU.c();
        }
        return Collections.singleton(j).iterator();
    }
}
