package o;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.io.CharacterEscapes;

/* renamed from: o.nU  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C9325nU extends AbstractC9329nY<JsonFactory, C9325nU> {
    public int a;
    public char c;
    public InterfaceC9327nW d;
    public CharacterEscapes e;

    public C9325nU() {
        this.c = JsonFactory.DEFAULT_QUOTE_CHAR;
        this.d = JsonFactory.DEFAULT_ROOT_VALUE_SEPARATOR;
        this.a = 0;
    }

    public C9325nU(JsonFactory jsonFactory) {
        super(jsonFactory);
        this.c = JsonFactory.DEFAULT_QUOTE_CHAR;
        this.e = jsonFactory.getCharacterEscapes();
        this.d = jsonFactory._rootValueSeparator;
        this.a = jsonFactory._maximumNonEscapedChar;
    }

    @Override // o.AbstractC9329nY
    public JsonFactory e() {
        return new JsonFactory(this);
    }
}
