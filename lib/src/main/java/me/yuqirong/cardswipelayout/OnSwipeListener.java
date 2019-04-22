package me.yuqirong.cardswipelayout;

import android.support.v7.widget.RecyclerView;

/**
 * @author aditya
 */

public interface OnSwipeListener<T> {


    void onSwiping(RecyclerView.ViewHolder viewHolder, float ratio, int direction);


    void onSwiped(RecyclerView.ViewHolder viewHolder, T t, int direction);


    void onSwipedClear();

}
