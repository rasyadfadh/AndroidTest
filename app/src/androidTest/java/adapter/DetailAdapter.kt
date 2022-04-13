package adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.androidtest.*

class DetailAdapter(val detailmeal : ArrayList<MealX>) : RecyclerView.Adapter<DetailAdapter.DetailViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): DetailAdapter.DetailViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.detail_seafood, parent, false)
        return DetailAdapter.DetailViewHolder(view)
    }

    override fun onBindViewHolder(holder: DetailAdapter.DetailViewHolder, position: Int) {
        holder.bind(detailmeal.get(position))
    }

    override fun getItemCount() =  detailmeal.size

    class DetailViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener {
        private var view : View = itemView
        private var detailmeals : lookUpData? = null

        override fun onClick(p0: View?) {

        }

        init {
            itemView.setOnClickListener(this)
        }

        fun bind(detail : MealX){
            this.detailmeals = detail
            val imageUrl = StringBuilder()
            imageUrl.append(view.context.getString(R.string.base_thumb)).append(detail.strImageSource)
            view.food_name.setText(detail.strMeal)
            view.food_id.setText(detail.idMeal)
            view.food_area.setText(detail.strArea)
            view.food_category.setText(detail.strCategory)
            view.food_drink.setText(detail.strDrinkAlternate )
            view.food_commons.setText(detail.strCreativeCommonsConfirmed )
            view.food_ing1.setText(detail.strIngredient1)
            view.food_ing2.setText(detail.strIngredient2)
            view.food_ing3.setText(detail.strIngredient3)
            view.food_ing4.setText(detail.strIngredient4)
            view.food_ing5.setText(detail.strIngredient5)
            view.food_ing6.setText(detail.strIngredient6)
            view.food_ing7.setText(detail.strIngredient7)
            view.food_ing8.setText(detail.strIngredient8)
            view.food_ing9.setText(detail.strIngredient9)
            view.food_ing10.setText(detail.strIngredient10)
            view.food_ing11.setText(detail.strIngredient11)
            view.food_ing12.setText(detail.strIngredient12)
            view.food_ing13.setText(detail.strIngredient13)
            view.food_ing14.setText(detail.strIngredient14)
            view.food_ing15.setText(detail.strIngredient15)
            view.food_ing16.setText(detail.strIngredient16)
            view.food_ing17.setText(detail.strIngredient17)
            view.food_ing18.setText(detail.strIngredient18)
            view.food_ing19.setText(detail.strIngredient19)
            view.food_ing20.setText(detail.strIngredient20)

            view.food_measure1.setText(detail.strMeasure1)
            view.food_measure2.setText(detail.strMeasure2)
            view.food_measure3.setText(detail.strMeasure3)
            view.food_measure4.setText(detail.strMeasure4)
            view.food_measure5.setText(detail.strMeasure5)
            view.food_measure6.setText(detail.strMeasure6)
            view.food_measure7.setText(detail.strMeasure7)
            view.food_measure8.setText(detail.strMeasure8)
            view.food_measure9.setText(detail.strMeasure9)
            view.food_measure10.setText(detail.strMeasure10)
            view.food_measure11.setText(detail.strMeasure11)
            view.food_measure12.setText(detail.strMeasure12)
            view.food_measure13.setText(detail.strMeasure13)
            view.food_measure14.setText(detail.strMeasure14)
            view.food_measure15.setText(detail.strMeasure15)
            view.food_measure16.setText(detail.strMeasure16)
            view.food_measure17.setText(detail.strMeasure17)
            view.food_measure18.setText(detail.strMeasure18)
            view.food_measure19.setText(detail.strMeasure19)
            view.food_measure20.setText(detail.strMeasure20)

        }

    }

}