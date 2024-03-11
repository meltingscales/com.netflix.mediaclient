package kotlin.collections.builders;

import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import o.C8566dqi;
import o.C8627dsp;
import o.C8632dsu;
import o.dqP;

/* loaded from: classes6.dex */
public final class SerializedCollection implements Externalizable {
    public static final a c = new a(null);
    private static final long serialVersionUID = 0;
    private Collection<?> a;
    private final int d;

    private final Object readResolve() {
        return this.a;
    }

    public SerializedCollection(Collection<?> collection, int i) {
        C8632dsu.c((Object) collection, "");
        this.a = collection;
        this.d = i;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public SerializedCollection() {
        /*
            r2 = this;
            java.util.List r0 = o.C8570dqm.c()
            r1 = 0
            r2.<init>(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.builders.SerializedCollection.<init>():void");
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) {
        C8632dsu.c((Object) objectOutput, "");
        objectOutput.writeByte(this.d);
        objectOutput.writeInt(this.a.size());
        Iterator<?> it = this.a.iterator();
        while (it.hasNext()) {
            objectOutput.writeObject(it.next());
        }
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) {
        List e;
        Set o2;
        Set b;
        Set c2;
        C8632dsu.c((Object) objectInput, "");
        byte readByte = objectInput.readByte();
        int i = readByte & 1;
        if ((readByte & (-2)) != 0) {
            throw new InvalidObjectException("Unsupported flags value: " + ((int) readByte) + '.');
        }
        int readInt = objectInput.readInt();
        if (readInt < 0) {
            throw new InvalidObjectException("Illegal size value: " + readInt + '.');
        }
        int i2 = 0;
        if (i == 0) {
            e = C8566dqi.e(readInt);
            while (i2 < readInt) {
                e.add(objectInput.readObject());
                i2++;
            }
            o2 = C8566dqi.o(e);
        } else if (i == 1) {
            b = dqP.b(readInt);
            while (i2 < readInt) {
                b.add(objectInput.readObject());
                i2++;
            }
            c2 = dqP.c(b);
            o2 = c2;
        } else {
            throw new InvalidObjectException("Unsupported collection type tag: " + i + '.');
        }
        this.a = o2;
    }

    /* loaded from: classes6.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }
    }
}
