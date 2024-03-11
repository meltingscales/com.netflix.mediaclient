package o;

/* renamed from: o.nd  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC9334nd {
    AbstractC9334nd() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.nd$a */
    /* loaded from: classes2.dex */
    public static final class a {
        long d = 0;
        int b = 0;

        void b() {
            this.b = 0;
            this.d = 0L;
        }

        void d() {
            long j = this.d;
            int i = this.b;
            while (((-18014398509481984L) & j) == 0) {
                j <<= 10;
                i -= 10;
            }
            while ((Long.MIN_VALUE & j) == 0) {
                j <<= 1;
                i--;
            }
            this.d = j;
            this.b = i;
        }

        a() {
        }

        void a(a aVar) {
            this.d -= aVar.d;
        }

        void b(a aVar) {
            long j = this.d;
            long j2 = j >>> 32;
            long j3 = j & 4294967295L;
            long j4 = aVar.d;
            long j5 = j4 >>> 32;
            long j6 = j4 & 4294967295L;
            long j7 = j5 * j3;
            long j8 = j2 * j6;
            this.b += aVar.b + 64;
            this.d = (j2 * j5) + (j8 >>> 32) + (j7 >>> 32) + ((((((j3 * j6) >>> 32) + (j8 & 4294967295L)) + (4294967295L & j7)) + 2147483648L) >>> 32);
        }

        public String toString() {
            return "[DiyFp f:" + this.d + ", e:" + this.b + "]";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.nd$c */
    /* loaded from: classes5.dex */
    public static class c {
        static final b[] b = {new b(-1865951482774665761L, -1087, -308), new b(-6093090917745768758L, -1060, -300), new b(-38366372719436721L, -1034, -292), new b(-4731433901725329908L, -1007, -284), new b(-8228041688891786180L, -980, -276), new b(-3219690930897053053L, -954, -268), new b(-7101705404292871755L, -927, -260), new b(-1541319077368263733L, -901, -252), new b(-5851220927660403859L, -874, -244), new b(-9062348037703676329L, -847, -236), new b(-4462904269766699465L, -821, -228), new b(-8027971522334779313L, -794, -220), new b(-2921563150702462265L, -768, -212), new b(-6879582898840692748L, -741, -204), new b(-1210330751515841307L, -715, -196), new b(-5604615407819967858L, -688, -188), new b(-8878612607581929669L, -661, -180), new b(-4189117143640191558L, -635, -172), new b(-7823984217374209642L, -608, -164), new b(-2617598379430861436L, -582, -156), new b(-6653111496142234890L, -555, -148), new b(-872862063775190746L, -529, -140), new b(-5353181642124984136L, -502, -132), new b(-8691279853972075893L, -475, -124), new b(-3909969587797413805L, -449, -116), new b(-7616003081050118571L, -422, -108), new b(-2307682335666372931L, -396, -100), new b(-6422206049907525489L, -369, -92), new b(-528786136287117932L, -343, -84), new b(-5096825099203863601L, -316, -76), new b(-8500279345513818773L, -289, -68), new b(-3625356651333078602L, -263, -60), new b(-7403949918844649556L, -236, -52), new b(-1991698500497491194L, -210, -44), new b(-6186779746782440749L, -183, -36), new b(-177973607073265138L, -157, -28), new b(-4835449396872013077L, -130, -20), new b(-8305539271883716404L, -103, -12), new b(-3335171328526686932L, -77, -4), new b(-7187745005283311616L, -50, 4), new b(-1669528073709551616L, -24, 12), new b(-5946744073709551616L, 3, 20), new b(-9133518327554766460L, 30, 28), new b(-4568956265895094861L, 56, 36), new b(-8106986416796705680L, 83, 44), new b(-3039304518611664792L, 109, 52), new b(-6967307053960650171L, 136, 60), new b(-1341049929119499481L, 162, 68), new b(-5702008784649933400L, 189, 76), new b(-8951176327949752869L, 216, 84), new b(-4297245513042813542L, 242, 92), new b(-7904546130479028392L, 269, 100), new b(-2737644984756826646L, 295, 108), new b(-6742553186979055798L, 322, 116), new b(-1006140569036166267L, 348, 124), new b(-5452481866653427593L, 375, 132), new b(-8765264286586255934L, 402, 140), new b(-4020214983419339459L, 428, 148), new b(-7698142301602209613L, 455, 156), new b(-2430079312244744221L, 481, 164), new b(-6513398903789220827L, 508, 172), new b(-664674077828931748L, 534, 180), new b(-5198069505264599346L, 561, 188), new b(-8575712306248138270L, 588, 196), new b(-3737760522056206171L, 614, 204), new b(-7487697328667536417L, 641, 212), new b(-2116491865831296966L, 667, 220), new b(-6279758049420528746L, 694, 228), new b(-316522074587315140L, 720, 236), new b(-4938676049251384304L, 747, 244), new b(-8382449121214030822L, 774, 252), new b(-3449775934753242068L, 800, 260), new b(-7273132090830278359L, 827, 268), new b(-1796764746270372707L, 853, 276), new b(-6041542782089432023L, 880, 284), new b(-9204148869281624187L, 907, 292), new b(-4674203974643163859L, 933, 300), new b(-8185402070463610993L, 960, 308), new b(-3156152948152813503L, 986, 316), new b(-7054365918152680535L, 1013, 324), new b(-1470777745987373095L, 1039, 332), new b(-5798663540173640085L, 1066, 340)};

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: o.nd$c$b */
        /* loaded from: classes5.dex */
        public static class b {
            final short a;
            final long b;
            final short d;

            b(long j, short s, short s2) {
                this.b = j;
                this.d = s;
                this.a = s2;
            }
        }

        static int c(int i, int i2, a aVar) {
            b bVar = b[((((int) Math.ceil(((i2 - i) + 63) * 0.30102999566398114d)) + 307) / 8) + 1];
            aVar.d = bVar.b;
            aVar.b = bVar.d;
            return bVar.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.nd$d */
    /* loaded from: classes5.dex */
    public static class d {
        private static boolean d(long j) {
            return (j & 9218868437227405312L) == 0;
        }

        static void b(long j, a aVar) {
            aVar.d = b(j);
            aVar.b = e(j);
        }

        static void c(long j, a aVar) {
            long b = b(j);
            int e = e(j);
            while ((4503599627370496L & b) == 0) {
                b <<= 1;
                e--;
            }
            aVar.d = b << 11;
            aVar.b = e - 11;
        }

        static int e(long j) {
            if (d(j)) {
                return -1074;
            }
            return ((int) (((j & 9218868437227405312L) >>> 52) & 4294967295L)) - 1075;
        }

        static long b(long j) {
            long j2 = 4503599627370495L & j;
            return !d(j) ? j2 + 4503599627370496L : j2;
        }

        static void a(a aVar, long j, a aVar2, a aVar3) {
            int i;
            b(j, aVar);
            long j2 = aVar.d;
            boolean z = j2 == 4503599627370496L;
            aVar3.d = (j2 << 1) + 1;
            aVar3.b = aVar.b - 1;
            aVar3.d();
            if (z && (i = aVar.b) != -1074) {
                aVar2.d = (aVar.d << 2) - 1;
                aVar2.b = i - 2;
            } else {
                aVar2.d = (aVar.d << 1) - 1;
                aVar2.b = aVar.b - 1;
            }
            long j3 = aVar2.d;
            int i2 = aVar2.b;
            int i3 = aVar3.b;
            aVar2.d = j3 << (i2 - i3);
            aVar2.b = i3;
        }
    }

    /* renamed from: o.nd$b */
    /* loaded from: classes5.dex */
    static class b {
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0040, code lost:
            if (10 <= r4) goto L10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0045, code lost:
            if (1 <= r4) goto L4;
         */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0014  */
        /* JADX WARN: Removed duplicated region for block: B:13:0x001c  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x002a  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0030  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0036  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x003c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        static long a(int r4, int r5) {
            /*
                r0 = 1
                r1 = 0
                switch(r5) {
                    case 0: goto L48;
                    case 1: goto L45;
                    case 2: goto L45;
                    case 3: goto L45;
                    case 4: goto L3e;
                    case 5: goto L3e;
                    case 6: goto L3e;
                    case 7: goto L38;
                    case 8: goto L38;
                    case 9: goto L38;
                    case 10: goto L32;
                    case 11: goto L32;
                    case 12: goto L32;
                    case 13: goto L32;
                    case 14: goto L2c;
                    case 15: goto L2c;
                    case 16: goto L2c;
                    case 17: goto L25;
                    case 18: goto L25;
                    case 19: goto L25;
                    case 20: goto L1e;
                    case 21: goto L1e;
                    case 22: goto L1e;
                    case 23: goto L1e;
                    case 24: goto L17;
                    case 25: goto L17;
                    case 26: goto L17;
                    case 27: goto Lf;
                    case 28: goto Lf;
                    case 29: goto Lf;
                    case 30: goto L7;
                    case 31: goto L7;
                    case 32: goto L7;
                    default: goto L5;
                }
            L5:
                r0 = r1
                goto L4b
            L7:
                r5 = 1000000000(0x3b9aca00, float:0.0047237873)
                if (r5 > r4) goto Lf
                r0 = 9
                goto L42
            Lf:
                r5 = 100000000(0x5f5e100, float:2.3122341E-35)
                if (r5 > r4) goto L17
                r0 = 8
                goto L42
            L17:
                r5 = 10000000(0x989680, float:1.4012985E-38)
                if (r5 > r4) goto L1e
                r0 = 7
                goto L42
            L1e:
                r5 = 1000000(0xf4240, float:1.401298E-39)
                if (r5 > r4) goto L25
                r0 = 6
                goto L42
            L25:
                r5 = 100000(0x186a0, float:1.4013E-40)
                if (r5 > r4) goto L2c
                r0 = 5
                goto L42
            L2c:
                r5 = 10000(0x2710, float:1.4013E-41)
                if (r5 > r4) goto L32
                r0 = 4
                goto L42
            L32:
                r5 = 1000(0x3e8, float:1.401E-42)
                if (r5 > r4) goto L38
                r0 = 3
                goto L42
            L38:
                r5 = 100
                if (r5 > r4) goto L3e
                r0 = 2
                goto L42
            L3e:
                r5 = 10
                if (r5 > r4) goto L45
            L42:
                r1 = r0
                r0 = r5
                goto L4b
            L45:
                if (r0 > r4) goto L48
                goto L4b
            L48:
                r4 = -1
                r0 = r1
                r1 = r4
            L4b:
                long r4 = (long) r0
                r0 = 32
                long r4 = r4 << r0
                long r0 = (long) r1
                r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
                long r0 = r0 & r2
                long r4 = r4 | r0
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: o.AbstractC9334nd.b.a(int, int):long");
        }

        b() {
        }

        static boolean b(e eVar, long j, long j2, long j3, long j4, long j5) {
            long j6 = j - j5;
            long j7 = j + j5;
            long j8 = j3;
            while (j8 < j6 && j2 - j8 >= j4) {
                long j9 = j8 + j4;
                if (j9 >= j6 && j6 - j8 < j9 - j6) {
                    break;
                }
                eVar.b();
                j8 = j9;
            }
            if (j8 < j7 && j2 - j8 >= j4) {
                long j10 = j8 + j4;
                if (j10 < j7 || j7 - j8 > j10 - j7) {
                    return false;
                }
            }
            return 2 * j5 <= j8 && j8 <= j2 - (4 * j5);
        }

        static boolean a(e eVar, int i) {
            a aVar = eVar.j;
            a aVar2 = eVar.f13884o;
            a aVar3 = eVar.f;
            a aVar4 = eVar.l;
            aVar4.d = aVar.d - 1;
            aVar4.b = aVar.b;
            a aVar5 = eVar.m;
            aVar5.d = aVar3.d + 1;
            aVar5.b = aVar3.b;
            a aVar6 = eVar.k;
            aVar6.d = aVar5.d;
            aVar6.b = aVar5.b;
            aVar6.a(aVar4);
            a aVar7 = eVar.g;
            int i2 = aVar2.b;
            int i3 = -i2;
            long j = 1 << i3;
            aVar7.d = j;
            aVar7.b = i2;
            long j2 = aVar5.d;
            int i4 = (int) ((j2 >>> i3) & 4294967295L);
            long j3 = (j - 1) & j2;
            long a = a(i4, 64 - i3);
            int i5 = (int) ((a >>> 32) & 4294967295L);
            int i6 = ((int) (a & 4294967295L)) + 1;
            while (i6 > 0) {
                eVar.b((byte) ((i4 / i5) + 48));
                i4 %= i5;
                i6--;
                long j4 = (i4 << (-aVar7.b)) + j3;
                if (j4 >= aVar6.d) {
                    i5 /= 10;
                } else {
                    eVar.i = (eVar.e - i) + i6;
                    a aVar8 = eVar.h;
                    aVar8.d = aVar5.d;
                    aVar8.b = aVar5.b;
                    aVar8.a(aVar2);
                    return b(eVar, aVar8.d, aVar6.d, j4, i5 << (-aVar7.b), 1L);
                }
            }
            long j5 = 1;
            while (true) {
                long j6 = j3 * 5;
                long j7 = j5 * 5;
                aVar6.d *= 5;
                aVar6.b++;
                aVar7.d >>>= 1;
                int i7 = aVar7.b + 1;
                aVar7.b = i7;
                eVar.b((byte) (((int) ((j6 >>> (-i7)) & 4294967295L)) + 48));
                j3 = j6 & (aVar7.d - 1);
                i6--;
                if (j3 < aVar6.d) {
                    eVar.i = (eVar.e - i) + i6;
                    a aVar9 = eVar.h;
                    aVar9.d = aVar5.d;
                    aVar9.b = aVar5.b;
                    aVar9.a(aVar2);
                    return b(eVar, aVar9.d * j7, aVar6.d, j3, aVar7.d, j7);
                }
                j5 = j7;
            }
        }
    }

    public static boolean a(double d2, e eVar) {
        long doubleToLongBits;
        int i;
        eVar.e();
        if (d2 < 0.0d) {
            eVar.b((byte) 45);
            doubleToLongBits = Double.doubleToLongBits(-d2);
            i = 1;
        } else {
            doubleToLongBits = Double.doubleToLongBits(d2);
            i = 0;
        }
        if (b.a(eVar, eVar.b(doubleToLongBits))) {
            eVar.b(i);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.nd$e */
    /* loaded from: classes2.dex */
    public static class e {
        static final byte[] c = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57};
        private int i;
        private final a r = new a();
        private final a t = new a();
        private final a d = new a();
        private final a a = new a();
        private final a n = new a();

        /* renamed from: o  reason: collision with root package name */
        private final a f13884o = new a();
        private final a j = new a();
        private final a f = new a();
        private final a l = new a();
        private final a m = new a();
        private final a k = new a();
        private final a g = new a();
        private final a h = new a();
        private final byte[] b = new byte[27];
        private int e = 0;

        void e() {
            this.e = 0;
        }

        int b(long j) {
            d.c(j, this.t);
            this.d.b();
            this.a.b();
            d.a(this.r, j, this.d, this.a);
            this.n.b();
            int c2 = c.c(this.t.b + 64, -60, this.n);
            a aVar = this.f13884o;
            a aVar2 = this.t;
            aVar.d = aVar2.d;
            aVar.b = aVar2.b;
            aVar.b(this.n);
            a aVar3 = this.j;
            a aVar4 = this.d;
            aVar3.d = aVar4.d;
            aVar3.b = aVar4.b;
            aVar3.b(this.n);
            a aVar5 = this.f;
            a aVar6 = this.a;
            aVar5.d = aVar6.d;
            aVar5.b = aVar6.b;
            aVar5.b(this.n);
            return c2;
        }

        void b(byte b) {
            byte[] bArr = this.b;
            int i = this.e;
            this.e = i + 1;
            bArr[i] = b;
        }

        void b() {
            byte[] bArr;
            int i;
            this.b[this.e - 1] = (byte) (bArr[i] - 1);
        }

        public String toString() {
            return "[chars:" + new String(this.b, 0, this.e) + ", point:" + this.i + "]";
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public int c(byte[] bArr, int i) {
            int i2 = 0;
            while (true) {
                int i3 = this.e;
                if (i2 >= i3) {
                    return i3;
                }
                bArr[i2 + i] = this.b[i2];
                i2++;
            }
        }

        public void b(int i) {
            int i2 = this.i - i;
            if (i2 < -5 || i2 > 21) {
                d(i, i2);
            } else {
                e(i, i2);
            }
        }

        private void e(int i, int i2) {
            int i3 = this.i;
            int i4 = this.e;
            if (i3 < i4) {
                if (i2 <= 0) {
                    int i5 = 2 - i2;
                    for (int i6 = i4 + i; i6 >= i; i6--) {
                        byte[] bArr = this.b;
                        bArr[i6 + i5] = bArr[i6];
                    }
                    byte[] bArr2 = this.b;
                    bArr2[i] = 48;
                    bArr2[i + 1] = 46;
                    if (i2 < 0) {
                        int i7 = i + 2;
                        for (int i8 = i7; i8 < i7 - i2; i8++) {
                            this.b[i8] = 48;
                        }
                    }
                    this.e += i5;
                    return;
                }
                while (true) {
                    int i9 = this.i;
                    if (i4 >= i9) {
                        byte[] bArr3 = this.b;
                        bArr3[i4 + 1] = bArr3[i4];
                        i4--;
                    } else {
                        this.b[i9] = 46;
                        this.e++;
                        return;
                    }
                }
            } else if (i3 <= i4) {
                byte[] bArr4 = this.b;
                bArr4[i4] = 46;
                bArr4[i4 + 1] = 48;
                this.e = i4 + 2;
            } else {
                while (true) {
                    int i10 = this.i;
                    if (i4 < i10) {
                        this.b[i4] = 48;
                        i4++;
                    } else {
                        int i11 = this.e;
                        int i12 = i11 + (i10 - i11);
                        byte[] bArr5 = this.b;
                        bArr5[i12] = 46;
                        bArr5[i12 + 1] = 48;
                        this.e = i12 + 2;
                        return;
                    }
                }
            }
        }

        private void d(int i, int i2) {
            byte b;
            int i3 = this.e;
            if (i3 - i > 1) {
                int i4 = i + 1;
                byte[] bArr = this.b;
                System.arraycopy(bArr, i4, bArr, i + 2, i3 - i4);
                this.b[i4] = 46;
                this.e++;
            }
            byte[] bArr2 = this.b;
            int i5 = this.e;
            int i6 = i5 + 1;
            this.e = i6;
            bArr2[i5] = 69;
            int i7 = i2 - 1;
            if (i7 < 0) {
                i7 = -i7;
                b = 45;
            } else {
                b = 43;
            }
            int i8 = i5 + 2;
            this.e = i8;
            bArr2[i6] = b;
            if (i7 > 99) {
                i8 = i5 + 4;
            } else if (i7 > 9) {
                i8 = i5 + 3;
            }
            this.e = i8 + 1;
            while (true) {
                this.b[i8] = c[i7 % 10];
                i7 /= 10;
                if (i7 == 0) {
                    return;
                }
                i8--;
            }
        }
    }
}
