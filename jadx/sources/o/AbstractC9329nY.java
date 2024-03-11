package o;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.StreamReadFeature;
import com.fasterxml.jackson.core.io.InputDecorator;
import com.fasterxml.jackson.core.io.OutputDecorator;
import o.AbstractC9329nY;

/* renamed from: o.nY  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC9329nY<F extends JsonFactory, B extends AbstractC9329nY<F, B>> {
    public int f;
    public OutputDecorator i;
    public InputDecorator j;
    public int k;

    /* renamed from: o  reason: collision with root package name */
    public int f13883o;
    protected static final int b = JsonFactory.Feature.c();
    protected static final int h = JsonParser.Feature.a();
    protected static final int g = JsonGenerator.Feature.e();

    public final B a() {
        return this;
    }

    public abstract F e();

    public AbstractC9329nY() {
        this.f = b;
        this.k = h;
        this.f13883o = g;
        this.j = null;
        this.i = null;
    }

    public AbstractC9329nY(JsonFactory jsonFactory) {
        this(jsonFactory._factoryFeatures, jsonFactory._parserFeatures, jsonFactory._generatorFeatures);
    }

    protected AbstractC9329nY(int i, int i2, int i3) {
        this.f = i;
        this.k = i2;
        this.f13883o = i3;
    }

    public B e(JsonFactory.Feature feature) {
        this.f = (~feature.a()) & this.f;
        return a();
    }

    public B c(StreamReadFeature streamReadFeature) {
        this.k = streamReadFeature.c().b() | this.k;
        return a();
    }
}
