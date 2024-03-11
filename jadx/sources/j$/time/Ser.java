package j$.time;

import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class Ser implements Externalizable {
    private static final long serialVersionUID = -7683839454370182990L;
    private byte b;
    private Object e;

    public Ser() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Ser(byte b, Object obj) {
        this.b = b;
        this.e = obj;
    }

    static void c(byte b, Object obj, ObjectOutput objectOutput) {
        objectOutput.writeByte(b);
        switch (b) {
            case 1:
                ((Duration) obj).d(objectOutput);
                return;
            case 2:
                ((Instant) obj).c(objectOutput);
                return;
            case 3:
                ((LocalDate) obj).a(objectOutput);
                return;
            case 4:
                ((LocalTime) obj).c(objectOutput);
                return;
            case 5:
                ((LocalDateTime) obj).e(objectOutput);
                return;
            case 6:
                ((ZonedDateTime) obj).a(objectOutput);
                return;
            case 7:
                ((ZoneRegion) obj).b(objectOutput);
                return;
            case 8:
                ((ZoneOffset) obj).c(objectOutput);
                return;
            case 9:
                ((OffsetTime) obj).a(objectOutput);
                return;
            case 10:
                ((OffsetDateTime) obj).b(objectOutput);
                return;
            case 11:
                ((Year) obj).a(objectOutput);
                return;
            case 12:
                ((YearMonth) obj).b(objectOutput);
                return;
            case 13:
                ((MonthDay) obj).c(objectOutput);
                return;
            case 14:
                ((Period) obj).d(objectOutput);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    private static Object d(byte b, ObjectInput objectInput) {
        switch (b) {
            case 1:
                return Duration.a(objectInput);
            case 2:
                return Instant.e(objectInput);
            case 3:
                return LocalDate.a(objectInput);
            case 4:
                return LocalTime.d(objectInput);
            case 5:
                return LocalDateTime.a(objectInput);
            case 6:
                return ZonedDateTime.a(objectInput);
            case 7:
                return ZoneRegion.d(objectInput);
            case 8:
                return ZoneOffset.d(objectInput);
            case 9:
                return OffsetTime.a(objectInput);
            case 10:
                return OffsetDateTime.d(objectInput);
            case 11:
                return Year.b(objectInput);
            case 12:
                return YearMonth.b(objectInput);
            case 13:
                return MonthDay.d(objectInput);
            case 14:
                return Period.e(objectInput);
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object e(ObjectInput objectInput) {
        return d(objectInput.readByte(), objectInput);
    }

    private Object readResolve() {
        return this.e;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) {
        byte readByte = objectInput.readByte();
        this.b = readByte;
        this.e = d(readByte, objectInput);
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) {
        c(this.b, this.e, objectOutput);
    }
}
