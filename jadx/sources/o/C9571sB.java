package o;

import com.netflix.mediaclient.android.widget.NetflixImageView;
import java.lang.reflect.Method;
import java.util.Map;

/* renamed from: o.sB  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C9571sB {
    public static final byte[] $$a;
    public static final int $$b;
    private static int $10 = 0;
    private static int $11 = 1;
    private static long a$c15$929;
    private static int c$c17$929;
    private static byte[] d$c18$929;
    private static int e$c16$929;
    public static final Map<Integer, Object> s;
    private static Object u;
    private static byte[] v;
    private static Object w;
    private static final Map<String, Object> x;
    private static byte[] y;

    private static String $$c(int i, short s2, byte b) {
        int i2;
        byte[] bArr;
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = $10 + 89;
        int i7 = i6 % 128;
        $11 = i7;
        if (i6 % 2 == 0) {
            i2 = 71 / b;
            bArr = $$a;
            i3 = i + 80;
            i4 = 1;
        } else {
            i2 = 119 - b;
            bArr = $$a;
            i3 = i + 4;
            i4 = 0;
        }
        int i8 = -s2;
        int i9 = ((i8 | 36) << 1) - (i8 ^ 36);
        byte[] bArr2 = new byte[i9];
        int i10 = i9 - 1;
        if (bArr == null) {
            int i11 = (i7 & 87) + (i7 | 87);
            $10 = i11 % 128;
            if (i11 % 2 != 0) {
                throw null;
            }
            int i12 = i4;
            int i13 = i2;
            int i14 = (i10 ^ i13) + ((i10 & i13) << 1);
            i2 = ((i14 | (-3)) << 1) - (i14 ^ (-3));
            int i15 = $10;
            int i16 = (i15 ^ 61) + ((i15 & 61) << 1);
            $11 = i16 % 128;
            int i17 = i16 % 2;
            i4 = i12;
        }
        while (true) {
            i3++;
            bArr2[i4] = (byte) i2;
            int i18 = ((i4 | 1) << 1) - (i4 ^ 1);
            int i19 = $11;
            int i20 = (i19 ^ 17) + ((i19 & 17) << 1);
            $10 = i20 % 128;
            if (i20 % 2 != 0) {
                int i21 = 0 / 0;
                if (i4 == i10) {
                    break;
                }
                int i22 = bArr[i3];
                int i23 = (i2 ^ i22) + ((i2 & i22) << 1);
                i2 = ((i23 | (-3)) << 1) - (i23 ^ (-3));
                int i24 = $10;
                int i25 = (i24 ^ 61) + ((i24 & 61) << 1);
                $11 = i25 % 128;
                int i26 = i25 % 2;
                i4 = i18;
            } else {
                if (i4 == i10) {
                    break;
                }
                int i222 = bArr[i3];
                int i232 = (i2 ^ i222) + ((i2 & i222) << 1);
                i2 = ((i232 | (-3)) << 1) - (i232 ^ (-3));
                int i242 = $10;
                int i252 = (i242 ^ 61) + ((i242 & 61) << 1);
                $11 = i252 % 128;
                int i262 = i252 % 2;
                i4 = i18;
            }
        }
        String str = new String(bArr2, 0);
        int i27 = $10 + 49;
        $11 = i27 % 128;
        if (i27 % 2 == 0) {
            int i28 = 87 / 0;
        }
        return str;
    }

    public static Object a(int i, int i2, char c) {
        int i3;
        Class<?> cls;
        int i4;
        byte b;
        char c2;
        int i5 = 2 % 2;
        int i6 = $10;
        int i7 = (i6 ^ 1) + ((i6 & 1) << 1);
        $11 = i7 % 128;
        int i8 = i7 % 2;
        Object obj = u;
        try {
            Object[] objArr = new Object[3];
            objArr[2] = Character.valueOf(c);
            Integer valueOf = Integer.valueOf(i2);
            int i9 = $11;
            int i10 = (i9 ^ 69) + ((i9 & 69) << 1);
            $10 = i10 % 128;
            if (i10 % 2 != 0) {
                objArr[0] = valueOf;
                objArr[0] = Integer.valueOf(i);
                i3 = 8117;
            } else {
                objArr[1] = valueOf;
                objArr[0] = Integer.valueOf(i);
                i3 = 195;
            }
            short s2 = (short) i3;
            byte[] bArr = $$a;
            byte b2 = bArr[395];
            byte b3 = bArr[22];
            int i11 = $11 + 79;
            $10 = i11 % 128;
            if (i11 % 2 != 0) {
                cls = Class.forName($$c(s2, b2, b3), false, (ClassLoader) w);
                i4 = 1020;
            } else {
                cls = Class.forName($$c(s2, b2, b3), true, (ClassLoader) w);
                i4 = 532;
            }
            int i12 = $11;
            int i13 = (i12 ^ 93) + ((i12 & 93) << 1);
            $10 = i13 % 128;
            short s3 = (short) i4;
            if (i13 % 2 != 0) {
                b = bArr[83];
                c2 = 31728;
            } else {
                b = (byte) (bArr[25] - 1);
                c2 = 496;
            }
            Method method = cls.getMethod($$c(s3, b, bArr[c2]), Integer.TYPE, Integer.TYPE, Character.TYPE);
            int i14 = $11;
            int i15 = ((i14 | 37) << 1) - (i14 ^ 37);
            $10 = i15 % 128;
            if (i15 % 2 == 0) {
                return method.invoke(obj, objArr);
            }
            method.invoke(obj, objArr);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static int b(int i) {
        String $$c;
        ClassLoader classLoader;
        Class<?>[] clsArr;
        String str;
        int i2 = 2 % 2;
        Object obj = u;
        int i3 = $11 + 79;
        $10 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 4 % 2;
        }
        try {
            Object[] objArr = {Integer.valueOf(i)};
            int i5 = $10;
            int i6 = ((i5 | 65) << 1) - (i5 ^ 65);
            int i7 = i6 % 128;
            $11 = i7;
            int i8 = i6 % 2;
            short s2 = (short) 195;
            byte[] bArr = $$a;
            byte b = bArr[395];
            int i9 = ((i7 | 77) << 1) - (i7 ^ 77);
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                $$c = $$c(s2, b, bArr[22]);
                classLoader = (ClassLoader) w;
            } else {
                $$c = $$c(s2, b, bArr[22]);
                classLoader = (ClassLoader) w;
            }
            Class<?> cls = Class.forName($$c, true, classLoader);
            short s3 = (short) 546;
            byte b2 = bArr[25];
            byte b3 = (byte) ((b2 ^ (-1)) + (b2 << 1));
            int i10 = $11 + 25;
            $10 = i10 % 128;
            if (i10 % 2 != 0) {
                str = $$c(s3, b3, bArr[19655]);
                clsArr = new Class[0];
            } else {
                String $$c2 = $$c(s3, b3, bArr[174]);
                clsArr = new Class[1];
                str = $$c2;
            }
            clsArr[0] = Integer.TYPE;
            Object invoke = cls.getMethod(str, clsArr).invoke(obj, objArr);
            int i11 = $11;
            int i12 = (i11 & 33) + (i11 | 33);
            $10 = i12 % 128;
            int i13 = i12 % 2;
            return ((Integer) invoke).intValue();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static int e(Object obj) {
        Object obj2;
        byte b;
        byte b2;
        Class<?> cls;
        int i;
        Method method;
        int i2 = 2 % 2;
        int i3 = $11;
        int i4 = (i3 & 65) + (i3 | 65);
        $10 = i4 % 128;
        if (i4 % 2 != 0) {
            obj2 = u;
            int i5 = 40 / 0;
        } else {
            obj2 = u;
        }
        int i6 = i3 + NetflixImageView.DEFAULT_LAYER_GRAVITY;
        int i7 = i6 % 128;
        $10 = i7;
        int i8 = i6 % 2;
        try {
            Object[] objArr = {obj};
            short s2 = (short) 195;
            byte[] bArr = $$a;
            int i9 = ((i7 | 81) << 1) - (i7 ^ 81);
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                b = bArr[12652];
                b2 = bArr[122];
            } else {
                b = bArr[395];
                b2 = bArr[22];
            }
            String $$c = $$c(s2, b, b2);
            int i10 = $11;
            int i11 = (i10 & 113) + (i10 | 113);
            $10 = i11 % 128;
            if (i11 % 2 != 0) {
                cls = Class.forName($$c, true, (ClassLoader) w);
                i = 16950;
            } else {
                cls = Class.forName($$c, true, (ClassLoader) w);
                i = 532;
            }
            short s3 = (short) i;
            byte b3 = bArr[25];
            String $$c2 = $$c(s3, (byte) ((b3 ^ (-1)) + (b3 << 1)), bArr[494]);
            int i12 = $11 + 71;
            $10 = i12 % 128;
            if (i12 % 2 != 0) {
                Class<?>[] clsArr = new Class[1];
                clsArr[1] = Object.class;
                method = cls.getMethod($$c2, clsArr);
            } else {
                method = cls.getMethod($$c2, Object.class);
            }
            int intValue = ((Integer) method.invoke(obj2, objArr)).intValue();
            int i13 = $10;
            int i14 = (i13 & 47) + (i13 | 47);
            $11 = i14 % 128;
            if (i14 % 2 != 0) {
                return intValue;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:619:0x13c2
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    static {
        /*
            Method dump skipped, instructions count: 6234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C9571sB.<clinit>():void");
    }

    private C9571sB() {
    }
}
