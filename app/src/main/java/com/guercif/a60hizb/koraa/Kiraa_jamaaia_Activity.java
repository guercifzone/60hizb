package com.guercif.a60hizb.koraa;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.MediaController;
import android.widget.VideoView;

import com.guercif.a60hizb.R;

import java.net.URL;
import java.util.ArrayList;
import java.util.Map;

public class Kiraa_jamaaia_Activity extends AppCompatActivity {
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
        videoView =findViewById(R.id.list_video);
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
                        videoView.setVideoURI(Uri.parse("https://web.facebook.com/sadik.fattah.7/videos/697446100704893"));
                        videoView.start();
                        break;
                    case 1:
                        videoView.setVideoPath("");
                        videoView.start();
                        break;
                    case 2:
                        videoView.setVideoPath("https://video.fcmn1-1.fna.fbcdn.net/v/t42.1790-2/10000000_539534480506317_177227402503913448_n.mp4?_nc_cat=106&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeHT0HxKaGnLowX1nEujYxxprYH1SrQJDn2tgfVKtAkOfaFvYqQNnNS8EoDVOgNP-d-mGIzr-f6AmPgJI9lgbGs8&_nc_ohc=vGP5y--O0FIAX-9W9XI&_nc_oc=AQmap-c-XZHZfZmDP92R_24UEbCgXQ3SeSAiC0qichD-kn8kRYDRx5_zTiAliQ9Gp9A&tn=DlNxON8970ttwinE&_nc_rml=0&_nc_ht=video.fcmn1-1.fna&oh=00_AT_ty2iCGt0l-yd0qUwA4GopSkOYgUtrL5g1So5PM11rYw&oe=62683A87");
                        videoView.start();
                        break;
                    case 3:
                        videoView.setVideoPath("https://video.fcmn1-2.fna.fbcdn.net/v/t42.1790-2/10000000_140051908444753_1704175961187276097_n.mp4?_nc_cat=109&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeGYuAZAtF9Qc8IykCLjhnPwkVi3Jcw7b8-RWLclzDtvz8DKoMEMryhQa2XX3Q8Fb3XwidOcUj73mb0O1f-xUBPC&_nc_ohc=NU9A7P5T_n8AX8Qy2A_&_nc_rml=0&_nc_ht=video.fcmn1-2.fna&oh=00_AT-WqmwY4-v1sSq2PPBSzV3SBOaIL9HY3PM-MDJx3m_Sow&oe=6268346F");
                        videoView.start();
                        break;
                    case 4:
                        videoView.setVideoPath("https://video.fcmn1-1.fna.fbcdn.net/v/t42.1790-2/10000000_382628383501596_3793173637999539143_n.mp4?_nc_cat=106&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeGu7LtSQq0j5r4hGKy-AfGOAjIhwJLI4IYCMiHAksjghhqdkX5e4zERstAVXnMaZ4qNxH6_uuKb0-qMnbqa8vbQ&_nc_ohc=PdfsObuL5wQAX_4pfmj&_nc_rml=0&_nc_ht=video.fcmn1-1.fna&oh=00_AT-bpMpo8RR8UQb3IpvnHnJdRDfy01FcO2p9PSqhFHpU6A&oe=62683207");
                        videoView.start();
                        break;
                    case 5:
                        videoView.setVideoPath("https://video.fcmn1-2.fna.fbcdn.net/v/t42.1790-2/10000000_230267522623082_3799781599630426433_n.mp4?_nc_cat=103&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeEiV4JtYNHRUBe067lKz7_HsE-4_41wHTawT7j_jXAdNk9rUad06VcWZjL0yUaEx8iF-ZH6mNr6DkFZ-K5JBTV3&_nc_ohc=z3_FniylJYkAX-KEHwX&_nc_rml=0&_nc_ht=video.fcmn1-2.fna&oh=00_AT-J7tK9e98XM7-h71qnt6jo3AZL-einQvJF5-9tUlqC7A&oe=626832B1");
                        videoView.start();
                        break;
                    case 6:
                        videoView.setVideoPath("https://video.fcmn1-2.fna.fbcdn.net/v/t42.1790-2/10000000_122733473513718_7647593259153666815_n.mp4?_nc_cat=103&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeEzZgdUjtVp0LsfPPtk1G2d9JYl_fdT7kj0liX991PuSDcUgQN7vzcxF4uubhmd10FghF3gqBpWS9q3wZfqvr8-&_nc_ohc=ljxeG9lP4WUAX90leI8&tn=DlNxON8970ttwinE&_nc_rml=0&_nc_ht=video.fcmn1-2.fna&oh=00_AT_80Y6ASE0KDl-l63JyyK4Pslbf5rHVSdes9bA-pR9J_A&oe=62683DAF");
                        videoView.start();
                        break;
                    case 7:
                        videoView.setVideoPath("https://video.fcmn1-2.fna.fbcdn.net/v/t42.1790-2/10000000_1160710537997605_7478546129942334641_n.mp4?_nc_cat=100&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeFYR4ARuAXP9BZK-y1gsAoS3pXdGcZu-23eld0Zxm77bdf2dF4hJrkDZF_StZecqjxsVZBRoF9q6WW8jwirNjBC&_nc_ohc=ZIl2JUuiNRMAX-l9SsR&tn=DlNxON8970ttwinE&_nc_rml=0&_nc_ht=video.fcmn1-2.fna&oh=00_AT9JEIVALGpG-D_5X_nxZECvcIJZQWZBYbMCLCj3JTFZzg&oe=62683D60");
                        videoView.start();
                        break;
                    case 8:
                        videoView.setVideoPath("https://video.fcmn1-2.fna.fbcdn.net/v/t42.1790-2/10000000_468950727919914_634421984297944264_n.mp4?_nc_cat=100&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeHxxTmThqzRWubnLz7X5LgmqvxnTToUmZ-q_GdNOhSZn_udVXK_R4lTRMbqbf8uXylNnk9uHC4XXjFpdMVWsfCD&_nc_ohc=B1UcPR-fs9kAX-CVMLF&_nc_rml=0&_nc_ht=video.fcmn1-2.fna&oh=00_AT-kH7J9EUxcc9GDL96BL2u4tTRbv8w8QJg3L-nUaJjWOg&oe=62683666");
                        videoView.start();
                        break;
                    case 9:
                        videoView.setVideoPath("https://video.fcmn1-2.fna.fbcdn.net/v/t42.1790-2/10000000_265051249056264_1111805407993312037_n.mp4?_nc_cat=109&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeGIqoUNCqyLOyHYVKwLs8_IzqGTqgq4roDOoZOqCriugOUEfvrLU_OhSxKhHjZmJ4hT4Z_vKjxxck0q0GmXkrrY&_nc_ohc=w4MKCrH9VVQAX_0TH0u&_nc_rml=0&_nc_ht=video.fcmn1-2.fna&oh=00_AT_2AIB3RhTa215O1aylVWagM7sNop4kPjKUMphYfijtmA&oe=62683D77");
                        videoView.start();
                        break;
                    case 10:
                        videoView.setVideoPath("https://video.fcmn1-1.fna.fbcdn.net/v/t42.1790-2/10000000_951166635745789_4038612741463154043_n.mp4?_nc_cat=102&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeHm0JHOXqxXUtLUKhFyiTS7QjQDuoJDBGtCNAO6gkMEa2c728tiGgiPDZfbAc5bt7z2dR6q_zX4056DoduK9aVW&_nc_ohc=Z5H8EenyQVoAX_nmCW7&_nc_oc=AQm1_ZCrtJg8uj_qj3sCPo-brKsbzOVvJIMbsjj6qeClc4KFdzTSv-HmxqZiKZIJOrA&_nc_rml=0&_nc_ht=video.fcmn1-1.fna&oh=00_AT-FL5Z3jIBuk1sPqeRIOVyDjDSV1sunmSBNBSJ2IlKbGQ&oe=626839A0");
                        videoView.start();
                        break;
                    case 11:
                        videoView.setVideoPath("https://video.fcmn1-2.fna.fbcdn.net/v/t42.1790-2/10000000_8218438218182469_2021057398371231904_n.mp4?_nc_cat=100&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeFy-g5gDc5Sy-mtn6e0JBp_sA3oFwmXqJOwDegXCZeok-FaMgbxlpXga5HjP2WHaU4DbrDBajDpfbY6BCvQyqgR&_nc_ohc=uWlYFtbwEM0AX_xU4HD&tn=DlNxON8970ttwinE&_nc_rml=0&_nc_ht=video.fcmn1-2.fna&oh=00_AT9sBjZx7P89WYzaS54gs8fWEhtG0OGivIf1iZLZ78YAFg&oe=62683D08");
                        videoView.start();
                        break;
                    case 12:
                        videoView.setVideoPath("https://video.fcmn1-1.fna.fbcdn.net/v/t42.1790-2/10000000_925214678088104_5226708180936010885_n.mp4?_nc_cat=101&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeHP_GfQuAFbOtLBeF2gQhuXCfIy0Yun2PQJ8jLRi6fY9CiFiJnZMS8qexWp6UqcS0zDOexw90YH-1MmLpA4_pj7&_nc_ohc=d66xFrHuqiwAX_D-chQ&tn=DlNxON8970ttwinE&_nc_rml=0&_nc_ht=video.fcmn1-1.fna&oh=00_AT8ULy1dEJ8FZR7v_bmwg1WYVdVCO86snwsNNdmldapVwA&oe=62683E5C");
                        videoView.start();
                        break;
                    case 13:
                        videoView.setVideoPath("https://video.fcmn1-2.fna.fbcdn.net/v/t42.1790-2/10000000_550952152862145_14880384114950392_n.mp4?_nc_cat=103&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeGDIJghYGaZ7WQeuA0_1r-3qlCTwbGdRS-qUJPBsZ1FLyzQ10fJHRGxVFcLUpY6gweyYu0kNgzCqcPqj8z6Fq9F&_nc_ohc=tw6Wx2Xh2JwAX-c27-9&_nc_rml=0&_nc_ht=video.fcmn1-2.fna&oh=00_AT89KC6srUagioqWKG9C5X42BZF4mfPNRPO9RwHjom_D4g&oe=62683A74");
                        videoView.start();
                        break;
                    case 14:
                        videoView.setVideoPath("https://video.fcmn1-1.fna.fbcdn.net/v/t42.1790-2/10000000_601656474380941_4817013022245487561_n.mp4?_nc_cat=101&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeFSwV6dl-wzwyeFcFLUd4MBxPmwLvszLHPE-bAu-zMsc4XZkWJ4qM3yJkDCHJ7YvD1yykvLcHdzTShAhsuP8JUf&_nc_ohc=_4JcdIpmD5oAX-HZkXP&tn=DlNxON8970ttwinE&_nc_rml=0&_nc_ht=video.fcmn1-1.fna&oh=00_AT_f9h8F_kjugy_pyZQNExBmrkhx_-JYITMBrIvdF0QoSQ&oe=62683B71");
                        videoView.start();
                        break;
                    case 15:
                        videoView.setVideoPath("https://video.fcmn1-2.fna.fbcdn.net/v/t42.1790-2/10000000_2920355838226711_5792133924335399105_n.mp4?_nc_cat=108&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeFrOhAQPoIwxw3D8xyvLFBxyASiUIJsjBfIBKJQgmyMF3eq8n1LxWBEQgBukdNPe6qMuN8e5I2xWSo2cE-k_aLJ&_nc_ohc=hC3rmm6sF0sAX8--IO4&_nc_rml=0&_nc_ht=video.fcmn1-2.fna&oh=00_AT8XfkPlUtJf_qYsBsR9TUILEcUaYCsxAVTfs0ahqmG1iw&oe=62683DE7");
                        videoView.start();
                        break;
                    case 16:
                        videoView.setVideoPath("https://video.fcmn1-2.fna.fbcdn.net/v/t42.1790-2/10000000_467119761701813_6298415495795051129_n.mp4?_nc_cat=108&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeHE3y6pCqQizHviXhLDPVPRlMIuKtVyEG6Uwi4q1XIQbnpUwmjTNYWZGoK75D2C502CQ1pMna2AIV4IKkQo3OC8&_nc_ohc=LhI2k6O0eVwAX-BPBB4&_nc_oc=AQmZAje6tYc8EwToMlZktTwHg27CLthoX0TtuTxRRIQ28G013zOvYY2RhDcVolFXSJk&_nc_rml=0&_nc_ht=video.fcmn1-2.fna&oh=00_AT8ybRhuUxS-avIwnqnt21EbmZTXI-iECbNkQ7PbDfCx0g&oe=62683611");
                        videoView.start();
                        break;
                    case 17:
                        videoView.setVideoPath("https://video.fcmn1-2.fna.fbcdn.net/v/t42.1790-2/10000000_467119761701813_6298415495795051129_n.mp4?_nc_cat=108&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeHE3y6pCqQizHviXhLDPVPRlMIuKtVyEG6Uwi4q1XIQbnpUwmjTNYWZGoK75D2C502CQ1pMna2AIV4IKkQo3OC8&_nc_ohc=LhI2k6O0eVwAX-BPBB4&_nc_oc=AQmZAje6tYc8EwToMlZktTwHg27CLthoX0TtuTxRRIQ28G013zOvYY2RhDcVolFXSJk&_nc_rml=0&_nc_ht=video.fcmn1-2.fna&oh=00_AT8ybRhuUxS-avIwnqnt21EbmZTXI-iECbNkQ7PbDfCx0g&oe=62683611");
                        videoView.start();
                        break;
                    case 18:
                        videoView.setVideoPath("https://video.frba1-1.fna.fbcdn.net/v/t42.1790-2/10000000_4336260826492390_7737412718516135792_n.mp4?_nc_cat=109&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeGfvH6Ba5zz5U9a-OpZd2jkGYGt5y16UhwZga3nLXpSHFg8E2mi2SXREkoO7pR4Nx3GaevXYq8Xe6OaLNI97SHK&_nc_ohc=MrY0z9mo5usAX9FuAdz&_nc_rml=0&_nc_ht=video.frba1-1.fna&oh=00_AT_2SlrXlnfJBMDLADZbe7BnQQZ2VkPR6ws9Gqvx3R35tQ&oe=62683F7C");
                        videoView.start();
                        break;
                    case 19:
                        videoView.setVideoPath("https://video.frba1-1.fna.fbcdn.net/v/t42.1790-2/10000000_492321168771978_6167499279134938218_n.mp4?_nc_cat=111&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeFn_IP48KmrGrX1eR7UHk5MkrRgOagQD-mStGA5qBAP6QBMegXubVaGBbjzkuGp4dn-5V-0JJuQeNaiDk1-2EQZ&_nc_ohc=dtnVSS_BKAoAX9ElMUt&_nc_rml=0&_nc_ht=video.frba1-1.fna&oh=00_AT8LkPQcOfE7omYwZDtNXhzcA5gsFpGipiok0nUsNUNpUQ&oe=62683C6B");
                        videoView.start();
                        break;
                    case 20:
                        videoView.setVideoPath("https://video.frba1-1.fna.fbcdn.net/v/t42.1790-2/10000000_372902247505327_8440849075730890233_n.mp4?_nc_cat=106&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeF2cPhX0v-L4hltcBpi8jPafc8NL3WGIZ19zw0vdYYhnWAqN7NenKyuO19yzfLyjpHG40v-cKQeFaILNhRUG3xh&_nc_ohc=PWm8zrseefUAX-wFN9b&_nc_rml=0&_nc_ht=video.frba1-1.fna&oh=00_AT8q7wJsXHdg3mbfD-cFb5cSkGrNEfcwBZZPnHhCue6UFA&oe=626839BD");
                        videoView.start();
                        break;
                    case 21:
                        videoView.setVideoPath("https://video.frba1-1.fna.fbcdn.net/v/t42.1790-2/10000000_1129088694509021_374666843923068817_n.mp4?_nc_cat=103&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeFdAhxSS5MRtqeOQ48ciBd8tul0ZDLtudC26XRkMu250K25EFXr6DgZE_mkdrCs6cNvanCKt3NzLljTQW1jFoOc&_nc_ohc=ieD-IrBz9n0AX-BP3Ip&tn=DlNxON8970ttwinE&_nc_rml=0&_nc_ht=video.frba1-1.fna&oh=00_AT_u38qzvCMVaqKs3qp99PhCvyyQFOAfMeVynUiYmxwRPQ&oe=62683C66");
                        videoView.start();
                        break;
                    case 22:
                        videoView.setVideoPath("https://video.frba1-2.fna.fbcdn.net/v/t42.1790-2/10000000_1877419535763971_2682223041531371138_n.mp4?_nc_cat=101&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeE0nfEkpCfVs_tZgsFmBmXi7UjfYi7FZhPtSN9iLsVmE00Q2zfBJgp0G4KtGAtRA6kBc3xkcyF0paryAkKqxnrG&_nc_ohc=LhsTmpgPGiEAX8Ibdp1&tn=DlNxON8970ttwinE&_nc_rml=0&_nc_ht=video.frba1-2.fna&oh=00_AT9v48uwxxg7lUbdvJ2KYvJ3yUClXD6TJl_u-nnsXAYVgw&oe=62683EA1");
                        videoView.start();
                        break;
                    case 23:
                        videoView.setVideoPath("https://video.fcmn1-1.fna.fbcdn.net/v/t42.1790-2/10000000_616885769190429_8583157845019287562_n.mp4?_nc_cat=107&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeHoCpmSkkDsnL8ZWeoCpTmtBSiJt9a81XcFKIm31rzVd6BcP4QPxcsvype1W1dSQaaTq5D-CRQ-xn2oS0n3ZgMV&_nc_ohc=do02nWd0GVgAX8Y8phW&_nc_rml=0&_nc_ht=video.fcmn1-1.fna&oh=00_AT8ZAf14vYNLspXpZZmDqb-zKQ5hZo6PHbpziQe-mpft7w&oe=6268453A");
                        videoView.start();
                        break;
                    case 24:
                        videoView.setVideoPath("https://video.fcmn1-1.fna.fbcdn.net/v/t42.1790-2/10000000_415451939971384_6854737970862158064_n.mp4?_nc_cat=102&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeHcoVeDtCx910cRdMKlSqZlAnwN_uUzAR8CfA3-5TMBH2UCSR1iP98jpnxGA-wuCoCynhE2gG8H4MJ725Pw2Nd9&_nc_ohc=E7s6el6EnZcAX-N3JFJ&_nc_rml=0&_nc_ht=video.fcmn1-1.fna&oh=00_AT_oZdaBFg6v6l6Xq7QyOCsR7Eks7ua9CPMZIhU4sZ6VYA&oe=62683E84");
                        videoView.start();
                        break;
                    case 25:
                        videoView.setVideoPath("https://video.fcmn1-2.fna.fbcdn.net/v/t42.1790-2/10000000_4614438271925031_3652831813749997517_n.mp4?_nc_cat=108&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeFiBwWsObwVDFTqrmxj3k1edS3nbnqEAxB1LedueoQDEHIqxmrAouDYlXC7BHNJoTSYfLsW6fqDaCP927IBsOmP&_nc_ohc=-1wmbA_bA9YAX8_4wOI&_nc_rml=0&_nc_ht=video.fcmn1-2.fna&oh=00_AT_Gg-Dwvjp_IuOHL-HTGZfJlOt2jYBvtNh3KDk3h9XHqg&oe=6268425C");
                        videoView.start();
                        break;
                    case 26:
                        videoView.setVideoPath("https://video.fcmn1-2.fna.fbcdn.net/v/t42.1790-2/10000000_349331983287766_7227672708927690162_n.mp4?_nc_cat=109&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeEszMy9P_ti0PMAc8pMysQmHOb7syB-Vm0c5vuzIH5WbZnuaF5f_GrpLJa3T3hSaQlqiheRdTfpqlk-RPecIOCA&_nc_ohc=1XzaTHlmIAoAX_SorWI&_nc_rml=0&_nc_ht=video.fcmn1-2.fna&oh=00_AT_Emu5fyhhz0hKLuZn_xKrKJqIHOV-6wPhtie5ZBC5MCw&oe=62683B4D");
                        videoView.start();
                        break;
                    case 27:
                        videoView.setVideoPath("https://video.fcmn1-1.fna.fbcdn.net/v/t42.1790-2/10000000_440037284237190_7742952243563548244_n.mp4?_nc_cat=106&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeFWp1mffl3EK9rjn5ao-Zo6rnKpRb1X5wiucqlFvVfnCAcvDpwC3asn84pf8bO8uMvAY91FIPcSQHqvHcRSOIE-&_nc_ohc=1CW4O-KZMI4AX_OL5L6&_nc_rml=0&_nc_ht=video.fcmn1-1.fna&oh=00_AT9qJriC8MlcJMoB71TIsgCB5rUj3QV869FY8Ed9DaHzQg&oe=62683BF8");
                        videoView.start();
                        break;
                    case 28:
                        videoView.setVideoPath("https://video.frba1-1.fna.fbcdn.net/v/t42.1790-2/10000000_594642041704602_1013911834543033998_n.mp4?_nc_cat=102&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeGLwELQRlR7MrrFix6JA1xYswSFrpKQu6KzBIWukpC7ojbKa8ezOIAiy1vVJs2ssmtfETPQ_fO5b-pSxGmu0958&_nc_ohc=BhtXwa3RI0sAX9DWns_&_nc_rml=0&_nc_ht=video.frba1-1.fna&oh=00_AT9wgzHfjImPxXTqB0RCGN7TzKv4Dq7j2Vad9OKuxSSzdg&oe=62684328");
                        videoView.start();
                        break;
                    case 29:
                        videoView.setVideoPath("https://video.frba1-2.fna.fbcdn.net/v/t42.1790-2/10000000_967637117191219_2376960718876537761_n.mp4?_nc_cat=101&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeFf56kxhgy2IDS9YXZptzVA7csYBYMQc7rtyxgFgxBzupgRH2-7ODtRR39n_U3D1pfFr1Pji6Edn1sdCM3m6Qcu&_nc_ohc=cOdzBCWVbf8AX8P2z-I&_nc_rml=0&_nc_ht=video.frba1-2.fna&oh=00_AT_hzgknKGdSXv8ScaQem_QSU6Axpkn2MgJVpPAj-QCCsg&oe=62683DBB");
                        videoView.start();
                        break;
                    case 30:
                        videoView.setVideoPath("https://video.frba1-1.fna.fbcdn.net/v/t42.1790-2/10000000_377967297464700_1234974405257873650_n.mp4?_nc_cat=103&ccb=1-5&_nc_sid=985c63&efg=eyJxZV9ncm91cHMiOlsic2RfdW5tdXRlZF9xZV9jb250cm9sIl0sInZlbmNvZGVfdGFnIjoic3ZlX3NkIn0%3D&_nc_eui2=AeGT7mv1fl4Ofpl-oHEguWS7_v11zUHDCuf-_XXNQcMK5zlLH8r6OgyPZd0XrEvHBK98aBN31s0QrV5qTG1LwLxZ&_nc_ohc=xTlSrFCxzzAAX_cbK9P&_nc_rml=0&_nc_ht=video.frba1-1.fna&oh=00_AT86MUpmZhXFHxsJvL1rMbRn0Z6RqqVWo2esfP8GzsAJcQ&oe=62684544&cbk=1");
                        videoView.start();
                        break;
                    case 31:
                        videoView.setVideoPath("https://video.frba1-2.fna.fbcdn.net/v/t42.1790-2/10000000_2958698854443777_4074577769658783154_n.mp4?_nc_cat=100&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeF4ng7apO1LrQoy0Y8s-_kvn51-BSrINQOfnX4FKsg1A7iGdb0WQy7xYdjVnQ1jeOs7NhL6EuhOGaG2QvRRlX3Q&_nc_ohc=sQjxEur5tUkAX_mhgyC&_nc_rml=0&_nc_ht=video.frba1-2.fna&oh=00_AT8khHNKrTazaa9tpPzPRAOQ4opOKa_hK8ICzjn5mtN-Kg&oe=62684079");
                        videoView.start();
                        break;
                    case 32:
                        videoView.setVideoPath("https://video.fcmn1-2.fna.fbcdn.net/v/t42.1790-2/10000000_1049200812539142_3710753134832516523_n.mp4?_nc_cat=108&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeHcdLJki4Vwf2DMrFPcPdNbvrN0APhlwK--s3QA-GXArw2YhWwyocJsc9iHu212nz8iXThpQVpsnDYzPSmQoH4W&_nc_ohc=BTf0-p6fNfEAX9Az-Up&_nc_rml=0&_nc_ht=video.fcmn1-2.fna&oh=00_AT9lX-Rc7Le5v28fOupqiACTfBbR78cK5YwUqFkDiIvmGg&oe=6268410F");
                        videoView.start();
                        break;
                    case 33:
                        videoView.setVideoPath("https://video.fcmn1-2.fna.fbcdn.net/v/t42.1790-2/10000000_263166135911737_5911238604437406466_n.mp4?_nc_cat=103&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeHhS_gGgvT8qHhicyOcuBIlPihz-H33c4o-KHP4ffdziqIPzZdcUeHcYMDIEvJFw0wxEwrYuGXQd8m-uzd-fgBP&_nc_ohc=xlNucrnESyAAX_QmGFi&tn=DlNxON8970ttwinE&_nc_rml=0&_nc_ht=video.fcmn1-2.fna&oh=00_AT8A6d3S-zO8JATk86r90uJkCB7tZnhKYuQGceY91Xc82g&oe=6268443C");
                        videoView.start();
                        break;
                    case 34:
                        videoView.setVideoPath("https://video.fcmn1-1.fna.fbcdn.net/v/t42.1790-2/10000000_5582609475087710_1563257179976190123_n.mp4?_nc_cat=102&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeHxrivbYnc4SZUhnSFIbSBLd6mrOkATP0Z3qas6QBM_RqmrJg57HiVMYdoELiMFT-DlDIksERF5S1jpndhC5TUh&_nc_ohc=ajGHFquAG_oAX_0gOKU&tn=DlNxON8970ttwinE&_nc_rml=0&_nc_ht=video.fcmn1-1.fna&oh=00_AT8TSrrtx-GsCl6mzN_jSaJlM600VDH6g5MVl4mpx3IfIQ&oe=6268445A");
                        videoView.start();
                        break;
                    case 35:
                        videoView.setVideoPath("https://video.fcmn1-1.fna.fbcdn.net/v/t42.1790-2/10000000_2888107014779653_3852096769083705491_n.mp4?_nc_cat=101&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeFp2qYRMqJlMO7i4rMlQvdq-fnYRtoet4f5-dhG2h63hzh9Z-GCVpqV--0UBzBFjuM0G-8l74j5CCVJ6SYN8Sqe&_nc_ohc=HUs-dMLML6kAX_yRSar&_nc_rml=0&_nc_ht=video.fcmn1-1.fna&oh=00_AT-RYqmUfIl-SrH_YHGxfePLSJdRUD_UglfyJwtpgrFRyQ&oe=626845A6");

                        videoView.start();
                        break;
                    case 36:
                        videoView.setVideoPath("https://video.fcmn1-2.fna.fbcdn.net/v/t42.1790-2/10000000_1003586660374865_8561768409659264918_n.mp4?_nc_cat=103&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeEtQYRw9tkLsEA8CYQ3yyyp2vZ_FTpreOra9n8VOmt46l2N6KrzAnBznflHp9Ew46Qr6Ebhis9bVZVVr6d-YovY&_nc_ohc=GiX8Qrzsj1cAX97D68Y&tn=DlNxON8970ttwinE&_nc_rml=0&_nc_ht=video.fcmn1-2.fna&oh=00_AT_cxEFqDtnaZV05hCv1Jtb7ZUJ-0-K1e1b1zZtvtePZ7w&oe=6268444A");
                        videoView.start();
                        break;
                    case 37:
                        videoView.setVideoPath("https://video.fcmn1-1.fna.fbcdn.net/v/t42.1790-2/10000000_142569084805321_4996554201443253419_n.mp4?_nc_cat=110&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeHdpfTU3KSdPtoBBd2FRyqjL86FOqo6b7MvzoU6qjpvs__nn4uUXmoKKnVkMz1uTdzYl2sseCgIhQGemdhT7HT2&_nc_ohc=zYrE5iEbCRUAX-eFd6t&_nc_rml=0&_nc_ht=video.fcmn1-1.fna&oh=00_AT-N0M3xQ-LiBZCilrsQp-ER3jFyv5coZ400ggDsZs_qdw&oe=62683CA2");
                        videoView.start();
                        break;
                    case 38:
                        videoView.setVideoPath("https://video.fcmn1-2.fna.fbcdn.net/v/t42.1790-2/10000000_438348461379305_5917363051348136816_n.mp4?_nc_cat=111&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeGYZ4V8rfdPJl24kPF_gnwh3FsU13xClwHcWxTXfEKXAS5dKGOojpAW1FhVYfveYJTquHLpPERfW6Cqo7oS4p1f&_nc_ohc=D-HTenXC_DEAX_x0Mtv&_nc_rml=0&_nc_ht=video.fcmn1-2.fna&oh=00_AT_9REdBUodqQQscIKgARAffHiFT4DFa-CcHaUie8WVrtw&oe=62684556");
                        videoView.start();
                        break;
                    case 39:
                        videoView.setVideoPath("https://video.fcmn1-1.fna.fbcdn.net/v/t42.1790-2/10000000_132215749280420_3890341957908810575_n.mp4?_nc_cat=107&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeGlPCsNXeRO68m0gjtCm3Cadfsf58Oryl91-x_nw6vKX_ELeGLa7VObtYnuRedf2nkGhmajUF3EkRJhxGTpcOKW&_nc_ohc=SEpiTnGWVqYAX9PpKaX&tn=DlNxON8970ttwinE&_nc_rml=0&_nc_ht=video.fcmn1-1.fna&oh=00_AT_aQKHCLqqd_5tEfrc9DUm9pq-HJjh9_QkyzxIwDbsVPg&oe=62683D33");
                        videoView.start();
                        break;
                    case 40:
                        videoView.setVideoPath("https://video.frba1-2.fna.fbcdn.net/v/t42.1790-2/10000000_614405012920390_1702797801425886970_n.mp4?_nc_cat=100&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeHS8UNF6AY4Fcz3M06PMi9S2fipDLjj2yHZ-KkMuOPbIZp4TM8_yjKac7EGGghvGhy0G1YGRKbn0-hMnEjW4NGK&_nc_ohc=RkSsu0N77t8AX8IU55p&_nc_oc=AQmbeeG-gIYBueXOzHD8iCKmWYzPiKNRlOsSzDzfG0n296U5KcNEr8kouKL8MRWDuNA&_nc_rml=0&_nc_ht=video.frba1-2.fna&oh=00_AT_cgu8pWksqCnkizy4B8PC9nTsjSD62q0ihjgnq1Vi6ig&oe=62683B62");
                        videoView.start();
                        break;
                    case 41:
                        videoView.setVideoPath("https://video.frba1-1.fna.fbcdn.net/v/t42.1790-2/10000000_585059045863959_5486157789193244610_n.mp4?_nc_cat=102&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeHCa3ZPbBbmml5CUx8X94j6TUQ7fCsxZP9NRDt8KzFk_zhNWH0qa6C2pkP062aEn_IGr3VJmBk3DyCxBAMW9DTE&_nc_ohc=ea5FdIUMSwAAX8rU6rz&_nc_rml=0&_nc_ht=video.frba1-1.fna&oh=00_AT8DRpxsCGT8X09xgULC7ByjIA1ccc-yKizXErDO5JLkwQ&oe=62683A0C");
                        videoView.start();
                        break;
                    case 42:
                        videoView.setVideoPath("https://video.frba1-1.fna.fbcdn.net/v/t42.1790-2/10000000_3099994580267261_5554468878002844643_n.mp4?_nc_cat=108&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeGeoNCEpA92t_8nkwotmRDEwXcjQlwHRofBdyNCXAdGhwjBQwmmW1OsfdiaPiP-QHjiLgt7rGJMMBuUl3VR6V4k&_nc_ohc=rj320Yserp0AX_4yXYF&_nc_rml=0&_nc_ht=video.frba1-1.fna&oh=00_AT9noxHhbynyN8bTUPh6TyFaOTdZUXwz8kgq91I3s8N0oQ&oe=62684344");
                        videoView.start();
                        break;
                    case 43:
                        videoView.setVideoPath("https://video.frba1-1.fna.fbcdn.net/v/t42.1790-2/10000000_612382183423472_846839711592185912_n.mp4?_nc_cat=108&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeFaMnryKF4bSn21msTQyOSsKyt7XFwLXi4rK3tcXAteLnXHabrR0APYbpX_b4kSmpLRe7GnSEOItl5KFuOFQa8S&_nc_ohc=3_zIi5aOWfoAX9R_HdT&tn=DlNxON8970ttwinE&_nc_rml=0&_nc_ht=video.frba1-1.fna&oh=00_AT83M00w5aH0XUTgq5KiyxM-WzSkq2vbtSAjOkarnkuYbg&oe=6268409F");
                        videoView.start();
                        break;
                    case 44:
                        videoView.setVideoPath("https://video.frba1-2.fna.fbcdn.net/v/t42.1790-2/10000000_1819974941523272_7667168377835298521_n.mp4?_nc_cat=105&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeGsbKLGcta-NkKety-twi40kba8xgKwK1CRtrzGArArUBEiBNW0AGNw89PNCIGYv95yw6KoqxaSd29OQDvlSTZJ&_nc_ohc=JSqBjsAPZ14AX-bzfQ2&tn=DlNxON8970ttwinE&_nc_rml=0&_nc_ht=video.frba1-2.fna&oh=00_AT9ijyoOBnB90WmuRNMaMXUNtyRNK_KvE6FV4Vjn6C63uA&oe=62683C90");
                        videoView.start();
                        break;
                    case 45:
                        videoView.setVideoPath("https://video.frba1-2.fna.fbcdn.net/v/t42.1790-2/10000000_658512991796375_5201426120233434731_n.mp4?_nc_cat=101&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeFFGJXdaMaiAIjjR_i8pOO6mOMi9BuaSuuY4yL0G5pK64VaFTEwKuLpqhlbHWlXTwS3F6Tv0iDdcCnljNXSjFy8&_nc_ohc=An3Vq5GeaYcAX-bK3iA&_nc_rml=0&_nc_ht=video.frba1-2.fna&oh=00_AT80iUt4se38lVhP4mXJ-EB_i7K00XxyqlyLfkZAqihrFw&oe=62683D8A");
                        videoView.start();
                        break;
                    case 46:
                        videoView.setVideoPath("https://video.frba1-1.fna.fbcdn.net/v/t42.1790-2/10000000_416935423210018_5619740853650089983_n.mp4?_nc_cat=108&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeGxZ_I737nRaI5aJ_0vIBqQk74OXykfDK2Tvg5fKR8MrflATlP5Z5HR9qeQrbLIXSUhPwQAx30384hkgHkLhONd&_nc_ohc=JM5tV5itjl0AX9NJwFf&_nc_rml=0&_nc_ht=video.frba1-1.fna&oh=00_AT93e2qQ-5w5CFHZtGhNOQXKUm_tluWEL51sBXoE-SWR2w&oe=62683AF4");
                        videoView.start();
                        break;
                    case 47:
                        videoView.setVideoPath("https://video.frba1-2.fna.fbcdn.net/v/t42.1790-2/10000000_270553448375573_5783390806155916762_n.mp4?_nc_cat=107&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeGkjSSfZGeMCwn3zIC-5J0Y2dMrj-yESjvZ0yuP7IRKOzoVNMlbch3YI4QKyt8ItS52Zudn6G8EZGD-P81__WXw&_nc_ohc=a02fGMVJ5TQAX-HOo2a&_nc_rml=0&_nc_ht=video.frba1-2.fna&oh=00_AT9uS9pthfKbSxBopicYrhIbd6u4bjLS48Kfr46Pl9qlbA&oe=626844E4");
                        videoView.start();
                        break;
                    case 48:
                        videoView.setVideoPath("https://video.frba1-2.fna.fbcdn.net/v/t42.1790-2/10000000_226037286174904_7269098626459890434_n.mp4?_nc_cat=100&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeFsL6M31oAOgqE_asm2ilfHUy-_9m9AdJ5TL7_2b0B0nisXf5ENR_Elu1JvNv1tMKUA2J9gubXFBYsVgrC80Vz9&_nc_ohc=K5Eiy3Je7oMAX92o5vc&_nc_rml=0&_nc_ht=video.frba1-2.fna&oh=00_AT8wXCEWIGdNVxh9YkJJciT0NgkYrszy9hdFtt5AACiZ1g&oe=62684868");
                        videoView.start();
                        break;
                    case 49:
                        videoView.setVideoPath("https://video.frba1-2.fna.fbcdn.net/v/t42.1790-2/10000000_327681735499308_988682468148122489_n.mp4?_nc_cat=101&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeGc3wuiC9VnPx1ATYqsW53TburCle0QCDdu6sKV7RAIN9EjjLq8GWIDRCsWWPzJ80xcH6N-WNNqddT4-gT--2DZ&_nc_ohc=-1oUGePFG_wAX_j2oKn&_nc_rml=0&_nc_ht=video.frba1-2.fna&oh=00_AT9wXm0ekK-ziq0wozEyRyPYrytQwpyWCEd3J5YXRlCN0Q&oe=62683B2C");
                        videoView.start();
                        break;
                    case 50:
                        videoView.setVideoPath("https://video.frba1-2.fna.fbcdn.net/v/t42.1790-2/10000000_1151172055719369_3108874218925874511_n.mp4?_nc_cat=100&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeH2CFPyhUjx0N-gbkGQRq-8X2sd6B5wWFRfax3oHnBYVAK-r-hLruKhqd6i_RqLhWEAdgX51C16M2zOcmvfrgHj&_nc_ohc=exmXb4LvApEAX9fuAwk&_nc_rml=0&_nc_ht=video.frba1-2.fna&oh=00_AT_pgUBgOwyHSZzLXBN5EpFPndEhuUAX2mfLKq7mrLdPxg&oe=62683D45");
                        videoView.start();
                        break;
                    case 51:
                        videoView.setVideoPath("https://video.frba1-1.fna.fbcdn.net/v/t42.1790-2/10000000_4071350922976643_8637608373688081567_n.mp4?_nc_cat=106&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeGkcYBlSuRkfLWnMscyTR79CwDzCOlvJU0LAPMI6W8lTdTg55B2r68XwfVfFpcTE0ur6IVcGLLIoJowAYUFy9GC&_nc_ohc=3sfNdUMloJEAX_icRRM&_nc_rml=0&_nc_ht=video.frba1-1.fna&oh=00_AT9C8T8jx6vdTF2UqKi3osF4DlJsQGdbMvuUWYbpgVUzxg&oe=62684003");
                        videoView.start();
                        break;
                    case 52:
                        videoView.setVideoPath("https://video.frba1-1.fna.fbcdn.net/v/t42.1790-2/10000000_408499334306428_6961002342039220932_n.mp4?_nc_cat=109&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeFbHURjBEVMYZlALIN-3iu21usO2Q2rOSXW6w7ZDas5JShZ95YskuEGdTQ3M6W2-Epdxn_SBm4RPHjXATf6BOQm&_nc_ohc=KVxM_sY0R0YAX-xqfeo&_nc_rml=0&_nc_ht=video.frba1-1.fna&oh=00_AT--JcPMkhEpsg1hyJepR9BnNxA7VdjH5gtN074NmdE8Sw&oe=62683EE2");
                        videoView.start();
                        break;
                    case 53:
                        videoView.setVideoPath("https://video.frba1-1.fna.fbcdn.net/v/t42.1790-2/10000000_1284959725265138_2247913698022755774_n.mp4?_nc_cat=103&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeG_SRsYEa5ifD0bEeFzgJoXBop_1c7ND5cGin_Vzs0Pl-3JhYw62pyIV8YvCsXsuLCqKXOa6NiQxU429ZNbl2F4&_nc_ohc=VK_br_o0WzYAX8rg-fK&_nc_oc=AQlh7oMnWJhr1Syq4uFdA4Vy6oE85UZ2vU6MZ-lllF6OxuL1xJSmvBlBYbvCXHjT650&_nc_rml=0&_nc_ht=video.frba1-1.fna&oh=00_AT9P5FNctqykLbr7WItOODQfQ6L_nEeGDnA4Pm15CeZOtQ&oe=626844BA");
                        videoView.start();
                        break;
                    case 54:
                        videoView.setVideoPath("https://video.frba1-1.fna.fbcdn.net/v/t42.1790-2/10000000_302214228577767_3663540972975630350_n.mp4?_nc_cat=109&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeEMVz97_fH5XxOzA3zSUNgJ6eUkyX79oHbp5STJfv2gdmrsVFXWsgxNcJbIuxi-aEWmr2BIMS6daPrZEJPFH1sh&_nc_ohc=aPqGhD4B7T0AX-lEovN&_nc_rml=0&_nc_ht=video.frba1-1.fna&oh=00_AT_H1RhRgIo7AapAsVL-tSyIqc_db44A70s7mniUZfOm6Q&oe=62684036");
                        videoView.start();
                        break;
                    case 55:
                        videoView.setVideoPath("https://video.frba1-1.fna.fbcdn.net/v/t42.1790-2/10000000_622005055586215_6163930561596518159_n.mp4?_nc_cat=106&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeGNujLMA-LO_oiLUsDGtcd43vTBH9myoqze9MEf2bKirCDRyco6F8OMjbqonHT-JyrNP6CNe2KxMMoU-79qENu5&_nc_ohc=V5pBY7Vv0J8AX-mA71q&tn=DlNxON8970ttwinE&_nc_rml=0&_nc_ht=video.frba1-1.fna&oh=00_AT9NfCAiYnGCL7P5qsbeWSZh2LbptMrNYYBLHC4RVNLQ7w&oe=6268466A");
                        videoView.start();
                        break;
                    case 56:
                        videoView.setVideoPath("https://video.frba1-1.fna.fbcdn.net/v/t42.1790-2/10000000_392542822355509_3078994596649155250_n.mp4?_nc_cat=103&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeEeDNSifo_mxcOXF4hfyegaqaiw6Kx1vDmpqLDorHW8OX2AMisqT-wuefqHgfcNnXbdDlZOyOt2THmazNVGzW7V&_nc_ohc=Oc-y0dIXWuoAX_dv4O2&_nc_rml=0&_nc_ht=video.frba1-1.fna&oh=00_AT92HoHk-gNaXQC02Or36AqqYxSOgXwBUVp3eIn9Azvlbg&oe=6268443C");
                        videoView.start();
                        break;
                    case 57:
                        videoView.setVideoPath("https://video.frba1-1.fna.fbcdn.net/v/t42.1790-2/10000000_437307724774367_405132079733870280_n.mp4?_nc_cat=103&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeGflipFaNaqS30MV4Mi4pRXwdiEeiDu1mvB2IR6IO7WawTCpLGFDMBjQaTii478k82UPtdc-jfnJ9rOesQ2Uwp8&_nc_ohc=zAfkWKYmGIgAX9nybzQ&_nc_rml=0&_nc_ht=video.frba1-1.fna&oh=00_AT-iGpiV8HwKr5vlf6EILC1jgSCWUlZvr0WsxrtdnkD6PA&oe=62683B9C");
                        videoView.start();
                        break;
                    case 58:
                        videoView.setVideoPath("https://video.fcmn1-2.fna.fbcdn.net/v/t42.1790-2/10000000_221841113309620_7173777680507861805_n.mp4?_nc_cat=108&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeFi1TXy50CTc63SXuw8IAIBUzPNizjxbEtTM82LOPFsS5dLAomK2no9LDE6mghkj7dAHFs8LWP_dGDSSjDgyTnL&_nc_ohc=-2wXkoOKuRYAX91M8PM&_nc_rml=0&_nc_ht=video.fcmn1-2.fna&oh=00_AT_TryHgMWRmOBY_tLhoDTxgL4TNPiw74lUU5pqui-iz3w&oe=62683C29");
                        videoView.start();
                        break;
                    case 59:
                        videoView.setVideoPath("https://video.fcmn1-1.fna.fbcdn.net/v/t42.1790-2/10000000_407441864195851_4413633085066121643_n.mp4?_nc_cat=102&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeG4kGggEY2XlGANezqf1reGKnCK4qcR9eAqcIripxH14GRQVvEGC_wIMUpS8Lo2fv6_DzyWuRUZNfYngWDotYhu&_nc_ohc=vxE4vO8g2qUAX9X4h-9&_nc_rml=0&_nc_ht=video.fcmn1-1.fna&oh=00_AT_JFTRfyQocGWt0dRYrCDGrHTOx1rDj_RTiIbSzGJ7MaQ&oe=62684285");
                        break;

                    default:
                        break;




                }


                videoView.setMediaController(new MediaController(Kiraa_jamaaia_Activity.this));
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