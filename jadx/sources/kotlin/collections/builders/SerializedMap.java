package kotlin.collections.builders;

import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Map;
import o.C8627dsp;
import o.C8632dsu;
import o.dqD;

/* loaded from: classes6.dex */
final class SerializedMap implements Externalizable {
    public static final b b = new b(null);
    private static final long serialVersionUID = 0;
    private Map<?, ?> c;

    private final Object readResolve() {
        return this.c;
    }

    public SerializedMap(Map<?, ?> map) {
        C8632dsu.c((Object) map, "");
        this.c = map;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public SerializedMap() {
        /*
            r1 = this;
            java.util.Map r0 = o.dqF.c()
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.builders.SerializedMap.<init>():void");
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) {
        C8632dsu.c((Object) objectOutput, "");
        objectOutput.writeByte(0);
        objectOutput.writeInt(this.c.size());
        for (Map.Entry<?, ?> entry : this.c.entrySet()) {
            objectOutput.writeObject(entry.getKey());
            objectOutput.writeObject(entry.getValue());
        }
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) {
        Map b2;
        Map<?, ?> h;
        C8632dsu.c((Object) objectInput, "");
        byte readByte = objectInput.readByte();
        if (readByte != 0) {
            throw new InvalidObjectException("Unsupported flags value: " + ((int) readByte));
        }
        int readInt = objectInput.readInt();
        if (readInt < 0) {
            throw new InvalidObjectException("Illegal size value: " + readInt + '.');
        }
        b2 = dqD.b(readInt);
        for (int i = 0; i < readInt; i++) {
            b2.put(objectInput.readObject(), objectInput.readObject());
        }
        h = dqD.h(b2);
        this.c = h;
    }

    /* loaded from: classes6.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }
    }
}
