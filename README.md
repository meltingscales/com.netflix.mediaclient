## Findings summary

### gitleaks

Nothing.

### apkurlgrep

Nothing.

### Snyk SAST

Waiting for scan results.

### jadx

Nothing.

## Commands

```
adb shell pm path com.netfix.mediaclient.gps

adb pull /data/app/~~c5iUqd7bYj_VsUfXC1d38A==/com.netfix.mediaclient.gps-bxjbOFDVVNfky_2ak0ryiA==/base.apk

mv base.apk com.netfix.mediaclient.gps.apk

~/go/bin/apkurlgrep -a com.netfix.mediaclient.gps.apk > apkurlgrep.txt

apktool d com.netfix.mediaclient.gps.apk

echo "Run jadx-gui, open the APK, and save to "./jadx/"

echo "Make sure to make a commit so gitleaks can work..."

gitleaks detect --report-path gitleaks.json```
