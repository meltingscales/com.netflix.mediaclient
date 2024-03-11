package o;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotationCollector;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o.AbstractC9464qA;
import o.InterfaceC9470qG;

/* renamed from: o.qy  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C9514qy extends C9466qC {
    private final TypeFactory b;
    private final AbstractC9464qA.c d;

    C9514qy(AnnotationIntrospector annotationIntrospector, TypeFactory typeFactory, AbstractC9464qA.c cVar) {
        super(annotationIntrospector);
        this.b = typeFactory;
        this.d = annotationIntrospector == null ? null : cVar;
    }

    public static List<AnnotatedField> b(AnnotationIntrospector annotationIntrospector, InterfaceC9470qG interfaceC9470qG, AbstractC9464qA.c cVar, TypeFactory typeFactory, JavaType javaType) {
        return new C9514qy(annotationIntrospector, typeFactory, cVar).a(interfaceC9470qG, javaType);
    }

    List<AnnotatedField> a(InterfaceC9470qG interfaceC9470qG, JavaType javaType) {
        Map<String, b> a = a(interfaceC9470qG, javaType, null);
        if (a == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(a.size());
        for (b bVar : a.values()) {
            arrayList.add(bVar.e());
        }
        return arrayList;
    }

    private Map<String, b> a(InterfaceC9470qG interfaceC9470qG, JavaType javaType, Map<String, b> map) {
        Field[] h;
        Class<?> i;
        JavaType n = javaType.n();
        if (n == null) {
            return map;
        }
        Class<?> h2 = javaType.h();
        Map<String, b> a = a(new InterfaceC9470qG.e(this.b, n.a()), n, map);
        for (Field field : C9537rU.h(h2)) {
            if (e(field)) {
                if (a == null) {
                    a = new LinkedHashMap<>();
                }
                b bVar = new b(interfaceC9470qG, field);
                if (this.c != null) {
                    bVar.d = c(bVar.d, field.getDeclaredAnnotations());
                }
                a.put(field.getName(), bVar);
            }
        }
        AbstractC9464qA.c cVar = this.d;
        if (cVar != null && (i = cVar.i(h2)) != null) {
            e(i, h2, a);
        }
        return a;
    }

    private void e(Class<?> cls, Class<?> cls2, Map<String, b> map) {
        Field[] h;
        b bVar;
        for (Class<?> cls3 : C9537rU.e(cls, cls2, true)) {
            for (Field field : C9537rU.h(cls3)) {
                if (e(field) && (bVar = map.get(field.getName())) != null) {
                    bVar.d = c(bVar.d, field.getDeclaredAnnotations());
                }
            }
        }
    }

    private boolean e(Field field) {
        return (field.isSynthetic() || Modifier.isStatic(field.getModifiers())) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.qy$b */
    /* loaded from: classes5.dex */
    public static final class b {
        public final InterfaceC9470qG a;
        public AnnotationCollector d = AnnotationCollector.d();
        public final Field e;

        public b(InterfaceC9470qG interfaceC9470qG, Field field) {
            this.a = interfaceC9470qG;
            this.e = field;
        }

        public AnnotatedField e() {
            return new AnnotatedField(this.a, this.e, this.d.a());
        }
    }
}
