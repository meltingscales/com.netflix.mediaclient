package o;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.netflix.mediaclient.ui.mylist.impl.tab.MyListTabItems;

/* renamed from: o.coo  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7047coo {
    public static final Intent b(Intent intent, MyListTabItems myListTabItems) {
        C8632dsu.c((Object) intent, "");
        intent.putExtra("my_list_tab_items", myListTabItems);
        return intent;
    }

    public static final Bundle b(Bundle bundle, MyListTabItems myListTabItems) {
        C8632dsu.c((Object) bundle, "");
        bundle.putParcelable("my_list_tab_items", myListTabItems);
        return bundle;
    }

    public static final MyListTabItems e(Intent intent) {
        Parcelable parcelable;
        Object parcelableExtra;
        C8632dsu.c((Object) intent, "");
        if (Build.VERSION.SDK_INT >= 33) {
            parcelableExtra = intent.getParcelableExtra("my_list_tab_items", MyListTabItems.class);
            parcelable = (Parcelable) parcelableExtra;
        } else {
            Parcelable parcelableExtra2 = intent.getParcelableExtra("my_list_tab_items");
            if (!(parcelableExtra2 instanceof MyListTabItems)) {
                parcelableExtra2 = null;
            }
            parcelable = (MyListTabItems) parcelableExtra2;
        }
        return (MyListTabItems) parcelable;
    }

    public static final MyListTabItems c(Bundle bundle) {
        Parcelable parcelable;
        Object parcelable2;
        C8632dsu.c((Object) bundle, "");
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable2 = bundle.getParcelable("my_list_tab_items", MyListTabItems.class);
            parcelable = (Parcelable) parcelable2;
        } else {
            Parcelable parcelable3 = bundle.getParcelable("my_list_tab_items");
            if (!(parcelable3 instanceof MyListTabItems)) {
                parcelable3 = null;
            }
            parcelable = (MyListTabItems) parcelable3;
        }
        return (MyListTabItems) parcelable;
    }
}
