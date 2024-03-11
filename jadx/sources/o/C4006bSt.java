package o;

/* renamed from: o.bSt  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4006bSt {
    public static final C4006bSt b = new C4006bSt();
    private static final String[] c = {"https://assets.nflxext.com/us/android/51615/spotlightAssets/spotlight_asset_first.webp", "https://assets.nflxext.com/us/android/51615/spotlightAssets/spotlight_asset_second.webp", "https://assets.nflxext.com/us/android/51615/spotlightAssets/spotlight_asset_third.webp", "https://assets.nflxext.com/us/android/51615/spotlightAssets/spotlight_asset_fourth.webp", "https://assets.nflxext.com/us/android/51615/spotlightAssets/spotlight_asset_fifth.webp", "https://assets.nflxext.com/us/android/51615/spotlightAssets/spotlight_asset_sixth.webp"};

    private C4006bSt() {
    }

    public final String d(int i) {
        if (i < 0) {
            return "https://assets.nflxext.com/us/android/51615/spotlightAssets/spotlight_asset_first.webp";
        }
        if (i >= 0) {
            String[] strArr = c;
            if (i < strArr.length) {
                return strArr[i];
            }
        }
        return d(i - c.length);
    }
}
