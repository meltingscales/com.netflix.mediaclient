package o;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.format.MatchStrength;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectReader;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import o.InterfaceC9390og;

/* renamed from: o.pM  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C9423pM {
    protected final int a;
    protected final MatchStrength b;
    protected final MatchStrength c;
    protected final ObjectReader[] d;

    private C9423pM(ObjectReader[] objectReaderArr, MatchStrength matchStrength, MatchStrength matchStrength2, int i) {
        this.d = objectReaderArr;
        this.c = matchStrength;
        this.b = matchStrength2;
        this.a = i;
    }

    public C9423pM d(DeserializationConfig deserializationConfig) {
        int length = this.d.length;
        ObjectReader[] objectReaderArr = new ObjectReader[length];
        for (int i = 0; i < length; i++) {
            objectReaderArr[i] = this.d[i].d(deserializationConfig);
        }
        return new C9423pM(objectReaderArr, this.c, this.b, this.a);
    }

    public C9423pM c(JavaType javaType) {
        int length = this.d.length;
        ObjectReader[] objectReaderArr = new ObjectReader[length];
        for (int i = 0; i < length; i++) {
            objectReaderArr[i] = this.d[i].b(javaType);
        }
        return new C9423pM(objectReaderArr, this.c, this.b, this.a);
    }

    public a a(byte[] bArr, int i, int i2) {
        return a(new d(bArr, i, i2));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        ObjectReader[] objectReaderArr = this.d;
        int length = objectReaderArr.length;
        if (length > 0) {
            sb.append(objectReaderArr[0].getFactory().getFormatName());
            for (int i = 1; i < length; i++) {
                sb.append(", ");
                sb.append(this.d[i].getFactory().getFormatName());
            }
        }
        sb.append(']');
        return sb.toString();
    }

    private a a(d dVar) {
        ObjectReader[] objectReaderArr = this.d;
        int length = objectReaderArr.length;
        ObjectReader objectReader = null;
        int i = 0;
        MatchStrength matchStrength = null;
        while (true) {
            if (i >= length) {
                break;
            }
            ObjectReader objectReader2 = objectReaderArr[i];
            dVar.d();
            MatchStrength hasFormat = objectReader2.getFactory().hasFormat(dVar);
            if (hasFormat != null && hasFormat.ordinal() >= this.b.ordinal() && (objectReader == null || matchStrength.ordinal() < hasFormat.ordinal())) {
                if (hasFormat.ordinal() >= this.c.ordinal()) {
                    objectReader = objectReader2;
                    matchStrength = hasFormat;
                    break;
                }
                objectReader = objectReader2;
                matchStrength = hasFormat;
            }
            i++;
        }
        return dVar.e(objectReader, matchStrength);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: o.pM$d */
    /* loaded from: classes5.dex */
    public class d extends InterfaceC9390og.b {
        public d(byte[] bArr, int i, int i2) {
            super(bArr, i, i2);
        }

        public a e(ObjectReader objectReader, MatchStrength matchStrength) {
            InputStream inputStream = this.b;
            byte[] bArr = this.c;
            int i = this.d;
            return new a(inputStream, bArr, i, this.a - i, objectReader, matchStrength);
        }
    }

    /* renamed from: o.pM$a */
    /* loaded from: classes5.dex */
    public static class a {
        protected final int a;
        protected final int b;
        protected final byte[] c;
        protected final ObjectReader d;
        protected final MatchStrength e;
        protected final InputStream i;

        public ObjectReader d() {
            return this.d;
        }

        public boolean e() {
            return this.d != null;
        }

        protected a(InputStream inputStream, byte[] bArr, int i, int i2, ObjectReader objectReader, MatchStrength matchStrength) {
            this.i = inputStream;
            this.c = bArr;
            this.b = i;
            this.a = i2;
            this.d = objectReader;
            this.e = matchStrength;
        }

        public JsonParser a() {
            ObjectReader objectReader = this.d;
            if (objectReader == null) {
                return null;
            }
            JsonFactory factory = objectReader.getFactory();
            if (this.i == null) {
                return factory.createParser(this.c, this.b, this.a);
            }
            return factory.createParser(b());
        }

        public InputStream b() {
            if (this.i == null) {
                return new ByteArrayInputStream(this.c, this.b, this.a);
            }
            return new C9397on(null, this.i, this.c, this.b, this.a);
        }
    }
}
