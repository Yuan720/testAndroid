package com.example.administrator.huayun;

import android.app.AlertDialog;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.support.constraint.solver.widgets.Snapshot;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileInputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Date;

import static android.R.attr.button;
import static android.R.attr.contextClickable;

public class QuizActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
setTitle("菜菜");
        getSupportActionBar().hide();
        final Button changeActivity=(Button)findViewById(R.id.login);
        changeActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent change=new Intent(QuizActivity.this,DrawerLayout.class);
                startActivity(change);
            }
        });
       // Toast.makeText(QuizActivity.this,"欢迎关注微信公众号，或联系我们 lyyhoney@gmail.com",Toast.LENGTH_LONG).show();
       // ListView testView=(ListView)findViewById(R.id.mytextlist);
        Intent change2=new Intent(QuizActivity.this,SecendActivity.class);
        Intent activityIntent=new Intent(QuizActivity.this,MyService.class);
        PendingIntent pd=PendingIntent.getActivity(this,0,change2,0);
        startService(activityIntent);

        NotificationManager myManager=(NotificationManager)getSystemService(NOTIFICATION_SERVICE);
       Notification notfy=new NotificationCompat.Builder(this)
       .setContentTitle("通知已经启动")

               .setContentIntent(pd)
       .setContentText("成功启动了通知服务")
       .setWhen(System.currentTimeMillis())
        .setDefaults(Notification.DEFAULT_ALL)
               .setSmallIcon(R.drawable.ic_notify)
               .setLargeIcon(BitmapFactory.decodeResource(getResources(),R.mipmap.ic_launcher))
                .build();
       myManager.notify(2,notfy);
        AlertDialog.Builder bd=new AlertDialog.Builder(QuizActivity.this);
        AlertDialog newDilog=bd.setIcon(R.mipmap.ic_launcher)
                .setTitle("对话框测试")
                .setMessage("其实没啥事，就是烦烦你！")
                .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                })
                .setNeutralButton("卧槽", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                })
                .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                })
                .create();
        newDilog.show();





        /*
        Button button2=(Button)findViewById(R.id.getText);
      EditText  ed=(EditText) findViewById(R.id.edit_text);
        TextView tv=(TextView) findViewById(R.id.debug);
        long nowTimeGeter=System.currentTimeMillis();
        Date now=new Date(nowTimeGeter);
        int a=123;;
        ed.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        ed.getText();
        String ipAdress;

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



            }
        });
*/



            }



    @Override
    protected void onRestart()  {
        super.onRestart();
     Toast myToast=Toast.makeText(QuizActivity.this,"欢迎回来，现在你可以继续操作了",Toast.LENGTH_LONG);
      myToast.show();

        /*try {
            Thread.currentThread().sleep(5000);
            myToast.setText("本机即将启动自毁程序，正在倒计时！");
            myToast.show();

        }catch (Exception e){
            e.printStackTrace();
        }*/

      //myToast.setText("本机即将启动自毁程序，正在倒计时！");
       // myToast.show();
    }

}
        
class MyContext {
    Context context;
 void test(){
     Intent test=new Intent(context,Mine2Activity.class);
     /**
      * 通过定义一个Context变量
      * 调用此方法的类应该具有获取Context的能力，否则将出错。
      *
      */


}
}


















