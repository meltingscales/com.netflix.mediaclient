package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.JsonGenerator;
import java.io.Serializable;
import o.InterfaceC9326nV;

/* loaded from: classes5.dex */
public class MinimalPrettyPrinter implements InterfaceC9326nV, Serializable {
    private static final long serialVersionUID = 1;
    protected Separators a;
    protected String b;

    @Override // o.InterfaceC9326nV
    public void d(JsonGenerator jsonGenerator) {
    }

    @Override // o.InterfaceC9326nV
    public void e(JsonGenerator jsonGenerator) {
    }

    public MinimalPrettyPrinter() {
        this(InterfaceC9326nV.c.toString());
    }

    public MinimalPrettyPrinter(String str) {
        this.b = str;
        this.a = InterfaceC9326nV.d;
    }

    @Override // o.InterfaceC9326nV
    public void g(JsonGenerator jsonGenerator) {
        String str = this.b;
        if (str != null) {
            jsonGenerator.b(str);
        }
    }

    @Override // o.InterfaceC9326nV
    public void j(JsonGenerator jsonGenerator) {
        jsonGenerator.d('{');
    }

    @Override // o.InterfaceC9326nV
    public void c(JsonGenerator jsonGenerator) {
        jsonGenerator.d(this.a.b());
    }

    @Override // o.InterfaceC9326nV
    public void a(JsonGenerator jsonGenerator) {
        jsonGenerator.d(this.a.a());
    }

    @Override // o.InterfaceC9326nV
    public void a(JsonGenerator jsonGenerator, int i) {
        jsonGenerator.d('}');
    }

    @Override // o.InterfaceC9326nV
    public void h(JsonGenerator jsonGenerator) {
        jsonGenerator.d('[');
    }

    @Override // o.InterfaceC9326nV
    public void b(JsonGenerator jsonGenerator) {
        jsonGenerator.d(this.a.d());
    }

    @Override // o.InterfaceC9326nV
    public void b(JsonGenerator jsonGenerator, int i) {
        jsonGenerator.d(']');
    }
}
