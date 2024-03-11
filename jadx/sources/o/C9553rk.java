package o;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator;
import com.fasterxml.jackson.databind.type.TypeFactory;

/* renamed from: o.rk  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C9553rk extends C9554rl {
    protected final String a;
    protected final String e;

    protected C9553rk(JavaType javaType, TypeFactory typeFactory, PolymorphicTypeValidator polymorphicTypeValidator) {
        super(javaType, typeFactory, polymorphicTypeValidator);
        String name = javaType.h().getName();
        int lastIndexOf = name.lastIndexOf(46);
        if (lastIndexOf < 0) {
            this.a = "";
            this.e = ".";
            return;
        }
        this.e = name.substring(0, lastIndexOf + 1);
        this.a = name.substring(0, lastIndexOf);
    }

    public static C9553rk e(JavaType javaType, MapperConfig<?> mapperConfig, PolymorphicTypeValidator polymorphicTypeValidator) {
        return new C9553rk(javaType, mapperConfig.t(), polymorphicTypeValidator);
    }

    @Override // o.C9554rl, o.InterfaceC9545rc
    public String c(Object obj) {
        String name = obj.getClass().getName();
        return name.startsWith(this.e) ? name.substring(this.e.length() - 1) : name;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.C9554rl
    public JavaType b(String str, AbstractC9446pj abstractC9446pj) {
        if (str.startsWith(".")) {
            StringBuilder sb = new StringBuilder(str.length() + this.a.length());
            if (this.a.length() == 0) {
                sb.append(str.substring(1));
            } else {
                sb.append(this.a);
                sb.append(str);
            }
            str = sb.toString();
        }
        return super.b(str, abstractC9446pj);
    }
}
