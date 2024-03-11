package o;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatSpinner;
import com.netflix.mediaclient.service.player.subtitles.text.CharacterEdgeTypeMapping;
import com.netflix.model.leafs.ArtworkColors;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.List;
import o.C5980cPn;
import o.C9834xU;

/* renamed from: o.cPm  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5979cPm extends AppCompatSpinner {
    private static int b = 1;
    private static int e = 0;
    private static byte e$ss2$93 = 24;
    private final List<e> a;
    private drM<? super String, dpR> d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5979cPm(Context context) {
        this(context, null, 0, 6, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5979cPm(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C8632dsu.c((Object) context, "");
    }

    public final List<e> b() {
        return this.a;
    }

    public final drM<String, dpR> c() {
        return this.d;
    }

    public final void setStyleChangedListener(drM<? super String, dpR> drm) {
        this.d = drm;
    }

    public /* synthetic */ C5979cPm(Context context, AttributeSet attributeSet, int i, int i2, C8627dsp c8627dsp) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? C9834xU.b.y : i);
    }

    /* renamed from: o.cPm$e */
    /* loaded from: classes4.dex */
    public static final class e {
        private final CharacterEdgeTypeMapping a;
        private final float b;
        private final float c;
        private final String d;
        private final float e;

        public final float b() {
            return this.c;
        }

        public final CharacterEdgeTypeMapping c() {
            return this.a;
        }

        public final float d() {
            return this.e;
        }

        public final float e() {
            return this.b;
        }

        public String toString() {
            return this.d;
        }

        public e(String str, CharacterEdgeTypeMapping characterEdgeTypeMapping, float f, float f2, float f3) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) characterEdgeTypeMapping, "");
            this.d = str;
            this.a = characterEdgeTypeMapping;
            this.e = f;
            this.b = f2;
            this.c = f3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5979cPm(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        List<e> j;
        C8632dsu.c((Object) context, "");
        String string = context.getString(C5980cPn.c.j);
        if (string.startsWith("'!#+")) {
            Object[] objArr = new Object[1];
            f(string.substring(4), objArr);
            string = ((String) objArr[0]).intern();
            int i2 = b + 25;
            e = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        }
        String str = string;
        C8632dsu.a(str, "");
        e eVar = new e(str, CharacterEdgeTypeMapping.NONE, 0.0f, 0.0f, 0.0f);
        String string2 = context.getString(C5980cPn.c.f);
        if (string2.startsWith("'!#+")) {
            Object[] objArr2 = new Object[1];
            f(string2.substring(4), objArr2);
            string2 = ((String) objArr2[0]).intern();
            int i5 = 2 % 2;
        }
        String str2 = string2;
        C8632dsu.a(str2, "");
        e eVar2 = new e(str2, CharacterEdgeTypeMapping.RAISED, 4.0f, 1.0f, 3.0f);
        String string3 = context.getString(C5980cPn.c.e);
        if (string3.startsWith("'!#+")) {
            int i6 = e + 55;
            b = i6 % 128;
            int i7 = i6 % 2;
            Object[] objArr3 = new Object[1];
            f(string3.substring(4), objArr3);
            string3 = ((String) objArr3[0]).intern();
        }
        String str3 = string3;
        C8632dsu.a(str3, "");
        e eVar3 = new e(str3, CharacterEdgeTypeMapping.DEPRESSED, 4.0f, -1.0f, -3.0f);
        String string4 = context.getString(C5980cPn.c.i);
        if (string4.startsWith("'!#+")) {
            int i8 = e + 11;
            b = i8 % 128;
            if (i8 % 2 == 0) {
                Object[] objArr4 = new Object[1];
                f(string4.substring(4), objArr4);
                ((String) objArr4[0]).intern();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object[] objArr5 = new Object[1];
            f(string4.substring(4), objArr5);
            string4 = ((String) objArr5[0]).intern();
        }
        String str4 = string4;
        C8632dsu.a(str4, "");
        e eVar4 = new e(str4, CharacterEdgeTypeMapping.UNIFORM, 5.0f, 0.0f, 0.0f);
        String string5 = context.getString(C5980cPn.c.h);
        if (string5.startsWith("'!#+")) {
            Object[] objArr6 = new Object[1];
            f(string5.substring(4), objArr6);
            string5 = ((String) objArr6[0]).intern();
            int i9 = e + 45;
            b = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 2 % 2;
            }
        }
        String str5 = string5;
        C8632dsu.a(str5, "");
        j = C8569dql.j(eVar, eVar2, eVar3, eVar4, new e(str5, CharacterEdgeTypeMapping.DROP_SHADOW, 3.0f, 5.0f, 5.0f));
        this.a = j;
        setAdapter((SpinnerAdapter) new c(context, j));
        setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // from class: o.cPm.5
            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onNothingSelected(AdapterView<?> adapterView) {
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onItemSelected(AdapterView<?> adapterView, View view, int i11, long j2) {
                e eVar5 = C5979cPm.this.b().get(i11);
                drM<String, dpR> c2 = C5979cPm.this.c();
                if (c2 != null) {
                    String characterEdgeTypeMapping = eVar5.c().toString();
                    C8632dsu.a(characterEdgeTypeMapping, "");
                    c2.invoke(characterEdgeTypeMapping);
                }
            }
        });
    }

    /* renamed from: o.cPm$c */
    /* loaded from: classes6.dex */
    public static final class c extends ArrayAdapter<e> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context, List<e> list) {
            super(context, 17367049, list);
            C8632dsu.c((Object) context, "");
            C8632dsu.c((Object) list, "");
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            C8632dsu.c((Object) viewGroup, "");
            View view2 = super.getView(i, view, viewGroup);
            C8632dsu.a(view2, "");
            e(i, view2);
            return view2;
        }

        @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            C8632dsu.c((Object) viewGroup, "");
            View dropDownView = super.getDropDownView(i, view, viewGroup);
            C8632dsu.d(dropDownView);
            e(i, dropDownView);
            return dropDownView;
        }

        public final void e(int i, View view) {
            e eVar;
            C8632dsu.c((Object) view, "");
            TextView textView = view instanceof TextView ? (TextView) view : null;
            if (textView == null || (eVar = (e) getItem(i)) == null) {
                return;
            }
            textView.setShadowLayer(eVar.d(), eVar.e(), eVar.b(), ArtworkColors.DEFAULT_BACKGROUND_COLOR);
        }
    }

    public final void setSelectionFromStyle(String str) {
        int c2;
        Iterator<e> it = this.a.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (C8632dsu.c((Object) it.next().c().toString(), (Object) str)) {
                break;
            } else {
                i++;
            }
        }
        c2 = C8657dts.c(i, 0, this.a.size() - 1);
        setSelection(c2);
    }

    private static void f(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$93);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
