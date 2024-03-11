package o;

import com.netflix.mediaclient.android.widget.NetflixImageView;
import java.lang.reflect.Method;
import java.util.Map;

/* renamed from: o.sW  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C9588sW {
    public static final byte[] $$a;
    public static final int $$b;
    private static int $10 = 0;
    private static int $11 = 1;
    private static long a$c15$929;
    private static int c$c17$929;
    private static byte[] d$c18$929;
    private static int e$c16$929;
    public static final Map<Integer, Object> q;
    private static Object u;
    private static byte[] v;
    private static byte[] w;
    private static final Map<String, Object> x;
    private static Object y;

    private static String $$c(short s, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6 = 2 % 2;
        int i7 = $10 + 117;
        int i8 = i7 % 128;
        $11 = i8;
        int i9 = i7 % 2;
        int i10 = ((s | 41) << 1) - (s ^ 41);
        byte[] bArr = $$a;
        int i11 = ((i8 | 3) << 1) - (i8 ^ 3);
        int i12 = i11 % 128;
        $10 = i12;
        if (i11 % 2 != 0) {
            i3 = 757 >> i;
            i4 = 93 / i2;
            i5 = 1;
        } else {
            int i13 = -i;
            i3 = ((i13 & 757) << 1) + (i13 ^ 757);
            i4 = 35 - (~(-i2));
            i5 = 0;
        }
        int i14 = (i12 ^ 101) + ((i12 & 101) << 1);
        $11 = i14 % 128;
        int i15 = i14 % 2;
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i16 = ((i12 | 111) << 1) - (i12 ^ 111);
            int i17 = i16 % 128;
            $11 = i17;
            if (i16 % 2 == 0) {
                int i18 = 63 / 0;
            }
            int i19 = i17 + 115;
            $10 = i19 % 128;
            int i20 = i19 % 2;
            int i21 = i3;
            i3 = ((i3 & 1) << 1) + (i3 ^ 1);
            int i22 = ((i21 | i10) << 1) - (i21 ^ i10);
            i10 = ((i22 | (-3)) << 1) - (i22 ^ (-3));
        }
        while (true) {
            int i23 = ((i5 | 1) << 1) - (i5 ^ 1);
            bArr2[i5] = (byte) i10;
            if (i23 == i4) {
                String str = new String(bArr2, 0);
                int i24 = $11;
                int i25 = ((i24 | 59) << 1) - (i24 ^ 59);
                $10 = i25 % 128;
                int i26 = i25 % 2;
                return str;
            }
            byte b = bArr[i3];
            int i27 = $11;
            int i28 = (i27 & 17) + (i27 | 17);
            $10 = i28 % 128;
            int i29 = i28 % 2;
            i5 = i23;
            i3 = ((i3 & 1) << 1) + (i3 ^ 1);
            int i30 = ((i10 | b) << 1) - (i10 ^ b);
            i10 = ((i30 | (-3)) << 1) - (i30 ^ (-3));
        }
    }

    public static int a(Object obj) {
        Object obj2;
        byte b;
        int i;
        int i2 = 2 % 2;
        int i3 = $11;
        int i4 = ((i3 | 43) << 1) - (i3 ^ 43);
        int i5 = i4 % 128;
        $10 = i5;
        if (i4 % 2 != 0) {
            obj2 = u;
            int i6 = 71 / 0;
        } else {
            obj2 = u;
        }
        try {
            Object[] objArr = {obj};
            byte[] bArr = $$a;
            int i7 = i5 + 109;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                b = bArr[3533];
                i = 1462;
            } else {
                b = (byte) (bArr[179] - 1);
                i = 592;
            }
            String $$c = $$c(b, (short) i, bArr[404]);
            Object obj3 = y;
            int i8 = $10 + 75;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            Class<?> cls = Class.forName($$c, true, (ClassLoader) obj3);
            byte b2 = (byte) (-bArr[142]);
            short s = (short) 210;
            int i10 = $11 + 39;
            $10 = i10 % 128;
            String $$c2 = i10 % 2 != 0 ? $$c(b2, s, (byte) (bArr[25] >>> 1)) : $$c(b2, s, (byte) (bArr[25] - 1));
            Class<?>[] clsArr = new Class[1];
            clsArr[0] = Object.class;
            Object invoke = cls.getMethod($$c2, clsArr).invoke(obj2, objArr);
            int i11 = $10;
            int i12 = (i11 ^ 11) + ((i11 & 11) << 1);
            $11 = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 52 / 0;
                return ((Integer) invoke).intValue();
            }
            return ((Integer) invoke).intValue();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static Object a(int i, char c, int i2) {
        Object[] objArr;
        byte b;
        byte b2;
        short s;
        String $$c;
        Class<?>[] clsArr;
        int i3 = 2 % 2;
        int i4 = $10;
        int i5 = (i4 & 25) + (i4 | 25);
        int i6 = i5 % 128;
        $11 = i6;
        int i7 = i5 % 2;
        Object obj = u;
        int i8 = i6 + 37;
        $10 = i8 % 128;
        try {
            if (i8 % 2 != 0) {
                objArr = new Object[5];
                objArr[5] = Integer.valueOf(i2);
            } else {
                objArr = new Object[3];
                objArr[2] = Integer.valueOf(i2);
            }
            objArr[1] = Character.valueOf(c);
            objArr[0] = Integer.valueOf(i);
            byte[] bArr = $$a;
            int i9 = $11 + NetflixImageView.DEFAULT_LAYER_GRAVITY;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            Class<?> cls = Class.forName($$c((byte) (bArr[179] - 1), (short) 592, bArr[404]), true, (ClassLoader) y);
            int i11 = $11 + 55;
            int i12 = i11 % 128;
            $10 = i12;
            if (i11 % 2 != 0) {
                b2 = bArr[125];
                s = (short) 22868;
                b = bArr[101];
            } else {
                byte b3 = bArr[71];
                short s2 = (short) 210;
                b = bArr[25];
                b2 = b3;
                s = s2;
            }
            int i13 = (i12 & 1) + (i12 | 1);
            $11 = i13 % 128;
            if (i13 % 2 == 0) {
                $$c = $$c(b2, s, (byte) (b + 1));
                clsArr = new Class[5];
                clsArr[1] = Integer.TYPE;
            } else {
                $$c = $$c(b2, s, (byte) (b - 1));
                Class<?>[] clsArr2 = new Class[3];
                clsArr2[0] = Integer.TYPE;
                clsArr = clsArr2;
            }
            clsArr[1] = Character.TYPE;
            clsArr[2] = Integer.TYPE;
            Object invoke = cls.getMethod($$c, clsArr).invoke(obj, objArr);
            int i14 = $10;
            int i15 = (i14 ^ 121) + ((i14 & 121) << 1);
            $11 = i15 % 128;
            int i16 = i15 % 2;
            return invoke;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static int b(int i) {
        Class<?> cls;
        byte b;
        int i2;
        int i3 = 2 % 2;
        Object obj = u;
        int i4 = $10 + 93;
        int i5 = i4 % 128;
        $11 = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 43;
        $10 = i7 % 128;
        int i8 = i7 % 2;
        try {
            Object[] objArr = {Integer.valueOf(i)};
            byte[] bArr = $$a;
            int i9 = $11 + 99;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            String $$c = $$c((byte) ((-2) - (bArr[179] ^ (-1))), (short) 592, bArr[404]);
            ClassLoader classLoader = (ClassLoader) y;
            int i11 = $10;
            int i12 = (i11 & 3) + (i11 | 3);
            $11 = i12 % 128;
            if (i12 % 2 == 0) {
                cls = Class.forName($$c, true, classLoader);
                b = (byte) (bArr[23] - 1);
                i2 = 31248;
            } else {
                cls = Class.forName($$c, true, classLoader);
                b = (byte) ((-2) - (bArr[71] ^ (-1)));
                i2 = 220;
            }
            Method method = cls.getMethod($$c(b, (short) i2, (byte) (bArr[25] - 1)), Integer.TYPE);
            int i13 = $11 + 101;
            $10 = i13 % 128;
            int i14 = i13 % 2;
            int intValue = ((Integer) method.invoke(obj, objArr)).intValue();
            int i15 = $10;
            int i16 = ((i15 | 57) << 1) - (i15 ^ 57);
            $11 = i16 % 128;
            if (i16 % 2 != 0) {
                return intValue;
            }
            throw null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private C9588sW() {
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:536:0x13ac
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    static {
        /*
            Method dump skipped, instructions count: 6350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C9588sW.<clinit>():void");
    }
}
