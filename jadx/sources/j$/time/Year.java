package j$.time;

import j$.time.chrono.IsoChronology;
import j$.time.format.DateTimeFormatterBuilder;
import j$.time.format.SignStyle;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.UnsupportedTemporalTypeException;
import j$.time.temporal.ValueRange;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;
import o.AbstractC8538dph;
import o.InterfaceC8528doy;
import o.InterfaceC8535dpe;
import o.InterfaceC8537dpg;
import o.InterfaceC8540dpj;
import o.doE;
import o.doW;
import o.doX;
import o.doY;

/* loaded from: classes5.dex */
public final class Year implements doX, doW, Comparable, Serializable {
    private static final doE d = new DateTimeFormatterBuilder().a(ChronoField.B, 4, 10, SignStyle.EXCEEDS_PAD).n();
    private static final long serialVersionUID = -23038383694477807L;
    private final int b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j$.time.Year$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static abstract /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] b;
        static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[ChronoUnit.values().length];
            b = iArr;
            try {
                iArr[ChronoUnit.YEARS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[ChronoUnit.DECADES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[ChronoUnit.CENTURIES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[ChronoUnit.MILLENNIA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[ChronoUnit.ERAS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[ChronoField.values().length];
            c = iArr2;
            try {
                iArr2[ChronoField.A.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                c[ChronoField.B.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                c[ChronoField.m.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    private Year(int i) {
        this.b = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Year b(DataInput dataInput) {
        return e(dataInput.readInt());
    }

    public static boolean b(long j) {
        return (3 & j) == 0 && (j % 100 != 0 || j % 400 == 0);
    }

    public static Year e(int i) {
        ChronoField.B.d(i);
        return new Year(i);
    }

    public static Year e(doY doy) {
        if (doy instanceof Year) {
            return (Year) doy;
        }
        Objects.requireNonNull(doy, "temporal");
        try {
            if (!IsoChronology.d.equals(InterfaceC8528doy.d(doy))) {
                doy = LocalDate.e(doy);
            }
            return e(doy.b(ChronoField.B));
        } catch (DateTimeException e) {
            String name = doy.getClass().getName();
            throw new DateTimeException("Unable to obtain Year from TemporalAccessor: " + doy + " of type " + name, e);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new Ser((byte) 11, this);
    }

    @Override // o.doX
    public long a(doX dox, InterfaceC8540dpj interfaceC8540dpj) {
        Year e = e((doY) dox);
        if (interfaceC8540dpj instanceof ChronoUnit) {
            long j = e.b - this.b;
            int i = AnonymousClass1.b[((ChronoUnit) interfaceC8540dpj).ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                ChronoField chronoField = ChronoField.m;
                                return e.a(chronoField) - a(chronoField);
                            }
                            throw new UnsupportedTemporalTypeException("Unsupported unit: " + interfaceC8540dpj);
                        }
                        return j / 1000;
                    }
                    return j / 100;
                }
                return j / 10;
            }
            return j;
        }
        return interfaceC8540dpj.d(this, e);
    }

    @Override // o.doY
    public long a(InterfaceC8535dpe interfaceC8535dpe) {
        if (interfaceC8535dpe instanceof ChronoField) {
            int i = AnonymousClass1.c[((ChronoField) interfaceC8535dpe).ordinal()];
            if (i == 1) {
                int i2 = this.b;
                if (i2 < 1) {
                    i2 = 1 - i2;
                }
                return i2;
            } else if (i != 2) {
                if (i == 3) {
                    return this.b < 1 ? 0 : 1;
                }
                throw new UnsupportedTemporalTypeException("Unsupported field: " + interfaceC8535dpe);
            } else {
                return this.b;
            }
        }
        return interfaceC8535dpe.d(this);
    }

    @Override // o.doX
    /* renamed from: a */
    public Year b(long j, InterfaceC8540dpj interfaceC8540dpj) {
        long multiplyExact;
        long multiplyExact2;
        long multiplyExact3;
        if (interfaceC8540dpj instanceof ChronoUnit) {
            int i = AnonymousClass1.b[((ChronoUnit) interfaceC8540dpj).ordinal()];
            if (i != 1) {
                if (i == 2) {
                    multiplyExact = Math.multiplyExact(j, 10L);
                    return d(multiplyExact);
                } else if (i == 3) {
                    multiplyExact2 = Math.multiplyExact(j, 100L);
                    return d(multiplyExact2);
                } else if (i == 4) {
                    multiplyExact3 = Math.multiplyExact(j, 1000L);
                    return d(multiplyExact3);
                } else if (i == 5) {
                    ChronoField chronoField = ChronoField.m;
                    return d(chronoField, Math.addExact(a(chronoField), j));
                } else {
                    throw new UnsupportedTemporalTypeException("Unsupported unit: " + interfaceC8540dpj);
                }
            }
            return d(j);
        }
        return (Year) interfaceC8540dpj.e(this, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(DataOutput dataOutput) {
        dataOutput.writeInt(this.b);
    }

    @Override // o.doY
    public int b(InterfaceC8535dpe interfaceC8535dpe) {
        return d(interfaceC8535dpe).a(a(interfaceC8535dpe), interfaceC8535dpe);
    }

    @Override // o.doX
    /* renamed from: b */
    public Year a(doW dow) {
        return (Year) dow.e(this);
    }

    @Override // o.doX
    /* renamed from: b */
    public Year d(InterfaceC8535dpe interfaceC8535dpe, long j) {
        if (interfaceC8535dpe instanceof ChronoField) {
            ChronoField chronoField = (ChronoField) interfaceC8535dpe;
            chronoField.d(j);
            int i = AnonymousClass1.c[chronoField.ordinal()];
            if (i == 1) {
                if (this.b < 1) {
                    j = 1 - j;
                }
                return e((int) j);
            } else if (i != 2) {
                if (i == 3) {
                    return a(ChronoField.m) == j ? this : e(1 - this.b);
                }
                throw new UnsupportedTemporalTypeException("Unsupported field: " + interfaceC8535dpe);
            } else {
                return e((int) j);
            }
        }
        return (Year) interfaceC8535dpe.d(this, j);
    }

    @Override // o.doY
    public Object b(InterfaceC8537dpg interfaceC8537dpg) {
        return interfaceC8537dpg == AbstractC8538dph.c() ? IsoChronology.d : interfaceC8537dpg == AbstractC8538dph.d() ? ChronoUnit.YEARS : super.b(interfaceC8537dpg);
    }

    @Override // java.lang.Comparable
    /* renamed from: c */
    public int compareTo(Year year) {
        return this.b - year.b;
    }

    public Year d(long j) {
        return j == 0 ? this : e(ChronoField.B.b(this.b + j));
    }

    @Override // o.doX
    /* renamed from: d */
    public Year e(long j, InterfaceC8540dpj interfaceC8540dpj) {
        return j == Long.MIN_VALUE ? b(Long.MAX_VALUE, interfaceC8540dpj).b(1L, interfaceC8540dpj) : b(-j, interfaceC8540dpj);
    }

    @Override // o.doY
    public ValueRange d(InterfaceC8535dpe interfaceC8535dpe) {
        if (interfaceC8535dpe == ChronoField.A) {
            return ValueRange.b(1L, this.b <= 0 ? 1000000000L : 999999999L);
        }
        return super.d(interfaceC8535dpe);
    }

    @Override // o.doW
    public doX e(doX dox) {
        if (InterfaceC8528doy.d(dox).equals(IsoChronology.d)) {
            return dox.d(ChronoField.B, this.b);
        }
        throw new DateTimeException("Adjustment only supported on ISO date-time");
    }

    @Override // o.doY
    public boolean e(InterfaceC8535dpe interfaceC8535dpe) {
        return interfaceC8535dpe instanceof ChronoField ? interfaceC8535dpe == ChronoField.B || interfaceC8535dpe == ChronoField.A || interfaceC8535dpe == ChronoField.m : interfaceC8535dpe != null && interfaceC8535dpe.a(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Year) && this.b == ((Year) obj).b;
    }

    public int hashCode() {
        return this.b;
    }

    public String toString() {
        return Integer.toString(this.b);
    }
}
