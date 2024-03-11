package o;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.RuntimeJsonMappingException;
import java.io.Closeable;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: o.pt  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C9456pt<T> implements Iterator<T>, Closeable {
    protected static final C9456pt<?> c = new C9456pt<>(null, null, null, null, false, null);
    protected final boolean a;
    protected final AbstractC9452pp<T> b;
    protected final DeserializationContext d;
    protected final JsonParser e;
    protected final JavaType f;
    protected final AbstractC9323nS g;
    protected final T h;
    protected int i;

    /* JADX WARN: Multi-variable type inference failed */
    public C9456pt(JavaType javaType, JsonParser jsonParser, DeserializationContext deserializationContext, AbstractC9452pp<?> abstractC9452pp, boolean z, Object obj) {
        this.f = javaType;
        this.e = jsonParser;
        this.d = deserializationContext;
        this.b = abstractC9452pp;
        this.a = z;
        if (obj == 0) {
            this.h = null;
        } else {
            this.h = obj;
        }
        if (jsonParser == null) {
            this.g = null;
            this.i = 0;
            return;
        }
        AbstractC9323nS z2 = jsonParser.z();
        if (z && jsonParser.J()) {
            jsonParser.e();
        } else {
            JsonToken f = jsonParser.f();
            if (f == JsonToken.START_OBJECT || f == JsonToken.START_ARRAY) {
                z2 = z2.b();
            }
        }
        this.g = z2;
        this.i = 2;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        try {
            return b();
        } catch (JsonMappingException e) {
            return ((Boolean) b(e)).booleanValue();
        } catch (IOException e2) {
            return ((Boolean) c(e2)).booleanValue();
        }
    }

    @Override // java.util.Iterator
    public T next() {
        try {
            return d();
        } catch (JsonMappingException e) {
            return (T) b(e);
        } catch (IOException e2) {
            return (T) c(e2);
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.i != 0) {
            this.i = 0;
            JsonParser jsonParser = this.e;
            if (jsonParser != null) {
                jsonParser.close();
            }
        }
    }

    public boolean b() {
        JsonToken Q;
        JsonParser jsonParser;
        int i = this.i;
        if (i != 0) {
            if (i == 1) {
                a();
            } else if (i != 2) {
                return true;
            }
            if (this.e.f() != null || ((Q = this.e.Q()) != null && Q != JsonToken.END_ARRAY)) {
                this.i = 3;
                return true;
            }
            this.i = 0;
            if (this.a && (jsonParser = this.e) != null) {
                jsonParser.close();
            }
            return false;
        }
        return false;
    }

    public T d() {
        T t;
        int i = this.i;
        if (i == 0) {
            return (T) c();
        }
        if ((i == 1 || i == 2) && !b()) {
            return (T) c();
        }
        try {
            T t2 = this.h;
            if (t2 == null) {
                t = this.b.b(this.e, this.d);
            } else {
                this.b.e(this.e, this.d, t2);
                t = this.h;
            }
            this.i = 2;
            this.e.e();
            return t;
        } catch (Throwable th) {
            this.i = 1;
            this.e.e();
            throw th;
        }
    }

    protected void a() {
        JsonParser jsonParser = this.e;
        if (jsonParser.z() == this.g) {
            return;
        }
        while (true) {
            JsonToken Q = jsonParser.Q();
            if (Q == JsonToken.END_ARRAY || Q == JsonToken.END_OBJECT) {
                if (jsonParser.z() == this.g) {
                    jsonParser.e();
                    return;
                }
            } else if (Q == JsonToken.START_ARRAY || Q == JsonToken.START_OBJECT) {
                jsonParser.T();
            } else if (Q == null) {
                return;
            }
        }
    }

    protected <R> R c() {
        throw new NoSuchElementException();
    }

    protected <R> R b(JsonMappingException jsonMappingException) {
        throw new RuntimeJsonMappingException(jsonMappingException.getMessage(), jsonMappingException);
    }

    protected <R> R c(IOException iOException) {
        throw new RuntimeException(iOException.getMessage(), iOException);
    }
}
