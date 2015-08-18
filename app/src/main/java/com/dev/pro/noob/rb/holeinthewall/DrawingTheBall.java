package com.dev.pro.noob.rb.holeinthewall;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

/**
 * Created by RB on 21-07-2015.
 */
/*public class DrawingTheBall extends View
{
    Integer x,y;
    static Boolean movingup = true,movingdown = false,movingright=true,movingleft=false;
    static Boolean[] visibility = new Boolean[10];
    static Boolean initialsetup = true;
    public String TAG="TAG";
    Bitmap ball,seawallpaper,spacepaddle;
    public DrawingTheBall(Context context)
    {
        super(context);
    }
    public DrawingTheBall(Context context, AttributeSet attrs) {
        super(context, attrs);
        for(int i=0;i<10;i++)
            visibility[i]=true;
        Log.d(TAG,"context");
    }
    public DrawingTheBall(Context context, AttributeSet attrs, int defStyle)
    {
        super(context, attrs, defStyle);

    }
    @Override
    protected void onDraw(Canvas canvas)
    {
        Rect paddle = new Rect();
        if(initialsetup)
        {
            x=canvas.getWidth()-512;
            y=canvas.getHeight()-512;
            initialsetup=false;
            paddle = new Rect();
            paddle.set(400,canvas.getHeight()-30,800,canvas.getHeight());
        }
        super.onDraw(canvas);
        Rect rect = new Rect();
        rect.set(0, 0, canvas.getWidth(), (canvas.getHeight()));
        Rect block[];
        block = new Rect[10];
        for(int i=1;i<9;i++)
        block[i] = new Rect();

        for(int j=0;j<2;j++)
        {
            for (int i = 0; i < 4; i++)
            {

                if (visibility[i + 1+4*j])
                    block[i + 1 +4*j].set(150 + 200 * i, 450+200*j, 300 + 200 * i, 525+j*200);

            }
        }
        /*if(visibility[1])
        block[1].set(150,650,300,725);
        if(visibility[2])
        block[2].set(750,650,900,725);
        if(visibility[3])
        block[3].set(550,650,700,725);
        if(visibility[4])
        block[4].set(350,650,500,725);
        Paint dullblack = new Paint();
        dullblack.setColor(Color.DKGRAY);
        dullblack.setStyle(Paint.Style.FILL);
        Paint white = new Paint();
        white.setColor(Color.WHITE);
        white.setStyle(Paint.Style.FILL);
        ball = BitmapFactory.decodeResource(getResources(),R.drawable.ball);
        spacepaddle = BitmapFactory.decodeResource(getResources(),R.drawable.spacepaddle);
        for(int i=1;i<=8;i++)
        canvas.drawRect(block[i], white);
        canvas.drawBitmap(ball, x-ball.getWidth()/2, y-ball.getHeight()/2, new Paint());
        canvas.drawBitmap(spacepaddle,400,canvas.getHeight()-70,new Paint());

        for(int i=1;i<=8;i++)
        {
            if (x < block[i].right && x > block[i].left && y-ball.getHeight()*(0.5)< block[i].bottom && y-ball.getHeight()*(0.5)> block[i].bottom - 20)
            {
                Log.d(TAG, "Touching block " + i + " botttom" + " movingup = " + movingup + " movingdown = " + movingdown);
                movingup = false;
                movingdown = true;
                block[i].set(0,0,0,0);
                visibility[i]=false;
            }
            if (y > block[i].top && y < block[i].bottom  && x+ball.getWidth()*(0.5)>(block[i].left) && x+ball.getWidth()*(0.5) < block[i].left + 20)
            {
                Log.d(TAG, "Touching block " + i + "left");
                Log.d(TAG, block[i].left + "," + ball.getWidth() + "");
                movingright = false;
                movingleft = true;
                block[i].set(0,0,0,0);
                visibility[i]=false;
            }
            if (y > block[i].top-10 && y < block[i].bottom+10 && x-ball.getWidth()*(0.5)< block[i].right && x-ball.getWidth()*(0.5)> block[i].right - 20 )
            {
                Log.d(TAG, "Touching block " + i + " Right");
                movingleft = false;
                movingright = true;
                block[i].set(0,0,0,0);
                visibility[i]=false;
            }

            if (x < block[i].right+20 && x > block[i].left-20 && y+ball.getHeight()*(0.5)> block[i].top && y+ball.getHeight()*(0.5)< block[i].top + 20)
            {
                Log.d(TAG, "Touching block " + i + " top " + "movingup = " + movingup + " movingdown = " + movingdown);
                movingup = true;
                movingdown = false;
                block[i].set(0,0,0,0);
                visibility[i]=false;
            }
            if (x < (getWidth() - ball.getWidth()*(0.5)))
            {
                if (movingright)
                    x += 2;
                else
                {
                    movingright = false;
                    movingleft = true;
                    x += -2;
                }
            } else
            {
                movingright = false;
                movingleft = true;
                x += -2;
            }
            if (x < ball.getWidth()*(0.5))
            {
                movingright = true;
                movingleft = false;
            }
            if (y < (getHeight() - ball.getHeight()*(0.5)))
            {
                if (movingdown)
                    y += 2;
                else
                {
                    movingdown = false;
                    movingup = true;
                    y += -2;
                }
            } else
            {
                movingdown = false;
                movingup = true;
                y += -2;
            }
            if (y < ball.getHeight()*(0.5))
            {
                movingdown = true;
                movingup = false;
            }
        }
        canvas.drawRect(paddle, white);
        invalidate();
    }
}
*/