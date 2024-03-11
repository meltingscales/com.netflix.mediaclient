package o;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.StreamWriteCapability;
import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;

/* renamed from: o.oE  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC9362oE extends AbstractC9387od {
    protected CharacterEscapes k;
    protected boolean m;

    /* renamed from: o  reason: collision with root package name */
    protected boolean f13887o;
    protected int[] p;
    protected int q;
    protected final C9389of r;
    protected InterfaceC9327nW s;
    protected static final int[] n = C9391oh.e();
    protected static final C9441pe<StreamWriteCapability> l = JsonGenerator.d;

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public JsonGenerator a(InterfaceC9327nW interfaceC9327nW) {
        this.s = interfaceC9327nW;
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public JsonGenerator b(int i) {
        if (i < 0) {
            i = 0;
        }
        this.q = i;
        return this;
    }

    public AbstractC9362oE(C9389of c9389of, int i, ObjectCodec objectCodec) {
        super(i, objectCodec);
        this.p = n;
        this.s = DefaultPrettyPrinter.e;
        this.r = c9389of;
        if (JsonGenerator.Feature.ESCAPE_NON_ASCII.b(i)) {
            this.q = 127;
        }
        this.m = JsonGenerator.Feature.WRITE_HEX_UPPER_CASE.b(i);
        this.f13887o = !JsonGenerator.Feature.QUOTE_FIELD_NAMES.b(i);
    }

    @Override // o.AbstractC9387od, com.fasterxml.jackson.core.JsonGenerator
    public JsonGenerator a(JsonGenerator.Feature feature) {
        super.a(feature);
        if (feature == JsonGenerator.Feature.QUOTE_FIELD_NAMES) {
            this.f13887o = true;
        } else if (feature == JsonGenerator.Feature.WRITE_HEX_UPPER_CASE) {
            this.m = false;
        }
        return this;
    }

    @Override // o.AbstractC9387od
    public void c(int i, int i2) {
        super.c(i, i2);
        this.f13887o = !JsonGenerator.Feature.QUOTE_FIELD_NAMES.b(i);
        this.m = JsonGenerator.Feature.WRITE_HEX_UPPER_CASE.b(i);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public JsonGenerator e(CharacterEscapes characterEscapes) {
        this.k = characterEscapes;
        if (characterEscapes == null) {
            this.p = n;
        } else {
            this.p = characterEscapes.c();
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void e(String str, int i) {
        if (i == 0) {
            if (this.j.h()) {
                this.b.d(this);
            } else if (this.j.g()) {
                this.b.e(this);
            }
        } else if (i == 1) {
            this.b.b(this);
        } else if (i == 2) {
            this.b.c(this);
        } else if (i == 3) {
            this.b.g(this);
        } else if (i == 5) {
            f(str);
        } else {
            e();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void f(String str) {
        c(String.format("Can not %s, expecting field name (context: %s)", str, this.j.k()));
    }
}
