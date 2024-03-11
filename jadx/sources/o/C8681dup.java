package o;

import java.util.ArrayList;
import java.util.List;
import o.C8632dsu;

/* renamed from: o.dup  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8681dup extends C8683dur {
    public static /* synthetic */ String b(String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = "|";
        }
        return b(str, str2);
    }

    public static final String b(String str, String str2) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        return c(str, "", str2);
    }

    public static final String c(String str, String str2, String str3) {
        int i;
        String str4;
        int i2;
        String str5;
        String substring;
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) str3, "");
        if (!(!C8684dus.a((CharSequence) str3))) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.".toString());
        }
        List b = C8684dus.b((CharSequence) str);
        int length = str.length();
        int length2 = str2.length();
        int size = b.size();
        drM<String, String> e = e(str2);
        int a = C8570dqm.a(b);
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        for (Object obj : b) {
            if (i3 < 0) {
                C8570dqm.e();
            }
            String str6 = (String) obj;
            if ((i3 == 0 || i3 == a) && C8684dus.a((CharSequence) str6)) {
                i = i3;
                str4 = null;
            } else {
                int length3 = str6.length();
                int i4 = 0;
                while (true) {
                    if (i4 >= length3) {
                        i2 = -1;
                        break;
                    } else if (!C8666dua.a(str6.charAt(i4))) {
                        i2 = i4;
                        break;
                    } else {
                        i4++;
                    }
                }
                if (i2 == -1) {
                    str5 = str6;
                    i = i3;
                } else {
                    int i5 = i2;
                    i = i3;
                    if (C8684dus.c(str6, str3, i2, false, 4, (Object) null)) {
                        int length4 = str3.length();
                        C8632dsu.d((Object) str6);
                        int i6 = i5 + length4;
                        str5 = str6;
                        substring = str5.substring(i6);
                        C8632dsu.a(substring, "");
                        if (substring != null || (str4 = e.invoke(substring)) == null) {
                            str4 = str5;
                        }
                    } else {
                        str5 = str6;
                    }
                }
                substring = null;
                if (substring != null) {
                }
                str4 = str5;
            }
            if (str4 != null) {
                arrayList.add(str4);
            }
            i3 = i + 1;
        }
        String sb = ((StringBuilder) C8570dqm.d(arrayList, new StringBuilder(length + (length2 * size)), "\n", null, null, 0, null, null, 124, null)).toString();
        C8632dsu.a(sb, "");
        return sb;
    }

    public static String h(String str) {
        C8632dsu.c((Object) str, "");
        return a(str, "");
    }

    public static final String a(String str, String str2) {
        String invoke;
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        List b = C8684dus.b((CharSequence) str);
        ArrayList<String> arrayList = new ArrayList();
        for (Object obj : b) {
            if (!C8684dus.a((CharSequence) ((String) obj))) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C8570dqm.a((Iterable) arrayList, 10));
        for (String str3 : arrayList) {
            arrayList2.add(Integer.valueOf(b(str3)));
        }
        Integer num = (Integer) C8570dqm.m((Iterable) arrayList2);
        int i = 0;
        int intValue = num != null ? num.intValue() : 0;
        int length = str.length();
        int length2 = str2.length();
        int size = b.size();
        drM<String, String> e = e(str2);
        int a = C8570dqm.a(b);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : b) {
            if (i < 0) {
                C8570dqm.e();
            }
            String str4 = (String) obj2;
            if ((i == 0 || i == a) && C8684dus.a((CharSequence) str4)) {
                str4 = null;
            } else {
                String e2 = C8684dus.e(str4, intValue);
                if (e2 != null && (invoke = e.invoke(e2)) != null) {
                    str4 = invoke;
                }
            }
            if (str4 != null) {
                arrayList3.add(str4);
            }
            i++;
        }
        String sb = ((StringBuilder) C8570dqm.d(arrayList3, new StringBuilder(length + (length2 * size)), "\n", null, null, 0, null, null, 124, null)).toString();
        C8632dsu.a(sb, "");
        return sb;
    }

    private static final drM<String, String> e(final String str) {
        return str.length() == 0 ? new drM<String, String>() { // from class: kotlin.text.StringsKt__IndentKt$getIndentFunction$1
            @Override // o.drM
            /* renamed from: e */
            public final String invoke(String str2) {
                C8632dsu.c((Object) str2, "");
                return str2;
            }
        } : new drM<String, String>() { // from class: kotlin.text.StringsKt__IndentKt$getIndentFunction$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: c */
            public final String invoke(String str2) {
                C8632dsu.c((Object) str2, "");
                return str + str2;
            }
        };
    }

    private static final int b(String str) {
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (!C8666dua.a(str.charAt(i))) {
                break;
            } else {
                i++;
            }
        }
        return i == -1 ? str.length() : i;
    }
}
