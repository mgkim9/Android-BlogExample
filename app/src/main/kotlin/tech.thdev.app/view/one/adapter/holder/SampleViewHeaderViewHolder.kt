package tech.thdev.app.view.one.adapter.holder

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import kotlinx.android.synthetic.main.item_header_view.view.*
import tech.thdev.app.R
import tech.thdev.app.data.MovieChartItem

/**
 * Created by tae-hwan on 12/12/2016.
 */

class SampleViewHeaderViewHolder(val context: Context, parent: ViewGroup?)
    : RecyclerView.ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_header_view, parent, false)) {

    fun onBind(item: MovieChartItem, position: Int) {
        with(itemView) {
            tv_title.text = item.title
            tv_date.text = item.date
        }
    }
}