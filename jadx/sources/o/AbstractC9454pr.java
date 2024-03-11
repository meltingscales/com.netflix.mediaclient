package o;

import com.fasterxml.jackson.databind.node.JsonNodeType;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.Map;
import o.InterfaceC9451po;

/* renamed from: o.pr  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9454pr extends InterfaceC9451po.b implements InterfaceC9330nZ, Iterable<AbstractC9454pr> {
    public AbstractC9454pr a(String str) {
        return null;
    }

    public byte[] b() {
        return null;
    }

    public abstract String c();

    public boolean f() {
        return false;
    }

    public double h() {
        return 0.0d;
    }

    public boolean j() {
        return false;
    }

    public boolean l() {
        return false;
    }

    public abstract JsonNodeType m();

    public int o() {
        return 0;
    }

    public boolean p() {
        return false;
    }

    public long r() {
        return 0L;
    }

    public Number s() {
        return null;
    }

    public int u() {
        return 0;
    }

    public String y() {
        return null;
    }

    public final boolean t() {
        return m() == JsonNodeType.POJO;
    }

    public final boolean q() {
        return m() == JsonNodeType.NUMBER;
    }

    public final boolean n() {
        return m() == JsonNodeType.BINARY;
    }

    public BigDecimal g() {
        return BigDecimal.ZERO;
    }

    public BigInteger d() {
        return BigInteger.ZERO;
    }

    @Override // java.lang.Iterable
    public final Iterator<AbstractC9454pr> iterator() {
        return i();
    }

    public Iterator<AbstractC9454pr> i() {
        return C9537rU.c();
    }

    public Iterator<Map.Entry<String, AbstractC9454pr>> k() {
        return C9537rU.c();
    }
}
