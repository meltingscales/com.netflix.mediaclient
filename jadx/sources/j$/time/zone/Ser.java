package j$.time.zone;

import j$.time.ZoneOffset;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
import org.chromium.net.PrivateKeyType;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class Ser implements Externalizable {
    private static final long serialVersionUID = -8885321777449118786L;
    private Object b;
    private byte c;

    public Ser() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Ser(byte b, Object obj) {
        this.c = b;
        this.b = obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(ZoneOffset zoneOffset, DataOutput dataOutput) {
        int a = zoneOffset.a();
        int i = a % 900 == 0 ? a / 900 : 127;
        dataOutput.writeByte(i);
        if (i == 127) {
            dataOutput.writeInt(a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long b(DataInput dataInput) {
        int readByte = dataInput.readByte() & 255;
        return readByte == 255 ? dataInput.readLong() : ((((readByte << 16) + ((dataInput.readByte() & 255) << 8)) + (dataInput.readByte() & 255)) * 900) - 4575744000L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ZoneOffset d(DataInput dataInput) {
        byte readByte = dataInput.readByte();
        return readByte == Byte.MAX_VALUE ? ZoneOffset.e(dataInput.readInt()) : ZoneOffset.e(readByte * 900);
    }

    private static Object d(byte b, DataInput dataInput) {
        if (b != 1) {
            if (b != 2) {
                if (b != 3) {
                    if (b == 100) {
                        return ZoneRules.d(dataInput);
                    }
                    throw new StreamCorruptedException("Unknown serialized type");
                }
                return ZoneOffsetTransitionRule.d(dataInput);
            }
            return ZoneOffsetTransition.e(dataInput);
        }
        return ZoneRules.c(dataInput);
    }

    private static void e(byte b, Object obj, DataOutput dataOutput) {
        dataOutput.writeByte(b);
        if (b == 1) {
            ((ZoneRules) obj).e(dataOutput);
        } else if (b == 2) {
            ((ZoneOffsetTransition) obj).d(dataOutput);
        } else if (b == 3) {
            ((ZoneOffsetTransitionRule) obj).a(dataOutput);
        } else if (b != 100) {
            throw new InvalidClassException("Unknown serialized type");
        } else {
            ((ZoneRules) obj).d(dataOutput);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(long j, DataOutput dataOutput) {
        if (j < -4575744000L || j >= 10413792000L || j % 900 != 0) {
            dataOutput.writeByte(PrivateKeyType.INVALID);
            dataOutput.writeLong(j);
            return;
        }
        int i = (int) ((j + 4575744000L) / 900);
        dataOutput.writeByte((i >>> 16) & PrivateKeyType.INVALID);
        dataOutput.writeByte((i >>> 8) & PrivateKeyType.INVALID);
        dataOutput.writeByte(i & PrivateKeyType.INVALID);
    }

    private Object readResolve() {
        return this.b;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) {
        byte readByte = objectInput.readByte();
        this.c = readByte;
        this.b = d(readByte, objectInput);
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) {
        e(this.c, this.b, objectOutput);
    }
}
