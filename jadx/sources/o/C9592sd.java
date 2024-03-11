package o;

import com.fasterxml.jackson.dataformat.cbor.CBORFactory;
import com.fasterxml.jackson.dataformat.cbor.CBORGenerator;

/* renamed from: o.sd  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C9592sd extends AbstractC9329nY<CBORFactory, C9592sd> {
    protected int c;
    protected int e;

    public int b() {
        return this.c;
    }

    public int c() {
        return this.e;
    }

    public C9592sd() {
        this.e = CBORFactory.DEFAULT_CBOR_PARSER_FEATURE_FLAGS;
        this.c = CBORFactory.DEFAULT_CBOR_GENERATOR_FEATURE_FLAGS;
    }

    public C9592sd(CBORFactory cBORFactory) {
        super(cBORFactory);
        this.e = cBORFactory._formatParserFeatures;
        this.c = cBORFactory._formatGeneratorFeatures;
    }

    public C9592sd d(CBORGenerator.Feature feature) {
        this.c = feature.a() | this.c;
        return a();
    }

    @Override // o.AbstractC9329nY
    /* renamed from: d */
    public CBORFactory e() {
        return new CBORFactory(this);
    }
}
