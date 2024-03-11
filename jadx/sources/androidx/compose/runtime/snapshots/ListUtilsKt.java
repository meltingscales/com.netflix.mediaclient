package androidx.compose.runtime.snapshots;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import o.drM;

/* loaded from: classes.dex */
public final class ListUtilsKt {
    public static final <T> Set<T> fastToSet(List<? extends T> list) {
        HashSet hashSet = new HashSet(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            hashSet.add(list.get(i));
        }
        return hashSet;
    }

    public static /* synthetic */ String fastJoinToString$default(List list, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, drM drm, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        String str = (i2 & 2) != 0 ? "" : charSequence2;
        String str2 = (i2 & 4) == 0 ? charSequence3 : "";
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence5 = charSequence4;
        if ((i2 & 32) != 0) {
            drm = null;
        }
        return fastJoinToString(list, charSequence, str, str2, i3, charSequence5, drm);
    }

    public static final <T> String fastJoinToString(List<? extends T> list, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, drM<? super T, ? extends CharSequence> drm) {
        return ((StringBuilder) fastJoinTo(list, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, drm)).toString();
    }

    private static final <T, A extends Appendable> A fastJoinTo(List<? extends T> list, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, drM<? super T, ? extends CharSequence> drm) {
        a.append(charSequence2);
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            T t = list.get(i3);
            i2++;
            if (i2 > 1) {
                a.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            appendElement(a, t, drm);
        }
        if (i >= 0 && i2 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    private static final <T> void appendElement(Appendable appendable, T t, drM<? super T, ? extends CharSequence> drm) {
        if (drm != null) {
            appendable.append(drm.invoke(t));
        } else if (t == null || (t instanceof CharSequence)) {
            appendable.append((CharSequence) t);
        } else if (t instanceof Character) {
            appendable.append(((Character) t).charValue());
        } else {
            appendable.append(String.valueOf(t));
        }
    }
}
