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

public class Abdrahman_Naboulsi_Activity extends AppCompatActivity {
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



adapter =  new ArrayAdapter(this, android.R.layout.simple_list_item_1,videolist);
listView.setAdapter(adapter);

listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long ID) {
switch (position){
    case 0:
videoView.setVideoPath("https://video.fcmn1-1.fna.fbcdn.net/v/t42.1790-2/10000000_403653624751111_9035704611471061626_n.mp4?_nc_cat=110&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeH1foDDYMzmlr1plhX4cuWGELTCfA2-lDAQtMJ8Db6UMF-7ma81DhGUOXg7hH6bvflJuoZYDO5VhwguHnncx7Pr&_nc_ohc=4rsJ9nYacGQAX8xHgrC&_nc_rml=0&_nc_ht=video.fcmn1-1.fna&oh=00_AT8FrIgGFIAnJIrX6mVFX41pwTCfccmWFT31wJ_T6EB58A&oe=6267E2DC");
videoView.start();
        break;
    case 1:
        videoView.setVideoPath("https://video.fcmn1-1.fna.fbcdn.net/v/t42.1790-2/10000000_134563859013017_6198237675520490410_n.mp4?_nc_cat=101&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeHWmtu1P5EqjjZxutkF9fVSCb0DgOPXx4sJvQOA49fHi6AGl4vi55fuLOLBoEyLUCk6OEbxLiXO994SqM0fJ0CX&_nc_ohc=kuQv5BkisBgAX89PXej&_nc_rml=0&_nc_ht=video.fcmn1-1.fna&oh=00_AT85kOxACZVht2IaZUk2n0Lc89QnT5HTl1w_sKJePhINBQ&oe=6267F0AC");
        videoView.start();
        break;
    case 2:
        videoView.setVideoPath("https://video.fcmn1-1.fna.fbcdn.net/v/t42.1790-2/10000000_1084556692281699_376571346242911654_n.mp4?_nc_cat=101&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeHtgQqGkgKkr2R2gcq9awSqsGVexQ-oDM-wZV7FD6gMz1kJE3pyC1fTZ0RflbuAnjotIt5GFHjjwMlVeX__xknx&_nc_ohc=ko1EUBRiBgQAX-vfpH0&_nc_rml=0&_nc_ht=video.fcmn1-1.fna&oh=00_AT8ShesW0ovXbww2LWhLpgAZOV_wSe5hw_vNeYBq1lzC9w&oe=6267F6D9");
        videoView.start();
        break;
    case 3:
        videoView.setVideoPath("https://video.fcmn1-1.fna.fbcdn.net/v/t42.1790-2/10000000_499171044514700_6693985569670842540_n.mp4?_nc_cat=107&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeGXnKRb432WZtKXYXd5WSL8eok6S7R75KN6iTpLtHvkowgAzrVUmaVrCcHNbxgJr-JjVpxwAa7Bw2YtcDFEhmDR&_nc_ohc=dHMnxBNuuYgAX-cvyVX&_nc_rml=0&_nc_ht=video.fcmn1-1.fna&oh=00_AT_zF4y_9HK0ttqsCtQXwg3alpZuHaIMV-H4MMQfWoMVvg&oe=6267F456");
        videoView.start();
        break;
    case 4:
        videoView.setVideoPath("https://video.fcmn1-2.fna.fbcdn.net/v/t42.1790-2/10000000_3092349007708246_7354909587195214154_n.mp4?_nc_cat=111&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeFx0FonM2y3q4od_A62wW1wRI6WTQpDxABEjpZNCkPEAFB5Jc_cLgCNDmNWAqYFVlUKJ-ksTs4z-Hk7PeFvsjh3&_nc_ohc=vGW5x2vzozoAX_A0DoN&tn=DlNxON8970ttwinE&_nc_rml=0&_nc_ht=video.fcmn1-2.fna&oh=00_AT8tP7z9PCCGFCRg1Sx0kPdcwQ6agP3wKxkJRV50I1G6bQ&oe=6267FAEF");
        videoView.start();
        break;
    case 5:
        videoView.setVideoPath("https://video.fcmn1-1.fna.fbcdn.net/v/t42.1790-2/10000000_220870066710366_2308675777926128634_n.mp4?_nc_cat=102&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeHUtd4Wv8X1F4TkBOMY02dMdR3zIZemkm51HfMhl6aSbvjokeY2mVNJs1RspSEEJTDdRLseltRpHUEUF1LDV-IQ&_nc_ohc=k_-Fd8lEK2EAX-7K6WI&_nc_rml=0&_nc_ht=video.fcmn1-1.fna&oh=00_AT8L6l0DtbYUXoPHWgzohMthVWezWRB6svN_0VHPIzBF9Q&oe=6267FAF0");
        videoView.start();
        break;
    case 6:
        videoView.setVideoPath("https://video.fcmn1-2.fna.fbcdn.net/v/t42.1790-2/10000000_678790903346234_5170798770010040739_n.mp4?_nc_cat=109&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeHaTcp4dy0-fwqgTJ8FCsRHooApWOB_OgKigClY4H86AuqWg39ex3UW9Wo9VdH0v8WbUQy1HNYF4kW6lI2Y5seR&_nc_ohc=xSCCbPS7eSoAX8m3CC1&_nc_rml=0&_nc_ht=video.fcmn1-2.fna&oh=00_AT8ULaF6iJef1t9hBjBjzRdlSZ6uQNGd6PWIDvswawT6qA&oe=6267F741");
        videoView.start();
        break;
    case 7:
        videoView.setVideoPath("https://video.fcmn1-2.fna.fbcdn.net/v/t42.1790-2/10000000_346427967453113_2172926597172573518_n.mp4?_nc_cat=108&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeHVRBk1Lp6p3s44hTWW15E3olLbxCuGm7KiUtvEK4abstAE8_cdU_uqmuFnUbdJw_m12DDAIcsS3o4PYWYn9kBr&_nc_ohc=Srh2D0w6NZMAX-2chHe&_nc_rml=0&_nc_ht=video.fcmn1-2.fna&oh=00_AT9oES0Ycc__5p8cyvKN6UE0w0zs5ENxW__mlwmYfLov-A&oe=6267F65A");
        videoView.start();
        break;
    case 8:
        videoView.setVideoPath("https://video.fcmn1-2.fna.fbcdn.net/v/t42.1790-2/10000000_935178040685912_6432505028405644281_n.mp4?_nc_cat=103&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeEO4MkHhNk65aVuaGMzwx8mBQqv3KCFnvgFCq_coIWe-Jphj3xHDucBp2zU7tjfVbJuh00ltJdR9MYs72bGou1Q&_nc_ohc=K6bAxZTFZ4MAX_R490h&_nc_rml=0&_nc_ht=video.fcmn1-2.fna&oh=00_AT8eFXdhHk_DeWjSLWE7ul86-pfBPYBxyQbsRqWd7eG9CQ&oe=6267F453");
        videoView.start();
        break;
    case 9:
        videoView.setVideoPath("https://video.fcmn1-2.fna.fbcdn.net/v/t42.1790-2/10000000_4314724265306778_4621605200005841665_n.mp4?_nc_cat=111&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeGIp_pywN4yHw1bL-QmT-XfhiJkEG08CZGGImQQbTwJkSZPyQyiiJDGvXYTXPGtOOlyz4KggOD0Y3vUnvm0X4VD&_nc_ohc=n4knRLaj9Q0AX_W6BmM&_nc_oc=AQk7AYmIra9xR93uv9o6g1xzIbbDZgpL1RLL9I-gYM8IUr4Fd0lUI5K9dtZumx-ZONY&tn=DlNxON8970ttwinE&_nc_rml=0&_nc_ht=video.fcmn1-2.fna&oh=00_AT_6X7FXCUhcjE-IfoweOT5iH6T6iM-vzinNZko5IgwwAg&oe=6267EF6F");
        videoView.start();
        break;
    case 10:
        videoView.setVideoPath("https://video.fcmn1-1.fna.fbcdn.net/v/t42.1790-2/10000000_799355014105967_734823526681686341_n.mp4?_nc_cat=107&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeF70vBISjQ6mXjT4XvuZRKczEyIfGG7XerMTIh8Ybtd6jOoR9NJaH4qy00tCp0ZFdDH9gqRwU23gAh9CYbyb3Se&_nc_ohc=zHPeWs7RKAwAX9nYy8z&_nc_rml=0&_nc_ht=video.fcmn1-1.fna&oh=00_AT8nrK4Yu4AzJ8HV3ZhDSsHBPYMuUXPFi8NzMb8khZzArA&oe=6267F466");
        videoView.start();
        break;
    case 11:
        videoView.setVideoPath("https://video.fcmn1-2.fna.fbcdn.net/v/t42.1790-2/10000000_394275435389639_7447738021316825307_n.mp4?_nc_cat=111&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeGZ_sMBgA9xK3JF0qr2rxk9JhqHE9AAeIkmGocT0AB4idbb1RoP0WgrDyFaho7JZT9D54smgdURowrtpmPQqMuB&_nc_ohc=cZa72wSg6hwAX8p52Ep&_nc_rml=0&_nc_ht=video.fcmn1-2.fna&oh=00_AT8v8Yy6j7PxxNHTvXhAwmBAousHNLtI4cCVe0QEzHmgcg&oe=6267EEF7");
        videoView.start();
        break;
    case 12:
        videoView.setVideoPath("https://video.fcmn1-2.fna.fbcdn.net/v/t42.1790-2/10000000_394275435389639_7447738021316825307_n.mp4?_nc_cat=111&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeGZ_sMBgA9xK3JF0qr2rxk9JhqHE9AAeIkmGocT0AB4idbb1RoP0WgrDyFaho7JZT9D54smgdURowrtpmPQqMuB&_nc_ohc=cZa72wSg6hwAX8p52Ep&_nc_rml=0&_nc_ht=video.fcmn1-2.fna&oh=00_AT8v8Yy6j7PxxNHTvXhAwmBAousHNLtI4cCVe0QEzHmgcg&oe=6267EEF7");
        videoView.start();
        break;
    case 13:
        videoView.setVideoPath("https://video.fcmn1-2.fna.fbcdn.net/v/t42.1790-2/10000000_218357770169431_4944101694038529910_n.mp4?_nc_cat=111&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeEQZZOhhMqsCrSf4A_3QIOxEYFrIImQGpsRgWsgiZAam2-5G0i3_8ogSDZkwnMCDqelHJFTB_s8GDvHH4UUYl-7&_nc_ohc=-FY3iMX5jz0AX_bsr7J&tn=DlNxON8970ttwinE&_nc_rml=0&_nc_ht=video.fcmn1-2.fna&oh=00_AT-7wllxJ3kad-FTqAgSZ92TABDIBcif1PUoieRQSi-ZoA&oe=6267F421");
        videoView.start();
        break;
    case 14:
        videoView.setVideoPath("https://video.fcmn1-1.fna.fbcdn.net/v/t42.1790-2/10000000_1776084935899994_6076689290796626966_n.mp4?_nc_cat=104&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeGHMVbbn8VPP7VXumT_83JKYN00Iu4krCNg3TQi7iSsI1OYlYz41t2MXq0AtTEZV_fB9jqygFiXpPnsAOUV_lfp&_nc_ohc=ZRerIGQaFEQAX9IhMbI&_nc_rml=0&_nc_ht=video.fcmn1-1.fna&oh=00_AT9lhZ8tubprBeWgQ6icSrrjNTgHvGIwwHrJLhjtTbWIpA&oe=6267F768");
        videoView.start();
        break;
    case 15:
        videoView.setVideoPath("https://video.fcmn1-2.fna.fbcdn.net/v/t42.1790-2/10000000_335969238211429_2064393654734066336_n.mp4?_nc_cat=100&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeG3seYvv2gWgNzJQjE_dYC9XQz9RE8xtCBdDP1ETzG0IL9af8WH6tyxaUtnnXGRJp19Xg5A3nC63_IUlmrAdsnT&_nc_ohc=mkXAuJcRH4MAX-8YOdD&_nc_rml=0&_nc_ht=video.fcmn1-2.fna&oh=00_AT8C0oFwF4E4AKIv8eo3kSncWnNgPJ2Gm6ZR7j1utlBNug&oe=6267FAB6");
        videoView.start();
        break;
    case 16:
        videoView.setVideoPath("https://video.fcmn1-2.fna.fbcdn.net/v/t42.1790-2/10000000_158448369755969_7534723960968430056_n.mp4?_nc_cat=109&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeH792sjjKh9ldSx7Guu5VXZ4wxryj_FUInjDGvKP8VQifnaCtaoKJJ1VSUwdg9stUlt67_gvZ4bPjkRm5ssFMn_&_nc_ohc=jzreNZRULXsAX-B_G_X&tn=DlNxON8970ttwinE&_nc_rml=0&_nc_ht=video.fcmn1-2.fna&oh=00_AT8mGSjZYXC4Ml-v4P-gMxyaEjGxzEiUFajMBCIUhPTAWA&oe=6267FB60");
        videoView.start();
        break;
    case 17:
        videoView.setVideoPath("https://video.fcmn1-1.fna.fbcdn.net/v/t42.1790-2/10000000_1209449019464828_667931099938613658_n.mp4?_nc_cat=107&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeH6TUxsqJu4ygc7IfANDurgRgpmbhBEsXFGCmZuEESxcbigNRq-haffxZeH9TgxBHZx8097HNQm8_ofKcbOgsSo&_nc_ohc=GdJb7mdrkCkAX_u1dyP&_nc_rml=0&_nc_ht=video.fcmn1-1.fna&oh=00_AT-vBFJ5JiHLAkHq_XUXf0shC3C8f59fjPCyPzkt-XMTqQ&oe=6267F1FA");
        videoView.start();
        break;
    case 18:
        videoView.setVideoPath("https://video.fcmn1-1.fna.fbcdn.net/v/t42.1790-2/10000000_526091852139418_4691931258048506146_n.mp4?_nc_cat=104&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeFR5S3rPUAXnUuhZ4WAp7AvP9f3ud963XU_1_e533rddfSKdqbL9VJcwPXZ9L6LoHb7dBI3AIhbDkprieKTEJWZ&_nc_ohc=X4m80jQUnNAAX_oJPfi&_nc_rml=0&_nc_ht=video.fcmn1-1.fna&oh=00_AT82ECj-eR4mx58y1S4ADU0RpDzSfe29Y_P0vvPkAIPlwA&oe=6267F5EC");
        videoView.start();
        break;
    case 19:
        videoView.setVideoPath("https://video.fcmn1-2.fna.fbcdn.net/v/t42.1790-2/10000000_1080674856051938_3298552534922508552_n.mp4?_nc_cat=103&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeEmJlI9X42kpGTrB83vvdLbnp6qGrW2a0aenqoatbZrRroISxAyJjGEpbKNsYm2N67ossPOlr1dQdbvaXc9Qpzn&_nc_ohc=ohrQlEruCMwAX_ZT78U&_nc_rml=0&_nc_ht=video.fcmn1-2.fna&oh=00_AT9dPVYKA5VRR5t4XQWba_TnQNPSAWZYquuHLqa-NmJ8PA&oe=6267F139");
        videoView.start();
        break;
    case 20:
        videoView.setVideoPath("https://video.fcmn1-1.fna.fbcdn.net/v/t42.1790-2/10000000_295918295635512_6903995610409497523_n.mp4?_nc_cat=101&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeF7lx_-52yzUR6U5VDz6lQ824X8ZJWiJ-fbhfxklaIn5xMTAVSUV_RP7CihrRkWMnaMPIHg8tuQTY_350KiYBRt&_nc_ohc=-0baoC7WgN0AX-5-gzS&tn=DlNxON8970ttwinE&_nc_rml=0&_nc_ht=video.fcmn1-1.fna&oh=00_AT_oVJ_bFxeRhj2-qv_7w9ItNZEzDwF2UTx0C0fix5cdlg&oe=6267F208");
        videoView.start();
        break;
    case 21:
        videoView.setVideoPath("https://video.fcmn1-1.fna.fbcdn.net/v/t42.1790-2/10000000_1080805466086307_9069953948612092760_n.mp4?_nc_cat=107&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeFxo0FMxugsFbdHtLiPpABmlkPtNxvUXYyWQ-03G9RdjPO5Dvg-L_j13ZZ5Ox7Vatz6DGM5XiubX4KB_M3mS4Ok&_nc_ohc=SNn1etulZhwAX85Cql8&_nc_rml=0&_nc_ht=video.fcmn1-1.fna&oh=00_AT-gyZubJ_uqyL35lKypL7is9QDrTkcRl34GevUEr-HBsg&oe=6267F955");
        videoView.start();
        break;
    case 22:
        videoView.setVideoPath("https://video.fcmn1-1.fna.fbcdn.net/v/t42.1790-2/10000000_189456660013529_5715534157711435115_n.mp4?_nc_cat=106&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeE1UAqF5bYljwBShR55Z7LflChNlKrOaJuUKE2Uqs5om79WPk9g3W5JUPN3M1XZYsgoWL3JrXvOFSNWKjRUyGyx&_nc_ohc=qrUV8qyotTYAX9LhQUO&_nc_rml=0&_nc_ht=video.fcmn1-1.fna&oh=00_AT-RCLckpeAMxZYSjevSJQNDHBe4Nw0VkLKlJG-e5Z4KXA&oe=6267F912");
        videoView.start();
        break;
    case 23:
        videoView.setVideoPath("https://video.fcmn1-2.fna.fbcdn.net/v/t42.1790-2/10000000_6526360864056465_7094358641585701167_n.mp4?_nc_cat=100&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeFuBGRe7H2sC-yMcLyGN7qP7ckQ8xPHLuXtyRDzE8cu5aBj1rAiQIx9uIWAPPQjsDqU39JgJ0JMtPR7zqJhWe7r&_nc_ohc=sHejH9W5Dd8AX8gkeuM&tn=DlNxON8970ttwinE&_nc_rml=0&_nc_ht=video.fcmn1-2.fna&oh=00_AT9mx8W2pmXPEVyndxsFs6vx17CQrAGchEVJ_ZAT0CMvTw&oe=6267FD47");
        videoView.start();
        break;
    case 24:
        videoView.setVideoPath("https://video.fcmn1-2.fna.fbcdn.net/v/t42.1790-2/10000000_1048430699027764_6314308114544832091_n.mp4?_nc_cat=108&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeE1Rz3NqW8jeJUfz8wLv-kJMRsHmj0th4QxGweaPS2HhBOExIBlzU-JAHptLt1lFpdyB4tw7Ale4picB_anlvY3&_nc_ohc=D2El5awvie4AX9j_s4N&_nc_rml=0&_nc_ht=video.fcmn1-2.fna&oh=00_AT9-hK6-Kw_E2Iw206Bh-B4yNAf6ua1Vxmpihnd3Y9V_hQ&oe=6267FC78");
        videoView.start();
        break;
    case 25:
        videoView.setVideoPath("https://video.fcmn1-2.fna.fbcdn.net/v/t42.1790-2/10000000_198940305620286_4356192246641403448_n.mp4?_nc_cat=100&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeFBc-VR-PB5nmv1QOEWr0l9s8zO4zsFvaizzM7jOwW9qFDuKp89-cjH-TkuirlsZm9ITOC9BBoo3R8-BWHm4j5S&_nc_ohc=EkkmhVDul8EAX8-VYrl&tn=DlNxON8970ttwinE&_nc_rml=0&_nc_ht=video.fcmn1-2.fna&oh=00_AT82FUc3F5Yiu9VezROm6w-bj_JDiqs7AaSDgWkEIqxn1Q&oe=6267F17A");
        videoView.start();
        break;
    case 26:
        videoView.setVideoPath("https://video.fcmn1-2.fna.fbcdn.net/v/t42.1790-2/10000000_411559813887062_2310967386070808288_n.mp4?_nc_cat=109&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeFgC_UeodhsuiiTHQo3bXU0169tmkKdLOHXr22aQp0s4aFbSaMUv8quU6PKTyApnbilcB6LcH0y5YjIfj8fua5O&_nc_ohc=SHnbwKwjZDQAX-Q1prt&_nc_rml=0&_nc_ht=video.fcmn1-2.fna&oh=00_AT9UxIsrKLWIe04FVlPJ1dKGMw20uI_xywFssh011ldYIg&oe=6267FE40");
        videoView.start();
        break;
    case 27:
        videoView.setVideoPath("https://video.fcmn1-2.fna.fbcdn.net/v/t42.1790-2/10000000_2728478994110547_7691089630607760962_n.mp4?_nc_cat=108&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeG4vnUT5pl0zHtMRN_zZqR2Xz5qI_9Pk89fPmoj_0-Tz0xKAhGG9drIiQuoE1MgWThHjDxeuC0SCR-RmPKH0BPL&_nc_ohc=7aLGr81Qx5YAX_s6JBE&_nc_rml=0&_nc_ht=video.fcmn1-2.fna&oh=00_AT9qwFcbBs3i0s96qp45A7EAWFRuTVxjc__IHiTAU3RRuA&oe=6267FB0D");
        videoView.start();
        break;
    case 28:
        videoView.setVideoPath("https://video.fcmn1-2.fna.fbcdn.net/v/t42.1790-2/10000000_1147592725744796_4644949695040872597_n.mp4?_nc_cat=103&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeFNJY5wuZgtMkjdkh-o3wmqpSmHAn6x__elKYcCfrH_99wxIED-VbH0RGV-rd0sR-Zhsu9qdPtljXUc1RLrG6ve&_nc_ohc=-2Mfz7ToUHYAX-xS65X&_nc_rml=0&_nc_ht=video.fcmn1-2.fna&oh=00_AT8fnRGRcJDoTHVNZ6tmuHyas7vRNkiIiDoFiqC0Amt80w&oe=6267F7A7");
        videoView.start();
        break;
    case 29:
        videoView.setVideoPath("https://video.fcmn1-2.fna.fbcdn.net/v/t42.1790-2/10000000_910020403178689_1993918004625958904_n.mp4?_nc_cat=108&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeH4tgpQbyZiwWmQ_20xhCGytwfTZ105Bg63B9NnXTkGDo2AIh_C2URnBmrQT_TPYa20zLGpHjegbjriF0mIXekN&_nc_ohc=hizFmLaPsjoAX8-BX4c&_nc_rml=0&_nc_ht=video.fcmn1-2.fna&oh=00_AT8IQUdHxr36Jsqot4-RrbXJDnJMqRkw8MltoxtQatmuxQ&oe=626801D5");
        videoView.start();
        break;
    case 30:
        videoView.setVideoPath("https://video.fcmn1-2.fna.fbcdn.net/v/t42.1790-2/10000000_1225076194628681_8997357231180699777_n.mp4?_nc_cat=111&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeGwHkJxySJp8a674JgcSMYEV7j0gatY9zRXuPSBq1j3NHidV5c5o5kwevXguXuBdlbyUsSG3u0UeVXRXz8moo6c&_nc_ohc=sL9RbSIPC1wAX-HQqSN&_nc_rml=0&_nc_ht=video.fcmn1-2.fna&oh=00_AT8GcaiviI5PlhwX3CSDXiCXmUzKvxWP5_3U2tNAl8lmiQ&oe=6267FFF7");
        videoView.start();
        break;
    case 31:
        videoView.setVideoPath("https://video.fcmn1-1.fna.fbcdn.net/v/t42.1790-2/10000000_924460528402162_2025127071134233676_n.mp4?_nc_cat=106&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeGPcPKtEBO9KErn_YIa0z78SVHViTAIoQdJUdWJMAihByz3hGQ7c1PsRMhwHddYevijNu587QxX7DtktKEf4uYP&_nc_ohc=sSsGIondS2EAX_RzF9b&tn=DlNxON8970ttwinE&_nc_rml=0&_nc_ht=video.fcmn1-1.fna&oh=00_AT_Sep663t5Vy45_YHdx49amgRpcb7ekpHO5Nx_Jo3i9VA&oe=626803DE");
        videoView.start();
        break;
    case 32:
        videoView.setVideoPath("https://video.fcmn1-1.fna.fbcdn.net/v/t42.1790-2/10000000_275278384451818_6516163877002378180_n.mp4?_nc_cat=106&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeEA1EsA_BESqoA45UGe27vJw-_spUJeSc3D7-ylQl5Jzd2vt_UJZSH39getlpJ5oHVJREYMnD4nat79iAYIzccr&_nc_ohc=Byimd9S3qloAX_RdRAH&_nc_rml=0&_nc_ht=video.fcmn1-1.fna&oh=00_AT-bxg5QhXMO-memzqzClAlPiEOZfef_lFjU70dxuVstmw&oe=6267FE71");
        videoView.start();
        break;
    case 33:
        videoView.setVideoPath("https://video.fcmn1-1.fna.fbcdn.net/v/t42.1790-2/10000000_829845780971841_413708829449053364_n.mp4?_nc_cat=110&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeFByaaiG5SAKosxugABehltQcxB_dtzegNBzEH923N6A6EVOhChIu1tJSO6CoyTWHO-V45MnSmTJo2X5tdvDvKH&_nc_ohc=ZOSKZ2JXJJcAX-3ilmn&_nc_rml=0&_nc_ht=video.fcmn1-1.fna&oh=00_AT_D0VVthY3ZjC-KeGrGgaSrGj3VtyCrtdgYIYm2SJ3PkA&oe=6267FC5E");
        videoView.start();
        break;
    case 34:
        videoView.setVideoPath("https://video.fcmn1-1.fna.fbcdn.net/v/t42.1790-2/10000000_396486281903079_6915583241435574410_n.mp4?_nc_cat=106&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeG2jQE0Qpoo1HYN7JhA8bCBaKjvV-9PIM5oqO9X708gzkNGedxQQI4KvV7GtGHwtkaYyE_m4SnSHWinXh-Qd5Po&_nc_ohc=cZh8c7uhtusAX96tQUj&tn=DlNxON8970ttwinE&_nc_rml=0&_nc_ht=video.fcmn1-1.fna&oh=00_AT-T6SrtQp5i8oJMj6O7Gi-EK3rcEoiAjnNJvx6O4LnAKQ&oe=6267FA7C");
        videoView.start();
        break;
    case 35:
        videoView.setVideoPath("https://video.fcmn1-2.fna.fbcdn.net/v/t42.1790-2/10000000_3012707782390367_6999307178238159548_n.mp4?_nc_cat=108&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeENmHr16g1-1aByQJdBTNFwcjMJS-v0cZRyMwlL6_RxlMpyNvbVndWXFSvpxjvd8MreTV89VQrol1rrSbz33ASG&_nc_ohc=EHzxJvBNrEQAX8-LnR_&_nc_oc=AQmL6B0Dq8fatT09Fq62_ilEAlvyFcC-nfHaf23wpdD7u7NXoCN9az2cwVOfNkyxAmg&_nc_rml=0&_nc_ht=video.fcmn1-2.fna&oh=00_AT8OiP2ocpdKdmTMpFEJCOusy00AwwUT331sdWqfDMkyXA&oe=6268056A");
        videoView.start();
        break;
    case 36:
        videoView.setVideoPath("https://video.fcmn1-1.fna.fbcdn.net/v/t42.1790-2/10000000_583060159552278_1531824362177838056_n.mp4?_nc_cat=107&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeFfvDOIR7f4UVrW_Qn4CrBgGkbr6NBJxiwaRuvo0EnGLFS7t5tj0lsv5OpWkymNPSnFybuZlf6BldsftCrorQOH&_nc_ohc=PUICfzEs7KQAX-BhWw0&_nc_oc=AQmIGZBAbsFq4vHgXOoJ5cmee_MZKsaLkTf5UTu39Ny6oYg_dtPs_6d_ecOfe2VLBb4&_nc_rml=0&_nc_ht=video.fcmn1-1.fna&oh=00_AT-4UqTgzTBl0stEplktfKGn0SCJhkJbrtujqlL__qWdlw&oe=6267FDFF");
        videoView.start();
        break;
    case 37:
        videoView.setVideoPath("https://video.fcmn1-1.fna.fbcdn.net/v/t42.1790-2/10000000_240142581192163_8292422005759640875_n.mp4?_nc_cat=107&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeE9CKnacLdYNU1jw6VbNE6AmtVND5cc0b2a1U0PlxzRvUUEtV1VKGwnJRnCKHOS6nvzCfYFPapIgpc6wX_53Kmv&_nc_ohc=x8HGf6xQ5XcAX-LXPnF&_nc_rml=0&_nc_ht=video.fcmn1-1.fna&oh=00_AT-xXDyn041rIJxUpshC43WVmbKUArJoWMcgZDUCn6bgpg&oe=6267F9E4");
        videoView.start();
        break;
    case 38:
        videoView.setVideoPath("https://video.fcmn1-2.fna.fbcdn.net/v/t42.1790-2/10000000_256740506267662_6604589853117158459_n.mp4?_nc_cat=108&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeGMkxuNGA93sfHX-RnorFqNzVO9D3uDeJHNU70Pe4N4kafBTrNT8-Anzo6Dp_q8IDcH5Dwxike5f3IxhWtKvQ6Y&_nc_ohc=tWFbclzhdR4AX-QjnZ4&_nc_rml=0&_nc_ht=video.fcmn1-2.fna&oh=00_AT_AmyX7MnWSWgcC7OqJqKy9gt3aeAgjoqt7By0hpIWB0A&oe=6267FA42");
        videoView.start();
        break;
    case 39:
        videoView.setVideoPath("https://video.fcmn1-2.fna.fbcdn.net/v/t42.1790-2/10000000_529313454956600_2000475046001541564_n.mp4?_nc_cat=103&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeEAXAJ7K7yAcXYBr7QFq4PGtzLwrx9sVmu3MvCvH2xWaydv-b6AgIDVbB_k8JMI3ZtdiBLCawYIsT0GhBwDKBtp&_nc_ohc=zGy2BPTX77oAX-P-pzu&_nc_rml=0&_nc_ht=video.fcmn1-2.fna&oh=00_AT8GyPbZdwPfVs3_xFqF3vgacE2kYzRhQTvl3IyE4QEOVw&oe=62680673");
        videoView.start();
        break;
    case 40:
        videoView.setVideoPath("https://video.fcmn1-1.fna.fbcdn.net/v/t42.1790-2/10000000_519505739142847_699246387281927277_n.mp4?_nc_cat=102&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeFYNAJ7FhM77o0MK-hPuMAMbwfTtgwSMSZvB9O2DBIxJq6zZrF9wtx84drgxQsfsrQ8bVhXF2lwzCEXgmpCARra&_nc_ohc=gzempL8X9mkAX8pLAZh&_nc_rml=0&_nc_ht=video.fcmn1-1.fna&oh=00_AT9Y9O9kF04HFy4mr1x1E4H0HliYiTbd9gPoH9I0SkAgbQ&oe=62680593");
        videoView.start();
        break;
    case 41:
        videoView.setVideoPath("https://video.fcmn1-2.fna.fbcdn.net/v/t42.1790-2/10000000_872767580030512_3785171214581489851_n.mp4?_nc_cat=109&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeFnGHr4cdBmlTK9ID8zIIqddpWCeZQGn9t2lYJ5lAaf2-bzpMPOHHSd7qShs-apzFqe0ghxBregBFoXUYKut4Pp&_nc_ohc=5FkGOjhYGhYAX9L1dr5&_nc_rml=0&_nc_ht=video.fcmn1-2.fna&oh=00_AT8NSX97HWAV7hyDIiMD55ruiKR6lEDmNJb71Avz-eP9zw&oe=626807A5");
        videoView.start();
        break;
    case 42:
        videoView.setVideoPath("https://video.fcmn1-2.fna.fbcdn.net/v/t42.1790-2/10000000_146614034253511_7002968595538993349_n.mp4?_nc_cat=105&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeFYWOlkCBFmkqcN1_ci-Ib8Oua8Gdo8Awk65rwZ2jwDCV5xNHDPL3UaL3f_Ux9_Q7dJSnzCmxXvRWiTzwbj0Svx&_nc_ohc=GgptXq_vX0MAX85D53x&_nc_rml=0&_nc_ht=video.fcmn1-2.fna&oh=00_AT98t3rer7MyEi7VrlyXnOcpiwckbVFuvhTLK1L8s8yVug&oe=6267FF89");
        videoView.start();
        break;
    case 43:
        videoView.setVideoPath("https://video.fcmn1-1.fna.fbcdn.net/v/t42.1790-2/10000000_561141578230949_7341771222233310681_n.mp4?_nc_cat=110&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeEGYr1AJescCldytLuziQPo9QiyWrQ0lmP1CLJatDSWYyEP_1GcienKWjrGYnGa6Yqz1knD4zHuqWGwrhuFRJIk&_nc_ohc=aJO7LPF1jioAX8UGr0P&tn=DlNxON8970ttwinE&_nc_rml=0&_nc_ht=video.fcmn1-1.fna&oh=00_AT95eWjooQHABG-nA3U9NwwuwtPzchUpWDEYmvA6yISCyg&oe=626808DB");
        videoView.start();
        break;
    case 44:
        videoView.setVideoPath("https://video.fcmn1-1.fna.fbcdn.net/v/t42.1790-2/10000000_4191630754284387_1133273391844794528_n.mp4?_nc_cat=104&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeEWX0qu-6hYDtajiObLGLeodjJHs93zjAx2Mkez3fOMDP4j_ZFIVypGeUuNkxBHeMakQAHBbe1wfO0ATy0AeL-R&_nc_ohc=3edjEsvhTCEAX8mrymA&_nc_rml=0&_nc_ht=video.fcmn1-1.fna&oh=00_AT9h8z22KCJlY9eWkwm9T2wIHGFTrTWZoCuv8wVTPUDzkg&oe=62680078");
        videoView.start();
        break;
    case 45:
        videoView.setVideoPath("https://video.fcmn1-1.fna.fbcdn.net/v/t42.1790-2/10000000_164954618958178_8192511823197092159_n.mp4?_nc_cat=101&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeFi2ETy18bLRsKOgDCZvCycan_UzjmKpQlqf9TOOYqlCVOGddRJz3-K-Vf8As8SU1mmT52kcFPNMUqHrds_emE-&_nc_ohc=kF5O8d5DS1QAX8Z91nB&_nc_rml=0&_nc_ht=video.fcmn1-1.fna&oh=00_AT-cUKok2i23Qk6bMa_aBdMMS7aPIByaJ-2vH0iGuCrRaw&oe=626804FB");
        videoView.start();
        break;
    case 46:
        videoView.setVideoPath("https://video.fcmn1-2.fna.fbcdn.net/v/t42.1790-2/10000000_330310935312098_2751765235609758033_n.mp4?_nc_cat=105&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeEBK6OHlxhc3vLSO-LGZhxqtoG-OZp44Kq2gb45mnjgqv1V-8Jx-az9f2q6epXOE529gHq_xMvZnUh9OtMC8ua9&_nc_ohc=mCpXSYFHdH4AX-aSH4G&_nc_rml=0&_nc_ht=video.fcmn1-2.fna&oh=00_AT-JO6qkQVJALcnezbNmFBChlS8hpo1mb7mzTnSFzZVwPA&oe=62680478");
        videoView.start();
        break;
    case 47:
        videoView.setVideoPath("https://video.fcmn1-1.fna.fbcdn.net/v/t42.1790-2/10000000_309901557556656_5743130666720958360_n.mp4?_nc_cat=106&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeHgSShqVB8ftF66524VUAVXH9uD8bpylOMf24PxunKU400t3aT1gSen6zodPSZu_s5qGkAz--wVNmODf5jXv9sL&_nc_ohc=KXX5gu0dGHUAX83Fy3K&_nc_rml=0&_nc_ht=video.fcmn1-1.fna&oh=00_AT_fA09StlaaEqep2eDPHhrHpazchV24emG_9QWa1xh1wg&oe=626806EB");
        videoView.start();
        break;
    case 48:
        videoView.setVideoPath("https://video.fcmn1-2.fna.fbcdn.net/v/t42.1790-2/10000000_111263574613420_5553092356819460854_n.mp4?_nc_cat=103&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeFWNyuKkK-Iu_4PO1ODYXTv80T7Z8Kw9u_zRPtnwrD27-jKDNNQ2LTiHU4rbbjwleAD5c272IUHLUX63iQ7QIui&_nc_ohc=6Dt25y73Xu4AX_sYPVC&tn=DlNxON8970ttwinE&_nc_rml=0&_nc_ht=video.fcmn1-2.fna&oh=00_AT9m8ByjaR8bKi_6H1nC4yCnnXKeH-2Bh7FuUQZ9EArQgA&oe=62680569");
        videoView.start();
        break;
    case 49:
        videoView.setVideoPath("https://video.fcmn1-2.fna.fbcdn.net/v/t42.1790-2/10000000_1481627268871038_751070883918426414_n.mp4?_nc_cat=100&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeHNPdt_L8zpjJZu5wY_LrQq2aq91cLKSeLZqr3VwspJ4qygSAfOA2c6qxtBssf4Boi9JfQlDeQLccbfD-uai1jA&_nc_ohc=S6_j4YSj4GgAX-ztd3y&_nc_rml=0&_nc_ht=video.fcmn1-2.fna&oh=00_AT8Ke1fmKGMD9RY8CPHzTTK3v0saCCzFojqqtJvqSJIc1w&oe=6267FD8A");
        videoView.start();
        break;
    case 50:
        videoView.setVideoPath("https://video.fcmn1-1.fna.fbcdn.net/v/t42.1790-2/10000000_444892503334621_8276591982377265389_n.mp4?_nc_cat=110&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeF8UsfF9-S80-N87MpLtA5QsqEyV5j3TI-yoTJXmPdMj4uQxZLTmn9Y937UL38_GRxg_3VutUoGxkvpdN8fEvoK&_nc_ohc=Njy3MlPaEF8AX8pfMRI&_nc_rml=0&_nc_ht=video.fcmn1-1.fna&oh=00_AT99DjsA3iXeFBj_U7Rq97rkkIgam35KTkJ_4plF8kE5Hw&oe=6268093F");
        videoView.start();
        break;
    case 51:
        videoView.setVideoPath("https://video.fcmn1-1.fna.fbcdn.net/v/t42.1790-2/10000000_1624721141252709_1398467455574664817_n.mp4?_nc_cat=110&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeG8aHJY6coWmB8wkNPqeqLiunWhX-tmdw26daFf62Z3DUby_4khmgXNiHKbxC9cThXh7a6D_AcDnMPpkGn7A6mA&_nc_ohc=WCD5_kC1UDcAX8Sjp_J&tn=DlNxON8970ttwinE&_nc_rml=0&_nc_ht=video.fcmn1-1.fna&oh=00_AT-sk0-I9RbUxUJcTVEPD7PJ63ICr5CNiW4kBchAKYZS9w&oe=626805F6");
        videoView.start();
        break;
    case 52:
        videoView.setVideoPath("https://video.fcmn1-2.fna.fbcdn.net/v/t42.1790-2/10000000_206405554874207_868619885532103558_n.mp4?_nc_cat=109&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeFQha7oMnmh5LHbIYVqKWsOc6JL0qxfWVZzokvSrF9ZVkUDHEcQq_40z6whFQ6Frvn36oV9tiNllZb50JHaHreM&_nc_ohc=Yp2FTa56tVIAX8PSTgi&_nc_rml=0&_nc_ht=video.fcmn1-2.fna&oh=00_AT_4BdRRoEsmfm3Cn92qsyyJ4ynpekyvHCr7zdTltbyIAA&oe=62680A85");
        videoView.start();
        break;
    case 53:
        videoView.setVideoPath("https://video.fcmn1-2.fna.fbcdn.net/v/t42.1790-2/10000000_114690434250984_2028970123772492972_n.mp4?_nc_cat=103&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeHYO7rdweEQlYRnTsMeUMAeRMlAhoIBAYJEyUCGggEBgkolz_N7cPIuPVpMiZC070ibi03C5tdGp_IMPywWnAy8&_nc_ohc=A6Bfm0228I0AX95aGtT&_nc_rml=0&_nc_ht=video.fcmn1-2.fna&oh=00_AT9YGVMuWvdXOwlXeIr4D7fUMbF5TZ_BKMO5JCczPShpsg&oe=62680560");
        videoView.start();
        break;
    case 54:
        videoView.setVideoPath("https://video.fcmn1-1.fna.fbcdn.net/v/t42.1790-2/10000000_548813199781874_6344611986437622578_n.mp4?_nc_cat=107&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeE9cwJwcFdsF2AzTiMcnffn6c6AdZ-npgzpzoB1n6emDOxQDpe-fr9DpjGHGwMjS7x5SC9j1TBwnFObO_TPY0Ko&_nc_ohc=sZYdqXDPZc8AX866Ama&tn=DlNxON8970ttwinE&_nc_rml=0&_nc_ht=video.fcmn1-1.fna&oh=00_AT9eHBhvTOdi2V8wWPHMxMH0DhPf9mR8nFHhKNgXiAw9mQ&oe=626800F6");
        videoView.start();
        break;
    case 55:
        videoView.setVideoPath("https://video.fcmn1-1.fna.fbcdn.net/v/t42.1790-2/10000000_3042845875950848_2161448443923867391_n.mp4?_nc_cat=107&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeFw0dXtNClVx0OZJfftdPNcqPeNODdt1Jyo9404N23UnFJv_HbCjylm4sS-u326EF_JVEsY8C2zGHBSw5kPSi3W&_nc_ohc=yRLyDm8nxHEAX-mdm1Q&_nc_rml=0&_nc_ht=video.fcmn1-1.fna&oh=00_AT_IlUOtaF4rcSM_Ilp9a2XS4JiPA9aHVWdfzPTTOm6GFw&oe=62680413");
        videoView.start();
        break;
    case 56:
        videoView.setVideoPath("https://video.fcmn1-1.fna.fbcdn.net/v/t42.1790-2/10000000_558272395316375_6411887250355784507_n.mp4?_nc_cat=110&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeE5SW8EVRxFViWGAX5Vp4QVVXT4BxAZfz9VdPgHEBl_P_VpvkGwJeY32EMAU9KqemdPIDJlTZTdte_G32bhUABy&_nc_ohc=P0Hk-_TwFtYAX88fkAP&_nc_rml=0&_nc_ht=video.fcmn1-1.fna&oh=00_AT9_hEw3914bKei9sXxaemEIG7GXHTPbem2VvO04nszWsA&oe=626805C1");
        videoView.start();
        break;
    case 57:
        videoView.setVideoPath("https://video.fcmn1-2.fna.fbcdn.net/v/t42.1790-2/10000000_353656296206463_454996880113101805_n.mp4?_nc_cat=105&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeGTpHAF3uQ5ajALSrGl56kztlz_X3xx5cm2XP9ffHHlyYcQp1Xz8-kBtta6m9RrrP-q2jX8tfFSPA49jflenXgT&_nc_ohc=XMuGvSyLVj8AX82EmIb&_nc_rml=0&_nc_ht=video.fcmn1-2.fna&oh=00_AT8EEnfRp1X0ImqelwSvnqsBv4ipshJGboWtektY5xsKVg&oe=62680BA1");
        videoView.start();
        break;
    case 58:
        videoView.setVideoPath("https://video.fcmn1-2.fna.fbcdn.net/v/t42.1790-2/10000000_455675855476794_8775971021084399803_n.mp4?_nc_cat=111&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeGL1Nq3JTgyGy9RJSwgmK227TqhAb_Br8TtOqEBv8GvxM6utJk31PfcXMpEaHftLGzF6r4V4CCqMV1EXt3CKrmr&_nc_ohc=bL62odGX2sYAX_R6v2O&_nc_rml=0&_nc_ht=video.fcmn1-2.fna&oh=00_AT_DP9xtEz4nTzSU4l-lltvDWTsMkUwbWWrUAc81e0XpCA&oe=626803FF");
        videoView.start();
        break;

    default:
        break;




}
videoView.setMediaController(new MediaController(Abdrahman_Naboulsi_Activity.this));
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