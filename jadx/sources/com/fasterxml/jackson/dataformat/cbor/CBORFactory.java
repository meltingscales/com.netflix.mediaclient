package com.fasterxml.jackson.dataformat.cbor;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.format.MatchStrength;
import com.fasterxml.jackson.core.io.InputDecorator;
import com.fasterxml.jackson.dataformat.cbor.CBORGenerator;
import com.fasterxml.jackson.dataformat.cbor.CBORParser;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.net.URL;
import o.AbstractC9329nY;
import o.C9389of;
import o.C9592sd;
import o.C9595sg;
import o.C9597si;
import o.InterfaceC9390og;

/* loaded from: classes2.dex */
public class CBORFactory extends JsonFactory {
    public static final String FORMAT_NAME = "CBOR";
    private static final long serialVersionUID = 1;
    public int _formatGeneratorFeatures;
    public int _formatParserFeatures;
    public static final int DEFAULT_CBOR_PARSER_FEATURE_FLAGS = CBORParser.Feature.d();
    public static final int DEFAULT_CBOR_GENERATOR_FEATURE_FLAGS = CBORGenerator.Feature.d();

    @Override // com.fasterxml.jackson.core.JsonFactory
    public boolean canHandleBinaryNatively() {
        return true;
    }

    @Override // com.fasterxml.jackson.core.JsonFactory
    public boolean canUseCharArrays() {
        return false;
    }

    @Override // com.fasterxml.jackson.core.JsonFactory
    public int getFormatGeneratorFeatures() {
        return this._formatGeneratorFeatures;
    }

    @Override // com.fasterxml.jackson.core.JsonFactory
    public String getFormatName() {
        return FORMAT_NAME;
    }

    @Override // com.fasterxml.jackson.core.JsonFactory
    public int getFormatParserFeatures() {
        return this._formatParserFeatures;
    }

    @Override // com.fasterxml.jackson.core.JsonFactory
    public Class<CBORParser.Feature> getFormatReadFeatureType() {
        return CBORParser.Feature.class;
    }

    @Override // com.fasterxml.jackson.core.JsonFactory
    public Class<CBORGenerator.Feature> getFormatWriteFeatureType() {
        return CBORGenerator.Feature.class;
    }

    public CBORFactory() {
        this((ObjectCodec) null);
    }

    public CBORFactory(ObjectCodec objectCodec) {
        super(objectCodec);
        this._formatParserFeatures = DEFAULT_CBOR_PARSER_FEATURE_FLAGS;
        this._formatGeneratorFeatures = DEFAULT_CBOR_GENERATOR_FEATURE_FLAGS;
    }

    public CBORFactory(CBORFactory cBORFactory, ObjectCodec objectCodec) {
        super(cBORFactory, objectCodec);
        this._formatParserFeatures = cBORFactory._formatParserFeatures;
        this._formatGeneratorFeatures = cBORFactory._formatGeneratorFeatures;
    }

    public CBORFactory(C9592sd c9592sd) {
        super((AbstractC9329nY<?, ?>) c9592sd, false);
        this._formatParserFeatures = c9592sd.c();
        this._formatGeneratorFeatures = c9592sd.b();
    }

    @Override // com.fasterxml.jackson.core.JsonFactory
    public C9592sd rebuild() {
        return new C9592sd(this);
    }

    public static C9592sd builder() {
        return new C9592sd();
    }

    @Override // com.fasterxml.jackson.core.JsonFactory
    public CBORFactory copy() {
        _checkInvalidCopy(CBORFactory.class);
        return new CBORFactory(this, null);
    }

    @Override // com.fasterxml.jackson.core.JsonFactory
    public Object readResolve() {
        return new CBORFactory(this, this._objectCodec);
    }

    @Override // com.fasterxml.jackson.core.JsonFactory
    public Version version() {
        return C9597si.d;
    }

    @Override // com.fasterxml.jackson.core.JsonFactory
    public MatchStrength hasFormat(InterfaceC9390og interfaceC9390og) {
        return C9595sg.b(interfaceC9390og);
    }

    public final CBORFactory configure(CBORParser.Feature feature, boolean z) {
        if (z) {
            enable(feature);
        } else {
            disable(feature);
        }
        return this;
    }

    public CBORFactory enable(CBORParser.Feature feature) {
        this._formatParserFeatures = feature.a() | this._formatParserFeatures;
        return this;
    }

    public CBORFactory disable(CBORParser.Feature feature) {
        this._formatParserFeatures = (~feature.a()) & this._formatParserFeatures;
        return this;
    }

    public final boolean isEnabled(CBORParser.Feature feature) {
        return (feature.a() & this._formatParserFeatures) != 0;
    }

    public final CBORFactory configure(CBORGenerator.Feature feature, boolean z) {
        if (z) {
            enable(feature);
        } else {
            disable(feature);
        }
        return this;
    }

    public CBORFactory enable(CBORGenerator.Feature feature) {
        this._formatGeneratorFeatures = feature.a() | this._formatGeneratorFeatures;
        return this;
    }

    public CBORFactory disable(CBORGenerator.Feature feature) {
        this._formatGeneratorFeatures = (~feature.a()) & this._formatGeneratorFeatures;
        return this;
    }

    public final boolean isEnabled(CBORGenerator.Feature feature) {
        return (feature.a() & this._formatGeneratorFeatures) != 0;
    }

    @Override // com.fasterxml.jackson.core.JsonFactory
    public CBORParser createParser(File file) {
        C9389of _createContext = _createContext((Object) file, true);
        return _createParser(_decorate(new FileInputStream(file), _createContext), _createContext);
    }

    @Override // com.fasterxml.jackson.core.JsonFactory
    public CBORParser createParser(URL url) {
        C9389of _createContext = _createContext((Object) url, true);
        return _createParser(_decorate(a(url), _createContext), _createContext);
    }

    @Override // com.fasterxml.jackson.core.JsonFactory
    public CBORParser createParser(InputStream inputStream) {
        C9389of _createContext = _createContext((Object) inputStream, false);
        return _createParser(_decorate(inputStream, _createContext), _createContext);
    }

    @Override // com.fasterxml.jackson.core.JsonFactory
    public CBORParser createParser(byte[] bArr) {
        return createParser(bArr, 0, bArr.length);
    }

    @Override // com.fasterxml.jackson.core.JsonFactory
    public CBORParser createParser(byte[] bArr, int i, int i2) {
        InputStream a;
        C9389of _createContext = _createContext((Object) bArr, true);
        InputDecorator inputDecorator = this._inputDecorator;
        if (inputDecorator != null && (a = inputDecorator.a(_createContext, bArr, 0, bArr.length)) != null) {
            return _createParser(a, _createContext);
        }
        return _createParser(bArr, i, i2, _createContext);
    }

    @Override // com.fasterxml.jackson.core.JsonFactory
    public CBORGenerator createGenerator(OutputStream outputStream, JsonEncoding jsonEncoding) {
        C9389of _createContext = _createContext((Object) outputStream, false);
        return _createCBORGenerator(_createContext, this._generatorFeatures, this._formatGeneratorFeatures, this._objectCodec, _decorate(outputStream, _createContext));
    }

    @Override // com.fasterxml.jackson.core.JsonFactory
    public CBORGenerator createGenerator(OutputStream outputStream) {
        C9389of _createContext = _createContext((Object) outputStream, false);
        return _createCBORGenerator(_createContext, this._generatorFeatures, this._formatGeneratorFeatures, this._objectCodec, _decorate(outputStream, _createContext));
    }

    @Override // com.fasterxml.jackson.core.JsonFactory
    public C9389of _createContext(Object obj, boolean z) {
        return super._createContext(obj, z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fasterxml.jackson.core.JsonFactory
    public CBORParser _createParser(InputStream inputStream, C9389of c9389of) {
        return new C9595sg(c9389of, inputStream).a(this._factoryFeatures, this._parserFeatures, this._formatParserFeatures, this._objectCodec, this._byteSymbolCanonicalizer);
    }

    @Override // com.fasterxml.jackson.core.JsonFactory
    public JsonParser _createParser(Reader reader, C9389of c9389of) {
        return (JsonParser) _nonByteSource();
    }

    @Override // com.fasterxml.jackson.core.JsonFactory
    public JsonParser _createParser(char[] cArr, int i, int i2, C9389of c9389of, boolean z) {
        return (JsonParser) _nonByteSource();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fasterxml.jackson.core.JsonFactory
    public CBORParser _createParser(byte[] bArr, int i, int i2, C9389of c9389of) {
        return new C9595sg(c9389of, bArr, i, i2).a(this._factoryFeatures, this._parserFeatures, this._formatParserFeatures, this._objectCodec, this._byteSymbolCanonicalizer);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fasterxml.jackson.core.JsonFactory
    public CBORGenerator _createGenerator(Writer writer, C9389of c9389of) {
        return (CBORGenerator) _nonByteTarget();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fasterxml.jackson.core.JsonFactory
    public CBORGenerator _createUTF8Generator(OutputStream outputStream, C9389of c9389of) {
        return _createCBORGenerator(c9389of, this._generatorFeatures, this._formatGeneratorFeatures, this._objectCodec, outputStream);
    }

    @Override // com.fasterxml.jackson.core.JsonFactory
    public Writer _createWriter(OutputStream outputStream, JsonEncoding jsonEncoding, C9389of c9389of) {
        return (Writer) _nonByteTarget();
    }

    private final CBORGenerator _createCBORGenerator(C9389of c9389of, int i, int i2, ObjectCodec objectCodec, OutputStream outputStream) {
        CBORGenerator cBORGenerator = new CBORGenerator(c9389of, i, i2, this._objectCodec, outputStream);
        if (CBORGenerator.Feature.WRITE_TYPE_HEADER.b(i2)) {
            cBORGenerator.f(55799);
        }
        return cBORGenerator;
    }

    protected <T> T _nonByteSource() {
        throw new UnsupportedOperationException("Can not create parser for non-byte-based source");
    }

    protected <T> T _nonByteTarget() {
        throw new UnsupportedOperationException("Can not create generator for non-byte-based target");
    }
}
