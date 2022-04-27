package com.guercif.a60hizb.koraa;

import androidx.appcompat.app.AppCompatActivity;
import com.guercif.a60hizb.R;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.MediaController;
import android.widget.VideoView;

import java.util.ArrayList;

public class Laayoun_Alkoushi_Activity extends AppCompatActivity {
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
                        videoView.setVideoPath("https://video.frba1-1.fna.fbcdn.net/v/t42.1790-2/10000000_3873175789391845_518656657467304266_n.mp4?_nc_cat=108&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeF8Lbt06ZY0LgnpOQ_i-dnPTy1Dh1iFVmBPLUOHWIVWYEmZPyobg0kzM_JJCNc7ncXIapy9WeYK2UPgc24feLs9&_nc_ohc=Ps4IOrbfosQAX_dibFj&_nc_rml=0&_nc_ht=video.frba1-1.fna&oh=00_AT_I7uCJjD8JnrVVZpzmDm8Lw2JCgTJWnAY6kwurMwO9yQ&oe=6268485A");
                        videoView.start();
                        break;
                    case 1:
                        videoView.setVideoPath("https://video.fcmn1-1.fna.fbcdn.net/v/t42.1790-2/10000000_463547984700075_6109069643012427176_n.mp4?_nc_cat=107&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeEbTPZTZd6umdrcdayeWtQlIVqbyqtYv20hWpvKq1i_bSIO33itgn0Gx3lpcWwNfLvqIdXDTCIdVTS4ymM5SM7m&_nc_ohc=GRPV_EfTmCoAX_2jL8P&_nc_rml=0&_nc_ht=video.fcmn1-1.fna&oh=00_AT-7W1PPEotolREwTY0KLha4-Fmh-wsFHCesjsHj3bN3LA&oe=626847E2");
                        videoView.start();
                        break;
                    case 2:
                        videoView.setVideoPath("https://video.fcmn1-1.fna.fbcdn.net/v/t42.1790-2/10000000_372917160998445_637560339487195098_n.mp4?_nc_cat=110&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6Im11dGVkdjJfc3ZlX3NkIn0%3D&_nc_eui2=AeEQNIC3fHzN6TUoOmZ5tABFi-lzYUbj0TiL6XNhRuPROMuhGbCzi8rI4G6XY_55yYBRg4dep0uEDa87UuQHX6aU&_nc_ohc=yU49jgWMx4IAX_PUB50&_nc_rml=0&_nc_ht=video.fcmn1-1.fna&oh=00_AT8Qzd8PWbHly3jx93GCXx2MekLNdV9fD-b0jdF6dzLUVA&oe=626845C1");
                        videoView.start();
                        break;
                    case 3:
                        videoView.setVideoPath("https://video.frba1-2.fna.fbcdn.net/v/t42.1790-2/10000000_513539162874832_8374440740286866990_n.mp4?_nc_cat=107&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeE8gE5_UdtZ5cSvnJYlxLcQOKaoOdQGS-Q4pqg51AZL5A74JN-qY4_5SoXdYk5b-YytEBjkPQv_7SUdUOGaVS3C&_nc_ohc=ATzoUHxp3lUAX_Urxwv&_nc_rml=0&_nc_ht=video.frba1-2.fna&oh=00_AT83tpCuNfgzU2_AlT0uyQjibm0OnoXE134mrAbJg6ja7w&oe=62684B16");
                        videoView.start();
                        break;
                    case 4:
                        videoView.setVideoPath("https://scontent.frba1-1.fna.fbcdn.net/v/t66.36240-6/10000000_1178159782929519_8342904450614620453_n.mp4?_nc_cat=103&ccb=1-5&_nc_sid=985c63&efg=eyJxZV9ncm91cHMiOlsic2RfdW5tdXRlZF9xZV9jb250cm9sIl0sInZlbmNvZGVfdGFnIjoib2VwX3NkIn0%3D&_nc_eui2=AeG0jpr4gSFLvwrM1CM8FUQu51WYKGQkj_7nVZgoZCSP_k83Bm-4k3BtQnf-ns4TaBmql3DiGbcfh0CbFEfEpw9O&_nc_ohc=IKdNyNvQmMcAX9_D5D0&tn=DlNxON8970ttwinE&_nc_zt=28&_nc_ht=scontent.frba1-1.fna&oh=00_AT_0vr5PVd6xhe4GE-_HWmRtcCnoXZ8DB1m_GPb5HH-PLg&oe=626D6E18&cbk=1");
                        videoView.start();
                        break;
                    case 5:
                        videoView.setVideoPath("https://video.fcmn1-2.fna.fbcdn.net/v/t42.1790-2/10000000_1541838919334231_203798308254288594_n.mp4?_nc_cat=105&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeHu5DPOI4VG7g_cqsYCTYQboEgcXhzaa6-gSBxeHNprrygFvhsr9Bbw1oIBiy08PnKRjngTCq8FxPChuVnAGV3c&_nc_ohc=vJR1VPB2WOMAX8Oug9J&_nc_rml=0&_nc_ht=video.fcmn1-2.fna&oh=00_AT9MznNUQZwto-4LS683cPm6YyBV0cL9pUHGT5qwKbGpOw&oe=62684406");
                        videoView.start();
                        break;
                    case 6:
                        videoView.setVideoPath("https://video.fcmn1-1.fna.fbcdn.net/v/t42.1790-2/10000000_646379929402453_8435923189995239697_n.mp4?_nc_cat=104&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeG9VyfkwINlAV4vOQJiN1I8kISWyjDKitaQhJbKMMqK1pNwb7yzluLRXM2b72z9ZqWoZhvIsK6TN25dKwtlMnzd&_nc_ohc=fRLqIDsnAOwAX9RGum_&tn=DlNxON8970ttwinE&_nc_rml=0&_nc_ht=video.fcmn1-1.fna&oh=00_AT_LFS3BjTA93t4PDrP34dsKlWwmIluwF7HSsD4x9rSGfQ&oe=62684471");
                        videoView.start();
                        break;
                    case 7:
                        videoView.setVideoPath("https://video.fcmn1-1.fna.fbcdn.net/v/t42.9040-2/10000000_649182989063588_5071721753510517590_n.mp4?_nc_cat=110&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeErLtv3J0ZWVq0qRmhBv6gr_xn32A4lZT__GffYDiVlP9RFZ3xUSsZV1zintO0rVNhZ1tzlYoZx2BYTKMg2LGPW&_nc_ohc=ABhW9GkNbCAAX80eKMc&_nc_rml=0&_nc_ht=video.fcmn1-1.fna&oh=00_AT-e8z_giAk6UZsmT_Ff2ihNElCfYUzTzamjC3yKSFHQjA&oe=62684394");
                        videoView.start();
                        break;
                    case 8:
                        videoView.setVideoPath("https://video.frba1-2.fna.fbcdn.net/v/t42.9040-2/10000000_750565375674317_8320028070988645443_n.mp4?_nc_cat=101&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeH0cfYDOHnLJMJBAUz7OCnIDh_uPLdj0zwOH-48t2PTPIsz9mOYL-uz3K6T8erzz20FGAN9D11K6mEmQTNCQDZe&_nc_ohc=r85ZJiIz54YAX_56UHZ&tn=DlNxON8970ttwinE&_nc_rml=0&_nc_ht=video.frba1-2.fna&oh=00_AT_Kx3qQznpLTEtJZykjCigmTJObR9Yk9LDMIHDWjDUJ6w&oe=62684700");
                        videoView.start();
                        break;
                    case 9:
                        videoView.setVideoPath("https://video.frba1-2.fna.fbcdn.net/v/t42.9040-2/10000000_705335343718828_5360234972281360140_n.mp4?_nc_cat=100&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeEHPpcHOV4UEI0rXO74ft8JN4odwUlcIrI3ih3BSVwisumENwtVtRtZWZ_xeGcLluGIQdQCUrHPeAizL1rRBYxX&_nc_ohc=cYpmL2A4sr0AX8-JUCA&_nc_rml=0&_nc_ht=video.frba1-2.fna&oh=00_AT9E6gIQtINobs0n4G9mosdw-170tYsltSuvHPDAx45IKw&oe=62684510");
                        videoView.start();
                        break;
                    case 10:
                        videoView.setVideoPath("https://video.frba1-1.fna.fbcdn.net/v/t42.1790-2/10000000_843521309740552_4120633311173082871_n.mp4?_nc_cat=109&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeHty4hOVm_eY0dBuqcI9Cz52zFh-ZIRXCDbMWH5khFcIIlHPUaTsYa6YB59luo6ceB_697Odem6cpElwoTX1ZXn&_nc_ohc=7HH7cJyyu1cAX95LKdc&_nc_rml=0&_nc_ht=video.frba1-1.fna&oh=00_AT_ojzI90z8v4_BFYDU7iFeO3rQndoopYvSAbB-WEv986w&oe=62684D67");
                        videoView.start();
                        break;
                    case 11:
                        videoView.setVideoPath("https://video.frba1-2.fna.fbcdn.net/v/t42.1790-2/10000000_399983811153823_2345563441890586635_n.mp4?_nc_cat=105&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeGgKDaU40ExutZMKhmTgFH8D3y0Lug26IoPfLQu6DboirYTMWqtXoowYipfP9S__oDlrv4741Iv7uooybR66AnT&_nc_ohc=UUsjE9if-2gAX9-VcOX&tn=DlNxON8970ttwinE&_nc_rml=0&_nc_ht=video.frba1-2.fna&oh=00_AT8yhHTUiz-rViONY_hs_EbiIsRORL_PKN1RMi6mQgWo7Q&oe=62684917");
                        videoView.start();
                        break;
                    case 12:
                        videoView.setVideoPath("https://video.frba1-1.fna.fbcdn.net/v/t42.1790-2/10000000_412788883187618_4231260179228005473_n.mp4?_nc_cat=109&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeHNcuPDXPTv_k4fMgX1a42RTvjwPOwxwf5O-PA87DHB_vqIdi-KuY60asNB8OPf62Od_7F9jiRMC9B4Vt4y28vH&_nc_ohc=YL_LL19W5rMAX9-NaH6&_nc_rml=0&_nc_ht=video.frba1-1.fna&oh=00_AT-Ey_97cSOw3a0pOQALxfrHXhKvy6ze1xYsF6bB1Sy1gQ&oe=62685029");
                        videoView.start();
                        break;
                    case 13:
                        videoView.setVideoPath("https://video.frba1-2.fna.fbcdn.net/v/t42.1790-2/10000000_184985113304652_468510028014837550_n.mp4?_nc_cat=101&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeFdzZl4wN24JpcEnSuLhTcLEZuQbIwPcwcRm5BsjA9zB_ncoz2dyaBrfNvu-3fTsjb73iVoppXmt80xry7mD9y3&_nc_ohc=skhzcuZgQO0AX8WJKrW&_nc_rml=0&_nc_ht=video.frba1-2.fna&oh=00_AT-6qMmSpePA5ejFB7Yg6-f_UzC_ePK3u-eaGHKPJ4eDNA&oe=62684E4D");
                        videoView.start();
                        break;
                    case 14:
                        videoView.setVideoPath("https://video.frba1-1.fna.fbcdn.net/v/t42.1790-2/10000000_3536585736435064_7246902846622402645_n.mp4?_nc_cat=102&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeEPSjvwHx5qAJygwjYKf8QYJaw-fmjINsklrD5-aMg2yTIVIEv5RgI7sQ59DsjpokmG9y_NhNCoY_g__FeKlfjQ&_nc_ohc=48p6BOCGBmwAX_4bmn8&_nc_rml=0&_nc_ht=video.frba1-1.fna&oh=00_AT-J9PbJenMmxl7PFto3vlf24Dr6uz6_sLpzwzprDlF4cg&oe=62684B83");
                        videoView.start();
                        break;
                    case 15:
                        videoView.setVideoPath("https://video.frba1-2.fna.fbcdn.net/v/t42.1790-2/10000000_439250060420073_8262023952907343817_n.mp4?_nc_cat=110&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeEBreKVO_E7NEhmSd1-FkscKEha55vQljEoSFrnm9CWMTsDVKE_OP5H13PZTxN0qemZNMIjLP7rVW1N5Yfy8Xt_&_nc_ohc=UHVJ-lJC-PwAX87uWMY&_nc_rml=0&_nc_ht=video.frba1-2.fna&oh=00_AT9YOkWdXbbaO9HaqVVaOIpxuil6hcTOaq5EGVHJeEmnSg&oe=62684955");
                        videoView.start();
                        break;
                    case 16:
                        videoView.setVideoPath("https://video.frba1-2.fna.fbcdn.net/v/t42.1790-2/10000000_544849076478947_434482826069765935_n.mp4?_nc_cat=105&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeE4LtYw-fWWexF04ktNERD4YuEmCT5qjrFi4SYJPmqOsfMyIlpeouvrg4JHVMRMBqyKKkbYoPlvAX_U6eYQy9II&_nc_ohc=XUgJSQQYeNoAX_Sh3jx&_nc_rml=0&_nc_ht=video.frba1-2.fna&oh=00_AT8Rjm2QVPtJ62SABkqhR2KzJMyQyax7CxeDMtQz_O8_yQ&oe=62684621");
                        videoView.start();
                        break;
                    case 17:
                        videoView.setVideoPath("https://video.frba4-2.fna.fbcdn.net/v/t42.1790-2/10000000_701073947215538_3928830895167949225_n.mp4?_nc_cat=107&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeGngivwDZmDk9X2BOfwnZqTdgjGD3sKQHV2CMYPewpAdRcFvkT0px4aq3yTeyhAKRmqvuRwysmpiwJzBrTr0F3W&_nc_ohc=vT-chYk9GTAAX-L9mJc&_nc_rml=0&_nc_ht=video.frba4-2.fna&oh=00_AT8DRwMpnh7-dkONw3sIraKz-vlq8oPUNX8uze1SMrfv8g&oe=62684496");
                        videoView.start();
                        break;
                    case 18:
                        videoView.setVideoPath("https://video.frba4-1.fna.fbcdn.net/v/t42.1790-2/10000000_155183319694085_8931948992276633025_n.mp4?_nc_cat=111&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeFmUc_zjIyEq1h1OsJikoQDlipWtkYnMbGWKla2RicxsRNd-F3kpW_z-KV6BTnjBaXARQM6cQMbUPGO_T-Vo1Wt&_nc_ohc=0v-NGK8tFjYAX8AaQ6n&_nc_rml=0&_nc_ht=video.frba4-1.fna&oh=00_AT94wG44ArzLw2NPniF2S3MArIIao8Rz3ozYtOf9llfa-A&oe=62684803");
                        videoView.start();
                        break;
                    case 19:
                        videoView.setVideoPath("https://video.frba4-1.fna.fbcdn.net/v/t42.1790-2/10000000_3519580218267720_8381010285722071649_n.mp4?_nc_cat=111&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeGMl94hu7vAn8X88wg_3U3JGX_Odb-x4eQZf851v7Hh5J7lNx0D5jSguzvFjBQsJ3h7AleAkK4T4njarRPHEHLN&_nc_ohc=AMBVEtQVNoIAX81xjQa&tn=DlNxON8970ttwinE&_nc_rml=0&_nc_ht=video.frba4-1.fna&oh=00_AT_GYXLxhu_FKgLIFohMY5utN11wYBtYP8FnlMOIRKMMGQ&oe=62684595");
                        videoView.start();
                        break;
                    case 20:
                        videoView.setVideoPath("https://video.frba4-2.fna.fbcdn.net/v/t42.1790-2/10000000_2755279094788442_7351310570332913173_n.mp4?_nc_cat=101&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeGPpfQ1-66Mkr_EWpRhLgT2f5HlW_8HuWJ_keVb_we5YquMT0AXL7HETi2x2c9b8i7K3hG_kaqJ8b90GNNe6FI4&_nc_ohc=La5nnxMxE2EAX_O3bZO&_nc_rml=0&_nc_ht=video.frba4-2.fna&oh=00_AT-n0I3hgtzlLOl2dtwD8-bv5wBI4QtBKkcuS23C9JEkyQ&oe=62684699");
                        videoView.start();
                        break;
                    case 21:
                        videoView.setVideoPath("https://video.frba4-1.fna.fbcdn.net/v/t42.1790-2/10000000_469770407351956_4376880433665174588_n.mp4?_nc_cat=111&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeFv72G1P6ohG183FUYbqCD36Zm31fUu2pLpmbfV9S7akim9wQE3GPD1J29xtCIEuImsrZRy16T6QPSxZ2UKgMyW&_nc_ohc=T_UhvwD2J4IAX9vAPE2&_nc_rml=0&_nc_ht=video.frba4-1.fna&oh=00_AT8sYIMca6wLCFPXHIp4HXyaTtzQR7TcKEMsBH2ci_-CEg&oe=6268524A");
                        videoView.start();
                        break;
                    case 22:
                        videoView.setVideoPath("https://video.frba4-1.fna.fbcdn.net/v/t42.1790-2/10000000_435933600795075_7337573401842502189_n.mp4?_nc_cat=111&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeHUPazff4-9mSJkj_LncQvgUCP11gMEZhdQI_XWAwRmF0DRFcN9K04kvSp8bThj6yoTeetf2TSW32_PQNm6r1dD&_nc_ohc=YR8onshE2VQAX8A1GTK&_nc_rml=0&_nc_ht=video.frba4-1.fna&oh=00_AT9RiKJjkulf9wcj-PgDaXe3BaJEjXxUS7_Ac2x3qxKgoA&oe=62684EA9");
                        videoView.start();
                        break;
                    case 23:
                        videoView.setVideoPath("");
                        videoView.start();
                        break;
                    case 24:
                        videoView.setVideoPath("https://video.frba4-1.fna.fbcdn.net/v/t42.1790-2/10000000_1481929705332518_3682214069151480693_n.mp4?_nc_cat=111&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeFalqK8vxA1Pf420mwgPDvDXJXlj39z2_pcleWPf3Pb-naWj7oYJe7lzkUxJUpwKMau2gE0c0bBfDKS6I3pARXT&_nc_ohc=-q8MkjrUoE0AX-tXiSM&_nc_rml=0&_nc_ht=video.frba4-1.fna&oh=00_AT8OYxxi--IVfsjtYxVdBquqXLQC9p5TnAKwYT85wgi6vg&oe=626847AF");
                        videoView.start();
                        break;
                    case 25:
                        videoView.setVideoPath("https://video.frba4-1.fna.fbcdn.net/v/t42.1790-2/10000000_152538216814847_1687402413209373123_n.mp4?_nc_cat=108&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeFiF7wmHB79SWMiJLpX1tSgL0ie-HNvpG4vSJ74c2-kbvUrs_k-d59pYvdQ84KS9Dz5xSKjt72jLZwc-JIjyR8R&_nc_ohc=XAbow9_GQ28AX-QRIxH&_nc_rml=0&_nc_ht=video.frba4-1.fna&oh=00_AT_5Vly9VUvC557tnPRTYCbwRb4LxSaqVSqd2-VhyoPwEQ&oe=62684C82");
                        videoView.start();
                        break;
                    case 26:
                        videoView.setVideoPath("https://video.frba4-1.fna.fbcdn.net/v/t42.1790-2/10000000_759292305002511_469744487451634739_n.mp4?_nc_cat=111&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeEB5_NifZsv-wBbjjZakvol8HziQjE8u0HwfOJCMTy7QZksxZqJLsA-qWqYsvKSI6ePuR68TwWqjWdo9q9u2CfH&_nc_ohc=w3DFAY5IQdkAX8lavDd&tn=DlNxON8970ttwinE&_nc_rml=0&_nc_ht=video.frba4-1.fna&oh=00_AT_IeUiCzuhef5btgPD7YmmJk9_dLTxz2-C6RJtkYtQpbQ&oe=626851D6");
                        videoView.start();
                        break;
                    case 27:
                        videoView.setVideoPath("https://video.frba4-2.fna.fbcdn.net/v/t42.1790-2/10000000_470015057505891_6129736733755570080_n.mp4?_nc_cat=106&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeFmGZ0ensCDsgZej-_J9ypnA-LHBVGMZnMD4scFUYxmcwpMCmaAlSwX0Cm5sGCAfkUBxbrIFhkNyM4PeI8hHmfX&_nc_ohc=b6uHnQxQwAcAX97YdA9&_nc_rml=0&_nc_ht=video.frba4-2.fna&oh=00_AT-ijHL0G7nnk7H5eTlxoeW9WkwTxzxZ5ds5quQdBjaX6g&oe=626847D7");
                        videoView.start();
                        break;
                    case 28:
                        videoView.setVideoPath("https://video.frba4-1.fna.fbcdn.net/v/t42.1790-2/10000000_2839823712927015_5526995990579910004_n.mp4?_nc_cat=110&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeGz4LexNJOeg_Oz_t6FDttXpTJwPKU6dl-lMnA8pTp2Xy6yLE7OLJxIG8ZjtJeb687OTWhc3NuurB1WlIFXs-IJ&_nc_ohc=puEfEQnMeVwAX_gszna&tn=DlNxON8970ttwinE&_nc_rml=0&_nc_ht=video.frba4-1.fna&oh=00_AT-Hp2B9wVkMrGJjgPivUULz1KhZ6PcCKlvN-SbURnzOHQ&oe=62684E10");
                        videoView.start();
                        break;
                    case 29:
                        videoView.setVideoPath("");
                        videoView.start();
                        break;
                    case 30:
                        videoView.setVideoPath("https://video.frba4-1.fna.fbcdn.net/v/t42.1790-2/10000000_281980010269316_2626089835973397464_n.mp4?_nc_cat=100&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeFatW1pbwydNAPGmXUR75dwWy8Tefrl6k1bLxN5-uXqTToHudNwwgwzEAK1fw5iDDdRdxjwVG3Xicl1hCPFiUF_&_nc_ohc=wg9qBieFF9YAX9I9NLo&tn=DlNxON8970ttwinE&_nc_rml=0&_nc_ht=video.frba4-1.fna&oh=00_AT8prukqDG0NzyAhMDoGcN0mjHapyjtKKaa5diqf-P__1Q&oe=626849C0");
                        videoView.start();
                        break;
                    case 31:
                        videoView.setVideoPath("https://video.frba4-1.fna.fbcdn.net/v/t42.9040-2/10000000_234981154286491_8187788111061712896_n.mp4?_nc_cat=100&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeFQRkBrv-woWhy5jH1TAZUP4gA8uqdfpwDiADy6p1-nAEg0BpYeDlT1nsI-k9DUiOCEpqXSo7uV4pexmdVj_Kmo&_nc_ohc=_9tMgTGj1E8AX_5o1uy&tn=DlNxON8970ttwinE&_nc_rml=0&_nc_ht=video.frba4-1.fna&oh=00_AT9MjU4fu_AiiAfYPFEWA-byrlpoQF90QEtkToRMvfj5nA&oe=62684890");
                        videoView.start();
                        break;
                    case 32:
                        videoView.setVideoPath("https://video.frba4-2.fna.fbcdn.net/v/t42.1790-2/10000000_1053809648543496_1679942912559799921_n.mp4?_nc_cat=107&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeGBFSbczXGt-o3vos3i6-D_IKfC_fiTEPAgp8L9-JMQ8NatIqRghLIb85_ybwBMpKW0Ddq3s2GXwgGXJVsetKSE&_nc_ohc=oWZ__FTyxuUAX_Y-YiX&tn=DlNxON8970ttwinE&_nc_rml=0&_nc_ht=video.frba4-2.fna&oh=00_AT9LB7e2ky7_my_ZBu9OCwROT8Xn9d1L7PuIQQQmBLwoTA&oe=62684C4B");
                        videoView.start();
                        break;
                    case 33:
                        videoView.setVideoPath("https://video.frba4-2.fna.fbcdn.net/v/t42.1790-2/10000000_100304365390273_2960092350196523750_n.mp4?_nc_cat=107&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeG12CQownq6Cl2T_AxK1ru4rVL8uxXkZs6tUvy7FeRmzjodkJO-QdX868D_2Hj0iqYwwIU4OMIS5kch3VTQOwmK&_nc_ohc=eYLBbYAj0ksAX8Exlzf&_nc_rml=0&_nc_ht=video.frba4-2.fna&oh=00_AT8VvO_E2soAoY9Zd8tocT2qWbbasNsHgeXZeEY78JUlfw&oe=626852F9");
                        videoView.start();
                        break;
                    case 34:
                        videoView.setVideoPath("https://video.frba4-1.fna.fbcdn.net/v/t42.1790-2/10000000_3235538233399473_4940045754930138935_n.mp4?_nc_cat=100&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6Im11dGVkdjJfc3ZlX3NkIn0%3D&_nc_eui2=AeGUhXpJMitpG8baOm1htZvka643J1CFCw5rrjcnUIULDpRBA6DTT0yGZcG-lck8rejEBhEmP6cWNeTzSgyN9JOP&_nc_ohc=BJjlQkFpQ24AX8PPosh&_nc_rml=0&_nc_ht=video.frba4-1.fna&oh=00_AT8VxPDmW6bCzcW0Gk56oEC3g7GOqnFH-bucD69PFEkqnA&oe=62684E8A");
                        videoView.start();
                        break;
                    case 35:
                        videoView.setVideoPath("https://video.frba4-1.fna.fbcdn.net/v/t42.1790-2/10000000_623697712239433_5060152600351562042_n.mp4?_nc_cat=110&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6Im11dGVkdjJfc3ZlX3NkIn0%3D&_nc_eui2=AeEL0ibpfvS0L-PBd8mtVpwijZEO1R65kIWNkQ7VHrmQhXHpDP9bEQJlvr411gWDD8f2AGszlyglOL7PbnQQvKew&_nc_ohc=UoILyo5oGToAX8u_un4&_nc_rml=0&_nc_ht=video.frba4-1.fna&oh=00_AT_fTw13vBRsm7C0FzHiGKzQ0R3JWWWL9NbLZay6-KAfpQ&oe=62684DAB");
                        videoView.start();
                        break;
                    case 36:
                        videoView.setVideoPath("");
                        videoView.start();
                        break;
                    case 37:
                        videoView.setVideoPath("https://video.frba4-2.fna.fbcdn.net/v/t42.1790-2/10000000_230636271844003_7529220024381365737_n.mp4?_nc_cat=102&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6Im11dGVkdjJfc3ZlX3NkIn0%3D&_nc_eui2=AeGOpD3b-9twJGg4uCU8DrBL7BOHtqV43dTsE4e2pXjd1GenacyB6jg8DiyzMwmRY9WDCvw8V0xWEXywtpAyec3o&_nc_ohc=N2j0kiYnbVEAX8zVZSL&tn=DlNxON8970ttwinE&_nc_rml=0&_nc_ht=video.frba4-2.fna&oh=00_AT_7EIe8kA1PTDBdtYE0eGTWTgilAi7rYopEr9LET8oymg&oe=62684EF2");
                        videoView.start();
                        break;
                    case 38:
                        videoView.setVideoPath("https://video.frba4-1.fna.fbcdn.net/v/t42.1790-2/10000000_816889805592105_6330654679602334373_n.mp4?_nc_cat=108&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6Im11dGVkdjJfc3ZlX3NkIn0%3D&_nc_eui2=AeFAeB4_V4gKv9o7H0elLvQ965dFPHPL9vvrl0U8c8v2-wEzbmF1HiSPf02CfqqHEgpwM-nU5FMLCzSaumBlzCfC&_nc_ohc=IAHFBogAf1EAX9IHQBw&_nc_rml=0&_nc_ht=video.frba4-1.fna&oh=00_AT96AUurSNrh_4bDwXrCw39cJ1O69EHCuKS_FFDR-Z3UFg&oe=62684BEE");
                        videoView.start();
                        break;
                    case 39:
                        videoView.setVideoPath("");
                        videoView.start();
                        break;
                    case 40:
                        videoView.setVideoPath("https://video.frba4-1.fna.fbcdn.net/v/t42.1790-2/10000000_358430176107845_3747364713933092514_n.mp4?_nc_cat=100&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6Im11dGVkdjJfc3ZlX3NkIn0%3D&_nc_eui2=AeFgoXdyl0S1C-H51BIAO08bwqbzlEc5tlPCpvOURzm2U5EfgTA11PqJlrLM5yT4DpLxL8W7TXxeqqEGWehw3grU&_nc_ohc=HEq2iHvPhHcAX8SDwYl&tn=DlNxON8970ttwinE&_nc_rml=0&_nc_ht=video.frba4-1.fna&oh=00_AT_sYJ4fD0vQIGpgkzyhHn01u9jlbOhARlko3TU88UUj3w&oe=62685277");
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
                        videoView.setVideoPath("");
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
                        videoView.setVideoPath("");
                        videoView.start();
                        break;
                    case 50:
                        videoView.setVideoPath("");
                        videoView.start();
                        break;
                    case 51:
                        videoView.setVideoPath("");
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
                        videoView.setVideoPath("");
                        videoView.start();
                        break;
                    case 55:
                        videoView.setVideoPath("");
                        videoView.start();
                        break;
                    case 56:
                        videoView.setVideoPath("");
                        videoView.start();
                        break;
                    case 57:
                        videoView.setVideoPath("");
                        videoView.start();
                        break;
                    case 58:
                        videoView.setVideoPath("https://video.frba4-1.fna.fbcdn.net/v/t42.9040-2/10000000_553131782143746_281564964865441792_n.mp4?_nc_cat=109&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeF8dvkQHIczsDRFreF9HACN9TMIbJnXzjH1MwhsmdfOMXtS1SAYUtaxgEkmr4vpxFrOaBi29LmSDn5fFxb4G-QV&_nc_ohc=duR3zwyjOQkAX8uyTVI&_nc_rml=0&_nc_ht=video.frba4-1.fna&oh=00_AT-W4p1RN_EfkvUOE9H2HGElCzbTAlQm3IcOvnwtBaQvZQ&oe=6268544C");
                        videoView.start();
                        break;

                    default:
                        break;




                }
                videoView.setMediaController(new MediaController(Laayoun_Alkoushi_Activity.this));
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