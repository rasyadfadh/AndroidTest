package adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.androidtest.Meal
import com.example.androidtest.R
import com.example.androidtest.seafoodData
import kotlinx.android.synthetic.main.item_seafood.view.*


class SeafoodAdapter(val seafood : ArrayList<Meal>) : RecyclerView.Adapter<SeafoodAdapter.SeafoodViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SeafoodAdapter.SeafoodViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_seafood, parent, false)
        return SeafoodViewHolder(view)
    }

    override fun onBindViewHolder(holder: SeafoodAdapter.SeafoodViewHolder, position: Int) {
        holder.bind(seafood.get(position))
    }

    override fun getItemCount() = seafood.size

    class SeafoodViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener {
        private var view : View = itemView
        private var seafoodmeals : seafoodData? = null

        override fun onClick(p0: View?) {

        }

        init {
            itemView.setOnClickListener(this)
        }

        fun bind(meals: Meal) {
            this.seafoodmeals = seafoodmeals
            val imageUrl = StringBuilder()
            imageUrl.append(view.context.getString(R.string.base_thumb)).append(meals.strMealThumb)
            view.food_name.setText(meals.strMeal)
            view.food_id.setText(meals.idMeal)
        }

        }


}