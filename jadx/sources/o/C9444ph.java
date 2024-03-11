package o;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

/* renamed from: o.ph  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C9444ph extends JsonParser {
    public JsonParser m;

    public C9444ph(JsonParser jsonParser) {
        this.m = jsonParser;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public ObjectCodec n() {
        return this.m.n();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonParser e(JsonParser.Feature feature) {
        this.m.e(feature);
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonParser b(JsonParser.Feature feature) {
        this.m.b(feature);
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean a(JsonParser.Feature feature) {
        return this.m.a(feature);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    @Deprecated
    public JsonParser c(int i) {
        this.m.c(i);
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonParser d(int i, int i2) {
        this.m.d(i, i2);
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonParser c(int i, int i2) {
        this.m.c(i, i2);
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public void d(InterfaceC9324nT interfaceC9324nT) {
        this.m.d(interfaceC9324nT);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean X() {
        return this.m.X();
    }

    @Override // com.fasterxml.jackson.core.JsonParser, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.m.close();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public void e() {
        this.m.e();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public void e(Object obj) {
        this.m.e(obj);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public AbstractC9323nS z() {
        return this.m.z();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonToken f() {
        return this.m.f();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int j() {
        return this.m.j();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public String d() {
        return this.m.d();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonToken o() {
        return this.m.o();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    @Deprecated
    public int t() {
        return this.m.t();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public String l() {
        return this.m.l();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonLocation k() {
        return this.m.k();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonLocation G() {
        return this.m.G();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean N() {
        return this.m.N();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean e(int i) {
        return this.m.e(i);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean a(JsonToken jsonToken) {
        return this.m.a(jsonToken);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean J() {
        return this.m.J();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean K() {
        return this.m.K();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean P() {
        return this.m.P();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public String A() {
        return this.m.A();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean M() {
        return this.m.M();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public char[] B() {
        return this.m.B();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int D() {
        return this.m.D();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int H() {
        return this.m.H();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public BigInteger h() {
        return this.m.h();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean g() {
        return this.m.g();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public byte m() {
        return this.m.m();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public short C() {
        return this.m.C();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public BigDecimal r() {
        return this.m.r();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public double p() {
        return this.m.p();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public float s() {
        return this.m.s();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int u() {
        return this.m.u();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public long w() {
        return this.m.w();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonParser.NumberType v() {
        return this.m.v();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public Number y() {
        return this.m.y();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int E() {
        return this.m.E();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int d(int i) {
        return this.m.d(i);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public long I() {
        return this.m.I();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public long d(long j) {
        return this.m.d(j);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public String L() {
        return this.m.L();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public String c(String str) {
        return this.m.c(str);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public Object q() {
        return this.m.q();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public byte[] e(Base64Variant base64Variant) {
        return this.m.e(base64Variant);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int e(Base64Variant base64Variant, OutputStream outputStream) {
        return this.m.e(base64Variant, outputStream);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonToken Q() {
        return this.m.Q();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonToken O() {
        return this.m.O();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonParser T() {
        this.m.T();
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean b() {
        return this.m.b();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean c() {
        return this.m.c();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public Object x() {
        return this.m.x();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public Object F() {
        return this.m.F();
    }
}
