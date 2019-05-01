package com.example.notificaciones

import android.app.Notification
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.NotificationCompat
import android.widget.Button

class MainActivity : AppCompatActivity() {
lateinit var boton: Button
    /*lateinit var  notificacion: NotificationCompat.Builder
    val numero: Int =52147*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        boton= findViewById(R.id.button)
        /*notificacion=NotificationCompat.Builder(this)
        notificacion.setAutoCancel(true)*/


        boton.setOnClickListener{
            val intent= Intent()
            val pendingintent= PendingIntent.getActivity(this@MainActivity,0,intent,0)
            val notificacion= NotificationCompat.Builder(this@MainActivity,"5124")
                .setTicker("")
                .setContentTitle("Mi Notificacion")
                .setContentText("¡La notificacion ha sido todo un exito!")
                .setSmallIcon(R.drawable.notification_icon_background)
                .setContentIntent(pendingintent).build()


            notificacion.flags=Notification.FLAG_AUTO_CANCEL
            val notificationmanager=getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            notificationmanager.notify(0,notificacion)
        }
    }
}
