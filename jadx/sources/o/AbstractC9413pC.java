package o;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/* renamed from: o.pC  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC9413pC {
    protected JsonFormat.Value a;
    protected Boolean b;
    protected JsonInclude.Value c;
    protected JsonIgnoreProperties.Value d;
    protected JsonInclude.Value e;
    protected JsonSetter.Value g;
    protected JsonAutoDetect.Value h;
    protected Boolean i;

    public JsonInclude.Value a() {
        return this.c;
    }

    public JsonInclude.Value c() {
        return this.e;
    }

    public JsonFormat.Value d() {
        return this.a;
    }

    public JsonIgnoreProperties.Value e() {
        return this.d;
    }

    public JsonAutoDetect.Value f() {
        return this.h;
    }

    public Boolean g() {
        return this.i;
    }

    public JsonSetter.Value h() {
        return this.g;
    }

    public Boolean j() {
        return this.b;
    }

    public AbstractC9413pC() {
    }

    public AbstractC9413pC(AbstractC9413pC abstractC9413pC) {
        this.a = abstractC9413pC.a;
        this.c = abstractC9413pC.c;
        this.e = abstractC9413pC.e;
        this.d = abstractC9413pC.d;
        this.g = abstractC9413pC.g;
        this.h = abstractC9413pC.h;
        this.b = abstractC9413pC.b;
        this.i = abstractC9413pC.i;
    }

    public static AbstractC9413pC b() {
        return e.j;
    }

    /* renamed from: o.pC$e */
    /* loaded from: classes5.dex */
    static final class e extends AbstractC9413pC {
        static final e j = new e();

        private e() {
        }
    }
}
