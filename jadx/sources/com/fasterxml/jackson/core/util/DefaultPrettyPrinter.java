package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.io.SerializedString;
import java.io.Serializable;
import o.InterfaceC9326nV;
import o.InterfaceC9327nW;
import o.InterfaceC9437pa;

/* loaded from: classes2.dex */
public class DefaultPrettyPrinter implements InterfaceC9326nV, InterfaceC9437pa<DefaultPrettyPrinter>, Serializable {
    public static final SerializedString e = new SerializedString(" ");
    private static final long serialVersionUID = 1;
    protected d a;
    protected transient int b;
    protected String f;
    protected boolean g;
    protected final InterfaceC9327nW h;
    protected Separators i;
    protected d j;

    /* loaded from: classes5.dex */
    public static class NopIndenter implements d, Serializable {
        public static final NopIndenter b = new NopIndenter();

        @Override // com.fasterxml.jackson.core.util.DefaultPrettyPrinter.d
        public void a(JsonGenerator jsonGenerator, int i) {
        }

        @Override // com.fasterxml.jackson.core.util.DefaultPrettyPrinter.d
        public boolean d() {
            return true;
        }
    }

    /* loaded from: classes2.dex */
    public interface d {
        void a(JsonGenerator jsonGenerator, int i);

        boolean d();
    }

    public DefaultPrettyPrinter() {
        this(e);
    }

    public DefaultPrettyPrinter(InterfaceC9327nW interfaceC9327nW) {
        this.a = FixedSpaceIndenter.e;
        this.j = DefaultIndenter.d;
        this.g = true;
        this.h = interfaceC9327nW;
        c(InterfaceC9326nV.d);
    }

    public DefaultPrettyPrinter(DefaultPrettyPrinter defaultPrettyPrinter) {
        this(defaultPrettyPrinter, defaultPrettyPrinter.h);
    }

    public DefaultPrettyPrinter(DefaultPrettyPrinter defaultPrettyPrinter, InterfaceC9327nW interfaceC9327nW) {
        this.a = FixedSpaceIndenter.e;
        this.j = DefaultIndenter.d;
        this.g = true;
        this.a = defaultPrettyPrinter.a;
        this.j = defaultPrettyPrinter.j;
        this.g = defaultPrettyPrinter.g;
        this.b = defaultPrettyPrinter.b;
        this.i = defaultPrettyPrinter.i;
        this.f = defaultPrettyPrinter.f;
        this.h = interfaceC9327nW;
    }

    public DefaultPrettyPrinter c(Separators separators) {
        this.i = separators;
        this.f = " " + separators.b() + " ";
        return this;
    }

    @Override // o.InterfaceC9437pa
    /* renamed from: a */
    public DefaultPrettyPrinter e() {
        if (getClass() != DefaultPrettyPrinter.class) {
            throw new IllegalStateException("Failed `createInstance()`: " + getClass().getName() + " does not override method; it has to");
        }
        return new DefaultPrettyPrinter(this);
    }

    @Override // o.InterfaceC9326nV
    public void g(JsonGenerator jsonGenerator) {
        InterfaceC9327nW interfaceC9327nW = this.h;
        if (interfaceC9327nW != null) {
            jsonGenerator.b(interfaceC9327nW);
        }
    }

    @Override // o.InterfaceC9326nV
    public void j(JsonGenerator jsonGenerator) {
        jsonGenerator.d('{');
        if (this.j.d()) {
            return;
        }
        this.b++;
    }

    @Override // o.InterfaceC9326nV
    public void e(JsonGenerator jsonGenerator) {
        this.j.a(jsonGenerator, this.b);
    }

    @Override // o.InterfaceC9326nV
    public void c(JsonGenerator jsonGenerator) {
        if (this.g) {
            jsonGenerator.b(this.f);
        } else {
            jsonGenerator.d(this.i.b());
        }
    }

    @Override // o.InterfaceC9326nV
    public void a(JsonGenerator jsonGenerator) {
        jsonGenerator.d(this.i.a());
        this.j.a(jsonGenerator, this.b);
    }

    @Override // o.InterfaceC9326nV
    public void a(JsonGenerator jsonGenerator, int i) {
        if (!this.j.d()) {
            this.b--;
        }
        if (i > 0) {
            this.j.a(jsonGenerator, this.b);
        } else {
            jsonGenerator.d(' ');
        }
        jsonGenerator.d('}');
    }

    @Override // o.InterfaceC9326nV
    public void h(JsonGenerator jsonGenerator) {
        if (!this.a.d()) {
            this.b++;
        }
        jsonGenerator.d('[');
    }

    @Override // o.InterfaceC9326nV
    public void d(JsonGenerator jsonGenerator) {
        this.a.a(jsonGenerator, this.b);
    }

    @Override // o.InterfaceC9326nV
    public void b(JsonGenerator jsonGenerator) {
        jsonGenerator.d(this.i.d());
        this.a.a(jsonGenerator, this.b);
    }

    @Override // o.InterfaceC9326nV
    public void b(JsonGenerator jsonGenerator, int i) {
        if (!this.a.d()) {
            this.b--;
        }
        if (i > 0) {
            this.a.a(jsonGenerator, this.b);
        } else {
            jsonGenerator.d(' ');
        }
        jsonGenerator.d(']');
    }

    /* loaded from: classes5.dex */
    public static class FixedSpaceIndenter extends NopIndenter {
        public static final FixedSpaceIndenter e = new FixedSpaceIndenter();

        @Override // com.fasterxml.jackson.core.util.DefaultPrettyPrinter.NopIndenter, com.fasterxml.jackson.core.util.DefaultPrettyPrinter.d
        public boolean d() {
            return true;
        }

        @Override // com.fasterxml.jackson.core.util.DefaultPrettyPrinter.NopIndenter, com.fasterxml.jackson.core.util.DefaultPrettyPrinter.d
        public void a(JsonGenerator jsonGenerator, int i) {
            jsonGenerator.d(' ');
        }
    }
}
