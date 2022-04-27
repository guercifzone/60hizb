package com.guercif.a60hizb.koraa;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.MediaController;
import android.widget.VideoView;

import com.guercif.a60hizb.R;

import java.util.ArrayList;

public class Omar_kzabriActivity extends AppCompatActivity {
    private VideoView videoView;
    private ListView listView;
    private MediaPlayer mediaPlayer;
    ArrayList<String> videolist;
    ArrayAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.desplay_data);
        listView = findViewById(R.id.list_view);
        videoView = findViewById(R.id.list_video);
        releasemedia();
        videolist= new ArrayList<>();
        videolist.add("الحزب  الأول");
        videolist.add("الحزب الثاني");
        videolist.add("الحزب الثالث");
        videolist.add("الحزب الرابع");
        videolist.add("الحزب الخامس");
        videolist.add("الحزب السادس");
        videolist.add("الحزب السابع");
        videolist.add("الحزب الثامن");
        videolist.add("الحزب التاسع");
        videolist.add("الحزب العاشر");
        videolist.add("الحزب الحادي عشر");
        videolist.add("الحزب الثاني عشر");
        videolist.add("الحزب الثالث عشر");
        videolist.add("الحزب الرابع عشر");
        videolist.add("الحزب الخامس عشر");
        videolist.add("الحزب السادس عشر");
        videolist.add("الحزب السابع عشر");
        videolist.add("الحزب الثامن عشر");
        videolist.add("الحزب التاسع عشر");
        videolist.add("الحزب العشرون");
        videolist.add("الحزب الحادي وعشرون");
        videolist.add("الحزب الثاني وعشرون");
        videolist.add("الحزب الثالث وعشرون");
        videolist.add("الحزب الرابع وعشرون");
        videolist.add("الحزب الخامس وعشرون");
        videolist.add("الحزب السادس وعشرون");
        videolist.add("الحزب السابع وعشرون");
        videolist.add("الحزب الثامن وعشرون");
        videolist.add("الحزب التاسع وعشرون");
        videolist.add("الحزب الثلاثون");
        videolist.add("الحزب الحادي وثلاثون");
        videolist.add("الحزب الثاني والثلاثون");
        videolist.add("الحزب الثالث والثلاثون");
        videolist.add("الحزب الرابع والثلاثون");
        videolist.add("الحزب الخامس والثلاثون");
        videolist.add("الحزب السادس والثلاثون");
        videolist.add("الحزب السابع والثلاثون");
        videolist.add("الحزب الثامن والثلاثون");
        videolist.add("الحزب التاسع والثلاثون");
        videolist.add("الحزب الاربعين");
        videolist.add("الحزب الحادي واربعون");
        videolist.add("الحزب  الثاني واربعون");
        videolist.add("الحزب الثالث واربعون");
        videolist.add("الحزب الرابع واربعون");
        videolist.add("الحزب الخامس واربعون");
        videolist.add("الحزب السادس واربعون");
        videolist.add("الحزب السابع واربعون");
        videolist.add("الحزب الثامن واربعون");
        videolist.add("الحزب  التاسع واربعون");
        videolist.add("الحزب الخمسين");
        videolist.add("الحزب الحادي وخمسون");
        videolist.add("الحزب الثاني وخمسون");
        videolist.add("الحزب الثالث وخمسون");
        videolist.add("الحزب الرابع وخمسون");
        videolist.add("الحزب الخامس وخمسون");
        videolist.add("الحزب السادس وخمسون");
        videolist.add("الحزب السابع وخمسون");
        videolist.add("الحزب الثامن وخمسون");
        videolist.add("الحزب التاسع وخمسون");
        videolist.add("الحزب الستون");

        adapter =  new ArrayAdapter(this, android.R.layout.simple_list_item_1,videolist);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long ID) {
                switch (position){
                    case 0:
                        videoView.setVideoPath("https://video.frba4-2.fna.fbcdn.net/v/t42.9040-2/10000000_550135335555514_6896254220672958464_n.mp4?_nc_cat=102&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeF37gHbOpdLKUQhquQxChnDfMDSbGeto2V8wNJsZ62jZUBmF5pCaJiFMKZyugocH_yVg6jxHmEd1ZPyV-uJBPBr&_nc_ohc=KwbucEi73sQAX-H06nF&_nc_rml=0&_nc_ht=video.frba4-2.fna&oh=00_AT8RGRZjPRLCb1I8UcYmmUNkeej084d6vurX17CPAts9GQ&oe=62685A26");
                        videoView.start();
                        break;
                    case 1:
                        videoView.setVideoPath("https://video.frba4-1.fna.fbcdn.net/v/t42.1790-2/10000000_901667943918405_5934958546600734974_n.mp4?_nc_cat=108&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeE3qckaUDLbEff7n4e3sV6U8svRF_yvy4zyy9EX_K_LjNqNxe6tTq8VYBgrEzcw1TVkMsng3UeTjO0FRW5_lOdP&_nc_ohc=NXwAB7PbrPwAX8rI_y8&_nc_rml=0&_nc_ht=video.frba4-1.fna&oh=00_AT9FP6fVx0VAjYcJyLod8PrrK0ATUxa9UPHiackchEGjYA&oe=6268582B");
                        videoView.start();
                        break;
                    case 2:
                        videoView.setVideoPath("https://video.frba4-1.fna.fbcdn.net/v/t39.43673-2/10000000_499927691813813_895110883287116298_n.mp4?_nc_cat=111&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6Im11dGVkdjJfc3ZlX3NkIn0%3D&_nc_eui2=AeHiNy8SEj5INZ7Mh7_AeRGejSXgvy5KdaONJeC_Lkp1o76VBjKSYps2tE4SyoSjsOY0-NCS6NpB_T5BmOE1SPJb&_nc_ohc=MSza24LGatIAX-NIWUG&tn=DlNxON8970ttwinE&_nc_rml=0&_nc_ht=video.frba4-1.fna&oh=00_AT8GeLADm5Nz0aXVbQIqp3tYsW0g74famNxKADVoZwNA8A&oe=626E1446");
                        videoView.start();
                        break;
                    case 3:
                        videoView.setVideoPath("https://video.frba4-2.fna.fbcdn.net/v/t42.1790-2/10000000_127640069614629_4112424420954220589_n.mp4?_nc_cat=103&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeFYlkWfSlISJ-d86XdLlsWKnbgT4a0WcfGduBPhrRZx8RSfI_1LyG2ylbTOVuGzyrLh5xyx9NVnRmSluvSDSa4Y&_nc_ohc=RCydGrMvrYEAX8VdGZr&_nc_rml=0&_nc_ht=video.frba4-2.fna&oh=00_AT9r1W5WxSNbk_l7YwMcz9nsLmBGDySIs3I91g0qOByiUg&oe=626852ED");
                        videoView.start();
                        break;
                    case 4:
                        videoView.setVideoPath("https://video.frba4-2.fna.fbcdn.net/v/t42.9040-2/10000000_328319034894729_1911760886803771961_n.mp4?_nc_cat=104&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeHygctGaAjDOzRhsI8qrEh8UzE0TlbM7UtTMTROVsztS1Bx6fdMlvbMrUuS7rF3g9aWUzLsIuSffhvfB4GgS_h3&_nc_ohc=xfs3_hDCn2EAX-qKA1r&tn=DlNxON8970ttwinE&_nc_rml=0&_nc_ht=video.frba4-2.fna&oh=00_AT896by9gbiAblZbDuw0DEd1KXEzsGskvu7z74yDW8f3iQ&oe=626859C8");
                        videoView.start();
                        break;
                    case 5:
                        videoView.setVideoPath("https://video.frba4-2.fna.fbcdn.net/v/t42.1790-2/10000000_2962312100654781_8566165260921480156_n.mp4?_nc_cat=107&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeE8Gm1ne1qA7SQqnvbTpClRUxihIcBrxnxTGKEhwGvGfGqug47esspUKEzzGpAfwdRL-g5223TdUsdcJ4bvziio&_nc_ohc=9R4c7ugN1yQAX87zdZO&_nc_rml=0&_nc_ht=video.frba4-2.fna&oh=00_AT8XT9uZWPJYYuGHreYBKegjMK6_KQtKYk2JXPU6gGtVdQ&oe=6268543F");
                        videoView.start();
                        break;
                    case 6:
                        videoView.setVideoPath("https://video.frba4-1.fna.fbcdn.net/v/t42.1790-2/10000000_1810976732401397_6749378669815908592_n.mp4?_nc_cat=109&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeES3TP6a_kxRF623G9hx4JpDlKl5mA6eVUOUqXmYDp5VV_Jz8tPnT-_fZQOVUQrY5Y2zHoGCNFMLfjH2F-mE4Rq&_nc_ohc=EkQ1R8NVKrQAX8vba1D&_nc_rml=0&_nc_ht=video.frba4-1.fna&oh=00_AT8W1ddPJcqfyrhetBrdgHvhsrqikbpdgldITm6wYHFSfg&oe=62685B71");
                        videoView.start();
                        break;
                    case 7:
                        videoView.setVideoPath("https://video.frba4-2.fna.fbcdn.net/v/t42.1790-2/10000000_123389752641864_7933352256150906664_n.mp4?_nc_cat=104&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeGU_0ksshrhs2o8W0-p_BBueu9Rq0oww7F671GrSjDDsUwBPOfYrA8-SEh91y-xhk-RaZVc471sJVdFRplqLPO-&_nc_ohc=l7K4Nazch9QAX9Jomz6&_nc_rml=0&_nc_ht=video.frba4-2.fna&oh=00_AT8xVX1j1ezICI9fYSOHpcWpeuP2zptXz-OGSI0bkDN15g&oe=62685DE4");
                        videoView.start();
                        break;
                    case 8:
                        videoView.setVideoPath("https://video.frba4-2.fna.fbcdn.net/v/t42.1790-2/10000000_2893640824206666_4916396264916023213_n.mp4?_nc_cat=106&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeH5McT-7WxDV3KSUFRtIm6btbGuDZasQqW1sa4NlqxCpQt04Nh_Djp6zV6JH21slq35ZmnaXpu8mUOd8kKzjhfs&_nc_ohc=ZrdchpNWtwIAX_Ze3FC&tn=DlNxON8970ttwinE&_nc_rml=0&_nc_ht=video.frba4-2.fna&oh=00_AT-Mc_YvcUvIJfM-uORIC5eG6YuaVLg8ecl4Ff20PT7nNw&oe=626854D9");
                        videoView.start();
                        break;
                    case 9:
                        videoView.setVideoPath("https://scontent.frba4-1.fna.fbcdn.net/v/t42.1790-2/10000000_406837613906583_6004883809234552124_n.mp4?_nc_cat=108&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeEUBusgDE8cRMuFBKRDTxG7sqVnFfrj_I-ypWcV-uP8j4IEkUNcLTeJKVsl6x1--Ouq7HcPQuG4Vg92s-hs1rLk&_nc_ohc=zqWL4mCbtrcAX_Ls0wC&tn=DlNxON8970ttwinE&_nc_rml=0&_nc_ht=scontent.frba4-1.fna&oh=00_AT91ixjg7MRfgzVX1WWCmZr3k99htwNBEELr-bgBT_8Npw&oe=626853D4");
                        videoView.start();
                        break;
                    case 10:
                        videoView.setVideoPath("https://scontent.frba4-2.fna.fbcdn.net/v/t42.1790-2/10000000_364257121595439_5616134017846450212_n.mp4?_nc_cat=102&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeEHMNrG-f-0Nra-8Zx-XpZxjkY9NUF7OKSORj01QXs4pMuwSwUYthIGCcRAclmWKQ8uPDsGLkKOnrY6CSRMeIB1&_nc_ohc=fTVBooGeiIEAX-Ok97z&_nc_rml=0&_nc_ht=scontent.frba4-2.fna&oh=00_AT-IqAX-hihvkhKmvHgQRlTvX5-EED8DEIaKLCsoevEnZQ&oe=62685A17");
                        videoView.start();
                        break;
                    case 11:
                        videoView.setVideoPath("https://scontent.frba4-1.fna.fbcdn.net/v/t42.1790-2/10000000_746843052635688_3257220066790233077_n.mp4?_nc_cat=111&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeGr5sr85mJfQDBqXmsQTXgmex6PmCKqj5V7Ho-YIqqPlUx32NlALHlfJOVtFp4shk-B6WsZ-z1w7ASjFT_CMECY&_nc_ohc=iEjmXKWdtKQAX_aMm0S&_nc_rml=0&_nc_ht=scontent.frba4-1.fna&oh=00_AT_gVkViTpQ1UAazIuGJfTRRLnILSw7qYmlp_NGMjMmunA&oe=62685C61");
                        videoView.start();
                        break;
                    case 12:
                        videoView.setVideoPath("https://scontent.frba4-2.fna.fbcdn.net/v/t42.1790-2/10000000_439441137337770_8578735738886796932_n.mp4?_nc_cat=107&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeH__SHmjXB6ehfqf1-NxOUMQ4bh40HoU-hDhuHjQehT6PUuXLfBZTC9Qd1DGj6REjvSGMQ901gVZCRoICscnHXF&_nc_ohc=UMhJgaOpFuEAX80dH0Z&tn=DlNxON8970ttwinE&_nc_rml=0&_nc_ht=scontent.frba4-2.fna&oh=00_AT8BXgYStG23Qpo7_cAGF8Gwij0uHeirf8pTAqJYOWTgFQ&oe=62685131");
                        videoView.start();
                        break;
                    case 13:
                        videoView.setVideoPath("https://scontent.frba4-2.fna.fbcdn.net/v/t42.1790-2/10000000_439441137337770_8578735738886796932_n.mp4?_nc_cat=107&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeH__SHmjXB6ehfqf1-NxOUMQ4bh40HoU-hDhuHjQehT6PUuXLfBZTC9Qd1DGj6REjvSGMQ901gVZCRoICscnHXF&_nc_ohc=UMhJgaOpFuEAX80dH0Z&tn=DlNxON8970ttwinE&_nc_rml=0&_nc_ht=scontent.frba4-2.fna&oh=00_AT9WoywQTrITBaaFsokzBNdLpSUO9ouim8v6I0_Mo6OEbw&oe=62685F41");
                        videoView.start();
                        break;
                    case 14:
                        videoView.setVideoPath("https://scontent.frba4-1.fna.fbcdn.net/v/t42.1790-2/10000000_961632437707424_4018843475148997131_n.mp4?_nc_cat=103&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeHOMAOYnJuA93kaTNGiBb-GRZWqXNUPjZRFlapc1Q-NlKsElWN1lrZwGSK1vS6fWpKHjAC09CJ1GMxFVJXTzziW&_nc_ohc=uUhAkV-jgpIAX9y42hm&_nc_rml=0&_nc_ht=scontent.frba4-1.fna&oh=00_AT-SBWZ8kU-tmFk4jaH1s3LPd2E7tjlJ-lDABymnjfqlWA&oe=6268560D");
                        videoView.start();
                        break;
                    case 15:
                        videoView.setVideoPath("");
                        videoView.start();
                        break;
                    case 16:
                        videoView.setVideoPath("https://scontent.frba4-1.fna.fbcdn.net/v/t42.1790-2/10000000_455931089051321_2742837277641604368_n.mp4?_nc_cat=111&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeEE7BV-NwqmmiRZlMyxx5VD2kf-AckyyNraR_4ByTLI2trLSGf7C4igwNXw77QEijjqzNWbGjxatziJRx09zYMZ&_nc_ohc=3dasGnYtbHgAX-GN2Wi&_nc_rml=0&_nc_ht=scontent.frba4-1.fna&oh=00_AT94QGp4Jv5Q8Xq6sEIPA8mfalLzMEEVqP6RhaBBXfS8Ew&oe=62685EA9");
                        videoView.start();
                        break;
                    case 17:
                        videoView.setVideoPath("https://scontent.frba4-2.fna.fbcdn.net/v/t42.1790-2/10000000_918073782311278_8045603856500998458_n.mp4?_nc_cat=101&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeEvG4JU3-U9OuN5r3_1zIWkwUM8pZcSz0jBQzyllxLPSBMvbRzFBB7kgutdH-x3x24nAM7QS5jVcwo3eSBaiAen&_nc_ohc=JzYuV1GKPucAX8WJoAZ&_nc_rml=0&_nc_ht=scontent.frba4-2.fna&oh=00_AT9W3qEHHmuBGEPe3VK1rD8ViIguESbm21_S55BM3oSVaw&oe=626858AB");
                        videoView.start();
                        break;
                    case 18:
                        videoView.setVideoPath("https://scontent.frba4-1.fna.fbcdn.net/v/t42.1790-2/10000000_197829638621022_4807506866496061079_n.mp4?_nc_cat=100&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeEaDQMR7aumipZwLgBiPcgy1M_fRw_hBjLUz99HD-EGMsCpo-xAskGz9NZzfffXiZ3ErTW83oTukGO9bhF9h-l2&_nc_ohc=B3sArKMhZXkAX9MmiXa&_nc_oc=AQnriY-21VM6Zud5hnY4ZyjsoyOnpP7Kpf85gTpm8c1eZ0wrwXGeDLEMIi7hg2e14y0&_nc_rml=0&_nc_ht=scontent.frba4-1.fna&oh=00_AT-gZ0w8McPcWkm7DRaNYAxBULEYPJl0uVaagudKmnIgAA&oe=62685EB9");
                        videoView.start();
                        break;
                    case 19:
                        videoView.setVideoPath("https://scontent.frba4-1.fna.fbcdn.net/v/t42.1790-2/10000000_211421784102003_3160718580137237928_n.mp4?_nc_cat=106&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeGJSDNebR4S6119mDZ2t43mvCscHZtJBLW8Kxwdm0kEtR_DTjejDFUbRfUcjCL4roMsU_K5ESe2SCAkKoUFsTV3&_nc_ohc=nYNB8rL8Sc4AX-HXNBL&_nc_rml=0&_nc_ht=scontent.frba4-1.fna&oh=00_AT9gY21bvkCIhHu8L_4N65BRAWFIhLMqzEKADZ2aoECH7A&oe=62685C19");
                        videoView.start();
                        break;
                    case 20:
                        videoView.setVideoPath("https://scontent.frba4-1.fna.fbcdn.net/v/t42.1790-2/10000000_731883640793866_4489266538901862880_n.mp4?_nc_cat=109&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeHyDDFWLOfziTo-yHdXWlJrMjPlFqzyIPQyM-UWrPIg9EFFtgiPc7xVWF_guRrbOdRz1kza1FlueoN_92zGqZDX&_nc_ohc=ozw7Px2ivkgAX8VYQ98&_nc_rml=0&_nc_ht=scontent.frba4-1.fna&oh=00_AT8iiCttGI6zJhVCGEMxjvj4YbLRj53W7o6DO_ZxzGJ0DA&oe=626853B0");
                        videoView.start();
                        break;
                    case 21:
                        videoView.setVideoPath("https://scontent.frba4-1.fna.fbcdn.net/v/t42.1790-2/10000000_869791616922305_2481104869883053164_n.mp4?_nc_cat=103&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeESN92CiwEEWa_y8aJbnq5fqhjU5kXivFmqGNTmReK8WctmHdVHyi2s4tDBiWy4-lbW6vj02gv_6VQgnT6Umwuw&_nc_ohc=c6McPUae6vUAX9GybTh&_nc_rml=0&_nc_ht=scontent.frba4-1.fna&oh=00_AT_Vk4qCFm_us6seqDtnmYYNrn1LiJbQiyFs2blFSqyVWg&oe=6268573D");
                        videoView.start();
                        break;
                    case 22:
                        videoView.setVideoPath("");
                        videoView.start();
                        break;
                    case 23:
                        videoView.setVideoPath("https://scontent.frba4-2.fna.fbcdn.net/v/t42.1790-2/10000000_197352295195396_4065932381577665991_n.mp4?_nc_cat=110&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeEyC6yMCI5e_pQf8ei-sXoYnkwcCPvGU0ieTBwI-8ZTSHYoKKlxFeMdAzYIkVb3fe9_Xmi6TnQBlldmtNqnR_l8&_nc_ohc=eSPcLf329EYAX_7_8qk&_nc_rml=0&_nc_ht=scontent.frba4-2.fna&oh=00_AT9d6UM6vNBg6rzDA10xn1GCSeJVozj6UaOCzgExTOSixw&oe=626856C3");
                        videoView.start();
                        break;
                    case 24:
                        videoView.setVideoPath("https://scontent.frba4-2.fna.fbcdn.net/v/t42.1790-2/10000000_314545760101727_1061835921347776119_n.mp4?_nc_cat=110&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeEgK_Efyr9p3nc2Hq0HgNOJnEdxT4vSiBqcR3FPi9KIGq5_rOlapc53VEp0by8C6cZwqzsQaxYByv6ZvfjV1qqV&_nc_ohc=qmuJpV3IdVgAX8WQxj-&_nc_rml=0&_nc_ht=scontent.frba4-2.fna&oh=00_AT8A3AuGwR_9SmjjZJsB-qvZZSC5PrdJTEosktUEKK_Rfw&oe=62685E25");
                        videoView.start();
                        break;
                    case 25:
                        videoView.setVideoPath("");
                        videoView.start();
                        break;
                    case 26:
                        videoView.setVideoPath("https://scontent.frba4-1.fna.fbcdn.net/v/t42.1790-2/10000000_264516618384515_5396821780611932875_n.mp4?_nc_cat=106&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeG5xwgUSyzfK9HGEvQ4IbkFThjHZjD8rUlOGMdmMPytSR0EzAW6_KQEF2yEVD2F-VuGfh9zEYyWI3zjCG8h9ii1&_nc_ohc=uX8NIZvPs_AAX92tPTe&_nc_rml=0&_nc_ht=scontent.frba4-1.fna&oh=00_AT8vPDfj5JWyGB8Q3R4kHM8cqACbdr-CBSuvz2QMX1-uAA&oe=626860DD");
                        videoView.start();
                        break;
                    case 27:
                        videoView.setVideoPath("https://scontent.frba4-2.fna.fbcdn.net/v/t42.1790-2/10000000_1163374124111204_2406374257924248106_n.mp4?_nc_cat=102&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeEHFSea2ZdtO7iQStAO_9nSOASvlSD0n4k4BK-VIPSfid3Oycy2g8Aig31FUFnFQHMIa4DJZuRETTzxbu_qfR26&_nc_ohc=OE3wUNcU32sAX8g7Cx6&_nc_rml=0&_nc_ht=scontent.frba4-2.fna&oh=00_AT8zbRKbv5sMPqgIq9rOf693ISvTd9e5WqmrskReaSrlMw&oe=62685AA6");
                        videoView.start();
                        break;
                    case 28:
                        videoView.setVideoPath("");
                        videoView.start();
                        break;
                    case 29:
                        videoView.setVideoPath("https://scontent.frba4-2.fna.fbcdn.net/v/t42.1790-2/10000000_849000852631032_3799178689073198956_n.mp4?_nc_cat=102&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeG-kb16Jckv22pMHw9skiy032UqEkQJ8_rfZSoSRAnz-oLC3x1DrLw-OrjPSAKjKlk0wVAxBST6l4tqE9aWhsFZ&_nc_ohc=CuABoIR6xkIAX8H0PYo&_nc_rml=0&_nc_ht=scontent.frba4-2.fna&oh=00_AT8zdHIDREvAJk7WTRjVtPsW8Ze3p-RBjPmvbIsR9onoBg&oe=626854DA");
                        videoView.start();
                        break;
                    case 30:
                        videoView.setVideoPath("");
                        videoView.start();
                        break;
                    case 31:
                        videoView.setVideoPath("https://scontent.frba4-2.fna.fbcdn.net/v/t42.1790-2/10000000_806662510056701_8420224990204862343_n.mp4?_nc_cat=102&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeHIqQ7PxCqSUJsGtimXHnjqEtBBjF-0UTES0EGMX7RRMV_hddyXjIelfy4Eza7-SfgXFDInhBvz-5DeIhy0eiCQ&_nc_ohc=QWf_XlzymWMAX8_prxd&_nc_rml=0&_nc_ht=scontent.frba4-2.fna&oh=00_AT8ZBECTmB2HElg5HPtK6Y-k5-9WLMByG8HYa97vYjiZMA&oe=62685C87");
                        videoView.start();
                        break;
                    case 32:
                        videoView.setVideoPath("https://scontent.frba4-2.fna.fbcdn.net/v/t42.1790-2/10000000_785229309012369_3912594763874642451_n.mp4?_nc_cat=108&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeFjpxcAdeRx9BmD7167uAD1ImsqWwwQFociaypbDBAWh3PnDeghwJ8H_AKF1l5DjxtLi3lrBXVbiwpqPJvmVSAc&_nc_ohc=w3FLqBz1xLEAX8wDB3l&_nc_rml=0&_nc_ht=scontent.frba4-2.fna&oh=00_AT-QMwklsOo3wuNn2m06m1ZhGyTWjd6tkN4zbv04-8rgFg&oe=62686017");
                        videoView.start();
                        break;
                    case 33:
                        videoView.setVideoPath("https://scontent.frba4-2.fna.fbcdn.net/v/t42.1790-2/10000000_1867404693461885_7744164381514804776_n.mp4?_nc_cat=110&ccb=1-5&_nc_sid=985c63&efg=eyJxZV9ncm91cHMiOlsic2RfdW5tdXRlZF9xZV9jb250cm9sIl0sInZlbmNvZGVfdGFnIjoic3ZlX3NkIn0%3D&_nc_eui2=AeG-o-5mXyh9JPhhOPvXVFh_Fh47tBMWiPkWHju0ExaI-QarGb8EyHqGLiGjJuNpdY1jCaBEdL5W21I0_r8N-kjG&_nc_ohc=ipQYTVuUq9sAX_-f3rd&_nc_rml=0&_nc_ht=scontent.frba4-2.fna&oh=00_AT-WjzxKK7Yoc8Pl69UGKhSCkZXa9wL_Jk-s2bjpAVIzAA&oe=62685B21&cbk=1");
                        videoView.start();
                        break;
                    case 34:
                        videoView.setVideoPath("https://scontent.frba4-2.fna.fbcdn.net/v/t42.1790-2/10000000_785229309012369_3912594763874642451_n.mp4?_nc_cat=108&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeFjpxcAdeRx9BmD7167uAD1ImsqWwwQFociaypbDBAWh3PnDeghwJ8H_AKF1l5DjxtLi3lrBXVbiwpqPJvmVSAc&_nc_ohc=w3FLqBz1xLEAX8wDB3l&_nc_rml=0&_nc_ht=scontent.frba4-2.fna&oh=00_AT-QMwklsOo3wuNn2m06m1ZhGyTWjd6tkN4zbv04-8rgFg&oe=62686017");
                        videoView.start();
                        break;
                    case 35:
                        videoView.setVideoPath("");

                        videoView.start();
                        break;
                    case 36:
                        videoView.setVideoPath("https://scontent.frba4-1.fna.fbcdn.net/v/t42.1790-2/10000000_192984759051254_3497318497803004668_n.mp4?_nc_cat=103&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeEGg-G6s1_9rnYsEUMsoYeKJf29SjZbu_kl_b1KNlu7-WFzMUsNmZvYTEB6qHXo8fUy8yAopjRylhlLWoga-A94&_nc_ohc=G4rybiPPc9wAX8Rnq8q&_nc_rml=0&_nc_ht=scontent.frba4-1.fna&oh=00_AT8Jk64WVvy7J3IVpAQEQvCWPokBD8T6P_KZW16BOrIb3A&oe=62685F14");
                        videoView.start();
                        break;
                    case 37:
                        videoView.setVideoPath("https://scontent.frba4-1.fna.fbcdn.net/v/t42.1790-2/10000000_1088635054967717_6786383989634861891_n.mp4?_nc_cat=106&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeG52LwDsXnpU6gH9yduHBjtviuw6CvCzcm-K7DoK8LNyeNOAjCQ24A6_Jf9ijkIWLBsd8qCxDlKIpe8xwsiyVRC&_nc_ohc=EikpNt3UTDwAX_GlHyB&_nc_rml=0&_nc_ht=scontent.frba4-1.fna&oh=00_AT9SU4t3kNiqyZxUTPmp88WVZXQgLNdS_creUNXtvVS9Fg&oe=626858BE");
                        videoView.start();
                        break;
                    case 38:
                        videoView.setVideoPath("");
                        videoView.start();
                        break;
                    case 39:
                        videoView.setVideoPath("https://scontent.frba4-2.fna.fbcdn.net/v/t42.1790-2/10000000_1014104345836378_8619966367443952713_n.mp4?_nc_cat=108&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6Im11dGVkdjJfc3ZlX3NkIn0%3D&_nc_eui2=AeFp-WvMFS2FvKkJRG_zA3XWLAjT5y-d02wsCNPnL53TbGwsX9L74TtOtwRyBeynqCIU8Uk6nAjwb1VXL-HHb3hl&_nc_ohc=qb6dU9Tbs30AX-vi6Eg&tn=DlNxON8970ttwinE&_nc_rml=0&_nc_ht=scontent.frba4-2.fna&oh=00_AT8LgaRKrZfVgiMcmaY-BO6cF1LLAzI20jeUVn0ROdfpjw&oe=62685AF4");
                        videoView.start();
                        break;
                    case 40:
                        videoView.setVideoPath("");
                        videoView.start();
                        break;
                    case 41:
                        videoView.setVideoPath("");
                        videoView.start();
                        break;
                    case 42:
                        videoView.setVideoPath("");
                        videoView.start();
                        break;
                    case 43:
                        videoView.setVideoPath("");
                        videoView.start();
                        break;
                    case 44:
                        videoView.setVideoPath("");
                        videoView.start();
                        break;
                    case 45:
                        videoView.setVideoPath("");
                        videoView.start();
                        break;
                    case 46:
                        videoView.setVideoPath("https://scontent.frba4-1.fna.fbcdn.net/v/t42.1790-2/10000000_380759647266863_3154304117225811759_n.mp4?_nc_cat=103&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6Im11dGVkdjJfc3ZlX3NkIn0%3D&_nc_eui2=AeEfOzaHEMOCC2YhoNobZTchFKPM7ROamJEUo8ztE5qYkZjjLRN1SPpOMsnDKpTX_KAp_yp4uOGep1IH1IDAUBnf&_nc_ohc=3rHO-dPHJO0AX8aVSzF&_nc_rml=0&_nc_ht=scontent.frba4-1.fna&oh=00_AT9ydrXJV9wTG1C0rIlQ8AgA6Z00ixqOiIQMLfBPK5clhg&oe=62685ADB");
                        videoView.start();
                        break;
                    case 47:
                        videoView.setVideoPath("");
                        videoView.start();
                        break;
                    case 48:
                        videoView.setVideoPath("");
                        videoView.start();
                        break;
                    case 49:
                        videoView.setVideoPath("https://scontent.frba4-1.fna.fbcdn.net/v/t42.1790-2/10000000_458129482720386_5766990547065817126_n.mp4?_nc_cat=111&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6Im11dGVkdjJfc3ZlX3NkIn0%3D&_nc_eui2=AeGPl6i1MNEOZIfkWnDv-tTK2vFvvB0N3NDa8W-8HQ3c0CL3HyDBF_CH9-e1ILf7YkRwlbeqTPP670IJEPtCtnkb&_nc_ohc=DeUa6QZKQ9UAX9POOp-&_nc_rml=0&_nc_ht=scontent.frba4-1.fna&oh=00_AT8kDZmzWpq4H-5uvh8eYg0YClFWfYOqhCC2Sv0v1DHwYA&oe=62686298");
                        videoView.start();
                        break;
                    case 50:
                        videoView.setVideoPath("");
                        videoView.start();
                        break;
                    case 51:
                        videoView.setVideoPath("https://scontent.frba4-2.fna.fbcdn.net/v/t42.1790-2/10000000_1118767378586010_4724891595740230464_n.mp4?_nc_cat=104&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeG9wHtlJXlt3Q5xLE8ExHJi4wfCumTzVPTjB8K6ZPNU9AqX0qO-CPdWFdxF5tp1De0yVWORvQIMGGR4sMuu4E2Z&_nc_ohc=BlTqa7DKopkAX_W7CRh&_nc_rml=0&_nc_ht=scontent.frba4-2.fna&oh=00_AT-F2KJbWB1DwdOLC2izSU0gsdyduQLUvGennfkmQoyjHg&oe=62686354");
                        videoView.start();
                        break;
                    case 52:
                        videoView.setVideoPath("");
                        videoView.start();
                        break;
                    case 53:
                        videoView.setVideoPath("");
                        videoView.start();
                        break;
                    case 54:
                        videoView.setVideoPath("https://scontent.frba4-1.fna.fbcdn.net/v/t42.1790-2/10000000_112754070844171_2250240560884711420_n.mp4?_nc_cat=106&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeEpbrR1A34bytPMpNyW4N-vv9lQV4LWpi-_2VBXgtamL5bCdTsn8_E_QJn3OylpVmXDOheVWA3tk6S4-9sTdykV&_nc_ohc=PPuEySdWPDsAX9HLlol&_nc_rml=0&_nc_ht=scontent.frba4-1.fna&oh=00_AT-i035UGi3wEPdemhYiQzQZsxRFrrnEhVtuw5ff9gwY8w&oe=62686009");
                        videoView.start();
                        break;
                    case 55:
                        videoView.setVideoPath("https://scontent.frba4-1.fna.fbcdn.net/v/t42.1790-2/10000000_375385404500754_5411609904443290846_n.mp4?_nc_cat=100&ccb=1-5&_nc_sid=985c63&efg=eyJxZV9ncm91cHMiOlsic2RfdW5tdXRlZF9xZV9jb250cm9sIl0sInZlbmNvZGVfdGFnIjoic3ZlX3NkIn0%3D&_nc_eui2=AeEnD698IVv6ToTjUSe3YV9R1WMEsT4jTvvVYwSxPiNO-_AekHQScItdWxR17aRhl-Q_kJXCimU8QuTuOvydXyCJ&_nc_ohc=1sJL_SGJv1oAX-7Q3pR&_nc_rml=0&_nc_ht=scontent.frba4-1.fna&oh=00_AT9w-57vdg8-A9iJKQqxmCXN2JfhA7e2slLeKrltVYFdOA&oe=626860ED&cbk=1");
                        videoView.start();
                        break;
                    case 56:
                        videoView.setVideoPath("https://scontent.frba4-2.fna.fbcdn.net/v/t42.1790-2/10000000_890652231732321_5961422096350932367_n.mp4?_nc_cat=101&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeHLM3Pjq3PPMlM9URoZKQa-z3bcfAqZTTDPdtx8CplNMJtoc5lUpB3mQ_5-rK9ywUT4Cc2NsZvVvvYWMrqqq-4o&_nc_ohc=Oa3sUuBDJJgAX8OXs1i&_nc_rml=0&_nc_ht=scontent.frba4-2.fna&oh=00_AT8P-xwU6rw6VyiwHBNogcTTJQ6lJdl6OnMdGCoVHdrw9A&oe=62685F2F");
                        videoView.start();
                        break;
                    case 57:
                        videoView.setVideoPath("");
                        videoView.start();
                        break;
                    case 58:
                        videoView.setVideoPath("https://scontent.frba4-1.fna.fbcdn.net/v/t42.1790-2/10000000_461516541841231_3052444521574153502_n.mp4?_nc_cat=109&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeHx77Qv2dIwVF8FPEUhKwp97sWj0zAF2XjuxaPTMAXZeG6Z20rtoh4oHz7XX025aiVJ9gxg5pmdrFfQ11ldZMDv&_nc_ohc=yq0GzA0NjGsAX9rF6dP&_nc_rml=0&_nc_ht=scontent.frba4-1.fna&oh=00_AT9qP5i-wvBvNUST8VcBZaGUU6iNwQG5p7gzjL3R3XJrBQ&oe=62685A49");
                        videoView.start();
                        break;

                    default:
                        break;




                }
                videoView.setMediaController(new MediaController(Omar_kzabriActivity.this));
                videoView.requestFocus();
                videoView.start();
            }
        });
    }
    private void releasemedia(){
        if(mediaPlayer != null){
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        videoView.pause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        videoView.start();
    }

    @Override
    protected void onStop() {
        super.onStop();
        releasemedia();
    }
}