package o;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_Mdx;
import com.netflix.mediaclient.util.ViewUtils;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import o.DialogC6583cfz;

/* renamed from: o.cfz  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class DialogC6583cfz extends AlertDialog {
    private b b;

    public void a(b bVar) {
        this.b = bVar;
    }

    private DialogC6583cfz(Context context) {
        super(context);
    }

    public void a(List<String> list) {
        this.b.c(list);
    }

    /* renamed from: o.cfz$e */
    /* loaded from: classes4.dex */
    public static class e extends AlertDialog.Builder {
        private static byte e$ss2$138 = 24;
        private static int i = 0;
        private static int j = 1;
        private final View a;
        private final Activity b;
        private final InterfaceC5131bsv c;
        private final ListView d;
        private final b e;
        private final TextView f;
        private DialogInterface.OnCancelListener h;

        @Override // androidx.appcompat.app.AlertDialog.Builder
        /* renamed from: e */
        public e setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
            this.h = onCancelListener;
            return this;
        }

        public e(Activity activity, InterfaceC5131bsv interfaceC5131bsv) {
            super(activity);
            this.b = activity;
            this.c = interfaceC5131bsv;
            LayoutInflater layoutInflater = activity.getLayoutInflater();
            View inflate = layoutInflater.inflate(com.netflix.mediaclient.ui.R.i.az, (ViewGroup) null);
            this.a = inflate;
            this.f = (TextView) inflate.findViewById(com.netflix.mediaclient.ui.R.g.dD);
            ListView listView = (ListView) inflate.findViewById(com.netflix.mediaclient.ui.R.g.dF);
            this.d = listView;
            b bVar = new b(layoutInflater);
            this.e = bVar;
            listView.setAdapter((ListAdapter) bVar);
            setCancelable(true);
        }

        @Override // androidx.appcompat.app.AlertDialog.Builder
        /* renamed from: c */
        public e setTitle(int i2) {
            int i3 = 2 % 2;
            TextView textView = this.f;
            Context context = textView.getContext();
            String string = context.getString(i2);
            if (string.startsWith("'!#+")) {
                int i4 = i + 13;
                j = i4 % 128;
                if (i4 % 2 == 0) {
                    Object[] objArr = new Object[1];
                    k(string.substring(4), objArr);
                    ((String) objArr[0]).intern();
                    boolean z = context.getText(i2) instanceof Spanned;
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Object[] objArr2 = new Object[1];
                k(string.substring(4), objArr2);
                string = ((String) objArr2[0]).intern();
                CharSequence text = context.getText(i2);
                if (text instanceof Spanned) {
                    SpannableString spannableString = new SpannableString(string);
                    TextUtils.copySpansFrom((SpannedString) text, 0, string.length(), Object.class, spannableString, 0);
                    string = spannableString;
                }
            }
            textView.setText(string);
            int i5 = i + 47;
            j = i5 % 128;
            int i6 = i5 % 2;
            return this;
        }

        public void e(List<String> list) {
            this.e.c(list);
        }

        public void a(int i2, String str) {
            this.e.e(i2, str);
        }

        public void d(final AdapterView.OnItemClickListener onItemClickListener) {
            this.d.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: o.cfz.e.1
                @Override // android.widget.AdapterView.OnItemClickListener
                public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
                    e.this.e.notifyDataSetChanged();
                    onItemClickListener.onItemClick(adapterView, view, i2, j2);
                }
            });
        }

        @Override // androidx.appcompat.app.AlertDialog.Builder
        public AlertDialog create() {
            DialogC6583cfz dialogC6583cfz = new DialogC6583cfz(this.b);
            dialogC6583cfz.setView(this.a);
            dialogC6583cfz.setCanceledOnTouchOutside(true);
            dialogC6583cfz.a(this.e);
            DialogInterface.OnCancelListener onCancelListener = this.h;
            if (onCancelListener != null) {
                dialogC6583cfz.setOnCancelListener(onCancelListener);
            }
            if (!Config_FastProperty_Mdx.shouldCastScanActivelyAlways()) {
                this.c.b();
                dialogC6583cfz.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: o.cfD
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        DialogC6583cfz.e.this.e(dialogInterface);
                    }
                });
            }
            return dialogC6583cfz;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void e(DialogInterface dialogInterface) {
            this.c.f();
        }

        private void k(String str, Object[] objArr) {
            byte[] decode = Base64.decode(str, 0);
            byte[] bArr = new byte[decode.length];
            for (int i2 = 0; i2 < decode.length; i2++) {
                bArr[i2] = (byte) (decode[(decode.length - i2) - 1] ^ e$ss2$138);
            }
            objArr[0] = new String(bArr, StandardCharsets.UTF_8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.cfz$b */
    /* loaded from: classes4.dex */
    public static class b extends BaseAdapter {
        private final LayoutInflater a;
        private List<String> c = new ArrayList();
        private String d;
        private int e;

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        public b(LayoutInflater layoutInflater) {
            this.a = layoutInflater;
        }

        public void c(List<String> list) {
            this.c = list;
            notifyDataSetChanged();
        }

        public void e(int i, String str) {
            this.e = i;
            this.d = str;
            notifyDataSetChanged();
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            c cVar;
            if (view == null) {
                view = this.a.inflate(com.netflix.mediaclient.ui.R.i.ay, (ViewGroup) null);
                cVar = new c((TextView) view.findViewById(com.netflix.mediaclient.ui.R.g.dA), (TextView) view.findViewById(com.netflix.mediaclient.ui.R.g.dx));
                view.setTag(cVar);
            } else {
                cVar = (c) view.getTag();
            }
            cVar.b.setText(getItem(i));
            boolean z = i == this.e;
            cVar.e.setText(z ? this.d : "");
            if (z) {
                cVar.e.setVisibility(C8168dfL.g(this.d) ? 8 : 0);
            } else {
                cVar.e.setVisibility(8);
            }
            if (z) {
                ViewUtils.a(cVar.b);
                ViewUtils.a(cVar.e);
            } else {
                ViewUtils.c(cVar.b);
                ViewUtils.c(cVar.e);
            }
            return view;
        }

        @Override // android.widget.Adapter
        /* renamed from: c */
        public String getItem(int i) {
            return this.c.get(i);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.c.size();
        }
    }

    /* renamed from: o.cfz$c */
    /* loaded from: classes4.dex */
    static class c {
        TextView b;
        TextView e;

        c(TextView textView, TextView textView2) {
            this.b = textView;
            this.e = textView2;
        }
    }
}
