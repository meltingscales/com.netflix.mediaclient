package o;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class duB extends duC {

    /* loaded from: classes.dex */
    public static final class a implements Iterable<Character>, dsK {
        final /* synthetic */ CharSequence e;

        public a(CharSequence charSequence) {
            this.e = charSequence;
        }

        @Override // java.lang.Iterable
        public Iterator<Character> iterator() {
            return duD.k(this.e);
        }
    }

    public static Character d(CharSequence charSequence, int i) {
        int l;
        C8632dsu.c((Object) charSequence, "");
        if (i >= 0) {
            l = duD.l(charSequence);
            if (i <= l) {
                return Character.valueOf(charSequence.charAt(i));
            }
        }
        return null;
    }

    public static char t(CharSequence charSequence) {
        int l;
        C8632dsu.c((Object) charSequence, "");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        l = duD.l(charSequence);
        return charSequence.charAt(l);
    }

    public static char s(CharSequence charSequence) {
        C8632dsu.c((Object) charSequence, "");
        int length = charSequence.length();
        if (length != 0) {
            if (length == 1) {
                return charSequence.charAt(0);
            }
            throw new IllegalArgumentException("Char sequence has more than one element.");
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static String d(String str, int i) {
        int i2;
        C8632dsu.c((Object) str, "");
        if (i < 0) {
            throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
        }
        i2 = C8657dts.i(i, str.length());
        String substring = str.substring(i2);
        C8632dsu.a(substring, "");
        return substring;
    }

    public static String h(String str, int i) {
        int i2;
        C8632dsu.c((Object) str, "");
        if (i < 0) {
            throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
        }
        i2 = C8657dts.i(i, str.length());
        String substring = str.substring(0, i2);
        C8632dsu.a(substring, "");
        return substring;
    }

    public static Iterable<Character> p(CharSequence charSequence) {
        List i;
        C8632dsu.c((Object) charSequence, "");
        if ((charSequence instanceof String) && charSequence.length() == 0) {
            i = C8569dql.i();
            return i;
        }
        return new a(charSequence);
    }
}
