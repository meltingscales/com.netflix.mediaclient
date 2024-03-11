package j$.time.chrono;

import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
import o.AbstractC8521dor;

/* loaded from: classes6.dex */
public final class Ser implements Externalizable {
    private static final long serialVersionUID = -6103370247208168577L;
    private Object b;
    private byte e;

    public Ser() {
    }

    public Ser(byte b, Object obj) {
        this.e = b;
        this.b = obj;
    }

    private static void a(byte b, Object obj, ObjectOutput objectOutput) {
        objectOutput.writeByte(b);
        switch (b) {
            case 1:
                ((AbstractC8521dor) obj).b(objectOutput);
                return;
            case 2:
                ((ChronoLocalDateTimeImpl) obj).d(objectOutput);
                return;
            case 3:
                ((ChronoZonedDateTimeImpl) obj).d(objectOutput);
                return;
            case 4:
                ((JapaneseDate) obj).c(objectOutput);
                return;
            case 5:
                ((JapaneseEra) obj).c(objectOutput);
                return;
            case 6:
                ((HijrahDate) obj).d(objectOutput);
                return;
            case 7:
                ((MinguoDate) obj).d(objectOutput);
                return;
            case 8:
                ((ThaiBuddhistDate) obj).b(objectOutput);
                return;
            case 9:
                ((ChronoPeriodImpl) obj).a(objectOutput);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    private static Object e(byte b, ObjectInput objectInput) {
        switch (b) {
            case 1:
                return AbstractC8521dor.a(objectInput);
            case 2:
                return ChronoLocalDateTimeImpl.c(objectInput);
            case 3:
                return ChronoZonedDateTimeImpl.b(objectInput);
            case 4:
                return JapaneseDate.c(objectInput);
            case 5:
                return JapaneseEra.a(objectInput);
            case 6:
                return HijrahDate.a(objectInput);
            case 7:
                return MinguoDate.b(objectInput);
            case 8:
                return ThaiBuddhistDate.c(objectInput);
            case 9:
                return ChronoPeriodImpl.b(objectInput);
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
    }

    private Object readResolve() {
        return this.b;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) {
        byte readByte = objectInput.readByte();
        this.e = readByte;
        this.b = e(readByte, objectInput);
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) {
        a(this.e, this.b, objectOutput);
    }
}
