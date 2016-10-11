package gilde.lc.com.glidedemo;

import android.app.Activity;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;

import com.bumptech.glide.Glide;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {

    private Activity mActivity;
    private GridView mGridView;
    private String[] urls = {
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1475051922635.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1470476252285.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1470476292663.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1470476324974.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1470476366628.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1470476458681.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1470476498808.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1474366185720.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1470476536497.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1470476554129.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1470476607544.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1470476790143.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1474366185793.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1470476824234.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1470476841145.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1470476926775.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1470476943120.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1470476963201.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1470476998929.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1470477016848.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1470722394879.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1470477037122.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1470477068458.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1470477083647.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1470477102742.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1470477125274.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1470477140892.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1470477161533.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1470722471376.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1470477191400.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1470477205817.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1470477241034.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1470477278643.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1470477293007.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1474366185334.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1470477672107.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1470477702520.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1474366185588.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1474366185699.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1474366185487.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1474366184975.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1474366185466.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1470477902924.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1474366185476.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1474366185507.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1474366185426.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1474366185628.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1474366185061.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1474366185344.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1470478117619.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1470721997952.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1470478143654.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1470478166340.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1470478190246.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1470478209999.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1470478229377.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1470478253230.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1470478272609.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1470478413489.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1470478429598.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1470478459254.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1470478476520.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1470478496680.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1470478513968.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1474366185598.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1470478562869.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1474366185314.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1470478679721.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1474366185835.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1474366185384.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1474366185557.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1474366185497.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1474366185537.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1470479415210.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1474366185253.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1474366185517.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1470721838520.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1470479472781.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1474366185547.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1474366184998.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1470479509220.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1470479534236.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1474366185354.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1474366185648.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1474366185846.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1474366185364.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1474366185618.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1474366185689.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1470479844710.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1474366185050.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1470479879175.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1474366185741.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1474366185193.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1474366185395.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1474366185182.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1470481178514.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1474366185092.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1474366185638.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1474366185142.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1474366185223.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1474366184873.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1474366184884.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1474366185263.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1474366185608.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1474366185294.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1474366185132.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1470480103337.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1470480129804.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1474366185762.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1470480188635.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1474366185213.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1474366185773.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1474366185415.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1474366184894.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1474366185082.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1474366185405.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1474366185040.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1474366185752.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1470480636287.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1474366184955.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1474366184945.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1470713045588.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1470713063801.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1474366185813.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1474366184965.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1474366185304.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1474366185446.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1474366184925.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1470721932951.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1474366184935.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1470722023344.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1474366185030.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1474366185783.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1474366185102.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1474366185112.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1470722845837.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1470722124285.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1470721823057.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1470722232617.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1470721947074.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1474366185019.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1474366185436.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1470721878407.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1470721970208.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1474366184988.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1470722540782.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1470722068944.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1470722526168.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1474366185233.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1474366185284.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1474366185162.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1474366185273.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1474366185710.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1474366185009.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1474366185679.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1470722905945.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1474366185658.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1470722679809.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1474366185668.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1470722248193.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1474366185824.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1470722449788.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1474366185567.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1470722049038.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1470722890721.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1470722294099.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1474366185803.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1470722379026.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1470722625920.jpg",
            "http://192.168.1.251:88/TkMall/FTP_DownLoad/advpic/1474366185577.jpg"

    };
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mActivity = this;
        mGridView = (GridView) findViewById(R.id.listView);
        mGridView.setAdapter(new MyAdapter());
    }




    public class MyAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return urls.length;
        }

        @Override
        public Object getItem(int i) {
            return urls[i];
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            ViewHolder holder;
            if (view == null) {
                holder = new ViewHolder();
                view = LayoutInflater.from(mActivity).inflate(R.layout.itemlayout, null);
                holder.imageView = (ImageView) view.findViewById(R.id.imageView);
                view.setTag(holder);
            } else {
                holder = (ViewHolder) view.getTag();
            }
            Glide.with(mActivity).load(urls[i]).placeholder(R.mipmap.ic_launcher).crossFade().into(holder.imageView);
            return view;
        }

        class ViewHolder {
            ImageView imageView;
        }
    }
}
