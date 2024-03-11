package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.format.MatchStrength;
import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.core.io.ContentReference;
import com.fasterxml.jackson.core.io.InputDecorator;
import com.fasterxml.jackson.core.io.OutputDecorator;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import java.io.CharArrayReader;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Serializable;
import java.io.StringReader;
import java.io.Writer;
import java.net.URL;
import o.AbstractC9329nY;
import o.C9325nU;
import o.C9365oH;
import o.C9367oJ;
import o.C9368oK;
import o.C9369oL;
import o.C9370oM;
import o.C9372oO;
import o.C9373oP;
import o.C9376oS;
import o.C9377oT;
import o.C9381oX;
import o.C9382oY;
import o.C9389of;
import o.C9402os;
import o.C9438pb;
import o.InterfaceC9321nQ;
import o.InterfaceC9324nT;
import o.InterfaceC9327nW;
import o.InterfaceC9383oZ;
import o.InterfaceC9390og;

/* loaded from: classes2.dex */
public class JsonFactory extends TokenStreamFactory implements Serializable {
    public static final char DEFAULT_QUOTE_CHAR = '\"';
    public static final String FORMAT_NAME_JSON = "JSON";
    private static final long serialVersionUID = 2;
    public final transient C9377oT _byteSymbolCanonicalizer;
    protected CharacterEscapes _characterEscapes;
    public int _factoryFeatures;
    public int _generatorFeatures;
    public InputDecorator _inputDecorator;
    public int _maximumNonEscapedChar;
    public ObjectCodec _objectCodec;
    protected OutputDecorator _outputDecorator;
    public int _parserFeatures;
    protected final char _quoteChar;
    protected final transient C9381oX _rootCharSymbols;
    public InterfaceC9327nW _rootValueSeparator;
    protected static final int DEFAULT_FACTORY_FEATURE_FLAGS = Feature.c();
    protected static final int DEFAULT_PARSER_FEATURE_FLAGS = JsonParser.Feature.a();
    protected static final int DEFAULT_GENERATOR_FEATURE_FLAGS = JsonGenerator.Feature.e();
    public static final InterfaceC9327nW DEFAULT_ROOT_VALUE_SEPARATOR = DefaultPrettyPrinter.e;

    public boolean canHandleBinaryNatively() {
        return false;
    }

    public boolean canUseCharArrays() {
        return true;
    }

    public CharacterEscapes getCharacterEscapes() {
        return this._characterEscapes;
    }

    public ObjectCodec getCodec() {
        return this._objectCodec;
    }

    public int getFormatGeneratorFeatures() {
        return 0;
    }

    public int getFormatParserFeatures() {
        return 0;
    }

    public Class<? extends InterfaceC9321nQ> getFormatReadFeatureType() {
        return null;
    }

    public Class<? extends InterfaceC9321nQ> getFormatWriteFeatureType() {
        return null;
    }

    public final int getGeneratorFeatures() {
        return this._generatorFeatures;
    }

    public InputDecorator getInputDecorator() {
        return this._inputDecorator;
    }

    public OutputDecorator getOutputDecorator() {
        return this._outputDecorator;
    }

    public final int getParserFeatures() {
        return this._parserFeatures;
    }

    public boolean requiresCustomCodec() {
        return false;
    }

    public boolean requiresPropertyOrdering() {
        return false;
    }

    public JsonFactory setCharacterEscapes(CharacterEscapes characterEscapes) {
        this._characterEscapes = characterEscapes;
        return this;
    }

    public JsonFactory setCodec(ObjectCodec objectCodec) {
        this._objectCodec = objectCodec;
        return this;
    }

    @Deprecated
    public JsonFactory setInputDecorator(InputDecorator inputDecorator) {
        this._inputDecorator = inputDecorator;
        return this;
    }

    @Deprecated
    public JsonFactory setOutputDecorator(OutputDecorator outputDecorator) {
        this._outputDecorator = outputDecorator;
        return this;
    }

    /* loaded from: classes2.dex */
    public enum Feature implements InterfaceC9383oZ {
        INTERN_FIELD_NAMES(true),
        CANONICALIZE_FIELD_NAMES(true),
        FAIL_ON_SYMBOL_HASH_OVERFLOW(true),
        USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING(true);
        
        private final boolean i;

        @Override // o.InterfaceC9383oZ
        public boolean b() {
            return this.i;
        }

        public static int c() {
            Feature[] values;
            int i = 0;
            for (Feature feature : values()) {
                if (feature.b()) {
                    i |= feature.a();
                }
            }
            return i;
        }

        Feature(boolean z) {
            this.i = z;
        }

        public boolean a(int i) {
            return (i & a()) != 0;
        }

        @Override // o.InterfaceC9383oZ
        public int a() {
            return 1 << ordinal();
        }
    }

    public JsonFactory() {
        this((ObjectCodec) null);
    }

    public JsonFactory(ObjectCodec objectCodec) {
        this._rootCharSymbols = C9381oX.a();
        this._byteSymbolCanonicalizer = C9377oT.b();
        this._factoryFeatures = DEFAULT_FACTORY_FEATURE_FLAGS;
        this._parserFeatures = DEFAULT_PARSER_FEATURE_FLAGS;
        this._generatorFeatures = DEFAULT_GENERATOR_FEATURE_FLAGS;
        this._rootValueSeparator = DEFAULT_ROOT_VALUE_SEPARATOR;
        this._objectCodec = objectCodec;
        this._quoteChar = DEFAULT_QUOTE_CHAR;
    }

    public JsonFactory(JsonFactory jsonFactory, ObjectCodec objectCodec) {
        this._rootCharSymbols = C9381oX.a();
        this._byteSymbolCanonicalizer = C9377oT.b();
        this._factoryFeatures = DEFAULT_FACTORY_FEATURE_FLAGS;
        this._parserFeatures = DEFAULT_PARSER_FEATURE_FLAGS;
        this._generatorFeatures = DEFAULT_GENERATOR_FEATURE_FLAGS;
        this._rootValueSeparator = DEFAULT_ROOT_VALUE_SEPARATOR;
        this._objectCodec = objectCodec;
        this._factoryFeatures = jsonFactory._factoryFeatures;
        this._parserFeatures = jsonFactory._parserFeatures;
        this._generatorFeatures = jsonFactory._generatorFeatures;
        this._inputDecorator = jsonFactory._inputDecorator;
        this._outputDecorator = jsonFactory._outputDecorator;
        this._characterEscapes = jsonFactory._characterEscapes;
        this._rootValueSeparator = jsonFactory._rootValueSeparator;
        this._maximumNonEscapedChar = jsonFactory._maximumNonEscapedChar;
        this._quoteChar = jsonFactory._quoteChar;
    }

    public JsonFactory(C9325nU c9325nU) {
        this._rootCharSymbols = C9381oX.a();
        this._byteSymbolCanonicalizer = C9377oT.b();
        this._factoryFeatures = DEFAULT_FACTORY_FEATURE_FLAGS;
        this._parserFeatures = DEFAULT_PARSER_FEATURE_FLAGS;
        this._generatorFeatures = DEFAULT_GENERATOR_FEATURE_FLAGS;
        this._rootValueSeparator = DEFAULT_ROOT_VALUE_SEPARATOR;
        this._objectCodec = null;
        this._factoryFeatures = c9325nU.f;
        this._parserFeatures = c9325nU.k;
        this._generatorFeatures = c9325nU.f13883o;
        this._inputDecorator = c9325nU.j;
        this._outputDecorator = c9325nU.i;
        this._characterEscapes = c9325nU.e;
        this._rootValueSeparator = c9325nU.d;
        this._maximumNonEscapedChar = c9325nU.a;
        this._quoteChar = c9325nU.c;
    }

    public JsonFactory(AbstractC9329nY<?, ?> abstractC9329nY, boolean z) {
        this._rootCharSymbols = C9381oX.a();
        this._byteSymbolCanonicalizer = C9377oT.b();
        this._factoryFeatures = DEFAULT_FACTORY_FEATURE_FLAGS;
        this._parserFeatures = DEFAULT_PARSER_FEATURE_FLAGS;
        this._generatorFeatures = DEFAULT_GENERATOR_FEATURE_FLAGS;
        this._rootValueSeparator = DEFAULT_ROOT_VALUE_SEPARATOR;
        this._objectCodec = null;
        this._factoryFeatures = abstractC9329nY.f;
        this._parserFeatures = abstractC9329nY.k;
        this._generatorFeatures = abstractC9329nY.f13883o;
        this._inputDecorator = abstractC9329nY.j;
        this._outputDecorator = abstractC9329nY.i;
        this._characterEscapes = null;
        this._rootValueSeparator = null;
        this._maximumNonEscapedChar = 0;
        this._quoteChar = DEFAULT_QUOTE_CHAR;
    }

    public AbstractC9329nY<?, ?> rebuild() {
        _requireJSONFactory("Factory implementation for format (%s) MUST override `rebuild()` method");
        return new C9325nU(this);
    }

    public static AbstractC9329nY<?, ?> builder() {
        return new C9325nU();
    }

    public JsonFactory copy() {
        _checkInvalidCopy(JsonFactory.class);
        return new JsonFactory(this, (ObjectCodec) null);
    }

    public void _checkInvalidCopy(Class<?> cls) {
        if (getClass() == cls) {
            return;
        }
        throw new IllegalStateException("Failed copy(): " + getClass().getName() + " (version: " + version() + ") does not override copy(); it has to");
    }

    protected Object readResolve() {
        return new JsonFactory(this, this._objectCodec);
    }

    public boolean canParseAsync() {
        return _isJSONFactory();
    }

    public boolean canUseSchema(InterfaceC9324nT interfaceC9324nT) {
        String formatName;
        return (interfaceC9324nT == null || (formatName = getFormatName()) == null || !formatName.equals(interfaceC9324nT.c())) ? false : true;
    }

    public String getFormatName() {
        if (getClass() == JsonFactory.class) {
            return FORMAT_NAME_JSON;
        }
        return null;
    }

    public MatchStrength hasFormat(InterfaceC9390og interfaceC9390og) {
        if (getClass() == JsonFactory.class) {
            return hasJSONFormat(interfaceC9390og);
        }
        return null;
    }

    public MatchStrength hasJSONFormat(InterfaceC9390og interfaceC9390og) {
        return C9365oH.b(interfaceC9390og);
    }

    public Version version() {
        return C9370oM.b;
    }

    @Deprecated
    public final JsonFactory configure(Feature feature, boolean z) {
        return z ? enable(feature) : disable(feature);
    }

    @Deprecated
    public JsonFactory enable(Feature feature) {
        this._factoryFeatures = feature.a() | this._factoryFeatures;
        return this;
    }

    @Deprecated
    public JsonFactory disable(Feature feature) {
        this._factoryFeatures = (~feature.a()) & this._factoryFeatures;
        return this;
    }

    public final boolean isEnabled(Feature feature) {
        return (feature.a() & this._factoryFeatures) != 0;
    }

    public final JsonFactory configure(JsonParser.Feature feature, boolean z) {
        return z ? enable(feature) : disable(feature);
    }

    public JsonFactory enable(JsonParser.Feature feature) {
        this._parserFeatures = feature.b() | this._parserFeatures;
        return this;
    }

    public JsonFactory disable(JsonParser.Feature feature) {
        this._parserFeatures = (~feature.b()) & this._parserFeatures;
        return this;
    }

    public final boolean isEnabled(JsonParser.Feature feature) {
        return (feature.b() & this._parserFeatures) != 0;
    }

    public final boolean isEnabled(StreamReadFeature streamReadFeature) {
        return (streamReadFeature.c().b() & this._parserFeatures) != 0;
    }

    public final JsonFactory configure(JsonGenerator.Feature feature, boolean z) {
        return z ? enable(feature) : disable(feature);
    }

    public JsonFactory enable(JsonGenerator.Feature feature) {
        this._generatorFeatures = feature.c() | this._generatorFeatures;
        return this;
    }

    public JsonFactory disable(JsonGenerator.Feature feature) {
        this._generatorFeatures = (~feature.c()) & this._generatorFeatures;
        return this;
    }

    public final boolean isEnabled(JsonGenerator.Feature feature) {
        return (feature.c() & this._generatorFeatures) != 0;
    }

    public final boolean isEnabled(StreamWriteFeature streamWriteFeature) {
        return (streamWriteFeature.c().c() & this._generatorFeatures) != 0;
    }

    public JsonFactory setRootValueSeparator(String str) {
        this._rootValueSeparator = str == null ? null : new SerializedString(str);
        return this;
    }

    public String getRootValueSeparator() {
        InterfaceC9327nW interfaceC9327nW = this._rootValueSeparator;
        if (interfaceC9327nW == null) {
            return null;
        }
        return interfaceC9327nW.b();
    }

    public JsonParser createParser(File file) {
        C9389of _createContext = _createContext(_createContentReference(file), true);
        return _createParser(_decorate(b(file), _createContext), _createContext);
    }

    public JsonParser createParser(URL url) {
        C9389of _createContext = _createContext(_createContentReference(url), true);
        return _createParser(_decorate(a(url), _createContext), _createContext);
    }

    public JsonParser createParser(InputStream inputStream) {
        C9389of _createContext = _createContext(_createContentReference(inputStream), false);
        return _createParser(_decorate(inputStream, _createContext), _createContext);
    }

    public JsonParser createParser(Reader reader) {
        C9389of _createContext = _createContext(_createContentReference(reader), false);
        return _createParser(_decorate(reader, _createContext), _createContext);
    }

    public JsonParser createParser(byte[] bArr) {
        InputStream a;
        C9389of _createContext = _createContext(_createContentReference(bArr), true);
        InputDecorator inputDecorator = this._inputDecorator;
        if (inputDecorator != null && (a = inputDecorator.a(_createContext, bArr, 0, bArr.length)) != null) {
            return _createParser(a, _createContext);
        }
        return _createParser(bArr, 0, bArr.length, _createContext);
    }

    public JsonParser createParser(byte[] bArr, int i, int i2) {
        InputStream a;
        c(bArr, i, i2);
        C9389of _createContext = _createContext(_createContentReference(bArr, i, i2), true);
        InputDecorator inputDecorator = this._inputDecorator;
        if (inputDecorator != null && (a = inputDecorator.a(_createContext, bArr, i, i2)) != null) {
            return _createParser(a, _createContext);
        }
        return _createParser(bArr, i, i2, _createContext);
    }

    public JsonParser createParser(String str) {
        int length = str.length();
        if (this._inputDecorator != null || length > 32768 || !canUseCharArrays()) {
            return createParser(new StringReader(str));
        }
        C9389of _createContext = _createContext(_createContentReference(str), true);
        char[] b = _createContext.b(length);
        str.getChars(0, length, b, 0);
        return _createParser(b, 0, length, _createContext, true);
    }

    public JsonParser createParser(char[] cArr) {
        return createParser(cArr, 0, cArr.length);
    }

    public JsonParser createParser(char[] cArr, int i, int i2) {
        d(cArr, i, i2);
        if (this._inputDecorator != null) {
            return createParser(new CharArrayReader(cArr, i, i2));
        }
        return _createParser(cArr, i, i2, _createContext(_createContentReference(cArr, i, i2), true), false);
    }

    public JsonParser createParser(DataInput dataInput) {
        C9389of _createContext = _createContext(_createContentReference(dataInput), false);
        return _createParser(_decorate(dataInput, _createContext), _createContext);
    }

    public JsonParser createNonBlockingByteArrayParser() {
        _requireJSONFactory("Non-blocking source not (yet?) supported for this format (%s)");
        return new C9372oO(_createNonBlockingContext(null), this._parserFeatures, this._byteSymbolCanonicalizer.d(this._factoryFeatures));
    }

    public JsonParser createNonBlockingByteBufferParser() {
        _requireJSONFactory("Non-blocking source not (yet?) supported for this format (%s)");
        return new C9376oS(_createNonBlockingContext(null), this._parserFeatures, this._byteSymbolCanonicalizer.d(this._factoryFeatures));
    }

    public JsonGenerator createGenerator(OutputStream outputStream, JsonEncoding jsonEncoding) {
        C9389of _createContext = _createContext(_createContentReference(outputStream), false);
        _createContext.d(jsonEncoding);
        if (jsonEncoding == JsonEncoding.UTF8) {
            return _createUTF8Generator(_decorate(outputStream, _createContext), _createContext);
        }
        return _createGenerator(_decorate(_createWriter(outputStream, jsonEncoding, _createContext), _createContext), _createContext);
    }

    public JsonGenerator createGenerator(OutputStream outputStream) {
        return createGenerator(outputStream, JsonEncoding.UTF8);
    }

    public JsonGenerator createGenerator(Writer writer) {
        C9389of _createContext = _createContext(_createContentReference(writer), false);
        return _createGenerator(_decorate(writer, _createContext), _createContext);
    }

    public JsonGenerator createGenerator(File file, JsonEncoding jsonEncoding) {
        OutputStream e = e(file);
        C9389of _createContext = _createContext(_createContentReference(e), true);
        _createContext.d(jsonEncoding);
        if (jsonEncoding == JsonEncoding.UTF8) {
            return _createUTF8Generator(_decorate(e, _createContext), _createContext);
        }
        return _createGenerator(_decorate(_createWriter(e, jsonEncoding, _createContext), _createContext), _createContext);
    }

    public JsonGenerator createGenerator(DataOutput dataOutput, JsonEncoding jsonEncoding) {
        return createGenerator(b(dataOutput), jsonEncoding);
    }

    public JsonGenerator createGenerator(DataOutput dataOutput) {
        return createGenerator(b(dataOutput), JsonEncoding.UTF8);
    }

    @Deprecated
    public JsonParser createJsonParser(File file) {
        return createParser(file);
    }

    @Deprecated
    public JsonParser createJsonParser(URL url) {
        return createParser(url);
    }

    @Deprecated
    public JsonParser createJsonParser(InputStream inputStream) {
        return createParser(inputStream);
    }

    @Deprecated
    public JsonParser createJsonParser(Reader reader) {
        return createParser(reader);
    }

    @Deprecated
    public JsonParser createJsonParser(byte[] bArr) {
        return createParser(bArr);
    }

    @Deprecated
    public JsonParser createJsonParser(byte[] bArr, int i, int i2) {
        return createParser(bArr, i, i2);
    }

    @Deprecated
    public JsonParser createJsonParser(String str) {
        return createParser(str);
    }

    @Deprecated
    public JsonGenerator createJsonGenerator(OutputStream outputStream, JsonEncoding jsonEncoding) {
        return createGenerator(outputStream, jsonEncoding);
    }

    @Deprecated
    public JsonGenerator createJsonGenerator(Writer writer) {
        return createGenerator(writer);
    }

    @Deprecated
    public JsonGenerator createJsonGenerator(OutputStream outputStream) {
        return createGenerator(outputStream, JsonEncoding.UTF8);
    }

    protected JsonParser _createParser(InputStream inputStream, C9389of c9389of) {
        try {
            return new C9365oH(c9389of, inputStream).e(this._parserFeatures, this._objectCodec, this._byteSymbolCanonicalizer, this._rootCharSymbols, this._factoryFeatures);
        } catch (IOException | RuntimeException e) {
            if (c9389of.f()) {
                try {
                    inputStream.close();
                } catch (Exception e2) {
                    e.addSuppressed(e2);
                }
            }
            throw e;
        }
    }

    protected JsonParser _createParser(Reader reader, C9389of c9389of) {
        return new C9369oL(c9389of, this._parserFeatures, reader, this._objectCodec, this._rootCharSymbols.e(this._factoryFeatures));
    }

    protected JsonParser _createParser(char[] cArr, int i, int i2, C9389of c9389of, boolean z) {
        return new C9369oL(c9389of, this._parserFeatures, null, this._objectCodec, this._rootCharSymbols.e(this._factoryFeatures), cArr, i, i + i2, z);
    }

    protected JsonParser _createParser(byte[] bArr, int i, int i2, C9389of c9389of) {
        return new C9365oH(c9389of, bArr, i, i2).e(this._parserFeatures, this._objectCodec, this._byteSymbolCanonicalizer, this._rootCharSymbols, this._factoryFeatures);
    }

    protected JsonParser _createParser(DataInput dataInput, C9389of c9389of) {
        _requireJSONFactory("InputData source not (yet?) supported for this format (%s)");
        int e = C9365oH.e(dataInput);
        return new C9367oJ(c9389of, this._parserFeatures, dataInput, this._objectCodec, this._byteSymbolCanonicalizer.d(this._factoryFeatures), e);
    }

    protected JsonGenerator _createGenerator(Writer writer, C9389of c9389of) {
        C9373oP c9373oP = new C9373oP(c9389of, this._generatorFeatures, this._objectCodec, writer, this._quoteChar);
        int i = this._maximumNonEscapedChar;
        if (i > 0) {
            c9373oP.b(i);
        }
        CharacterEscapes characterEscapes = this._characterEscapes;
        if (characterEscapes != null) {
            c9373oP.e(characterEscapes);
        }
        InterfaceC9327nW interfaceC9327nW = this._rootValueSeparator;
        if (interfaceC9327nW != DEFAULT_ROOT_VALUE_SEPARATOR) {
            c9373oP.a(interfaceC9327nW);
        }
        return c9373oP;
    }

    protected JsonGenerator _createUTF8Generator(OutputStream outputStream, C9389of c9389of) {
        C9368oK c9368oK = new C9368oK(c9389of, this._generatorFeatures, this._objectCodec, outputStream, this._quoteChar);
        int i = this._maximumNonEscapedChar;
        if (i > 0) {
            c9368oK.b(i);
        }
        CharacterEscapes characterEscapes = this._characterEscapes;
        if (characterEscapes != null) {
            c9368oK.e(characterEscapes);
        }
        InterfaceC9327nW interfaceC9327nW = this._rootValueSeparator;
        if (interfaceC9327nW != DEFAULT_ROOT_VALUE_SEPARATOR) {
            c9368oK.a(interfaceC9327nW);
        }
        return c9368oK;
    }

    protected Writer _createWriter(OutputStream outputStream, JsonEncoding jsonEncoding, C9389of c9389of) {
        if (jsonEncoding == JsonEncoding.UTF8) {
            return new C9402os(c9389of, outputStream);
        }
        return new OutputStreamWriter(outputStream, jsonEncoding.d());
    }

    public final InputStream _decorate(InputStream inputStream, C9389of c9389of) {
        InputStream e;
        InputDecorator inputDecorator = this._inputDecorator;
        return (inputDecorator == null || (e = inputDecorator.e(c9389of, inputStream)) == null) ? inputStream : e;
    }

    protected final Reader _decorate(Reader reader, C9389of c9389of) {
        Reader a;
        InputDecorator inputDecorator = this._inputDecorator;
        return (inputDecorator == null || (a = inputDecorator.a(c9389of, reader)) == null) ? reader : a;
    }

    protected final DataInput _decorate(DataInput dataInput, C9389of c9389of) {
        DataInput e;
        InputDecorator inputDecorator = this._inputDecorator;
        return (inputDecorator == null || (e = inputDecorator.e(c9389of, dataInput)) == null) ? dataInput : e;
    }

    public final OutputStream _decorate(OutputStream outputStream, C9389of c9389of) {
        OutputStream a;
        OutputDecorator outputDecorator = this._outputDecorator;
        return (outputDecorator == null || (a = outputDecorator.a(c9389of, outputStream)) == null) ? outputStream : a;
    }

    protected final Writer _decorate(Writer writer, C9389of c9389of) {
        Writer b;
        OutputDecorator outputDecorator = this._outputDecorator;
        return (outputDecorator == null || (b = outputDecorator.b(c9389of, writer)) == null) ? writer : b;
    }

    public C9382oY _getBufferRecycler() {
        if (Feature.USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING.a(this._factoryFeatures)) {
            return C9438pb.e();
        }
        return new C9382oY();
    }

    protected C9389of _createContext(ContentReference contentReference, boolean z) {
        if (contentReference == null) {
            contentReference = ContentReference.b();
        }
        return new C9389of(_getBufferRecycler(), contentReference, z);
    }

    @Deprecated
    public C9389of _createContext(Object obj, boolean z) {
        return new C9389of(_getBufferRecycler(), _createContentReference(obj), z);
    }

    protected C9389of _createNonBlockingContext(Object obj) {
        return new C9389of(_getBufferRecycler(), _createContentReference(obj), false);
    }

    protected ContentReference _createContentReference(Object obj) {
        return ContentReference.a(!canHandleBinaryNatively(), obj);
    }

    protected ContentReference _createContentReference(Object obj, int i, int i2) {
        return ContentReference.b(!canHandleBinaryNatively(), obj, i, i2);
    }

    private final void _requireJSONFactory(String str) {
        if (!_isJSONFactory()) {
            throw new UnsupportedOperationException(String.format(str, getFormatName()));
        }
    }

    private final boolean _isJSONFactory() {
        return getFormatName() == FORMAT_NAME_JSON;
    }
}
