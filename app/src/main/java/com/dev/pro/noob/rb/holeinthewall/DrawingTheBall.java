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
public class DrawingTheBall extends View
{
    static Boolean movingup = true,movingdown = true,movingright=true,movingleft=true;
    Integer x=0,y=0;
    public String TAG="TAG";
    Bitmap ball,seawallpaper;

    public DrawingTheBall(Context context)
    {
        super(context);
    }
    public DrawingTheBall(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
    public DrawingTheBall(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }
    @Override
    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        Rect rect = new Rect();
        rect.set(0, 0, canvas.getWidth(), (canvas.getHeight()));
        Rect block[];
        block = new Rect[10];
        block[1] = new Rect();
        block[2] = new Rect();
        block[3] = new Rect();
        block[1].set(50,650,250,950);
        block[2].set(750,650,950,950);
        block[3].set(750,50,950,250);
        Paint dullblack = new Paint();
        dullblack.setColor(Color.DKGRAY);
        dullblack.setStyle(Paint.Style.FILL);
        Paint white = new Paint();
        white.setColor(Color.WHITE);
        white.setStyle(Paint.Style.FILL);
        //canvas.drawRect(rect, dullblack);
        //seawallpaper = BitmapFactory.decodeResource(getResources(),R.drawable.seawallpaper);
        //canvas.drawBitmap(seawallpaper,0,0,new Paint());
        ball = BitmapFactory.decodeResource(getResources(),R.drawable.ball);
        /*if(!heightcheck&&y==block[1].height())
            y+=10;
        if(!widthcheck&&x==block[1].width())
            x+=10;*/
        for(int i=1;i<=3;i++)
        canvas.drawRect(block[i], white);
        canvas.drawBitmap(ball, x-ball.getWidth()/2, y-ball.getHeight()/2, new Paint());
        for(int i=1;i<=3;i++)
        {
            if (x < block[i].right && x > block[i].left && y < block[i].bottom && y > block[i].bottom - 20)
            {
                Log.d(TAG, "Touching block " + i + " botttom" + " movingup = " + movingup + " movingdown = " + movingdown);
                movingup = false;
                movingdown = true;
            }
            if (y > block[i].top && y < block[i].bottom  && x>(block[i].left) && x < block[i].left + 20)
            {
                Log.d(TAG, "Touching block " + i + "left");
                Log.d(TAG, block[i].left + "," + ball.getWidth() + "");
                movingright = false;
                movingleft = true;
            }
            if (y > block[i].top && y < block[i].bottom && x < block[i].right && x > block[i].right - 20 )
            {
                Log.d(TAG, "Touching block " + i + " Right");
                movingleft = false;
                movingright = true;
            }

            if (x < block[i].right && x > block[i].left && y > block[i].top && y < block[i].top + 20)
            {
                Log.d(TAG, "Touching block " + i + " top " + "movingup = " + movingup + " movingdown = " + movingdown);
                movingup = true;
                movingdown = false;
            }
            if (x < (getWidth() - 3 * ball.getWidth() / 4))
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
            if (x < 0)
            {
                movingright = true;
                movingleft = false;
            }
            if (y < (getHeight() - 3 * ball.getHeight() / 4))
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
            if (y < 0)
            {
                movingdown = true;
                movingup = false;
            }
        }


            //canvas.drawRect(50, 50, 150, 150, new Paint());


        invalidate();
    }
}
