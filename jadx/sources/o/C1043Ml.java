package o;

import com.netflix.mediaclient.android.widget.NetflixImageView;
import java.util.Map;

/* renamed from: o.Ml  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1043Ml {
    public static final byte[] $$a;
    public static final int $$b;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int b$c7$927;
    private static int d$c6$927;
    public static final Map<Integer, Object> p;
    private static byte[] u;
    private static final Map<String, Object> v;
    private static Object w;
    private static byte[] x;
    private static Object y;

    private static String $$c(int i, int i2, short s) {
        int i3;
        int i4;
        byte[] bArr;
        int i5;
        int i6;
        byte[] bArr2;
        int i7;
        int i8 = 2 % 2;
        int i9 = $10;
        int i10 = i9 + 59;
        $11 = i10 % 128;
        if (i10 % 2 == 0) {
            i3 = i + 19;
            i4 = (i2 & 53) + (i2 | 53);
            bArr = $$a;
            i5 = 1;
        } else {
            i3 = i + 4;
            i4 = i2 + 1;
            bArr = $$a;
            i5 = 0;
        }
        int i11 = (i9 ^ 39) + ((i9 & 39) << 1);
        int i12 = i11 % 128;
        $11 = i12;
        int i13 = -s;
        if (i11 % 2 == 0) {
            int i14 = -i13;
            i6 = ((i14 | 14) << 1) - (i14 ^ 14);
            bArr2 = new byte[i4];
            i7 = (i4 ^ 28) + ((i4 & 28) << 1);
        } else {
            i6 = (i13 & NetflixImageView.DEFAULT_LAYER_GRAVITY) + (i13 | NetflixImageView.DEFAULT_LAYER_GRAVITY);
            bArr2 = new byte[i4];
            i7 = (-2) - (~i4);
        }
        if (bArr == null) {
            int i15 = i12 + 19;
            $10 = i15 % 128;
            if (i15 % 2 != 0) {
                throw null;
            }
            int i16 = i7;
            int i17 = -(-(-i7));
            int i18 = (i6 & i17) + (i17 | i6);
            i6 = ((i18 & (-3)) << 1) + (i18 ^ (-3));
            i3++;
            i7 = i16;
        }
        while (true) {
            bArr2[i5] = (byte) i6;
            if (i5 == i7) {
                break;
            }
            int i19 = bArr[i3];
            int i20 = $11;
            int i21 = (i20 & 49) + (i20 | 49);
            $10 = i21 % 128;
            int i22 = i21 % 2;
            i5 = (i5 ^ (-60)) + ((i5 & (-60)) << 1) + 61;
            int i23 = i7;
            int i24 = -(-(-i19));
            int i25 = (i6 & i24) + (i24 | i6);
            i6 = ((i25 & (-3)) << 1) + (i25 ^ (-3));
            i3++;
            i7 = i23;
        }
        String str = new String(bArr2, 0);
        int i26 = $10;
        int i27 = (i26 ^ 15) + ((i26 & 15) << 1);
        $11 = i27 % 128;
        if (i27 % 2 == 0) {
            int i28 = 40 / 0;
        }
        return str;
    }

    public static int b(Object obj) {
        short s;
        byte b;
        byte b2;
        byte b3;
        byte b4;
        int i = 2 % 2;
        int i2 = $10;
        int i3 = i2 + 41;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        Object obj2 = w;
        int i5 = i2 + 19;
        $11 = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i2 + 1;
        int i8 = i7 % 128;
        $11 = i8;
        int i9 = i7 % 2;
        try {
            Object[] objArr = {obj};
            byte[] bArr = $$a;
            byte b5 = bArr[286];
            int i10 = i8 + 79;
            $10 = i10 % 128;
            if (i10 % 2 != 0) {
                s = b5;
                b = bArr[116];
                b2 = bArr[119];
            } else {
                s = b5;
                b = bArr[41];
                b2 = bArr[35];
            }
            Class<?> cls = Class.forName($$c(s, b, b2), true, (ClassLoader) y);
            short s2 = (short) 536;
            int i11 = $10;
            int i12 = (i11 ^ 19) + ((i11 & 19) << 1);
            $11 = i12 % 128;
            if (i12 % 2 == 0) {
                b3 = bArr[116];
                b4 = bArr[5509];
            } else {
                b3 = bArr[46];
                b4 = bArr[282];
            }
            Object invoke = cls.getMethod($$c(s2, b3, b4), Object.class).invoke(obj2, objArr);
            int i13 = $10 + 115;
            $11 = i13 % 128;
            int i14 = i13 % 2;
            return ((Integer) invoke).intValue();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static Object c(char c, int i, int i2) {
        Object[] objArr;
        byte[] bArr;
        char c2;
        short s;
        byte b;
        byte b2;
        int i3 = 2 % 2;
        int i4 = $10 + 63;
        int i5 = i4 % 128;
        $11 = i5;
        int i6 = i4 % 2;
        Object obj = w;
        int i7 = (i5 & 121) + (i5 | 121);
        $10 = i7 % 128;
        try {
            if (i7 % 2 != 0) {
                objArr = new Object[4];
                objArr[3] = Integer.valueOf(i2);
            } else {
                objArr = new Object[3];
                objArr[2] = Integer.valueOf(i2);
            }
            Integer valueOf = Integer.valueOf(i);
            int i8 = $10;
            int i9 = (i8 ^ 107) + ((i8 & 107) << 1);
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                objArr[0] = valueOf;
                objArr[1] = Character.valueOf(c);
                bArr = $$a;
                c2 = 11088;
            } else {
                objArr[1] = valueOf;
                objArr[0] = Character.valueOf(c);
                bArr = $$a;
                c2 = 286;
            }
            byte[] bArr2 = $$a;
            Class<?> cls = Class.forName($$c(bArr[c2], bArr2[41], bArr2[35]), true, (ClassLoader) y);
            int i10 = $10;
            int i11 = (i10 & 89) + (i10 | 89);
            int i12 = i11 % 128;
            $11 = i12;
            if (i11 % 2 == 0) {
                s = (short) 536;
                b = bArr2[111];
                b2 = bArr2[15227];
            } else {
                s = (short) 536;
                b = bArr2[46];
                b2 = bArr2[282];
            }
            byte b3 = b2;
            int i13 = (i12 & 31) + (i12 | 31);
            $10 = i13 % 128;
            int i14 = i13 % 2;
            String $$c = $$c(s, b, b3);
            Class<?>[] clsArr = new Class[3];
            clsArr[0] = Character.TYPE;
            Class<?> cls2 = Integer.TYPE;
            int i15 = $11;
            int i16 = (i15 & 107) + (i15 | 107);
            $10 = i16 % 128;
            int i17 = i16 % 2;
            clsArr[1] = cls2;
            clsArr[2] = Integer.TYPE;
            Object invoke = cls.getMethod($$c, clsArr).invoke(obj, objArr);
            int i18 = $11;
            int i19 = ((i18 | 73) << 1) - (i18 ^ 73);
            $10 = i19 % 128;
            int i20 = i19 % 2;
            return invoke;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static int d(int i) {
        String $$c;
        Class<?>[] clsArr;
        Class<?> cls;
        char c;
        Integer num;
        int i2 = 2 % 2;
        int i3 = $10 + 15;
        int i4 = i3 % 128;
        $11 = i4;
        int i5 = i3 % 2;
        Object obj = w;
        int i6 = (i4 & 107) + (i4 | 107);
        $10 = i6 % 128;
        try {
            Object[] objArr = i6 % 2 != 0 ? new Object[]{Integer.valueOf(i)} : new Object[]{Integer.valueOf(i)};
            byte[] bArr = $$a;
            short s = bArr[286];
            int i7 = $11;
            int i8 = (i7 & 89) + (i7 | 89);
            $10 = i8 % 128;
            int i9 = i8 % 2;
            Class<?> cls2 = Class.forName($$c(s, bArr[41], bArr[35]), true, (ClassLoader) y);
            short s2 = (short) 513;
            byte b = bArr[46];
            int i10 = $11;
            int i11 = (i10 ^ 39) + ((i10 & 39) << 1);
            $10 = i11 % 128;
            if (i11 % 2 != 0) {
                $$c = $$c(s2, b, bArr[494]);
                clsArr = new Class[1];
                cls = Integer.TYPE;
                c = 1;
            } else {
                $$c = $$c(s2, b, bArr[494]);
                clsArr = new Class[1];
                cls = Integer.TYPE;
                c = 0;
            }
            int i12 = $10;
            int i13 = (i12 & 11) + (i12 | 11);
            $11 = i13 % 128;
            if (i13 % 2 == 0) {
                clsArr[c] = cls;
                num = (Integer) cls2.getMethod($$c, clsArr).invoke(obj, objArr);
                int i14 = 36 / 0;
            } else {
                clsArr[c] = cls;
                num = (Integer) cls2.getMethod($$c, clsArr).invoke(obj, objArr);
            }
            int intValue = num.intValue();
            int i15 = $11;
            int i16 = (i15 ^ 123) + ((i15 & 123) << 1);
            $10 = i16 % 128;
            if (i16 % 2 == 0) {
                return intValue;
            }
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

    private C1043Ml() {
    }

    /* JADX WARN: Can't wrap try/catch for region: R(34:(35:16|17|18|(0)|20|(0)|22|23|(0)(0)|(0)(0)|(0)|33|34|(0)(0)|38|39|40|41|42|43|44|(0)(0)|47|(0)(0)|50|51|52|(0)(0)|55|(0)(0)|58|59|(1:60)|817|818)|860|(0)|20|(0)|22|23|(0)(0)|(0)(0)|(0)|33|34|(0)(0)|38|39|40|41|42|43|44|(0)(0)|47|(0)(0)|50|51|52|(0)(0)|55|(0)(0)|58|59|(1:60)|817|818) */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x009e, code lost:
        if (r2 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x03a6, code lost:
        r9 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:1014:0x130c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:1043:0x1840 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1053:0x15c6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1057:0x182c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x081c A[Catch: all -> 0x081e, TryCatch #116 {all -> 0x081e, blocks: (B:168:0x0544, B:170:0x054e, B:172:0x055e, B:174:0x0573, B:171:0x055b, B:173:0x0565, B:175:0x0580, B:226:0x0771, B:228:0x0778, B:229:0x0779, B:259:0x0816, B:261:0x081c, B:262:0x081d, B:177:0x0588, B:205:0x0671, B:209:0x068f, B:213:0x06c0, B:210:0x06a1, B:188:0x05dc, B:216:0x072a, B:197:0x0627), top: B:987:0x0544, inners: #77 }] */
    /* JADX WARN: Removed duplicated region for block: B:262:0x081d A[Catch: all -> 0x081e, TRY_LEAVE, TryCatch #116 {all -> 0x081e, blocks: (B:168:0x0544, B:170:0x054e, B:172:0x055e, B:174:0x0573, B:171:0x055b, B:173:0x0565, B:175:0x0580, B:226:0x0771, B:228:0x0778, B:229:0x0779, B:259:0x0816, B:261:0x081c, B:262:0x081d, B:177:0x0588, B:205:0x0671, B:209:0x068f, B:213:0x06c0, B:210:0x06a1, B:188:0x05dc, B:216:0x072a, B:197:0x0627), top: B:987:0x0544, inners: #77 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:552:0x10f4 A[Catch: all -> 0x10f6, TryCatch #94 {all -> 0x10f6, blocks: (B:611:0x1334, B:615:0x134c, B:620:0x1376, B:622:0x1386, B:623:0x1399, B:627:0x13a7, B:628:0x13ad, B:621:0x137c, B:616:0x1358, B:646:0x13f9, B:550:0x10ee, B:552:0x10f4, B:553:0x10f5, B:574:0x119a, B:576:0x11a0, B:577:0x11a1, B:589:0x1209, B:601:0x130c, B:608:0x132c, B:566:0x1161, B:568:0x1167, B:569:0x1168), top: B:955:0x1334 }] */
    /* JADX WARN: Removed duplicated region for block: B:553:0x10f5 A[Catch: all -> 0x10f6, TRY_LEAVE, TryCatch #94 {all -> 0x10f6, blocks: (B:611:0x1334, B:615:0x134c, B:620:0x1376, B:622:0x1386, B:623:0x1399, B:627:0x13a7, B:628:0x13ad, B:621:0x137c, B:616:0x1358, B:646:0x13f9, B:550:0x10ee, B:552:0x10f4, B:553:0x10f5, B:574:0x119a, B:576:0x11a0, B:577:0x11a1, B:589:0x1209, B:601:0x130c, B:608:0x132c, B:566:0x1161, B:568:0x1167, B:569:0x1168), top: B:955:0x1334 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0266 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:588:0x1207  */
    /* JADX WARN: Removed duplicated region for block: B:591:0x1221  */
    /* JADX WARN: Removed duplicated region for block: B:608:0x132c A[Catch: all -> 0x10f6, TRY_ENTER, TryCatch #94 {all -> 0x10f6, blocks: (B:611:0x1334, B:615:0x134c, B:620:0x1376, B:622:0x1386, B:623:0x1399, B:627:0x13a7, B:628:0x13ad, B:621:0x137c, B:616:0x1358, B:646:0x13f9, B:550:0x10ee, B:552:0x10f4, B:553:0x10f5, B:574:0x119a, B:576:0x11a0, B:577:0x11a1, B:589:0x1209, B:601:0x130c, B:608:0x132c, B:566:0x1161, B:568:0x1167, B:569:0x1168), top: B:955:0x1334 }] */
    /* JADX WARN: Removed duplicated region for block: B:631:0x13b3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0315 A[Catch: Exception -> 0x18f4, TryCatch #110 {Exception -> 0x18f4, blocks: (B:3:0x0046, B:5:0x005b, B:58:0x026b, B:67:0x02ba, B:71:0x0302, B:73:0x0325, B:75:0x0343, B:77:0x0351, B:86:0x038f, B:91:0x039a, B:95:0x03a3, B:104:0x03b3, B:840:0x1816, B:845:0x182f, B:847:0x1833, B:859:0x18b0, B:848:0x1840, B:843:0x181e, B:72:0x0315, B:41:0x01c7, B:33:0x0167, B:35:0x0187, B:849:0x1853, B:850:0x1882, B:59:0x027b, B:48:0x0223, B:52:0x023e, B:54:0x0255, B:53:0x024a, B:43:0x01d3, B:45:0x01ea, B:47:0x0213, B:37:0x019a), top: B:999:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:793:0x176e A[Catch: all -> 0x1786, TryCatch #86 {all -> 0x1786, blocks: (B:676:0x1577, B:681:0x1590, B:683:0x1597, B:684:0x1598, B:689:0x15a2, B:691:0x15a9, B:692:0x15aa, B:702:0x15c6, B:706:0x15eb, B:716:0x162f, B:718:0x1635, B:719:0x1636, B:728:0x164d, B:748:0x16de, B:750:0x16e5, B:751:0x16e6, B:763:0x16ff, B:765:0x170c, B:766:0x170d, B:791:0x1765, B:793:0x176e, B:794:0x176f, B:808:0x17a0, B:810:0x17ab, B:811:0x17ac, B:817:0x17c6, B:819:0x17cc, B:820:0x17cd, B:825:0x17d7, B:827:0x17e8, B:828:0x17e9, B:322:0x0a63, B:305:0x096c, B:668:0x14d4, B:729:0x1682, B:730:0x16b1, B:596:0x123d, B:560:0x1100, B:505:0x0fe2, B:503:0x0fa2), top: B:1040:0x1577 }] */
    /* JADX WARN: Removed duplicated region for block: B:794:0x176f A[Catch: all -> 0x1786, TryCatch #86 {all -> 0x1786, blocks: (B:676:0x1577, B:681:0x1590, B:683:0x1597, B:684:0x1598, B:689:0x15a2, B:691:0x15a9, B:692:0x15aa, B:702:0x15c6, B:706:0x15eb, B:716:0x162f, B:718:0x1635, B:719:0x1636, B:728:0x164d, B:748:0x16de, B:750:0x16e5, B:751:0x16e6, B:763:0x16ff, B:765:0x170c, B:766:0x170d, B:791:0x1765, B:793:0x176e, B:794:0x176f, B:808:0x17a0, B:810:0x17ab, B:811:0x17ac, B:817:0x17c6, B:819:0x17cc, B:820:0x17cd, B:825:0x17d7, B:827:0x17e8, B:828:0x17e9, B:322:0x0a63, B:305:0x096c, B:668:0x14d4, B:729:0x1682, B:730:0x16b1, B:596:0x123d, B:560:0x1100, B:505:0x0fe2, B:503:0x0fa2), top: B:1040:0x1577 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:819:0x17cc A[Catch: all -> 0x1786, TryCatch #86 {all -> 0x1786, blocks: (B:676:0x1577, B:681:0x1590, B:683:0x1597, B:684:0x1598, B:689:0x15a2, B:691:0x15a9, B:692:0x15aa, B:702:0x15c6, B:706:0x15eb, B:716:0x162f, B:718:0x1635, B:719:0x1636, B:728:0x164d, B:748:0x16de, B:750:0x16e5, B:751:0x16e6, B:763:0x16ff, B:765:0x170c, B:766:0x170d, B:791:0x1765, B:793:0x176e, B:794:0x176f, B:808:0x17a0, B:810:0x17ab, B:811:0x17ac, B:817:0x17c6, B:819:0x17cc, B:820:0x17cd, B:825:0x17d7, B:827:0x17e8, B:828:0x17e9, B:322:0x0a63, B:305:0x096c, B:668:0x14d4, B:729:0x1682, B:730:0x16b1, B:596:0x123d, B:560:0x1100, B:505:0x0fe2, B:503:0x0fa2), top: B:1040:0x1577 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:820:0x17cd A[Catch: all -> 0x1786, TryCatch #86 {all -> 0x1786, blocks: (B:676:0x1577, B:681:0x1590, B:683:0x1597, B:684:0x1598, B:689:0x15a2, B:691:0x15a9, B:692:0x15aa, B:702:0x15c6, B:706:0x15eb, B:716:0x162f, B:718:0x1635, B:719:0x1636, B:728:0x164d, B:748:0x16de, B:750:0x16e5, B:751:0x16e6, B:763:0x16ff, B:765:0x170c, B:766:0x170d, B:791:0x1765, B:793:0x176e, B:794:0x176f, B:808:0x17a0, B:810:0x17ab, B:811:0x17ac, B:817:0x17c6, B:819:0x17cc, B:820:0x17cd, B:825:0x17d7, B:827:0x17e8, B:828:0x17e9, B:322:0x0a63, B:305:0x096c, B:668:0x14d4, B:729:0x1682, B:730:0x16b1, B:596:0x123d, B:560:0x1100, B:505:0x0fe2, B:503:0x0fa2), top: B:1040:0x1577 }] */
    /* JADX WARN: Removed duplicated region for block: B:840:0x1816 A[Catch: Exception -> 0x18f4, TRY_ENTER, TryCatch #110 {Exception -> 0x18f4, blocks: (B:3:0x0046, B:5:0x005b, B:58:0x026b, B:67:0x02ba, B:71:0x0302, B:73:0x0325, B:75:0x0343, B:77:0x0351, B:86:0x038f, B:91:0x039a, B:95:0x03a3, B:104:0x03b3, B:840:0x1816, B:845:0x182f, B:847:0x1833, B:859:0x18b0, B:848:0x1840, B:843:0x181e, B:72:0x0315, B:41:0x01c7, B:33:0x0167, B:35:0x0187, B:849:0x1853, B:850:0x1882, B:59:0x027b, B:48:0x0223, B:52:0x023e, B:54:0x0255, B:53:0x024a, B:43:0x01d3, B:45:0x01ea, B:47:0x0213, B:37:0x019a), top: B:999:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:847:0x1833 A[Catch: Exception -> 0x18f4, TryCatch #110 {Exception -> 0x18f4, blocks: (B:3:0x0046, B:5:0x005b, B:58:0x026b, B:67:0x02ba, B:71:0x0302, B:73:0x0325, B:75:0x0343, B:77:0x0351, B:86:0x038f, B:91:0x039a, B:95:0x03a3, B:104:0x03b3, B:840:0x1816, B:845:0x182f, B:847:0x1833, B:859:0x18b0, B:848:0x1840, B:843:0x181e, B:72:0x0315, B:41:0x01c7, B:33:0x0167, B:35:0x0187, B:849:0x1853, B:850:0x1882, B:59:0x027b, B:48:0x0223, B:52:0x023e, B:54:0x0255, B:53:0x024a, B:43:0x01d3, B:45:0x01ea, B:47:0x0213, B:37:0x019a), top: B:999:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:857:0x188d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:919:0x147a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:951:0x03b7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:955:0x1334 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:958:0x0103 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:972:0x012a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        /*
            Method dump skipped, instructions count: 6396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1043Ml.<clinit>():void");
    }
}
